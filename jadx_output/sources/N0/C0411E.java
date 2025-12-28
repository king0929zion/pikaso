package n0;

import c2.C0174m;
import o0.C0507u;

/* renamed from: n0.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0411E extends p2.h implements o2.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0415I f5082e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e0 f5083f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f5084g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0411E(C0415I c0415i, e0 e0Var, long j3) {
        super(0);
        this.f5082e = c0415i;
        this.f5083f = e0Var;
        this.f5084g = j3;
    }

    @Override // o2.a
    public final Object c() {
        AbstractC0419M o02;
        C0415I c0415i = this.f5082e;
        l0.n nVar = null;
        if (AbstractC0409C.n(c0415i.f5131a)) {
            Y y3 = c0415i.a().f5219p;
            if (y3 != null) {
                nVar = y3.f5165k;
            }
        } else {
            Y y4 = c0415i.a().f5219p;
            if (y4 != null && (o02 = y4.o0()) != null) {
                nVar = o02.f5165k;
            }
        }
        if (nVar == null) {
            nVar = ((C0507u) this.f5083f).getPlacementScope();
        }
        AbstractC0419M o03 = c0415i.a().o0();
        p2.g.b(o03);
        l0.n.e(nVar, o03, this.f5084g);
        return C0174m.f3840a;
    }
}
