package D;

import d2.AbstractC0239j;
import d2.AbstractC0240k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import n.C0398r;

/* loaded from: classes.dex */
public final class D0 {

    /* renamed from: a, reason: collision with root package name */
    public final B0 f665a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f666b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f667c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f668d;

    /* renamed from: e, reason: collision with root package name */
    public HashMap f669e;

    /* renamed from: f, reason: collision with root package name */
    public C0398r f670f;

    /* renamed from: g, reason: collision with root package name */
    public int f671g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public int f672i;

    /* renamed from: j, reason: collision with root package name */
    public int f673j;

    /* renamed from: k, reason: collision with root package name */
    public int f674k;

    /* renamed from: l, reason: collision with root package name */
    public int f675l;

    /* renamed from: m, reason: collision with root package name */
    public int f676m;

    /* renamed from: n, reason: collision with root package name */
    public int f677n;

    /* renamed from: o, reason: collision with root package name */
    public int f678o;

    /* renamed from: p, reason: collision with root package name */
    public final M f679p;

    /* renamed from: q, reason: collision with root package name */
    public final M f680q;

    /* renamed from: r, reason: collision with root package name */
    public final M f681r;

    /* renamed from: s, reason: collision with root package name */
    public int f682s;

    /* renamed from: t, reason: collision with root package name */
    public int f683t;

    /* renamed from: u, reason: collision with root package name */
    public int f684u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f685v;

    /* renamed from: w, reason: collision with root package name */
    public A.t f686w;

    public D0(B0 b02) {
        this.f665a = b02;
        int[] iArr = b02.f647d;
        this.f666b = iArr;
        Object[] objArr = b02.f649f;
        this.f667c = objArr;
        this.f668d = b02.f653k;
        this.f669e = b02.f654l;
        this.f670f = b02.f655m;
        int i3 = b02.f648e;
        this.f671g = i3;
        this.h = (iArr.length / 5) - i3;
        int i4 = b02.f650g;
        this.f674k = i4;
        this.f675l = objArr.length - i4;
        this.f676m = i3;
        this.f679p = new M();
        this.f680q = new M();
        this.f681r = new M();
        this.f683t = i3;
        this.f684u = -1;
    }

    public static int h(int i3, int i4, int i5, int i6) {
        return i3 > i4 ? -(((i6 - i5) - i3) + 1) : i3;
    }

    public final void A(int i3, int i4, int i5) {
        if (i4 > 0) {
            int i6 = this.f675l;
            int i7 = i3 + i4;
            v(i7, i5);
            this.f674k = i3;
            this.f675l = i6 + i4;
            AbstractC0239j.c0(this.f667c, i3, i7);
            int i8 = this.f673j;
            if (i8 >= i3) {
                this.f673j = i8 - i4;
            }
        }
    }

    public final void B() {
        int i3 = this.f683t;
        this.f682s = i3;
        this.f672i = f(this.f666b, p(i3));
    }

    public final int C(int[] iArr, int i3) {
        if (i3 >= m()) {
            return this.f667c.length - this.f675l;
        }
        int o3 = C0032d.o(iArr, i3);
        return o3 < 0 ? (this.f667c.length - this.f675l) + o3 + 1 : o3;
    }

    public final int D(int i3, int i4) {
        int C3 = C(this.f666b, p(i3));
        int i5 = C3 + i4;
        if (i5 >= C3 && i5 < f(this.f666b, p(i3 + 1))) {
            return i5;
        }
        C0032d.r("Write to an invalid slot index " + i4 + " for group " + i3);
        throw null;
    }

    public final L E(int i3) {
        C0030c H2;
        HashMap hashMap = this.f669e;
        if (hashMap == null || (H2 = H(i3)) == null) {
            return null;
        }
        return (L) hashMap.get(H2);
    }

