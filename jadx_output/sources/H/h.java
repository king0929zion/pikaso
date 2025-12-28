package H;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class h extends a {

    /* renamed from: f, reason: collision with root package name */
    public final Object[] f1322f;

    /* renamed from: g, reason: collision with root package name */
    public final k f1323g;

    public h(Object[] objArr, Object[] objArr2, int i3, int i4, int i5) {
        super(i3, i4);
        this.f1322f = objArr2;
        int i6 = (i4 - 1) & (-32);
        this.f1323g = new k(objArr, i3 > i6 ? i6 : i3, i6, i5);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        k kVar = this.f1323g;
        if (kVar.hasNext()) {
            this.f1303d++;
            return kVar.next();
        }
        int i3 = this.f1303d;
        this.f1303d = i3 + 1;
        return this.f1322f[i3 - kVar.f1304e];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i3 = this.f1303d;
        k kVar = this.f1323g;
        int i4 = kVar.f1304e;
        if (i3 <= i4) {
            this.f1303d = i3 - 1;
            return kVar.previous();
        }
        int i5 = i3 - 1;
        this.f1303d = i5;
        return this.f1322f[i5 - i4];
    }
}
