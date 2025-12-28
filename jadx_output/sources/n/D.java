package N;

import D.C0032d;
import n.C0375B;

/* loaded from: classes.dex */
public final class D extends C0075c {

    /* renamed from: o, reason: collision with root package name */
    public final C0075c f1708o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f1709p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f1710q;

    /* renamed from: r, reason: collision with root package name */
    public o2.c f1711r;

    /* renamed from: s, reason: collision with root package name */
    public o2.c f1712s;

    /* renamed from: t, reason: collision with root package name */
    public final long f1713t;

    public D(C0075c c0075c, o2.c cVar, o2.c cVar2, boolean z3, boolean z4) {
        super(0, l.h, o.l(cVar, (c0075c == null || (r1 = c0075c.f()) == null) ? ((C0074b) o.f1762i.get()).f1721e : r1, z3), o.b(cVar2, (c0075c == null || (r1 = c0075c.i()) == null) ? ((C0074b) o.f1762i.get()).f1722f : r1));
        o2.c i3;
        o2.c f3;
        this.f1708o = c0075c;
        this.f1709p = z3;
        this.f1710q = z4;
        this.f1711r = this.f1721e;
        this.f1712s = this.f1722f;
        this.f1713t = C0032d.u();
    }

    @Override // N.C0075c
    public final void A(C0375B c0375b) {
        t.e();
        throw null;
    }

    @Override // N.C0075c
    public final C0075c B(o2.c cVar, o2.c cVar2) {
        o2.c l3 = o.l(cVar, this.f1711r, true);
        o2.c b3 = o.b(cVar2, this.f1712s);
        return !this.f1709p ? new D(C().B(null, b3), l3, b3, false, true) : C().B(l3, b3);
    }

    public final C0075c C() {
        C0075c c0075c = this.f1708o;
        return c0075c == null ? (C0075c) o.f1762i.get() : c0075c;
    }

    @Override // N.C0075c, N.h
    public final void c() {
        C0075c c0075c;
        this.f1738c = true;
        if (!this.f1710q || (c0075c = this.f1708o) == null) {
            return;
        }
        c0075c.c();
    }

    @Override // N.h
    public final int d() {
        return C().d();
    }

    @Override // N.h
    public final l e() {
        return C().e();
    }

    @Override // N.C0075c, N.h
    public final o2.c f() {
        return this.f1711r;
    }

    @Override // N.C0075c, N.h
    public final boolean g() {
        return C().g();
    }

    @Override // N.C0075c, N.h
    public final int h() {
        return C().h();
    }

    @Override // N.C0075c, N.h
    public final o2.c i() {
        return this.f1712s;
    }

    @Override // N.C0075c, N.h
    public final void k() {
        t.e();
        throw null;
    }

    @Override // N.C0075c, N.h
    public final void l() {
        t.e();
        throw null;
    }

    @Override // N.C0075c, N.h
    public final void m() {
        C().m();
    }

    @Override // N.C0075c, N.h
    public final void n(y yVar) {
        C().n(yVar);
    }

    @Override // N.h
    public final void q(int i3) {
        t.e();
        throw null;
    }

    @Override // N.h
    public final void r(l lVar) {
        t.e();
        throw null;
    }

    @Override // N.C0075c, N.h
    public final void s(int i3) {
        C().s(i3);
    }

    @Override // N.C0075c, N.h
    public final h t(o2.c cVar) {
        o2.c l3 = o.l(cVar, this.f1711r, true);
        return !this.f1709p ? o.h(C().t(null), l3, true) : C().t(l3);
    }

    @Override // N.C0075c
    public final t v() {
        return C().v();
    }

    @Override // N.C0075c
    public final C0375B w() {
        return C().w();
    }

    @Override // N.C0075c
    /* renamed from: x */
    public final o2.c f() {
        return this.f1711r;
    }
}
