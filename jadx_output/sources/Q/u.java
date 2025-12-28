package q;

import D.q0;
import n0.AbstractC0409C;
import n0.AbstractC0428i;
import n0.InterfaceC0431l;
import n0.Y;
import n0.l0;
import s.C0584b;
import s.C0585c;
import t0.C0599a;
import y2.AbstractC0688v;

/* loaded from: classes.dex */
public final class u extends AbstractC0428i implements U.b, l0, InterfaceC0431l, U.o {

    /* renamed from: s, reason: collision with root package name */
    public U.p f6038s;

    /* renamed from: t, reason: collision with root package name */
    public final s f6039t;

    /* renamed from: u, reason: collision with root package name */
    public final v f6040u;

    /* renamed from: v, reason: collision with root package name */
    public final w f6041v;

    public u(s.g gVar) {
        s sVar = new s();
        sVar.f6035q = gVar;
        f0(sVar);
        this.f6039t = sVar;
        v vVar = new v();
        f0(vVar);
        this.f6040u = vVar;
        w wVar = new w();
        f0(wVar);
        this.f6041v = wVar;
        f0(new U.q());
    }

    @Override // n0.l0
    public final void A(t0.g gVar) {
        U.p pVar = this.f6038s;
        boolean z3 = false;
        if (pVar != null && pVar.a()) {
            z3 = true;
        }
        v2.c[] cVarArr = t0.p.f6284a;
        t0.q qVar = t0.n.f6267k;
        v2.c cVar = t0.p.f6284a[4];
        Boolean valueOf = Boolean.valueOf(z3);
        qVar.getClass();
        gVar.b(qVar, valueOf);
        gVar.b(t0.f.f6223s, new C0599a(null, new A0.c(17, this)));
    }

    @Override // P.k
    public final boolean V() {
        return false;
    }

    public final void i0(s.g gVar) {
        C0584b c0584b;
        s sVar = this.f6039t;
        if (p2.g.a(sVar.f6035q, gVar)) {
            return;
        }
        s.g gVar2 = sVar.f6035q;
        if (gVar2 != null && (c0584b = sVar.f6036r) != null) {
            gVar2.b(new C0585c(c0584b));
        }
        sVar.f6036r = null;
        sVar.f6035q = gVar;
    }

    @Override // n0.InterfaceC0431l
    public final void p(Y y3) {
        this.f6041v.p(y3);
    }

    @Override // U.b
    public final void z(U.p pVar) {
        if (p2.g.a(this.f6038s, pVar)) {
            return;
        }
        boolean a3 = pVar.a();
        if (a3) {
            AbstractC0688v.l(U(), null, 0, new t(this, null), 3);
        }
        if (this.f2099p) {
            AbstractC0409C.m(this);
        }
        s sVar = this.f6039t;
        s.g gVar = sVar.f6035q;
        if (gVar != null) {
            if (a3) {
                C0584b c0584b = sVar.f6036r;
                if (c0584b != null) {
                    sVar.f0(gVar, new C0585c(c0584b));
                    sVar.f6036r = null;
                }
                C0584b c0584b2 = new C0584b();
                sVar.f0(gVar, c0584b2);
                sVar.f6036r = c0584b2;
            } else {
                C0584b c0584b3 = sVar.f6036r;
                if (c0584b3 != null) {
                    sVar.f0(gVar, new C0585c(c0584b3));
                    sVar.f6036r = null;
                }
            }
        }
        w wVar = this.f6041v;
        if (a3 != wVar.f6043q) {
            I i3 = x.f6045q;
            if (a3) {
                Y y3 = wVar.f6044r;
                if (y3 != null && y3.q0().f2099p && wVar.f2099p) {
                    AbstractC0409C.i(wVar, i3);
                }
            } else if (wVar.f2099p) {
                AbstractC0409C.i(wVar, i3);
            }
            wVar.f6043q = a3;
        }
        v vVar = this.f6040u;
        if (a3) {
            vVar.getClass();
            p2.o oVar = new p2.o();
            AbstractC0409C.o(vVar, new q0(oVar, 6, vVar));
            if (oVar.f5960d != null) {
                throw new ClassCastException();
            }
        }
        vVar.getClass();
        this.f6038s = pVar;
    }
}
