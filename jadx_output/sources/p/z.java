package p;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public float f5932a;

    /* renamed from: b, reason: collision with root package name */
    public double f5933b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5934c;

    /* renamed from: d, reason: collision with root package name */
    public double f5935d;

    /* renamed from: e, reason: collision with root package name */
    public double f5936e;

    /* renamed from: f, reason: collision with root package name */
    public double f5937f;

    /* renamed from: g, reason: collision with root package name */
    public float f5938g;

    public final long a(float f3, float f4, long j3) {
        double cos;
        double d3;
        if (!this.f5934c) {
            if (this.f5932a == Float.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            float f5 = this.f5938g;
            double d4 = f5;
            double d5 = d4 * d4;
            if (f5 > 1.0f) {
                double d6 = this.f5933b;
                double d7 = d5 - 1;
                this.f5935d = (Math.sqrt(d7) * d6) + ((-f5) * d6);
                double d8 = -this.f5938g;
                double d9 = this.f5933b;
                this.f5936e = (d8 * d9) - (Math.sqrt(d7) * d9);
            } else if (f5 >= 0.0f && f5 < 1.0f) {
                this.f5937f = Math.sqrt(1 - d5) * this.f5933b;
            }
            this.f5934c = true;
        }
        float f6 = f3 - this.f5932a;
        double d10 = j3 / 1000.0d;
        float f7 = this.f5938g;
        if (f7 > 1.0f) {
            double d11 = f6;
            double d12 = this.f5936e;
            double d13 = ((d12 * d11) - f4) / (d12 - this.f5935d);
            double d14 = d11 - d13;
            d3 = (Math.exp(this.f5935d * d10) * d13) + (Math.exp(d12 * d10) * d14);
            double d15 = this.f5936e;
            double exp = Math.exp(d15 * d10) * d14 * d15;
            double d16 = this.f5935d;
            cos = (Math.exp(d16 * d10) * d13 * d16) + exp;
        } else if (f7 == 1.0f) {
            double d17 = this.f5933b;
            double d18 = f6;
            double d19 = (d17 * d18) + f4;
            double d20 = (d19 * d10) + d18;
            d3 = Math.exp((-d17) * d10) * d20;
            double exp2 = Math.exp((-this.f5933b) * d10) * d20;
            double d21 = -this.f5933b;
            cos = (exp2 * d21) + (Math.exp(d21 * d10) * d19);
        } else {
            double d22 = 1 / this.f5937f;
            double d23 = this.f5933b;
            double d24 = f6;
            double d25 = ((f7 * d23 * d24) + f4) * d22;
            double exp3 = Math.exp((-f7) * d23 * d10) * ((Math.sin(this.f5937f * d10) * d25) + (Math.cos(this.f5937f * d10) * d24));
            double d26 = this.f5933b;
            double d27 = (-d26) * exp3 * this.f5938g;
            double exp4 = Math.exp((-r7) * d26 * d10);
            double d28 = this.f5937f;
            double sin = Math.sin(d28 * d10) * (-d28) * d24;
            double d29 = this.f5937f;
            cos = (((Math.cos(d29 * d10) * d25 * d29) + sin) * exp4) + d27;
            d3 = exp3;
        }
        return (Float.floatToRawIntBits((float) (d3 + this.f5932a)) << 32) | (Float.floatToRawIntBits((float) cos) & 4294967295L);
    }
}
