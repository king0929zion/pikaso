package e1;

import android.graphics.text.LineBreakConfig;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes.dex */
public abstract /* synthetic */ class d {
    public static /* synthetic */ LineBreakConfig.Builder a() {
        return new LineBreakConfig.Builder();
    }

    public static /* synthetic */ BoringLayout e(CharSequence charSequence, TextPaint textPaint, int i3, Layout.Alignment alignment, float f3, float f4, BoringLayout.Metrics metrics, boolean z3, boolean z4, TextUtils.TruncateAt truncateAt, int i4) {
        return new BoringLayout(charSequence, textPaint, i3, alignment, f3, f4, metrics, z3, truncateAt, i4, z4);
    }
}
