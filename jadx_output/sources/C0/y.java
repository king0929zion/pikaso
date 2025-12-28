package c0;

import A.AbstractC0000a;

/* loaded from: classes.dex */
public final class y extends AbstractC0141A {

    /* renamed from: c, reason: collision with root package name */
    public final float f3827c;

    public y(float f3) {
        super(3, false, false);
        this.f3827c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && Float.compare(this.f3827c, ((y) obj).f3827c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3827c);
    }

    public final String toString() {
        return AbstractC0000a.f(new StringBuilder("RelativeVerticalTo(dy="), this.f3827c, ')');
    }
}
