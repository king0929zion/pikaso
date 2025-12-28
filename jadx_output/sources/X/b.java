package X;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final long f2586a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f2587b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f2588c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f2589d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f2590e = 0;

    static {
        long j3 = 3;
        long j4 = j3 << 32;
        f2586a = (0 & 4294967295L) | j4;
        f2587b = (1 & 4294967295L) | j4;
        f2588c = j4 | (2 & 4294967295L);
        f2589d = (j3 & 4294967295L) | (4 << 32);
    }

    public static final boolean a(long j3, long j4) {
        return j3 == j4;
    }

    public static String b(long j3) {
        return a(j3, f2586a) ? "Rgb" : a(j3, f2587b) ? "Xyz" : a(j3, f2588c) ? "Lab" : a(j3, f2589d) ? "Cmyk" : "Unknown";
    }
}
