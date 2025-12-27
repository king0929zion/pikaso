package com.ai.assistance.operit.core.tools.agent

import android.content.Context
import com.ai.assistance.operit.core.tools.system.AndroidShellExecutor
import com.ai.assistance.operit.util.AppLogger
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.io.File
import java.io.FileOutputStream
import java.net.InetSocketAddress
import java.net.Socket

/**
 * Helper to manage the lifecycle of the Shower server (shower-server.jar) on the device.
 *
 * The jar is packaged in app assets (src/main/assets/shower-server.jar).
 * At runtime we copy it to the app's files directory and start it via app_process:
 *   CLASSPATH=/data/user/0/<pkg>/files/shower-server.jar app_process / com.ai.assistance.shower.Main
 */
object ShowerServerManager {

    private const val TAG = "ShowerServerManager"
    private const val ASSET_JAR_NAME = "shower-server.jar"
    private const val LOCAL_JAR_NAME = "shower-server.jar"

    /**
     * Ensure the Shower server is started in the background.
     * Returns true if the start command was issued successfully.
     */
    suspend fun ensureServerStarted(context: Context): Boolean {
        // 0) If a Shower server is already listening on the default port, just reuse it.
        if (isServerListening()) {
            AppLogger.d(TAG, "Shower server already listening on 127.0.0.1:8986, skipping start")
            return true
        }

        val appContext = context.applicationContext
        val jarFile = try {
            copyJarToExternalDir(appContext)
        } catch (e: Exception) {
            AppLogger.e(TAG, "Failed to copy shower-server.jar from assets", e)
            return false
        }

        // 1) Kill existing server (ignore errors about missing process).
        // Use '|| true' so that the shell always exits with status 0 even if pkill finds nothing.
        val killCmd = "pkill -f com.ai.assistance.shower.Main >/dev/null 2>&1 || true"
        AppLogger.d(TAG, "Stopping existing Shower server (if any) with command: $killCmd")
        AndroidShellExecutor.executeShellCommand(killCmd)

        // 2) Copy the jar from /sdcard/Download/Pikaso to /data/local/tmp.
        val remoteJarPath = "/data/local/tmp/$LOCAL_JAR_NAME"
        val copyCmd = "cp ${jarFile.absolutePath} $remoteJarPath"
        AppLogger.d(TAG, "Copying Shower jar with command: $copyCmd")
        val copyResult = AndroidShellExecutor.executeShellCommand(copyCmd)
        if (!copyResult.success) {
            AppLogger.e(
                TAG,
                "Failed to copy Shower jar to $remoteJarPath (exitCode=${copyResult.exitCode}). stdout='${copyResult.stdout}', stderr='${copyResult.stderr}'"
            )
            return false
        }

        // 3) Start app_process with CLASSPATH pointing to /data/local/tmp/shower-server.jar, in background.
        // This single background command should exit quickly with status 0 while the Java process continues.
        val startCmd = "CLASSPATH=$remoteJarPath app_process / com.ai.assistance.shower.Main &"
        AppLogger.d(TAG, "Starting Shower server with command: $startCmd")
        val startResult = AndroidShellExecutor.executeShellCommand(startCmd)
        if (!startResult.success) {
            AppLogger.e(
                TAG,
                "Failed to start Shower server (exitCode=${startResult.exitCode}). stdout='${startResult.stdout}', stderr='${startResult.stderr}'"
            )
            return false
        }
        // Poll for up to 10 seconds for the server to start.
        for (attempt in 0 until 50) { // 50 * 200ms = 10s
            kotlinx.coroutines.delay(200)
            if (isServerListening()) {
                AppLogger.d(
                    TAG,
                    "Shower server is now listening on 127.0.0.1:8986 after ~${(attempt + 1) * 200}ms"
                )
                return true
            }
        }

        AppLogger.e(TAG, "Shower server did not start listening on 127.0.0.1:8986 within the expected time")
        return false
    }

    /**
     * Stop the Shower server process if running.
     */
    suspend fun stopServer(): Boolean {
        val cmd = "pkill -f com.ai.assistance.shower.Main >/dev/null 2>&1 || true"
        val result = AndroidShellExecutor.executeShellCommand(cmd)
        if (!result.success) {
            AppLogger.e(TAG, "Failed to stop Shower server: ${result.stderr}")
        }
        return result.success
    }

    /**
     * Copy shower-server.jar from assets to the app's files dir.
     * Always overwrites the existing file to keep it in sync with the packaged asset.
     */
    private suspend fun copyJarToExternalDir(context: Context): File = withContext(Dispatchers.IO) {
        // Reuse the same base directory as screenshots: /sdcard/Download/Pikaso
        val baseDir = File("/sdcard/Download/Pikaso")
        if (!baseDir.exists()) {
            baseDir.mkdirs()
        }
        val outFile = File(baseDir, LOCAL_JAR_NAME)
        context.assets.open(ASSET_JAR_NAME).use { input ->
            FileOutputStream(outFile).use { output ->
                val buffer = ByteArray(DEFAULT_BUFFER_SIZE)
                while (true) {
                    val read = input.read(buffer)
                    if (read <= 0) break
                    output.write(buffer, 0, read)
                }
                output.flush()
            }
        }
        AppLogger.d(TAG, "Copied $ASSET_JAR_NAME to ${outFile.absolutePath}")
        outFile
    }

    private suspend fun isServerListening(): Boolean = withContext(Dispatchers.IO) {
        return@withContext try {
            Socket().use { socket ->
                socket.connect(InetSocketAddress("127.0.0.1", 8986), 200)
            }
            true
        } catch (e: Exception) {
            false
        }
    }
}
