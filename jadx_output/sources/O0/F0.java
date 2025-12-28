package o0;

/* loaded from: classes.dex */
public interface F0 {
    default long a() {
        float f3 = 48;
        return (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L);
    }
}
