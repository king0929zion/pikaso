package M1;

import android.view.View;
import d1.C0201X;
import d1.l0;
import d2.AbstractC0239j;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n0.AbstractC0418L;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public int f1695a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1696b;

    /* renamed from: c, reason: collision with root package name */
    public int f1697c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1698d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1699e;

    public int a(int i3) {
        int i4 = this.f1695a + 1;
        int[] iArr = (int[]) this.f1696b;
        int length = iArr.length;
        if (i4 > length) {
            int i5 = length * 2;
            int[] iArr2 = new int[i5];
            int[] iArr3 = new int[i5];
            AbstractC0239j.Z(0, 0, 14, iArr, iArr2);
            AbstractC0239j.Z(0, 0, 14, (int[]) this.f1698d, iArr3);
            this.f1696b = iArr2;
            this.f1698d = iArr3;
        }
        int i6 = this.f1695a;
        this.f1695a = i6 + 1;
        int length2 = ((int[]) this.f1699e).length;
        if (this.f1697c >= length2) {
            int i7 = length2 * 2;
            int[] iArr4 = new int[i7];
            int i8 = 0;
            while (i8 < i7) {
                int i9 = i8 + 1;
                iArr4[i8] = i9;
                i8 = i9;
            }
            AbstractC0239j.Z(0, 0, 14, (int[]) this.f1699e, iArr4);
            this.f1699e = iArr4;
        }
        int i10 = this.f1697c;
        int[] iArr5 = (int[]) this.f1699e;
        this.f1697c = iArr5[i10];
        int[] iArr6 = (int[]) this.f1696b;
        iArr6[i6] = i3;
        ((int[]) this.f1698d)[i6] = i10;
        iArr5[i10] = i6;
        int i11 = iArr6[i6];
        while (i6 > 0) {
            int i12 = ((i6 + 1) >> 1) - 1;
            if (iArr6[i12] <= i11) {
                break;
            }
            h(i12, i6);
            i6 = i12;
        }
        return i10;
    }

    public Map b() {
        return (Map) this.f1698d;
    }

    public int c() {
        return this.f1697c;
    }

    public o2.c d() {
        return null;
    }

    public int e() {
        return this.f1695a;
    }

    public void f(l0 l0Var, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if ((((C0201X) it.next()).f4175a.c() & 8) != 0) {
                ((View) this.f1699e).setTranslationY(I1.a.c(r3.f4175a.b(), this.f1697c, 0));
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [o2.c, p2.h] */
    public void g() {
        ((p2.h) this.f1699e).i(((AbstractC0418L) this.f1696b).f5165k);
    }

    public void h(int i3, int i4) {
        int[] iArr = (int[]) this.f1696b;
        int[] iArr2 = (int[]) this.f1698d;
        int[] iArr3 = (int[]) this.f1699e;
        int i5 = iArr[i3];
        iArr[i3] = iArr[i4];
        iArr[i4] = i5;
        int i6 = iArr2[i3];
        iArr2[i3] = iArr2[i4];
        iArr2[i4] = i6;
        iArr3[iArr2[i3]] = i3;
        iArr3[iArr2[i4]] = i4;
    }
}
