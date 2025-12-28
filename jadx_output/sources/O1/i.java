package o1;

import a1.RunnableC0093a;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import n.C0387g;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f5767j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static volatile i f5768k;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f5769a;

    /* renamed from: b, reason: collision with root package name */
    public final C0387g f5770b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f5771c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f5772d;

    /* renamed from: e, reason: collision with root package name */
    public final f f5773e;

    /* renamed from: f, reason: collision with root package name */
    public final h f5774f;

    /* renamed from: g, reason: collision with root package name */
    public final X1.e f5775g;
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final d f5776i;

    public i(r rVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f5769a = reentrantReadWriteLock;
        this.f5771c = 3;
        h hVar = rVar.f5799a;
        this.f5774f = hVar;
        int i3 = rVar.f5800b;
        this.h = i3;
        this.f5776i = rVar.f5801c;
        this.f5772d = new Handler(Looper.getMainLooper());
        this.f5770b = new C0387g(0);
        this.f5775g = new X1.e(23);
        f fVar = new f(this);
        this.f5773e = fVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i3 == 0) {
            try {
                this.f5771c = 0;
            } catch (Throwable th) {
                this.f5769a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                hVar.g(new e(fVar));
            } catch (Throwable th2) {
                e(th2);
            }
        }
    }

    public static i a() {
        i iVar;
        synchronized (f5767j) {
            try {
                iVar = f5768k;
                if (!(iVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return iVar;
    }

    public static boolean c() {
        return f5768k != null;
    }

    public final int b() {
        this.f5769a.readLock().lock();
        try {
            return this.f5771c;
        } finally {
            this.f5769a.readLock().unlock();
        }
    }

    public final void d() {
        if (!(this.h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.f5769a.writeLock().lock();
        try {
            if (this.f5771c == 0) {
                return;
            }
            this.f5771c = 0;
            this.f5769a.writeLock().unlock();
            f fVar = this.f5773e;
            i iVar = fVar.f5764a;
            try {
                iVar.f5774f.g(new e(fVar));
            } catch (Throwable th) {
                iVar.e(th);
            }
        } finally {
            this.f5769a.writeLock().unlock();
        }
    }

    public final void e(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f5769a.writeLock().lock();
        try {
            this.f5771c = 2;
            arrayList.addAll(this.f5770b);
            this.f5770b.clear();
            this.f5769a.writeLock().unlock();
            this.f5772d.post(new RunnableC0093a(arrayList, this.f5771c, th));
        } catch (Throwable th2) {
            this.f5769a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1 A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:69:0x005f, B:72:0x0064, B:74:0x0068, B:76:0x0075, B:31:0x0091, B:33:0x009b, B:35:0x009e, B:37:0x00a1, B:39:0x00b1, B:41:0x00b4, B:46:0x00c3, B:49:0x00ca, B:51:0x00e1, B:29:0x0087), top: B:68:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e1 A[Catch: all -> 0x0084, TRY_LEAVE, TryCatch #0 {all -> 0x0084, blocks: (B:69:0x005f, B:72:0x0064, B:74:0x0068, B:76:0x0075, B:31:0x0091, B:33:0x009b, B:35:0x009e, B:37:0x00a1, B:39:0x00b1, B:41:0x00b4, B:46:0x00c3, B:49:0x00ca, B:51:0x00e1, B:29:0x0087), top: B:68:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence f(int r12, int r13, int r14, java.lang.CharSequence r15) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.i.f(int, int, int, java.lang.CharSequence):java.lang.CharSequence");
    }

    public final void g(g gVar) {
        Z.b.g(gVar, "initCallback cannot be null");
        this.f5769a.writeLock().lock();
        try {
            if (this.f5771c != 1 && this.f5771c != 2) {
                this.f5770b.add(gVar);
                this.f5769a.writeLock().unlock();
            }
            this.f5772d.post(new RunnableC0093a(Arrays.asList(gVar), this.f5771c, null));
            this.f5769a.writeLock().unlock();
        } catch (Throwable th) {
            this.f5769a.writeLock().unlock();
            throw th;
        }
    }
}
