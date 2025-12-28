package u2;

import java.util.Iterator;

/* loaded from: classes.dex */
public class b implements Iterable, q2.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f6300d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6301e;

    /* renamed from: f, reason: collision with root package name */
    public final int f6302f;

    public b(int i3, int i4, int i5) {
        if (i5 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i5 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f6300d = i3;
        if (i5 > 0) {
            if (i3 < i4) {
                int i6 = i4 % i5;
                int i7 = i3 % i5;
                int i8 = ((i6 < 0 ? i6 + i5 : i6) - (i7 < 0 ? i7 + i5 : i7)) % i5;
                i4 -= i8 < 0 ? i8 + i5 : i8;
            }
        } else {
            if (i5 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i3 > i4) {
                int i9 = -i5;
                int i10 = i3 % i9;
                int i11 = i4 % i9;
                int i12 = ((i10 < 0 ? i10 + i9 : i10) - (i11 < 0 ? i11 + i9 : i11)) % i9;
                i4 += i12 < 0 ? i12 + i9 : i12;
            }
        }
        this.f6301e = i4;
        this.f6302f = i5;
    }

    public boolean equals(Object obj) {
        if (obj instanceof b) {
            if (!isEmpty() || !((b) obj).isEmpty()) {
                b bVar = (b) obj;
                if (this.f6300d != bVar.f6300d || this.f6301e != bVar.f6301e || this.f6302f != bVar.f6302f) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f6300d * 31) + this.f6301e) * 31) + this.f6302f;
    }

    public boolean isEmpty() {
        int i3 = this.f6302f;
        int i4 = this.f6301e;
        int i5 = this.f6300d;
        if (i3 > 0) {
            if (i5 <= i4) {
                return false;
            }
        } else if (i5 >= i4) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new c(this.f6300d, this.f6301e, this.f6302f);
    }

    public String toString() {
        StringBuilder sb;
        int i3 = this.f6301e;
        int i4 = this.f6300d;
        int i5 = this.f6302f;
        if (i5 > 0) {
            sb = new StringBuilder();
            sb.append(i4);
            sb.append("..");
            sb.append(i3);
            sb.append(" step ");
            sb.append(i5);
        } else {
            sb = new StringBuilder();
            sb.append(i4);
            sb.append(" downTo ");
            sb.append(i3);
            sb.append(" step ");
            sb.append(-i5);
        }
        return sb.toString();
    }
}
