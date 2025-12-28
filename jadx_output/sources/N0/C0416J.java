package n0;

import c2.C0174m;
import o0.C0507u;

/* renamed from: n0.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0416J extends p2.h implements o2.c {

    /* renamed from: f, reason: collision with root package name */
    public static final C0416J f5150f = new C0416J(1, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final C0416J f5151g = new C0416J(1, 1);
    public static final C0416J h = new C0416J(1, 2);

    /* renamed from: i, reason: collision with root package name */
    public static final C0416J f5152i = new C0416J(1, 3);

    /* renamed from: j, reason: collision with root package name */
    public static final C0416J f5153j = new C0416J(1, 4);

    /* renamed from: k, reason: collision with root package name */
    public static final C0416J f5154k = new C0416J(1, 5);

    /* renamed from: l, reason: collision with root package name */
    public static final C0416J f5155l = new C0416J(1, 6);

    /* renamed from: m, reason: collision with root package name */
    public static final C0416J f5156m = new C0416J(1, 7);

    /* renamed from: n, reason: collision with root package name */
    public static final C0416J f5157n = new C0416J(1, 8);

    /* renamed from: o, reason: collision with root package name */
    public static final C0416J f5158o = new C0416J(1, 9);

    /* renamed from: p, reason: collision with root package name */
    public static final C0416J f5159p = new C0416J(1, 10);

    /* renamed from: q, reason: collision with root package name */
    public static final C0416J f5160q = new C0416J(1, 11);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5161e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0416J(int i3, int i4) {
        super(i3);
        this.f5161e = i4;
    }

    @Override // o2.c
    public final Object i(Object obj) {
        switch (this.f5161e) {
            case 0:
                i0 i0Var = (i0) obj;
                if (i0Var.w()) {
                    i0Var.f5258e.N(i0Var);
                }
                break;
            case 1:
                d0 d0Var = ((Y) obj).f5216F;
                if (d0Var != null) {
                    d0Var.invalidate();
                }
                break;
            case 2:
                Y y3 = (Y) obj;
                if (y3.w()) {
                    C0436q c0436q = y3.f5212B;
                    if (c0436q == null) {
                        y3.K0(true);
                    } else {
                        C0436q c0436q2 = Y.f5208H;
                        c0436q2.getClass();
                        c0436q2.f5277a = c0436q.f5277a;
                        c0436q2.f5278b = c0436q.f5278b;
                        c0436q2.f5279c = c0436q.f5279c;
                        c0436q2.f5280d = c0436q.f5280d;
                        c0436q2.f5281e = c0436q.f5281e;
                        c0436q2.f5282f = c0436q.f5282f;
                        c0436q2.f5283g = c0436q.f5283g;
                        c0436q2.h = c0436q.h;
                        c0436q2.f5284i = c0436q.f5284i;
                        y3.K0(true);
                        if (c0436q2.f5277a != c0436q.f5277a || c0436q2.f5278b != c0436q.f5278b || c0436q2.f5279c != c0436q.f5279c || c0436q2.f5280d != c0436q.f5280d || c0436q2.f5281e != c0436q.f5281e || c0436q2.f5282f != c0436q.f5282f || c0436q2.f5283g != c0436q.f5283g || c0436q2.h != c0436q.h || c0436q2.f5284i != c0436q.f5284i) {
                            C0444z c0444z = y3.f5217n;
                            C0415I c0415i = c0444z.f5320y;
                            if (c0415i.f5142m > 0) {
                                if (c0415i.f5141l || c0415i.f5140k) {
                                    c0444z.E(false);
                                }
                                c0415i.f5146q.Q();
                            }
                            C0507u c0507u = c0444z.f5307l;
                            if (c0507u != null) {
                                ((F.d) c0507u.f5677J.f5181e.f316e).b(c0444z);
                                c0444z.f5296D = true;
                                c0507u.C(null);
                            }
                        }
                    }
                }
                break;
            case 3:
                b0 b0Var = (b0) obj;
                if (b0Var.w()) {
                    b0Var.f5232d.Q();
                }
                break;
            case 4:
                p2.g.c(obj, "null cannot be cast to non-null type androidx.compose.ui.node.OwnerScope");
                break;
            case 5:
                C0444z c0444z2 = (C0444z) obj;
                if (c0444z2.u()) {
                    c0444z2.E(false);
                }
                break;
            case 6:
                C0444z c0444z3 = (C0444z) obj;
                if (c0444z3.u()) {
                    c0444z3.E(false);
                }
                break;
            case 7:
                C0444z c0444z4 = (C0444z) obj;
                if (c0444z4.u()) {
                    c0444z4.C(false);
                }
                break;
            case 8:
                C0444z c0444z5 = (C0444z) obj;
                if (c0444z5.u()) {
                    c0444z5.C(false);
                }
                break;
            case 9:
                C0444z c0444z6 = (C0444z) obj;
                if (c0444z6.u()) {
                    C0444z.D(c0444z6, false, 7);
                }
                break;
            case 10:
                C0444z c0444z7 = (C0444z) obj;
                if (c0444z7.u()) {
                    C0444z.F(c0444z7, false, 7);
                }
                break;
            default:
                C0444z c0444z8 = (C0444z) obj;
                if (c0444z8.u()) {
                    c0444z8.s();
                }
                break;
        }
        return C0174m.f3840a;
    }
}
