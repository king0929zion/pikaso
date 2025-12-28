package o1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ReplacementSpan;
import p1.C0545a;

/* loaded from: classes.dex */
public final class w extends ReplacementSpan {

    /* renamed from: b, reason: collision with root package name */
    public final v f5813b;

    /* renamed from: e, reason: collision with root package name */
    public TextPaint f5816e;

    /* renamed from: a, reason: collision with root package name */
    public final Paint.FontMetricsInt f5812a = new Paint.FontMetricsInt();

    /* renamed from: c, reason: collision with root package name */
    public short f5814c = -1;

    /* renamed from: d, reason: collision with root package name */
    public float f5815d = 1.0f;

    public w(v vVar) {
        Z.b.g(vVar, "rasterizer cannot be null");
        this.f5813b = vVar;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i3, int i4, float f3, int i5, int i6, int i7, Paint paint) {
        Paint paint2 = paint;
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i3, i4, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.f5816e;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.f5816e = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint2);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        characterStyle.updateDrawState(textPaint);
                    }
                }
            }
            if (paint2 instanceof TextPaint) {
                textPaint = (TextPaint) paint2;
            }
        } else if (paint2 instanceof TextPaint) {
            textPaint = (TextPaint) paint2;
        }
        if (textPaint != null && textPaint.bgColor != 0) {
            int color = textPaint.getColor();
            Paint.Style style = textPaint.getStyle();
            textPaint.setColor(textPaint.bgColor);
            textPaint.setStyle(Paint.Style.FILL);
            canvas.drawRect(f3, i5, f3 + this.f5814c, i7, textPaint);
            textPaint.setStyle(style);
            textPaint.setColor(color);
        }
        i.a().getClass();
        float f4 = i6;
        if (textPaint != null) {
            paint2 = textPaint;
        }
        v vVar = this.f5813b;
        D1.w wVar = vVar.f5810b;
        Typeface typeface = (Typeface) wVar.f1034d;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) wVar.f1032b, vVar.f5809a * 2, 2, f3, f4, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f5812a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        v vVar = this.f5813b;
        this.f5815d = abs / (vVar.c().a(14) != 0 ? r8.f5940b.getShort(r1 + r8.f5939a) : (short) 0);
        C0545a c3 = vVar.c();
        int a3 = c3.a(14);
        if (a3 != 0) {
            c3.f5940b.getShort(a3 + c3.f5939a);
        }
        short s3 = (short) ((vVar.c().a(12) != 0 ? r5.f5940b.getShort(r7 + r5.f5939a) : (short) 0) * this.f5815d);
        this.f5814c = s3;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s3;
    }
}
