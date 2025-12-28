package K;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f1434a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f1434a == ((a) obj).f1434a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1434a);
    }

    public final String toString() {
        return "DeltaCounter(count=" + this.f1434a + ')';
    }
}
