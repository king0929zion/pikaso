package c0;

import A.AbstractC0000a;
import p.AbstractC0537f;

/* renamed from: c0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0154e {

    /* renamed from: k, reason: collision with root package name */
    public static final X1.e f3742k = new X1.e(16);

    /* renamed from: l, reason: collision with root package name */
    public static int f3743l;

    /* renamed from: a, reason: collision with root package name */
    public final String f3744a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3745b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3746c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3747d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3748e;

    /* renamed from: f, reason: collision with root package name */
    public final C0145E f3749f;

    /* renamed from: g, reason: collision with root package name */
    public final long f3750g;
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f3751i;

    /* renamed from: j, reason: collision with root package name */
    public final int f3752j;

    public C0154e(String str, float f3, float f4, float f5, float f6, C0145E c0145e, long j3, int i3, boolean z3) {
        int i4;
        synchronized (f3742k) {
            i4 = f3743l;
            f3743l = i4 + 1;
        }
        this.f3744a = str;
        this.f3745b = f3;
        this.f3746c = f4;
        this.f3747d = f5;
        this.f3748e = f6;
        this.f3749f = c0145e;
        this.f3750g = j3;
        this.h = i3;
        this.f3751i = z3;
        this.f3752j = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0154e)) {
            return false;
        }
        C0154e c0154e = (C0154e) obj;
        return p2.g.a(this.f3744a, c0154e.f3744a) && G0.e.a(this.f3745b, c0154e.f3745b) && G0.e.a(this.f3746c, c0154e.f3746c) && this.f3747d == c0154e.f3747d && this.f3748e == c0154e.f3748e && this.f3749f.equals(c0154e.f3749f) && W.r.c(this.f3750g, c0154e.f3750g) && W.D.l(this.h, c0154e.h) && this.f3751i == c0154e.f3751i;
    }

    public final int hashCode() {
        int hashCode = (this.f3749f.hashCode() + AbstractC0537f.a(this.f3748e, AbstractC0537f.a(this.f3747d, AbstractC0537f.a(this.f3746c, AbstractC0537f.a(this.f3745b, this.f3744a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i3 = W.r.f2563g;
        return Boolean.hashCode(this.f3751i) + AbstractC0000a.a(this.h, AbstractC0000a.b(hashCode, 31, this.f3750g), 31);
    }
}
