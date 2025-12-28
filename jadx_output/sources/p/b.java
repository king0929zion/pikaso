package P;

import A.AbstractC0000a;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final float f2078a;

    public b(float f3) {
        this.f2078a = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Float.compare(this.f2078a, ((b) obj).f2078a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f2078a);
    }

    public final String toString() {
        return AbstractC0000a.f(new StringBuilder("Horizontal(bias="), this.f2078a, ')');
    }
}
