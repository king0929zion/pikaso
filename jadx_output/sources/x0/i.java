package x0;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* loaded from: classes.dex */
public final class i extends CharacterStyle {

    /* renamed from: a, reason: collision with root package name */
    public final int f6677a;

    /* renamed from: b, reason: collision with root package name */
    public final float f6678b;

    /* renamed from: c, reason: collision with root package name */
    public final float f6679c;

    /* renamed from: d, reason: collision with root package name */
    public final float f6680d;

    public i(int i3, float f3, float f4, float f5) {
        this.f6677a = i3;
        this.f6678b = f3;
        this.f6679c = f4;
        this.f6680d = f5;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f6680d, this.f6678b, this.f6679c, this.f6677a);
    }
}