    public final void F() {
        if (this.f677n != 0) {
            C0032d.r("Key must be supplied when inserting");
            throw null;
        }
        U u3 = C0048l.f781a;
        G(0, u3, u3, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void G(int i3, Object obj, Object obj2, boolean z3) {
        int i4;
        int i5 = this.f684u;
        Object[] objArr = this.f677n > 0;
        this.f681r.b(this.f678o);
        U u3 = C0048l.f781a;
        if (objArr == true) {
            int i6 = this.f682s;
            int f3 = f(this.f666b, p(i6));
            r(1);
            this.f672i = f3;
            this.f673j = f3;
            int p3 = p(i6);
            int i7 = obj != u3 ? 1 : 0;
            int i8 = (z3 || obj2 == u3) ? 0 : 1;
            int h = h(f3, this.f674k, this.f675l, this.f667c.length);
            if (h >= 0 && this.f676m < i6) {
                h = -(((this.f667c.length - this.f675l) - h) + 1);
            }
            int[] iArr = this.f666b;
            int i9 = this.f684u;
            int i10 = z3 ? 1073741824 : 0;
            int i11 = i7 != 0 ? 536870912 : 0;
            int i12 = i8 != 0 ? 268435456 : 0;
            int i13 = p3 * 5;
            iArr[i13] = i3;
            iArr[i13 + 1] = i10 | i11 | i12;
            iArr[i13 + 2] = i9;
            iArr[i13 + 3] = 0;
            iArr[i13 + 4] = h;
            int i14 = (z3 ? 1 : 0) + i7 + i8;
            if (i14 > 0) {
                s(i14, i6);
                Object[] objArr2 = this.f667c;
                int i15 = this.f672i;
                if (z3) {
                    objArr2[i15] = obj2;
                    i15++;
                }
                if (i7 != 0) {
                    objArr2[i15] = obj;
                    i15++;
                }
                if (i8 != 0) {
                    objArr2[i15] = obj2;
                    i15++;
                }
                this.f672i = i15;
            }
            this.f678o = 0;
            i4 = i6 + 1;
            this.f684u = i6;
            this.f682s = i4;
            if (i5 >= 0) {
                E(i5);
            }
        } else {
            this.f679p.b(i5);
            this.f680q.b((m() - this.h) - this.f683t);
            int i16 = this.f682s;
            int p4 = p(i16);
            if (!p2.g.a(obj2, u3)) {
                if (z3) {
                    K(this.f682s, obj2);
                } else {
                    I(obj2);
                }
            }
            this.f672i = C(this.f666b, p4);
            this.f673j = f(this.f666b, p(this.f682s + 1));
            this.f678o = C0032d.l(this.f666b, p4);
            this.f684u = i16;
            this.f682s = i16 + 1;
            i4 = i16 + this.f666b[(p4 * 5) + 3];
        }
        this.f683t = i4;
    }

    public final C0030c H(int i3) {
        ArrayList arrayList;
        int F3;
        if (i3 < 0 || i3 >= n() || (F3 = C0032d.F((arrayList = this.f668d), i3, n())) < 0) {
            return null;
        }
        return (C0030c) arrayList.get(F3);
    }

    public final void I(Object obj) {
        int p3 = p(this.f682s);
        if (!C0032d.h(this.f666b, p3)) {
            C0032d.r("Updating the data of a group that was not created with a data slot");
            throw null;
        }
        Object[] objArr = this.f667c;
        int[] iArr = this.f666b;
        objArr[g(C0032d.t(iArr[(p3 * 5) + 1] >> 29) + f(iArr, p3))] = obj;
    }

    public final void J(int i3) {
        if (i3 >= 0) {
            A.t tVar = this.f686w;
            if (tVar == null) {
                tVar = new A.t(4);
                this.f686w = tVar;
            }
            tVar.q(i3);
        }
    }

    public final void K(int i3, Object obj) {
        int p3 = p(i3);
        int[] iArr = this.f666b;
        if (p3 < iArr.length && C0032d.j(iArr, p3)) {
            this.f667c[g(f(this.f666b, p3))] = obj;
            return;
        }
        C0032d.r("Updating the node of a group at " + i3 + " that was not created with as a node group");
        throw null;
    }

    public final void a(int i3) {
        boolean z3 = false;
        if (!(i3 >= 0)) {
            C0032d.r("Cannot seek backwards");
            throw null;
        }
        if (!(this.f677n <= 0)) {
            C0032d.I("Cannot call seek() while inserting");
            throw null;
        }
        if (i3 == 0) {
            return;
        }
        int i4 = this.f682s + i3;
        if (i4 >= this.f684u && i4 <= this.f683t) {
            z3 = true;
        }
        if (z3) {
            this.f682s = i4;
            int f3 = f(this.f666b, p(i4));
            this.f672i = f3;
            this.f673j = f3;
            return;
        }
        C0032d.r("Cannot seek outside the current group (" + this.f684u + '-' + this.f683t + ')');
        throw null;
    }

    public final C0030c b(int i3) {
        ArrayList arrayList = this.f668d;
        int F3 = C0032d.F(arrayList, i3, n());
        if (F3 >= 0) {
            return (C0030c) arrayList.get(F3);
        }
        if (i3 > this.f671g) {
            i3 = -(n() - i3);
        }
        C0030c c0030c = new C0030c(i3);
        arrayList.add(-(F3 + 1), c0030c);
        return c0030c;
    }

    public final int c(C0030c c0030c) {
        int i3 = c0030c.f739a;
        return i3 < 0 ? i3 + n() : i3;
    }

    public final void d() {
        int i3 = this.f677n;
        this.f677n = i3 + 1;
        if (i3 == 0) {
            this.f680q.b((m() - this.h) - this.f683t);
        }
    }

    public final void e(boolean z3) {
        this.f685v = true;
        if (z3 && this.f679p.f709b == 0) {
            u(n());
            v(this.f667c.length - this.f675l, this.f671g);
            int i3 = this.f674k;
            AbstractC0239j.c0(this.f667c, i3, this.f675l + i3);
            x();
        }
        int[] iArr = this.f666b;
        int i4 = this.f671g;
        Object[] objArr = this.f667c;
        int i5 = this.f674k;
        ArrayList arrayList = this.f668d;
        HashMap hashMap = this.f669e;
        C0398r c0398r = this.f670f;
        B0 b02 = this.f665a;
        b02.getClass();
        if (!b02.f651i) {
            C0032d.H("Unexpected writer close()");
            throw null;
        }
        b02.f651i = false;
        b02.f647d = iArr;
        b02.f648e = i4;
        b02.f649f = objArr;
        b02.f650g = i5;
        b02.f653k = arrayList;
        b02.f654l = hashMap;
        b02.f655m = c0398r;
    }

    public final int f(int[] iArr, int i3) {
        if (i3 >= m()) {
            return this.f667c.length - this.f675l;
        }
        int f3 = C0032d.f(iArr, i3);
        return f3 < 0 ? (this.f667c.length - this.f675l) + f3 + 1 : f3;
    }

    public final int g(int i3) {
        return i3 < this.f674k ? i3 : i3 + this.f675l;
    }

    public final void i() {
        boolean z3 = this.f677n > 0;
        int i3 = this.f682s;
        int i4 = this.f683t;
        int i5 = this.f684u;
        int p3 = p(i5);
        int i6 = this.f678o;
        int i7 = i3 - i5;
        boolean j3 = C0032d.j(this.f666b, p3);
        M m2 = this.f681r;
        if (z3) {
            C0032d.p(p3, i7, this.f666b);
            C0032d.q(p3, i6, this.f666b);
            int a3 = m2.a();
            if (j3) {
                i6 = 1;
            }
            this.f678o = a3 + i6;
            int w3 = w(this.f666b, i5);
            this.f684u = w3;
            int n2 = w3 < 0 ? n() : p(w3 + 1);
            int f3 = n2 >= 0 ? f(this.f666b, n2) : 0;
            this.f672i = f3;
            this.f673j = f3;
            return;
        }
        if (i3 != i4) {
            C0032d.r("Expected to be at the end of a group");
            throw null;
        }
        int[] iArr = this.f666b;
        int i8 = iArr[(p3 * 5) + 3];
        int l3 = C0032d.l(iArr, p3);
        C0032d.p(p3, i7, this.f666b);
        C0032d.q(p3, i6, this.f666b);
        int a4 = this.f679p.a();
        this.f683t = (m() - this.h) - this.f680q.a();
        this.f684u = a4;
        int w4 = w(this.f666b, i5);
        int a5 = m2.a();
        this.f678o = a5;
        if (w4 == a4) {
            this.f678o = a5 + (j3 ? 0 : i6 - l3);
            return;
        }
        int i9 = i7 - i8;
        int i10 = j3 ? 0 : i6 - l3;
        if (i9 != 0 || i10 != 0) {
            while (w4 != 0 && w4 != a4 && (i10 != 0 || i9 != 0)) {
                int p4 = p(w4);
                if (i9 != 0) {
                    int[] iArr2 = this.f666b;
                    C0032d.p(p4, iArr2[(p4 * 5) + 3] + i9, iArr2);
                }
                if (i10 != 0) {
                    int[] iArr3 = this.f666b;
                    C0032d.q(p4, C0032d.l(iArr3, p4) + i10, iArr3);
                }
                if (C0032d.j(this.f666b, p4)) {
                    i10 = 0;
                }
                w4 = w(this.f666b, w4);
            }
        }
        this.f678o += i10;
    }

    public final void j() {
        int i3 = this.f677n;
        if (!(i3 > 0)) {
            C0032d.I("Unbalanced begin/end insert");
            throw null;
        }
        int i4 = i3 - 1;
        this.f677n = i4;
        if (i4 == 0) {
            if (this.f681r.f709b == this.f679p.f709b) {
                this.f683t = (m() - this.h) - this.f680q.a();
            } else {
                C0032d.r("startGroup/endGroup mismatch while inserting");
                throw null;
            }
        }
    }

    public final void k(int i3) {
        boolean z3 = false;
        if (!(this.f677n <= 0)) {
            C0032d.r("Cannot call ensureStarted() while inserting");
            throw null;
        }
        int i4 = this.f684u;
        if (i4 != i3) {
            if (i3 >= i4 && i3 < this.f683t) {
                z3 = true;
            }
            if (!z3) {
                C0032d.r("Started group at " + i3 + " must be a subgroup of the group at " + i4);
                throw null;
            }
            int i5 = this.f682s;
            int i6 = this.f672i;
            int i7 = this.f673j;
            this.f682s = i3;
            F();
            this.f682s = i5;
            this.f672i = i6;
            this.f673j = i7;
        }
    }

    public final void l(int i3, int i4, int i5) {
        if (i3 >= this.f671g) {
            i3 = -((n() - i3) + 2);
        }
        while (i5 < i4) {
            this.f666b[(p(i5) * 5) + 2] = i3;
            int i6 = this.f666b[(p(i5) * 5) + 3] + i5;
            l(i5, i6, i5 + 1);
            i5 = i6;
        }
    }

    public final int m() {
        return this.f666b.length / 5;
    }

    public final int n() {
        return m() - this.h;
    }

    public final int o() {
        return this.f667c.length - this.f675l;
    }

    public final int p(int i3) {
        return i3 < this.f671g ? i3 : i3 + this.h;
    }

    public final int q(int i3) {
        return C0032d.g(this.f666b, p(i3));
    }

    public final void r(int i3) {
        if (i3 > 0) {
            int i4 = this.f682s;
            u(i4);
            int i5 = this.f671g;
            int i6 = this.h;
            int[] iArr = this.f666b;
            int length = iArr.length / 5;
            int i7 = length - i6;
            if (i6 < i3) {
                int max = Math.max(Math.max(length * 2, i7 + i3), 32);
                int[] iArr2 = new int[max * 5];
                int i8 = max - i7;
                AbstractC0239j.X(0, 0, i5 * 5, iArr, iArr2);
                AbstractC0239j.X((i5 + i8) * 5, (i6 + i5) * 5, length * 5, iArr, iArr2);
                this.f666b = iArr2;
                i6 = i8;
            }
            int i9 = this.f683t;
            if (i9 >= i5) {
                this.f683t = i9 + i3;
            }
            int i10 = i5 + i3;
            this.f671g = i10;
            this.h = i6 - i3;
            int h = h(i7 > 0 ? f(this.f666b, p(i4 + i3)) : 0, this.f676m >= i5 ? this.f674k : 0, this.f675l, this.f667c.length);
            for (int i11 = i5; i11 < i10; i11++) {
                this.f666b[(i11 * 5) + 4] = h;
            }
            int i12 = this.f676m;
            if (i12 >= i5) {
                this.f676m = i12 + i3;
            }
        }
    }

    public final void s(int i3, int i4) {
        if (i3 > 0) {
            v(this.f672i, i4);
            int i5 = this.f674k;
            int i6 = this.f675l;
            if (i6 < i3) {
                Object[] objArr = this.f667c;
                int length = objArr.length;
                int i7 = length - i6;
                int max = Math.max(Math.max(length * 2, i7 + i3), 32);
                Object[] objArr2 = new Object[max];
                for (int i8 = 0; i8 < max; i8++) {
                    objArr2[i8] = null;
                }
                int i9 = max - i7;
                AbstractC0239j.Y(objArr, objArr2, 0, 0, i5);
                AbstractC0239j.Y(objArr, objArr2, i5 + i9, i6 + i5, length);
                this.f667c = objArr2;
                i6 = i9;
            }
            int i10 = this.f673j;
            if (i10 >= i5) {
                this.f673j = i10 + i3;
            }
            this.f674k = i5 + i3;
            this.f675l = i6 - i3;
        }
    }

    public final void t(B0 b02, int i3) {
        C0032d.E(this.f677n > 0);
        if (i3 == 0 && this.f682s == 0 && this.f665a.f648e == 0) {
            int[] iArr = b02.f647d;
            int i4 = iArr[(i3 * 5) + 3];
            int i5 = b02.f648e;
            if (i4 == i5) {
                int[] iArr2 = this.f666b;
                Object[] objArr = this.f667c;
                ArrayList arrayList = this.f668d;
                HashMap hashMap = this.f669e;
                C0398r c0398r = this.f670f;
                Object[] objArr2 = b02.f649f;
                int i6 = b02.f650g;
                HashMap hashMap2 = b02.f654l;
                C0398r c0398r2 = b02.f655m;
                this.f666b = iArr;
                this.f667c = objArr2;
                this.f668d = b02.f653k;
                this.f671g = i5;
                this.h = (iArr.length / 5) - i5;
                this.f674k = i6;
                this.f675l = objArr2.length - i6;
                this.f676m = i5;
                this.f669e = hashMap2;
                this.f670f = c0398r2;
                b02.f647d = iArr2;
                b02.f648e = 0;
                b02.f649f = objArr;
                b02.f650g = 0;
                b02.f653k = arrayList;
                b02.f654l = hashMap;
                b02.f655m = c0398r;
                return;
            }
        }
        D0 c3 = b02.c();
        try {
            C0032d.z(c3, i3, this, true, true, false);
            c3.e(true);
        } catch (Throwable th) {
            c3.e(false);
            throw th;
        }
    }

    public final String toString() {
        return "SlotWriter(current = " + this.f682s + " end=" + this.f683t + " size = " + n() + " gap=" + this.f671g + '-' + (this.f671g + this.h) + ')';
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        r2 = r8.f666b;
        r3 = r9 * 5;
        r4 = r0 * 5;
        r5 = r1 * 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        if (r9 >= r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
    
        d2.AbstractC0239j.X(r4 + r3, r3, r5, r2, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
    
        d2.AbstractC0239j.X(r5, r5 + r4, r3 + r4, r2, r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(int r9) {
        /*
            r8 = this;
            int r0 = r8.h
            int r1 = r8.f671g
            if (r1 == r9) goto Lad
            java.util.ArrayList r2 = r8.f668d
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L5b
            int r2 = r8.h
            int r3 = r8.m()
            int r3 = r3 - r2
            if (r1 >= r9) goto L39
            java.util.ArrayList r2 = r8.f668d
            int r2 = D.C0032d.k(r2, r1, r3)
        L1d:
            java.util.ArrayList r4 = r8.f668d
            int r4 = r4.size()
            if (r2 >= r4) goto L5b
            java.util.ArrayList r4 = r8.f668d
            java.lang.Object r4 = r4.get(r2)
            D.c r4 = (D.C0030c) r4
            int r5 = r4.f739a
            if (r5 >= 0) goto L5b
            int r5 = r5 + r3
            if (r5 >= r9) goto L5b
            r4.f739a = r5
            int r2 = r2 + 1
            goto L1d
        L39:
            java.util.ArrayList r2 = r8.f668d
            int r2 = D.C0032d.k(r2, r9, r3)
        L3f:
            java.util.ArrayList r4 = r8.f668d
            int r4 = r4.size()
            if (r2 >= r4) goto L5b
            java.util.ArrayList r4 = r8.f668d
            java.lang.Object r4 = r4.get(r2)
            D.c r4 = (D.C0030c) r4
            int r5 = r4.f739a
            if (r5 < 0) goto L5b
            int r5 = r3 - r5
            int r5 = -r5
            r4.f739a = r5
            int r2 = r2 + 1
            goto L3f
        L5b:
            if (r0 <= 0) goto L72
            int[] r2 = r8.f666b
            int r3 = r9 * 5
            int r4 = r0 * 5
            int r5 = r1 * 5
            if (r9 >= r1) goto L6c
            int r4 = r4 + r3
            d2.AbstractC0239j.X(r4, r3, r5, r2, r2)
            goto L72
        L6c:
            int r6 = r5 + r4
            int r3 = r3 + r4
            d2.AbstractC0239j.X(r5, r6, r3, r2, r2)
        L72:
            if (r9 >= r1) goto L76
            int r1 = r9 + r0
        L76:
            int r2 = r8.m()
            if (r1 >= r2) goto L7e
            r3 = 1
            goto L7f
        L7e:
            r3 = 0
        L7f:
            D.C0032d.E(r3)
        L82:
            if (r1 >= r2) goto Lad
            int[] r3 = r8.f666b
            int r4 = r1 * 5
            int r4 = r4 + 2
            r3 = r3[r4]
            r5 = -2
            if (r3 <= r5) goto L91
            r6 = r3
            goto L97
        L91:
            int r6 = r8.n()
            int r6 = r6 + r3
            int r6 = r6 - r5
        L97:
            if (r6 >= r9) goto L9a
            goto La1
        L9a:
            int r7 = r8.n()
            int r7 = r7 - r6
            int r7 = r7 - r5
            int r6 = -r7
        La1:
            if (r6 == r3) goto La7
            int[] r3 = r8.f666b
            r3[r4] = r6
        La7:
            int r1 = r1 + 1
            if (r1 != r9) goto L82
            int r1 = r1 + r0
            goto L82
        Lad:
            r8.f671g = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: D.D0.u(int):void");
    }

    public final void v(int i3, int i4) {
        int i5 = this.f675l;
        int i6 = this.f674k;
        int i7 = this.f676m;
        if (i6 != i3) {
            Object[] objArr = this.f667c;
            if (i3 < i6) {
                AbstractC0239j.Y(objArr, objArr, i3 + i5, i3, i6);
            } else {
                AbstractC0239j.Y(objArr, objArr, i6, i6 + i5, i3 + i5);
            }
        }
        int min = Math.min(i4 + 1, n());
        if (i7 != min) {
            int length = this.f667c.length - i5;
            if (min < i7) {
                int p3 = p(min);
                int p4 = p(i7);
                int i8 = this.f671g;
                while (p3 < p4) {
                    int[] iArr = this.f666b;
                    int i9 = (p3 * 5) + 4;
                    int i10 = iArr[i9];
                    if (i10 < 0) {
                        C0032d.r("Unexpected anchor value, expected a positive anchor");
                        throw null;
                    }
                    iArr[i9] = -((length - i10) + 1);
                    p3++;
                    if (p3 == i8) {
                        p3 += this.h;
                    }
                }
            } else {
                int p5 = p(i7);
                int p6 = p(min);
                while (p5 < p6) {
                    int[] iArr2 = this.f666b;
                    int i11 = (p5 * 5) + 4;
                    int i12 = iArr2[i11];
                    if (i12 >= 0) {
                        C0032d.r("Unexpected anchor value, expected a negative anchor");
                        throw null;
                    }
                    iArr2[i11] = i12 + length + 1;
                    p5++;
                    if (p5 == this.f671g) {
                        p5 += this.h;
                    }
                }
            }
            this.f676m = min;
        }
        this.f674k = i3;
    }

    public final int w(int[] iArr, int i3) {
        int m2 = C0032d.m(iArr, p(i3));
        return m2 > -2 ? m2 : n() + m2 + 2;
    }

    public final void x() {
        boolean z3;
        A.t tVar = this.f686w;
        if (tVar != null) {
            while (!((List) tVar.f175e).isEmpty()) {
                int H2 = tVar.H();
                int p3 = p(H2);
                int i3 = H2 + 1;
                int q3 = q(H2) + H2;
                while (true) {
                    if (i3 >= q3) {
                        z3 = false;
                        break;
                    } else {
                        if ((this.f666b[(p(i3) * 5) + 1] & 201326592) != 0) {
                            z3 = true;
                            break;
                        }
                        i3 += q(i3);
                    }
                }
                if (C0032d.e(this.f666b, p3) != z3) {
                    int[] iArr = this.f666b;
                    int i4 = (p3 * 5) + 1;
                    if (z3) {
                        iArr[i4] = iArr[i4] | 67108864;
                    } else {
                        iArr[i4] = iArr[i4] & (-67108865);
                    }
                    int w3 = w(iArr, H2);
                    if (w3 >= 0) {
                        tVar.q(w3);
                    }
                }
            }
        }
    }

    public final boolean y() {
        if (this.f677n != 0) {
            C0032d.r("Cannot remove group while inserting");
            throw null;
        }
        int i3 = this.f682s;
        int i4 = this.f672i;
        int f3 = f(this.f666b, p(i3));
        int p3 = p(this.f682s);
        int g3 = C0032d.g(this.f666b, p3) + this.f682s;
        this.f682s = g3;
        this.f672i = f(this.f666b, p(g3));
        int l3 = C0032d.j(this.f666b, p3) ? 1 : C0032d.l(this.f666b, p3);
        E(this.f684u);
        A.t tVar = this.f686w;
        if (tVar != null) {
            while (true) {
                List list = (List) tVar.f175e;
                if (list.isEmpty() || ((Number) AbstractC0240k.a0(list)).intValue() < i3) {
                    break;
                }
                tVar.H();
            }
        }
        boolean z3 = z(i3, this.f682s - i3);
        A(f3, this.f672i - f3, i3 - 1);
        this.f682s = i3;
        this.f672i = i4;
        this.f678o -= l3;
        return z3;
    }

    public final boolean z(int i3, int i4) {
        if (i4 > 0) {
            ArrayList arrayList = this.f668d;
            u(i3);
            if (!arrayList.isEmpty()) {
                HashMap hashMap = this.f669e;
                int i5 = i3 + i4;
                int k3 = C0032d.k(this.f668d, i5, m() - this.h);
                if (k3 >= this.f668d.size()) {
                    k3--;
                }
                int i6 = k3 + 1;
                int i7 = 0;
                while (k3 >= 0) {
                    C0030c c0030c = (C0030c) this.f668d.get(k3);
                    int c3 = c(c0030c);
                    if (c3 < i3) {
                        break;
                    }
                    if (c3 < i5) {
                        c0030c.f739a = Integer.MIN_VALUE;
                        if (hashMap != null) {
                        }
                        if (i7 == 0) {
                            i7 = k3 + 1;
                        }
                        i6 = k3;
                    }
                    k3--;
                }
                r0 = i6 < i7;
                if (r0) {
                    this.f668d.subList(i6, i7).clear();
                }
            }
            this.f671g = i3;
            this.h += i4;
            int i8 = this.f676m;
            if (i8 > i3) {
                this.f676m = Math.max(i3, i8 - i4);
            }
            int i9 = this.f683t;
            if (i9 >= this.f671g) {
                this.f683t = i9 - i4;
            }
            int i10 = this.f684u;
            if (i10 >= 0 && C0032d.e(this.f666b, p(i10))) {
                J(i10);
            }
        }
        return r0;
    }
}
