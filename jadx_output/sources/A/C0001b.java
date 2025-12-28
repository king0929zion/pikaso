package A;

/* renamed from: A.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0001b {

    /* renamed from: a, reason: collision with root package name */
    public final long f72a;

    /* renamed from: b, reason: collision with root package name */
    public final long f73b;

    /* renamed from: c, reason: collision with root package name */
    public final long f74c;

    /* renamed from: d, reason: collision with root package name */
    public final long f75d;

    public C0001b(long j3, long j4, long j5, long j6) {
        this.f72a = j3;
        this.f73b = j4;
        this.f74c = j5;
        this.f75d = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0001b)) {
            return false;
        }
        C0001b c0001b = (C0001b) obj;
        return W.r.c(this.f72a, c0001b.f72a) && W.r.c(this.f73b, c0001b.f73b) && W.r.c(this.f74c, c0001b.f74c) && W.r.c(this.f75d, c0001b.f75d);
    }

    public final int hashCode() {
        int i3 = W.r.f2563g;
        return Long.hashCode(this.f75d) + AbstractC0000a.b(AbstractC0000a.b(Long.hashCode(this.f72a) * 31, 31, this.f73b), 31, this.f74c);
    }
}
