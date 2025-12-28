package p;

import c2.C0174m;

/* renamed from: p.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0525D extends p2.h implements o2.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p2.o f5829e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5830f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0527F f5831g;
    public final /* synthetic */ n h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0540i f5832i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f5833j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0532a f5834k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0525D(p2.o oVar, Object obj, C0527F c0527f, n nVar, C0540i c0540i, float f3, C0532a c0532a) {
        super(1);
        this.f5829e = oVar;
        this.f5830f = obj;
        this.f5831g = c0527f;
        this.h = nVar;
        this.f5832i = c0540i;
        this.f5833j = f3;
        this.f5834k = c0532a;
    }

    @Override // o2.c
    public final Object i(Object obj) {
        long longValue = ((Number) obj).longValue();
        C0527F c0527f = this.f5831g;
        B2.i iVar = c0527f.f5840b;
        Comparable comparable = c0527f.f5841c;
        C0524C c0524c = new C0524C(this.f5832i, 0);
        C0538g c0538g = new C0538g(this.f5830f, this.h, longValue, comparable, longValue, c0524c);
        AbstractC0536e.e(c0538g, longValue, this.f5833j, this.f5831g, this.f5832i, this.f5834k);
        this.f5829e.f5960d = c0538g;
        return C0174m.f3840a;
    }
}
