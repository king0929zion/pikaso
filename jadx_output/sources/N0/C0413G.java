package n0;

import A.AbstractC0000a;
import D.C0059s;
import D.C0065y;
import D.q0;
import a.AbstractC0090a;
import l0.InterfaceC0360j;
import o0.C0507u;
import p.AbstractC0537f;

/* renamed from: n0.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0413G extends l0.o implements InterfaceC0360j, InterfaceC0420a, Q {

    /* renamed from: A, reason: collision with root package name */
    public float f5103A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f5104B;

    /* renamed from: C, reason: collision with root package name */
    public o2.c f5105C;

    /* renamed from: E, reason: collision with root package name */
    public float f5107E;

    /* renamed from: F, reason: collision with root package name */
    public final q0 f5108F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f5109G;

    /* renamed from: H, reason: collision with root package name */
    public final /* synthetic */ C0415I f5110H;

    /* renamed from: i, reason: collision with root package name */
    public boolean f5111i;

    /* renamed from: l, reason: collision with root package name */
    public boolean f5114l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f5115m;

    /* renamed from: p, reason: collision with root package name */
    public o2.c f5118p;

    /* renamed from: q, reason: collision with root package name */
    public float f5119q;

    /* renamed from: s, reason: collision with root package name */
    public Object f5121s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f5122t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f5123u;

    /* renamed from: y, reason: collision with root package name */
    public boolean f5127y;

    /* renamed from: j, reason: collision with root package name */
    public int f5112j = Integer.MAX_VALUE;

    /* renamed from: k, reason: collision with root package name */
    public int f5113k = Integer.MAX_VALUE;

    /* renamed from: n, reason: collision with root package name */
    public int f5116n = 3;

    /* renamed from: o, reason: collision with root package name */
    public long f5117o = 0;

    /* renamed from: r, reason: collision with root package name */
    public boolean f5120r = true;

    /* renamed from: v, reason: collision with root package name */
    public final C0407A f5124v = new C0407A(this, 0);

    /* renamed from: w, reason: collision with root package name */
    public final F.d f5125w = new F.d(new C0413G[16]);

    /* renamed from: x, reason: collision with root package name */
    public boolean f5126x = true;

    /* renamed from: z, reason: collision with root package name */
    public final A0.c f5128z = new A0.c(11, this);

    /* renamed from: D, reason: collision with root package name */
    public long f5106D = 0;

    public C0413G(C0415I c0415i) {
        this.f5110H = c0415i;
        this.f5108F = new q0(c0415i, 3, this);
    }

    @Override // n0.InterfaceC0420a
    public final C0435p A() {
        return (C0435p) this.f5110H.f5131a.f5319x.f854c;
    }

    @Override // n0.InterfaceC0420a
    public final void B() {
        C0444z.F(this.f5110H.f5131a, false, 7);
    }

    @Override // n0.InterfaceC0420a
    public final void C(C0065y c0065y) {
        F.d n2 = this.f5110H.f5131a.n();
        int i3 = n2.f1160f;
        if (i3 > 0) {
            Object[] objArr = n2.f1158d;
            int i4 = 0;
            do {
                c0065y.i(((C0444z) objArr[i4]).f5320y.f5146q);
                i4++;
            } while (i4 < i3);
        }
    }

    @Override // l0.o
    public final void G(long j3, float f3, o2.c cVar) {
        l0.n placementScope;
        this.f5123u = true;
        boolean v3 = AbstractC0090a.v(j3, this.f5117o);
        C0415I c0415i = this.f5110H;
        if (!v3 || this.f5109G) {
            if (c0415i.f5141l || c0415i.f5140k || this.f5109G) {
                c0415i.f5134d = true;
                this.f5109G = false;
            }
            Q();
        }
        if (AbstractC0409C.n(c0415i.f5131a)) {
            Y y3 = c0415i.a().f5219p;
            C0444z c0444z = c0415i.f5131a;
            if (y3 == null || (placementScope = y3.f5165k) == null) {
                placementScope = ((C0507u) AbstractC0409C.s(c0444z)).getPlacementScope();
            }
            C0412F c0412f = c0415i.f5147r;
            p2.g.b(c0412f);
            C0444z k3 = c0444z.k();
            if (k3 != null) {
                k3.f5320y.f5138i = 0;
            }
            c0412f.f5087k = Integer.MAX_VALUE;
            l0.n.d(placementScope, c0412f, (int) (j3 >> 32), (int) (4294967295L & j3));
        }
        C0412F c0412f2 = c0415i.f5147r;
        if (c0412f2 == null || c0412f2.f5089m) {
            U(j3, f3, cVar);
        } else {
            Z0.d.S("Error: Placement happened before lookahead.");
            throw null;
        }
    }

    public final void M() {
        boolean z3 = this.f5122t;
        this.f5122t = true;
        C0444z c0444z = this.f5110H.f5131a;
        if (!z3) {
            C0415I c0415i = c0444z.f5320y;
            if (c0415i.f5133c) {
                C0444z.F(c0444z, true, 6);
            } else if (c0415i.f5136f) {
                C0444z.D(c0444z, true, 6);
            }
        }
        C0059s c0059s = c0444z.f5319x;
        Y y3 = ((C0435p) c0059s.f854c).f5218o;
        for (Y y4 = (Y) c0059s.f855d; !p2.g.a(y4, y3) && y4 != null; y4 = y4.f5218o) {
            if (y4.f5215E) {
                y4.w0();
            }
        }
        F.d n2 = c0444z.n();
        int i3 = n2.f1160f;
        if (i3 > 0) {
            Object[] objArr = n2.f1158d;
            int i4 = 0;
            do {
                C0444z c0444z2 = (C0444z) objArr[i4];
                if (c0444z2.l() != Integer.MAX_VALUE) {
                    c0444z2.f5320y.f5146q.M();
                    C0444z.G(c0444z2);
                }
                i4++;
            } while (i4 < i3);
        }
    }

    public final void N() {
        if (this.f5122t) {
            int i3 = 0;
            this.f5122t = false;
            C0415I c0415i = this.f5110H;
            C0059s c0059s = c0415i.f5131a.f5319x;
            Y y3 = ((C0435p) c0059s.f854c).f5218o;
            for (Y y4 = (Y) c0059s.f855d; !p2.g.a(y4, y3) && y4 != null; y4 = y4.f5218o) {
                if (y4.f5216F != null) {
                    y4.J0(null, false);
                    y4.f5217n.E(false);
                }
            }
            F.d n2 = c0415i.f5131a.n();
            int i4 = n2.f1160f;
            if (i4 > 0) {
                Object[] objArr = n2.f1158d;
                do {
                    ((C0444z) objArr[i3]).f5320y.f5146q.N();
                    i3++;
                } while (i3 < i4);
            }
        }
    }

    public final void Q() {
        F.d n2;
        int i3;
        C0415I c0415i = this.f5110H;
        if (c0415i.f5142m <= 0 || (i3 = (n2 = c0415i.f5131a.n()).f1160f) <= 0) {
            return;
        }
        Object[] objArr = n2.f1158d;
        int i4 = 0;
        do {
            C0444z c0444z = (C0444z) objArr[i4];
            C0415I c0415i2 = c0444z.f5320y;
            if ((c0415i2.f5140k || c0415i2.f5141l) && !c0415i2.f5134d) {
                c0444z.E(false);
            }
            c0415i2.f5146q.Q();
            i4++;
        } while (i4 < i3);
    }

    public final void R() {
        this.f5104B = true;
        C0415I c0415i = this.f5110H;
        C0444z k3 = c0415i.f5131a.k();
        float f3 = A().f5229z;
        C0059s c0059s = c0415i.f5131a.f5319x;
        Y y3 = (Y) c0059s.f855d;
        while (y3 != ((C0435p) c0059s.f854c)) {
            p2.g.c(y3, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            C0439u c0439u = (C0439u) y3;
            f3 += c0439u.f5229z;
            y3 = c0439u.f5218o;
        }
        if (f3 != this.f5103A) {
            this.f5103A = f3;
            if (k3 != null) {
                k3.A();
            }
            if (k3 != null) {
                k3.p();
            }
        }
        if (!this.f5122t) {
            if (k3 != null) {
                k3.p();
            }
            M();
            if (this.f5111i && k3 != null) {
                k3.E(false);
            }
        }
        if (k3 == null) {
            this.f5113k = 0;
        } else if (!this.f5111i) {
            C0415I c0415i2 = k3.f5320y;
            if (c0415i2.f5132b == 3) {
                if (this.f5113k != Integer.MAX_VALUE) {
                    Z0.d.S("Place was called on a node which was placed already");
                    throw null;
                }
                int i3 = c0415i2.f5139j;
                this.f5113k = i3;
                c0415i2.f5139j = i3 + 1;
            }
        }
        d();
    }

    public final void U(long j3, float f3, o2.c cVar) {
        C0415I c0415i = this.f5110H;
        C0444z c0444z = c0415i.f5131a;
        if (c0444z.f5297E) {
            Z0.d.R("place is called on a deactivated node");
            throw null;
        }
        c0415i.f5132b = 3;
        this.f5117o = j3;
        this.f5119q = f3;
        this.f5118p = cVar;
        this.f5115m = true;
        this.f5104B = false;
        e0 s3 = AbstractC0409C.s(c0444z);
        if (c0415i.f5134d || !this.f5122t) {
            this.f5124v.f5073e = false;
            c0415i.d(false);
            this.f5105C = cVar;
            this.f5106D = j3;
            this.f5107E = f3;
            g0 snapshotObserver = ((C0507u) s3).getSnapshotObserver();
            snapshotObserver.a(c0415i.f5131a, snapshotObserver.f5253f, this.f5108F);
        } else {
            Y a3 = c0415i.a();
            a3.E0(AbstractC0090a.X(j3, a3.h), f3, cVar);
            R();
        }
        c0415i.f5132b = 5;
    }

    public final boolean V(long j3) {
        C0415I c0415i = this.f5110H;
        C0444z c0444z = c0415i.f5131a;
        if (c0444z.f5297E) {
            Z0.d.R("measure is called on a deactivated node");
            throw null;
        }
        e0 s3 = AbstractC0409C.s(c0444z);
        C0444z c0444z2 = c0415i.f5131a;
        C0444z k3 = c0444z2.k();
        boolean z3 = true;
        c0444z2.f5318w = c0444z2.f5318w || (k3 != null && k3.f5318w);
        if (!c0444z2.f5320y.f5133c && G0.a.b(this.f4930g, j3)) {
            ((C0507u) s3).k(c0444z2, false);
            c0444z2.H();
            return false;
        }
        this.f5124v.f5072d = false;
        F.d n2 = c0444z2.n();
        int i3 = n2.f1160f;
        if (i3 > 0) {
            Object[] objArr = n2.f1158d;
            int i4 = 0;
            do {
                ((C0444z) objArr[i4]).f5320y.f5146q.f5124v.getClass();
                i4++;
            } while (i4 < i3);
        }
        this.f5114l = true;
        long j4 = c0415i.a().f4929f;
        K(j3);
        if (c0415i.f5132b != 5) {
            Z0.d.S("layout state is not idle before measure starts");
            throw null;
        }
        c0415i.f5132b = 1;
        c0415i.f5133c = false;
        c0415i.f5148s = j3;
        g0 snapshotObserver = ((C0507u) AbstractC0409C.s(c0444z2)).getSnapshotObserver();
        snapshotObserver.a(c0444z2, snapshotObserver.f5250c, c0415i.f5149t);
        if (c0415i.f5132b == 1) {
            c0415i.f5134d = true;
            c0415i.f5135e = true;
            c0415i.f5132b = 5;
        }
        if (AbstractC0090a.x(c0415i.a().f4929f, j4) && c0415i.a().f4927d == this.f4927d && c0415i.a().f4928e == this.f4928e) {
            z3 = false;
        }
        I(r2.a.d(c0415i.a().f4927d, c0415i.a().f4928e));
        return z3;
    }

    @Override // l0.InterfaceC0360j
    public final l0.o a(long j3) {
        int i3;
        C0415I c0415i = this.f5110H;
        C0444z c0444z = c0415i.f5131a;
        if (c0444z.f5298F == 3) {
            c0444z.c();
        }
        C0444z c0444z2 = c0415i.f5131a;
        if (AbstractC0409C.n(c0444z2)) {
            C0412F c0412f = c0415i.f5147r;
            p2.g.b(c0412f);
            c0412f.f5088l = 3;
            c0412f.a(j3);
        }
        C0444z k3 = c0444z2.k();
        if (k3 == null) {
            this.f5116n = 3;
        } else {
            if (this.f5116n != 3 && !c0444z2.f5318w) {
                Z0.d.S("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
                throw null;
            }
            C0415I c0415i2 = k3.f5320y;
            int b3 = AbstractC0537f.b(c0415i2.f5132b);
            if (b3 != 0) {
                i3 = 2;
                if (b3 != 2) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is ".concat(AbstractC0000a.n(c0415i2.f5132b)));
                }
            } else {
                i3 = 1;
            }
            this.f5116n = i3;
        }
        V(j3);
        return this;
    }

    @Override // n0.InterfaceC0420a
    public final InterfaceC0420a c() {
        C0415I c0415i;
        C0444z k3 = this.f5110H.f5131a.k();
        if (k3 == null || (c0415i = k3.f5320y) == null) {
            return null;
        }
        return c0415i.f5146q;
    }

    @Override // n0.InterfaceC0420a
    public final void d() {
        F.d n2;
        int i3;
        this.f5127y = true;
        C0407A c0407a = this.f5124v;
        c0407a.h();
        C0415I c0415i = this.f5110H;
        boolean z3 = c0415i.f5134d;
        C0444z c0444z = c0415i.f5131a;
        if (z3 && (i3 = (n2 = c0444z.n()).f1160f) > 0) {
            Object[] objArr = n2.f1158d;
            int i4 = 0;
            do {
                C0444z c0444z2 = (C0444z) objArr[i4];
                C0415I c0415i2 = c0444z2.f5320y;
                if (c0415i2.f5133c && c0415i2.f5146q.f5116n == 1 && C0444z.B(c0444z2)) {
                    C0444z.F(c0444z, false, 7);
                }
                i4++;
            } while (i4 < i3);
        }
        if (c0415i.f5135e || (!A().f5164j && c0415i.f5134d)) {
            c0415i.f5134d = false;
            int i5 = c0415i.f5132b;
            c0415i.f5132b = 3;
            c0415i.e(false);
            g0 snapshotObserver = ((C0507u) AbstractC0409C.s(c0444z)).getSnapshotObserver();
            snapshotObserver.a(c0444z, snapshotObserver.f5252e, this.f5128z);
            c0415i.f5132b = i5;
            if (A().f5164j && c0415i.f5140k) {
                requestLayout();
            }
            c0415i.f5135e = false;
        }
        if (c0407a.f5070b && c0407a.e()) {
            c0407a.g();
        }
        this.f5127y = false;
    }

    @Override // n0.InterfaceC0420a
    public final boolean g() {
        return this.f5122t;
    }

    @Override // l0.o, l0.InterfaceC0360j
    public final Object o() {
        return this.f5121s;
    }

    @Override // n0.InterfaceC0420a
    public final void requestLayout() {
        this.f5110H.f5131a.E(false);
    }

    @Override // n0.InterfaceC0420a
    public final C0407A y() {
        return this.f5124v;
    }

    @Override // n0.Q
    public final void z() {
        this.f5110H.a().getClass();
    }
}
