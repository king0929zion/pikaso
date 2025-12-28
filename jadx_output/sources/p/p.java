package p;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public double f5906a;

    /* renamed from: b, reason: collision with root package name */
    public double f5907b;

    public p(double d3, double d4) {
        this.f5906a = d3;
        this.f5907b = d4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Double.compare(this.f5906a, pVar.f5906a) == 0 && Double.compare(this.f5907b, pVar.f5907b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f5907b) + (Double.hashCode(this.f5906a) * 31);
    }

    public final String toString() {
        return "ComplexDouble(_real=" + this.f5906a + ", _imaginary=" + this.f5907b + ')';
    }
}
