package X1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* loaded from: classes.dex */
public final class o extends t {

    /* renamed from: c, reason: collision with root package name */
    public final q f2743c;

    public o(q qVar) {
        this.f2743c = qVar;
    }

    @Override // X1.t
    public final void a(Matrix matrix, W1.a aVar, int i3, Canvas canvas) {
        q qVar = this.f2743c;
        float f3 = qVar.f2751f;
        float f4 = qVar.f2752g;
        RectF rectF = new RectF(qVar.f2747b, qVar.f2748c, qVar.f2749d, qVar.f2750e);
        aVar.getClass();
        boolean z3 = f4 < 0.0f;
        Path path = aVar.f2583g;
        int[] iArr = W1.a.f2575k;
        if (z3) {
            iArr[0] = 0;
            iArr[1] = aVar.f2582f;
            iArr[2] = aVar.f2581e;
            iArr[3] = aVar.f2580d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f3, f4);
            path.close();
            float f5 = -i3;
            rectF.inset(f5, f5);
            iArr[0] = 0;
            iArr[1] = aVar.f2580d;
            iArr[2] = aVar.f2581e;
            iArr[3] = aVar.f2582f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f6 = 1.0f - (i3 / width);
        float[] fArr = W1.a.f2576l;
        fArr[1] = f6;
        fArr[2] = ((1.0f - f6) / 2.0f) + f6;
        RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP);
        Paint paint = aVar.f2578b;
        paint.setShader(radialGradient);
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z3) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, aVar.h);
        }
        canvas.drawArc(rectF, f3, f4, true, paint);
        canvas.restore();
    }
}
