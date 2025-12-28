package p;

import c2.C0174m;

/* renamed from: p.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0526E extends p2.h implements o2.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p2.o f5835e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f5836f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0527F f5837g;
    public final /* synthetic */ C0540i h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o2.c f5838i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0526E(p2.o oVar, float f3, C0527F c0527f, C0540i c0540i, o2.c cVar) {
        super(1);
        this.f5835e = oVar;
        this.f5836f = f3;
        this.f5837g = c0527f;
        this.h = c0540i;
        this.f5838i = cVar;
    }

    @Override // o2.c
    public final Object i(Object obj) {
        long longValue = ((Number) obj).longValue();
        Object obj2 = this.f5835e.f5960d;
        p2.g.b(obj2);
        AbstractC0536e.e((C0538g) obj2, longValue, this.f5836f, this.f5837g, this.h, this.f5838i);
        return C0174m.f3840a;
    }
}
