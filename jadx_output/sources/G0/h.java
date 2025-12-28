package G0;

import a.AbstractC0090a;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    public static final i[] f1262b = {new i(0), new i(4294967296L), new i(8589934592L)};

    /* renamed from: c, reason: collision with root package name */
    public static final long f1263c = AbstractC0090a.W(0, Float.NaN);

    /* renamed from: a, reason: collision with root package name */
    public final long f1264a;

    public static final boolean a(long j3, long j4) {
        return j3 == j4;
    }

    public static final long b(long j3) {
        return f1262b[(int) ((j3 & 1095216660480L) >>> 32)].f1265a;
    }

    public static final float c(long j3) {
        return Float.intBitsToFloat((int) (j3 & 4294967295L));
    }

    public static String d(long j3) {
        long b3 = b(j3);
        if (i.a(b3, 0L)) {
            return "Unspecified";
        }
        if (i.a(b3, 4294967296L)) {
            return c(j3) + ".sp";
        }
        if (!i.a(b3, 8589934592L)) {
            return "Invalid";
        }
        return c(j3) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f1264a == ((h) obj).f1264a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f1264a);
    }

    public final String toString() {
        return d(this.f1264a);
    }
}
