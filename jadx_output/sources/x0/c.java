package x0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import w0.v;
import w0.x;
import x.AbstractC0638c;

/* loaded from: classes.dex */
public final class c implements LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence, int i8, int i9, boolean z3, Layout layout) {
        int lineForOffset;
        if (layout == null || paint == null || (lineForOffset = layout.getLineForOffset(i8)) != layout.getLineCount() - 1) {
            return;
        }
        v vVar = x.f6553a;
        if (layout.getEllipsisCount(lineForOffset) > 0) {
            float f3 = AbstractC0638c.f(layout, lineForOffset, paint) + AbstractC0638c.e(layout, lineForOffset, paint);
            if (f3 == 0.0f) {
                return;
            }
            p2.g.b(canvas);
            canvas.translate(f3, 0.0f);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z3) {
        return 0;
    }
}
