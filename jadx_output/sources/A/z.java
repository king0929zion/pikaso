package A;

import c2.C0174m;

/* loaded from: classes.dex */
public final class z extends p2.h implements o2.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f188e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l0.o f189f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f190g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(int i3, l0.o oVar, int i4) {
        super(1);
        this.f188e = i3;
        this.f189f = oVar;
        this.f190g = i4;
    }

    @Override // o2.c
    public final Object i(Object obj) {
        l0.n.d((l0.n) obj, this.f189f, r2.a.U((this.f188e - r0.f4927d) / 2.0f), r2.a.U((this.f190g - r0.f4928e) / 2.0f));
        return C0174m.f3840a;
    }
}
