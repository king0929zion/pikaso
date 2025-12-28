package F0;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f1181a;

    public static final boolean a(int i3, int i4) {
        return i3 == i4;
    }

    public static String b(int i3) {
        return a(i3, 1) ? "Left" : a(i3, 2) ? "Right" : a(i3, 3) ? "Center" : a(i3, 4) ? "Justify" : a(i3, 5) ? "Start" : a(i3, 6) ? "End" : a(i3, Integer.MIN_VALUE) ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f1181a == ((f) obj).f1181a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1181a);
    }

    public final String toString() {
        return b(this.f1181a);
    }
}
