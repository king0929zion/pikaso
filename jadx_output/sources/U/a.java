package U;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f2331a;

    public static final boolean a(int i3, int i4) {
        return i3 == i4;
    }

    public static String b(int i3) {
        return a(i3, 1) ? "Next" : a(i3, 2) ? "Previous" : a(i3, 3) ? "Left" : a(i3, 4) ? "Right" : a(i3, 5) ? "Up" : a(i3, 6) ? "Down" : a(i3, 7) ? "Enter" : a(i3, 8) ? "Exit" : "Invalid FocusDirection";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f2331a == ((a) obj).f2331a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2331a);
    }

    public final String toString() {
        return b(this.f2331a);
    }
}
