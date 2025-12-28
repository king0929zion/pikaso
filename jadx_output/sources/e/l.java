package E;

import D.C0030c;
import D.C0032d;
import D.C0053n0;
import D.C0059s;
import D.D0;
import D.x0;
import a.AbstractC0090a;
import java.util.ArrayList;
import n0.C0415I;
import n0.C0444z;
import o0.C0507u;

/* loaded from: classes.dex */
public final class l extends y {

    /* renamed from: e, reason: collision with root package name */
    public static final l f1125e;

    /* renamed from: g, reason: collision with root package name */
    public static final l f1127g;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1128c;

    /* renamed from: d, reason: collision with root package name */
    public static final l f1124d = new l(1, 2, 0);

    /* renamed from: f, reason: collision with root package name */
    public static final l f1126f = new l(1, 2, 2);

    static {
        int i3 = 1;
        f1125e = new l(i3, i3, 1);
        int i4 = 1;
        f1127g = new l(i4, i4, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i3, int i4, int i5) {
        super(i3, i4);
        this.f1128c = i5;
    }

    @Override // E.y
    public final void a(z zVar, B0.a aVar, D0 d02, C0059s c0059s) {
        int i3;
        int i4;
        switch (this.f1128c) {
            case 0:
                Object c3 = ((o2.a) zVar.b(0)).c();
                C0030c c0030c = (C0030c) zVar.b(1);
                zVar.a(0);
                p2.g.c(aVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
                c0030c.getClass();
                d02.K(d02.c(c0030c), c3);
                aVar.getClass();
                aVar.g(c3);
                return;
            case 1:
                C0030c c0030c2 = (C0030c) zVar.b(0);
                int a3 = zVar.a(0);
                aVar.M();
                c0030c2.getClass();
                int p3 = d02.p(d02.c(c0030c2));
                Object obj = C0032d.j(d02.f666b, p3) ? d02.f667c[d02.g(d02.f(d02.f666b, p3))] : null;
                aVar.getClass();
                C0444z c0444z = (C0444z) obj;
                C0444z c0444z2 = (C0444z) aVar.f273d;
                c0444z2.getClass();
                if (!(c0444z.f5306k == null)) {
                    StringBuilder sb = new StringBuilder("Cannot insert ");
                    sb.append(c0444z);
                    sb.append(" because it already has a parent. This tree: ");
                    sb.append(c0444z2.e(0));
                    sb.append(" Other tree: ");
                    C0444z c0444z3 = c0444z.f5306k;
                    sb.append(c0444z3 != null ? c0444z3.e(0) : null);
                    Z0.d.S(sb.toString());
                    throw null;
                }
                if (c0444z.f5307l != null) {
                    Z0.d.S("Cannot insert " + c0444z + " because it already has an owner. This tree: " + c0444z2.e(0) + " Other tree: " + c0444z.e(0));
                    throw null;
                }
                c0444z.f5306k = c0444z2;
                B2.i iVar = c0444z2.h;
                ((F.d) iVar.f316e).a(a3, c0444z);
                ((A0.c) iVar.f317f).c();
                c0444z2.A();
                if (c0444z.f5300d) {
                    c0444z2.f5303g++;
                }
                c0444z2.t();
                C0507u c0507u = c0444z2.f5307l;
                if (c0507u != null) {
                    c0444z.b(c0507u);
                }
                if (c0444z.f5320y.f5142m > 0) {
                    C0415I c0415i = c0444z2.f5320y;
                    c0415i.b(c0415i.f5142m + 1);
                    return;
                }
                return;
            case 2:
                Object b3 = zVar.b(0);
                C0030c c0030c3 = (C0030c) zVar.b(1);
                int a4 = zVar.a(0);
                if (b3 instanceof x0) {
                    ((ArrayList) c0059s.f854c).add(((x0) b3).f928a);
                }
                int c4 = d02.c(c0030c3);
                int g3 = d02.g(d02.D(c4, a4));
                Object[] objArr = d02.f667c;
                Object obj2 = objArr[g3];
                objArr[g3] = b3;
                if (!(obj2 instanceof x0)) {
                    if (obj2 instanceof C0053n0) {
                        ((C0053n0) obj2).d();
                        return;
                    }
                    return;
                }
                int o3 = d02.o() - d02.D(c4, a4);
                x0 x0Var = (x0) obj2;
                C0030c c0030c4 = x0Var.f929b;
                if (c0030c4 == null || !c0030c4.a()) {
                    i3 = -1;
                    i4 = -1;
                } else {
                    i3 = d02.c(c0030c4);
                    i4 = d02.o() - d02.f(d02.f666b, d02.p(d02.q(i3) + i3));
                }
                c0059s.h(x0Var.f928a, o3, i3, i4);
                return;
            default:
                Object b4 = zVar.b(0);
                int a5 = zVar.a(0);
                if (b4 instanceof x0) {
                    ((ArrayList) c0059s.f854c).add(((x0) b4).f928a);
                }
                int g4 = d02.g(d02.D(d02.f682s, a5));
                Object[] objArr2 = d02.f667c;
                Object obj3 = objArr2[g4];
                objArr2[g4] = b4;
                if (obj3 instanceof x0) {
                    c0059s.h(((x0) obj3).f928a, d02.o() - d02.D(d02.f682s, a5), -1, -1);
                    return;
                } else {
                    if (obj3 instanceof C0053n0) {
                        ((C0053n0) obj3).d();
                        return;
                    }
                    return;
                }
        }
    }

    @Override // E.y
    public final String b(int i3) {
        switch (this.f1128c) {
            case 0:
                if (!r2.a.t(i3, 0)) {
                    break;
                }
                break;
            case 1:
                if (!r2.a.t(i3, 0)) {
                    break;
                }
                break;
            case 2:
                if (!r2.a.t(i3, 0)) {
                    break;
                }
                break;
            default:
                if (!r2.a.t(i3, 0)) {
                    break;
                }
                break;
        }
        return super.b(i3);
    }

    @Override // E.y
    public final String c(int i3) {
        switch (this.f1128c) {
            case 0:
                if (!AbstractC0090a.w(i3, 0)) {
                    if (!AbstractC0090a.w(i3, 1)) {
                        break;
                    }
                }
                break;
            case 1:
                if (!AbstractC0090a.w(i3, 0)) {
                    break;
                }
                break;
            case 2:
                if (!AbstractC0090a.w(i3, 0)) {
                    if (!AbstractC0090a.w(i3, 1)) {
                        break;
                    }
                }
                break;
            default:
                if (!AbstractC0090a.w(i3, 0)) {
                    break;
                }
                break;
        }
        return super.c(i3);
    }
}
