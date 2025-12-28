package X1;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* loaded from: classes.dex */
public final class p extends t {

    /* renamed from: c, reason: collision with root package name */
    public final r f2744c;

    /* renamed from: d, reason: collision with root package name */
    public final float f2745d;

    /* renamed from: e, reason: collision with root package name */
    public final float f2746e;

    public p(r rVar, float f3, float f4) {
        this.f2744c = rVar;
        this.f2745d = f3;
        this.f2746e = f4;
    }

    @Override // X1.t
    public final void a(Matrix matrix, W1.a aVar, int i3, Canvas canvas) {
        r rVar = this.f2744c;
        float f3 = rVar.f2754c;
        float f4 = this.f2746e;
        float f5 = rVar.f2753b;
        float f6 = this.f2745d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f3 - f4, f5 - f6), 0.0f);
        Matrix matrix2 = this.f2757a;
        matrix2.set(matrix);
        matrix2.preTranslate(f6, f4);
        matrix2.preRotate(b());
        aVar.getClass();
        rectF.bottom += i3;
        rectF.offset(0.0f, -i3);
        int[] iArr = W1.a.f2573i;
        iArr[0] = aVar.f2582f;
        iArr[1] = aVar.f2581e;
        iArr[2] = aVar.f2580d;
        Paint paint = aVar.f2579c;
        float f7 = rectF.left;
        paint.setShader(new LinearGradient(f7, rectF.top, f7, rectF.bottom, iArr, W1.a.f2574j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        r rVar = this.f2744c;
        return (float) Math.toDegrees(Math.atan((rVar.f2754c - this.f2746e) / (rVar.f2753b - this.f2745d)));
    }
}
