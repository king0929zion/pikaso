package O0;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class d extends ViewGroup.MarginLayoutParams {

    /* renamed from: A, reason: collision with root package name */
    public float f1886A;

    /* renamed from: B, reason: collision with root package name */
    public String f1887B;

    /* renamed from: C, reason: collision with root package name */
    public int f1888C;

    /* renamed from: D, reason: collision with root package name */
    public float f1889D;

    /* renamed from: E, reason: collision with root package name */
    public float f1890E;

    /* renamed from: F, reason: collision with root package name */
    public int f1891F;

    /* renamed from: G, reason: collision with root package name */
    public int f1892G;

    /* renamed from: H, reason: collision with root package name */
    public int f1893H;

    /* renamed from: I, reason: collision with root package name */
    public int f1894I;

    /* renamed from: J, reason: collision with root package name */
    public int f1895J;

    /* renamed from: K, reason: collision with root package name */
    public int f1896K;

    /* renamed from: L, reason: collision with root package name */
    public int f1897L;

    /* renamed from: M, reason: collision with root package name */
    public int f1898M;

    /* renamed from: N, reason: collision with root package name */
    public float f1899N;

    /* renamed from: O, reason: collision with root package name */
    public float f1900O;

    /* renamed from: P, reason: collision with root package name */
    public int f1901P;

    /* renamed from: Q, reason: collision with root package name */
    public int f1902Q;

    /* renamed from: R, reason: collision with root package name */
    public int f1903R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f1904S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f1905T;

    /* renamed from: U, reason: collision with root package name */
    public String f1906U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f1907V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f1908W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f1909X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f1910Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f1911Z;

    /* renamed from: a, reason: collision with root package name */
    public int f1912a;

    /* renamed from: a0, reason: collision with root package name */
    public int f1913a0;

    /* renamed from: b, reason: collision with root package name */
    public int f1914b;

    /* renamed from: b0, reason: collision with root package name */
    public int f1915b0;

    /* renamed from: c, reason: collision with root package name */
    public float f1916c;

    /* renamed from: c0, reason: collision with root package name */
    public int f1917c0;

    /* renamed from: d, reason: collision with root package name */
    public int f1918d;

    /* renamed from: d0, reason: collision with root package name */
    public int f1919d0;

    /* renamed from: e, reason: collision with root package name */
    public int f1920e;

    /* renamed from: e0, reason: collision with root package name */
    public int f1921e0;

    /* renamed from: f, reason: collision with root package name */
    public int f1922f;

    /* renamed from: f0, reason: collision with root package name */
    public int f1923f0;

    /* renamed from: g, reason: collision with root package name */
    public int f1924g;

    /* renamed from: g0, reason: collision with root package name */
    public float f1925g0;
    public int h;

    /* renamed from: h0, reason: collision with root package name */
    public int f1926h0;

    /* renamed from: i, reason: collision with root package name */
    public int f1927i;
    public int i0;

    /* renamed from: j, reason: collision with root package name */
    public int f1928j;

    /* renamed from: j0, reason: collision with root package name */
    public float f1929j0;

    /* renamed from: k, reason: collision with root package name */
    public int f1930k;
    public M0.d k0;

    /* renamed from: l, reason: collision with root package name */
    public int f1931l;

    /* renamed from: m, reason: collision with root package name */
    public int f1932m;

    /* renamed from: n, reason: collision with root package name */
    public int f1933n;

    /* renamed from: o, reason: collision with root package name */
    public float f1934o;

    /* renamed from: p, reason: collision with root package name */
    public int f1935p;

    /* renamed from: q, reason: collision with root package name */
    public int f1936q;

    /* renamed from: r, reason: collision with root package name */
    public int f1937r;

    /* renamed from: s, reason: collision with root package name */
    public int f1938s;

    /* renamed from: t, reason: collision with root package name */
    public int f1939t;

    /* renamed from: u, reason: collision with root package name */
    public int f1940u;

    /* renamed from: v, reason: collision with root package name */
    public int f1941v;

    /* renamed from: w, reason: collision with root package name */
    public int f1942w;

    /* renamed from: x, reason: collision with root package name */
    public int f1943x;

    /* renamed from: y, reason: collision with root package name */
    public int f1944y;

    /* renamed from: z, reason: collision with root package name */
    public float f1945z;

    public final void a() {
        this.f1910Y = false;
        this.f1907V = true;
        this.f1908W = true;
        int i3 = ((ViewGroup.MarginLayoutParams) this).width;
        if (i3 == -2 && this.f1904S) {
            this.f1907V = false;
            if (this.f1893H == 0) {
                this.f1893H = 1;
            }
        }
        int i4 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i4 == -2 && this.f1905T) {
            this.f1908W = false;
            if (this.f1894I == 0) {
                this.f1894I = 1;
            }
        }
        if (i3 == 0 || i3 == -1) {
            this.f1907V = false;
            if (i3 == 0 && this.f1893H == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.f1904S = true;
            }
        }
        if (i4 == 0 || i4 == -1) {
            this.f1908W = false;
            if (i4 == 0 && this.f1894I == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.f1905T = true;
            }
        }
        if (this.f1916c == -1.0f && this.f1912a == -1 && this.f1914b == -1) {
            return;
        }
        this.f1910Y = true;
        this.f1907V = true;
        this.f1908W = true;
        if (!(this.k0 instanceof M0.h)) {
            this.k0 = new M0.h();
        }
        ((M0.h) this.k0).B(this.f1903R);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void resolveLayoutDirection(int r10) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.d.resolveLayoutDirection(int):void");
    }
}
