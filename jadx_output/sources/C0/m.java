package c0;

import A.AbstractC0000a;

/* loaded from: classes.dex */
public final class m extends AbstractC0141A {

    /* renamed from: c, reason: collision with root package name */
    public final float f3789c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3790d;

    public m(float f3, float f4) {
        super(3, false, false);
        this.f3789c = f3;
        this.f3790d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Float.compare(this.f3789c, mVar.f3789c) == 0 && Float.compare(this.f3790d, mVar.f3790d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3790d) + (Float.hashCode(this.f3789c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoveTo(x=");
        sb.append(this.f3789c);
        sb.append(", y=");
        return AbstractC0000a.f(sb, this.f3790d, ')');
    }
}
