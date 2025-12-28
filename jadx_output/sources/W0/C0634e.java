package w0;

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.text.MeasuredText;

/* renamed from: w0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0634e {

    /* renamed from: a, reason: collision with root package name */
    public static final C0634e f6497a = new C0634e();

    public final void a(Canvas canvas) {
        canvas.disableZ();
    }

    public final void b(Canvas canvas, int i3, BlendMode blendMode) {
        canvas.drawColor(i3, blendMode);
    }

    public final void c(Canvas canvas, long j3) {
        canvas.drawColor(j3);
    }

    public final void d(Canvas canvas, long j3, BlendMode blendMode) {
        canvas.drawColor(j3, blendMode);
    }

    public final void e(Canvas canvas, RectF rectF, float f3, float f4, RectF rectF2, float f5, float f6, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, f3, f4, rectF2, f5, f6, paint);
    }

    public final void f(Canvas canvas, RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
    }

    public final void g(Canvas canvas, RenderNode renderNode) {
        canvas.drawRenderNode(renderNode);
    }

    public final void h(Canvas canvas, MeasuredText measuredText, int i3, int i4, int i5, int i6, float f3, float f4, boolean z3, Paint paint) {
        canvas.drawTextRun(measuredText, i3, i4, i5, i6, f3, f4, z3, paint);
    }

    public final void i(Canvas canvas) {
        canvas.enableZ();
    }
}
