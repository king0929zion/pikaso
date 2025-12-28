package n0;

import a.AbstractC0090a;

/* renamed from: n0.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0415I {

    /* renamed from: a, reason: collision with root package name */
    public final C0444z f5131a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5133c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5134d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5135e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5136f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5137g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public int f5138i;

    /* renamed from: j, reason: collision with root package name */
    public int f5139j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5140k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f5141l;

    /* renamed from: m, reason: collision with root package name */
    public int f5142m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f5143n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f5144o;

    /* renamed from: p, reason: collision with root package name */
    public int f5145p;

    /* renamed from: r, reason: collision with root package name */
    public C0412F f5147r;

    /* renamed from: b, reason: collision with root package name */
    public int f5132b = 5;

    /* renamed from: q, reason: collision with root package name */
    public final C0413G f5146q = new C0413G(this);

    /* renamed from: s, reason: collision with root package name */
    public long f5148s = AbstractC0090a.b(0, 0, 15);

    /* renamed from: t, reason: collision with root package name */
    public final A0.c f5149t = new A0.c(12, this);

    public C0415I(C0444z c0444z) {
        this.f5131a = c0444z;
    }

    public final Y a() {
        return (Y) this.f5131a.f5319x.f855d;
    }

    public final void b(int i3) {
        int i4 = this.f5142m;
        this.f5142m = i3;
        if ((i4 == 0) != (i3 == 0)) {
            C0444z k3 = this.f5131a.k();
            C0415I c0415i = k3 != null ? k3.f5320y : null;
            if (c0415i != null) {
                if (i3 == 0) {
                    c0415i.b(c0415i.f5142m - 1);
                } else {
                    c0415i.b(c0415i.f5142m + 1);
                }
            }
        }
    }

    public final void c(int i3) {
        int i4 = this.f5145p;
        this.f5145p = i3;
        if ((i4 == 0) != (i3 == 0)) {
            C0444z k3 = this.f5131a.k();
            C0415I c0415i = k3 != null ? k3.f5320y : null;
            if (c0415i != null) {
                if (i3 == 0) {
                    c0415i.c(c0415i.f5145p - 1);
                } else {
                    c0415i.c(c0415i.f5145p + 1);
                }
            }
        }
    }

    public final void d(boolean z3) {
        if (this.f5141l != z3) {
            this.f5141l = z3;
            if (z3 && !this.f5140k) {
                b(this.f5142m + 1);
            } else {
                if (z3 || this.f5140k) {
                    return;
                }
                b(this.f5142m - 1);
            }
        }
    }

    public final void e(boolean z3) {
        if (this.f5140k != z3) {
            this.f5140k = z3;
            if (z3 && !this.f5141l) {
                b(this.f5142m + 1);
            } else {
                if (z3 || this.f5141l) {
                    return;
                }
                b(this.f5142m - 1);
            }
        }
    }

    public final void f(boolean z3) {
        if (this.f5144o != z3) {
            this.f5144o = z3;
            if (z3 && !this.f5143n) {
                c(this.f5145p + 1);
            } else {
                if (z3 || this.f5143n) {
                    return;
                }
                c(this.f5145p - 1);
            }
        }
    }

    public final void g(boolean z3) {
        if (this.f5143n != z3) {
            this.f5143n = z3;
            if (z3 && !this.f5144o) {
                c(this.f5145p + 1);
            } else {
                if (z3 || this.f5144o) {
                    return;
                }
                c(this.f5145p - 1);
            }
        }
    }

    public final void h() {
        C0413G c0413g = this.f5146q;
        Object obj = c0413g.f5121s;
        C0444z c0444z = this.f5131a;
        C0415I c0415i = c0413g.f5110H;
        if ((obj != null || c0415i.a().o() != null) && c0413g.f5120r) {
            c0413g.f5120r = false;
            c0413g.f5121s = c0415i.a().o();
            C0444z k3 = c0444z.k();
            if (k3 != null) {
                C0444z.F(k3, false, 7);
            }
        }
        C0412F c0412f = this.f5147r;
        if (c0412f != null) {
            Object obj2 = c0412f.f5100x;
            C0415I c0415i2 = c0412f.f5102z;
            if (obj2 == null) {
                AbstractC0419M o02 = c0415i2.a().o0();
                p2.g.b(o02);
                if (o02.f5168n.o() == null) {
                    return;
                }
            }
            if (c0412f.f5099w) {
                c0412f.f5099w = false;
                AbstractC0419M o03 = c0415i2.a().o0();
                p2.g.b(o03);
                c0412f.f5100x = o03.f5168n.o();
                if (AbstractC0409C.n(c0444z)) {
                    C0444z k4 = c0444z.k();
                    if (k4 != null) {
                        C0444z.F(k4, false, 7);
                        return;
                    }
                    return;
                }
                C0444z k5 = c0444z.k();
                if (k5 != null) {
                    C0444z.D(k5, false, 7);
                }
            }
        }
    }
}
