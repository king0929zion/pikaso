package n;

import A.AbstractC0000a;
import d2.AbstractC0239j;
import java.util.Arrays;
import o.AbstractC0450a;

/* renamed from: n.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0393m implements Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ boolean f4995d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ long[] f4996e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object[] f4997f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ int f4998g;

    public C0393m(int i3) {
        if (i3 == 0) {
            this.f4996e = AbstractC0450a.f5363b;
            this.f4997f = AbstractC0450a.f5364c;
            return;
        }
        int i4 = i3 * 8;
        int i5 = 4;
        while (true) {
            if (i5 >= 32) {
                break;
            }
            int i6 = (1 << i5) - 12;
            if (i4 <= i6) {
                i4 = i6;
                break;
            }
            i5++;
        }
        int i7 = i4 / 8;
        this.f4996e = new long[i7];
        this.f4997f = new Object[i7];
    }

    public final void a() {
        int i3 = this.f4998g;
        Object[] objArr = this.f4997f;
        for (int i4 = 0; i4 < i3; i4++) {
            objArr[i4] = null;
        }
        this.f4998g = 0;
        this.f4995d = false;
    }

    public final Object b(long j3) {
        Object obj;
        int b3 = AbstractC0450a.b(this.f4996e, this.f4998g, j3);
        if (b3 < 0 || (obj = this.f4997f[b3]) == AbstractC0394n.f4999a) {
            return null;
        }
        return obj;
    }

    public final int c(long j3) {
        if (this.f4995d) {
            int i3 = this.f4998g;
            long[] jArr = this.f4996e;
            Object[] objArr = this.f4997f;
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                Object obj = objArr[i5];
                if (obj != AbstractC0394n.f4999a) {
                    if (i5 != i4) {
                        jArr[i4] = jArr[i5];
                        objArr[i4] = obj;
                        objArr[i5] = null;
                    }
                    i4++;
                }
            }
            this.f4995d = false;
            this.f4998g = i4;
        }
        return AbstractC0450a.b(this.f4996e, this.f4998g, j3);
    }

    public final Object clone() {
        Object clone = super.clone();
        p2.g.c(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        C0393m c0393m = (C0393m) clone;
        c0393m.f4996e = (long[]) this.f4996e.clone();
        c0393m.f4997f = (Object[]) this.f4997f.clone();
        return c0393m;
    }

    public final long d(int i3) {
        int i4;
        if (i3 < 0 || i3 >= (i4 = this.f4998g)) {
            throw new IllegalArgumentException(AbstractC0000a.c("Expected index to be within 0..size()-1, but was ", i3).toString());
        }
        if (this.f4995d) {
            long[] jArr = this.f4996e;
            Object[] objArr = this.f4997f;
            int i5 = 0;
            for (int i6 = 0; i6 < i4; i6++) {
                Object obj = objArr[i6];
                if (obj != AbstractC0394n.f4999a) {
                    if (i6 != i5) {
                        jArr[i5] = jArr[i6];
                        objArr[i5] = obj;
                        objArr[i6] = null;
                    }
                    i5++;
                }
            }
            this.f4995d = false;
            this.f4998g = i5;
        }
        return this.f4996e[i3];
    }

    public final void e(long j3, Object obj) {
        int b3 = AbstractC0450a.b(this.f4996e, this.f4998g, j3);
        if (b3 >= 0) {
            this.f4997f[b3] = obj;
            return;
        }
        int i3 = ~b3;
        int i4 = this.f4998g;
        Object obj2 = AbstractC0394n.f4999a;
        if (i3 < i4) {
            Object[] objArr = this.f4997f;
            if (objArr[i3] == obj2) {
                this.f4996e[i3] = j3;
                objArr[i3] = obj;
                return;
            }
        }
        if (this.f4995d) {
            long[] jArr = this.f4996e;
            if (i4 >= jArr.length) {
                Object[] objArr2 = this.f4997f;
                int i5 = 0;
                for (int i6 = 0; i6 < i4; i6++) {
                    Object obj3 = objArr2[i6];
                    if (obj3 != obj2) {
                        if (i6 != i5) {
                            jArr[i5] = jArr[i6];
                            objArr2[i5] = obj3;
                            objArr2[i6] = null;
                        }
                        i5++;
                    }
                }
                this.f4995d = false;
                this.f4998g = i5;
                i3 = ~AbstractC0450a.b(this.f4996e, i5, j3);
            }
        }
        int i7 = this.f4998g;
        if (i7 >= this.f4996e.length) {
            int i8 = (i7 + 1) * 8;
            int i9 = 4;
            while (true) {
                if (i9 >= 32) {
                    break;
                }
                int i10 = (1 << i9) - 12;
                if (i8 <= i10) {
                    i8 = i10;
                    break;
                }
                i9++;
            }
            int i11 = i8 / 8;
            long[] copyOf = Arrays.copyOf(this.f4996e, i11);
            p2.g.d(copyOf, "copyOf(this, newSize)");
            this.f4996e = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f4997f, i11);
            p2.g.d(copyOf2, "copyOf(this, newSize)");
            this.f4997f = copyOf2;
        }
        int i12 = this.f4998g - i3;
        if (i12 != 0) {
            long[] jArr2 = this.f4996e;
            int i13 = i3 + 1;
            p2.g.e(jArr2, "<this>");
            System.arraycopy(jArr2, i3, jArr2, i13, i12);
            Object[] objArr3 = this.f4997f;
            AbstractC0239j.Y(objArr3, objArr3, i13, i3, this.f4998g);
        }
        this.f4996e[i3] = j3;
        this.f4997f[i3] = obj;
        this.f4998g++;
    }

    public final void f(long j3) {
        int b3 = AbstractC0450a.b(this.f4996e, this.f4998g, j3);
        if (b3 >= 0) {
            Object[] objArr = this.f4997f;
            Object obj = objArr[b3];
            Object obj2 = AbstractC0394n.f4999a;
            if (obj != obj2) {
                objArr[b3] = obj2;
                this.f4995d = true;
            }
        }
    }

    public final int g() {
        if (this.f4995d) {
            int i3 = this.f4998g;
            long[] jArr = this.f4996e;
            Object[] objArr = this.f4997f;
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                Object obj = objArr[i5];
                if (obj != AbstractC0394n.f4999a) {
                    if (i5 != i4) {
                        jArr[i4] = jArr[i5];
                        objArr[i4] = obj;
                        objArr[i5] = null;
                    }
                    i4++;
                }
            }
            this.f4995d = false;
            this.f4998g = i4;
        }
        return this.f4998g;
    }

    public final Object h(int i3) {
        int i4;
        if (i3 < 0 || i3 >= (i4 = this.f4998g)) {
            throw new IllegalArgumentException(AbstractC0000a.c("Expected index to be within 0..size()-1, but was ", i3).toString());
        }
        if (this.f4995d) {
            long[] jArr = this.f4996e;
            Object[] objArr = this.f4997f;
            int i5 = 0;
            for (int i6 = 0; i6 < i4; i6++) {
                Object obj = objArr[i6];
                if (obj != AbstractC0394n.f4999a) {
                    if (i6 != i5) {
                        jArr[i5] = jArr[i6];
                        objArr[i5] = obj;
                        objArr[i6] = null;
                    }
                    i5++;
                }
            }
            this.f4995d = false;
            this.f4998g = i5;
        }
        return this.f4997f[i3];
    }

    public final String toString() {
        if (g() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f4998g * 28);
        sb.append('{');
        int i3 = this.f4998g;
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            sb.append(d(i4));
            sb.append('=');
            Object h = h(i4);
            if (h != sb) {
                sb.append(h);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        p2.g.d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public /* synthetic */ C0393m(Object obj) {
        this(10);
    }
}
