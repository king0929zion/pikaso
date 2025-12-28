package X;

/* loaded from: classes.dex */
public final class q extends p2.h implements o2.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2639e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r f2640f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(r rVar, int i3) {
        super(1);
        this.f2639e = i3;
        this.f2640f = rVar;
    }

    @Override // o2.c
    public final Object i(Object obj) {
        switch (this.f2639e) {
            case 0:
                double doubleValue = ((Number) obj).doubleValue();
                return Double.valueOf(this.f2640f.f2651n.b(Z.b.j(doubleValue, r10.f2643e, r10.f2644f)));
            default:
                return Double.valueOf(Z.b.j(this.f2640f.f2648k.b(((Number) obj).doubleValue()), r10.f2643e, r10.f2644f));
        }
    }
}
