package c0;

import A.AbstractC0000a;

/* loaded from: classes.dex */
public final class p extends AbstractC0141A {

    /* renamed from: c, reason: collision with root package name */
    public final float f3799c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3800d;

    public p(float f3, float f4) {
        super(1, false, true);
        this.f3799c = f3;
        this.f3800d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Float.compare(this.f3799c, pVar.f3799c) == 0 && Float.compare(this.f3800d, pVar.f3800d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3800d) + (Float.hashCode(this.f3799c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReflectiveQuadTo(x=");
        sb.append(this.f3799c);
        sb.append(", y=");
        return AbstractC0000a.f(sb, this.f3800d, ')');
    }
}
