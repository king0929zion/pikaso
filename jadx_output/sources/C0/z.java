package c0;

import A.AbstractC0000a;

/* loaded from: classes.dex */
public final class z extends AbstractC0141A {

    /* renamed from: c, reason: collision with root package name */
    public final float f3828c;

    public z(float f3) {
        super(3, false, false);
        this.f3828c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && Float.compare(this.f3828c, ((z) obj).f3828c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3828c);
    }

    public final String toString() {
        return AbstractC0000a.f(new StringBuilder("VerticalTo(y="), this.f3828c, ')');
    }
}
