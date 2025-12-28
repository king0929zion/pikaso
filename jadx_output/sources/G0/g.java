package G0;

import A.AbstractC0000a;

/* loaded from: classes.dex */
public final class g implements H0.a {

    /* renamed from: a, reason: collision with root package name */
    public final float f1261a;

    public g(float f3) {
        this.f1261a = f3;
    }

    @Override // H0.a
    public final float a(float f3) {
        return f3 / this.f1261a;
    }

    @Override // H0.a
    public final float b(float f3) {
        return f3 * this.f1261a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Float.compare(this.f1261a, ((g) obj).f1261a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1261a);
    }

    public final String toString() {
        return AbstractC0000a.f(new StringBuilder("LinearFontScaleConverter(fontScale="), this.f1261a, ')');
    }
}
