package n0;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* renamed from: n0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0432m implements List, q2.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f5262d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5263e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0433n f5264f;

    public C0432m(C0433n c0433n, int i3, int i4) {
        this.f5264f = c0433n;
        this.f5262d = i3;
        this.f5263e = i4;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i3, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i3, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof P.k) && indexOf((P.k) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((P.k) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        Object obj = this.f5264f.f5266d[i3 + this.f5262d];
        p2.g.c(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (P.k) obj;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof P.k)) {
            return -1;
        }
        P.k kVar = (P.k) obj;
        int i3 = this.f5262d;
        int i4 = this.f5263e;
        if (i3 > i4) {
            return -1;
        }
        int i5 = i3;
        while (!p2.g.a(this.f5264f.f5266d[i5], kVar)) {
            if (i5 == i4) {
                return -1;
            }
            i5++;
        }
        return i5 - i3;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i3 = this.f5262d;
        return new N.x(this.f5264f, i3, i3, this.f5263e);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof P.k)) {
            return -1;
        }
        P.k kVar = (P.k) obj;
        int i3 = this.f5263e;
        int i4 = this.f5262d;
        if (i4 > i3) {
            return -1;
        }
        while (!p2.g.a(this.f5264f.f5266d[i3], kVar)) {
            if (i3 == i4) {
                return -1;
            }
            i3--;
        }
        return i3 - i4;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        int i3 = this.f5262d;
        return new N.x(this.f5264f, i3, i3, this.f5263e);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i3, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f5263e - this.f5262d;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i3, int i4) {
        int i5 = this.f5262d;
        return new C0432m(this.f5264f, i3 + i5, i5 + i4);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return p2.g.i(this);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i3) {
        int i4 = this.f5262d;
        int i5 = this.f5263e;
        return new N.x(this.f5264f, i3 + i4, i4, i5);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return p2.g.j(this, objArr);
    }
}
