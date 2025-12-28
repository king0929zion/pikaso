package F0;

import A.AbstractC0000a;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: c, reason: collision with root package name */
    public static final k f1187c = new k(1.0f, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f1188a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1189b;

    public k(float f3, float f4) {
        this.f1188a = f3;
        this.f1189b = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f1188a == kVar.f1188a && this.f1189b == kVar.f1189b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1189b) + (Float.hashCode(this.f1188a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextGeometricTransform(scaleX=");
        sb.append(this.f1188a);
        sb.append(", skewX=");
        return AbstractC0000a.f(sb, this.f1189b, ')');
    }
}
