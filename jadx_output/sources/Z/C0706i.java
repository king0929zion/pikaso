package z;

/* renamed from: z.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0706i extends i2.c {

    /* renamed from: g, reason: collision with root package name */
    public C0713p f6871g;
    public /* synthetic */ Object h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0713p f6872i;

    /* renamed from: j, reason: collision with root package name */
    public int f6873j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0706i(C0713p c0713p, i2.c cVar) {
        super(cVar);
        this.f6872i = c0713p;
    }

    @Override // i2.a
    public final Object l(Object obj) {
        this.h = obj;
        this.f6873j |= Integer.MIN_VALUE;
        return this.f6872i.a(this);
    }
}
