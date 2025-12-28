package j1;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.CompoundButton;

/* renamed from: j1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0295b {
    public static ColorStateList a(CompoundButton compoundButton) {
        return compoundButton.getButtonTintList();
    }

    public static PorterDuff.Mode b(CompoundButton compoundButton) {
        return compoundButton.getButtonTintMode();
    }

    public static void c(CompoundButton compoundButton, ColorStateList colorStateList) {
        compoundButton.setButtonTintList(colorStateList);
    }

    public static void d(CompoundButton compoundButton, PorterDuff.Mode mode) {
        compoundButton.setButtonTintMode(mode);
    }
}
