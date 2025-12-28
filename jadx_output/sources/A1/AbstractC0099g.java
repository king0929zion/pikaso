package a1;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import n.C0379F;
import n.C0395o;

/* renamed from: a1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0099g {

    /* renamed from: a, reason: collision with root package name */
    public static final C0395o f2940a = new C0395o(16);

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f2941b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f2942c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0379F f2943d;

    static {
        j jVar = new j();
        jVar.f2950a = "fonts-androidx";
        jVar.f2951b = 10;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), jVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f2941b = threadPoolExecutor;
        f2942c = new Object();
        f2943d = new C0379F(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static a1.C0098f a(java.lang.String r6, android.content.Context r7, a1.C0095c r8, int r9) {
        /*
            n.o r0 = a1.AbstractC0099g.f2940a
            java.lang.Object r1 = r0.a(r6)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L10
            a1.f r6 = new a1.f
            r6.<init>(r1)
            return r6
        L10:
            I.m r8 = a1.AbstractC0094b.a(r7, r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5c
            r1 = 1
            r2 = -3
            java.lang.Object r3 = r8.f1379f
            a1.h[] r3 = (a1.C0100h[]) r3
            int r8 = r8.f1378e
            if (r8 == 0) goto L24
            if (r8 == r1) goto L22
        L20:
            r1 = r2
            goto L3d
        L22:
            r1 = -2
            goto L3d
        L24:
            if (r3 == 0) goto L3d
            int r8 = r3.length
            if (r8 != 0) goto L2a
            goto L3d
        L2a:
            int r8 = r3.length
            r1 = 0
            r4 = r1
        L2d:
            if (r4 >= r8) goto L3d
            r5 = r3[r4]
            int r5 = r5.f2948e
            if (r5 == 0) goto L3a
            if (r5 >= 0) goto L38
            goto L20
        L38:
            r1 = r5
            goto L3d
        L3a:
            int r4 = r4 + 1
            goto L2d
        L3d:
            if (r1 == 0) goto L45
            a1.f r6 = new a1.f
            r6.<init>(r1)
            return r6
        L45:
            a.a r8 = V0.g.f2467a
            android.graphics.Typeface r7 = r8.s(r7, r3, r9)
            if (r7 == 0) goto L56
            r0.b(r6, r7)
            a1.f r6 = new a1.f
            r6.<init>(r7)
            return r6
        L56:
            a1.f r6 = new a1.f
            r6.<init>(r2)
            return r6
        L5c:
            a1.f r6 = new a1.f
            r7 = -1
            r6.<init>(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.AbstractC0099g.a(java.lang.String, android.content.Context, a1.c, int):a1.f");
    }
}
