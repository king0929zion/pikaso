package N;

import D.C0032d;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class C implements List, q2.c {

    /* renamed from: d, reason: collision with root package name */
    public final s f1704d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1705e;

    /* renamed from: f, reason: collision with root package name */
    public int f1706f;

    /* renamed from: g, reason: collision with root package name */
    public int f1707g;

    public C(s sVar, int i3, int i4) {
        this.f1704d = sVar;
        this.f1705e = i3;
        this.f1706f = sVar.e();
        this.f1707g = i4 - i3;
    }

    public final void a() {
        if (this.f1704d.e() != this.f1706f) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        a();
        int i3 = this.f1705e + this.f1707g;
        s sVar = this.f1704d;
        sVar.add(i3, obj);
        this.f1707g++;
        this.f1706f = sVar.e();
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.f1707g, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i3;
        H.c cVar;
        h k3;
        boolean z3;
        if (this.f1707g > 0) {
            a();
            s sVar = this.f1704d;
            int i4 = this.f1705e;
            int i5 = this.f1707g + i4;
            sVar.getClass();
            do {
                Object obj = t.f1771a;
                synchronized (obj) {
                    q qVar = sVar.f1770d;
                    p2.g.c(qVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    q qVar2 = (q) o.i(qVar);
                    i3 = qVar2.f1766d;
                    cVar = qVar2.f1765c;
                }
                p2.g.b(cVar);
                H.g e3 = cVar.e();
                e3.subList(i4, i5).clear();
                H.c c3 = e3.c();
                if (p2.g.a(c3, cVar)) {
                    break;
                }
                q qVar3 = sVar.f1770d;
                p2.g.c(qVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized (o.f1756b) {
                    k3 = o.k();
                    q qVar4 = (q) o.w(qVar3, sVar, k3);
                    synchronized (obj) {
                        int i6 = qVar4.f1766d;
                        if (i6 == i3) {
                            qVar4.f1765c = c3;
                            qVar4.f1766d = i6 + 1;
                            z3 = true;
                            qVar4.f1767e++;
                        } else {
                            z3 = false;
                        }
                    }
                }
                o.n(k3, sVar);
            } while (!z3);
            this.f1707g = 0;
            this.f1706f = this.f1704d.e();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        a();
        t.a(i3, this.f1707g);
        return this.f1704d.get(this.f1705e + i3);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        a();
        int i3 = this.f1707g;
        int i4 = this.f1705e;
        Iterator it = Z.b.R(i4, i3 + i4).iterator();
        while (it.hasNext()) {
            int a3 = ((u2.c) it).a();
            if (p2.g.a(obj, this.f1704d.get(a3))) {
                return a3 - i4;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f1707g == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        a();
        int i3 = this.f1707g;
        int i4 = this.f1705e;
        for (int i5 = (i3 + i4) - 1; i5 >= i4; i5--) {
            if (p2.g.a(obj, this.f1704d.get(i5))) {
                return i5 - i4;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z3 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z3) {
                    z3 = true;
                }
            }
            return z3;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i3;
        H.c cVar;
        h k3;
        boolean z3;
        a();
        s sVar = this.f1704d;
        int i4 = this.f1705e;
        int i5 = this.f1707g + i4;
        int size = sVar.size();
        do {
            Object obj = t.f1771a;
            synchronized (obj) {
                q qVar = sVar.f1770d;
                p2.g.c(qVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                q qVar2 = (q) o.i(qVar);
                i3 = qVar2.f1766d;
                cVar = qVar2.f1765c;
            }
            p2.g.b(cVar);
            H.g e3 = cVar.e();
            e3.subList(i4, i5).retainAll(collection);
            H.c c3 = e3.c();
            if (p2.g.a(c3, cVar)) {
                break;
            }
            q qVar3 = sVar.f1770d;
            p2.g.c(qVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (o.f1756b) {
                k3 = o.k();
                q qVar4 = (q) o.w(qVar3, sVar, k3);
                synchronized (obj) {
                    int i6 = qVar4.f1766d;
                    if (i6 == i3) {
                        qVar4.f1765c = c3;
                        qVar4.f1766d = i6 + 1;
                        qVar4.f1767e++;
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
            }
            o.n(k3, sVar);
        } while (!z3);
        int size2 = size - sVar.size();
        if (size2 > 0) {
            this.f1706f = this.f1704d.e();
            this.f1707g -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i3, Object obj) {
        t.a(i3, this.f1707g);
        a();
        int i4 = i3 + this.f1705e;
        s sVar = this.f1704d;
        Object obj2 = sVar.set(i4, obj);
        this.f1706f = sVar.e();
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f1707g;
    }

    @Override // java.util.List
    public final List subList(int i3, int i4) {
        if (!(i3 >= 0 && i3 <= i4 && i4 <= this.f1707g)) {
            C0032d.H("fromIndex or toIndex are out of bounds");
            throw null;
        }
        a();
        int i5 = this.f1705e;
        return new C(this.f1704d, i3 + i5, i4 + i5);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return p2.g.i(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i3) {
        a();
        p2.n nVar = new p2.n();
        nVar.f5959d = i3 - 1;
        return new B(nVar, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return p2.g.j(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i3, Collection collection) {
        a();
        int i4 = i3 + this.f1705e;
        s sVar = this.f1704d;
        boolean addAll = sVar.addAll(i4, collection);
        if (addAll) {
            this.f1707g = collection.size() + this.f1707g;
            this.f1706f = sVar.e();
        }
        return addAll;
    }

    @Override // java.util.List
    public final Object remove(int i3) {
        a();
        int i4 = this.f1705e + i3;
        s sVar = this.f1704d;
        Object remove = sVar.remove(i4);
        this.f1707g--;
        this.f1706f = sVar.e();
        return remove;
    }

    @Override // java.util.List
    public final void add(int i3, Object obj) {
        a();
        int i4 = this.f1705e + i3;
        s sVar = this.f1704d;
        sVar.add(i4, obj);
        this.f1707g++;
        this.f1706f = sVar.e();
    }
}
