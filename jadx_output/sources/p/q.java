package p;

/* loaded from: classes.dex */
public final class q implements r {

    /* renamed from: a, reason: collision with root package name */
    public final float f5908a;

    /* renamed from: b, reason: collision with root package name */
    public final float f5909b;

    /* renamed from: c, reason: collision with root package name */
    public final float f5910c;

    /* renamed from: d, reason: collision with root package name */
    public final float f5911d;

    public q(float f3, float f4) {
        int G3;
        this.f5908a = f3;
        this.f5909b = f4;
        if (Float.isNaN(f3) || Float.isNaN(0.0f) || Float.isNaN(f4) || Float.isNaN(1.0f)) {
            throw new IllegalArgumentException("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f3 + ", 0.0, " + f4 + ", 1.0.");
        }
        float[] fArr = new float[5];
        double d3 = 0.0f;
        double d4 = 3.0f;
        double d5 = 0.0f;
        double d6 = d4 * 2.0d;
        double d7 = (d3 - d6) + d5;
        if (d7 == 0.0d) {
            G3 = d4 == d5 ? 0 : W.D.G((float) ((d6 - d5) / (d6 - (d5 * 2.0d))), fArr, 0);
        } else {
            double d8 = -Math.sqrt((d4 * d4) - (d5 * d3));
            double d9 = (-d3) + d4;
            int G4 = W.D.G((float) ((-(d8 + d9)) / d7), fArr, 0);
            G3 = W.D.G((float) ((d8 - d9) / d7), fArr, G4) + G4;
            if (G3 > 1) {
                float f5 = fArr[0];
                float f6 = fArr[1];
                if (f5 > f6) {
                    fArr[0] = f6;
                    fArr[1] = f5;
                } else if (f5 == f6) {
                    G3--;
                }
            }
        }
        int G5 = W.D.G(0.5f, fArr, G3) + G3;
        float min = Math.min(0.0f, 1.0f);
        float max = Math.max(0.0f, 1.0f);
        for (int i3 = 0; i3 < G5; i3++) {
            float f7 = fArr[i3];
            float f8 = ((((((-2.0f) * f7) + 3.0f) * f7) + 0.0f) * f7) + 0.0f;
            min = Math.min(min, f8);
            max = Math.max(max, f8);
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(min) << 32) | (Float.floatToRawIntBits(max) & 4294967295L);
        this.f5910c = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
        this.f5911d = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x01e8, code lost:
    
        if (r2 >= (-8.34465E-7f)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01f4, code lost:
    
        if (r2 <= 1.0000008f) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0214, code lost:
    
        if (r2 >= (-8.34465E-7f)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0220, code lost:
    
        if (r2 <= 1.0000008f) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006f, code lost:
    
        if (r2 >= (-8.34465E-7f)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0071, code lost:
    
        r23 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007d, code lost:
    
        if (r2 <= 1.0000008f) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007f, code lost:
    
        r23 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c8, code lost:
    
        if (r2 >= (-8.34465E-7f)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d3, code lost:
    
        if (r2 <= 1.0000008f) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01a0, code lost:
    
        if (r2 >= (-8.34465E-7f)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01ac, code lost:
    
        if (r2 <= 1.0000008f) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0189  */
    @Override // p.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(float r25) {
        /*
            Method dump skipped, instructions count: 623
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p.q.a(float):float");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.f5908a == qVar.f5908a && this.f5909b == qVar.f5909b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f) + AbstractC0537f.a(this.f5909b, AbstractC0537f.a(0.0f, Float.hashCode(this.f5908a) * 31, 31), 31);
    }

    public final String toString() {
        return "CubicBezierEasing(a=" + this.f5908a + ", b=0.0, c=" + this.f5909b + ", d=1.0)";
    }
}
