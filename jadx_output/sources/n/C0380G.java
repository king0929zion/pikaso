package n;

import d2.AbstractC0239j;
import java.util.Arrays;
import o.AbstractC0450a;

/* renamed from: n.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0380G implements Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ int[] f4971d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object[] f4972e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ int f4973f;

    public C0380G(int i3) {
        int i4;
        int i5 = 4;
        while (true) {
            i4 = 40;
            if (i5 >= 32) {
                break;
            }
            int i6 = (1 << i5) - 12;
            if (40 <= i6) {
                i4 = i6;
                break;
            }
            i5++;
        }
        int i7 = i4 / 4;
        this.f4971d = new int[i7];
        this.f4972e = new Object[i7];
    }

    public final void a(int i3, Object obj) {
        int i4 = this.f4973f;
        if (i4 != 0 && i3 <= this.f4971d[i4 - 1]) {
            d(i3, obj);
            return;
        }
        if (i4 >= this.f4971d.length) {
            int i5 = (i4 + 1) * 4;
            int i6 = 4;
            while (true) {
                if (i6 >= 32) {
                    break;
                }
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
                i6++;
            }
            int i8 = i5 / 4;
            int[] copyOf = Arrays.copyOf(this.f4971d, i8);
            p2.g.d(copyOf, "copyOf(this, newSize)");
            this.f4971d = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f4972e, i8);
            p2.g.d(copyOf2, "copyOf(this, newSize)");
            this.f4972e = copyOf2;
        }
        this.f4971d[i4] = i3;
        this.f4972e[i4] = obj;
        this.f4973f = i4 + 1;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0380G clone() {
        Object clone = super.clone();
        p2.g.c(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        C0380G c0380g = (C0380G) clone;
        c0380g.f4971d = (int[]) this.f4971d.clone();
        c0380g.f4972e = (Object[]) this.f4972e.clone();
        return c0380g;
    }

    public final Object c(int i3) {
        Object obj;
        int a3 = AbstractC0450a.a(this.f4973f, i3, this.f4971d);
        if (a3 < 0 || (obj = this.f4972e[a3]) == AbstractC0394n.f5001c) {
            return null;
        }
        return obj;
    }

    public final void d(int i3, Object obj) {
        int a3 = AbstractC0450a.a(this.f4973f, i3, this.f4971d);
        if (a3 >= 0) {
            this.f4972e[a3] = obj;
            return;
        }
        int i4 = ~a3;
        int i5 = this.f4973f;
        if (i4 < i5) {
            Object[] objArr = this.f4972e;
            if (objArr[i4] == AbstractC0394n.f5001c) {
                this.f4971d[i4] = i3;
                objArr[i4] = obj;
                return;
            }
        }
        if (i5 >= this.f4971d.length) {
            int i6 = (i5 + 1) * 4;
            int i7 = 4;
            while (true) {
                if (i7 >= 32) {
                    break;
                }
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
                i7++;
            }
            int i9 = i6 / 4;
            int[] copyOf = Arrays.copyOf(this.f4971d, i9);
            p2.g.d(copyOf, "copyOf(this, newSize)");
            this.f4971d = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f4972e, i9);
            p2.g.d(copyOf2, "copyOf(this, newSize)");
            this.f4972e = copyOf2;
        }
        int i10 = this.f4973f;
        if (i10 - i4 != 0) {
            int[] iArr = this.f4971d;
            int i11 = i4 + 1;
            AbstractC0239j.X(i11, i4, i10, iArr, iArr);
            Object[] objArr2 = this.f4972e;
            AbstractC0239j.Y(objArr2, objArr2, i11, i4, this.f4973f);
        }
        this.f4971d[i4] = i3;
        this.f4972e[i4] = obj;
        this.f4973f++;
    }

    public final String toString() {
        int i3 = this.f4973f;
        if (i3 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i3 * 28);
        sb.append('{');
        int i4 = this.f4973f;
        for (int i5 = 0; i5 < i4; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            sb.append(this.f4971d[i5]);
            sb.append('=');
            Object obj = this.f4972e[i5];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        p2.g.d(sb2, "buffer.toString()");
        return sb2;
    }
}
