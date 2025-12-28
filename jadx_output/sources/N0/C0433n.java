package n0;

import d2.AbstractC0241l;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* renamed from: n0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0433n implements List, q2.a {

    /* renamed from: g, reason: collision with root package name */
    public int f5269g;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f5266d = new Object[16];

    /* renamed from: e, reason: collision with root package name */
    public long[] f5267e = new long[16];

    /* renamed from: f, reason: collision with root package name */
    public int f5268f = -1;
    public boolean h = true;

    public final long a() {
        long a3 = AbstractC0409C.a(Float.POSITIVE_INFINITY, false);
        int i3 = this.f5268f + 1;
        int T2 = AbstractC0241l.T(this);
        if (i3 <= T2) {
            while (true) {
                long j3 = this.f5267e[i3];
                if (AbstractC0409C.g(j3, a3) < 0) {
                    a3 = j3;
                }
                if (Float.intBitsToFloat((int) (a3 >> 32)) < 0.0f && ((int) (4294967295L & a3)) != 0) {
                    return a3;
                }
                if (i3 == T2) {
                    break;
                }
                i3++;
            }
        }
        return a3;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i3, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i3, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void b(P.k kVar, float f3, boolean z3, o2.a aVar) {
        int i3 = this.f5268f;
        int i4 = i3 + 1;
        this.f5268f = i4;
        Object[] objArr = this.f5266d;
        if (i4 >= objArr.length) {
            int length = objArr.length + 16;
            Object[] copyOf = Arrays.copyOf(objArr, length);
            p2.g.d(copyOf, "copyOf(this, newSize)");
            this.f5266d = copyOf;
            long[] copyOf2 = Arrays.copyOf(this.f5267e, length);
            p2.g.d(copyOf2, "copyOf(this, newSize)");
            this.f5267e = copyOf2;
        }
        Object[] objArr2 = this.f5266d;
        int i5 = this.f5268f;
        objArr2[i5] = kVar;
        this.f5267e[i5] = AbstractC0409C.a(f3, z3);
        c();
        aVar.c();
        this.f5268f = i3;
    }

    public final void c() {
        int i3 = this.f5268f + 1;
        int T2 = AbstractC0241l.T(this);
        if (i3 <= T2) {
            while (true) {
                this.f5266d[i3] = null;
                if (i3 == T2) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        this.f5269g = this.f5268f + 1;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f5268f = -1;
        c();
        this.h = true;
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
        Object obj = this.f5266d[i3];
        p2.g.c(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (P.k) obj;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof P.k)) {
            return -1;
        }
        P.k kVar = (P.k) obj;
        int T2 = AbstractC0241l.T(this);
        if (T2 < 0) {
            return -1;
        }
        int i3 = 0;
        while (!p2.g.a(this.f5266d[i3], kVar)) {
            if (i3 == T2) {
                return -1;
            }
            i3++;
        }
        return i3;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f5269g == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new N.x(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof P.k)) {
            return -1;
        }
        P.k kVar = (P.k) obj;
        for (int T2 = AbstractC0241l.T(this); -1 < T2; T2--) {
            if (p2.g.a(this.f5266d[T2], kVar)) {
                return T2;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new N.x(this, 0, 7);
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
        return this.f5269g;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i3, int i4) {
        return new C0432m(this, i3, i4);
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
        return new N.x(this, i3, 6);
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
