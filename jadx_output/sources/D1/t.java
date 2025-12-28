package D1;

import android.text.PrecomputedText;
import android.text.TextPaint;

/* loaded from: classes.dex */
public abstract /* synthetic */ class t {
    public static /* synthetic */ PrecomputedText.Params.Builder i(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }

    public static /* bridge */ /* synthetic */ boolean w(CharSequence charSequence) {
        return charSequence instanceof PrecomputedText;
    }
}
