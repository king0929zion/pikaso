package o0;

/* renamed from: o0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0500q extends p2.h implements o2.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5639e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ U.a f5640f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0500q(U.a aVar, int i3) {
        super(1);
        this.f5639e = i3;
        this.f5640f = aVar;
    }

    @Override // o2.c
    public final Object i(Object obj) {
        switch (this.f5639e) {
            case 0:
                Boolean C3 = U.c.C((U.q) obj, this.f5640f.f2331a);
                return Boolean.valueOf(C3 != null ? C3.booleanValue() : true);
            default:
                Boolean C4 = U.c.C((U.q) obj, this.f5640f.f2331a);
                return Boolean.valueOf(C4 != null ? C4.booleanValue() : true);
        }
    }
}
