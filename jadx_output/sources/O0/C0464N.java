package o0;

import D.C0052n;
import c2.C0174m;

/* renamed from: o0.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0464N extends p2.h implements o2.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0507u f5478e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ X f5479f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ L.a f5480g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0464N(C0507u c0507u, X x3, L.a aVar) {
        super(2);
        this.f5478e = c0507u;
        this.f5479f = x3;
        this.f5480g = aVar;
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        C0052n c0052n = (C0052n) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0052n.y()) {
            c0052n.K();
        } else {
            AbstractC0479f0.a(this.f5478e, this.f5479f, this.f5480g, c0052n, 0);
        }
        return C0174m.f3840a;
    }
}
