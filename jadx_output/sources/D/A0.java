package D;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class A0 {

    /* renamed from: a, reason: collision with root package name */
    public final B0 f629a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f630b;

    /* renamed from: c, reason: collision with root package name */
    public final int f631c;

    /* renamed from: d, reason: collision with root package name */
    public final Object[] f632d;

    /* renamed from: e, reason: collision with root package name */
    public final int f633e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f634f;

    /* renamed from: g, reason: collision with root package name */
    public int f635g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public int f636i;

    /* renamed from: j, reason: collision with root package name */
    public final M f637j;

    /* renamed from: k, reason: collision with root package name */
    public int f638k;

    /* renamed from: l, reason: collision with root package name */
    public int f639l;

    /* renamed from: m, reason: collision with root package name */
    public int f640m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f641n;

    public A0(B0 b02) {
        this.f629a = b02;
        this.f630b = b02.f647d;
        int i3 = b02.f648e;
        this.f631c = i3;
        this.f632d = b02.f649f;
        this.f633e = b02.f650g;
        this.h = i3;
        this.f636i = -1;
        this.f637j = new M();
    }

    public final C0030c a(int i3) {
        ArrayList arrayList = this.f629a.f653k;
        int F3 = C0032d.F(arrayList, i3, this.f631c);
        if (F3 >= 0) {
            return (C0030c) arrayList.get(F3);
        }
        C0030c c0030c = new C0030c(i3);
        arrayList.add(-(F3 + 1), c0030c);
        return c0030c;
    }

    public final Object b(int[] iArr, int i3) {
        int t3;
        if (!C0032d.h(iArr, i3)) {
            return C0048l.f781a;
        }
        int i4 = i3 * 5;
        if (i4 >= iArr.length) {
            t3 = iArr.length;
        } else {
            t3 = C0032d.t(iArr[i4 + 1] >> 29) + iArr[i4 + 4];
        }
        return this.f632d[t3];
    }

    public final void c() {
        int i3;
        this.f634f = true;
        B0 b02 = this.f629a;
        b02.getClass();
        if (this.f629a != b02 || (i3 = b02.h) <= 0) {
            C0032d.r("Unexpected reader close()");
            throw null;
        }
        b02.h = i3 - 1;
    }

    public final void d() {
        if (this.f638k == 0) {
            if (!(this.f635g == this.h)) {
                C0032d.r("endGroup() not called at the end of a group");
                throw null;
            }
            int i3 = this.f636i;
            int[] iArr = this.f630b;
            int m2 = C0032d.m(iArr, i3);
            this.f636i = m2;
            int i4 = this.f631c;
            this.h = m2 < 0 ? i4 : C0032d.g(iArr, m2) + m2;
            int a3 = this.f637j.a();
            if (a3 < 0) {
                this.f639l = 0;
                this.f640m = 0;
            } else {
                this.f639l = a3;
                this.f640m = m2 >= i4 - 1 ? this.f633e : C0032d.f(iArr, m2 + 1);
            }
        }
    }

    public final Object e() {
        int i3 = this.f635g;
        if (i3 < this.h) {
            return b(this.f630b, i3);
        }
        return 0;
    }

    public final int f() {
        int i3 = this.f635g;
        if (i3 >= this.h) {
            return 0;
        }
        return this.f630b[i3 * 5];
    }

    public final Object g(int i3, int i4) {
        int[] iArr = this.f630b;
        int o3 = C0032d.o(iArr, i3);
        int i5 = i3 + 1;
        int i6 = o3 + i4;
        return i6 < (i5 < this.f631c ? iArr[(i5 * 5) + 4] : this.f633e) ? this.f632d[i6] : C0048l.f781a;
    }

    public final Object h() {
        int i3;
        if (this.f638k > 0 || (i3 = this.f639l) >= this.f640m) {
            this.f641n = false;
            return C0048l.f781a;
        }
        this.f641n = true;
        this.f639l = i3 + 1;
        return this.f632d[i3];
    }

    public final Object i(int i3) {
        int[] iArr = this.f630b;
        if (!C0032d.j(iArr, i3)) {
            return null;
        }
        if (!C0032d.j(iArr, i3)) {
            return C0048l.f781a;
        }
        return this.f632d[iArr[(i3 * 5) + 4]];
    }

    public final Object j(int[] iArr, int i3) {
        if (!C0032d.i(iArr, i3)) {
            return null;
        }
        int i4 = i3 * 5;
        return this.f632d[C0032d.t(iArr[i4 + 1] >> 30) + iArr[i4 + 4]];
    }

    public final void k(int i3) {
        if (!(this.f638k == 0)) {
            C0032d.r("Cannot reposition while in an empty region");
            throw null;
        }
        this.f635g = i3;
        int[] iArr = this.f630b;
        int i4 = this.f631c;
        int m2 = i3 < i4 ? C0032d.m(iArr, i3) : -1;
        this.f636i = m2;
        if (m2 < 0) {
            this.h = i4;
        } else {
            this.h = C0032d.g(iArr, m2) + m2;
        }
        this.f639l = 0;
        this.f640m = 0;
    }

    public final int l() {
        if (!(this.f638k == 0)) {
            C0032d.r("Cannot skip while in an empty region");
            throw null;
        }
        int i3 = this.f635g;
        int[] iArr = this.f630b;
        int l3 = C0032d.j(iArr, i3) ? 1 : C0032d.l(iArr, this.f635g);
        int i4 = this.f635g;
        this.f635g = C0032d.g(iArr, i4) + i4;
        return l3;
    }

    public final void m() {
        if (!(this.f638k == 0)) {
            C0032d.r("Cannot skip the enclosing group while in an empty region");
            throw null;
        }
        this.f635g = this.h;
        this.f639l = 0;
        this.f640m = 0;
    }

    public final void n() {
        if (this.f638k <= 0) {
            int i3 = this.f636i;
            int i4 = this.f635g;
            int[] iArr = this.f630b;
            if (!(C0032d.m(iArr, i4) == i3)) {
                C0032d.H("Invalid slot table detected");
                throw null;
            }
            int i5 = this.f639l;
            int i6 = this.f640m;
            M m2 = this.f637j;
            if (i5 == 0 && i6 == 0) {
                m2.b(-1);
            } else {
                m2.b(i5);
            }
            this.f636i = i4;
            this.h = C0032d.g(iArr, i4) + i4;
            int i7 = i4 + 1;
            this.f635g = i7;
            this.f639l = C0032d.o(iArr, i4);
            this.f640m = i4 >= this.f631c - 1 ? this.f633e : C0032d.f(iArr, i7);
        }
    }

    public final String toString() {
        return "SlotReader(current=" + this.f635g + ", key=" + f() + ", parent=" + this.f636i + ", end=" + this.h + ')';
    }
}
