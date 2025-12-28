package z2;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import c2.C0170i;
import p2.g;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f7093a = 0;
    private static volatile Choreographer choreographer;

    static {
        Object q3;
        try {
            q3 = new c(a(Looper.getMainLooper()));
        } catch (Throwable th) {
            q3 = Z0.d.q(th);
        }
        if (q3 instanceof C0170i) {
            q3 = null;
        }
    }

    public static final Handler a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            g.c(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
