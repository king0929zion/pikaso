package X;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final double f2655a;

    /* renamed from: b, reason: collision with root package name */
    public final double f2656b;

    /* renamed from: c, reason: collision with root package name */
    public final double f2657c;

    /* renamed from: d, reason: collision with root package name */
    public final double f2658d;

    /* renamed from: e, reason: collision with root package name */
    public final double f2659e;

    /* renamed from: f, reason: collision with root package name */
    public final double f2660f;

    /* renamed from: g, reason: collision with root package name */
    public final double f2661g;

    public /* synthetic */ s(double d3, double d4, double d5, double d6, double d7) {
        this(d3, d4, d5, d6, d7, 0.0d, 0.0d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Double.compare(this.f2655a, sVar.f2655a) == 0 && Double.compare(this.f2656b, sVar.f2656b) == 0 && Double.compare(this.f2657c, sVar.f2657c) == 0 && Double.compare(this.f2658d, sVar.f2658d) == 0 && Double.compare(this.f2659e, sVar.f2659e) == 0 && Double.compare(this.f2660f, sVar.f2660f) == 0 && Double.compare(this.f2661g, sVar.f2661g) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f2661g) + ((Double.hashCode(this.f2660f) + ((Double.hashCode(this.f2659e) + ((Double.hashCode(this.f2658d) + ((Double.hashCode(this.f2657c) + ((Double.hashCode(this.f2656b) + (Double.hashCode(this.f2655a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.f2655a + ", a=" + this.f2656b + ", b=" + this.f2657c + ", c=" + this.f2658d + ", d=" + this.f2659e + ", e=" + this.f2660f + ", f=" + this.f2661g + ')';
    }

    public s(double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        this.f2655a = d3;
        this.f2656b = d4;
        this.f2657c = d5;
        this.f2658d = d6;
        this.f2659e = d7;
        this.f2660f = d8;
        this.f2661g = d9;
        if (Double.isNaN(d4) || Double.isNaN(d5) || Double.isNaN(d6) || Double.isNaN(d7) || Double.isNaN(d8) || Double.isNaN(d9) || Double.isNaN(d3)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d7 < 0.0d || d7 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d7);
        }
        if (d7 == 0.0d && (d4 == 0.0d || d3 == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d7 >= 1.0d && d6 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d4 == 0.0d || d3 == 0.0d) && d6 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d6 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d4 < 0.0d || d3 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }
}
