package u2;

/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: g, reason: collision with root package name */
    public static final d f6307g = new d(1, 0, 1);

    @Override // u2.b
    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            if (!isEmpty() || !((d) obj).isEmpty()) {
                d dVar = (d) obj;
                if (this.f6300d == dVar.f6300d) {
                    if (this.f6301e == dVar.f6301e) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // u2.b
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f6300d * 31) + this.f6301e;
    }

    @Override // u2.b
    public final boolean isEmpty() {
        return this.f6300d > this.f6301e;
    }

    @Override // u2.b
    public final String toString() {
        return this.f6300d + ".." + this.f6301e;
    }
}
