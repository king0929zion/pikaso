package A;

/* renamed from: A.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0011l {

    /* renamed from: a, reason: collision with root package name */
    public final long f107a;

    /* renamed from: b, reason: collision with root package name */
    public final long f108b;

    /* renamed from: c, reason: collision with root package name */
    public final long f109c;

    /* renamed from: d, reason: collision with root package name */
    public final long f110d;

    public C0011l(long j3, long j4, long j5, long j6) {
        this.f107a = j3;
        this.f108b = j4;
        this.f109c = j5;
        this.f110d = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0011l)) {
            return false;
        }
        C0011l c0011l = (C0011l) obj;
        return W.r.c(this.f107a, c0011l.f107a) && W.r.c(this.f108b, c0011l.f108b) && W.r.c(this.f109c, c0011l.f109c) && W.r.c(this.f110d, c0011l.f110d);
    }

    public final int hashCode() {
        int i3 = W.r.f2563g;
        return Long.hashCode(this.f110d) + AbstractC0000a.b(AbstractC0000a.b(Long.hashCode(this.f107a) * 31, 31, this.f108b), 31, this.f109c);
    }
}
