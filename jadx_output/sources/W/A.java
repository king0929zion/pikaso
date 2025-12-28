package W;

/* loaded from: classes.dex */
public final class A extends B {

    /* renamed from: a, reason: collision with root package name */
    public final V.e f2482a;

    /* renamed from: b, reason: collision with root package name */
    public final C0086i f2483b;

    public A(V.e eVar) {
        C0086i c0086i;
        this.f2482a = eVar;
        if (r2.a.K(eVar)) {
            c0086i = null;
        } else {
            c0086i = D.f();
            C.a(c0086i, eVar);
        }
        this.f2483b = c0086i;
    }

    @Override // W.B
    public final V.d a() {
        V.e eVar = this.f2482a;
        return new V.d(eVar.f2450a, eVar.f2451b, eVar.f2452c, eVar.f2453d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof A) {
            return p2.g.a(this.f2482a, ((A) obj).f2482a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2482a.hashCode();
    }
}
