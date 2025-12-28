package c0;

import A.AbstractC0000a;

/* loaded from: classes.dex */
public final class u extends AbstractC0141A {

    /* renamed from: c, reason: collision with root package name */
    public final float f3815c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3816d;

    public u(float f3, float f4) {
        super(3, false, false);
        this.f3815c = f3;
        this.f3816d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Float.compare(this.f3815c, uVar.f3815c) == 0 && Float.compare(this.f3816d, uVar.f3816d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3816d) + (Float.hashCode(this.f3815c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeMoveTo(dx=");
        sb.append(this.f3815c);
        sb.append(", dy=");
        return AbstractC0000a.f(sb, this.f3816d, ')');
    }
}
