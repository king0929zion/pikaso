package H;

import D.C0032d;
import a.AbstractC0090a;
import d2.AbstractC0239j;
import java.util.Arrays;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class f extends c {

    /* renamed from: d, reason: collision with root package name */
    public final Object[] f1311d;

    /* renamed from: e, reason: collision with root package name */
    public final Object[] f1312e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1313f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1314g;

    public f(Object[] objArr, Object[] objArr2, int i3, int i4) {
        this.f1311d = objArr;
        this.f1312e = objArr2;
        this.f1313f = i3;
        this.f1314g = i4;
        if (a() > 32) {
            int length = objArr2.length;
            return;
        }
        C0032d.H("Trie-based persistent vector should have at least 33 elements, got " + a());
        throw null;
    }

    public static Object[] i(Object[] objArr, int i3, int i4, Object obj, e eVar) {
        Object[] copyOf;
        int O2 = AbstractC0090a.O(i4, i3);
        if (i3 == 0) {
            if (O2 == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                p2.g.d(copyOf, "copyOf(this, newSize)");
            }
            AbstractC0239j.Y(objArr, copyOf, O2 + 1, O2, 31);
            eVar.f1310a = objArr[31];
            copyOf[O2] = obj;
            return copyOf;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        p2.g.d(copyOf2, "copyOf(this, newSize)");
        int i5 = i3 - 5;
        Object obj2 = objArr[O2];
        p2.g.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[O2] = i((Object[]) obj2, i5, i4, obj, eVar);
        while (true) {
            O2++;
            if (O2 >= 32 || copyOf2[O2] == null) {
                break;
            }
            Object obj3 = objArr[O2];
            p2.g.c(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            copyOf2[O2] = i((Object[]) obj3, i5, 0, eVar.f1310a, eVar);
        }
        return copyOf2;
    }

    public static Object[] k(Object[] objArr, int i3, int i4, e eVar) {
        Object[] k3;
        int O2 = AbstractC0090a.O(i4, i3);
        if (i3 == 5) {
            eVar.f1310a = objArr[O2];
            k3 = null;
        } else {
            Object obj = objArr[O2];
            p2.g.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            k3 = k((Object[]) obj, i3 - 5, i4, eVar);
        }
        if (k3 == null && O2 == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        p2.g.d(copyOf, "copyOf(this, newSize)");
        copyOf[O2] = k3;
        return copyOf;
    }

    public static Object[] q(Object[] objArr, int i3, int i4, Object obj) {
        int O2 = AbstractC0090a.O(i4, i3);
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        p2.g.d(copyOf, "copyOf(this, newSize)");
        if (i3 == 0) {
            copyOf[O2] = obj;
        } else {
            Object obj2 = copyOf[O2];
            p2.g.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            copyOf[O2] = q((Object[]) obj2, i3 - 5, i4, obj);
        }
        return copyOf;
    }

    @Override // d2.AbstractC0230a
    public final int a() {
        return this.f1313f;
    }

    @Override // H.c
    public final c b(int i3, Object obj) {
        int i4 = this.f1313f;
        r2.a.m(i3, i4);
        if (i3 == i4) {
            return c(obj);
        }
        int p3 = p();
        Object[] objArr = this.f1311d;
        if (i3 >= p3) {
            return j(objArr, i3 - p3, obj);
        }
        e eVar = new e(null);
        return j(i(objArr, this.f1314g, i3, obj, eVar), 0, eVar.f1310a);
    }

    @Override // H.c
    public final c c(Object obj) {
        int p3 = p();
        int i3 = this.f1313f;
        int i4 = i3 - p3;
        Object[] objArr = this.f1311d;
        Object[] objArr2 = this.f1312e;
        if (i4 >= 32) {
            Object[] objArr3 = new Object[32];
            objArr3[0] = obj;
            return l(objArr, objArr2, objArr3);
        }
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        p2.g.d(copyOf, "copyOf(this, newSize)");
        copyOf[i4] = obj;
        return new f(objArr, copyOf, i3 + 1, this.f1314g);
    }

    @Override // H.c
    public final g e() {
        return new g(this, this.f1311d, this.f1312e, this.f1314g);
    }

    @Override // H.c
    public final c f(b bVar) {
        g gVar = new g(this, this.f1311d, this.f1312e, this.f1314g);
        gVar.y(bVar);
        return gVar.c();
    }

    @Override // H.c
    public final c g(int i3) {
        r2.a.l(i3, this.f1313f);
        int p3 = p();
        Object[] objArr = this.f1311d;
        int i4 = this.f1314g;
        return i3 >= p3 ? o(objArr, p3, i4, i3 - p3) : o(n(objArr, i4, i3, new e(this.f1312e[0])), p3, i4, 0);
    }

    @Override // java.util.List
    public final Object get(int i3) {
        Object[] objArr;
        r2.a.l(i3, a());
        if (p() <= i3) {
            objArr = this.f1312e;
        } else {
            objArr = this.f1311d;
            for (int i4 = this.f1314g; i4 > 0; i4 -= 5) {
                Object obj = objArr[AbstractC0090a.O(i3, i4)];
                p2.g.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i3 & 31];
    }

    @Override // H.c
    public final c h(int i3, Object obj) {
        int i4 = this.f1313f;
        r2.a.l(i3, i4);
        int p3 = p();
        Object[] objArr = this.f1311d;
        Object[] objArr2 = this.f1312e;
        int i5 = this.f1314g;
        if (p3 > i3) {
            return new f(q(objArr, i5, i3, obj), objArr2, i4, i5);
        }
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        p2.g.d(copyOf, "copyOf(this, newSize)");
        copyOf[i3 & 31] = obj;
        return new f(objArr, copyOf, i4, i5);
    }

    public final f j(Object[] objArr, int i3, Object obj) {
        int p3 = p();
        int i4 = this.f1313f;
        int i5 = i4 - p3;
        Object[] objArr2 = this.f1312e;
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        p2.g.d(copyOf, "copyOf(this, newSize)");
        if (i5 < 32) {
            AbstractC0239j.Y(objArr2, copyOf, i3 + 1, i3, i5);
            copyOf[i3] = obj;
            return new f(objArr, copyOf, i4 + 1, this.f1314g);
        }
        Object obj2 = objArr2[31];
        AbstractC0239j.Y(objArr2, copyOf, i3 + 1, i3, i5 - 1);
        copyOf[i3] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return l(objArr, copyOf, objArr3);
    }

    public final f l(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i3 = this.f1313f;
        int i4 = i3 >> 5;
        int i5 = this.f1314g;
        if (i4 <= (1 << i5)) {
            return new f(m(i5, objArr, objArr2), objArr3, i3 + 1, i5);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i6 = i5 + 5;
        return new f(m(i6, objArr4, objArr2), objArr3, i3 + 1, i6);
    }

    @Override // d2.AbstractC0233d, java.util.List
    public final ListIterator listIterator(int i3) {
        r2.a.m(i3, a());
        return new h(this.f1311d, this.f1312e, i3, a(), (this.f1314g / 5) + 1);
    }

    public final Object[] m(int i3, Object[] objArr, Object[] objArr2) {
        Object[] objArr3;
        int O2 = AbstractC0090a.O(a() - 1, i3);
        if (objArr != null) {
            objArr3 = Arrays.copyOf(objArr, 32);
            p2.g.d(objArr3, "copyOf(this, newSize)");
        } else {
            objArr3 = new Object[32];
        }
        if (i3 == 5) {
            objArr3[O2] = objArr2;
        } else {
            objArr3[O2] = m(i3 - 5, (Object[]) objArr3[O2], objArr2);
        }
        return objArr3;
    }

    public final Object[] n(Object[] objArr, int i3, int i4, e eVar) {
        Object[] copyOf;
        int O2 = AbstractC0090a.O(i4, i3);
        if (i3 == 0) {
            if (O2 == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                p2.g.d(copyOf, "copyOf(this, newSize)");
            }
            AbstractC0239j.Y(objArr, copyOf, O2, O2 + 1, 32);
            copyOf[31] = eVar.f1310a;
            eVar.f1310a = objArr[O2];
            return copyOf;
        }
        int O3 = objArr[31] == null ? AbstractC0090a.O(p() - 1, i3) : 31;
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        p2.g.d(copyOf2, "copyOf(this, newSize)");
        int i5 = i3 - 5;
        int i6 = O2 + 1;
        if (i6 <= O3) {
            while (true) {
                Object obj = copyOf2[O3];
                p2.g.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                copyOf2[O3] = n((Object[]) obj, i5, 0, eVar);
                if (O3 == i6) {
                    break;
                }
                O3--;
            }
        }
        Object obj2 = copyOf2[O2];
        p2.g.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[O2] = n((Object[]) obj2, i5, i4, eVar);
        return copyOf2;
    }

    public final c o(Object[] objArr, int i3, int i4, int i5) {
        f fVar;
        int i6 = this.f1313f - i3;
        if (i6 != 1) {
            Object[] objArr2 = this.f1312e;
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            p2.g.d(copyOf, "copyOf(this, newSize)");
            int i7 = i6 - 1;
            if (i5 < i7) {
                AbstractC0239j.Y(objArr2, copyOf, i5, i5 + 1, i6);
            }
            copyOf[i7] = null;
            return new f(objArr, copyOf, (i3 + i6) - 1, i4);
        }
        if (i4 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                p2.g.d(objArr, "copyOf(this, newSize)");
            }
            return new j(objArr);
        }
        e eVar = new e(null);
        Object[] k3 = k(objArr, i4, i3 - 1, eVar);
        p2.g.b(k3);
        Object obj = eVar.f1310a;
        p2.g.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr3 = (Object[]) obj;
        if (k3[1] == null) {
            Object obj2 = k3[0];
            p2.g.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            fVar = new f((Object[]) obj2, objArr3, i3, i4 - 5);
        } else {
            fVar = new f(k3, objArr3, i3, i4);
        }
        return fVar;
    }

    public final int p() {
        return (this.f1313f - 1) & (-32);
    }
}
