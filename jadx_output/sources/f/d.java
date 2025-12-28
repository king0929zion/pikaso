package F;

import d2.AbstractC0239j;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import p2.g;

/* loaded from: classes.dex */
public final class d implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public Object[] f1158d;

    /* renamed from: e, reason: collision with root package name */
    public a f1159e;

    /* renamed from: f, reason: collision with root package name */
    public int f1160f = 0;

    public d(Object[] objArr) {
        this.f1158d = objArr;
    }

    public final void a(int i3, Object obj) {
        i(this.f1160f + 1);
        Object[] objArr = this.f1158d;
        int i4 = this.f1160f;
        if (i3 != i4) {
            AbstractC0239j.Y(objArr, objArr, i3 + 1, i3, i4);
        }
        objArr[i3] = obj;
        this.f1160f++;
    }

    public final void b(Object obj) {
        i(this.f1160f + 1);
        Object[] objArr = this.f1158d;
        int i3 = this.f1160f;
        objArr[i3] = obj;
        this.f1160f = i3 + 1;
    }

    public final void c(int i3, d dVar) {
        if (dVar.j()) {
            return;
        }
        i(this.f1160f + dVar.f1160f);
        Object[] objArr = this.f1158d;
        int i4 = this.f1160f;
        if (i3 != i4) {
            AbstractC0239j.Y(objArr, objArr, dVar.f1160f + i3, i3, i4);
        }
        AbstractC0239j.Y(dVar.f1158d, objArr, i3, 0, dVar.f1160f);
        this.f1160f += dVar.f1160f;
    }

    public final void d(int i3, List list) {
        if (list.isEmpty()) {
            return;
        }
        i(list.size() + this.f1160f);
        Object[] objArr = this.f1158d;
        if (i3 != this.f1160f) {
            AbstractC0239j.Y(objArr, objArr, list.size() + i3, i3, this.f1160f);
        }
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            objArr[i3 + i4] = list.get(i4);
        }
        this.f1160f = list.size() + this.f1160f;
    }

    public final boolean e(int i3, Collection collection) {
        int i4 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        i(collection.size() + this.f1160f);
        Object[] objArr = this.f1158d;
        if (i3 != this.f1160f) {
            AbstractC0239j.Y(objArr, objArr, collection.size() + i3, i3, this.f1160f);
        }
        for (Object obj : collection) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            objArr[i4 + i3] = obj;
            i4 = i5;
        }
        this.f1160f = collection.size() + this.f1160f;
        return true;
    }

    public final List f() {
        a aVar = this.f1159e;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(this);
        this.f1159e = aVar2;
        return aVar2;
    }

    public final void g() {
        Object[] objArr = this.f1158d;
        int i3 = this.f1160f;
        while (true) {
            i3--;
            if (-1 >= i3) {
                this.f1160f = 0;
                return;
            }
            objArr[i3] = null;
        }
    }

    public final boolean h(Object obj) {
        int i3 = this.f1160f - 1;
        if (i3 >= 0) {
            for (int i4 = 0; !g.a(this.f1158d[i4], obj); i4++) {
                if (i4 != i3) {
                }
            }
            return true;
        }
        return false;
    }

    public final void i(int i3) {
        Object[] objArr = this.f1158d;
        if (objArr.length < i3) {
            Object[] copyOf = Arrays.copyOf(objArr, Math.max(i3, objArr.length * 2));
            g.d(copyOf, "copyOf(this, newSize)");
            this.f1158d = copyOf;
        }
    }

    public final boolean j() {
        return this.f1160f == 0;
    }

    public final boolean k() {
        return this.f1160f != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x001d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.f1160f
            r1 = 0
            if (r0 <= 0) goto L15
            java.lang.Object[] r2 = r5.f1158d
            r3 = r1
        L8:
            r4 = r2[r3]
            boolean r4 = p2.g.a(r6, r4)
            if (r4 == 0) goto L11
            goto L16
        L11:
            int r3 = r3 + 1
            if (r3 < r0) goto L8
        L15:
            r3 = -1
        L16:
            if (r3 < 0) goto L1d
            r5.m(r3)
            r6 = 1
            return r6
        L1d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: F.d.l(java.lang.Object):boolean");
    }

    public final Object m(int i3) {
        Object[] objArr = this.f1158d;
        Object obj = objArr[i3];
        int i4 = this.f1160f;
        if (i3 != i4 - 1) {
            AbstractC0239j.Y(objArr, objArr, i3, i3 + 1, i4);
        }
        int i5 = this.f1160f - 1;
        this.f1160f = i5;
        objArr[i5] = null;
        return obj;
    }

    public final void n(int i3, int i4) {
        if (i4 > i3) {
            int i5 = this.f1160f;
            if (i4 < i5) {
                Object[] objArr = this.f1158d;
                AbstractC0239j.Y(objArr, objArr, i3, i4, i5);
            }
            int i6 = this.f1160f;
            int i7 = i6 - (i4 - i3);
            int i8 = i6 - 1;
            if (i7 <= i8) {
                int i9 = i7;
                while (true) {
                    this.f1158d[i9] = null;
                    if (i9 == i8) {
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            this.f1160f = i7;
        }
    }

    public final void o(Comparator comparator) {
        Arrays.sort(this.f1158d, 0, this.f1160f, comparator);
    }
}
