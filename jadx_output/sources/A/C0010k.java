package A;

import D.C0032d;
import D.C0052n;
import c2.C0174m;

/* renamed from: A.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0010k extends p2.h implements o2.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ A0.c f99e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ P.l f100f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f101g;
    public final /* synthetic */ W.H h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0001b f102i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0006g f103j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ t.p f104k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ s.g f105l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f106m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0010k(A0.c cVar, P.l lVar, boolean z3, W.H h, C0001b c0001b, C0006g c0006g, t.p pVar, s.g gVar, int i3) {
        super(2);
        L.a aVar = G1.c.f1270a;
        this.f99e = cVar;
        this.f100f = lVar;
        this.f101g = z3;
        this.h = h;
        this.f102i = c0001b;
        this.f103j = c0006g;
        this.f104k = pVar;
        this.f105l = gVar;
        this.f106m = i3;
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        C0052n c0052n = (C0052n) obj;
        ((Number) obj2).intValue();
        int J2 = C0032d.J(this.f106m | 1);
        L.a aVar = G1.c.f1270a;
        C.a(this.f99e, this.f100f, this.f101g, this.h, this.f102i, this.f103j, this.f104k, this.f105l, c0052n, J2);
        return C0174m.f3840a;
    }
}
