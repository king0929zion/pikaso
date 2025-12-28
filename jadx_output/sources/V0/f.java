package V0;

import android.graphics.Path;
import android.util.Log;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final char f2465a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f2466b;

    public f(char c3, float[] fArr) {
        this.f2465a = c3;
        this.f2466b = fArr;
    }

    public static void a(Path path, float f3, float f4, float f5, float f6, float f7, float f8, float f9, boolean z3, boolean z4) {
        double d3;
        double d4;
        double radians = Math.toRadians(f9);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d5 = f3;
        double d6 = f4;
        double d7 = (d6 * sin) + (d5 * cos);
        double d8 = d5;
        double d9 = f7;
        double d10 = d7 / d9;
        double d11 = f8;
        double d12 = ((d6 * cos) + ((-f3) * sin)) / d11;
        double d13 = d6;
        double d14 = f6;
        double d15 = ((d14 * sin) + (f5 * cos)) / d9;
        double d16 = ((d14 * cos) + ((-f5) * sin)) / d11;
        double d17 = d10 - d15;
        double d18 = d12 - d16;
        double d19 = (d10 + d15) / 2.0d;
        double d20 = (d12 + d16) / 2.0d;
        double d21 = (d18 * d18) + (d17 * d17);
        if (d21 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d22 = (1.0d / d21) - 0.25d;
        if (d22 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d21);
            float sqrt = (float) (Math.sqrt(d21) / 1.99999d);
            a(path, f3, f4, f5, f6, f7 * sqrt, f8 * sqrt, f9, z3, z4);
            return;
        }
        double sqrt2 = Math.sqrt(d22);
        double d23 = d17 * sqrt2;
        double d24 = sqrt2 * d18;
        if (z3 == z4) {
            d3 = d19 - d24;
            d4 = d20 + d23;
        } else {
            d3 = d19 + d24;
            d4 = d20 - d23;
        }
        double atan2 = Math.atan2(d12 - d4, d10 - d3);
        double atan22 = Math.atan2(d16 - d4, d15 - d3) - atan2;
        if (z4 != (atan22 >= 0.0d)) {
            atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d25 = d3 * d9;
        double d26 = d4 * d11;
        double d27 = (d25 * cos) - (d26 * sin);
        double d28 = (d26 * cos) + (d25 * sin);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(radians);
        double sin2 = Math.sin(radians);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d29 = -d9;
        double d30 = d29 * cos2;
        double d31 = d11 * sin2;
        double d32 = (d30 * sin3) - (d31 * cos3);
        double d33 = d29 * sin2;
        double d34 = d11 * cos2;
        double d35 = (cos3 * d34) + (sin3 * d33);
        double d36 = d34;
        double d37 = atan22 / ceil;
        int i3 = 0;
        while (i3 < ceil) {
            double d38 = atan2 + d37;
            double sin4 = Math.sin(d38);
            double cos4 = Math.cos(d38);
            double d39 = d37;
            double d40 = (((d9 * cos2) * cos4) + d27) - (d31 * sin4);
            double d41 = d36;
            double d42 = d27;
            double d43 = (d41 * sin4) + (d9 * sin2 * cos4) + d28;
            double d44 = (d30 * sin4) - (d31 * cos4);
            double d45 = (cos4 * d41) + (sin4 * d33);
            double d46 = d38 - atan2;
            double tan = Math.tan(d46 / 2.0d);
            double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d46)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d32 * sqrt3) + d8), (float) ((d35 * sqrt3) + d13), (float) (d40 - (sqrt3 * d44)), (float) (d43 - (sqrt3 * d45)), (float) d40, (float) d43);
            i3++;
            atan2 = d38;
            d33 = d33;
            cos2 = cos2;
            ceil = ceil;
            d35 = d45;
            d9 = d9;
            d32 = d44;
            d8 = d40;
            d13 = d43;
            d27 = d42;
            d37 = d39;
            d36 = d41;
        }
    }

    public static void b(f[] fVarArr, Path path) {
        int i3;
        int i4;
        char c3;
        int i5;
        int i6;
        f fVar;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        f[] fVarArr2 = fVarArr;
        int i7 = 6;
        float[] fArr = new float[6];
        int length = fVarArr2.length;
        int i8 = 0;
        char c4 = 'm';
        while (i8 < length) {
            f fVar2 = fVarArr2[i8];
            char c5 = fVar2.f2465a;
            float f15 = fArr[0];
            float f16 = fArr[1];
            float f17 = fArr[2];
            float f18 = fArr[3];
            float f19 = fArr[4];
            float f20 = fArr[5];
            switch (c5) {
                case 'A':
                case 'a':
                    i3 = 7;
                    break;
                case 'C':
                case 'c':
                    i3 = i7;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i3 = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i3 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f19, f20);
                    f15 = f19;
                    f17 = f15;
                    f16 = f20;
                    f18 = f16;
                default:
                    i3 = 2;
                    break;
            }
            float f21 = f19;
            float f22 = f20;
            float f23 = f15;
            float f24 = f16;
            int i9 = 0;
            while (true) {
                float[] fArr2 = fVar2.f2466b;
                if (i9 < fArr2.length) {
                    if (c5 != 'A') {
                        if (c5 != 'C') {
                            if (c5 == 'H') {
                                i4 = i9;
                                c3 = c5;
                                i5 = i8;
                                i6 = length;
                                fVar = fVar2;
                                path.lineTo(fArr2[i4], f24);
                                f23 = fArr2[i4];
                            } else if (c5 == 'Q') {
                                i4 = i9;
                                c3 = c5;
                                i5 = i8;
                                i6 = length;
                                fVar = fVar2;
                                float f25 = fArr2[i4];
                                int i10 = i4 + 1;
                                float f26 = fArr2[i10];
                                int i11 = i4 + 2;
                                int i12 = i4 + 3;
                                path.quadTo(f25, f26, fArr2[i11], fArr2[i12]);
                                f3 = fArr2[i4];
                                f4 = fArr2[i10];
                                f23 = fArr2[i11];
                                f24 = fArr2[i12];
                            } else if (c5 == 'V') {
                                i4 = i9;
                                c3 = c5;
                                i5 = i8;
                                i6 = length;
                                fVar = fVar2;
                                path.lineTo(f23, fArr2[i4]);
                                f24 = fArr2[i4];
                            } else if (c5 != 'a') {
                                if (c5 != 'c') {
                                    if (c5 != 'h') {
                                        if (c5 == 'q') {
                                            i4 = i9;
                                            float f27 = f24;
                                            float f28 = f23;
                                            int i13 = i4 + 1;
                                            int i14 = i4 + 2;
                                            int i15 = i4 + 3;
                                            path.rQuadTo(fArr2[i4], fArr2[i13], fArr2[i14], fArr2[i15]);
                                            float f29 = f28 + fArr2[i4];
                                            float f30 = fArr2[i13] + f27;
                                            float f31 = f28 + fArr2[i14];
                                            f24 = f27 + fArr2[i15];
                                            f18 = f30;
                                            f17 = f29;
                                            c3 = c5;
                                            i5 = i8;
                                            i6 = length;
                                            f23 = f31;
                                        } else if (c5 == 'v') {
                                            i4 = i9;
                                            path.rLineTo(0.0f, fArr2[i4]);
                                            f24 += fArr2[i4];
                                        } else if (c5 == 'L') {
                                            i4 = i9;
                                            int i16 = i4 + 1;
                                            path.lineTo(fArr2[i4], fArr2[i16]);
                                            f23 = fArr2[i4];
                                            f24 = fArr2[i16];
                                        } else if (c5 == 'M') {
                                            i4 = i9;
                                            f23 = fArr2[i4];
                                            f24 = fArr2[i4 + 1];
                                            if (i4 > 0) {
                                                path.lineTo(f23, f24);
                                            } else {
                                                path.moveTo(f23, f24);
                                                f22 = f24;
                                                f21 = f23;
                                            }
                                        } else if (c5 == 'S') {
                                            i4 = i9;
                                            float f32 = f24;
                                            float f33 = f23;
                                            if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                                                f9 = (f32 * 2.0f) - f18;
                                                f10 = (f33 * 2.0f) - f17;
                                            } else {
                                                f10 = f33;
                                                f9 = f32;
                                            }
                                            int i17 = i4 + 1;
                                            int i18 = i4 + 2;
                                            int i19 = i4 + 3;
                                            path.cubicTo(f10, f9, fArr2[i4], fArr2[i17], fArr2[i18], fArr2[i19]);
                                            float f34 = fArr2[i4];
                                            float f35 = fArr2[i17];
                                            f23 = fArr2[i18];
                                            f24 = fArr2[i19];
                                            f18 = f35;
                                            f17 = f34;
                                        } else if (c5 == 'T') {
                                            i4 = i9;
                                            float f36 = f24;
                                            float f37 = f23;
                                            if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                                                f5 = (f37 * 2.0f) - f17;
                                                f6 = (f36 * 2.0f) - f18;
                                            } else {
                                                f5 = f37;
                                                f6 = f36;
                                            }
                                            int i20 = i4 + 1;
                                            path.quadTo(f5, f6, fArr2[i4], fArr2[i20]);
                                            f7 = fArr2[i4];
                                            f8 = fArr2[i20];
                                        } else if (c5 == 'l') {
                                            i4 = i9;
                                            int i21 = i4 + 1;
                                            path.rLineTo(fArr2[i4], fArr2[i21]);
                                            f23 += fArr2[i4];
                                            f24 += fArr2[i21];
                                        } else if (c5 == 'm') {
                                            i4 = i9;
                                            float f38 = fArr2[i4];
                                            f23 += f38;
                                            float f39 = fArr2[i4 + 1];
                                            f24 += f39;
                                            if (i4 > 0) {
                                                path.rLineTo(f38, f39);
                                            } else {
                                                path.rMoveTo(f38, f39);
                                                f22 = f24;
                                                f21 = f23;
                                            }
                                        } else if (c5 == 's') {
                                            if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                                                float f40 = f23 - f17;
                                                f11 = f24 - f18;
                                                f12 = f40;
                                            } else {
                                                f11 = 0.0f;
                                                f12 = 0.0f;
                                            }
                                            int i22 = i9 + 1;
                                            int i23 = i9 + 2;
                                            int i24 = i9 + 3;
                                            i4 = i9;
                                            float f41 = f24;
                                            float f42 = f23;
                                            path.rCubicTo(f12, f11, fArr2[i9], fArr2[i22], fArr2[i23], fArr2[i24]);
                                            f5 = f42 + fArr2[i4];
                                            f6 = f41 + fArr2[i22];
                                            f7 = f42 + fArr2[i23];
                                            f8 = fArr2[i24] + f41;
                                        } else if (c5 != 't') {
                                            i4 = i9;
                                        } else {
                                            if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                                                f13 = f23 - f17;
                                                f14 = f24 - f18;
                                            } else {
                                                f14 = 0.0f;
                                                f13 = 0.0f;
                                            }
                                            int i25 = i9 + 1;
                                            path.rQuadTo(f13, f14, fArr2[i9], fArr2[i25]);
                                            float f43 = f13 + f23;
                                            float f44 = f14 + f24;
                                            f23 += fArr2[i9];
                                            f24 += fArr2[i25];
                                            f18 = f44;
                                            i4 = i9;
                                            c3 = c5;
                                            i5 = i8;
                                            i6 = length;
                                            f17 = f43;
                                        }
                                        fVar = fVar2;
                                    } else {
                                        i4 = i9;
                                        path.rLineTo(fArr2[i4], 0.0f);
                                        f23 += fArr2[i4];
                                    }
                                    c3 = c5;
                                    i5 = i8;
                                    i6 = length;
                                    fVar = fVar2;
                                } else {
                                    i4 = i9;
                                    float f45 = f24;
                                    float f46 = f23;
                                    int i26 = i4 + 2;
                                    int i27 = i4 + 3;
                                    int i28 = i4 + 4;
                                    int i29 = i4 + 5;
                                    path.rCubicTo(fArr2[i4], fArr2[i4 + 1], fArr2[i26], fArr2[i27], fArr2[i28], fArr2[i29]);
                                    f5 = f46 + fArr2[i26];
                                    f6 = f45 + fArr2[i27];
                                    f7 = f46 + fArr2[i28];
                                    f8 = fArr2[i29] + f45;
                                }
                                f18 = f6;
                                f17 = f5;
                                c3 = c5;
                                i5 = i8;
                                i6 = length;
                                f23 = f7;
                                f24 = f8;
                                fVar = fVar2;
                            } else {
                                i4 = i9;
                                float f47 = f24;
                                float f48 = f23;
                                int i30 = i4 + 5;
                                int i31 = i4 + 6;
                                c3 = c5;
                                i6 = length;
                                fVar = fVar2;
                                i5 = i8;
                                a(path, f48, f47, fArr2[i30] + f48, fArr2[i31] + f47, fArr2[i4], fArr2[i4 + 1], fArr2[i4 + 2], fArr2[i4 + 3] != 0.0f, fArr2[i4 + 4] != 0.0f);
                                f23 = f48 + fArr2[i30];
                                f24 = f47 + fArr2[i31];
                            }
                            i9 = i4 + i3;
                            fVar2 = fVar;
                            length = i6;
                            c4 = c3;
                            c5 = c4;
                            i8 = i5;
                        } else {
                            i4 = i9;
                            c3 = c5;
                            i5 = i8;
                            i6 = length;
                            fVar = fVar2;
                            int i32 = i4 + 2;
                            int i33 = i4 + 3;
                            int i34 = i4 + 4;
                            int i35 = i4 + 5;
                            path.cubicTo(fArr2[i4], fArr2[i4 + 1], fArr2[i32], fArr2[i33], fArr2[i34], fArr2[i35]);
                            f23 = fArr2[i34];
                            f24 = fArr2[i35];
                            f3 = fArr2[i32];
                            f4 = fArr2[i33];
                        }
                        f17 = f3;
                        f18 = f4;
                        i9 = i4 + i3;
                        fVar2 = fVar;
                        length = i6;
                        c4 = c3;
                        c5 = c4;
                        i8 = i5;
                    } else {
                        i4 = i9;
                        c3 = c5;
                        i5 = i8;
                        i6 = length;
                        fVar = fVar2;
                        int i36 = i4 + 5;
                        int i37 = i4 + 6;
                        a(path, f23, f24, fArr2[i36], fArr2[i37], fArr2[i4], fArr2[i4 + 1], fArr2[i4 + 2], fArr2[i4 + 3] != 0.0f, fArr2[i4 + 4] != 0.0f);
                        f23 = fArr2[i36];
                        f24 = fArr2[i37];
                    }
                    f18 = f24;
                    f17 = f23;
                    i9 = i4 + i3;
                    fVar2 = fVar;
                    length = i6;
                    c4 = c3;
                    c5 = c4;
                    i8 = i5;
                }
            }
            fArr[0] = f23;
            fArr[1] = f24;
            fArr[2] = f17;
            fArr[3] = f18;
            fArr[4] = f21;
            fArr[5] = f22;
            c4 = fVar2.f2465a;
            i8++;
            fVarArr2 = fVarArr;
            length = length;
            i7 = 6;
        }
    }
}
