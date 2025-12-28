package k;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.ai.assistance.operit.provider.R;

/* renamed from: k.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0324n extends Button {

    /* renamed from: d, reason: collision with root package name */
    public final C0322m f4843d;

    /* renamed from: e, reason: collision with root package name */
    public final F f4844e;

    /* renamed from: f, reason: collision with root package name */
    public C0337u f4845f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0324n(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialButtonStyle);
        K0.a(context);
        J0.a(this, getContext());
        C0322m c0322m = new C0322m(this);
        this.f4843d = c0322m;
        c0322m.d(attributeSet, R.attr.materialButtonStyle);
        F f3 = new F(this);
        this.f4844e = f3;
        f3.d(attributeSet, R.attr.materialButtonStyle);
        f3.b();
        getEmojiTextViewHelper().a(attributeSet, R.attr.materialButtonStyle);
    }

    private C0337u getEmojiTextViewHelper() {
        if (this.f4845f == null) {
            this.f4845f = new C0337u(this);
        }
        return this.f4845f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0322m c0322m = this.f4843d;
        if (c0322m != null) {
            c0322m.a();
        }
        F f3 = this.f4844e;
        if (f3 != null) {
            f3.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (Y0.f4739a) {
            return super.getAutoSizeMaxTextSize();
        }
        F f3 = this.f4844e;
        if (f3 != null) {
            return Math.round(f3.f4643i.f4705e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (Y0.f4739a) {
            return super.getAutoSizeMinTextSize();
        }
        F f3 = this.f4844e;
        if (f3 != null) {
            return Math.round(f3.f4643i.f4704d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (Y0.f4739a) {
            return super.getAutoSizeStepGranularity();
        }
        F f3 = this.f4844e;
        if (f3 != null) {
            return Math.round(f3.f4643i.f4703c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (Y0.f4739a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        F f3 = this.f4844e;
        return f3 != null ? f3.f4643i.f4706f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (Y0.f4739a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        F f3 = this.f4844e;
        if (f3 != null) {
            return f3.f4643i.f4701a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof j1.o ? ((j1.o) customSelectionActionModeCallback).f4624a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0322m c0322m = this.f4843d;
        if (c0322m != null) {
            return c0322m.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0322m c0322m = this.f4843d;
        if (c0322m != null) {
            return c0322m.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        A1.e eVar = this.f4844e.h;
        if (eVar != null) {
            return (ColorStateList) eVar.f213c;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        A1.e eVar = this.f4844e.h;
        if (eVar != null) {
            return (PorterDuff.Mode) eVar.f214d;
        }
        return null;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        super.onLayout(z3, i3, i4, i5, i6);
        F f3 = this.f4844e;
        if (f3 == null || Y0.f4739a) {
            return;
        }
        f3.f4643i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
        super.onTextChanged(charSequence, i3, i4, i5);
        F f3 = this.f4844e;
        if (f3 == null || Y0.f4739a) {
            return;
        }
        Q q3 = f3.f4643i;
        if (q3.f()) {
            q3.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z3) {
        super.setAllCaps(z3);
        ((Z.b) getEmojiTextViewHelper().f4878b.f4656b).L(z3);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i3, int i4, int i5, int i6) {
        if (Y0.f4739a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i3, i4, i5, i6);
            return;
        }
        F f3 = this.f4844e;
        if (f3 != null) {
            f3.f(i3, i4, i5, i6);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i3) {
        if (Y0.f4739a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i3);
            return;
        }
        F f3 = this.f4844e;
        if (f3 != null) {
            f3.g(iArr, i3);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i3) {
        if (Y0.f4739a) {
            super.setAutoSizeTextTypeWithDefaults(i3);
            return;
        }
        F f3 = this.f4844e;
        if (f3 != null) {
            f3.h(i3);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0322m c0322m = this.f4843d;
        if (c0322m != null) {
            c0322m.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C0322m c0322m = this.f4843d;
        if (c0322m != null) {
            c0322m.f(i3);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(Z0.d.W(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z3) {
        ((Z.b) getEmojiTextViewHelper().f4878b.f4656b).M(z3);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((Z.b) getEmojiTextViewHelper().f4878b.f4656b).t(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z3) {
        F f3 = this.f4844e;
        if (f3 != null) {
            f3.f4636a.setAllCaps(z3);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0322m c0322m = this.f4843d;
        if (c0322m != null) {
            c0322m.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0322m c0322m = this.f4843d;
        if (c0322m != null) {
            c0322m.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        F f3 = this.f4844e;
        f3.i(colorStateList);
        f3.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        F f3 = this.f4844e;
        f3.j(mode);
        f3.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        F f3 = this.f4844e;
        if (f3 != null) {
            f3.e(context, i3);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i3, float f3) {
        boolean z3 = Y0.f4739a;
        if (z3) {
            super.setTextSize(i3, f3);
            return;
        }
        F f4 = this.f4844e;
        if (f4 == null || z3) {
            return;
        }
        Q q3 = f4.f4643i;
        if (q3.f()) {
            return;
        }
        q3.g(i3, f3);
    }
}
