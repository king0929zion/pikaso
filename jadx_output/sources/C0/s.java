package c0;

import A.AbstractC0000a;

/* loaded from: classes.dex */
public final class s extends AbstractC0141A {

    /* renamed from: c, reason: collision with root package name */
    public final float f3812c;

    public s(float f3) {
        super(3, false, false);
        this.f3812c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && Float.compare(this.f3812c, ((s) obj).f3812c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3812c);
    }

    public final String toString() {
        return AbstractC0000a.f(new StringBuilder("RelativeHorizontalTo(dx="), this.f3812c, ')');
    }
}
