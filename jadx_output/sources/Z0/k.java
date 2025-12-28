package z0;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f6927a;

    public static final boolean a(int i3, int i4) {
        return i3 == i4;
    }

    public static String b(int i3) {
        return a(i3, 0) ? "None" : a(i3, 1) ? "All" : a(i3, 2) ? "Weight" : a(i3, 3) ? "Style" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f6927a == ((k) obj).f6927a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6927a);
    }

    public final String toString() {
        return b(this.f6927a);
    }
}
