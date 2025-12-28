package F0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f1171a;

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return Float.compare(this.f1171a, ((a) obj).f1171a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1171a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.f1171a + ')';
    }
}
