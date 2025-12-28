package G0;

import a.AbstractC0090a;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f1251a;

    public /* synthetic */ a(long j3) {
        this.f1251a = j3;
    }

    public static long a(int i3, int i4, long j3) {
        int h = h(j3);
        int g3 = g(j3);
        if (!(i4 >= 0 && i3 >= 0)) {
            r2.a.b0("minHeight(" + i4 + ") and minWidth(" + i3 + ") must be >= 0");
            throw null;
        }
        if (!(h >= i3)) {
            r2.a.b0("maxWidth(" + h + ") must be >= minWidth(" + i3 + ')');
            throw null;
        }
        if (g3 >= i4) {
            return AbstractC0090a.q(i3, h, i4, g3);
        }
        r2.a.b0("maxHeight(" + g3 + ") must be >= minHeight(" + i4 + ')');
        throw null;
    }

    public static final boolean b(long j3, long j4) {
        return j3 == j4;
    }

    public static final boolean c(long j3) {
        int i3 = (int) (3 & j3);
        int i4 = (((i3 & 2) >> 1) * 3) + ((i3 & 1) << 1);
        return (((int) (j3 >> (i4 + 46))) & ((1 << (18 - i4)) - 1)) != 0;
    }

    public static final boolean d(long j3) {
        int i3 = (int) (3 & j3);
        return (((int) (j3 >> 33)) & ((1 << (((((i3 & 2) >> 1) * 3) + ((i3 & 1) << 1)) + 13)) - 1)) != 0;
    }

    public static final boolean e(long j3) {
        int i3 = (int) (3 & j3);
        int i4 = (((i3 & 2) >> 1) * 3) + ((i3 & 1) << 1);
        int i5 = (1 << (18 - i4)) - 1;
        int i6 = ((int) (j3 >> (i4 + 15))) & i5;
        int i7 = ((int) (j3 >> (i4 + 46))) & i5;
        return i6 == (i7 == 0 ? Integer.MAX_VALUE : i7 - 1);
    }

    public static final boolean f(long j3) {
        int i3 = (int) (3 & j3);
        int i4 = (1 << (((((i3 & 2) >> 1) * 3) + ((i3 & 1) << 1)) + 13)) - 1;
        int i5 = ((int) (j3 >> 2)) & i4;
        int i6 = ((int) (j3 >> 33)) & i4;
        return i5 == (i6 == 0 ? Integer.MAX_VALUE : i6 - 1);
    }

    public static final int g(long j3) {
        int i3 = (int) (3 & j3);
        int i4 = (((i3 & 2) >> 1) * 3) + ((i3 & 1) << 1);
        int i5 = ((int) (j3 >> (i4 + 46))) & ((1 << (18 - i4)) - 1);
        if (i5 == 0) {
            return Integer.MAX_VALUE;
        }
        return i5 - 1;
    }

    public static final int h(long j3) {
        int i3 = (int) (3 & j3);
        int i4 = (int) (j3 >> 33);
        int i5 = i4 & ((1 << (((((i3 & 2) >> 1) * 3) + ((i3 & 1) << 1)) + 13)) - 1);
        if (i5 == 0) {
            return Integer.MAX_VALUE;
        }
        return i5 - 1;
    }

    public static final int i(long j3) {
        int i3 = (int) (3 & j3);
        int i4 = (((i3 & 2) >> 1) * 3) + ((i3 & 1) << 1);
        return ((int) (j3 >> (i4 + 15))) & ((1 << (18 - i4)) - 1);
    }

    public static final int j(long j3) {
        int i3 = (int) (3 & j3);
        return ((int) (j3 >> 2)) & ((1 << (((((i3 & 2) >> 1) * 3) + ((i3 & 1) << 1)) + 13)) - 1);
    }

    public static String k(long j3) {
        int h = h(j3);
        String valueOf = h == Integer.MAX_VALUE ? "Infinity" : String.valueOf(h);
        int g3 = g(j3);
        return "Constraints(minWidth = " + j(j3) + ", maxWidth = " + valueOf + ", minHeight = " + i(j3) + ", maxHeight = " + (g3 != Integer.MAX_VALUE ? String.valueOf(g3) : "Infinity") + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f1251a == ((a) obj).f1251a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f1251a);
    }

    public final String toString() {
        return k(this.f1251a);
    }
}
