package W;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;

/* renamed from: W.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0084g {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f2539a;

    /* renamed from: b, reason: collision with root package name */
    public int f2540b = 3;

    /* renamed from: c, reason: collision with root package name */
    public Shader f2541c;

    /* renamed from: d, reason: collision with root package name */
    public C0089l f2542d;

    public C0084g(Paint paint) {
        this.f2539a = paint;
    }

    public final void a(float f3) {
        this.f2539a.setAlpha((int) Math.rint(f3 * 255.0f));
    }

    public final void b(int i3) {
        if (D.l(this.f2540b, i3)) {
            return;
        }
        this.f2540b = i3;
        int i4 = Build.VERSION.SDK_INT;
        Paint paint = this.f2539a;
        if (i4 >= 29) {
            L.f2532a.a(paint, i3);
        } else {
            paint.setXfermode(new PorterDuffXfermode(D.E(i3)));
        }
    }

    public final void c(long j3) {
        this.f2539a.setColor(D.C(j3));
    }

    public final void d(C0089l c0089l) {
        this.f2542d = c0089l;
        this.f2539a.setColorFilter(c0089l != null ? c0089l.f2549a : null);
    }

    public final void e(int i3) {
        this.f2539a.setStrokeCap(D.p(i3, 2) ? Paint.Cap.SQUARE : D.p(i3, 1) ? Paint.Cap.ROUND : D.p(i3, 0) ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    public final void f(int i3) {
        this.f2539a.setStrokeJoin(D.q(i3, 0) ? Paint.Join.MITER : D.q(i3, 2) ? Paint.Join.BEVEL : D.q(i3, 1) ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    public final void g(int i3) {
        this.f2539a.setStyle(i3 == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }
}
