package k;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.widget.TextView;

/* loaded from: classes.dex */
public abstract class K {
    public static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i3, TextView textView, TextPaint textPaint) {
        return new StaticLayout(charSequence, textPaint, i3, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
    }

    public static int b(TextView textView) {
        return textView.getMaxLines();
    }
}
