package F;

import a.AbstractC0090a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p2.g;

/* loaded from: classes.dex */
public final class a implements List, q2.c {

    /* renamed from: d, reason: collision with root package name */
    public final d f1152d;

    public a(d dVar) {
        this.f1152d = dVar;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        this.f1152d.b(obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        d dVar = this.f1152d;
        return dVar.e(dVar.f1160f, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f1152d.g();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f1152d.h(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        d dVar = this.f1152d;
        dVar.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!dVar.h(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        AbstractC0090a.e(i3, this);
        return this.f1152d.f1158d[i3];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        d dVar = this.f1152d;
        int i3 = dVar.f1160f;
        if (i3 > 0) {
            Object[] objArr = dVar.f1158d;
            int i4 = 0;
            while (!g.a(obj, objArr[i4])) {
                i4++;
                if (i4 >= i3) {
                }
            }
            return i4;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f1152d.j();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new c(0, this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        d dVar = this.f1152d;
        int i3 = dVar.f1160f;
        if (i3 > 0) {
            int i4 = i3 - 1;
            Object[] objArr = dVar.f1158d;
            while (!g.a(obj, objArr[i4])) {
                i4--;
                if (i4 < 0) {
                }
            }
            return i4;
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new c(0, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f1152d.l(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        d dVar = this.f1152d;
        dVar.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        int i3 = dVar.f1160f;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            dVar.l(it.next());
        }
        return i3 != dVar.f1160f;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        d dVar = this.f1152d;
        int i3 = dVar.f1160f;
        for (int i4 = i3 - 1; -1 < i4; i4--) {
            if (!collection.contains(dVar.f1158d[i4])) {
                dVar.m(i4);
            }
        }
        return i3 != dVar.f1160f;
    }

    @Override // java.util.List
    public final Object set(int i3, Object obj) {
        AbstractC0090a.e(i3, this);
        Object[] objArr = this.f1152d.f1158d;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f1152d.f1160f;
    }

    @Override // java.util.List
    public final List subList(int i3, int i4) {
        AbstractC0090a.f(this, i3, i4);
        return new b(this, i3, i4);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return g.i(this);
    }

    @Override // java.util.List
    public final void add(int i3, Object obj) {
        this.f1152d.a(i3, obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i3) {
        return new c(i3, this);
    }

    @Override // java.util.List
    public final Object remove(int i3) {
        AbstractC0090a.e(i3, this);
        return this.f1152d.m(i3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return g.j(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i3, Collection collection) {
        return this.f1152d.e(i3, collection);
    }
}
