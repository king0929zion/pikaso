package p2;

/* loaded from: classes.dex */
public final class k implements c {

    /* renamed from: a, reason: collision with root package name */
    public final Class f5956a;

    public k(Class cls) {
        this.f5956a = cls;
    }

    @Override // p2.c
    public final Class a() {
        return this.f5956a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            if (g.a(this.f5956a, ((k) obj).f5956a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f5956a.hashCode();
    }

    public final String toString() {
        return this.f5956a.toString() + " (Kotlin reflection is not available)";
    }
}
