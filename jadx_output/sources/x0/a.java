package x0;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes.dex */
public final class a extends MetricAffectingSpan {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6656a;

    /* renamed from: b, reason: collision with root package name */
    public final float f6657b;

    public /* synthetic */ a(int i3, float f3) {
        this.f6656a = i3;
        this.f6657b = f3;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f6656a) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f6657b);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f6657b);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f6656a) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f6657b);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f6657b);
                break;
        }
    }
}
