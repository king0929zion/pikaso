package D;

import n.C0405y;

/* loaded from: classes.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    public final C0405y f733a;

    public final boolean equals(Object obj) {
        if (obj instanceof Y) {
            return p2.g.a(this.f733a, ((Y) obj).f733a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f733a.hashCode();
    }

    public final String toString() {
        return "MutableScatterMultiMap(map=" + this.f733a + ')';
    }
}
