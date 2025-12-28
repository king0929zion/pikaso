package G0;

/* loaded from: classes.dex */
public final class e implements Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final float f1257d;

    public static final boolean a(float f3, float f4) {
        return Float.compare(f3, f4) == 0;
    }

    public static String b(float f3) {
        if (Float.isNaN(f3)) {
            return "Dp.Unspecified";
        }
        return f3 + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Float.compare(this.f1257d, ((e) obj).f1257d);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return Float.compare(this.f1257d, ((e) obj).f1257d) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1257d);
    }

    public final String toString() {
        return b(this.f1257d);
    }
}
