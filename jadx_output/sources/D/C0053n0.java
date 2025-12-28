package D;

import n.C0403w;
import n.C0405y;

/* renamed from: D.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0053n0 {

    /* renamed from: a, reason: collision with root package name */
    public int f831a;

    /* renamed from: b, reason: collision with root package name */
    public C0060t f832b;

    /* renamed from: c, reason: collision with root package name */
    public C0030c f833c;

    /* renamed from: d, reason: collision with root package name */
    public o2.e f834d;

    /* renamed from: e, reason: collision with root package name */
    public int f835e;

    /* renamed from: f, reason: collision with root package name */
    public C0403w f836f;

    /* renamed from: g, reason: collision with root package name */
    public C0405y f837g;

    public C0053n0(C0060t c0060t) {
        this.f832b = c0060t;
    }

    public static boolean a(D d3, C0405y c0405y) {
        p2.g.c(d3, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        return !p2.g.a(d3.h().f645f, c0405y.e(d3));
    }

    public final boolean b() {
        if (this.f832b == null) {
            return false;
        }
        C0030c c0030c = this.f833c;
        return c0030c != null ? c0030c.a() : false;
    }

    public final int c(Object obj) {
        int m2;
        C0060t c0060t = this.f832b;
        if (c0060t == null || (m2 = c0060t.m(this, obj)) == 0) {
            return 1;
        }
        return m2;
    }

    public final void d() {
        C0060t c0060t = this.f832b;
        if (c0060t != null) {
            c0060t.f878r = true;
        }
        this.f832b = null;
        this.f836f = null;
        this.f837g = null;
    }

    public final void e(boolean z3) {
        if (z3) {
            this.f831a |= 32;
        } else {
            this.f831a &= -33;
        }
    }
}
