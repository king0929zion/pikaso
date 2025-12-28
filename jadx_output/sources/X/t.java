package X;

import A.AbstractC0000a;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final float f2662a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2663b;

    public t(float f3, float f4) {
        this.f2662a = f3;
        this.f2663b = f4;
    }

    public final float[] a() {
        float f3 = this.f2662a;
        float f4 = this.f2663b;
        return new float[]{f3 / f4, 1.0f, ((1.0f - f3) - f4) / f4};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Float.compare(this.f2662a, tVar.f2662a) == 0 && Float.compare(this.f2663b, tVar.f2663b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f2663b) + (Float.hashCode(this.f2662a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WhitePoint(x=");
        sb.append(this.f2662a);
        sb.append(", y=");
        return AbstractC0000a.f(sb, this.f2663b, ')');
    }
}
