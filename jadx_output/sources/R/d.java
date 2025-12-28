package R;

/* loaded from: classes.dex */
public final class d extends i2.c {

    /* renamed from: g, reason: collision with root package name */
    public e f2202g;
    public A2.a h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f2203i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f2204j;

    /* renamed from: k, reason: collision with root package name */
    public int f2205k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, i2.c cVar) {
        super(cVar);
        this.f2204j = eVar;
    }

    @Override // i2.a
    public final Object l(Object obj) {
        this.f2203i = obj;
        this.f2205k |= Integer.MIN_VALUE;
        return this.f2204j.e(this);
    }
}
