package P;

/* loaded from: classes.dex */
public final class f implements l {

    /* renamed from: a, reason: collision with root package name */
    public final l f2083a;

    /* renamed from: b, reason: collision with root package name */
    public final l f2084b;

    public f(l lVar, l lVar2) {
        this.f2083a = lVar;
        this.f2084b = lVar2;
    }

    @Override // P.l
    public final boolean a(o2.c cVar) {
        return this.f2083a.a(cVar) && this.f2084b.a(cVar);
    }

    @Override // P.l
    public final Object b(Object obj, o2.e eVar) {
        return this.f2084b.b(this.f2083a.b(obj, eVar), eVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (p2.g.a(this.f2083a, fVar.f2083a) && p2.g.a(this.f2084b, fVar.f2084b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f2084b.hashCode() * 31) + this.f2083a.hashCode();
    }

    public final String toString() {
        return "[" + ((String) b("", e.f2082e)) + ']';
    }
}
