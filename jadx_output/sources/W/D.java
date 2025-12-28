package W;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class D {

    /* renamed from: a, reason: collision with root package name */
    public static final X1.e f2484a = new X1.e(9);

    /* renamed from: b, reason: collision with root package name */
    public static Method f2485b;

    /* renamed from: c, reason: collision with root package name */
    public static Method f2486c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f2487d;

    public static final BlendMode A(int i3) {
        BlendMode blendMode;
        BlendMode blendMode2;
        BlendMode blendMode3;
        BlendMode blendMode4;
        BlendMode blendMode5;
        BlendMode blendMode6;
        BlendMode blendMode7;
        BlendMode blendMode8;
        BlendMode blendMode9;
        BlendMode blendMode10;
        BlendMode blendMode11;
        BlendMode blendMode12;
        BlendMode blendMode13;
        BlendMode blendMode14;
        BlendMode blendMode15;
        BlendMode blendMode16;
        BlendMode blendMode17;
        BlendMode blendMode18;
        BlendMode blendMode19;
        BlendMode blendMode20;
        BlendMode blendMode21;
        BlendMode blendMode22;
        BlendMode blendMode23;
        BlendMode blendMode24;
        BlendMode blendMode25;
        BlendMode blendMode26;
        BlendMode blendMode27;
        BlendMode blendMode28;
        BlendMode blendMode29;
        BlendMode blendMode30;
        if (l(i3, 0)) {
            blendMode30 = BlendMode.CLEAR;
            return blendMode30;
        }
        if (l(i3, 1)) {
            blendMode29 = BlendMode.SRC;
            return blendMode29;
        }
        if (l(i3, 2)) {
            blendMode28 = BlendMode.DST;
            return blendMode28;
        }
        if (l(i3, 3)) {
            blendMode27 = BlendMode.SRC_OVER;
            return blendMode27;
        }
        if (l(i3, 4)) {
            blendMode26 = BlendMode.DST_OVER;
            return blendMode26;
        }
        if (l(i3, 5)) {
            blendMode25 = BlendMode.SRC_IN;
            return blendMode25;
        }
        if (l(i3, 6)) {
            blendMode24 = BlendMode.DST_IN;
            return blendMode24;
        }
        if (l(i3, 7)) {
            blendMode23 = BlendMode.SRC_OUT;
            return blendMode23;
        }
        if (l(i3, 8)) {
            blendMode22 = BlendMode.DST_OUT;
            return blendMode22;
        }
        if (l(i3, 9)) {
            blendMode21 = BlendMode.SRC_ATOP;
            return blendMode21;
        }
        if (l(i3, 10)) {
            blendMode20 = BlendMode.DST_ATOP;
            return blendMode20;
        }
        if (l(i3, 11)) {
            blendMode19 = BlendMode.XOR;
            return blendMode19;
        }
        if (l(i3, 12)) {
            blendMode18 = BlendMode.PLUS;
            return blendMode18;
        }
        if (l(i3, 13)) {
            blendMode17 = BlendMode.MODULATE;
            return blendMode17;
        }
        if (l(i3, 14)) {
            blendMode16 = BlendMode.SCREEN;
            return blendMode16;
        }
        if (l(i3, 15)) {
            blendMode15 = BlendMode.OVERLAY;
            return blendMode15;
        }
        if (l(i3, 16)) {
            blendMode14 = BlendMode.DARKEN;
            return blendMode14;
        }
        if (l(i3, 17)) {
            blendMode13 = BlendMode.LIGHTEN;
            return blendMode13;
        }
        if (l(i3, 18)) {
            blendMode12 = BlendMode.COLOR_DODGE;
            return blendMode12;
        }
        if (l(i3, 19)) {
            blendMode11 = BlendMode.COLOR_BURN;
            return blendMode11;
        }
        if (l(i3, 20)) {
            blendMode10 = BlendMode.HARD_LIGHT;
            return blendMode10;
        }
        if (l(i3, 21)) {
            blendMode9 = BlendMode.SOFT_LIGHT;
            return blendMode9;
        }
        if (l(i3, 22)) {
            blendMode8 = BlendMode.DIFFERENCE;
            return blendMode8;
        }
        if (l(i3, 23)) {
            blendMode7 = BlendMode.EXCLUSION;
            return blendMode7;
        }
        if (l(i3, 24)) {
            blendMode6 = BlendMode.MULTIPLY;
            return blendMode6;
        }
        if (l(i3, 25)) {
            blendMode5 = BlendMode.HUE;
            return blendMode5;
        }
        if (l(i3, 26)) {
            blendMode4 = BlendMode.SATURATION;
            return blendMode4;
        }
        if (l(i3, 27)) {
            blendMode3 = BlendMode.COLOR;
            return blendMode3;
        }
        if (l(i3, 28)) {
            blendMode2 = BlendMode.LUMINOSITY;
            return blendMode2;
        }
        blendMode = BlendMode.SRC_OVER;
        return blendMode;
    }

    public static final Rect B(V.d dVar) {
        return new Rect((int) dVar.f2446a, (int) dVar.f2447b, (int) dVar.f2448c, (int) dVar.f2449d);
    }

    public static final int C(long j3) {
        float[] fArr = X.e.f2595a;
        return (int) (r.a(j3, X.e.f2597c) >>> 32);
    }

    public static final Bitmap.Config D(int i3) {
        return o(i3, 0) ? Bitmap.Config.ARGB_8888 : o(i3, 1) ? Bitmap.Config.ALPHA_8 : o(i3, 2) ? Bitmap.Config.RGB_565 : o(i3, 3) ? Bitmap.Config.RGBA_F16 : o(i3, 4) ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    public static final PorterDuff.Mode E(int i3) {
        return l(i3, 0) ? PorterDuff.Mode.CLEAR : l(i3, 1) ? PorterDuff.Mode.SRC : l(i3, 2) ? PorterDuff.Mode.DST : l(i3, 3) ? PorterDuff.Mode.SRC_OVER : l(i3, 4) ? PorterDuff.Mode.DST_OVER : l(i3, 5) ? PorterDuff.Mode.SRC_IN : l(i3, 6) ? PorterDuff.Mode.DST_IN : l(i3, 7) ? PorterDuff.Mode.SRC_OUT : l(i3, 8) ? PorterDuff.Mode.DST_OUT : l(i3, 9) ? PorterDuff.Mode.SRC_ATOP : l(i3, 10) ? PorterDuff.Mode.DST_ATOP : l(i3, 11) ? PorterDuff.Mode.XOR : l(i3, 12) ? PorterDuff.Mode.ADD : l(i3, 14) ? PorterDuff.Mode.SCREEN : l(i3, 15) ? PorterDuff.Mode.OVERLAY : l(i3, 16) ? PorterDuff.Mode.DARKEN : l(i3, 17) ? PorterDuff.Mode.LIGHTEN : l(i3, 13) ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }

    public static void F(float[] fArr, float f3, float f4) {
        float f5 = (fArr[8] * 0.0f) + (fArr[4] * f4) + (fArr[0] * f3) + fArr[12];
        float f6 = (fArr[9] * 0.0f) + (fArr[5] * f4) + (fArr[1] * f3) + fArr[13];
        float f7 = (fArr[10] * 0.0f) + (fArr[6] * f4) + (fArr[2] * f3) + fArr[14];
        float f8 = (fArr[11] * 0.0f) + (fArr[7] * f4) + (fArr[3] * f3) + fArr[15];
        fArr[12] = f5;
        fArr[13] = f6;
        fArr[14] = f7;
        fArr[15] = f8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
    
        if (r3 <= 1.0000008f) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (r3 >= (-8.34465E-7f)) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
    
        r3 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x000f, code lost:
    
        r3 = Float.NaN;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int G(float r3, float[] r4, int r5) {
        /*
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            r2 = 2143289344(0x7fc00000, float:NaN)
            if (r1 >= 0) goto L11
            r1 = -1251999744(0xffffffffb5600000, float:-8.34465E-7)
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 < 0) goto Lf
        Ld:
            r3 = r0
            goto L1f
        Lf:
            r3 = r2
            goto L1f
        L11:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto L1f
            r1 = 1065353223(0x3f800007, float:1.0000008)
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 > 0) goto Lf
            goto Ld
        L1f:
            r4[r5] = r3
            boolean r3 = java.lang.Float.isNaN(r3)
            r3 = r3 ^ 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: W.D.G(float, float[], int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long a(float r20, float r21, float r22, float r23, X.c r24) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: W.D.a(float, float, float, float, X.c):long");
    }

    public static final long b(int i3) {
        long j3 = i3 << 32;
        int i4 = r.f2563g;
        return j3;
    }

    public static final long c(long j3) {
        long j4 = j3 << 32;
        int i3 = r.f2563g;
        return j4;
    }

    public static long d(int i3, int i4, int i5) {
        return b(((i3 & 255) << 16) | (-16777216) | ((i4 & 255) << 8) | (i5 & 255));
    }

    public static final C0084g e() {
        return new C0084g(new Paint(7));
    }

    public static final C0086i f() {
        return new C0086i(new Path());
    }

    public static final float g(float[] fArr, int i3, float[] fArr2, int i4) {
        int i5 = i3 * 4;
        return (fArr[i5 + 3] * fArr2[12 + i4]) + (fArr[i5 + 2] * fArr2[8 + i4]) + (fArr[i5 + 1] * fArr2[4 + i4]) + (fArr[i5] * fArr2[i4]);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long i(long r20, long r22) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: W.D.i(long, long):long");
    }

    public static float[] j() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static void k(Canvas canvas, boolean z3) {
        Method method;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            q.f2557a.a(canvas, z3);
            return;
        }
        if (!f2487d) {
            try {
                if (i3 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f2485b = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f2486c = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f2485b = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    f2486c = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = f2485b;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f2486c;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f2487d = true;
        }
        if (z3) {
            try {
                Method method4 = f2485b;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z3 || (method = f2486c) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    public static final boolean l(int i3, int i4) {
        return i3 == i4;
    }

    public static final boolean m(int i3, int i4) {
        return i3 == i4;
    }

    public static final boolean n(int i3, int i4) {
        return i3 == i4;
    }

    public static final boolean o(int i3, int i4) {
        return i3 == i4;
    }

    public static final boolean p(int i3, int i4) {
        return i3 == i4;
    }

    public static final boolean q(int i3, int i4) {
        return i3 == i4;
    }

    public static long r() {
        return r.f2558b;
    }

    public static final float s(long j3) {
        X.c f3 = r.f(j3);
        if (!X.b.a(f3.f2592b, X.b.f2586a)) {
            throw new IllegalArgumentException("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) X.b.b(f3.f2592b)));
        }
        double h = r.h(j3);
        X.n nVar = ((X.r) f3).f2653p;
        double b3 = nVar.b(h);
        float b4 = (float) ((nVar.b(r.e(j3)) * 0.0722d) + (nVar.b(r.g(j3)) * 0.7152d) + (b3 * 0.2126d));
        if (b4 < 0.0f) {
            b4 = 0.0f;
        }
        if (b4 > 1.0f) {
            return 1.0f;
        }
        return b4;
    }

    public static final long t(float[] fArr, long j3) {
        float b3 = V.c.b(j3);
        float c3 = V.c.c(j3);
        float f3 = 1 / (((fArr[7] * c3) + (fArr[3] * b3)) + fArr[15]);
        if (Float.isInfinite(f3) || Float.isNaN(f3)) {
            f3 = 0.0f;
        }
        return r2.a.f(((fArr[4] * c3) + (fArr[0] * b3) + fArr[12]) * f3, ((fArr[5] * c3) + (fArr[1] * b3) + fArr[13]) * f3);
    }

    public static final void u(float[] fArr, V.b bVar) {
        long t3 = t(fArr, r2.a.f(bVar.f2440a, bVar.f2441b));
        long t4 = t(fArr, r2.a.f(bVar.f2440a, bVar.f2443d));
        long t5 = t(fArr, r2.a.f(bVar.f2442c, bVar.f2441b));
        long t6 = t(fArr, r2.a.f(bVar.f2442c, bVar.f2443d));
        bVar.f2440a = Math.min(Math.min(V.c.b(t3), V.c.b(t4)), Math.min(V.c.b(t5), V.c.b(t6)));
        bVar.f2441b = Math.min(Math.min(V.c.c(t3), V.c.c(t4)), Math.min(V.c.c(t5), V.c.c(t6)));
        bVar.f2442c = Math.max(Math.max(V.c.b(t3), V.c.b(t4)), Math.max(V.c.b(t5), V.c.b(t6)));
        bVar.f2443d = Math.max(Math.max(V.c.c(t3), V.c.c(t4)), Math.max(V.c.c(t5), V.c.c(t6)));
    }

    public static final void v(float[] fArr) {
        int i3 = 0;
        while (i3 < 4) {
            int i4 = 0;
            while (i4 < 4) {
                fArr[(i4 * 4) + i3] = i3 == i4 ? 1.0f : 0.0f;
                i4++;
            }
            i3++;
        }
    }

    public static final void w(float[] fArr, float f3) {
        double d3 = (f3 * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d3);
        float sin = (float) Math.sin(d3);
        float f4 = fArr[0];
        float f5 = fArr[4];
        float f6 = (sin * f5) + (cos * f4);
        float f7 = -sin;
        float f8 = fArr[1];
        float f9 = fArr[5];
        float f10 = (sin * f9) + (cos * f8);
        float f11 = fArr[2];
        float f12 = fArr[6];
        float f13 = (sin * f12) + (cos * f11);
        float f14 = fArr[3];
        float f15 = fArr[7];
        fArr[0] = f6;
        fArr[1] = f10;
        fArr[2] = f13;
        fArr[3] = (sin * f15) + (cos * f14);
        fArr[4] = (f5 * cos) + (f4 * f7);
        fArr[5] = (f9 * cos) + (f8 * f7);
        fArr[6] = (f12 * cos) + (f11 * f7);
        fArr[7] = (cos * f15) + (f7 * f14);
    }

    public static final void x(float[] fArr, float f3, float f4, float f5) {
        fArr[0] = fArr[0] * f3;
        fArr[1] = fArr[1] * f3;
        fArr[2] = fArr[2] * f3;
        fArr[3] = fArr[3] * f3;
        fArr[4] = fArr[4] * f4;
        fArr[5] = fArr[5] * f4;
        fArr[6] = fArr[6] * f4;
        fArr[7] = fArr[7] * f4;
        fArr[8] = fArr[8] * f5;
        fArr[9] = fArr[9] * f5;
        fArr[10] = fArr[10] * f5;
        fArr[11] = fArr[11] * f5;
    }

    public static final void y(float[] fArr, Matrix matrix) {
        matrix.getValues(fArr);
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = fArr[2];
        float f6 = fArr[3];
        float f7 = fArr[4];
        float f8 = fArr[5];
        float f9 = fArr[6];
        float f10 = fArr[7];
        float f11 = fArr[8];
        fArr[0] = f3;
        fArr[1] = f6;
        fArr[2] = 0.0f;
        fArr[3] = f9;
        fArr[4] = f4;
        fArr[5] = f7;
        fArr[6] = 0.0f;
        fArr[7] = f10;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f5;
        fArr[13] = f8;
        fArr[14] = 0.0f;
        fArr[15] = f11;
    }

    public static final void z(float[] fArr, float[] fArr2) {
        float g3 = g(fArr, 0, fArr2, 0);
        float g4 = g(fArr, 0, fArr2, 1);
        float g5 = g(fArr, 0, fArr2, 2);
        float g6 = g(fArr, 0, fArr2, 3);
        float g7 = g(fArr, 1, fArr2, 0);
        float g8 = g(fArr, 1, fArr2, 1);
        float g9 = g(fArr, 1, fArr2, 2);
        float g10 = g(fArr, 1, fArr2, 3);
        float g11 = g(fArr, 2, fArr2, 0);
        float g12 = g(fArr, 2, fArr2, 1);
        float g13 = g(fArr, 2, fArr2, 2);
        float g14 = g(fArr, 2, fArr2, 3);
        float g15 = g(fArr, 3, fArr2, 0);
        float g16 = g(fArr, 3, fArr2, 1);
        float g17 = g(fArr, 3, fArr2, 2);
        float g18 = g(fArr, 3, fArr2, 3);
        fArr[0] = g3;
        fArr[1] = g4;
        fArr[2] = g5;
        fArr[3] = g6;
        fArr[4] = g7;
        fArr[5] = g8;
        fArr[6] = g9;
        fArr[7] = g10;
        fArr[8] = g11;
        fArr[9] = g12;
        fArr[10] = g13;
        fArr[11] = g14;
        fArr[12] = g15;
        fArr[13] = g16;
        fArr[14] = g17;
        fArr[15] = g18;
    }

    public abstract void h(float f3, long j3, C0084g c0084g);
}
