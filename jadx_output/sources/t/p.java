package t;

import p.AbstractC0537f;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final float f6182a;

    /* renamed from: b, reason: collision with root package name */
    public final float f6183b;

    /* renamed from: c, reason: collision with root package name */
    public final float f6184c;

    /* renamed from: d, reason: collision with root package name */
    public final float f6185d;

    public p(float f3, float f4, float f5, float f6) {
        this.f6182a = f3;
        this.f6183b = f4;
        this.f6184c = f5;
        this.f6185d = f6;
        if (f3 < 0.0f) {
            throw new IllegalArgumentException("Start padding must be non-negative");
        }
        if (f4 < 0.0f) {
            throw new IllegalArgumentException("Top padding must be non-negative");
        }
        if (f5 < 0.0f) {
            throw new IllegalArgumentException("End padding must be non-negative");
        }
        if (f6 < 0.0f) {
            throw new IllegalArgumentException("Bottom padding must be non-negative");
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return G0.e.a(this.f6182a, pVar.f6182a) && G0.e.a(this.f6183b, pVar.f6183b) && G0.e.a(this.f6184c, pVar.f6184c) && G0.e.a(this.f6185d, pVar.f6185d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f6185d) + AbstractC0537f.a(this.f6184c, AbstractC0537f.a(this.f6183b, Float.hashCode(this.f6182a) * 31, 31), 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) G0.e.b(this.f6182a)) + ", top=" + ((Object) G0.e.b(this.f6183b)) + ", end=" + ((Object) G0.e.b(this.f6184c)) + ", bottom=" + ((Object) G0.e.b(this.f6185d)) + ')';
    }
}
