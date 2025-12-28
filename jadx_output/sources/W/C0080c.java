package W;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;

/* renamed from: W.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0080c implements o {

    /* renamed from: a, reason: collision with root package name */
    public Canvas f2534a = AbstractC0081d.f2537a;

    /* renamed from: b, reason: collision with root package name */
    public Rect f2535b;

    /* renamed from: c, reason: collision with root package name */
    public Rect f2536c;

    @Override // W.o
    public final void a() {
        this.f2534a.restore();
    }

    @Override // W.o
    public final void c(float f3, float f4) {
        this.f2534a.scale(f3, f4);
    }

    @Override // W.o
    public final void d() {
        this.f2534a.save();
    }

    @Override // W.o
    public final void e() {
        D.k(this.f2534a, false);
    }

    @Override // W.o
    public final void f(float f3, float f4, float f5, float f6, float f7, float f8, C0084g c0084g) {
        this.f2534a.drawRoundRect(f3, f4, f5, f6, f7, f8, c0084g.f2539a);
    }

    @Override // W.o
    public final void h(C c3, C0084g c0084g) {
        Canvas canvas = this.f2534a;
        if (!(c3 instanceof C0086i)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((C0086i) c3).f2545a, c0084g.f2539a);
    }

    @Override // W.o
    public final void i(float f3, long j3, C0084g c0084g) {
        this.f2534a.drawCircle(V.c.b(j3), V.c.c(j3), f3, c0084g.f2539a);
    }

    @Override // W.o
    public final void j(C c3, int i3) {
        Canvas canvas = this.f2534a;
        if (!(c3 instanceof C0086i)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((C0086i) c3).f2545a, i3 == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // W.o
    public final void k(float[] fArr) {
        int i3 = 0;
        while (i3 < 4) {
            int i4 = 0;
            while (i4 < 4) {
                if (fArr[(i3 * 4) + i4] != (i3 == i4 ? 1.0f : 0.0f)) {
                    Matrix matrix = new Matrix();
                    float f3 = fArr[0];
                    float f4 = fArr[1];
                    float f5 = fArr[2];
                    float f6 = fArr[3];
                    float f7 = fArr[4];
                    float f8 = fArr[5];
                    float f9 = fArr[6];
                    float f10 = fArr[7];
                    float f11 = fArr[8];
                    float f12 = fArr[12];
                    float f13 = fArr[13];
                    float f14 = fArr[15];
                    fArr[0] = f3;
                    fArr[1] = f7;
                    fArr[2] = f12;
                    fArr[3] = f4;
                    fArr[4] = f8;
                    fArr[5] = f13;
                    fArr[6] = f6;
                    fArr[7] = f10;
                    fArr[8] = f14;
                    matrix.setValues(fArr);
                    fArr[0] = f3;
                    fArr[1] = f4;
                    fArr[2] = f5;
                    fArr[3] = f6;
                    fArr[4] = f7;
                    fArr[5] = f8;
                    fArr[6] = f9;
                    fArr[7] = f10;
                    fArr[8] = f11;
                    this.f2534a.concat(matrix);
                    return;
                }
                i4++;
            }
            i3++;
        }
    }

    @Override // W.o
    public final void l(C0083f c0083f, long j3, long j4, long j5, long j6, C0084g c0084g) {
        if (this.f2535b == null) {
            this.f2535b = new Rect();
            this.f2536c = new Rect();
        }
        Canvas canvas = this.f2534a;
        if (!(c0083f instanceof C0083f)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
        }
        Bitmap bitmap = c0083f.f2538a;
        Rect rect = this.f2535b;
        p2.g.b(rect);
        int i3 = (int) (j3 >> 32);
        rect.left = i3;
        int i4 = (int) (j3 & 4294967295L);
        rect.top = i4;
        rect.right = i3 + ((int) (j4 >> 32));
        rect.bottom = i4 + ((int) (j4 & 4294967295L));
        Rect rect2 = this.f2536c;
        p2.g.b(rect2);
        int i5 = (int) (j5 >> 32);
        rect2.left = i5;
        int i6 = (int) (j5 & 4294967295L);
        rect2.top = i6;
        rect2.right = i5 + ((int) (j6 >> 32));
        rect2.bottom = i6 + ((int) (j6 & 4294967295L));
        canvas.drawBitmap(bitmap, rect, rect2, c0084g.f2539a);
    }

    @Override // W.o
    public final void m() {
        D.k(this.f2534a, true);
    }

    @Override // W.o
    public final void n(float f3, float f4, float f5, float f6, int i3) {
        this.f2534a.clipRect(f3, f4, f5, f6, i3 == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // W.o
    public final void o(float f3, float f4) {
        this.f2534a.translate(f3, f4);
    }

    @Override // W.o
    public final void p(float f3, float f4, float f5, float f6, C0084g c0084g) {
        this.f2534a.drawRect(f3, f4, f5, f6, c0084g.f2539a);
    }

    @Override // W.o
    public final void q(V.d dVar, C0084g c0084g) {
        Canvas canvas = this.f2534a;
        Paint paint = c0084g.f2539a;
        canvas.saveLayer(dVar.f2446a, dVar.f2447b, dVar.f2448c, dVar.f2449d, paint, 31);
    }

    public final Canvas r() {
        return this.f2534a;
    }

    public final void s(Canvas canvas) {
        this.f2534a = canvas;
    }
}
