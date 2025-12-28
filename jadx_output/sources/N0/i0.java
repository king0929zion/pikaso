package n0;

/* loaded from: classes.dex */
public final class i0 implements f0 {

    /* renamed from: d, reason: collision with root package name */
    public final M1.j f5257d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0418L f5258e;

    public i0(M1.j jVar, AbstractC0418L abstractC0418L) {
        this.f5257d = jVar;
        this.f5258e = abstractC0418L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return p2.g.a(this.f5257d, i0Var.f5257d) && p2.g.a(this.f5258e, i0Var.f5258e);
    }

    public final int hashCode() {
        return this.f5258e.hashCode() + (this.f5257d.hashCode() * 31);
    }

    public final String toString() {
        return "PlaceableResult(result=" + this.f5257d + ", placeable=" + this.f5258e + ')';
    }

    @Override // n0.f0
    public final boolean w() {
        return this.f5258e.U().l();
    }
}
