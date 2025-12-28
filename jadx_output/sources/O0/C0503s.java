package o0;

/* renamed from: o0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0503s extends p2.h implements o2.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5656e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0503s(int i3) {
        super(1);
        this.f5656e = i3;
    }

    @Override // o2.c
    public final Object i(Object obj) {
        Boolean C3 = U.c.C((U.q) obj, this.f5656e);
        return Boolean.valueOf(C3 != null ? C3.booleanValue() : false);
    }
}
