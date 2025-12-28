package e2;

import A.AbstractC0000a;
import N.x;
import d2.AbstractC0235f;
import d2.AbstractC0239j;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p2.g;

/* loaded from: classes.dex */
public final class a extends AbstractC0235f implements RandomAccess, Serializable {

    /* renamed from: j, reason: collision with root package name */
    public static final a f4282j;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f4283d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4284e;

    /* renamed from: f, reason: collision with root package name */
    public int f4285f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4286g;
    public final a h;

    /* renamed from: i, reason: collision with root package name */
    public final a f4287i;

    static {
        a aVar = new a(0);
        aVar.f4286g = true;
        f4282j = aVar;
    }

    public a(Object[] objArr, int i3, int i4, boolean z3, a aVar, a aVar2) {
        this.f4283d = objArr;
        this.f4284e = i3;
        this.f4285f = i4;
        this.f4286g = z3;
        this.h = aVar;
        this.f4287i = aVar2;
        if (aVar != null) {
            ((AbstractList) this).modCount = ((AbstractList) aVar).modCount;
        }
    }

    @Override // d2.AbstractC0235f
    public final int a() {
        f();
        return this.f4285f;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        g();
        f();
        e(this.f4284e + this.f4285f, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        g.e(collection, "elements");
        g();
        f();
        int size = collection.size();
        d(this.f4284e + this.f4285f, collection, size);
        return size > 0;
    }

    @Override // d2.AbstractC0235f
    public final Object b(int i3) {
        g();
        f();
        int i4 = this.f4285f;
        if (i3 < 0 || i3 >= i4) {
            throw new IndexOutOfBoundsException(AbstractC0000a.d("index: ", i3, ", size: ", i4));
        }
        return i(this.f4284e + i3);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        g();
        f();
        j(this.f4284e, this.f4285f);
    }

    public final void d(int i3, Collection collection, int i4) {
        ((AbstractList) this).modCount++;
        a aVar = this.h;
        if (aVar != null) {
            aVar.d(i3, collection, i4);
            this.f4283d = aVar.f4283d;
            this.f4285f += i4;
        } else {
            h(i3, i4);
            Iterator it = collection.iterator();
            for (int i5 = 0; i5 < i4; i5++) {
                this.f4283d[i3 + i5] = it.next();
            }
        }
    }

    public final void e(int i3, Object obj) {
        ((AbstractList) this).modCount++;
        a aVar = this.h;
        if (aVar == null) {
            h(i3, 1);
            this.f4283d[i3] = obj;
        } else {
            aVar.e(i3, obj);
            this.f4283d = aVar.f4283d;
            this.f4285f++;
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        f();
        if (obj != this) {
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            Object[] objArr = this.f4283d;
            int i3 = this.f4285f;
            if (i3 != list.size()) {
                return false;
            }
            for (int i4 = 0; i4 < i3; i4++) {
                if (!g.a(objArr[this.f4284e + i4], list.get(i4))) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void f() {
        a aVar = this.f4287i;
        if (aVar != null && ((AbstractList) aVar).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    public final void g() {
        a aVar;
        if (this.f4286g || ((aVar = this.f4287i) != null && aVar.f4286g)) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i3) {
        f();
        int i4 = this.f4285f;
        if (i3 < 0 || i3 >= i4) {
            throw new IndexOutOfBoundsException(AbstractC0000a.d("index: ", i3, ", size: ", i4));
        }
        return this.f4283d[this.f4284e + i3];
    }

    public final void h(int i3, int i4) {
        int i5 = this.f4285f + i4;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f4283d;
        if (i5 > objArr.length) {
            int length = objArr.length;
            int i6 = length + (length >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            if (i6 - 2147483639 > 0) {
                i6 = i5 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] copyOf = Arrays.copyOf(objArr, i6);
            g.d(copyOf, "copyOf(...)");
            this.f4283d = copyOf;
        }
        Object[] objArr2 = this.f4283d;
        AbstractC0239j.Y(objArr2, objArr2, i3 + i4, i3, this.f4284e + this.f4285f);
        this.f4285f += i4;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        f();
        Object[] objArr = this.f4283d;
        int i3 = this.f4285f;
        int i4 = 1;
        for (int i5 = 0; i5 < i3; i5++) {
            Object obj = objArr[this.f4284e + i5];
            i4 = (i4 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i4;
    }

    public final Object i(int i3) {
        ((AbstractList) this).modCount++;
        a aVar = this.h;
        if (aVar != null) {
            this.f4285f--;
            return aVar.i(i3);
        }
        Object[] objArr = this.f4283d;
        Object obj = objArr[i3];
        int i4 = this.f4285f;
        int i5 = this.f4284e;
        AbstractC0239j.Y(objArr, objArr, i3, i3 + 1, i4 + i5);
        Object[] objArr2 = this.f4283d;
        int i6 = (i5 + this.f4285f) - 1;
        g.e(objArr2, "<this>");
        objArr2[i6] = null;
        this.f4285f--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        f();
        for (int i3 = 0; i3 < this.f4285f; i3++) {
            if (g.a(this.f4283d[this.f4284e + i3], obj)) {
                return i3;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        f();
        return this.f4285f == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i3, int i4) {
        if (i4 > 0) {
            ((AbstractList) this).modCount++;
        }
        a aVar = this.h;
        if (aVar != null) {
            aVar.j(i3, i4);
        } else {
            Object[] objArr = this.f4283d;
            AbstractC0239j.Y(objArr, objArr, i3, i3 + i4, this.f4285f);
            Object[] objArr2 = this.f4283d;
            int i5 = this.f4285f;
            g.e(objArr2, "<this>");
            for (int i6 = i5 - i4; i6 < i5; i6++) {
                objArr2[i6] = null;
            }
        }
        this.f4285f -= i4;
    }

    public final int k(int i3, int i4, Collection collection, boolean z3) {
        int i5;
        a aVar = this.h;
        if (aVar != null) {
            i5 = aVar.k(i3, i4, collection, z3);
        } else {
            int i6 = 0;
            int i7 = 0;
            while (i6 < i4) {
                int i8 = i3 + i6;
                if (collection.contains(this.f4283d[i8]) == z3) {
                    Object[] objArr = this.f4283d;
                    i6++;
                    objArr[i7 + i3] = objArr[i8];
                    i7++;
                } else {
                    i6++;
                }
            }
            int i9 = i4 - i7;
            Object[] objArr2 = this.f4283d;
            AbstractC0239j.Y(objArr2, objArr2, i3 + i7, i4 + i3, this.f4285f);
            Object[] objArr3 = this.f4283d;
            int i10 = this.f4285f;
            g.e(objArr3, "<this>");
            for (int i11 = i10 - i9; i11 < i10; i11++) {
                objArr3[i11] = null;
            }
            i5 = i9;
        }
        if (i5 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f4285f -= i5;
        return i5;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        f();
        for (int i3 = this.f4285f - 1; i3 >= 0; i3--) {
            if (g.a(this.f4283d[this.f4284e + i3], obj)) {
                return i3;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        g();
        f();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            b(indexOf);
        }
        return indexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        g.e(collection, "elements");
        g();
        f();
        return k(this.f4284e, this.f4285f, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        g.e(collection, "elements");
        g();
        f();
        return k(this.f4284e, this.f4285f, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i3, Object obj) {
        g();
        f();
        int i4 = this.f4285f;
        if (i3 < 0 || i3 >= i4) {
            throw new IndexOutOfBoundsException(AbstractC0000a.d("index: ", i3, ", size: ", i4));
        }
        Object[] objArr = this.f4283d;
        int i5 = this.f4284e;
        Object obj2 = objArr[i5 + i3];
        objArr[i5 + i3] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i3, int i4) {
        int i5 = this.f4285f;
        if (i3 < 0 || i4 > i5) {
            throw new IndexOutOfBoundsException("fromIndex: " + i3 + ", toIndex: " + i4 + ", size: " + i5);
        }
        if (i3 > i4) {
            throw new IllegalArgumentException(AbstractC0000a.d("fromIndex: ", i3, " > toIndex: ", i4));
        }
        Object[] objArr = this.f4283d;
        int i6 = this.f4284e + i3;
        int i7 = i4 - i3;
        boolean z3 = this.f4286g;
        a aVar = this.f4287i;
        return new a(objArr, i6, i7, z3, this, aVar == null ? this : aVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        g.e(objArr, "destination");
        f();
        int length = objArr.length;
        int i3 = this.f4285f;
        int i4 = this.f4284e;
        if (length < i3) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f4283d, i4, i3 + i4, objArr.getClass());
            g.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        AbstractC0239j.Y(this.f4283d, objArr, 0, i4, i3 + i4);
        int i5 = this.f4285f;
        if (i5 < objArr.length) {
            objArr[i5] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        f();
        Object[] objArr = this.f4283d;
        int i3 = this.f4285f;
        StringBuilder sb = new StringBuilder((i3 * 3) + 2);
        sb.append("[");
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[this.f4284e + i4];
            if (obj == this) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        g.d(sb2, "toString(...)");
        return sb2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i3) {
        f();
        int i4 = this.f4285f;
        if (i3 < 0 || i3 > i4) {
            throw new IndexOutOfBoundsException(AbstractC0000a.d("index: ", i3, ", size: ", i4));
        }
        return new x(this, i3);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, Object obj) {
        g();
        f();
        int i4 = this.f4285f;
        if (i3 >= 0 && i3 <= i4) {
            e(this.f4284e + i3, obj);
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC0000a.d("index: ", i3, ", size: ", i4));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i3, Collection collection) {
        g.e(collection, "elements");
        g();
        f();
        int i4 = this.f4285f;
        if (i3 >= 0 && i3 <= i4) {
            int size = collection.size();
            d(this.f4284e + i3, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(AbstractC0000a.d("index: ", i3, ", size: ", i4));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        f();
        Object[] objArr = this.f4283d;
        int i3 = this.f4285f;
        int i4 = this.f4284e;
        return AbstractC0239j.b0(objArr, i4, i3 + i4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(int i3) {
        this(new Object[i3], 0, 0, false, null, null);
        if (i3 >= 0) {
            return;
        }
        throw new IllegalArgumentException("capacity must be non-negative.");
    }
}
