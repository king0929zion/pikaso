package androidx.recyclerview.widget;

import D.K0;
import M1.h;
import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import d1.C0217n;
import e1.i;
import e1.j;
import java.util.BitSet;
import s1.C0589c;
import v1.b;
import x.AbstractC0638c;
import z1.C0724C;
import z1.C0739m;
import z1.F;
import z1.L;
import z1.N;
import z1.O;
import z1.w;
import z1.x;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends w {
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final O[] f3564i;

    /* renamed from: j, reason: collision with root package name */
    public final b f3565j;

    /* renamed from: k, reason: collision with root package name */
    public final b f3566k;

    /* renamed from: l, reason: collision with root package name */
    public final int f3567l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f3568m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f3569n = false;

    /* renamed from: o, reason: collision with root package name */
    public final K0 f3570o;

    /* renamed from: p, reason: collision with root package name */
    public final int f3571p;

    /* renamed from: q, reason: collision with root package name */
    public N f3572q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f3573r;

    /* renamed from: s, reason: collision with root package name */
    public final h f3574s;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i3, int i4) {
        this.h = -1;
        this.f3568m = false;
        K0 k0 = new K0();
        this.f3570o = k0;
        this.f3571p = 2;
        new Rect();
        new C0589c(this);
        this.f3573r = true;
        this.f3574s = new h(11, this);
        C0739m y3 = w.y(context, attributeSet, i3, i4);
        int i5 = y3.f7064b;
        if (i5 != 0 && i5 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        a(null);
        if (i5 != this.f3567l) {
            this.f3567l = i5;
            b bVar = this.f3565j;
            this.f3565j = this.f3566k;
            this.f3566k = bVar;
            L();
        }
        int i6 = y3.f7065c;
        a(null);
        if (i6 != this.h) {
            k0.f706a = null;
            L();
            this.h = i6;
            new BitSet(this.h);
            this.f3564i = new O[this.h];
            for (int i7 = 0; i7 < this.h; i7++) {
                this.f3564i[i7] = new O(this, i7);
            }
            L();
        }
        boolean z3 = y3.f7066d;
        a(null);
        N n2 = this.f3572q;
        if (n2 != null && n2.f6992k != z3) {
            n2.f6992k = z3;
        }
        this.f3568m = z3;
        L();
        C0217n c0217n = new C0217n(1);
        c0217n.f4230b = 0;
        c0217n.f4231c = 0;
        this.f3565j = b.a(this, this.f3567l);
        this.f3566k = b.a(this, 1 - this.f3567l);
    }

    @Override // z1.w
    public final boolean A() {
        return this.f3571p != 0;
    }

    @Override // z1.w
    public final void B(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f7082b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f3574s);
        }
        for (int i3 = 0; i3 < this.h; i3++) {
            O o3 = this.f3564i[i3];
            o3.f6995a.clear();
            o3.f6996b = Integer.MIN_VALUE;
            o3.f6997c = Integer.MIN_VALUE;
        }
        recyclerView.requestLayout();
    }

    @Override // z1.w
    public final void C(AccessibilityEvent accessibilityEvent) {
        super.C(accessibilityEvent);
        if (p() > 0) {
            View S2 = S(false);
            View R2 = R(false);
            if (S2 == null || R2 == null) {
                return;
            }
            int x3 = w.x(S2);
            int x4 = w.x(R2);
            if (x3 < x4) {
                accessibilityEvent.setFromIndex(x3);
                accessibilityEvent.setToIndex(x4);
            } else {
                accessibilityEvent.setFromIndex(x4);
                accessibilityEvent.setToIndex(x3);
            }
        }
    }

    @Override // z1.w
    public final void E(C0724C c0724c, F f3, View view, j jVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof L)) {
            D(view, jVar);
            return;
        }
        L l3 = (L) layoutParams;
        if (this.f3567l == 0) {
            l3.getClass();
            jVar.i(i.a(false, -1, 1, -1, -1));
        } else {
            l3.getClass();
            jVar.i(i.a(false, -1, -1, -1, 1));
        }
    }

    @Override // z1.w
    public final void F(Parcelable parcelable) {
        if (parcelable instanceof N) {
            this.f3572q = (N) parcelable;
            L();
        }
    }

    @Override // z1.w
    public final Parcelable G() {
        N n2 = this.f3572q;
        if (n2 != null) {
            N n3 = new N();
            n3.f6988f = n2.f6988f;
            n3.f6986d = n2.f6986d;
            n3.f6987e = n2.f6987e;
            n3.f6989g = n2.f6989g;
            n3.h = n2.h;
            n3.f6990i = n2.f6990i;
            n3.f6992k = n2.f6992k;
            n3.f6993l = n2.f6993l;
            n3.f6994m = n2.f6994m;
            n3.f6991j = n2.f6991j;
            return n3;
        }
        N n4 = new N();
        n4.f6992k = this.f3568m;
        n4.f6993l = false;
        n4.f6994m = false;
        n4.h = 0;
        if (p() > 0) {
            n4.f6986d = T();
            View R2 = this.f3569n ? R(true) : S(true);
            n4.f6987e = R2 != null ? w.x(R2) : -1;
            int i3 = this.h;
            n4.f6988f = i3;
            n4.f6989g = new int[i3];
            for (int i4 = 0; i4 < this.h; i4++) {
                O o3 = this.f3564i[i4];
                int i5 = o3.f6996b;
                if (i5 == Integer.MIN_VALUE) {
                    if (o3.f6995a.size() == 0) {
                        i5 = Integer.MIN_VALUE;
                    } else {
                        View view = (View) o3.f6995a.get(0);
                        L l3 = (L) view.getLayoutParams();
                        o3.f6996b = o3.f6999e.f3565j.c(view);
                        l3.getClass();
                        i5 = o3.f6996b;
                    }
                }
                if (i5 != Integer.MIN_VALUE) {
                    i5 -= this.f3565j.e();
                }
                n4.f6989g[i4] = i5;
            }
        } else {
            n4.f6986d = -1;
            n4.f6987e = -1;
            n4.f6988f = 0;
        }
        return n4;
    }

    @Override // z1.w
    public final void H(int i3) {
        if (i3 == 0) {
            N();
        }
    }

    public final boolean N() {
        int T2;
        if (p() != 0 && this.f3571p != 0 && this.f7085e) {
            if (this.f3569n) {
                T2 = U();
                T();
            } else {
                T2 = T();
                U();
            }
            if (T2 == 0) {
                int p3 = p();
                int i3 = p3 - 1;
                new BitSet(this.h).set(0, this.h, true);
                if (this.f3567l == 1 && s() != 1) {
                }
                if (this.f3569n) {
                    p3 = -1;
                } else {
                    i3 = 0;
                }
                if (i3 != p3) {
                    ((L) o(i3).getLayoutParams()).getClass();
                    throw null;
                }
            }
        }
        return false;
    }

    public final int O(F f3) {
        if (p() == 0) {
            return 0;
        }
        b bVar = this.f3565j;
        boolean z3 = !this.f3573r;
        return AbstractC0638c.a(f3, bVar, S(z3), R(z3), this, this.f3573r);
    }

    public final int P(F f3) {
        if (p() == 0) {
            return 0;
        }
        b bVar = this.f3565j;
        boolean z3 = !this.f3573r;
        return AbstractC0638c.b(f3, bVar, S(z3), R(z3), this, this.f3573r, this.f3569n);
    }

    public final int Q(F f3) {
        if (p() == 0) {
            return 0;
        }
        b bVar = this.f3565j;
        boolean z3 = !this.f3573r;
        return AbstractC0638c.c(f3, bVar, S(z3), R(z3), this, this.f3573r);
    }

    public final View R(boolean z3) {
        int e3 = this.f3565j.e();
        int d3 = this.f3565j.d();
        View view = null;
        for (int p3 = p() - 1; p3 >= 0; p3--) {
            View o3 = o(p3);
            int c3 = this.f3565j.c(o3);
            int b3 = this.f3565j.b(o3);
            if (b3 > e3 && c3 < d3) {
                if (b3 <= d3 || !z3) {
                    return o3;
                }
                if (view == null) {
                    view = o3;
                }
            }
        }
        return view;
    }

    public final View S(boolean z3) {
        int e3 = this.f3565j.e();
        int d3 = this.f3565j.d();
        int p3 = p();
        View view = null;
        for (int i3 = 0; i3 < p3; i3++) {
            View o3 = o(i3);
            int c3 = this.f3565j.c(o3);
            if (this.f3565j.b(o3) > e3 && c3 < d3) {
                if (c3 >= e3 || !z3) {
                    return o3;
                }
                if (view == null) {
                    view = o3;
                }
            }
        }
        return view;
    }

    public final int T() {
        if (p() == 0) {
            return 0;
        }
        return w.x(o(0));
    }

    public final int U() {
        int p3 = p();
        if (p3 == 0) {
            return 0;
        }
        return w.x(o(p3 - 1));
    }

    @Override // z1.w
    public final void a(String str) {
        if (this.f3572q == null) {
            super.a(str);
        }
    }

    @Override // z1.w
    public final boolean b() {
        return this.f3567l == 0;
    }

    @Override // z1.w
    public final boolean c() {
        return this.f3567l == 1;
    }

    @Override // z1.w
    public final boolean d(x xVar) {
        return xVar instanceof L;
    }

    @Override // z1.w
    public final int f(F f3) {
        return O(f3);
    }

    @Override // z1.w
    public final int g(F f3) {
        return P(f3);
    }

    @Override // z1.w
    public final int h(F f3) {
        return Q(f3);
    }

    @Override // z1.w
    public final int i(F f3) {
        return O(f3);
    }

    @Override // z1.w
    public final int j(F f3) {
        return P(f3);
    }

    @Override // z1.w
    public final int k(F f3) {
        return Q(f3);
    }

    @Override // z1.w
    public final x l() {
        return this.f3567l == 0 ? new L(-2, -1) : new L(-1, -2);
    }

    @Override // z1.w
    public final x m(Context context, AttributeSet attributeSet) {
        return new L(context, attributeSet);
    }

    @Override // z1.w
    public final x n(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new L((ViewGroup.MarginLayoutParams) layoutParams) : new L(layoutParams);
    }

    @Override // z1.w
    public final int q(C0724C c0724c, F f3) {
        return this.f3567l == 1 ? this.h : super.q(c0724c, f3);
    }

    @Override // z1.w
    public final int z(C0724C c0724c, F f3) {
        return this.f3567l == 0 ? this.h : super.z(c0724c, f3);
    }
}
