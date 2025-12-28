package x0;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* loaded from: classes.dex */
public final class j extends CharacterStyle {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f6681a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6682b;

    public j(boolean z3, boolean z4) {
        this.f6681a = z3;
        this.f6682b = z4;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f6681a);
        textPaint.setStrikeThruText(this.f6682b);
    }
}
