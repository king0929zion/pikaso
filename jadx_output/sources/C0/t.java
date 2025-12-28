package c0;

import A.AbstractC0000a;

/* loaded from: classes.dex */
public final class t extends AbstractC0141A {

    /* renamed from: c, reason: collision with root package name */
    public final float f3813c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3814d;

    public t(float f3, float f4) {
        super(3, false, false);
        this.f3813c = f3;
        this.f3814d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Float.compare(this.f3813c, tVar.f3813c) == 0 && Float.compare(this.f3814d, tVar.f3814d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3814d) + (Float.hashCode(this.f3813c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeLineTo(dx=");
        sb.append(this.f3813c);
        sb.append(", dy=");
        return AbstractC0000a.f(sb, this.f3814d, ')');
    }
}
