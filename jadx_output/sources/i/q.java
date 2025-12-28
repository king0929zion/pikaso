package I;

/* loaded from: classes.dex */
public final class q extends o {

    /* renamed from: g, reason: collision with root package name */
    public final g f1389g;

    public q(g gVar) {
        this.f1389g = gVar;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i3 = this.f1387f;
        this.f1387f = i3 + 2;
        Object[] objArr = this.f1385d;
        return new b(this.f1389g, objArr[i3], objArr[i3 + 1]);
    }
}
