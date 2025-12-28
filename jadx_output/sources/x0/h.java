package x0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* loaded from: classes.dex */
public final class h extends ReplacementSpan {

    /* renamed from: a, reason: collision with root package name */
    public Paint.FontMetricsInt f6673a;

    /* renamed from: b, reason: collision with root package name */
    public int f6674b;

    /* renamed from: c, reason: collision with root package name */
    public int f6675c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6676d;

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.f6673a;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        p2.g.h("fontMetrics");
        throw null;
    }

    public final int b() {
        if (this.f6676d) {
            return this.f6675c;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.");
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i3, int i4, float f3, int i5, int i6, int i7, Paint paint) {
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        this.f6676d = true;
        paint.getTextSize();
        this.f6673a = paint.getFontMetricsInt();
        if (a().descent <= a().ascent) {
            throw new IllegalArgumentException("Invalid fontMetrics: line height can not be negative.");
        }
        this.f6674b = (int) Math.ceil(0.0f);
        this.f6675c = (int) Math.ceil(0.0f);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = a().ascent;
            fontMetricsInt.descent = a().descent;
            fontMetricsInt.leading = a().leading;
            if (fontMetricsInt.ascent > (-b())) {
                fontMetricsInt.ascent = -b();
            }
            fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
        }
        if (this.f6676d) {
            return this.f6674b;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.");
    }
}
