package G0;

import a.AbstractC0090a;

/* loaded from: classes.dex */
public interface b {
    default long J(float f3) {
        return s(P(f3));
    }

    default float O(long j3) {
        if (!i.a(h.b(j3), 4294967296L)) {
            throw new IllegalStateException("Only Sp can convert to Px");
        }
        float[] fArr = H0.b.f1331a;
        if (f() < 1.03f) {
            return f() * h.c(j3);
        }
        H0.a a3 = H0.b.a(f());
        float c3 = h.c(j3);
        return a3 == null ? f() * c3 : a3.b(c3);
    }

    default float P(float f3) {
        return f3 / n();
    }

    default int b(float f3) {
        float u3 = u(f3);
        if (Float.isInfinite(u3)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(u3);
    }

    float f();

    float n();

    default long q(long j3) {
        if (j3 != 9205357640488583168L) {
            return AbstractC0090a.d(u(Float.intBitsToFloat((int) (j3 >> 32))), u(Float.intBitsToFloat((int) (j3 & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    default long s(float f3) {
        float[] fArr = H0.b.f1331a;
        if (!(f() >= 1.03f)) {
            return AbstractC0090a.W(4294967296L, f3 / f());
        }
        H0.a a3 = H0.b.a(f());
        return AbstractC0090a.W(4294967296L, a3 != null ? a3.a(f3) : f3 / f());
    }

    default float u(float f3) {
        return n() * f3;
    }

    default float v(long j3) {
        if (i.a(h.b(j3), 4294967296L)) {
            return u(O(j3));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }
}
