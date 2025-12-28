package X;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2633a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f2634b;

    public /* synthetic */ n(r rVar, int i3) {
        this.f2633a = i3;
        this.f2634b = rVar;
    }

    @Override // X.j
    public final double b(double d3) {
        switch (this.f2633a) {
            case 0:
                return Z.b.j(this.f2634b.f2648k.b(d3), r0.f2643e, r0.f2644f);
            default:
                return this.f2634b.f2651n.b(Z.b.j(d3, r0.f2643e, r0.f2644f));
        }
    }
}
