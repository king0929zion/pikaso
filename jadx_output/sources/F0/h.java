package F0;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f1185a;

    public static final boolean a(int i3, int i4) {
        return i3 == i4;
    }

    public static String b(int i3) {
        return a(i3, 1) ? "Ltr" : a(i3, 2) ? "Rtl" : a(i3, 3) ? "Content" : a(i3, 4) ? "ContentOrLtr" : a(i3, 5) ? "ContentOrRtl" : a(i3, Integer.MIN_VALUE) ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f1185a == ((h) obj).f1185a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1185a);
    }

    public final String toString() {
        return b(this.f1185a);
    }
}
