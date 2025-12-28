package N;

import D.C0032d;

/* loaded from: classes.dex */
public final class E extends h {

    /* renamed from: e, reason: collision with root package name */
    public final h f1714e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1715f;

    /* renamed from: g, reason: collision with root package name */
    public o2.c f1716g;
    public final long h;

    public E(h hVar, o2.c cVar, boolean z3) {
        super(0, l.h);
        o2.c f3;
        this.f1714e = hVar;
        this.f1715f = z3;
        this.f1716g = o.l(cVar, (hVar == null || (f3 = hVar.f()) == null) ? ((C0074b) o.f1762i.get()).f1721e : f3, false);
        this.h = C0032d.u();
    }

    @Override // N.h
    public final void c() {
        h hVar;
        this.f1738c = true;
        if (!this.f1715f || (hVar = this.f1714e) == null) {
            return;
        }
        hVar.c();
    }

    @Override // N.h
    public final int d() {
        return u().d();
    }

    @Override // N.h
    public final l e() {
        return u().e();
    }

    @Override // N.h
    public final o2.c f() {
        return this.f1716g;
    }

    @Override // N.h
    public final boolean g() {
        return u().g();
    }

    @Override // N.h
    public final o2.c i() {
        return null;
    }

    @Override // N.h
    public final void k() {
        t.e();
        throw null;
    }

    @Override // N.h
    public final void l() {
        t.e();
        throw null;
    }

    @Override // N.h
    public final void m() {
        u().m();
    }

    @Override // N.h
    public final void n(y yVar) {
        u().n(yVar);
    }

    @Override // N.h
    public final h t(o2.c cVar) {
        return o.h(u().t(null), o.l(cVar, this.f1716g, true), true);
    }

    public final h u() {
        h hVar = this.f1714e;
        return hVar == null ? (h) o.f1762i.get() : hVar;
    }
}
