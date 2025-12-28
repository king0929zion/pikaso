package n0;

import A.AbstractC0000a;
import D.C0054o;
import D.C0059s;
import D.C0062v;
import D.C0065y;
import D.InterfaceC0063w;
import D.q0;
import android.os.Trace;
import java.util.List;
import l0.InterfaceC0361k;
import o0.AbstractC0461K;
import o0.C0507u;
import o0.F0;
import p.AbstractC0537f;

/* renamed from: n0.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0444z implements f0, InterfaceC0425f {

    /* renamed from: H, reason: collision with root package name */
    public static final C0441w f5290H = new C0441w();

    /* renamed from: I, reason: collision with root package name */
    public static final C0440v f5291I = new C0440v();

    /* renamed from: J, reason: collision with root package name */
    public static final C0054o f5292J = new C0054o(2);

    /* renamed from: A, reason: collision with root package name */
    public boolean f5293A;

    /* renamed from: B, reason: collision with root package name */
    public P.l f5294B;

    /* renamed from: C, reason: collision with root package name */
    public P.l f5295C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f5296D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f5297E;

    /* renamed from: F, reason: collision with root package name */
    public int f5298F;

    /* renamed from: G, reason: collision with root package name */
    public int f5299G;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5300d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5301e;

    /* renamed from: f, reason: collision with root package name */
    public C0444z f5302f;

    /* renamed from: g, reason: collision with root package name */
    public int f5303g;
    public final B2.i h;

    /* renamed from: i, reason: collision with root package name */
    public F.d f5304i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f5305j;

    /* renamed from: k, reason: collision with root package name */
    public C0444z f5306k;

    /* renamed from: l, reason: collision with root package name */
    public C0507u f5307l;

    /* renamed from: m, reason: collision with root package name */
    public int f5308m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f5309n;

    /* renamed from: o, reason: collision with root package name */
    public t0.g f5310o;

    /* renamed from: p, reason: collision with root package name */
    public final F.d f5311p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f5312q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC0361k f5313r;

    /* renamed from: s, reason: collision with root package name */
    public G0.b f5314s;

    /* renamed from: t, reason: collision with root package name */
    public G0.f f5315t;

    /* renamed from: u, reason: collision with root package name */
    public F0 f5316u;

    /* renamed from: v, reason: collision with root package name */
    public InterfaceC0063w f5317v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f5318w;

    /* renamed from: x, reason: collision with root package name */
    public final C0059s f5319x;

    /* renamed from: y, reason: collision with root package name */
    public final C0415I f5320y;

    /* renamed from: z, reason: collision with root package name */
    public Y f5321z;

    public C0444z(int i3, int i4, boolean z3) {
        this(t0.h.f6233a.addAndGet(1), (i3 & 1) != 0 ? false : z3);
    }

    public static boolean B(C0444z c0444z) {
        C0413G c0413g = c0444z.f5320y.f5146q;
        G0.a aVar = c0413g.f5114l ? new G0.a(c0413g.f4930g) : null;
        if (aVar == null) {
            c0444z.getClass();
            return false;
        }
        if (c0444z.f5298F == 3) {
            c0444z.c();
        }
        return c0444z.f5320y.f5146q.V(aVar.f1251a);
    }

    public static void D(C0444z c0444z, boolean z3, int i3) {
        C0444z k3;
        if ((i3 & 1) != 0) {
            z3 = false;
        }
        boolean z4 = (i3 & 4) != 0;
        if (c0444z.f5302f == null) {
            Z0.d.S("Lookahead measure cannot be requested on a node that is not a part of theLookaheadScope");
            throw null;
        }
        C0507u c0507u = c0444z.f5307l;
        if (c0507u == null || c0444z.f5309n || c0444z.f5300d) {
            return;
        }
        c0507u.x(c0444z, true, z3, true);
        if (z4) {
            C0412F c0412f = c0444z.f5320y.f5147r;
            p2.g.b(c0412f);
            C0415I c0415i = c0412f.f5102z;
            C0444z k4 = c0415i.f5131a.k();
            int i4 = c0415i.f5131a.f5298F;
            if (k4 == null || i4 == 3) {
                return;
            }
            while (k4.f5298F == i4 && (k3 = k4.k()) != null) {
                k4 = k3;
            }
            int b3 = AbstractC0537f.b(i4);
            if (b3 == 0) {
                if (k4.f5302f != null) {
                    D(k4, z3, 6);
                    return;
                } else {
                    F(k4, z3, 6);
                    return;
                }
            }
            if (b3 != 1) {
                throw new IllegalStateException("Intrinsics isn't used by the parent");
            }
            if (k4.f5302f != null) {
                k4.C(z3);
            } else {
                k4.E(z3);
            }
        }
    }

    public static void F(C0444z c0444z, boolean z3, int i3) {
        C0507u c0507u;
        C0444z k3;
        if ((i3 & 1) != 0) {
            z3 = false;
        }
        boolean z4 = (i3 & 4) != 0;
        if (c0444z.f5309n || c0444z.f5300d || (c0507u = c0444z.f5307l) == null) {
            return;
        }
        c0507u.x(c0444z, false, z3, true);
        if (z4) {
            C0415I c0415i = c0444z.f5320y.f5146q.f5110H;
            C0444z k4 = c0415i.f5131a.k();
            int i4 = c0415i.f5131a.f5298F;
            if (k4 == null || i4 == 3) {
                return;
            }
            while (k4.f5298F == i4 && (k3 = k4.k()) != null) {
                k4 = k3;
            }
            int b3 = AbstractC0537f.b(i4);
            if (b3 == 0) {
                F(k4, z3, 6);
            } else {
                if (b3 != 1) {
                    throw new IllegalStateException("Intrinsics isn't used by the parent");
                }
                k4.E(z3);
            }
        }
    }

    public static void G(C0444z c0444z) {
        int i3 = AbstractC0443y.f5289a[AbstractC0537f.b(c0444z.f5320y.f5132b)];
        C0415I c0415i = c0444z.f5320y;
        if (i3 != 1) {
            throw new IllegalStateException("Unexpected state ".concat(AbstractC0000a.n(c0415i.f5132b)));
        }
        if (c0415i.f5136f) {
            D(c0444z, true, 6);
            return;
        }
        if (c0415i.f5137g) {
            c0444z.C(true);
        }
        if (c0415i.f5133c) {
            F(c0444z, true, 6);
        } else if (c0415i.f5134d) {
            c0444z.E(true);
        }
    }

    public final void A() {
        if (!this.f5300d) {
            this.f5312q = true;
            return;
        }
        C0444z k3 = k();
        if (k3 != null) {
            k3.A();
        }
    }

    public final void C(boolean z3) {
        C0507u c0507u;
        if (this.f5300d || (c0507u = this.f5307l) == null) {
            return;
        }
        c0507u.y(this, true, z3);
    }

    public final void E(boolean z3) {
        C0507u c0507u;
        if (this.f5300d || (c0507u = this.f5307l) == null) {
            return;
        }
        c0507u.y(this, false, z3);
    }

    public final void H() {
        F.d n2 = n();
        int i3 = n2.f1160f;
        if (i3 > 0) {
            Object[] objArr = n2.f1158d;
            int i4 = 0;
            do {
                C0444z c0444z = (C0444z) objArr[i4];
                int i5 = c0444z.f5299G;
                c0444z.f5298F = i5;
                if (i5 != 3) {
                    c0444z.H();
                }
                i4++;
            } while (i4 < i3);
        }
    }

    public final void I(G0.b bVar) {
        if (p2.g.a(this.f5314s, bVar)) {
            return;
        }
        this.f5314s = bVar;
        r();
        C0444z k3 = k();
        if (k3 != null) {
            k3.p();
        }
        q();
        for (P.k kVar = (P.k) this.f5319x.f857f; kVar != null; kVar = kVar.f2092i) {
            if ((kVar.f2090f & 16) != 0) {
                ((j0) kVar).c();
            } else if (kVar instanceof T.a) {
                ((T.a) kVar).f0();
            }
        }
    }

    public final void J(C0444z c0444z) {
        if (p2.g.a(c0444z, this.f5302f)) {
            return;
        }
        this.f5302f = c0444z;
        if (c0444z != null) {
            C0415I c0415i = this.f5320y;
            if (c0415i.f5147r == null) {
                c0415i.f5147r = new C0412F(c0415i);
            }
            C0059s c0059s = this.f5319x;
            Y y3 = ((C0435p) c0059s.f854c).f5218o;
            for (Y y4 = (Y) c0059s.f855d; !p2.g.a(y4, y3) && y4 != null; y4 = y4.f5218o) {
                y4.l0();
            }
        }
        r();
    }

    public final void K(P.l lVar) {
        if (!(!this.f5300d || this.f5294B == P.i.f2087a)) {
            Z0.d.R("Modifiers are not supported on virtual LayoutNodes");
            throw null;
        }
        if (this.f5297E) {
            Z0.d.R("modifier is updated when deactivated");
            throw null;
        }
        if (u()) {
            a(lVar);
        } else {
            this.f5295C = lVar;
        }
    }

    public final void L() {
        if (this.f5303g <= 0 || !this.f5305j) {
            return;
        }
        int i3 = 0;
        this.f5305j = false;
        F.d dVar = this.f5304i;
        if (dVar == null) {
            dVar = new F.d(new C0444z[16]);
            this.f5304i = dVar;
        }
        dVar.g();
        F.d dVar2 = (F.d) this.h.f316e;
        int i4 = dVar2.f1160f;
        if (i4 > 0) {
            Object[] objArr = dVar2.f1158d;
            do {
                C0444z c0444z = (C0444z) objArr[i3];
                if (c0444z.f5300d) {
                    dVar.c(dVar.f1160f, c0444z.n());
                } else {
                    dVar.b(c0444z);
                }
                i3++;
            } while (i3 < i4);
        }
        C0415I c0415i = this.f5320y;
        c0415i.f5146q.f5126x = true;
        C0412F c0412f = c0415i.f5147r;
        if (c0412f != null) {
            c0412f.f5097u = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [P.k] */
    public final void a(P.l lVar) {
        boolean z3;
        this.f5294B = lVar;
        C0059s c0059s = this.f5319x;
        P.k kVar = (P.k) c0059s.f857f;
        P.k kVar2 = U.f5191a;
        if (kVar == kVar2) {
            Z0.d.S("padChain called on already padded chain");
            throw null;
        }
        kVar.h = kVar2;
        kVar2.f2092i = kVar;
        F.d dVar = (F.d) c0059s.f858g;
        int i3 = dVar != null ? dVar.f1160f : 0;
        F.d dVar2 = (F.d) c0059s.h;
        if (dVar2 == null) {
            dVar2 = new F.d(new P.j[16]);
        }
        F.d dVar3 = dVar2;
        int i4 = dVar3.f1160f;
        if (i4 < 16) {
            i4 = 16;
        }
        F.d dVar4 = new F.d(new P.l[i4]);
        dVar4.b(lVar);
        C0065y c0065y = null;
        while (dVar4.k()) {
            P.l lVar2 = (P.l) dVar4.m(dVar4.f1160f - 1);
            if (lVar2 instanceof P.f) {
                P.f fVar = (P.f) lVar2;
                dVar4.b(fVar.f2084b);
                dVar4.b(fVar.f2083a);
            } else if (lVar2 instanceof P.j) {
                dVar3.b(lVar2);
            } else {
                if (c0065y == null) {
                    c0065y = new C0065y(15, dVar3);
                }
                lVar2.a(c0065y);
                c0065y = c0065y;
            }
        }
        int i5 = dVar3.f1160f;
        m0 m0Var = (m0) c0059s.f856e;
        C0444z c0444z = (C0444z) c0059s.f853b;
        if (i5 == i3) {
            P.k kVar3 = kVar2.f2092i;
            int i6 = 0;
            while (true) {
                if (kVar3 == null || i6 >= i3) {
                    break;
                }
                if (dVar == null) {
                    Z0.d.T("expected prior modifier list to be non-empty");
                    throw null;
                }
                P.j jVar = (P.j) dVar.f1158d[i6];
                P.j jVar2 = (P.j) dVar3.f1158d[i6];
                char c3 = p2.g.a(jVar, jVar2) ? (char) 2 : jVar.getClass() == jVar2.getClass() ? (char) 1 : (char) 0;
                if (c3 == 0) {
                    kVar3 = kVar3.h;
                    break;
                }
                if (c3 == 1) {
                    C0059s.k(jVar, jVar2, kVar3);
                }
                kVar3 = kVar3.f2092i;
                i6++;
            }
            P.k kVar4 = kVar3;
            if (i6 < i3) {
                if (dVar == null) {
                    Z0.d.T("expected prior modifier list to be non-empty");
                    throw null;
                }
                if (kVar4 == null) {
                    Z0.d.T("structuralUpdate requires a non-null tail");
                    throw null;
                }
                c0059s.i(i6, dVar, dVar3, kVar4, !(c0444z.f5295C != null));
                z3 = true;
            }
            z3 = false;
        } else {
            P.l lVar3 = c0444z.f5295C;
            if (lVar3 != null && i3 == 0) {
                for (int i7 = 0; i7 < dVar3.f1160f; i7++) {
                    kVar2 = C0059s.b((P.j) dVar3.f1158d[i7], kVar2);
                }
                int i8 = 0;
                for (P.k kVar5 = m0Var.h; kVar5 != null && kVar5 != U.f5191a; kVar5 = kVar5.h) {
                    i8 |= kVar5.f2090f;
                    kVar5.f2091g = i8;
                }
            } else if (i5 != 0) {
                if (dVar == null) {
                    dVar = new F.d(new P.j[16]);
                }
                c0059s.i(0, dVar, dVar3, kVar2, !(lVar3 != null));
            } else {
                if (dVar == null) {
                    Z0.d.T("expected prior modifier list to be non-empty");
                    throw null;
                }
                P.k kVar6 = kVar2.f2092i;
                for (int i9 = 0; kVar6 != null && i9 < dVar.f1160f; i9++) {
                    kVar6 = C0059s.c(kVar6).f2092i;
                }
                C0444z k3 = c0444z.k();
                C0435p c0435p = k3 != null ? (C0435p) k3.f5319x.f854c : null;
                C0435p c0435p2 = (C0435p) c0059s.f854c;
                c0435p2.f5219p = c0435p;
                c0059s.f855d = c0435p2;
                z3 = false;
            }
            z3 = true;
        }
        c0059s.f858g = dVar3;
        if (dVar != null) {
            dVar.g();
        } else {
            dVar = null;
        }
        c0059s.h = dVar;
        T t3 = U.f5191a;
        ?? r3 = t3.f2092i;
        if (r3 != 0) {
            m0Var = r3;
        }
        m0Var.h = null;
        t3.f2092i = null;
        t3.f2091g = -1;
        t3.f2094k = null;
        if (m0Var == t3) {
            Z0.d.S("trimChain did not update the head");
            throw null;
        }
        c0059s.f857f = m0Var;
        if (z3) {
            c0059s.j();
        }
        this.f5320y.h();
        if (this.f5302f == null && c0059s.f(512)) {
            J(this);
        }
    }

    public final void b(C0507u c0507u) {
        C0444z c0444z;
        if (!(this.f5307l == null)) {
            Z0.d.S("Cannot attach " + this + " as it already is attached.  Tree: " + e(0));
            throw null;
        }
        C0444z c0444z2 = this.f5306k;
        if (c0444z2 != null && !p2.g.a(c0444z2.f5307l, c0507u)) {
            StringBuilder sb = new StringBuilder("Attaching to a different owner(");
            sb.append(c0507u);
            sb.append(") than the parent's owner(");
            C0444z k3 = k();
            sb.append(k3 != null ? k3.f5307l : null);
            sb.append("). This tree: ");
            sb.append(e(0));
            sb.append(" Parent tree: ");
            C0444z c0444z3 = this.f5306k;
            sb.append(c0444z3 != null ? c0444z3.e(0) : null);
            Z0.d.S(sb.toString());
            throw null;
        }
        C0444z k4 = k();
        C0415I c0415i = this.f5320y;
        if (k4 == null) {
            c0415i.f5146q.f5122t = true;
            C0412F c0412f = c0415i.f5147r;
            if (c0412f != null) {
                c0412f.f5094r = true;
            }
        }
        C0059s c0059s = this.f5319x;
        ((Y) c0059s.f855d).f5219p = k4 != null ? (C0435p) k4.f5319x.f854c : null;
        this.f5307l = c0507u;
        this.f5308m = (k4 != null ? k4.f5308m : -1) + 1;
        P.l lVar = this.f5295C;
        if (lVar != null) {
            a(lVar);
        }
        this.f5295C = null;
        if (c0059s.f(8)) {
            s();
        }
        c0507u.getClass();
        C0444z c0444z4 = this.f5306k;
        if (c0444z4 == null || (c0444z = c0444z4.f5302f) == null) {
            c0444z = this.f5302f;
        }
        J(c0444z);
        if (this.f5302f == null && c0059s.f(512)) {
            J(this);
        }
        if (!this.f5297E) {
            for (P.k kVar = (P.k) c0059s.f857f; kVar != null; kVar = kVar.f2092i) {
                kVar.W();
            }
        }
        F.d dVar = (F.d) this.h.f316e;
        int i3 = dVar.f1160f;
        if (i3 > 0) {
            Object[] objArr = dVar.f1158d;
            int i4 = 0;
            do {
                ((C0444z) objArr[i4]).b(c0507u);
                i4++;
            } while (i4 < i3);
        }
        if (!this.f5297E) {
            for (P.k kVar2 = (P.k) c0059s.f857f; kVar2 != null; kVar2 = kVar2.f2092i) {
                kVar2.b0();
                if (kVar2.f2095l) {
                    Z.a(kVar2);
                }
                if (kVar2.f2096m) {
                    Z.d(kVar2);
                }
                kVar2.f2095l = false;
                kVar2.f2096m = false;
            }
        }
        r();
        if (k4 != null) {
            k4.r();
        }
        Y y3 = ((C0435p) c0059s.f854c).f5218o;
        for (Y y4 = (Y) c0059s.f855d; !p2.g.a(y4, y3) && y4 != null; y4 = y4.f5218o) {
            y4.J0(y4.f5222s, true);
            d0 d0Var = y4.f5216F;
            if (d0Var != null) {
                d0Var.invalidate();
            }
        }
        c0415i.h();
        if (this.f5297E) {
            return;
        }
        P.k kVar3 = (P.k) c0059s.f857f;
        if ((kVar3.f2091g & 7168) != 0) {
            while (kVar3 != null) {
                int i5 = kVar3.f2090f;
                if (((i5 & 4096) != 0) | ((i5 & 1024) != 0) | ((i5 & 2048) != 0)) {
                    Z.a(kVar3);
                }
                kVar3 = kVar3.f2092i;
            }
        }
    }

    public final void c() {
        this.f5299G = this.f5298F;
        this.f5298F = 3;
        F.d n2 = n();
        int i3 = n2.f1160f;
        if (i3 > 0) {
            Object[] objArr = n2.f1158d;
            int i4 = 0;
            do {
                C0444z c0444z = (C0444z) objArr[i4];
                if (c0444z.f5298F != 3) {
                    c0444z.c();
                }
                i4++;
            } while (i4 < i3);
        }
    }

    public final void d() {
        this.f5299G = this.f5298F;
        this.f5298F = 3;
        F.d n2 = n();
        int i3 = n2.f1160f;
        if (i3 > 0) {
            Object[] objArr = n2.f1158d;
            int i4 = 0;
            do {
                C0444z c0444z = (C0444z) objArr[i4];
                if (c0444z.f5298F == 2) {
                    c0444z.d();
                }
                i4++;
            } while (i4 < i3);
        }
    }

    public final String e(int i3) {
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        F.d n2 = n();
        int i5 = n2.f1160f;
        if (i5 > 0) {
            Object[] objArr = n2.f1158d;
            int i6 = 0;
            do {
                sb.append(((C0444z) objArr[i6]).e(i3 + 1));
                i6++;
            } while (i6 < i5);
        }
        String sb2 = sb.toString();
        if (i3 != 0) {
            return sb2;
        }
        String substring = sb2.substring(0, sb2.length() - 1);
        p2.g.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final void f() {
        C0407A c0407a;
        C0507u c0507u = this.f5307l;
        if (c0507u == null) {
            StringBuilder sb = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            C0444z k3 = k();
            sb.append(k3 != null ? k3.e(0) : null);
            Z0.d.T(sb.toString());
            throw null;
        }
        C0444z k4 = k();
        C0415I c0415i = this.f5320y;
        if (k4 != null) {
            k4.p();
            k4.r();
            c0415i.f5146q.f5116n = 3;
            C0412F c0412f = c0415i.f5147r;
            if (c0412f != null) {
                c0412f.f5088l = 3;
            }
        }
        C0407A c0407a2 = c0415i.f5146q.f5124v;
        c0407a2.f5070b = true;
        c0407a2.f5071c = false;
        c0407a2.f5072d = false;
        c0407a2.f5073e = false;
        c0407a2.f5074f = null;
        C0412F c0412f2 = c0415i.f5147r;
        if (c0412f2 != null && (c0407a = c0412f2.f5095s) != null) {
            c0407a.f5070b = true;
            c0407a.f5071c = false;
            c0407a.f5072d = false;
            c0407a.f5073e = false;
            c0407a.f5074f = null;
        }
        C0059s c0059s = this.f5319x;
        if (c0059s.f(8)) {
            s();
        }
        P.k kVar = (m0) c0059s.f856e;
        for (P.k kVar2 = kVar; kVar2 != null; kVar2 = kVar2.h) {
            if (kVar2.f2099p) {
                kVar2.c0();
            }
        }
        this.f5309n = true;
        F.d dVar = (F.d) this.h.f316e;
        int i3 = dVar.f1160f;
        if (i3 > 0) {
            Object[] objArr = dVar.f1158d;
            int i4 = 0;
            do {
                ((C0444z) objArr[i4]).f();
                i4++;
            } while (i4 < i3);
        }
        this.f5309n = false;
        while (kVar != null) {
            if (kVar.f2099p) {
                kVar.X();
            }
            kVar = kVar.h;
        }
        O o3 = c0507u.f5677J;
        B2.i iVar = o3.f5178b;
        ((B2.i) iVar.f316e).s(this);
        ((B2.i) iVar.f317f).s(this);
        ((F.d) o3.f5181e.f316e).l(this);
        c0507u.f5669B = true;
        this.f5307l = null;
        J(null);
        this.f5308m = 0;
        C0413G c0413g = c0415i.f5146q;
        c0413g.f5113k = Integer.MAX_VALUE;
        c0413g.f5112j = Integer.MAX_VALUE;
        c0413g.f5122t = false;
        C0412F c0412f3 = c0415i.f5147r;
        if (c0412f3 != null) {
            c0412f3.f5087k = Integer.MAX_VALUE;
            c0412f3.f5086j = Integer.MAX_VALUE;
            c0412f3.f5094r = false;
        }
    }

    public final void g(W.o oVar, Z.d dVar) {
        ((Y) this.f5319x.f855d).i0(oVar, dVar);
    }

    public final List h() {
        return n().f();
    }

    public final t0.g i() {
        Trace.beginSection("collapseSemantics");
        try {
            if (this.f5319x.f(8) && this.f5310o == null) {
                p2.o oVar = new p2.o();
                oVar.f5960d = new t0.g();
                g0 snapshotObserver = ((C0507u) AbstractC0409C.s(this)).getSnapshotObserver();
                snapshotObserver.a(this, snapshotObserver.f5251d, new q0(this, 2, oVar));
                Object obj = oVar.f5960d;
                this.f5310o = (t0.g) obj;
                return (t0.g) obj;
            }
            return this.f5310o;
        } finally {
            Trace.endSection();
        }
    }

    public final int j() {
        int i3;
        C0412F c0412f = this.f5320y.f5147r;
        if (c0412f == null || (i3 = c0412f.f5088l) == 0) {
            return 3;
        }
        return i3;
    }

    public final C0444z k() {
        C0444z c0444z = this.f5306k;
        while (c0444z != null && c0444z.f5300d) {
            c0444z = c0444z.f5306k;
        }
        return c0444z;
    }

    public final int l() {
        return this.f5320y.f5146q.f5113k;
    }

    public final F.d m() {
        boolean z3 = this.f5312q;
        F.d dVar = this.f5311p;
        if (z3) {
            dVar.g();
            dVar.c(dVar.f1160f, n());
            dVar.o(f5292J);
            this.f5312q = false;
        }
        return dVar;
    }

    public final F.d n() {
        L();
        if (this.f5303g == 0) {
            return (F.d) this.h.f316e;
        }
        F.d dVar = this.f5304i;
        p2.g.b(dVar);
        return dVar;
    }

    public final void o(long j3, C0433n c0433n, boolean z3, boolean z4) {
        C0059s c0059s = this.f5319x;
        Y y3 = (Y) c0059s.f855d;
        W.F f3 = Y.f5207G;
        ((Y) c0059s.f855d).u0(Y.f5209I, y3.n0(j3, true), c0433n, z3, z4);
    }

    public final void p() {
        if (this.f5293A) {
            C0059s c0059s = this.f5319x;
            Y y3 = (C0435p) c0059s.f854c;
            Y y4 = ((Y) c0059s.f855d).f5219p;
            this.f5321z = null;
            while (true) {
                if (p2.g.a(y3, y4)) {
                    break;
                }
                if ((y3 != null ? y3.f5216F : null) != null) {
                    this.f5321z = y3;
                    break;
                }
                y3 = y3 != null ? y3.f5219p : null;
            }
        }
        Y y5 = this.f5321z;
        if (y5 != null && y5.f5216F == null) {
            Z0.d.T("layer was not set");
            throw null;
        }
        if (y5 != null) {
            y5.w0();
            return;
        }
        C0444z k3 = k();
        if (k3 != null) {
            k3.p();
        }
    }

    public final void q() {
        C0059s c0059s = this.f5319x;
        Y y3 = (Y) c0059s.f855d;
        C0435p c0435p = (C0435p) c0059s.f854c;
        while (y3 != c0435p) {
            p2.g.c(y3, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            C0439u c0439u = (C0439u) y3;
            d0 d0Var = c0439u.f5216F;
            if (d0Var != null) {
                d0Var.invalidate();
            }
            y3 = c0439u.f5218o;
        }
        d0 d0Var2 = ((C0435p) c0059s.f854c).f5216F;
        if (d0Var2 != null) {
            d0Var2.invalidate();
        }
    }

    public final void r() {
        if (this.f5302f != null) {
            D(this, false, 7);
        } else {
            F(this, false, 7);
        }
    }

    public final void s() {
        this.f5310o = null;
        ((C0507u) AbstractC0409C.s(this)).z();
    }

    public final void t() {
        C0444z c0444z;
        if (this.f5303g > 0) {
            this.f5305j = true;
        }
        if (!this.f5300d || (c0444z = this.f5306k) == null) {
            return;
        }
        c0444z.t();
    }

    public final String toString() {
        return AbstractC0461K.o(this) + " children: " + ((F.a) h()).f1152d.f1160f + " measurePolicy: " + this.f5313r;
    }

    public final boolean u() {
        return this.f5307l != null;
    }

    public final boolean v() {
        return this.f5320y.f5146q.f5122t;
    }

    @Override // n0.f0
    public final boolean w() {
        return u();
    }

    public final Boolean x() {
        C0412F c0412f = this.f5320y.f5147r;
        if (c0412f != null) {
            return Boolean.valueOf(c0412f.f5094r);
        }
        return null;
    }

    public final void y(C0444z c0444z) {
        if (c0444z.f5320y.f5142m > 0) {
            this.f5320y.b(r0.f5142m - 1);
        }
        if (this.f5307l != null) {
            c0444z.f();
        }
        c0444z.f5306k = null;
        ((Y) c0444z.f5319x.f855d).f5219p = null;
        if (c0444z.f5300d) {
            this.f5303g--;
            F.d dVar = (F.d) c0444z.h.f316e;
            int i3 = dVar.f1160f;
            if (i3 > 0) {
                Object[] objArr = dVar.f1158d;
                int i4 = 0;
                do {
                    ((Y) ((C0444z) objArr[i4]).f5319x.f855d).f5219p = null;
                    i4++;
                } while (i4 < i3);
            }
        }
        t();
        A();
    }

    public final void z() {
        this.f5297E = true;
        C0059s c0059s = this.f5319x;
        for (P.k kVar = (m0) c0059s.f856e; kVar != null; kVar = kVar.h) {
            if (kVar.f2099p) {
                kVar.a0();
            }
        }
        P.k kVar2 = (m0) c0059s.f856e;
        for (P.k kVar3 = kVar2; kVar3 != null; kVar3 = kVar3.h) {
            if (kVar3.f2099p) {
                kVar3.c0();
            }
        }
        while (kVar2 != null) {
            if (kVar2.f2099p) {
                kVar2.X();
            }
            kVar2 = kVar2.h;
        }
        if (u()) {
            s();
        }
    }

    public C0444z(int i3, boolean z3) {
        this.f5300d = z3;
        this.f5301e = i3;
        this.h = new B2.i(new F.d(new C0444z[16]), 13, new A0.c(10, this));
        this.f5311p = new F.d(new C0444z[16]);
        this.f5312q = true;
        this.f5313r = f5290H;
        this.f5314s = AbstractC0409C.f5078a;
        this.f5315t = G0.f.f1258d;
        this.f5316u = f5291I;
        InterfaceC0063w.f927b.getClass();
        this.f5317v = C0062v.f904b;
        this.f5298F = 3;
        this.f5299G = 3;
        this.f5319x = new C0059s(this);
        this.f5320y = new C0415I(this);
        this.f5293A = true;
        this.f5294B = P.i.f2087a;
    }
}
