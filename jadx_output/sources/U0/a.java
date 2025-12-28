package U0;

import android.graphics.Color;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f2371a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2372b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2373c;

    /* renamed from: d, reason: collision with root package name */
    public final float f2374d;

    /* renamed from: e, reason: collision with root package name */
    public final float f2375e;

    /* renamed from: f, reason: collision with root package name */
    public final float f2376f;

    public a(float f3, float f4, float f5, float f6, float f7, float f8) {
        this.f2371a = f3;
        this.f2372b = f4;
        this.f2373c = f5;
        this.f2374d = f6;
        this.f2375e = f7;
        this.f2376f = f8;
    }

    public static a a(int i3) {
        p pVar = p.f2406k;
        float e3 = b.e(Color.red(i3));
        float e4 = b.e(Color.green(i3));
        float e5 = b.e(Color.blue(i3));
        float[][] fArr = b.f2380d;
        float[] fArr2 = fArr[0];
        float f3 = (fArr2[2] * e5) + (fArr2[1] * e4) + (fArr2[0] * e3);
        float[] fArr3 = fArr[1];
        float f4 = (fArr3[2] * e5) + (fArr3[1] * e4) + (fArr3[0] * e3);
        float[] fArr4 = fArr[2];
        float f5 = (e5 * fArr4[2]) + (e4 * fArr4[1]) + (e3 * fArr4[0]);
        float[][] fArr5 = b.f2377a;
        float[] fArr6 = fArr5[0];
        float f6 = (fArr6[2] * f5) + (fArr6[1] * f4) + (fArr6[0] * f3);
        float[] fArr7 = fArr5[1];
        float f7 = (fArr7[2] * f5) + (fArr7[1] * f4) + (fArr7[0] * f3);
        float[] fArr8 = fArr5[2];
        float f8 = (f5 * fArr8[2]) + (f4 * fArr8[1]) + (f3 * fArr8[0]);
        float[] fArr9 = pVar.f2413g;
        float f9 = fArr9[0] * f6;
        float f10 = fArr9[1] * f7;
        float f11 = fArr9[2] * f8;
        float abs = Math.abs(f9);
        float f12 = pVar.h;
        float pow = (float) Math.pow((abs * f12) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((Math.abs(f10) * f12) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f11) * f12) / 100.0d, 0.42d);
        float signum = ((Math.signum(f9) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f10) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f11) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d3 = signum3;
        float f13 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d3)) / 11.0f;
        float f14 = ((float) ((signum + signum2) - (d3 * 2.0d))) / 9.0f;
        float f15 = signum2 * 20.0f;
        float f16 = ((21.0f * signum3) + ((signum * 20.0f) + f15)) / 20.0f;
        float f17 = (((signum * 40.0f) + f15) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f14, f13)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f18 = atan2;
        float f19 = (3.1415927f * f18) / 180.0f;
        float f20 = f17 * pVar.f2408b;
        float f21 = pVar.f2407a;
        float f22 = pVar.f2410d;
        float pow4 = ((float) Math.pow(f20 / f21, pVar.f2415j * f22)) * 100.0f;
        Math.sqrt(pow4 / 100.0f);
        float f23 = f21 + 4.0f;
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, pVar.f2412f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) f18) < 20.14d ? 360.0f + f18 : f18) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * pVar.f2411e) * pVar.f2409c) * ((float) Math.sqrt((f14 * f14) + (f13 * f13)))) / (f16 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow4 / 100.0d));
        float f24 = pVar.f2414i * pow5;
        Math.sqrt((r3 * f22) / f23);
        float f25 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((f24 * 0.0228f) + 1.0f)) * 43.85965f;
        double d4 = f19;
        return new a(f18, pow5, pow4, f25, log * ((float) Math.cos(d4)), log * ((float) Math.sin(d4)));
    }

    public static a b(float f3, float f4, float f5) {
        p pVar = p.f2406k;
        float f6 = pVar.f2410d;
        Math.sqrt(f3 / 100.0d);
        float f7 = pVar.f2407a + 4.0f;
        float f8 = pVar.f2414i * f4;
        Math.sqrt(((f4 / ((float) Math.sqrt(r1))) * pVar.f2410d) / f7);
        float f9 = (1.7f * f3) / ((0.007f * f3) + 1.0f);
        float log = ((float) Math.log((f8 * 0.0228d) + 1.0d)) * 43.85965f;
        double d3 = (3.1415927f * f5) / 180.0f;
        return new a(f5, f4, f3, f9, log * ((float) Math.cos(d3)), log * ((float) Math.sin(d3)));
    }

    public final int c(p pVar) {
        float f3;
        float f4 = this.f2372b;
        double d3 = f4;
        float f5 = this.f2373c;
        if (d3 != 0.0d) {
            double d4 = f5;
            if (d4 != 0.0d) {
                f3 = f4 / ((float) Math.sqrt(d4 / 100.0d));
                float pow = (float) Math.pow(f3 / Math.pow(1.64d - Math.pow(0.29d, pVar.f2412f), 0.73d), 1.1111111111111112d);
                double d5 = (this.f2371a * 3.1415927f) / 180.0f;
                float cos = ((float) (Math.cos(2.0d + d5) + 3.8d)) * 0.25f;
                float pow2 = pVar.f2407a * ((float) Math.pow(f5 / 100.0d, (1.0d / pVar.f2410d) / pVar.f2415j));
                float f6 = cos * 3846.1538f * pVar.f2411e * pVar.f2409c;
                float f7 = pow2 / pVar.f2408b;
                float sin = (float) Math.sin(d5);
                float cos2 = (float) Math.cos(d5);
                float f8 = (((0.305f + f7) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (((11.0f * pow) * cos2) + (f6 * 23.0f)));
                float f9 = cos2 * f8;
                float f10 = f8 * sin;
                float f11 = f7 * 460.0f;
                float f12 = ((288.0f * f10) + ((451.0f * f9) + f11)) / 1403.0f;
                float f13 = ((f11 - (891.0f * f9)) - (261.0f * f10)) / 1403.0f;
                float f14 = ((f11 - (f9 * 220.0f)) - (f10 * 6300.0f)) / 1403.0f;
                float max = (float) Math.max(0.0d, (Math.abs(f12) * 27.13d) / (400.0d - Math.abs(f12)));
                float signum = Math.signum(f12);
                float f15 = 100.0f / pVar.h;
                float pow3 = signum * f15 * ((float) Math.pow(max, 2.380952380952381d));
                float signum2 = Math.signum(f13) * f15 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f13) * 27.13d) / (400.0d - Math.abs(f13))), 2.380952380952381d));
                float signum3 = Math.signum(f14) * f15 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f14) * 27.13d) / (400.0d - Math.abs(f14))), 2.380952380952381d));
                float[] fArr = pVar.f2413g;
                float f16 = pow3 / fArr[0];
                float f17 = signum2 / fArr[1];
                float f18 = signum3 / fArr[2];
                float[][] fArr2 = b.f2378b;
                float[] fArr3 = fArr2[0];
                float f19 = (fArr3[2] * f18) + (fArr3[1] * f17) + (fArr3[0] * f16);
                float[] fArr4 = fArr2[1];
                float f20 = (fArr4[2] * f18) + (fArr4[1] * f17) + (fArr4[0] * f16);
                float[] fArr5 = fArr2[2];
                return V0.a.a(f19, f20, (f18 * fArr5[2]) + (f17 * fArr5[1]) + (f16 * fArr5[0]));
            }
        }
        f3 = 0.0f;
        float pow4 = (float) Math.pow(f3 / Math.pow(1.64d - Math.pow(0.29d, pVar.f2412f), 0.73d), 1.1111111111111112d);
        double d52 = (this.f2371a * 3.1415927f) / 180.0f;
        float cos3 = ((float) (Math.cos(2.0d + d52) + 3.8d)) * 0.25f;
        float pow22 = pVar.f2407a * ((float) Math.pow(f5 / 100.0d, (1.0d / pVar.f2410d) / pVar.f2415j));
        float f62 = cos3 * 3846.1538f * pVar.f2411e * pVar.f2409c;
        float f72 = pow22 / pVar.f2408b;
        float sin2 = (float) Math.sin(d52);
        float cos22 = (float) Math.cos(d52);
        float f82 = (((0.305f + f72) * 23.0f) * pow4) / (((pow4 * 108.0f) * sin2) + (((11.0f * pow4) * cos22) + (f62 * 23.0f)));
        float f92 = cos22 * f82;
        float f102 = f82 * sin2;
        float f112 = f72 * 460.0f;
        float f122 = ((288.0f * f102) + ((451.0f * f92) + f112)) / 1403.0f;
        float f132 = ((f112 - (891.0f * f92)) - (261.0f * f102)) / 1403.0f;
        float f142 = ((f112 - (f92 * 220.0f)) - (f102 * 6300.0f)) / 1403.0f;
        float max2 = (float) Math.max(0.0d, (Math.abs(f122) * 27.13d) / (400.0d - Math.abs(f122)));
        float signum4 = Math.signum(f122);
        float f152 = 100.0f / pVar.h;
        float pow32 = signum4 * f152 * ((float) Math.pow(max2, 2.380952380952381d));
        float signum22 = Math.signum(f132) * f152 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f132) * 27.13d) / (400.0d - Math.abs(f132))), 2.380952380952381d));
        float signum32 = Math.signum(f142) * f152 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f142) * 27.13d) / (400.0d - Math.abs(f142))), 2.380952380952381d));
        float[] fArr6 = pVar.f2413g;
        float f162 = pow32 / fArr6[0];
        float f172 = signum22 / fArr6[1];
        float f182 = signum32 / fArr6[2];
        float[][] fArr22 = b.f2378b;
        float[] fArr32 = fArr22[0];
        float f192 = (fArr32[2] * f182) + (fArr32[1] * f172) + (fArr32[0] * f162);
        float[] fArr42 = fArr22[1];
        float f202 = (fArr42[2] * f182) + (fArr42[1] * f172) + (fArr42[0] * f162);
        float[] fArr52 = fArr22[2];
        return V0.a.a(f192, f202, (f182 * fArr52[2]) + (f172 * fArr52[1]) + (f162 * fArr52[0]));
    }
}
