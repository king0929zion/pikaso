package n;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: n.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0383c implements Set {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0386f f4979d;

    public C0383c(C0386f c0386f) {
        this.f4979d = c0386f;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f4979d.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f4979d.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f4979d.j(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        C0386f c0386f = this.f4979d;
        int i3 = 0;
        for (int i4 = c0386f.f4970f - 1; i4 >= 0; i4--) {
            Object f3 = c0386f.f(i4);
            i3 += f3 == null ? 0 : f3.hashCode();
        }
        return i3;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f4979d.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0382b(this.f4979d, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        C0386f c0386f = this.f4979d;
        int d3 = c0386f.d(obj);
        if (d3 < 0) {
            return false;
        }
        c0386f.g(d3);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f4979d.k(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        C0386f c0386f = this.f4979d;
        int i3 = c0386f.f4970f;
        for (int i4 = i3 - 1; i4 >= 0; i4--) {
            if (!collection.contains(c0386f.f(i4))) {
                c0386f.g(i4);
            }
        }
        return i3 != c0386f.f4970f;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f4979d.f4970f;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        C0386f c0386f = this.f4979d;
        int i3 = c0386f.f4970f;
        Object[] objArr = new Object[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            objArr[i4] = c0386f.f(i4);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C0386f c0386f = this.f4979d;
        int i3 = c0386f.f4970f;
        if (objArr.length < i3) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i3);
        }
        for (int i4 = 0; i4 < i3; i4++) {
            objArr[i4] = c0386f.f(i4);
        }
        if (objArr.length > i3) {
            objArr[i3] = null;
        }
        return objArr;
    }
}
