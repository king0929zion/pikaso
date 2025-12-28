package I;

/* loaded from: classes.dex */
public final class p extends o {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1388g;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f1388g) {
            case 0:
                int i3 = this.f1387f;
                this.f1387f = i3 + 2;
                Object[] objArr = this.f1385d;
                return new a(objArr[i3], objArr[i3 + 1]);
            case 1:
                int i4 = this.f1387f;
                this.f1387f = i4 + 2;
                return this.f1385d[i4];
            default:
                int i5 = this.f1387f;
                this.f1387f = i5 + 2;
                return this.f1385d[i5 + 1];
        }
    }
}
