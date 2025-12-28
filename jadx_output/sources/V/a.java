package V;

import a.AbstractC0090a;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final long f2438a = r2.a.a(0.0f, 0.0f);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f2439b = 0;

    public static final boolean a(long j3, long j4) {
        return j3 == j4;
    }

    public static final float b(long j3) {
        return Float.intBitsToFloat((int) (j3 >> 32));
    }

    public static final float c(long j3) {
        return Float.intBitsToFloat((int) (j3 & 4294967295L));
    }

    public static String d(long j3) {
        if (b(j3) == c(j3)) {
            return "CornerRadius.circular(" + AbstractC0090a.j0(b(j3)) + ')';
        }
        return "CornerRadius.elliptical(" + AbstractC0090a.j0(b(j3)) + ", " + AbstractC0090a.j0(c(j3)) + ')';
    }
}
