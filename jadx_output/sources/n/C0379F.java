package n;

import A.AbstractC0000a;
import d2.AbstractC0239j;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import o.AbstractC0450a;

/* renamed from: n.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0379F {

    /* renamed from: d, reason: collision with root package name */
    public int[] f4968d;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f4969e;

    /* renamed from: f, reason: collision with root package name */
    public int f4970f;

    public C0379F(int i3) {
        this.f4968d = i3 == 0 ? AbstractC0450a.f5362a : new int[i3];
        this.f4969e = i3 == 0 ? AbstractC0450a.f5364c : new Object[i3 << 1];
    }

    public final int a(Object obj) {
        int i3 = this.f4970f * 2;
        Object[] objArr = this.f4969e;
        if (obj == null) {
            for (int i4 = 1; i4 < i3; i4 += 2) {
                if (objArr[i4] == null) {
                    return i4 >> 1;
                }
            }
            return -1;
        }
        for (int i5 = 1; i5 < i3; i5 += 2) {
            if (obj.equals(objArr[i5])) {
                return i5 >> 1;
            }
        }
        return -1;
    }

    public final void b(int i3) {
        int i4 = this.f4970f;
        int[] iArr = this.f4968d;
        if (iArr.length < i3) {
            int[] copyOf = Arrays.copyOf(iArr, i3);
            p2.g.d(copyOf, "copyOf(this, newSize)");
            this.f4968d = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f4969e, i3 * 2);
            p2.g.d(copyOf2, "copyOf(this, newSize)");
            this.f4969e = copyOf2;
        }
        if (this.f4970f != i4) {
            throw new ConcurrentModificationException();
        }
    }

    public final int c(int i3, Object obj) {
        int i4 = this.f4970f;
        if (i4 == 0) {
            return -1;
        }
        int a3 = AbstractC0450a.a(i4, i3, this.f4968d);
        if (a3 < 0 || p2.g.a(obj, this.f4969e[a3 << 1])) {
            return a3;
        }
        int i5 = a3 + 1;
        while (i5 < i4 && this.f4968d[i5] == i3) {
            if (p2.g.a(obj, this.f4969e[i5 << 1])) {
                return i5;
            }
            i5++;
        }
        for (int i6 = a3 - 1; i6 >= 0 && this.f4968d[i6] == i3; i6--) {
            if (p2.g.a(obj, this.f4969e[i6 << 1])) {
                return i6;
            }
        }
        return ~i5;
    }

    public final void clear() {
        if (this.f4970f > 0) {
            this.f4968d = AbstractC0450a.f5362a;
            this.f4969e = AbstractC0450a.f5364c;
            this.f4970f = 0;
        }
        if (this.f4970f > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return d(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final int d(Object obj) {
        return obj == null ? e() : c(obj.hashCode(), obj);
    }

    public final int e() {
        int i3 = this.f4970f;
        if (i3 == 0) {
            return -1;
        }
        int a3 = AbstractC0450a.a(i3, 0, this.f4968d);
        if (a3 < 0 || this.f4969e[a3 << 1] == null) {
            return a3;
        }
        int i4 = a3 + 1;
        while (i4 < i3 && this.f4968d[i4] == 0) {
            if (this.f4969e[i4 << 1] == null) {
                return i4;
            }
            i4++;
        }
        for (int i5 = a3 - 1; i5 >= 0 && this.f4968d[i5] == 0; i5--) {
            if (this.f4969e[i5 << 1] == null) {
                return i5;
            }
        }
        return ~i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof C0379F) {
                int i3 = this.f4970f;
                if (i3 != ((C0379F) obj).f4970f) {
                    return false;
                }
                C0379F c0379f = (C0379F) obj;
                for (int i4 = 0; i4 < i3; i4++) {
                    Object f3 = f(i4);
                    Object i5 = i(i4);
                    Object obj2 = c0379f.get(f3);
                    if (i5 == null) {
                        if (obj2 != null || !c0379f.containsKey(f3)) {
                            return false;
                        }
                    } else if (!i5.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f4970f != ((Map) obj).size()) {
                return false;
            }
            int i6 = this.f4970f;
            for (int i7 = 0; i7 < i6; i7++) {
                Object f4 = f(i7);
                Object i8 = i(i7);
                Object obj3 = ((Map) obj).get(f4);
                if (i8 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(f4)) {
                        return false;
                    }
                } else if (!i8.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i3) {
        if (i3 < 0 || i3 >= this.f4970f) {
            throw new IllegalArgumentException(AbstractC0000a.c("Expected index to be within 0..size()-1, but was ", i3).toString());
        }
        return this.f4969e[i3 << 1];
    }

    public final Object g(int i3) {
        int i4;
        if (i3 < 0 || i3 >= (i4 = this.f4970f)) {
            throw new IllegalArgumentException(AbstractC0000a.c("Expected index to be within 0..size()-1, but was ", i3).toString());
        }
        Object[] objArr = this.f4969e;
        int i5 = i3 << 1;
        Object obj = objArr[i5 + 1];
        if (i4 <= 1) {
            clear();
        } else {
            int i6 = i4 - 1;
            int[] iArr = this.f4968d;
            if (iArr.length <= 8 || i4 >= iArr.length / 3) {
                if (i3 < i6) {
                    int i7 = i3 + 1;
                    AbstractC0239j.X(i3, i7, i4, iArr, iArr);
                    Object[] objArr2 = this.f4969e;
                    AbstractC0239j.Y(objArr2, objArr2, i5, i7 << 1, i4 << 1);
                }
                Object[] objArr3 = this.f4969e;
                int i8 = i6 << 1;
                objArr3[i8] = null;
                objArr3[i8 + 1] = null;
            } else {
                int i9 = i4 > 8 ? i4 + (i4 >> 1) : 8;
                int[] copyOf = Arrays.copyOf(iArr, i9);
                p2.g.d(copyOf, "copyOf(this, newSize)");
                this.f4968d = copyOf;
                Object[] copyOf2 = Arrays.copyOf(this.f4969e, i9 << 1);
                p2.g.d(copyOf2, "copyOf(this, newSize)");
                this.f4969e = copyOf2;
                if (i4 != this.f4970f) {
                    throw new ConcurrentModificationException();
                }
                if (i3 > 0) {
                    AbstractC0239j.X(0, 0, i3, iArr, this.f4968d);
                    AbstractC0239j.Y(objArr, this.f4969e, 0, 0, i5);
                }
                if (i3 < i6) {
                    int i10 = i3 + 1;
                    AbstractC0239j.X(i3, i10, i4, iArr, this.f4968d);
                    AbstractC0239j.Y(objArr, this.f4969e, i5, i10 << 1, i4 << 1);
                }
            }
            if (i4 != this.f4970f) {
                throw new ConcurrentModificationException();
            }
            this.f4970f = i6;
        }
        return obj;
    }

    public Object get(Object obj) {
        int d3 = d(obj);
        if (d3 >= 0) {
            return this.f4969e[(d3 << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int d3 = d(obj);
        return d3 >= 0 ? this.f4969e[(d3 << 1) + 1] : obj2;
    }

    public final Object h(int i3, Object obj) {
        if (i3 < 0 || i3 >= this.f4970f) {
            throw new IllegalArgumentException(AbstractC0000a.c("Expected index to be within 0..size()-1, but was ", i3).toString());
        }
        int i4 = (i3 << 1) + 1;
        Object[] objArr = this.f4969e;
        Object obj2 = objArr[i4];
        objArr[i4] = obj;
        return obj2;
    }

    public final int hashCode() {
        int[] iArr = this.f4968d;
        Object[] objArr = this.f4969e;
        int i3 = this.f4970f;
        int i4 = 1;
        int i5 = 0;
        int i6 = 0;
        while (i5 < i3) {
            Object obj = objArr[i4];
            i6 += (obj != null ? obj.hashCode() : 0) ^ iArr[i5];
            i5++;
            i4 += 2;
        }
        return i6;
    }

    public final Object i(int i3) {
        if (i3 < 0 || i3 >= this.f4970f) {
            throw new IllegalArgumentException(AbstractC0000a.c("Expected index to be within 0..size()-1, but was ", i3).toString());
        }
        return this.f4969e[(i3 << 1) + 1];
    }

    public final boolean isEmpty() {
        return this.f4970f <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i3 = this.f4970f;
        int hashCode = obj != null ? obj.hashCode() : 0;
        int c3 = obj != null ? c(hashCode, obj) : e();
        if (c3 >= 0) {
            int i4 = (c3 << 1) + 1;
            Object[] objArr = this.f4969e;
            Object obj3 = objArr[i4];
            objArr[i4] = obj2;
            return obj3;
        }
        int i5 = ~c3;
        int[] iArr = this.f4968d;
        if (i3 >= iArr.length) {
            int i6 = 8;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i6 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i6);
            p2.g.d(copyOf, "copyOf(this, newSize)");
            this.f4968d = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f4969e, i6 << 1);
            p2.g.d(copyOf2, "copyOf(this, newSize)");
            this.f4969e = copyOf2;
            if (i3 != this.f4970f) {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr2 = this.f4968d;
            int i7 = i5 + 1;
            AbstractC0239j.X(i7, i5, i3, iArr2, iArr2);
            Object[] objArr2 = this.f4969e;
            AbstractC0239j.Y(objArr2, objArr2, i7 << 1, i5 << 1, this.f4970f << 1);
        }
        int i8 = this.f4970f;
        if (i3 == i8) {
            int[] iArr3 = this.f4968d;
            if (i5 < iArr3.length) {
                iArr3[i5] = hashCode;
                Object[] objArr3 = this.f4969e;
                int i9 = i5 << 1;
                objArr3[i9] = obj;
                objArr3[i9 + 1] = obj2;
                this.f4970f = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int d3 = d(obj);
        if (d3 >= 0) {
            return g(d3);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int d3 = d(obj);
        if (d3 >= 0) {
            return h(d3, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f4970f;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f4970f * 28);
        sb.append('{');
        int i3 = this.f4970f;
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            Object f3 = f(i4);
            if (f3 != sb) {
                sb.append(f3);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object i5 = i(i4);
            if (i5 != sb) {
                sb.append(i5);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        p2.g.d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public final boolean remove(Object obj, Object obj2) {
        int d3 = d(obj);
        if (d3 < 0 || !p2.g.a(obj2, i(d3))) {
            return false;
        }
        g(d3);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int d3 = d(obj);
        if (d3 < 0 || !p2.g.a(obj2, i(d3))) {
            return false;
        }
        h(d3, obj3);
        return true;
    }
}
