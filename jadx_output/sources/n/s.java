package N;

import D.C0032d;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class s implements y, List, RandomAccess, q2.c {

    /* renamed from: d, reason: collision with root package name */
    public q f1770d;

    @Override // N.y
    public final void a(A a3) {
        a3.f1701b = this.f1770d;
        this.f1770d = (q) a3;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i3;
        H.c cVar;
        boolean z3;
        h k3;
        do {
            Object obj2 = t.f1771a;
            synchronized (obj2) {
                q qVar = this.f1770d;
                p2.g.c(qVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                q qVar2 = (q) o.i(qVar);
                i3 = qVar2.f1766d;
                cVar = qVar2.f1765c;
            }
            p2.g.b(cVar);
            H.c c3 = cVar.c(obj);
            z3 = false;
            if (c3.equals(cVar)) {
                return false;
            }
            q qVar3 = this.f1770d;
            p2.g.c(qVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (o.f1756b) {
                k3 = o.k();
                q qVar4 = (q) o.w(qVar3, this, k3);
                synchronized (obj2) {
                    int i4 = qVar4.f1766d;
                    if (i4 == i3) {
                        qVar4.f1765c = c3;
                        qVar4.f1767e++;
                        qVar4.f1766d = i4 + 1;
                        z3 = true;
                    }
                }
            }
            o.n(k3, this);
        } while (!z3);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i3, Collection collection) {
        return f(new r(i3, collection));
    }

    @Override // N.y
    public final A b() {
        return this.f1770d;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        h k3;
        q qVar = this.f1770d;
        p2.g.c(qVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        synchronized (o.f1756b) {
            k3 = o.k();
            q qVar2 = (q) o.w(qVar, this, k3);
            synchronized (t.f1771a) {
                qVar2.f1765c = H.j.f1327e;
                qVar2.f1766d++;
                qVar2.f1767e++;
            }
        }
        o.n(k3, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return d().f1765c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return d().f1765c.containsAll(collection);
    }

    public final q d() {
        q qVar = this.f1770d;
        p2.g.c(qVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (q) o.t(qVar, this);
    }

    public final int e() {
        q qVar = this.f1770d;
        p2.g.c(qVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((q) o.i(qVar)).f1767e;
    }

    public final boolean f(o2.c cVar) {
        int i3;
        H.c cVar2;
        Object i4;
        h k3;
        boolean z3;
        do {
            Object obj = t.f1771a;
            synchronized (obj) {
                q qVar = this.f1770d;
                p2.g.c(qVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                q qVar2 = (q) o.i(qVar);
                i3 = qVar2.f1766d;
                cVar2 = qVar2.f1765c;
            }
            p2.g.b(cVar2);
            H.g e3 = cVar2.e();
            i4 = cVar.i(e3);
            H.c c3 = e3.c();
            if (p2.g.a(c3, cVar2)) {
                break;
            }
            q qVar3 = this.f1770d;
            p2.g.c(qVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (o.f1756b) {
                k3 = o.k();
                q qVar4 = (q) o.w(qVar3, this, k3);
                synchronized (obj) {
                    int i5 = qVar4.f1766d;
                    if (i5 == i3) {
                        qVar4.f1765c = c3;
                        qVar4.f1766d = i5 + 1;
                        z3 = true;
                        qVar4.f1767e++;
                    } else {
                        z3 = false;
                    }
                }
            }
            o.n(k3, this);
        } while (!z3);
        return ((Boolean) i4).booleanValue();
    }

    @Override // java.util.List
    public final Object get(int i3) {
        return d().f1765c.get(i3);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return d().f1765c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return d().f1765c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return d().f1765c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new x(this, 0);
    }

    @Override // java.util.List
    public final Object remove(int i3) {
        int i4;
        H.c cVar;
        h k3;
        boolean z3;
        Object obj = get(i3);
        do {
            Object obj2 = t.f1771a;
            synchronized (obj2) {
                q qVar = this.f1770d;
                p2.g.c(qVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                q qVar2 = (q) o.i(qVar);
                i4 = qVar2.f1766d;
                cVar = qVar2.f1765c;
            }
            p2.g.b(cVar);
            H.c g3 = cVar.g(i3);
            if (p2.g.a(g3, cVar)) {
                break;
            }
            q qVar3 = this.f1770d;
            p2.g.c(qVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (o.f1756b) {
                k3 = o.k();
                q qVar4 = (q) o.w(qVar3, this, k3);
                synchronized (obj2) {
                    int i5 = qVar4.f1766d;
                    if (i5 == i4) {
                        qVar4.f1765c = g3;
                        z3 = true;
                        qVar4.f1767e++;
                        qVar4.f1766d = i5 + 1;
                    } else {
                        z3 = false;
                    }
                }
            }
            o.n(k3, this);
        } while (!z3);
        return obj;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i3;
        H.c cVar;
        boolean z3;
        h k3;
        do {
            Object obj = t.f1771a;
            synchronized (obj) {
                q qVar = this.f1770d;
                p2.g.c(qVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                q qVar2 = (q) o.i(qVar);
                i3 = qVar2.f1766d;
                cVar = qVar2.f1765c;
            }
            p2.g.b(cVar);
            H.c f3 = cVar.f(new H.b(0, collection));
            z3 = false;
            if (p2.g.a(f3, cVar)) {
                return false;
            }
            q qVar3 = this.f1770d;
            p2.g.c(qVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (o.f1756b) {
                k3 = o.k();
                q qVar4 = (q) o.w(qVar3, this, k3);
                synchronized (obj) {
                    int i4 = qVar4.f1766d;
                    if (i4 == i3) {
                        qVar4.f1765c = f3;
                        qVar4.f1767e++;
                        qVar4.f1766d = i4 + 1;
                        z3 = true;
                    }
                }
            }
            o.n(k3, this);
        } while (!z3);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return f(new H.b(2, collection));
    }

    @Override // java.util.List
    public final Object set(int i3, Object obj) {
        int i4;
        H.c cVar;
        h k3;
        boolean z3;
        Object obj2 = get(i3);
        do {
            Object obj3 = t.f1771a;
            synchronized (obj3) {
                q qVar = this.f1770d;
                p2.g.c(qVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                q qVar2 = (q) o.i(qVar);
                i4 = qVar2.f1766d;
                cVar = qVar2.f1765c;
            }
            p2.g.b(cVar);
            H.c h = cVar.h(i3, obj);
            if (h.equals(cVar)) {
                break;
            }
            q qVar3 = this.f1770d;
            p2.g.c(qVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (o.f1756b) {
                k3 = o.k();
                q qVar4 = (q) o.w(qVar3, this, k3);
                synchronized (obj3) {
                    int i5 = qVar4.f1766d;
                    if (i5 == i4) {
                        qVar4.f1765c = h;
                        qVar4.f1766d = i5 + 1;
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
            }
            o.n(k3, this);
        } while (!z3);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return d().f1765c.a();
    }

    @Override // java.util.List
    public final List subList(int i3, int i4) {
        if (i3 >= 0 && i3 <= i4 && i4 <= size()) {
            return new C(this, i3, i4);
        }
        C0032d.H("fromIndex or toIndex are out of bounds");
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return p2.g.i(this);
    }

    public final String toString() {
        q qVar = this.f1770d;
        p2.g.c(qVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((q) o.i(qVar)).f1765c + ")@" + hashCode();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i3;
        H.c cVar;
        boolean z3;
        h k3;
        do {
            Object obj = t.f1771a;
            synchronized (obj) {
                q qVar = this.f1770d;
                p2.g.c(qVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                q qVar2 = (q) o.i(qVar);
                i3 = qVar2.f1766d;
                cVar = qVar2.f1765c;
            }
            p2.g.b(cVar);
            H.c d3 = cVar.d(collection);
            z3 = false;
            if (p2.g.a(d3, cVar)) {
                return false;
            }
            q qVar3 = this.f1770d;
            p2.g.c(qVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (o.f1756b) {
                k3 = o.k();
                q qVar4 = (q) o.w(qVar3, this, k3);
                synchronized (obj) {
                    int i4 = qVar4.f1766d;
                    if (i4 == i3) {
                        qVar4.f1765c = d3;
                        qVar4.f1767e++;
                        qVar4.f1766d = i4 + 1;
                        z3 = true;
                    }
                }
            }
            o.n(k3, this);
        } while (!z3);
        return true;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i3) {
        return new x(this, i3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return p2.g.j(this, objArr);
    }

    @Override // java.util.List
    public final void add(int i3, Object obj) {
        int i4;
        H.c cVar;
        h k3;
        boolean z3;
        do {
            Object obj2 = t.f1771a;
            synchronized (obj2) {
                q qVar = this.f1770d;
                p2.g.c(qVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                q qVar2 = (q) o.i(qVar);
                i4 = qVar2.f1766d;
                cVar = qVar2.f1765c;
            }
            p2.g.b(cVar);
            H.c b3 = cVar.b(i3, obj);
            if (b3.equals(cVar)) {
                return;
            }
            q qVar3 = this.f1770d;
            p2.g.c(qVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (o.f1756b) {
                k3 = o.k();
                q qVar4 = (q) o.w(qVar3, this, k3);
                synchronized (obj2) {
                    int i5 = qVar4.f1766d;
                    if (i5 == i4) {
                        qVar4.f1765c = b3;
                        z3 = true;
                        qVar4.f1767e++;
                        qVar4.f1766d = i5 + 1;
                    } else {
                        z3 = false;
                    }
                }
            }
            o.n(k3, this);
        } while (!z3);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i3;
        H.c cVar;
        boolean z3;
        h k3;
        do {
            Object obj2 = t.f1771a;
            synchronized (obj2) {
                q qVar = this.f1770d;
                p2.g.c(qVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                q qVar2 = (q) o.i(qVar);
                i3 = qVar2.f1766d;
                cVar = qVar2.f1765c;
            }
            p2.g.b(cVar);
            int indexOf = cVar.indexOf(obj);
            H.c g3 = indexOf != -1 ? cVar.g(indexOf) : cVar;
            z3 = false;
            if (p2.g.a(g3, cVar)) {
                return false;
            }
            q qVar3 = this.f1770d;
            p2.g.c(qVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (o.f1756b) {
                k3 = o.k();
                q qVar4 = (q) o.w(qVar3, this, k3);
                synchronized (obj2) {
                    int i4 = qVar4.f1766d;
                    if (i4 == i3) {
                        qVar4.f1765c = g3;
                        qVar4.f1767e++;
                        qVar4.f1766d = i4 + 1;
                        z3 = true;
                    }
                }
            }
            o.n(k3, this);
        } while (!z3);
        return true;
    }
}
