package androidx.recyclerview.widget;

import A.AbstractC0000a;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import s1.C0589c;
import v1.b;
import x.AbstractC0638c;
import z1.C0739m;
import z1.C0740n;
import z1.F;
import z1.w;
import z1.x;

/* loaded from: classes.dex */
public class LinearLayoutManager extends w {

    /* renamed from: i, reason: collision with root package name */
    public C0589c f3498i;

    /* renamed from: j, reason: collision with root package name */
    public b f3499j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f3500k;
    public int h = 1;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f3501l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3502m = false;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f3503n = true;

    /* renamed from: o, reason: collision with root package name */
    public C0740n f3504o = null;

    /* renamed from: p, reason: collision with root package name */
    public final C0739m f3505p = new C0739m(0);

    public LinearLayoutManager() {
        this.f3500k = false;
        U(1);
        a(null);
        if (this.f3500k) {
            this.f3500k = false;
            L();
        }
    }

    @Override // z1.w
    public final boolean A() {
        return true;
    }

    @Override // z1.w
    public final void B(RecyclerView recyclerView) {
    }

    @Override // z1.w
    public final void C(AccessibilityEvent accessibilityEvent) {
        super.C(accessibilityEvent);
        if (p() > 0) {
            View T2 = T(0, p(), false);
            accessibilityEvent.setFromIndex(T2 == null ? -1 : w.x(T2));
            View T3 = T(p() - 1, -1, false);
            accessibilityEvent.setToIndex(T3 != null ? w.x(T3) : -1);
        }
    }

    @Override // z1.w
    public final void F(Parcelable parcelable) {
        if (parcelable instanceof C0740n) {
            this.f3504o = (C0740n) parcelable;
            L();
        }
    }

    @Override // z1.w
    public final Parcelable G() {
        C0740n c0740n = this.f3504o;
        if (c0740n != null) {
            C0740n c0740n2 = new C0740n();
            c0740n2.f7068d = c0740n.f7068d;
            c0740n2.f7069e = c0740n.f7069e;
            c0740n2.f7070f = c0740n.f7070f;
            return c0740n2;
        }
        C0740n c0740n3 = new C0740n();
        if (p() > 0) {
            Q();
            boolean z3 = false ^ this.f3501l;
            c0740n3.f7070f = z3;
            if (z3) {
                View o3 = o(this.f3501l ? 0 : p() - 1);
                c0740n3.f7069e = this.f3499j.d() - this.f3499j.b(o3);
                c0740n3.f7068d = w.x(o3);
            } else {
                View o4 = o(this.f3501l ? p() - 1 : 0);
                c0740n3.f7068d = w.x(o4);
                c0740n3.f7069e = this.f3499j.c(o4) - this.f3499j.e();
            }
        } else {
            c0740n3.f7068d = -1;
        }
        return c0740n3;
    }

    public final int N(F f3) {
        if (p() == 0) {
            return 0;
        }
        Q();
        b bVar = this.f3499j;
        boolean z3 = !this.f3503n;
        return AbstractC0638c.a(f3, bVar, S(z3), R(z3), this, this.f3503n);
    }

    public final int O(F f3) {
        if (p() == 0) {
            return 0;
        }
        Q();
        b bVar = this.f3499j;
        boolean z3 = !this.f3503n;
        return AbstractC0638c.b(f3, bVar, S(z3), R(z3), this, this.f3503n, this.f3501l);
    }

    public final int P(F f3) {
        if (p() == 0) {
            return 0;
        }
        Q();
        b bVar = this.f3499j;
        boolean z3 = !this.f3503n;
        return AbstractC0638c.c(f3, bVar, S(z3), R(z3), this, this.f3503n);
    }

    public final void Q() {
        if (this.f3498i == null) {
            this.f3498i = new C0589c(16, false);
        }
    }

    public final View R(boolean z3) {
        return this.f3501l ? T(0, p(), z3) : T(p() - 1, -1, z3);
    }

    public final View S(boolean z3) {
        return this.f3501l ? T(p() - 1, -1, z3) : T(0, p(), z3);
    }

    public final View T(int i3, int i4, boolean z3) {
        Q();
        int i5 = z3 ? 24579 : 320;
        return this.h == 0 ? this.f7083c.j(i3, i4, i5, 320) : this.f7084d.j(i3, i4, i5, 320);
    }

    public final void U(int i3) {
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException(AbstractC0000a.c("invalid orientation:", i3));
        }
        a(null);
        if (i3 != this.h || this.f3499j == null) {
            this.f3499j = b.a(this, i3);
            this.f3505p.getClass();
            this.h = i3;
            L();
        }
    }

    public void V(boolean z3) {
        a(null);
        if (this.f3502m == z3) {
            return;
        }
        this.f3502m = z3;
        L();
    }

    @Override // z1.w
    public final void a(String str) {
        if (this.f3504o == null) {
            super.a(str);
        }
    }

    @Override // z1.w
    public final boolean b() {
        return this.h == 0;
    }

    @Override // z1.w
    public final boolean c() {
        return this.h == 1;
    }

    @Override // z1.w
    public final int f(F f3) {
        return N(f3);
    }

    @Override // z1.w
    public int g(F f3) {
        return O(f3);
    }

    @Override // z1.w
    public int h(F f3) {
        return P(f3);
    }

    @Override // z1.w
    public final int i(F f3) {
        return N(f3);
    }

    @Override // z1.w
    public int j(F f3) {
        return O(f3);
    }

    @Override // z1.w
    public int k(F f3) {
        return P(f3);
    }

    @Override // z1.w
    public x l() {
        return new x(-2, -2);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i3, int i4) {
        this.f3500k = false;
        C0739m y3 = w.y(context, attributeSet, i3, i4);
        U(y3.f7064b);
        boolean z3 = y3.f7066d;
        a(null);
        if (z3 != this.f3500k) {
            this.f3500k = z3;
            L();
        }
        V(y3.f7067e);
    }
}
