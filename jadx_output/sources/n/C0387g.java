package n;

import d2.AbstractC0239j;
import d2.AbstractC0240k;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import o.AbstractC0450a;

/* renamed from: n.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0387g implements Collection, Set, q2.b, q2.e {

    /* renamed from: d, reason: collision with root package name */
    public int[] f4987d = AbstractC0450a.f5362a;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f4988e = AbstractC0450a.f5364c;

    /* renamed from: f, reason: collision with root package name */
    public int f4989f;

    public C0387g(int i3) {
    }

    public final Object a(int i3) {
        int i4 = this.f4989f;
        Object[] objArr = this.f4988e;
        Object obj = objArr[i3];
        if (i4 <= 1) {
            clear();
        } else {
            int i5 = i4 - 1;
            int[] iArr = this.f4987d;
            if (iArr.length <= 8 || i4 >= iArr.length / 3) {
                if (i3 < i5) {
                    int i6 = i3 + 1;
                    AbstractC0239j.X(i3, i6, i4, iArr, iArr);
                    Object[] objArr2 = this.f4988e;
                    AbstractC0239j.Y(objArr2, objArr2, i3, i6, i4);
                }
                this.f4988e[i5] = null;
            } else {
                AbstractC0394n.a(this, i4 > 8 ? i4 + (i4 >> 1) : 8);
                if (i3 > 0) {
                    AbstractC0239j.Z(0, i3, 6, iArr, this.f4987d);
                    AbstractC0239j.a0(objArr, this.f4988e, 0, i3, 6);
                }
                if (i3 < i5) {
                    int i7 = i3 + 1;
                    AbstractC0239j.X(i3, i7, i4, iArr, this.f4987d);
                    AbstractC0239j.Y(objArr, this.f4988e, i3, i7, i4);
                }
            }
            if (i4 != this.f4989f) {
                throw new ConcurrentModificationException();
            }
            this.f4989f = i5;
        }
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i3;
        int b3;
        int i4 = this.f4989f;
        if (obj == null) {
            b3 = AbstractC0394n.b(this, null, 0);
            i3 = 0;
        } else {
            int hashCode = obj.hashCode();
            i3 = hashCode;
            b3 = AbstractC0394n.b(this, obj, hashCode);
        }
        if (b3 >= 0) {
            return false;
        }
        int i5 = ~b3;
        int[] iArr = this.f4987d;
        if (i4 >= iArr.length) {
            int i6 = 8;
            if (i4 >= 8) {
                i6 = (i4 >> 1) + i4;
            } else if (i4 < 4) {
                i6 = 4;
            }
            Object[] objArr = this.f4988e;
            AbstractC0394n.a(this, i6);
            if (i4 != this.f4989f) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f4987d;
            if (iArr2.length != 0) {
                AbstractC0239j.Z(0, iArr.length, 6, iArr, iArr2);
                AbstractC0239j.a0(objArr, this.f4988e, 0, objArr.length, 6);
            }
        }
        if (i5 < i4) {
            int[] iArr3 = this.f4987d;
            int i7 = i5 + 1;
            AbstractC0239j.X(i7, i5, i4, iArr3, iArr3);
            Object[] objArr2 = this.f4988e;
            AbstractC0239j.Y(objArr2, objArr2, i7, i5, i4);
        }
        int i8 = this.f4989f;
        if (i4 == i8) {
            int[] iArr4 = this.f4987d;
            if (i5 < iArr4.length) {
                iArr4[i5] = i3;
                this.f4988e[i5] = obj;
                this.f4989f = i8 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        p2.g.e(collection, "elements");
        int size = collection.size() + this.f4989f;
        int i3 = this.f4989f;
        int[] iArr = this.f4987d;
        boolean z3 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f4988e;
            AbstractC0394n.a(this, size);
            int i4 = this.f4989f;
            if (i4 > 0) {
                AbstractC0239j.Z(0, i4, 6, iArr, this.f4987d);
                AbstractC0239j.a0(objArr, this.f4988e, 0, this.f4989f, 6);
            }
        }
        if (this.f4989f != i3) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            z3 |= add(it.next());
        }
        return z3;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f4989f != 0) {
            this.f4987d = AbstractC0450a.f5362a;
            this.f4988e = AbstractC0450a.f5364c;
            this.f4989f = 0;
        }
        if (this.f4989f != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? AbstractC0394n.b(this, null, 0) : AbstractC0394n.b(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        p2.g.e(collection, "elements");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Set) && this.f4989f == ((Set) obj).size()) {
            try {
                int i3 = this.f4989f;
                for (int i4 = 0; i4 < i3; i4++) {
                    if (((Set) obj).contains(this.f4988e[i4])) {
                    }
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f4987d;
        int i3 = this.f4989f;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            i4 += iArr[i5];
        }
        return i4;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f4989f <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0382b(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int b3 = obj == null ? AbstractC0394n.b(this, null, 0) : AbstractC0394n.b(this, obj, obj.hashCode());
        if (b3 < 0) {
            return false;
        }
        a(b3);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        p2.g.e(collection, "elements");
        Iterator it = collection.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            z3 |= remove(it.next());
        }
        return z3;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        p2.g.e(collection, "elements");
        boolean z3 = false;
        for (int i3 = this.f4989f - 1; -1 < i3; i3--) {
            if (!AbstractC0240k.Z(collection, this.f4988e[i3])) {
                a(i3);
                z3 = true;
            }
        }
        return z3;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f4989f;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return AbstractC0239j.b0(this.f4988e, 0, this.f4989f);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f4989f * 14);
        sb.append('{');
        int i3 = this.f4989f;
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            Object obj = this.f4988e[i4];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        p2.g.d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        p2.g.e(objArr, "array");
        int i3 = this.f4989f;
        if (objArr.length < i3) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i3);
        } else if (objArr.length > i3) {
            objArr[i3] = null;
        }
        AbstractC0239j.Y(this.f4988e, objArr, 0, 0, this.f4989f);
        return objArr;
    }
}
