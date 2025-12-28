package V;

import a.AbstractC0090a;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final long f2457a;

    public /* synthetic */ f(long j3) {
        this.f2457a = j3;
    }

    public static final boolean a(long j3, long j4) {
        return j3 == j4;
    }

    public static final float b(long j3) {
        if (j3 != 9205357640488583168L) {
            return Float.intBitsToFloat((int) (j3 & 4294967295L));
        }
        throw new IllegalStateException("Size is unspecified");
    }

    public static final float c(long j3) {
        if (j3 != 9205357640488583168L) {
            return Math.min(Float.intBitsToFloat((int) ((j3 >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j3 & 2147483647L)));
        }
        throw new IllegalStateException("Size is unspecified");
    }

    public static final float d(long j3) {
        if (j3 != 9205357640488583168L) {
            return Float.intBitsToFloat((int) (j3 >> 32));
        }
        throw new IllegalStateException("Size is unspecified");
    }

    public static final boolean e(long j3) {
        if (j3 == 9205357640488583168L) {
            throw new IllegalStateException("Size is unspecified");
        }
        long j4 = j3 & (~((((-9223372034707292160L) & j3) >>> 31) * (-1)));
        return ((j4 & 4294967295L) & (j4 >>> 32)) == 0;
    }

    public static String f(long j3) {
        if (j3 == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + AbstractC0090a.j0(d(j3)) + ", " + AbstractC0090a.j0(b(j3)) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f2457a == ((f) obj).f2457a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2457a);
    }

    public final String toString() {
        return f(this.f2457a);
    }
}
