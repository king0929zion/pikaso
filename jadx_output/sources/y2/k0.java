package y2;

/* loaded from: classes.dex */
public abstract class k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f6798a = new ThreadLocal();

    public static J a() {
        ThreadLocal threadLocal = f6798a;
        J j3 = (J) threadLocal.get();
        if (j3 != null) {
            return j3;
        }
        C0671d c0671d = new C0671d(Thread.currentThread());
        threadLocal.set(c0671d);
        return c0671d;
    }
}
