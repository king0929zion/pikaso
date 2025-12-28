package f0;

/* renamed from: f0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0257a {

    /* renamed from: a, reason: collision with root package name */
    public final int f4288a;

    public final boolean equals(Object obj) {
        if (obj instanceof C0257a) {
            return this.f4288a == ((C0257a) obj).f4288a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4288a);
    }

    public final String toString() {
        int i3 = this.f4288a;
        return i3 == 1 ? "Touch" : i3 == 2 ? "Keyboard" : "Error";
    }
}
