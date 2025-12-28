package d2;

import A.AbstractC0000a;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: d2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0238i extends AbstractC0235f {

    /* renamed from: g, reason: collision with root package name */
    public static final Object[] f4250g = new Object[0];

    /* renamed from: d, reason: collision with root package name */
    public int f4251d;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f4252e = f4250g;

    /* renamed from: f, reason: collision with root package name */
    public int f4253f;

    @Override // d2.AbstractC0235f
    public final int a() {
        return this.f4253f;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, Object obj) {
        int i4;
        int i5 = this.f4253f;
        if (i3 < 0 || i3 > i5) {
            throw new IndexOutOfBoundsException(AbstractC0000a.d("index: ", i3, ", size: ", i5));
        }
        if (i3 == i5) {
            c(obj);
            return;
        }
        if (i3 == 0) {
            e(i5 + 1);
            int i6 = this.f4251d;
            if (i6 == 0) {
                Object[] objArr = this.f4252e;
                p2.g.e(objArr, "<this>");
                i6 = objArr.length;
            }
            int i7 = i6 - 1;
            this.f4251d = i7;
            this.f4252e[i7] = obj;
            this.f4253f++;
            return;
        }
        e(i5 + 1);
        int g3 = g(this.f4251d + i3);
        int i8 = this.f4253f;
        if (i3 < ((i8 + 1) >> 1)) {
            if (g3 == 0) {
                Object[] objArr2 = this.f4252e;
                p2.g.e(objArr2, "<this>");
                i4 = objArr2.length - 1;
            } else {
                i4 = g3 - 1;
            }
            int i9 = this.f4251d;
            if (i9 == 0) {
                Object[] objArr3 = this.f4252e;
                p2.g.e(objArr3, "<this>");
                i9 = objArr3.length;
            }
            int i10 = i9 - 1;
            int i11 = this.f4251d;
            if (i4 >= i11) {
                Object[] objArr4 = this.f4252e;
                objArr4[i10] = objArr4[i11];
                AbstractC0239j.Y(objArr4, objArr4, i11, i11 + 1, i4 + 1);
            } else {
                Object[] objArr5 = this.f4252e;
                AbstractC0239j.Y(objArr5, objArr5, i11 - 1, i11, objArr5.length);
                Object[] objArr6 = this.f4252e;
                objArr6[objArr6.length - 1] = objArr6[0];
                AbstractC0239j.Y(objArr6, objArr6, 0, 1, i4 + 1);
            }
            this.f4252e[i4] = obj;
            this.f4251d = i10;
        } else {
            int g4 = g(i8 + this.f4251d);
            if (g3 < g4) {
                Object[] objArr7 = this.f4252e;
                AbstractC0239j.Y(objArr7, objArr7, g3 + 1, g3, g4);
            } else {
                Object[] objArr8 = this.f4252e;
                AbstractC0239j.Y(objArr8, objArr8, 1, 0, g4);
                Object[] objArr9 = this.f4252e;
                objArr9[0] = objArr9[objArr9.length - 1];
                AbstractC0239j.Y(objArr9, objArr9, g3 + 1, g3, objArr9.length - 1);
            }
            this.f4252e[g3] = obj;
        }
        this.f4253f++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i3, Collection collection) {
        p2.g.e(collection, "elements");
        int i4 = this.f4253f;
        if (i3 < 0 || i3 > i4) {
            throw new IndexOutOfBoundsException(AbstractC0000a.d("index: ", i3, ", size: ", i4));
        }
        if (collection.isEmpty()) {
            return false;
        }
        int i5 = this.f4253f;
        if (i3 == i5) {
            return addAll(collection);
        }
        e(collection.size() + i5);
        int g3 = g(this.f4253f + this.f4251d);
        int g4 = g(this.f4251d + i3);
        int size = collection.size();
        if (i3 < ((this.f4253f + 1) >> 1)) {
            int i6 = this.f4251d;
            int i7 = i6 - size;
            if (g4 < i6) {
                Object[] objArr = this.f4252e;
                AbstractC0239j.Y(objArr, objArr, i7, i6, objArr.length);
                if (size >= g4) {
                    Object[] objArr2 = this.f4252e;
                    AbstractC0239j.Y(objArr2, objArr2, objArr2.length - size, 0, g4);
                } else {
                    Object[] objArr3 = this.f4252e;
                    AbstractC0239j.Y(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f4252e;
                    AbstractC0239j.Y(objArr4, objArr4, 0, size, g4);
                }
            } else if (i7 >= 0) {
                Object[] objArr5 = this.f4252e;
                AbstractC0239j.Y(objArr5, objArr5, i7, i6, g4);
            } else {
                Object[] objArr6 = this.f4252e;
                i7 += objArr6.length;
                int i8 = g4 - i6;
                int length = objArr6.length - i7;
                if (length >= i8) {
                    AbstractC0239j.Y(objArr6, objArr6, i7, i6, g4);
                } else {
                    AbstractC0239j.Y(objArr6, objArr6, i7, i6, i6 + length);
                    Object[] objArr7 = this.f4252e;
                    AbstractC0239j.Y(objArr7, objArr7, 0, this.f4251d + length, g4);
                }
            }
            this.f4251d = i7;
            int i9 = g4 - size;
            if (i9 < 0) {
                i9 += this.f4252e.length;
            }
            d(i9, collection);
        } else {
            int i10 = g4 + size;
            if (g4 < g3) {
                int i11 = size + g3;
                Object[] objArr8 = this.f4252e;
                if (i11 <= objArr8.length) {
                    AbstractC0239j.Y(objArr8, objArr8, i10, g4, g3);
                } else if (i10 >= objArr8.length) {
                    AbstractC0239j.Y(objArr8, objArr8, i10 - objArr8.length, g4, g3);
                } else {
                    int length2 = g3 - (i11 - objArr8.length);
                    AbstractC0239j.Y(objArr8, objArr8, 0, length2, g3);
                    Object[] objArr9 = this.f4252e;
                    AbstractC0239j.Y(objArr9, objArr9, i10, g4, length2);
                }
            } else {
                Object[] objArr10 = this.f4252e;
                AbstractC0239j.Y(objArr10, objArr10, size, 0, g3);
                Object[] objArr11 = this.f4252e;
                if (i10 >= objArr11.length) {
                    AbstractC0239j.Y(objArr11, objArr11, i10 - objArr11.length, g4, objArr11.length);
                } else {
                    AbstractC0239j.Y(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f4252e;
                    AbstractC0239j.Y(objArr12, objArr12, i10, g4, objArr12.length - size);
                }
            }
            d(g4, collection);
        }
        return true;
    }

    @Override // d2.AbstractC0235f
    public final Object b(int i3) {
        int i4 = this.f4253f;
        if (i3 < 0 || i3 >= i4) {
            throw new IndexOutOfBoundsException(AbstractC0000a.d("index: ", i3, ", size: ", i4));
        }
        if (i3 == AbstractC0241l.T(this)) {
            if (isEmpty()) {
                throw new NoSuchElementException("ArrayDeque is empty.");
            }
            int g3 = g(AbstractC0241l.T(this) + this.f4251d);
            Object[] objArr = this.f4252e;
            Object obj = objArr[g3];
            objArr[g3] = null;
            this.f4253f--;
            return obj;
        }
        if (i3 == 0) {
            return h();
        }
        int g4 = g(this.f4251d + i3);
        Object[] objArr2 = this.f4252e;
        Object obj2 = objArr2[g4];
        if (i3 < (this.f4253f >> 1)) {
            int i5 = this.f4251d;
            if (g4 >= i5) {
                AbstractC0239j.Y(objArr2, objArr2, i5 + 1, i5, g4);
            } else {
                AbstractC0239j.Y(objArr2, objArr2, 1, 0, g4);
                Object[] objArr3 = this.f4252e;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i6 = this.f4251d;
                AbstractC0239j.Y(objArr3, objArr3, i6 + 1, i6, objArr3.length - 1);
            }
            Object[] objArr4 = this.f4252e;
            int i7 = this.f4251d;
            objArr4[i7] = null;
            this.f4251d = f(i7);
        } else {
            int g5 = g(AbstractC0241l.T(this) + this.f4251d);
            if (g4 <= g5) {
                Object[] objArr5 = this.f4252e;
                AbstractC0239j.Y(objArr5, objArr5, g4, g4 + 1, g5 + 1);
            } else {
                Object[] objArr6 = this.f4252e;
                AbstractC0239j.Y(objArr6, objArr6, g4, g4 + 1, objArr6.length);
                Object[] objArr7 = this.f4252e;
                objArr7[objArr7.length - 1] = objArr7[0];
                AbstractC0239j.Y(objArr7, objArr7, 0, 1, g5 + 1);
            }
            this.f4252e[g5] = null;
        }
        this.f4253f--;
        return obj2;
    }

    public final void c(Object obj) {
        e(a() + 1);
        this.f4252e[g(a() + this.f4251d)] = obj;
        this.f4253f = a() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int g3 = g(this.f4253f + this.f4251d);
        int i3 = this.f4251d;
        if (i3 < g3) {
            AbstractC0239j.c0(this.f4252e, i3, g3);
        } else if (!isEmpty()) {
            Object[] objArr = this.f4252e;
            AbstractC0239j.c0(objArr, this.f4251d, objArr.length);
            AbstractC0239j.c0(this.f4252e, 0, g3);
        }
        this.f4251d = 0;
        this.f4253f = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i3, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f4252e.length;
        while (i3 < length && it.hasNext()) {
            this.f4252e[i3] = it.next();
            i3++;
        }
        int i4 = this.f4251d;
        for (int i5 = 0; i5 < i4 && it.hasNext(); i5++) {
            this.f4252e[i5] = it.next();
        }
        this.f4253f = collection.size() + a();
    }

    public final void e(int i3) {
        if (i3 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f4252e;
        if (i3 <= objArr.length) {
            return;
        }
        if (objArr == f4250g) {
            if (i3 < 10) {
                i3 = 10;
            }
            this.f4252e = new Object[i3];
            return;
        }
        int length = objArr.length;
        int i4 = length + (length >> 1);
        if (i4 - i3 < 0) {
            i4 = i3;
        }
        if (i4 - 2147483639 > 0) {
            i4 = i3 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i4];
        AbstractC0239j.Y(objArr, objArr2, 0, this.f4251d, objArr.length);
        Object[] objArr3 = this.f4252e;
        int length2 = objArr3.length;
        int i5 = this.f4251d;
        AbstractC0239j.Y(objArr3, objArr2, length2 - i5, 0, i5);
        this.f4251d = 0;
        this.f4252e = objArr2;
    }

    public final int f(int i3) {
        p2.g.e(this.f4252e, "<this>");
        if (i3 == r0.length - 1) {
            return 0;
        }
        return i3 + 1;
    }

    public final int g(int i3) {
        Object[] objArr = this.f4252e;
        return i3 >= objArr.length ? i3 - objArr.length : i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i3) {
        int a3 = a();
        if (i3 < 0 || i3 >= a3) {
            throw new IndexOutOfBoundsException(AbstractC0000a.d("index: ", i3, ", size: ", a3));
        }
        return this.f4252e[g(this.f4251d + i3)];
    }

    public final Object h() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        Object[] objArr = this.f4252e;
        int i3 = this.f4251d;
        Object obj = objArr[i3];
        objArr[i3] = null;
        this.f4251d = f(i3);
        this.f4253f = a() - 1;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i3;
        int g3 = g(a() + this.f4251d);
        int i4 = this.f4251d;
        if (i4 < g3) {
            while (i4 < g3) {
                if (p2.g.a(obj, this.f4252e[i4])) {
                    i3 = this.f4251d;
                } else {
                    i4++;
                }
            }
            return -1;
        }
        if (i4 < g3) {
            return -1;
        }
        int length = this.f4252e.length;
        while (true) {
            if (i4 >= length) {
                for (int i5 = 0; i5 < g3; i5++) {
                    if (p2.g.a(obj, this.f4252e[i5])) {
                        i4 = i5 + this.f4252e.length;
                        i3 = this.f4251d;
                    }
                }
                return -1;
            }
            if (p2.g.a(obj, this.f4252e[i4])) {
                i3 = this.f4251d;
                break;
            }
            i4++;
        }
        return i4 - i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return a() == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i3;
        int g3 = g(this.f4253f + this.f4251d);
        int i4 = this.f4251d;
        if (i4 < g3) {
            length = g3 - 1;
            if (i4 <= length) {
                while (!p2.g.a(obj, this.f4252e[length])) {
                    if (length != i4) {
                        length--;
                    }
                }
                i3 = this.f4251d;
                return length - i3;
            }
            return -1;
        }
        if (i4 > g3) {
            int i5 = g3 - 1;
            while (true) {
                if (-1 >= i5) {
                    Object[] objArr = this.f4252e;
                    p2.g.e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i6 = this.f4251d;
                    if (i6 <= length) {
                        while (!p2.g.a(obj, this.f4252e[length])) {
                            if (length != i6) {
                                length--;
                            }
                        }
                        i3 = this.f4251d;
                    }
                } else {
                    if (p2.g.a(obj, this.f4252e[i5])) {
                        length = i5 + this.f4252e.length;
                        i3 = this.f4251d;
                        break;
                    }
                    i5--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        b(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int g3;
        p2.g.e(collection, "elements");
        boolean z3 = false;
        z3 = false;
        z3 = false;
        if (!isEmpty() && this.f4252e.length != 0) {
            int g4 = g(this.f4253f + this.f4251d);
            int i3 = this.f4251d;
            if (i3 < g4) {
                g3 = i3;
                while (i3 < g4) {
                    Object obj = this.f4252e[i3];
                    if (collection.contains(obj)) {
                        z3 = true;
                    } else {
                        this.f4252e[g3] = obj;
                        g3++;
                    }
                    i3++;
                }
                AbstractC0239j.c0(this.f4252e, g3, g4);
            } else {
                int length = this.f4252e.length;
                boolean z4 = false;
                int i4 = i3;
                while (i3 < length) {
                    Object[] objArr = this.f4252e;
                    Object obj2 = objArr[i3];
                    objArr[i3] = null;
                    if (collection.contains(obj2)) {
                        z4 = true;
                    } else {
                        this.f4252e[i4] = obj2;
                        i4++;
                    }
                    i3++;
                }
                g3 = g(i4);
                for (int i5 = 0; i5 < g4; i5++) {
                    Object[] objArr2 = this.f4252e;
                    Object obj3 = objArr2[i5];
                    objArr2[i5] = null;
                    if (collection.contains(obj3)) {
                        z4 = true;
                    } else {
                        this.f4252e[g3] = obj3;
                        g3 = f(g3);
                    }
                }
                z3 = z4;
            }
            if (z3) {
                int i6 = g3 - this.f4251d;
                if (i6 < 0) {
                    i6 += this.f4252e.length;
                }
                this.f4253f = i6;
            }
        }
        return z3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int g3;
        p2.g.e(collection, "elements");
        boolean z3 = false;
        z3 = false;
        z3 = false;
        if (!isEmpty() && this.f4252e.length != 0) {
            int g4 = g(this.f4253f + this.f4251d);
            int i3 = this.f4251d;
            if (i3 < g4) {
                g3 = i3;
                while (i3 < g4) {
                    Object obj = this.f4252e[i3];
                    if (collection.contains(obj)) {
                        this.f4252e[g3] = obj;
                        g3++;
                    } else {
                        z3 = true;
                    }
                    i3++;
                }
                AbstractC0239j.c0(this.f4252e, g3, g4);
            } else {
                int length = this.f4252e.length;
                boolean z4 = false;
                int i4 = i3;
                while (i3 < length) {
                    Object[] objArr = this.f4252e;
                    Object obj2 = objArr[i3];
                    objArr[i3] = null;
                    if (collection.contains(obj2)) {
                        this.f4252e[i4] = obj2;
                        i4++;
                    } else {
                        z4 = true;
                    }
                    i3++;
                }
                g3 = g(i4);
                for (int i5 = 0; i5 < g4; i5++) {
                    Object[] objArr2 = this.f4252e;
                    Object obj3 = objArr2[i5];
                    objArr2[i5] = null;
                    if (collection.contains(obj3)) {
                        this.f4252e[g3] = obj3;
                        g3 = f(g3);
                    } else {
                        z4 = true;
                    }
                }
                z3 = z4;
            }
            if (z3) {
                int i6 = g3 - this.f4251d;
                if (i6 < 0) {
                    i6 += this.f4252e.length;
                }
                this.f4253f = i6;
            }
        }
        return z3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i3, Object obj) {
        int a3 = a();
        if (i3 < 0 || i3 >= a3) {
            throw new IndexOutOfBoundsException(AbstractC0000a.d("index: ", i3, ", size: ", a3));
        }
        int g3 = g(this.f4251d + i3);
        Object[] objArr = this.f4252e;
        Object obj2 = objArr[g3];
        objArr[g3] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        p2.g.e(objArr, "array");
        int length = objArr.length;
        int i3 = this.f4253f;
        if (length < i3) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i3);
            p2.g.c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) newInstance;
        }
        int g3 = g(this.f4253f + this.f4251d);
        int i4 = this.f4251d;
        if (i4 < g3) {
            AbstractC0239j.a0(this.f4252e, objArr, i4, g3, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f4252e;
            AbstractC0239j.Y(objArr2, objArr, 0, this.f4251d, objArr2.length);
            Object[] objArr3 = this.f4252e;
            AbstractC0239j.Y(objArr3, objArr, objArr3.length - this.f4251d, 0, g3);
        }
        int i5 = this.f4253f;
        if (i5 < objArr.length) {
            objArr[i5] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        c(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        p2.g.e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        e(collection.size() + a());
        d(g(a() + this.f4251d), collection);
        return true;
    }
}
