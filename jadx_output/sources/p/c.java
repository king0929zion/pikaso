package P;

import A.AbstractC0000a;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final float f2079a;

    public c(float f3) {
        this.f2079a = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Float.compare(this.f2079a, ((c) obj).f2079a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f2079a);
    }

    public final String toString() {
        return AbstractC0000a.f(new StringBuilder("Vertical(bias="), this.f2079a, ')');
    }
}
