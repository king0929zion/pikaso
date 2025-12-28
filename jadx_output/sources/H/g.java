package H;

import D.C0032d;
import a.AbstractC0090a;
import d2.AbstractC0235f;
import d2.AbstractC0239j;
import d2.C0231b;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class g extends AbstractC0235f implements Collection, q2.b {

    /* renamed from: d, reason: collision with root package name */
    public c f1315d;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f1316e;

    /* renamed from: f, reason: collision with root package name */
    public Object[] f1317f;

    /* renamed from: g, reason: collision with root package name */
    public int f1318g;
    public K.b h = new K.b();

    /* renamed from: i, reason: collision with root package name */
    public Object[] f1319i;

    /* renamed from: j, reason: collision with root package name */
    public Object[] f1320j;

    /* renamed from: k, reason: collision with root package name */
    public int f1321k;

    public g(c cVar, Object[] objArr, Object[] objArr2, int i3) {
        this.f1315d = cVar;
        this.f1316e = objArr;
        this.f1317f = objArr2;
        this.f1318g = i3;
        this.f1319i = objArr;
        this.f1320j = objArr2;
        this.f1321k = cVar.a();
    }

    public static void d(Object[] objArr, int i3, Iterator it) {
        while (i3 < 32 && it.hasNext()) {
            objArr[i3] = it.next();
            i3++;
        }
    }

    public final Object A(Object[] objArr, int i3, int i4, int i5) {
        int i6 = this.f1321k - i3;
        if (i6 == 1) {
            Object obj = this.f1320j[0];
            q(objArr, i3, i4);
            return obj;
        }
        Object[] objArr2 = this.f1320j;
        Object obj2 = objArr2[i5];
        Object[] k3 = k(objArr2);
        AbstractC0239j.Y(objArr2, k3, i5, i5 + 1, i6);
        k3[i6 - 1] = null;
        this.f1319i = objArr;
        this.f1320j = k3;
        this.f1321k = (i3 + i6) - 1;
        this.f1318g = i4;
        return obj2;
    }

    public final int B() {
        int i3 = this.f1321k;
        if (i3 <= 32) {
            return 0;
        }
        return (i3 - 1) & (-32);
    }

    public final Object[] C(Object[] objArr, int i3, int i4, Object obj, e eVar) {
        int O2 = AbstractC0090a.O(i4, i3);
        Object[] k3 = k(objArr);
        if (i3 != 0) {
            Object obj2 = k3[O2];
            p2.g.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            k3[O2] = C((Object[]) obj2, i3 - 5, i4, obj, eVar);
            return k3;
        }
        if (k3 != objArr) {
            ((AbstractList) this).modCount++;
        }
        eVar.f1310a = k3[O2];
        k3[O2] = obj;
        return k3;
    }

    public final void D(Collection collection, int i3, Object[] objArr, int i4, Object[][] objArr2, int i5, Object[] objArr3) {
        Object[] m2;
        if (i5 < 1) {
            C0032d.H("requires at least one nullBuffer");
            throw null;
        }
        Object[] k3 = k(objArr);
        objArr2[0] = k3;
        int i6 = i3 & 31;
        int size = ((collection.size() + i3) - 1) & 31;
        int i7 = (i4 - i6) + size;
        if (i7 < 32) {
            AbstractC0239j.Y(k3, objArr3, size + 1, i6, i4);
        } else {
            int i8 = i7 - 31;
            if (i5 == 1) {
                m2 = k3;
            } else {
                m2 = m();
                i5--;
                objArr2[i5] = m2;
            }
            int i9 = i4 - i8;
            AbstractC0239j.Y(k3, objArr3, 0, i9, i4);
            AbstractC0239j.Y(k3, m2, size + 1, i6, i9);
            objArr3 = m2;
        }
        Iterator it = collection.iterator();
        d(k3, i6, it);
        for (int i10 = 1; i10 < i5; i10++) {
            Object[] m3 = m();
            d(m3, 0, it);
            objArr2[i10] = m3;
        }
        d(objArr3, 0, it);
    }

    public final int E() {
        int i3 = this.f1321k;
        return i3 <= 32 ? i3 : i3 - ((i3 - 1) & (-32));
    }

    @Override // d2.AbstractC0235f
    public final int a() {
        return this.f1321k;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, Object obj) {
        r2.a.m(i3, a());
        if (i3 == a()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int B3 = B();
        if (i3 >= B3) {
            h(this.f1319i, i3 - B3, obj);
            return;
        }
        e eVar = new e(null);
        Object[] objArr = this.f1319i;
        p2.g.b(objArr);
        h(g(objArr, this.f1318g, i3, obj, eVar), 0, eVar.f1310a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i3, Collection collection) {
        Object[] m2;
        r2.a.m(i3, this.f1321k);
        if (i3 == this.f1321k) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i4 = (i3 >> 5) << 5;
        int size = ((collection.size() + (this.f1321k - i4)) - 1) / 32;
        if (size == 0) {
            int i5 = i3 & 31;
            int size2 = ((collection.size() + i3) - 1) & 31;
            Object[] objArr = this.f1320j;
            Object[] k3 = k(objArr);
            AbstractC0239j.Y(objArr, k3, size2 + 1, i5, E());
            d(k3, i5, collection.iterator());
            this.f1320j = k3;
            this.f1321k = collection.size() + this.f1321k;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int E2 = E();
        int size3 = collection.size() + this.f1321k;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i3 >= B()) {
            m2 = m();
            D(collection, i3, this.f1320j, E2, objArr2, size, m2);
        } else if (size3 > E2) {
            int i6 = size3 - E2;
            m2 = l(this.f1320j, i6);
            f(collection, i3, i6, objArr2, size, m2);
        } else {
            Object[] objArr3 = this.f1320j;
            m2 = m();
            int i7 = E2 - size3;
            AbstractC0239j.Y(objArr3, m2, 0, i7, E2);
            int i8 = 32 - i7;
            Object[] l3 = l(this.f1320j, i8);
            int i9 = size - 1;
            objArr2[i9] = l3;
            f(collection, i3, i8, objArr2, i9, l3);
        }
        this.f1319i = s(this.f1319i, i4, objArr2);
        this.f1320j = m2;
        this.f1321k = collection.size() + this.f1321k;
        return true;
    }

    @Override // d2.AbstractC0235f
    public final Object b(int i3) {
        r2.a.l(i3, a());
        ((AbstractList) this).modCount++;
        int B3 = B();
        if (i3 >= B3) {
            return A(this.f1319i, B3, this.f1318g, i3 - B3);
        }
        e eVar = new e(this.f1320j[0]);
        Object[] objArr = this.f1319i;
        p2.g.b(objArr);
        A(z(objArr, this.f1318g, i3, eVar), B3, this.f1318g, 0);
        return eVar.f1310a;
    }

    public final c c() {
        c fVar;
        Object[] objArr = this.f1319i;
        if (objArr == this.f1316e && this.f1320j == this.f1317f) {
            fVar = this.f1315d;
        } else {
            this.h = new K.b();
            this.f1316e = objArr;
            Object[] objArr2 = this.f1320j;
            this.f1317f = objArr2;
            if (objArr != null) {
                fVar = new f(objArr, objArr2, this.f1321k, this.f1318g);
            } else if (objArr2.length == 0) {
                fVar = j.f1327e;
            } else {
                Object[] copyOf = Arrays.copyOf(this.f1320j, this.f1321k);
                p2.g.d(copyOf, "copyOf(this, newSize)");
                fVar = new j(copyOf);
            }
        }
        this.f1315d = fVar;
        return fVar;
    }

    public final int e() {
        return ((AbstractList) this).modCount;
    }

    public final void f(Collection collection, int i3, int i4, Object[][] objArr, int i5, Object[] objArr2) {
        if (this.f1319i == null) {
            throw new IllegalStateException("root is null");
        }
        int i6 = i3 >> 5;
        a j3 = j(B() >> 5);
        int i7 = i5;
        Object[] objArr3 = objArr2;
        while (j3.f1303d - 1 != i6) {
            Object[] objArr4 = (Object[]) j3.previous();
            AbstractC0239j.Y(objArr4, objArr3, 0, 32 - i4, 32);
            objArr3 = l(objArr4, i4);
            i7--;
            objArr[i7] = objArr3;
        }
        Object[] objArr5 = (Object[]) j3.previous();
        int B3 = i5 - (((B() >> 5) - 1) - i6);
        if (B3 < i5) {
            objArr2 = objArr[B3];
            p2.g.b(objArr2);
        }
        D(collection, i3, objArr5, 32, objArr, B3, objArr2);
    }

    public final Object[] g(Object[] objArr, int i3, int i4, Object obj, e eVar) {
        Object obj2;
        int O2 = AbstractC0090a.O(i4, i3);
        if (i3 == 0) {
            eVar.f1310a = objArr[31];
            Object[] k3 = k(objArr);
            AbstractC0239j.Y(objArr, k3, O2 + 1, O2, 31);
            k3[O2] = obj;
            return k3;
        }
        Object[] k4 = k(objArr);
        int i5 = i3 - 5;
        Object obj3 = k4[O2];
        p2.g.c(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        k4[O2] = g((Object[]) obj3, i5, i4, obj, eVar);
        while (true) {
            O2++;
            if (O2 >= 32 || (obj2 = k4[O2]) == null) {
                break;
            }
            k4[O2] = g((Object[]) obj2, i5, 0, eVar.f1310a, eVar);
        }
        return k4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i3) {
        Object[] objArr;
        r2.a.l(i3, a());
        if (B() <= i3) {
            objArr = this.f1320j;
        } else {
            objArr = this.f1319i;
            p2.g.b(objArr);
            for (int i4 = this.f1318g; i4 > 0; i4 -= 5) {
                Object obj = objArr[AbstractC0090a.O(i3, i4)];
                p2.g.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i3 & 31];
    }

    public final void h(Object[] objArr, int i3, Object obj) {
        int E2 = E();
        Object[] k3 = k(this.f1320j);
        if (E2 < 32) {
            AbstractC0239j.Y(this.f1320j, k3, i3 + 1, i3, E2);
            k3[i3] = obj;
            this.f1319i = objArr;
            this.f1320j = k3;
            this.f1321k++;
            return;
        }
        Object[] objArr2 = this.f1320j;
        Object obj2 = objArr2[31];
        AbstractC0239j.Y(objArr2, k3, i3 + 1, i3, 31);
        k3[i3] = obj;
        t(objArr, k3, n(obj2));
    }

    public final boolean i(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.h;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final a j(int i3) {
        Object[] objArr = this.f1319i;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int B3 = B() >> 5;
        r2.a.m(i3, B3);
        int i4 = this.f1318g;
        return i4 == 0 ? new d(i3, objArr) : new k(objArr, i3, B3, i4 / 5);
    }

    public final Object[] k(Object[] objArr) {
        if (objArr == null) {
            return m();
        }
        if (i(objArr)) {
            return objArr;
        }
        Object[] m2 = m();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        AbstractC0239j.a0(objArr, m2, 0, length, 6);
        return m2;
    }

    public final Object[] l(Object[] objArr, int i3) {
        if (i(objArr)) {
            AbstractC0239j.Y(objArr, objArr, i3, 0, 32 - i3);
            return objArr;
        }
        Object[] m2 = m();
        AbstractC0239j.Y(objArr, m2, i3, 0, 32 - i3);
        return m2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i3) {
        r2.a.m(i3, a());
        return new i(this, i3);
    }

    public final Object[] m() {
        Object[] objArr = new Object[33];
        objArr[32] = this.h;
        return objArr;
    }

    public final Object[] n(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.h;
        return objArr;
    }

    public final Object[] o(Object[] objArr, int i3, int i4) {
        if (!(i4 >= 0)) {
            C0032d.H("shift should be positive");
            throw null;
        }
        if (i4 == 0) {
            return objArr;
        }
        int O2 = AbstractC0090a.O(i3, i4);
        Object obj = objArr[O2];
        p2.g.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object o3 = o((Object[]) obj, i3, i4 - 5);
        if (O2 < 31) {
            int i5 = O2 + 1;
            if (objArr[i5] != null) {
                if (i(objArr)) {
                    Arrays.fill(objArr, i5, 32, (Object) null);
                }
                Object[] m2 = m();
                AbstractC0239j.Y(objArr, m2, 0, 0, i5);
                objArr = m2;
            }
        }
        if (o3 == objArr[O2]) {
            return objArr;
        }
        Object[] k3 = k(objArr);
        k3[O2] = o3;
        return k3;
    }

    public final Object[] p(Object[] objArr, int i3, int i4, e eVar) {
        Object[] p3;
        int O2 = AbstractC0090a.O(i4 - 1, i3);
        if (i3 == 5) {
            eVar.f1310a = objArr[O2];
            p3 = null;
        } else {
            Object obj = objArr[O2];
            p2.g.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            p3 = p((Object[]) obj, i3 - 5, i4, eVar);
        }
        if (p3 == null && O2 == 0) {
            return null;
        }
        Object[] k3 = k(objArr);
        k3[O2] = p3;
        return k3;
    }

    public final void q(Object[] objArr, int i3, int i4) {
        if (i4 == 0) {
            this.f1319i = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f1320j = objArr;
            this.f1321k = i3;
            this.f1318g = i4;
            return;
        }
        e eVar = new e(null);
        p2.g.b(objArr);
        Object[] p3 = p(objArr, i4, i3, eVar);
        p2.g.b(p3);
        Object obj = eVar.f1310a;
        p2.g.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.f1320j = (Object[]) obj;
        this.f1321k = i3;
        if (p3[1] == null) {
            this.f1319i = (Object[]) p3[0];
            this.f1318g = i4 - 5;
        } else {
            this.f1319i = p3;
            this.f1318g = i4;
        }
    }

    public final Object[] r(Object[] objArr, int i3, int i4, Iterator it) {
        if (!it.hasNext()) {
            C0032d.H("invalid buffersIterator");
            throw null;
        }
        if (!(i4 >= 0)) {
            C0032d.H("negative shift");
            throw null;
        }
        if (i4 == 0) {
            return (Object[]) it.next();
        }
        Object[] k3 = k(objArr);
        int O2 = AbstractC0090a.O(i3, i4);
        int i5 = i4 - 5;
        k3[O2] = r((Object[]) k3[O2], i3, i5, it);
        while (true) {
            O2++;
            if (O2 >= 32 || !it.hasNext()) {
                break;
            }
            k3[O2] = r((Object[]) k3[O2], 0, i5, it);
        }
        return k3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return y(new b(1, collection));
    }

    public final Object[] s(Object[] objArr, int i3, Object[][] objArr2) {
        C0231b c0231b = new C0231b(1, objArr2);
        int i4 = i3 >> 5;
        int i5 = this.f1318g;
        Object[] r3 = i4 < (1 << i5) ? r(objArr, i3, i5, c0231b) : k(objArr);
        while (c0231b.hasNext()) {
            this.f1318g += 5;
            r3 = n(r3);
            int i6 = this.f1318g;
            r(r3, 1 << i6, i6, c0231b);
        }
        return r3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i3, Object obj) {
        r2.a.l(i3, a());
        if (B() > i3) {
            e eVar = new e(null);
            Object[] objArr = this.f1319i;
            p2.g.b(objArr);
            this.f1319i = C(objArr, this.f1318g, i3, obj, eVar);
            return eVar.f1310a;
        }
        Object[] k3 = k(this.f1320j);
        if (k3 != this.f1320j) {
            ((AbstractList) this).modCount++;
        }
        int i4 = i3 & 31;
        Object obj2 = k3[i4];
        k3[i4] = obj;
        this.f1320j = k3;
        return obj2;
    }

    public final void t(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i3 = this.f1321k;
        int i4 = i3 >> 5;
        int i5 = this.f1318g;
        if (i4 > (1 << i5)) {
            this.f1319i = u(this.f1318g + 5, n(objArr), objArr2);
            this.f1320j = objArr3;
            this.f1318g += 5;
            this.f1321k++;
            return;
        }
        if (objArr == null) {
            this.f1319i = objArr2;
            this.f1320j = objArr3;
            this.f1321k = i3 + 1;
        } else {
            this.f1319i = u(i5, objArr, objArr2);
            this.f1320j = objArr3;
            this.f1321k++;
        }
    }

    public final Object[] u(int i3, Object[] objArr, Object[] objArr2) {
        int O2 = AbstractC0090a.O(a() - 1, i3);
        Object[] k3 = k(objArr);
        if (i3 == 5) {
            k3[O2] = objArr2;
        } else {
            k3[O2] = u(i3 - 5, (Object[]) k3[O2], objArr2);
        }
        return k3;
    }

    public final int v(o2.c cVar, Object[] objArr, int i3, int i4, e eVar, ArrayList arrayList, ArrayList arrayList2) {
        if (i(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = eVar.f1310a;
        p2.g.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj;
        Object[] objArr3 = objArr2;
        for (int i5 = 0; i5 < i3; i5++) {
            Object obj2 = objArr[i5];
            if (!((Boolean) cVar.i(obj2)).booleanValue()) {
                if (i4 == 32) {
                    objArr3 = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : m();
                    i4 = 0;
                }
                objArr3[i4] = obj2;
                i4++;
            }
        }
        eVar.f1310a = objArr3;
        if (objArr2 != objArr3) {
            arrayList2.add(objArr2);
        }
        return i4;
    }

    public final int w(o2.c cVar, Object[] objArr, int i3, e eVar) {
        Object[] objArr2 = objArr;
        int i4 = i3;
        boolean z3 = false;
        for (int i5 = 0; i5 < i3; i5++) {
            Object obj = objArr[i5];
            if (((Boolean) cVar.i(obj)).booleanValue()) {
                if (!z3) {
                    objArr2 = k(objArr);
                    z3 = true;
                    i4 = i5;
                }
            } else if (z3) {
                objArr2[i4] = obj;
                i4++;
            }
        }
        eVar.f1310a = objArr2;
        return i4;
    }

    public final int x(o2.c cVar, int i3, e eVar) {
        int w3 = w(cVar, this.f1320j, i3, eVar);
        if (w3 == i3) {
            return i3;
        }
        Object obj = eVar.f1310a;
        p2.g.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, w3, i3, (Object) null);
        this.f1320j = objArr;
        this.f1321k -= i3 - w3;
        return w3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        if (r0 != r10) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (x(r19, r10, r11) != r10) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        r14 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean y(o2.c r19) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H.g.y(o2.c):boolean");
    }

    public final Object[] z(Object[] objArr, int i3, int i4, e eVar) {
        int O2 = AbstractC0090a.O(i4, i3);
        if (i3 == 0) {
            Object obj = objArr[O2];
            Object[] k3 = k(objArr);
            AbstractC0239j.Y(objArr, k3, O2, O2 + 1, 32);
            k3[31] = eVar.f1310a;
            eVar.f1310a = obj;
            return k3;
        }
        int O3 = objArr[31] == null ? AbstractC0090a.O(B() - 1, i3) : 31;
        Object[] k4 = k(objArr);
        int i5 = i3 - 5;
        int i6 = O2 + 1;
        if (i6 <= O3) {
            while (true) {
                Object obj2 = k4[O3];
                p2.g.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                k4[O3] = z((Object[]) obj2, i5, 0, eVar);
                if (O3 == i6) {
                    break;
                }
                O3--;
            }
        }
        Object obj3 = k4[O2];
        p2.g.c(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        k4[O2] = z((Object[]) obj3, i5, i4, eVar);
        return k4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int E2 = E();
        if (E2 < 32) {
            Object[] k3 = k(this.f1320j);
            k3[E2] = obj;
            this.f1320j = k3;
            this.f1321k = a() + 1;
        } else {
            t(this.f1319i, this.f1320j, n(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int E2 = E();
        Iterator it = collection.iterator();
        if (32 - E2 >= collection.size()) {
            Object[] k3 = k(this.f1320j);
            d(k3, E2, it);
            this.f1320j = k3;
            this.f1321k = collection.size() + this.f1321k;
        } else {
            int size = ((collection.size() + E2) - 1) / 32;
            Object[][] objArr = new Object[size][];
            Object[] k4 = k(this.f1320j);
            d(k4, E2, it);
            objArr[0] = k4;
            for (int i3 = 1; i3 < size; i3++) {
                Object[] m2 = m();
                d(m2, 0, it);
                objArr[i3] = m2;
            }
            this.f1319i = s(this.f1319i, B(), objArr);
            Object[] m3 = m();
            d(m3, 0, it);
            this.f1320j = m3;
            this.f1321k = collection.size() + this.f1321k;
        }
        return true;
    }
}
