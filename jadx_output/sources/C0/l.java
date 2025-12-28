package c0;

import A.AbstractC0000a;

/* loaded from: classes.dex */
public final class l extends AbstractC0141A {

    /* renamed from: c, reason: collision with root package name */
    public final float f3787c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3788d;

    public l(float f3, float f4) {
        super(3, false, false);
        this.f3787c = f3;
        this.f3788d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Float.compare(this.f3787c, lVar.f3787c) == 0 && Float.compare(this.f3788d, lVar.f3788d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3788d) + (Float.hashCode(this.f3787c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineTo(x=");
        sb.append(this.f3787c);
        sb.append(", y=");
        return AbstractC0000a.f(sb, this.f3788d, ')');
    }
}
