package W;

/* loaded from: classes.dex */
public final class z extends B {

    /* renamed from: a, reason: collision with root package name */
    public final V.d f2572a;

    public z(V.d dVar) {
        this.f2572a = dVar;
    }

    @Override // W.B
    public final V.d a() {
        return this.f2572a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z) {
            return p2.g.a(this.f2572a, ((z) obj).f2572a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2572a.hashCode();
    }
}
