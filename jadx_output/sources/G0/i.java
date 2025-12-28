package G0;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final long f1265a;

    public static final boolean a(long j3, long j4) {
        return j3 == j4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f1265a == ((i) obj).f1265a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f1265a);
    }

    public final String toString() {
        long j3 = this.f1265a;
        return a(j3, 0L) ? "Unspecified" : a(j3, 4294967296L) ? "Sp" : a(j3, 8589934592L) ? "Em" : "Invalid";
    }
}
