package z;

/* renamed from: z.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0714q {

    /* renamed from: a, reason: collision with root package name */
    public static final float f6890a = 10;

    public static final float a(G0.b bVar, boolean z3, long j3) {
        long f3 = r2.a.f(V.f.d(j3), V.f.b(j3));
        float intBitsToFloat = Float.intBitsToFloat((int) (f3 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (f3 & 4294967295L));
        float sqrt = ((float) Math.sqrt((intBitsToFloat2 * intBitsToFloat2) + (intBitsToFloat * intBitsToFloat))) / 2.0f;
        return z3 ? sqrt + bVar.u(f6890a) : sqrt;
    }
}
