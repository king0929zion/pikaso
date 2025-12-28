package A2;

/* loaded from: classes.dex */
public final class g extends h {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f256a;

    public g(Throwable th) {
        this.f256a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            if (p2.g.a(this.f256a, ((g) obj).f256a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f256a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // A2.h
    public final String toString() {
        return "Closed(" + this.f256a + ')';
    }
}
