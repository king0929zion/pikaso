package A;

import D.C0032d;
import D.C0052n;
import c2.C0174m;
import n0.e0;
import o0.AbstractC0479f0;
import o0.X;

/* loaded from: classes.dex */
public final class x extends p2.h implements o2.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f184e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f185f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f186g;
    public final /* synthetic */ Object h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f187i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(C0014o c0014o, G g3, P p3, int i3) {
        super(2);
        L.a aVar = G1.c.f1270a;
        this.f186g = c0014o;
        this.h = g3;
        this.f187i = p3;
        this.f185f = i3;
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        C0174m c0174m = C0174m.f3840a;
        Object obj3 = this.f187i;
        Object obj4 = this.h;
        Object obj5 = this.f186g;
        int i3 = this.f185f;
        int i4 = this.f184e;
        C0052n c0052n = (C0052n) obj;
        ((Number) obj2).intValue();
        switch (i4) {
            case 0:
                int J2 = C0032d.J(i3 | 1);
                L.a aVar = G1.c.f1270a;
                y.a((C0014o) obj5, (G) obj4, (P) obj3, c0052n, J2);
                break;
            default:
                AbstractC0479f0.a((e0) obj5, (X) obj4, (L.a) obj3, c0052n, C0032d.J(i3 | 1));
                break;
        }
        return c0174m;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(e0 e0Var, X x3, L.a aVar, int i3) {
        super(2);
        this.f186g = e0Var;
        this.h = x3;
        this.f187i = aVar;
        this.f185f = i3;
    }
}
