package H;

import java.util.ListIterator;

/* loaded from: classes.dex */
public abstract class a implements ListIterator, q2.a {

    /* renamed from: d, reason: collision with root package name */
    public int f1303d;

    /* renamed from: e, reason: collision with root package name */
    public int f1304e;

    public a(int i3, int i4) {
        this.f1303d = i3;
        this.f1304e = i4;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f1303d < this.f1304e;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f1303d > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f1303d;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f1303d - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
