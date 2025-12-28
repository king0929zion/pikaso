package F0;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1175a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f1176b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f1177c;

    static {
        a(0.0f);
        a(0.5f);
        f1175a = 0.5f;
        a(-1.0f);
        f1176b = -1.0f;
        a(1.0f);
        f1177c = 1.0f;
    }

    public static void a(float f3) {
        if ((0.0f > f3 || f3 > 1.0f) && f3 != -1.0f) {
            throw new IllegalStateException("topRatio should be in [0..1] range or -1");
        }
    }
}
