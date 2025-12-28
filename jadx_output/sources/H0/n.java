package h0;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final int f4389a;

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return this.f4389a == ((n) obj).f4389a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4389a);
    }

    public final String toString() {
        return "PointerKeyboardModifiers(packedValue=" + this.f4389a + ')';
    }
}
