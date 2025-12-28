package U;

import d2.AbstractC0239j;
import java.util.Arrays;
import java.util.Comparator;
import n0.AbstractC0409C;
import n0.C0444z;

/* loaded from: classes.dex */
public final class s implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public static final s f2370a = new s();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        q qVar = (q) obj;
        q qVar2 = (q) obj2;
        if (qVar == null) {
            throw new IllegalArgumentException("compare requires non-null focus targets");
        }
        if (qVar2 == null) {
            throw new IllegalArgumentException("compare requires non-null focus targets");
        }
        int i3 = 0;
        if (!c.t(qVar) || !c.t(qVar2)) {
            if (c.t(qVar)) {
                return -1;
            }
            return c.t(qVar2) ? 1 : 0;
        }
        C0444z q3 = AbstractC0409C.q(qVar);
        C0444z q4 = AbstractC0409C.q(qVar2);
        if (p2.g.a(q3, q4)) {
            return 0;
        }
        Object[] objArr = new C0444z[16];
        int i4 = 0;
        while (q3 != null) {
            int i5 = i4 + 1;
            if (objArr.length < i5) {
                objArr = Arrays.copyOf(objArr, Math.max(i5, objArr.length * 2));
                p2.g.d(objArr, "copyOf(this, newSize)");
            }
            if (i4 != 0) {
                AbstractC0239j.Y(objArr, objArr, 0 + 1, 0, i4);
            }
            objArr[0] = q3;
            i4++;
            q3 = q3.k();
        }
        Object[] objArr2 = new C0444z[16];
        int i6 = 0;
        while (q4 != null) {
            int i7 = i6 + 1;
            if (objArr2.length < i7) {
                objArr2 = Arrays.copyOf(objArr2, Math.max(i7, objArr2.length * 2));
                p2.g.d(objArr2, "copyOf(this, newSize)");
            }
            if (i6 != 0) {
                AbstractC0239j.Y(objArr2, objArr2, 0 + 1, 0, i6);
            }
            objArr2[0] = q4;
            i6++;
            q4 = q4.k();
        }
        int min = Math.min(i4 - 1, i6 - 1);
        if (min >= 0) {
            while (p2.g.a(objArr[i3], objArr2[i3])) {
                if (i3 != min) {
                    i3++;
                }
            }
            return p2.g.f(((C0444z) objArr[i3]).l(), ((C0444z) objArr2[i3]).l());
        }
        throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
    }
}
