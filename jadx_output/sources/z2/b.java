package z2;

import g2.AbstractC0268a;
import y2.C0685s;
import y2.InterfaceC0686t;

/* loaded from: classes.dex */
public final class b extends AbstractC0268a implements InterfaceC0686t {
    private volatile Object _preHandler;

    public b() {
        super(C0685s.f6817d);
        this._preHandler = this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0028, code lost:
    
        if (java.lang.reflect.Modifier.isStatic(r3.getModifiers()) != false) goto L13;
     */
    @Override // y2.InterfaceC0686t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void r(g2.InterfaceC0276i r3, java.lang.Throwable r4) {
        /*
            r2 = this;
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r3 >= r0) goto L46
            java.lang.Object r3 = r2._preHandler
            r0 = 0
            if (r3 == r2) goto Le
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            goto L2e
        Le:
            java.lang.Class<java.lang.Thread> r3 = java.lang.Thread.class
            java.lang.String r1 = "getUncaughtExceptionPreHandler"
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r1, r0)     // Catch: java.lang.Throwable -> L2b
            int r1 = r3.getModifiers()     // Catch: java.lang.Throwable -> L2b
            boolean r1 = java.lang.reflect.Modifier.isPublic(r1)     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto L2b
            int r1 = r3.getModifiers()     // Catch: java.lang.Throwable -> L2b
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto L2b
            goto L2c
        L2b:
            r3 = r0
        L2c:
            r2._preHandler = r3
        L2e:
            if (r3 == 0) goto L35
            java.lang.Object r3 = r3.invoke(r0, r0)
            goto L36
        L35:
            r3 = r0
        L36:
            boolean r1 = r3 instanceof java.lang.Thread.UncaughtExceptionHandler
            if (r1 == 0) goto L3d
            r0 = r3
            java.lang.Thread$UncaughtExceptionHandler r0 = (java.lang.Thread.UncaughtExceptionHandler) r0
        L3d:
            if (r0 == 0) goto L46
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            r0.uncaughtException(r3, r4)
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.b.r(g2.i, java.lang.Throwable):void");
    }
}
