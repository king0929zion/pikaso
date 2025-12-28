package G0;

import A.AbstractC0000a;

/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: d, reason: collision with root package name */
    public final float f1252d;

    /* renamed from: e, reason: collision with root package name */
    public final float f1253e;

    public c(float f3, float f4) {
        this.f1252d = f3;
        this.f1253e = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Float.compare(this.f1252d, cVar.f1252d) == 0 && Float.compare(this.f1253e, cVar.f1253e) == 0;
    }

    @Override // G0.b
    public final float f() {
        return this.f1253e;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1253e) + (Float.hashCode(this.f1252d) * 31);
    }

    @Override // G0.b
    public final float n() {
        return this.f1252d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DensityImpl(density=");
        sb.append(this.f1252d);
        sb.append(", fontScale=");
        return AbstractC0000a.f(sb, this.f1253e, ')');
    }
}
