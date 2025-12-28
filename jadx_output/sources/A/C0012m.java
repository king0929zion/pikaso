package A;

import p.AbstractC0537f;

/* renamed from: A.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0012m {

    /* renamed from: a, reason: collision with root package name */
    public final float f111a;

    /* renamed from: b, reason: collision with root package name */
    public final float f112b;

    /* renamed from: c, reason: collision with root package name */
    public final float f113c;

    /* renamed from: d, reason: collision with root package name */
    public final float f114d;

    /* renamed from: e, reason: collision with root package name */
    public final float f115e;

    public C0012m(float f3, float f4, float f5, float f6, float f7, float f8) {
        this.f111a = f3;
        this.f112b = f4;
        this.f113c = f5;
        this.f114d = f6;
        this.f115e = f8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0012m)) {
            return false;
        }
        C0012m c0012m = (C0012m) obj;
        return G0.e.a(this.f111a, c0012m.f111a) && G0.e.a(this.f112b, c0012m.f112b) && G0.e.a(this.f113c, c0012m.f113c) && G0.e.a(this.f114d, c0012m.f114d) && G0.e.a(this.f115e, c0012m.f115e);
    }

    public final int hashCode() {
        return Float.hashCode(this.f115e) + AbstractC0537f.a(this.f114d, AbstractC0537f.a(this.f113c, AbstractC0537f.a(this.f112b, Float.hashCode(this.f111a) * 31, 31), 31), 31);
    }
}
