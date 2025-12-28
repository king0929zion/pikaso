package n;

import java.util.Arrays;

/* renamed from: n.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0404x {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f5050a = new Object[16];

    /* renamed from: b, reason: collision with root package name */
    public int f5051b;

    public final void a(Object obj) {
        int i3 = this.f5051b + 1;
        Object[] objArr = this.f5050a;
        if (objArr.length < i3) {
            Object[] copyOf = Arrays.copyOf(objArr, Math.max(i3, (objArr.length * 3) / 2));
            p2.g.d(copyOf, "copyOf(this, newSize)");
            this.f5050a = copyOf;
        }
        Object[] objArr2 = this.f5050a;
        int i4 = this.f5051b;
        objArr2[i4] = obj;
        this.f5051b = i4 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0404x) {
            C0404x c0404x = (C0404x) obj;
            int i3 = c0404x.f5051b;
            int i4 = this.f5051b;
            if (i3 == i4) {
                Object[] objArr = this.f5050a;
                Object[] objArr2 = c0404x.f5050a;
                u2.d R2 = Z.b.R(0, i4);
                int i5 = R2.f6300d;
                int i6 = R2.f6301e;
                if (i5 > i6) {
                    return true;
                }
                while (p2.g.a(objArr[i5], objArr2[i5])) {
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
        Object[] objArr = this.f5050a;
        int i3 = this.f5051b;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            Object obj = objArr[i5];
            i4 += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return i4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        Object[] objArr = this.f5050a;
        int i3 = this.f5051b;
        int i4 = 0;
        while (true) {
            if (i4 >= i3) {
                sb.append((CharSequence) "]");
                break;
            }
            Object obj = objArr[i4];
            if (i4 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i4 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) (obj == this ? "(this)" : String.valueOf(obj)));
            i4++;
        }
        String sb2 = sb.toString();
        p2.g.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
