package c0;

import A.AbstractC0000a;

/* loaded from: classes.dex */
public final class x extends AbstractC0141A {

    /* renamed from: c, reason: collision with root package name */
    public final float f3825c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3826d;

    public x(float f3, float f4) {
        super(1, false, true);
        this.f3825c = f3;
        this.f3826d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Float.compare(this.f3825c, xVar.f3825c) == 0 && Float.compare(this.f3826d, xVar.f3826d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3826d) + (Float.hashCode(this.f3825c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveQuadTo(dx=");
        sb.append(this.f3825c);
        sb.append(", dy=");
        return AbstractC0000a.f(sb, this.f3826d, ')');
    }
}
