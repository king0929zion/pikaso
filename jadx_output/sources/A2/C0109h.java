package a2;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: a2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0109h extends X1.g {

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ int f2976B = 0;

    /* renamed from: A, reason: collision with root package name */
    public C0108g f2977A;

    @Override // X1.g
    public final void e(Canvas canvas) {
        if (this.f2977A.f2975q.isEmpty()) {
            super.e(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.f2977A.f2975q);
        super.e(canvas);
        canvas.restore();
    }

    @Override // X1.g, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f2977A = new C0108g(this.f2977A);
        return this;
    }

    public final void n(float f3, float f4, float f5, float f6) {
        RectF rectF = this.f2977A.f2975q;
        if (f3 == rectF.left && f4 == rectF.top && f5 == rectF.right && f6 == rectF.bottom) {
            return;
        }
        rectF.set(f3, f4, f5, f6);
        invalidateSelf();
    }
}
