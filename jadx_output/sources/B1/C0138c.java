package b1;

import D1.t;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;

/* renamed from: b1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0138c {

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f3652a;

    /* renamed from: b, reason: collision with root package name */
    public final TextDirectionHeuristic f3653b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3654c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3655d;

    public C0138c(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i3, int i4) {
        PrecomputedText.Params.Builder breakStrategy;
        PrecomputedText.Params.Builder hyphenationFrequency;
        PrecomputedText.Params.Builder textDirection;
        if (Build.VERSION.SDK_INT >= 29) {
            breakStrategy = t.i(textPaint).setBreakStrategy(i3);
            hyphenationFrequency = breakStrategy.setHyphenationFrequency(i4);
            textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic);
            textDirection.build();
        }
        this.f3652a = textPaint;
        this.f3653b = textDirectionHeuristic;
        this.f3654c = i3;
        this.f3655d = i4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0138c)) {
            return false;
        }
        C0138c c0138c = (C0138c) obj;
        if (this.f3654c == c0138c.f3654c && this.f3655d == c0138c.f3655d) {
            TextPaint textPaint = this.f3652a;
            float textSize = textPaint.getTextSize();
            TextPaint textPaint2 = c0138c.f3652a;
            return textSize == textPaint2.getTextSize() && textPaint.getTextScaleX() == textPaint2.getTextScaleX() && textPaint.getTextSkewX() == textPaint2.getTextSkewX() && textPaint.getLetterSpacing() == textPaint2.getLetterSpacing() && TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) && textPaint.getFlags() == textPaint2.getFlags() && textPaint.getTextLocales().equals(textPaint2.getTextLocales()) && (textPaint.getTypeface() != null ? textPaint.getTypeface().equals(textPaint2.getTypeface()) : textPaint2.getTypeface() == null) && this.f3653b == c0138c.f3653b;
        }
        return false;
    }

    public final int hashCode() {
        TextPaint textPaint = this.f3652a;
        return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f3653b, Integer.valueOf(this.f3654c), Integer.valueOf(this.f3655d));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f3652a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb.append(", textLocale=" + textPaint.getTextLocales());
        sb.append(", typeface=" + textPaint.getTypeface());
        sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
        sb.append(", textDir=" + this.f3653b);
        sb.append(", breakStrategy=" + this.f3654c);
        sb.append(", hyphenationFrequency=" + this.f3655d);
        sb.append("}");
        return sb.toString();
    }

    public C0138c(PrecomputedText.Params params) {
        TextPaint textPaint;
        TextDirectionHeuristic textDirection;
        int breakStrategy;
        int hyphenationFrequency;
        textPaint = params.getTextPaint();
        this.f3652a = textPaint;
        textDirection = params.getTextDirection();
        this.f3653b = textDirection;
        breakStrategy = params.getBreakStrategy();
        this.f3654c = breakStrategy;
        hyphenationFrequency = params.getHyphenationFrequency();
        this.f3655d = hyphenationFrequency;
    }
}
