package P;

import A.AbstractC0000a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final float f2080a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2081b;

    public d(float f3, float f4) {
        this.f2080a = f3;
        this.f2081b = f4;
    }

    public final long a(long j3, long j4, G0.f fVar) {
        float f3 = (((int) (j4 >> 32)) - ((int) (j3 >> 32))) / 2.0f;
        float f4 = (((int) (j4 & 4294967295L)) - ((int) (j3 & 4294967295L))) / 2.0f;
        G0.f fVar2 = G0.f.f1258d;
        float f5 = this.f2080a;
        if (fVar != fVar2) {
            f5 *= -1;
        }
        float f6 = 1;
        return r2.a.c(Math.round((f5 + f6) * f3), Math.round((f6 + this.f2081b) * f4));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f2080a, dVar.f2080a) == 0 && Float.compare(this.f2081b, dVar.f2081b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f2081b) + (Float.hashCode(this.f2080a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiasAlignment(horizontalBias=");
        sb.append(this.f2080a);
        sb.append(", verticalBias=");
        return AbstractC0000a.f(sb, this.f2081b, ')');
    }
}
