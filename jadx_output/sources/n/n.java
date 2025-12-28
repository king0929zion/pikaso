package N;

/* loaded from: classes.dex */
public final class n extends p2.h implements o2.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1753e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p2.h f1754f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n(int i3, o2.c cVar) {
        super(1);
        this.f1753e = i3;
        switch (i3) {
            case 1:
                this.f1754f = (p2.h) cVar;
                super(1);
                break;
            default:
                this.f1754f = (p2.h) cVar;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [o2.c, p2.h] */
    /* JADX WARN: Type inference failed for: r0v4, types: [o2.c, p2.h] */
    @Override // o2.c
    public final Object i(Object obj) {
        switch (this.f1753e) {
            case 0:
                h hVar = (h) this.f1754f.i((l) obj);
                synchronized (o.f1756b) {
                    o.f1757c = o.f1757c.e(hVar.d());
                }
                return hVar;
            default:
                return this.f1754f.i(Long.valueOf(((Number) obj).longValue()));
        }
    }
}
