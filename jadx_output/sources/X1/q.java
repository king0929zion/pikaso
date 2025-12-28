package X1;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class q extends s {
    public static final RectF h = new RectF();

    /* renamed from: b, reason: collision with root package name */
    public final float f2747b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2748c;

    /* renamed from: d, reason: collision with root package name */
    public final float f2749d;

    /* renamed from: e, reason: collision with root package name */
    public final float f2750e;

    /* renamed from: f, reason: collision with root package name */
    public float f2751f;

    /* renamed from: g, reason: collision with root package name */
    public float f2752g;

    public q(float f3, float f4, float f5, float f6) {
        this.f2747b = f3;
        this.f2748c = f4;
        this.f2749d = f5;
        this.f2750e = f6;
    }

    @Override // X1.s
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f2755a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = h;
        rectF.set(this.f2747b, this.f2748c, this.f2749d, this.f2750e);
        path.arcTo(rectF, this.f2751f, this.f2752g, false);
        path.transform(matrix);
    }
}
