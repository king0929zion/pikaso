package W;

/* loaded from: classes.dex */
public abstract class K {

    /* renamed from: a, reason: collision with root package name */
    public static final long f2530a = (Float.floatToRawIntBits(0.5f) << 32) | (Float.floatToRawIntBits(0.5f) & 4294967295L);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f2531b = 0;

    public static final float a(long j3) {
        return Float.intBitsToFloat((int) (j3 >> 32));
    }

    public static final float b(long j3) {
        return Float.intBitsToFloat((int) (j3 & 4294967295L));
    }
}
