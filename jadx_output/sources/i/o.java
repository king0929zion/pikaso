package I;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class o implements Iterator, q2.a {

    /* renamed from: d, reason: collision with root package name */
    public Object[] f1385d = n.f1380e.f1384d;

    /* renamed from: e, reason: collision with root package name */
    public int f1386e;

    /* renamed from: f, reason: collision with root package name */
    public int f1387f;

    public final void a(Object[] objArr, int i3, int i4) {
        this.f1385d = objArr;
        this.f1386e = i3;
        this.f1387f = i4;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1387f < this.f1386e;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
