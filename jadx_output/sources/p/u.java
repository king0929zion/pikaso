package p;

/* loaded from: classes.dex */
public final class u implements t {

    /* renamed from: a, reason: collision with root package name */
    public final float f5914a;

    /* renamed from: b, reason: collision with root package name */
    public final z f5915b;

    public u(float f3, float f4, float f5) {
        this.f5914a = f5;
        z zVar = new z();
        zVar.f5932a = 1.0f;
        double sqrt = Math.sqrt(50.0d);
        zVar.f5933b = sqrt;
        zVar.f5938g = 1.0f;
        if (f3 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        zVar.f5938g = f3;
        zVar.f5934c = false;
        if (((float) (sqrt * sqrt)) <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        zVar.f5933b = Math.sqrt(f4);
        zVar.f5934c = false;
        this.f5915b = zVar;
    }

    @Override // p.t
    public final float b(long j3, float f3, float f4, float f5) {
        z zVar = this.f5915b;
        zVar.f5932a = f4;
        return Float.intBitsToFloat((int) (zVar.a(f3, f5, j3 / 1000000) >> 32));
    }

    @Override // p.t
    public final float c(long j3, float f3, float f4, float f5) {
        z zVar = this.f5915b;
        zVar.f5932a = f4;
        return Float.intBitsToFloat((int) (zVar.a(f3, f5, j3 / 1000000) & 4294967295L));
    }

    @Override // p.t
    public final long d(float f3, float f4, float f5) {
        double d3;
        p pVar;
        p pVar2;
        p pVar3;
        double d4;
        double d5;
        long j3;
        double d6;
        double d7;
        double d8;
        long j4;
        z zVar = this.f5915b;
        double d9 = zVar.f5933b;
        float f6 = (float) (d9 * d9);
        float f7 = zVar.f5938g;
        float f8 = this.f5914a;
        float f9 = (f3 - f4) / f8;
        float f10 = f5 / f8;
        if (f7 == 0.0f) {
            j4 = 9223372036854L;
        } else {
            double d10 = f6;
            double d11 = f7;
            double d12 = f10;
            double d13 = f9;
            double d14 = 1.0f;
            double sqrt = d11 * 2.0d * Math.sqrt(d10);
            double d15 = (sqrt * sqrt) - (d10 * 4.0d);
            double d16 = -sqrt;
            if (d15 < 0.0d) {
                d3 = d14;
                pVar = new p(0.0d, Math.sqrt(Math.abs(d15)));
            } else {
                d3 = d14;
                pVar = new p(Math.sqrt(d15), 0.0d);
            }
            pVar.f5906a = (pVar.f5906a + d16) * 0.5d;
            pVar.f5907b *= 0.5d;
            if (d15 < 0.0d) {
                pVar2 = pVar;
                pVar3 = new p(0.0d, Math.sqrt(Math.abs(d15)));
            } else {
                pVar2 = pVar;
                pVar3 = new p(Math.sqrt(d15), 0.0d);
            }
            double d17 = -1;
            double d18 = pVar3.f5906a * d17;
            double d19 = pVar3.f5907b * d17;
            pVar3.f5906a = (d18 + d16) * 0.5d;
            pVar3.f5907b = d19 * 0.5d;
            if (d13 == 0.0d && d12 == 0.0d) {
                j3 = 0;
            } else {
                if (d13 < 0.0d) {
                    d12 = -d12;
                }
                double abs = Math.abs(d13);
                if (d11 > 1.0d) {
                    double d20 = pVar2.f5906a;
                    double d21 = pVar3.f5906a;
                    double d22 = (d20 * abs) - d12;
                    double d23 = d20 - d21;
                    double d24 = d22 / d23;
                    double d25 = abs - d24;
                    double log = Math.log(Math.abs(d3 / d25)) / d20;
                    double log2 = Math.log(Math.abs(d3 / d24)) / d21;
                    if (Double.isInfinite(log) || Double.isNaN(log)) {
                        log = log2;
                    } else if (!Double.isInfinite(log2) && !Double.isNaN(log2)) {
                        log = Math.max(log, log2);
                    }
                    double d26 = d25 * d20;
                    double d27 = log;
                    double log3 = Math.log(d26 / ((-d24) * d21)) / (d21 - d20);
                    if (Double.isNaN(log3) || log3 <= 0.0d) {
                        double d28 = d3;
                        d6 = d25;
                        d7 = -d28;
                        d5 = d27;
                    } else {
                        if (log3 > 0.0d) {
                            if ((-((Math.exp(log3 * d21) * d24) + (Math.exp(d20 * log3) * d25))) < d3) {
                                if (d24 <= 0.0d || d25 >= 0.0d) {
                                    d5 = d27;
                                    d8 = d3;
                                } else {
                                    d8 = d3;
                                    d5 = 0.0d;
                                }
                                d7 = -d8;
                                d6 = d25;
                            }
                        }
                        d7 = d3;
                        d6 = d25;
                        d5 = Math.log((-((d24 * d21) * d21)) / (d26 * d20)) / d23;
                    }
                    double d29 = d24 * d21;
                    if (Math.abs((Math.exp(d21 * d5) * d29) + (Math.exp(d20 * d5) * d26)) >= 1.0E-4d) {
                        int i3 = 0;
                        double d30 = Double.MAX_VALUE;
                        for (double d31 = 0.001d; d30 > d31 && i3 < 100; d31 = 0.001d) {
                            i3++;
                            double d32 = d20 * d5;
                            double d33 = d21 * d5;
                            double exp = d5 - ((((Math.exp(d33) * d24) + (Math.exp(d32) * d6)) + d7) / ((Math.exp(d33) * d29) + (Math.exp(d32) * d26)));
                            d30 = Math.abs(d5 - exp);
                            d5 = exp;
                        }
                    }
                } else {
                    p pVar4 = pVar2;
                    double d34 = d3;
                    if (d11 < 1.0d) {
                        double d35 = pVar4.f5906a;
                        double d36 = (d12 - (d35 * abs)) / pVar4.f5907b;
                        d5 = Math.log(d34 / Math.sqrt((d36 * d36) + (abs * abs))) / d35;
                    } else {
                        double d37 = pVar4.f5906a;
                        double d38 = d37 * abs;
                        double d39 = d12 - d38;
                        double log4 = Math.log(Math.abs(d34 / abs)) / d37;
                        double log5 = Math.log(Math.abs(d34 / d39));
                        double d40 = log5;
                        for (int i4 = 0; i4 < 6; i4++) {
                            d40 = log5 - Math.log(Math.abs(d40 / d37));
                        }
                        double d41 = d40 / d37;
                        if (Double.isInfinite(log4) || Double.isNaN(log4)) {
                            log4 = d41;
                        } else if (!Double.isInfinite(d41) && !Double.isNaN(d41)) {
                            log4 = Math.max(log4, d41);
                        }
                        double d42 = (-(d38 + d39)) / (d37 * d39);
                        double d43 = d37 * d42;
                        double d44 = log4;
                        double exp2 = (Math.exp(d43) * d39 * d42) + (Math.exp(d43) * abs);
                        if (Double.isNaN(d42) || d42 <= 0.0d) {
                            d34 = -d34;
                            d4 = d44;
                        } else if (d42 <= 0.0d || (-exp2) >= d34) {
                            d4 = (-(2.0d / d37)) - (abs / d39);
                        } else {
                            d34 = -d34;
                            d4 = (d39 >= 0.0d || abs <= 0.0d) ? d44 : 0.0d;
                        }
                        d5 = d4;
                        int i5 = 0;
                        double d45 = Double.MAX_VALUE;
                        while (d45 > 0.001d && i5 < 100) {
                            i5++;
                            double d46 = d37 * d5;
                            double exp3 = d5 - (((Math.exp(d46) * ((d39 * d5) + abs)) + d34) / (Math.exp(d46) * (((d46 + 1) * d39) + d38)));
                            d45 = Math.abs(d5 - exp3);
                            d5 = exp3;
                        }
                    }
                }
                j3 = (long) (1000.0d * d5);
            }
            j4 = j3;
        }
        return j4 * 1000000;
    }

    @Override // p.t
    public final float e(float f3, float f4, float f5) {
        return 0.0f;
    }
}
