package A;

import p.AbstractC0537f;

/* renamed from: A.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0006g {

    /* renamed from: a, reason: collision with root package name */
    public final float f87a;

    /* renamed from: b, reason: collision with root package name */
    public final float f88b;

    /* renamed from: c, reason: collision with root package name */
    public final float f89c;

    /* renamed from: d, reason: collision with root package name */
    public final float f90d;

    /* renamed from: e, reason: collision with root package name */
    public final float f91e;

    public C0006g(float f3, float f4, float f5, float f6, float f7) {
        this.f87a = f3;
        this.f88b = f4;
        this.f89c = f5;
        this.f90d = f6;
        this.f91e = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0006g)) {
            return false;
        }
        C0006g c0006g = (C0006g) obj;
        return G0.e.a(this.f87a, c0006g.f87a) && G0.e.a(this.f88b, c0006g.f88b) && G0.e.a(this.f89c, c0006g.f89c) && G0.e.a(this.f90d, c0006g.f90d) && G0.e.a(this.f91e, c0006g.f91e);
    }

    public final int hashCode() {
        return Float.hashCode(this.f91e) + AbstractC0537f.a(this.f90d, AbstractC0537f.a(this.f89c, AbstractC0537f.a(this.f88b, Float.hashCode(this.f87a) * 31, 31), 31), 31);
    }
}
