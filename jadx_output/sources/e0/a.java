package E0;

import W.D;
import Y.c;
import Y.f;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import p2.g;

/* loaded from: classes.dex */
public final class a extends CharacterStyle implements UpdateAppearance {

    /* renamed from: a, reason: collision with root package name */
    public final c f1147a;

    public a(c cVar) {
        this.f1147a = cVar;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            f fVar = f.f2774b;
            c cVar = this.f1147a;
            if (g.a(cVar, fVar)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (cVar instanceof Y.g) {
                textPaint.setStyle(Paint.Style.STROKE);
                Y.g gVar = (Y.g) cVar;
                textPaint.setStrokeWidth(gVar.f2775b);
                textPaint.setStrokeMiter(gVar.f2776c);
                int i3 = gVar.f2778e;
                textPaint.setStrokeJoin(D.q(i3, 0) ? Paint.Join.MITER : D.q(i3, 1) ? Paint.Join.ROUND : D.q(i3, 2) ? Paint.Join.BEVEL : Paint.Join.MITER);
                int i4 = gVar.f2777d;
                textPaint.setStrokeCap(D.p(i4, 0) ? Paint.Cap.BUTT : D.p(i4, 1) ? Paint.Cap.ROUND : D.p(i4, 2) ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
                gVar.getClass();
                textPaint.setPathEffect(null);
            }
        }
    }
}
