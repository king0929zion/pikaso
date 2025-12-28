package G1;

import android.accessibilityservice.AccessibilityService$TakeScreenshotCallback;
import java.util.concurrent.CountDownLatch;
import p2.m;

/* loaded from: classes.dex */
public final class k implements AccessibilityService$TakeScreenshotCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1276a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1277b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f1278c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f1279d;

    public k(String str, String str2, m mVar, CountDownLatch countDownLatch) {
        this.f1276a = str;
        this.f1277b = str2;
        this.f1278c = mVar;
        this.f1279d = countDownLatch;
    }

    public final void onFailure(int i3) {
        this.f1278c.f5958d = false;
        this.f1279d.countDown();
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x006c, code lost:
    
        if (r2.equals("jpg") == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSuccess(android.accessibilityservice.AccessibilityService.ScreenshotResult r6) {
        /*
            r5 = this;
            java.lang.String r0 = "screenshotResult"
            p2.g.e(r6, r0)
            android.hardware.HardwareBuffer r0 = G1.i.h(r6)
            java.lang.String r1 = "getHardwareBuffer(...)"
            p2.g.d(r0, r1)
            android.graphics.ColorSpace r6 = G1.i.e(r6)
            java.lang.String r1 = "getColorSpace(...)"
            p2.g.d(r6, r1)
            android.graphics.Bitmap r6 = C1.a.c(r0, r6)
            r0.close()
            r0 = 0
            if (r6 == 0) goto La5
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L9c
            java.lang.String r2 = r5.f1276a     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L9c
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L9c
            java.io.File r2 = r1.getParentFile()     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L9c
            if (r2 == 0) goto L3b
            boolean r3 = r2.exists()     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L9c
            if (r3 != 0) goto L3b
            r2.mkdirs()     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L9c
            goto L3b
        L38:
            r0 = move-exception
            goto La1
        L3b:
            java.lang.String r2 = r5.f1277b     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L9c
            int r3 = r2.hashCode()     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L9c
            r4 = 105441(0x19be1, float:1.47754E-40)
            if (r3 == r4) goto L66
            r4 = 111145(0x1b229, float:1.55747E-40)
            if (r3 == r4) goto L5a
            r4 = 3268712(0x31e068, float:4.580441E-39)
            if (r3 == r4) goto L51
            goto L6e
        L51:
            java.lang.String r3 = "jpeg"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L9c
            if (r2 != 0) goto L71
            goto L6e
        L5a:
            java.lang.String r3 = "png"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L9c
            if (r2 != 0) goto L63
            goto L6e
        L63:
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L9c
            goto L73
        L66:
            java.lang.String r3 = "jpg"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L9c
            if (r2 != 0) goto L71
        L6e:
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L9c
            goto L73
        L71:
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L9c
        L73:
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L9c
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L9c
            p2.m r1 = r5.f1278c     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L9c
            android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Throwable -> L90
            if (r2 != r4) goto L81
            r4 = 90
            goto L83
        L81:
            r4 = 100
        L83:
            boolean r2 = r6.compress(r2, r4, r3)     // Catch: java.lang.Throwable -> L90
            r1.f5958d = r2     // Catch: java.lang.Throwable -> L90
            r3.close()     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L9c
        L8c:
            r6.recycle()
            goto La9
        L90:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L92
        L92:
            r2 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L97
            goto L9b
        L97:
            r3 = move-exception
            Z0.d.f(r1, r3)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L9c
        L9b:
            throw r2     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L9c
        L9c:
            p2.m r1 = r5.f1278c     // Catch: java.lang.Throwable -> L38
            r1.f5958d = r0     // Catch: java.lang.Throwable -> L38
            goto L8c
        La1:
            r6.recycle()
            throw r0
        La5:
            p2.m r6 = r5.f1278c
            r6.f5958d = r0
        La9:
            java.util.concurrent.CountDownLatch r6 = r5.f1279d
            r6.countDown()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: G1.k.onSuccess(android.accessibilityservice.AccessibilityService$ScreenshotResult):void");
    }
}
