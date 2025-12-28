package N;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import n0.C0433n;

/* loaded from: classes.dex */
public final class x implements ListIterator, q2.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1794d;

    /* renamed from: e, reason: collision with root package name */
    public int f1795e;

    /* renamed from: f, reason: collision with root package name */
    public int f1796f;

    /* renamed from: g, reason: collision with root package name */
    public int f1797g;
    public final Object h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x(C0433n c0433n, int i3, int i4) {
        this(c0433n, (i4 & 1) != 0 ? 0 : i3, 0, c0433n.f5269g);
        this.f1794d = 2;
    }

    public void a() {
        int i3;
        i3 = ((AbstractList) ((e2.a) this.h)).modCount;
        if (i3 != this.f1797g) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i3;
        switch (this.f1794d) {
            case 0:
                b();
                int i4 = this.f1795e + 1;
                s sVar = (s) this.h;
                sVar.add(i4, obj);
                this.f1796f = -1;
                this.f1795e++;
                this.f1797g = sVar.e();
                return;
            case 1:
                a();
                int i5 = this.f1795e;
                this.f1795e = i5 + 1;
                e2.a aVar = (e2.a) this.h;
                aVar.add(i5, obj);
                this.f1796f = -1;
                i3 = ((AbstractList) aVar).modCount;
                this.f1797g = i3;
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public void b() {
        if (((s) this.h).e() != this.f1797g) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f1794d) {
            case 0:
                return this.f1795e < ((s) this.h).size() - 1;
            case 1:
                return this.f1795e < ((e2.a) this.h).f4285f;
            default:
                return this.f1795e < this.f1797g;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f1794d) {
            case 0:
                if (this.f1795e >= 0) {
                }
                break;
            case 1:
                if (this.f1795e > 0) {
                }
                break;
            default:
                if (this.f1795e > this.f1796f) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f1794d) {
            case 0:
                b();
                int i3 = this.f1795e + 1;
                this.f1796f = i3;
                s sVar = (s) this.h;
                t.a(i3, sVar.size());
                Object obj = sVar.get(i3);
                this.f1795e = i3;
                return obj;
            case 1:
                a();
                int i4 = this.f1795e;
                e2.a aVar = (e2.a) this.h;
                if (i4 >= aVar.f4285f) {
                    throw new NoSuchElementException();
                }
                this.f1795e = i4 + 1;
                this.f1796f = i4;
                return aVar.f4283d[aVar.f4284e + i4];
            default:
                Object[] objArr = ((C0433n) this.h).f5266d;
                int i5 = this.f1795e;
                this.f1795e = i5 + 1;
                Object obj2 = objArr[i5];
                p2.g.c(obj2, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (P.k) obj2;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f1794d) {
            case 0:
                return this.f1795e + 1;
            case 1:
                return this.f1795e;
            default:
                return this.f1795e - this.f1796f;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f1794d) {
            case 0:
                b();
                int i3 = this.f1795e;
                s sVar = (s) this.h;
                t.a(i3, sVar.size());
                int i4 = this.f1795e;
                this.f1796f = i4;
                this.f1795e--;
                return sVar.get(i4);
            case 1:
                a();
                int i5 = this.f1795e;
                if (i5 <= 0) {
                    throw new NoSuchElementException();
                }
                int i6 = i5 - 1;
                this.f1795e = i6;
                this.f1796f = i6;
                e2.a aVar = (e2.a) this.h;
                return aVar.f4283d[aVar.f4284e + i6];
            default:
                Object[] objArr = ((C0433n) this.h).f5266d;
                int i7 = this.f1795e - 1;
                this.f1795e = i7;
                Object obj = objArr[i7];
                p2.g.c(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (P.k) obj;
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f1794d) {
            case 0:
                return this.f1795e;
            case 1:
                return this.f1795e - 1;
            default:
                return (this.f1795e - this.f1796f) - 1;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i3;
        switch (this.f1794d) {
            case 0:
                b();
                int i4 = this.f1795e;
                s sVar = (s) this.h;
                sVar.remove(i4);
                this.f1795e--;
                this.f1796f = -1;
                this.f1797g = sVar.e();
                return;
            case 1:
                a();
                int i5 = this.f1796f;
                if (i5 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                e2.a aVar = (e2.a) this.h;
                aVar.b(i5);
                this.f1795e = this.f1796f;
                this.f1796f = -1;
                i3 = ((AbstractList) aVar).modCount;
                this.f1797g = i3;
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f1794d) {
            case 0:
                b();
                int i3 = this.f1796f;
                if (i3 < 0) {
                    throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                }
                s sVar = (s) this.h;
                sVar.set(i3, obj);
                this.f1797g = sVar.e();
                return;
            case 1:
                a();
                int i4 = this.f1796f;
                if (i4 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((e2.a) this.h).set(i4, obj);
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public x(C0433n c0433n, int i3, int i4, int i5) {
        this.f1794d = 2;
        this.h = c0433n;
        this.f1795e = i3;
        this.f1796f = i4;
        this.f1797g = i5;
    }

    public x(s sVar, int i3) {
        this.f1794d = 0;
        this.h = sVar;
        this.f1795e = i3 - 1;
        this.f1796f = -1;
        this.f1797g = sVar.e();
    }

    public x(e2.a aVar, int i3) {
        int i4;
        this.f1794d = 1;
        p2.g.e(aVar, "list");
        this.h = aVar;
        this.f1795e = i3;
        this.f1796f = -1;
        i4 = ((AbstractList) aVar).modCount;
        this.f1797g = i4;
    }
}
