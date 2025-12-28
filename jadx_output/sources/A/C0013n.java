package A;

import D.C0032d;
import D.C0052n;
import c2.C0174m;

/* renamed from: A.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0013n extends p2.h implements o2.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ P.l f116e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ W.H f117f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0011l f118g;
    public final /* synthetic */ C0012m h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ L.a f119i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f120j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0013n(P.l lVar, W.H h, C0011l c0011l, C0012m c0012m, L.a aVar, int i3) {
        super(2);
        this.f116e = lVar;
        this.f117f = h;
        this.f118g = c0011l;
        this.h = c0012m;
        this.f119i = aVar;
        this.f120j = i3;
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int J2 = C0032d.J(this.f120j | 1);
        L.a aVar = this.f119i;
        C0011l c0011l = this.f118g;
        C0012m c0012m = this.h;
        C.b(this.f116e, this.f117f, c0011l, c0012m, aVar, (C0052n) obj, J2);
        return C0174m.f3840a;
    }
}
