package r;

/* renamed from: r.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0579d extends i2.c {

    /* renamed from: g, reason: collision with root package name */
    public C0580e f6077g;
    public /* synthetic */ Object h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0580e f6078i;

    /* renamed from: j, reason: collision with root package name */
    public int f6079j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0579d(C0580e c0580e, i2.c cVar) {
        super(cVar);
        this.f6078i = c0580e;
    }

    @Override // i2.a
    public final Object l(Object obj) {
        this.h = obj;
        this.f6079j |= Integer.MIN_VALUE;
        return this.f6078i.c(this);
    }
}
