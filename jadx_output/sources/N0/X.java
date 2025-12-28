package n0;

import c2.C0174m;

/* loaded from: classes.dex */
public final class X extends p2.h implements o2.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5199e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Y f5200f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ P.k f5201g;
    public final /* synthetic */ V h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f5202i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0433n f5203j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f5204k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f5205l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f5206m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ X(Y y3, P.k kVar, V v3, long j3, C0433n c0433n, boolean z3, boolean z4, float f3, int i3) {
        super(0);
        this.f5199e = i3;
        this.f5200f = y3;
        this.f5201g = kVar;
        this.h = v3;
        this.f5202i = j3;
        this.f5203j = c0433n;
        this.f5204k = z3;
        this.f5205l = z4;
        this.f5206m = f3;
    }

    @Override // o2.a
    public final Object c() {
        switch (this.f5199e) {
            case 0:
                P.k d3 = AbstractC0409C.d(this.f5201g, this.h.a());
                boolean z3 = this.f5205l;
                Y y3 = this.f5200f;
                V v3 = this.h;
                long j3 = this.f5202i;
                C0433n c0433n = this.f5203j;
                boolean z4 = this.f5204k;
                if (d3 == null) {
                    y3.v0(v3, j3, c0433n, z4, z3);
                } else {
                    y3.getClass();
                    float f3 = this.f5206m;
                    c0433n.b(d3, f3, z3, new X(y3, d3, v3, j3, c0433n, z4, z3, f3, 0));
                }
                break;
            default:
                this.f5200f.H0(AbstractC0409C.d(this.f5201g, this.h.a()), this.h, this.f5202i, this.f5203j, this.f5204k, this.f5205l, this.f5206m);
                break;
        }
        return C0174m.f3840a;
    }
}
