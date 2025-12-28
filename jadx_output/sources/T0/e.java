package t0;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f6205a;

    public static final boolean a(int i3, int i4) {
        return i3 == i4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f6205a == ((e) obj).f6205a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6205a);
    }

    public final String toString() {
        int i3 = this.f6205a;
        return a(i3, 0) ? "Button" : a(i3, 1) ? "Checkbox" : a(i3, 2) ? "Switch" : a(i3, 3) ? "RadioButton" : a(i3, 4) ? "Tab" : a(i3, 5) ? "Image" : a(i3, 6) ? "DropdownList" : "Unknown";
    }
}
