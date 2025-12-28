package n;

import d2.AbstractC0239j;
import java.util.Arrays;

/* renamed from: n.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0397q {

    /* renamed from: a, reason: collision with root package name */
    public int[] f5014a;

    /* renamed from: b, reason: collision with root package name */
    public int f5015b;

    public C0397q(int i3) {
        this.f5014a = i3 == 0 ? AbstractC0391k.f4993a : new int[i3];
    }

    public final void a(int i3) {
        int i4 = this.f5015b + 1;
        int[] iArr = this.f5014a;
        if (iArr.length < i4) {
            int[] copyOf = Arrays.copyOf(iArr, Math.max(i4, (iArr.length * 3) / 2));
            p2.g.d(copyOf, "copyOf(this, newSize)");
            this.f5014a = copyOf;
        }
        int[] iArr2 = this.f5014a;
        int i5 = this.f5015b;
        iArr2[i5] = i3;
        this.f5015b = i5 + 1;
    }

    public final int b(int i3) {
        if (i3 >= 0 && i3 < this.f5015b) {
            return this.f5014a[i3];
        }
        StringBuilder sb = new StringBuilder("Index ");
        sb.append(i3);
        sb.append(" must be in 0..");
        sb.append(this.f5015b - 1);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final int c(int i3) {
        int i4;
        if (i3 < 0 || i3 >= (i4 = this.f5015b)) {
            StringBuilder sb = new StringBuilder("Index ");
            sb.append(i3);
            sb.append(" must be in 0..");
            sb.append(this.f5015b - 1);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        int[] iArr = this.f5014a;
        int i5 = iArr[i3];
        if (i3 != i4 - 1) {
            AbstractC0239j.X(i3, i3 + 1, i4, iArr, iArr);
        }
        this.f5015b--;
        return i5;
    }

    public final void d(int i3, int i4) {
        if (i3 >= 0 && i3 < this.f5015b) {
            int[] iArr = this.f5014a;
            int i5 = iArr[i3];
            iArr[i3] = i4;
        } else {
            StringBuilder sb = new StringBuilder("set index ");
            sb.append(i3);
            sb.append(" must be between 0 .. ");
            sb.append(this.f5015b - 1);
            throw new IndexOutOfBoundsException(sb.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0397q) {
            C0397q c0397q = (C0397q) obj;
            int i3 = c0397q.f5015b;
            int i4 = this.f5015b;
            if (i3 == i4) {
                int[] iArr = this.f5014a;
                int[] iArr2 = c0397q.f5014a;
                u2.d R2 = Z.b.R(0, i4);
                int i5 = R2.f6300d;
                int i6 = R2.f6301e;
                if (i5 > i6) {
                    return true;
                }
                while (iArr[i5] == iArr2[i5]) {
                    if (i5 == i6) {
                        return true;
                    }
                    i5++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.f5014a;
        int i3 = this.f5015b;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            i4 += Integer.hashCode(iArr[i5]) * 31;
        }
        return i4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.f5014a;
        int i3 = this.f5015b;
        int i4 = 0;
        while (true) {
            if (i4 >= i3) {
                sb.append((CharSequence) "]");
                break;
            }
            int i5 = iArr[i4];
            if (i4 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i4 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(i5);
            i4++;
        }
        String sb2 = sb.toString();
        p2.g.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public /* synthetic */ C0397q() {
        this(16);
    }
}
