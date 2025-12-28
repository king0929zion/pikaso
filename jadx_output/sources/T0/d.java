package t0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final d f6202c = new d(new u2.a());

    /* renamed from: a, reason: collision with root package name */
    public final u2.a f6203a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6204b = 0;

    public d(u2.a aVar) {
        this.f6203a = aVar;
        if (Float.isNaN(0.0f)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        dVar.getClass();
        return this.f6203a.equals(dVar.f6203a) && this.f6204b == dVar.f6204b;
    }

    public final int hashCode() {
        return ((this.f6203a.hashCode() + (Float.hashCode(0.0f) * 31)) * 31) + this.f6204b;
    }

    public final String toString() {
        return "ProgressBarRangeInfo(current=0.0, range=" + this.f6203a + ", steps=" + this.f6204b + ')';
    }
}
