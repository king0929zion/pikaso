package n0;

import A.AbstractC0000a;
import D.C0065y;
import a.AbstractC0090a;
import l0.InterfaceC0360j;
import o0.C0507u;
import p.AbstractC0537f;

/* renamed from: n0.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0412F extends l0.o implements InterfaceC0360j, InterfaceC0420a, Q {

    /* renamed from: i, reason: collision with root package name */
    public boolean f5085i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f5089m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f5090n;

    /* renamed from: o, reason: collision with root package name */
    public G0.a f5091o;

    /* renamed from: q, reason: collision with root package name */
    public o2.c f5093q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f5094r;

    /* renamed from: v, reason: collision with root package name */
    public boolean f5098v;

    /* renamed from: x, reason: collision with root package name */
    public Object f5100x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f5101y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ C0415I f5102z;

    /* renamed from: j, reason: collision with root package name */
    public int f5086j = Integer.MAX_VALUE;

    /* renamed from: k, reason: collision with root package name */
    public int f5087k = Integer.MAX_VALUE;

    /* renamed from: l, reason: collision with root package name */
    public int f5088l = 3;

    /* renamed from: p, reason: collision with root package name */
    public long f5092p = 0;

    /* renamed from: s, reason: collision with root package name */
    public final C0407A f5095s = new C0407A(this, 1);

    /* renamed from: t, reason: collision with root package name */
    public final F.d f5096t = new F.d(new C0412F[16]);

    /* renamed from: u, reason: collision with root package name */
    public boolean f5097u = true;

    /* renamed from: w, reason: collision with root package name */
    public boolean f5099w = true;

    public C0412F(C0415I c0415i) {
        this.f5102z = c0415i;
        this.f5100x = c0415i.f5146q.f5121s;
    }

    @Override // n0.InterfaceC0420a
    public final C0435p A() {
        return (C0435p) this.f5102z.f5131a.f5319x.f854c;
    }

    @Override // n0.InterfaceC0420a
    public final void B() {
        C0444z.D(this.f5102z.f5131a, false, 7);
    }

    @Override // n0.InterfaceC0420a
    public final void C(C0065y c0065y) {
        F.d n2 = this.f5102z.f5131a.n();
        int i3 = n2.f1160f;
        if (i3 > 0) {
            Object[] objArr = n2.f1158d;
            int i4 = 0;
            do {
                C0412F c0412f = ((C0444z) objArr[i4]).f5320y.f5147r;
                p2.g.b(c0412f);
                c0065y.i(c0412f);
                i4++;
            } while (i4 < i3);
        }
    }

    @Override // l0.o
    public final void G(long j3, float f3, o2.c cVar) {
        U(j3, cVar);
    }

    public final void M() {
        boolean z3 = this.f5094r;
        this.f5094r = true;
        C0415I c0415i = this.f5102z;
        if (!z3 && c0415i.f5136f) {
            C0444z.D(c0415i.f5131a, true, 6);
        }
        F.d n2 = c0415i.f5131a.n();
        int i3 = n2.f1160f;
        if (i3 > 0) {
            Object[] objArr = n2.f1158d;
            int i4 = 0;
            do {
                C0444z c0444z = (C0444z) objArr[i4];
                if (c0444z.l() != Integer.MAX_VALUE) {
                    C0412F c0412f = c0444z.f5320y.f5147r;
                    p2.g.b(c0412f);
                    c0412f.M();
                    C0444z.G(c0444z);
                }
                i4++;
            } while (i4 < i3);
        }
    }

    public final void N() {
        if (this.f5094r) {
            int i3 = 0;
            this.f5094r = false;
            F.d n2 = this.f5102z.f5131a.n();
            int i4 = n2.f1160f;
            if (i4 > 0) {
                Object[] objArr = n2.f1158d;
                do {
                    C0412F c0412f = ((C0444z) objArr[i3]).f5320y.f5147r;
                    p2.g.b(c0412f);
                    c0412f.N();
                    i3++;
                } while (i3 < i4);
            }
        }
    }

    public final void Q() {
        F.d n2;
        int i3;
        C0415I c0415i = this.f5102z;
        if (c0415i.f5145p <= 0 || (i3 = (n2 = c0415i.f5131a.n()).f1160f) <= 0) {
            return;
        }
        Object[] objArr = n2.f1158d;
        int i4 = 0;
        do {
            C0444z c0444z = (C0444z) objArr[i4];
            C0415I c0415i2 = c0444z.f5320y;
            if ((c0415i2.f5143n || c0415i2.f5144o) && !c0415i2.f5137g) {
                c0444z.C(false);
            }
            C0412F c0412f = c0415i2.f5147r;
            if (c0412f != null) {
                c0412f.Q();
            }
            i4++;
        } while (i4 < i3);
    }

    public final void R() {
        C0415I c0415i;
        int i3;
        this.f5101y = true;
        C0444z k3 = this.f5102z.f5131a.k();
        if (!this.f5094r) {
            M();
            if (this.f5085i && k3 != null) {
                k3.C(false);
            }
        }
        if (k3 == null) {
            this.f5087k = 0;
        } else if (!this.f5085i && ((i3 = (c0415i = k3.f5320y).f5132b) == 3 || i3 == 4)) {
            if (this.f5087k != Integer.MAX_VALUE) {
                Z0.d.S("Place was called on a node which was placed already");
                throw null;
            }
            int i4 = c0415i.f5138i;
            this.f5087k = i4;
            c0415i.f5138i = i4 + 1;
        }
        d();
    }

    public final void U(long j3, o2.c cVar) {
        C0415I c0415i = this.f5102z;
        if (c0415i.f5131a.f5297E) {
            Z0.d.R("place is called on a deactivated node");
            throw null;
        }
        c0415i.f5132b = 4;
        this.f5089m = true;
        this.f5101y = false;
        if (!AbstractC0090a.v(j3, this.f5092p)) {
            if (c0415i.f5144o || c0415i.f5143n) {
                c0415i.f5137g = true;
            }
            Q();
        }
        C0444z c0444z = c0415i.f5131a;
        e0 s3 = AbstractC0409C.s(c0444z);
        if (c0415i.f5137g || !this.f5094r) {
            c0415i.f(false);
            this.f5095s.f5073e = false;
            g0 snapshotObserver = ((C0507u) s3).getSnapshotObserver();
            C0411E c0411e = new C0411E(c0415i, s3, j3);
            snapshotObserver.getClass();
            if (c0444z.f5302f != null) {
                snapshotObserver.a(c0444z, snapshotObserver.f5254g, c0411e);
            } else {
                snapshotObserver.a(c0444z, snapshotObserver.f5253f, c0411e);
            }
        } else {
            AbstractC0419M o02 = c0415i.a().o0();
            p2.g.b(o02);
            o02.g0(AbstractC0090a.X(j3, o02.h));
            R();
        }
        this.f5092p = j3;
        this.f5093q = cVar;
        c0415i.f5132b = 5;
    }

    public final boolean V(long j3) {
        C0415I c0415i = this.f5102z;
        C0444z c0444z = c0415i.f5131a;
        if (c0444z.f5297E) {
            Z0.d.R("measure is called on a deactivated node");
            throw null;
        }
        C0444z k3 = c0444z.k();
        C0444z c0444z2 = c0415i.f5131a;
        c0444z2.f5318w = c0444z2.f5318w || (k3 != null && k3.f5318w);
        if (!c0444z2.f5320y.f5136f) {
            G0.a aVar = this.f5091o;
            if (aVar == null ? false : G0.a.b(aVar.f1251a, j3)) {
                C0507u c0507u = c0444z2.f5307l;
                if (c0507u != null) {
                    c0507u.k(c0444z2, true);
                }
                c0444z2.H();
                return false;
            }
        }
        this.f5091o = new G0.a(j3);
        K(j3);
        this.f5095s.f5072d = false;
        F.d n2 = c0444z2.n();
        int i3 = n2.f1160f;
        if (i3 > 0) {
            Object[] objArr = n2.f1158d;
            int i4 = 0;
            do {
                C0412F c0412f = ((C0444z) objArr[i4]).f5320y.f5147r;
                p2.g.b(c0412f);
                c0412f.f5095s.getClass();
                i4++;
            } while (i4 < i3);
        }
        long d3 = this.f5090n ? this.f4929f : r2.a.d(Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f5090n = true;
        AbstractC0419M o02 = c0415i.a().o0();
        if (!(o02 != null)) {
            Z0.d.S("Lookahead result from lookaheadRemeasure cannot be null");
            throw null;
        }
        c0415i.f5132b = 2;
        c0415i.f5136f = false;
        g0 snapshotObserver = ((C0507u) AbstractC0409C.s(c0444z2)).getSnapshotObserver();
        C0414H c0414h = new C0414H(c0415i, j3);
        snapshotObserver.getClass();
        if (c0444z2.f5302f != null) {
            snapshotObserver.a(c0444z2, snapshotObserver.f5249b, c0414h);
        } else {
            snapshotObserver.a(c0444z2, snapshotObserver.f5250c, c0414h);
        }
        c0415i.f5137g = true;
        c0415i.h = true;
        if (AbstractC0409C.n(c0444z2)) {
            c0415i.f5134d = true;
            c0415i.f5135e = true;
        } else {
            c0415i.f5133c = true;
        }
        c0415i.f5132b = 5;
        I(r2.a.d(o02.f4927d, o02.f4928e));
        return (((int) (d3 >> 32)) == o02.f4927d && ((int) (4294967295L & d3)) == o02.f4928e) ? false : true;
    }

    @Override // l0.InterfaceC0360j
    public final l0.o a(long j3) {
        C0415I c0415i = this.f5102z;
        C0444z k3 = c0415i.f5131a.k();
        int i3 = k3 != null ? k3.f5320y.f5132b : 0;
        int i4 = 2;
        C0444z c0444z = c0415i.f5131a;
        if (i3 != 2) {
            C0444z k4 = c0444z.k();
            if (k4 != null) {
                int i5 = k4.f5320y.f5132b;
            }
        }
        C0444z k5 = c0444z.k();
        if (k5 == null) {
            this.f5088l = 3;
        } else {
            if (this.f5088l != 3 && !c0444z.f5318w) {
                Z0.d.S("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
                throw null;
            }
            C0415I c0415i2 = k5.f5320y;
            int b3 = AbstractC0537f.b(c0415i2.f5132b);
            if (b3 == 0 || b3 == 1) {
                i4 = 1;
            } else if (b3 != 2 && b3 != 3) {
                throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is ".concat(AbstractC0000a.n(c0415i2.f5132b)));
            }
            this.f5088l = i4;
        }
        if (c0444z.f5298F == 3) {
            c0444z.c();
        }
        V(j3);
        return this;
    }

    @Override // n0.InterfaceC0420a
    public final InterfaceC0420a c() {
        C0415I c0415i;
        C0444z k3 = this.f5102z.f5131a.k();
        if (k3 == null || (c0415i = k3.f5320y) == null) {
            return null;
        }
        return c0415i.f5147r;
    }

    @Override // n0.InterfaceC0420a
    public final void d() {
        F.d n2;
        int i3;
        this.f5098v = true;
        C0407A c0407a = this.f5095s;
        c0407a.h();
        C0415I c0415i = this.f5102z;
        boolean z3 = c0415i.f5137g;
        C0444z c0444z = c0415i.f5131a;
        if (z3 && (i3 = (n2 = c0444z.n()).f1160f) > 0) {
            Object[] objArr = n2.f1158d;
            int i4 = 0;
            do {
                C0444z c0444z2 = (C0444z) objArr[i4];
                if (c0444z2.f5320y.f5136f && c0444z2.j() == 1) {
                    C0415I c0415i2 = c0444z2.f5320y;
                    C0412F c0412f = c0415i2.f5147r;
                    p2.g.b(c0412f);
                    C0412F c0412f2 = c0415i2.f5147r;
                    G0.a aVar = c0412f2 != null ? c0412f2.f5091o : null;
                    p2.g.b(aVar);
                    if (c0412f.V(aVar.f1251a)) {
                        C0444z.D(c0444z, false, 7);
                    }
                }
                i4++;
            } while (i4 < i3);
        }
        C0434o c0434o = A().f5276L;
        p2.g.b(c0434o);
        if (c0415i.h || (!c0434o.f5164j && c0415i.f5137g)) {
            c0415i.f5137g = false;
            int i5 = c0415i.f5132b;
            c0415i.f5132b = 4;
            e0 s3 = AbstractC0409C.s(c0444z);
            c0415i.g(false);
            g0 snapshotObserver = ((C0507u) s3).getSnapshotObserver();
            C0410D c0410d = new C0410D(this, c0434o, c0415i, 0);
            snapshotObserver.getClass();
            if (c0444z.f5302f != null) {
                snapshotObserver.a(c0444z, snapshotObserver.h, c0410d);
            } else {
                snapshotObserver.a(c0444z, snapshotObserver.f5252e, c0410d);
            }
            c0415i.f5132b = i5;
            if (c0415i.f5143n && c0434o.f5164j) {
                requestLayout();
            }
            c0415i.h = false;
        }
        if (c0407a.f5070b && c0407a.e()) {
            c0407a.g();
        }
        this.f5098v = false;
    }

    @Override // n0.InterfaceC0420a
    public final boolean g() {
        return this.f5094r;
    }

    @Override // l0.o, l0.InterfaceC0360j
    public final Object o() {
        return this.f5100x;
    }

    @Override // n0.InterfaceC0420a
    public final void requestLayout() {
        this.f5102z.f5131a.C(false);
    }

    @Override // n0.InterfaceC0420a
    public final C0407A y() {
        return this.f5095s;
    }

    @Override // n0.Q
    public final void z() {
        C0415I c0415i = this.f5102z;
        if (Boolean.FALSE.equals(c0415i.a().o0() != null ? Boolean.FALSE : null)) {
            return;
        }
        c0415i.a().o0();
    }
}
