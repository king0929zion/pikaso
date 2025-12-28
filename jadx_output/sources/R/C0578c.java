package r;

/* renamed from: r.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0578c extends i2.c {

    /* renamed from: g, reason: collision with root package name */
    public C0580e f6074g;
    public /* synthetic */ Object h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0580e f6075i;

    /* renamed from: j, reason: collision with root package name */
    public int f6076j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0578c(C0580e c0580e, i2.c cVar) {
        super(cVar);
        this.f6075i = c0580e;
    }

    @Override // i2.a
    public final Object l(Object obj) {
        this.h = obj;
        this.f6076j |= Integer.MIN_VALUE;
        return this.f6075i.a(this);
    }
}
