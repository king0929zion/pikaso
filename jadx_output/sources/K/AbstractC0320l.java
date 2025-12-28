package k;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* renamed from: k.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0320l extends AutoCompleteTextView {

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f4809g = {R.attr.popupBackground};

    /* renamed from: d, reason: collision with root package name */
    public final C0322m f4810d;

    /* renamed from: e, reason: collision with root package name */
    public final F f4811e;

    /* renamed from: f, reason: collision with root package name */
    public final B2.i f4812f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0320l(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.ai.assistance.operit.provider.R.attr.autoCompleteTextViewStyle);
        K0.a(context);
        J0.a(this, getContext());
        B0.a y3 = B0.a.y(getContext(), attributeSet, f4809g, com.ai.assistance.operit.provider.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) y3.f272c).hasValue(0)) {
            setDropDownBackgroundDrawable(y3.m(0));
        }
        y3.C();
        C0322m c0322m = new C0322m(this);
        this.f4810d = c0322m;
        c0322m.d(attributeSet, com.ai.assistance.operit.provider.R.attr.autoCompleteTextViewStyle);
        F f3 = new F(this);
        this.f4811e = f3;
        f3.d(attributeSet, com.ai.assistance.operit.provider.R.attr.autoCompleteTextViewStyle);
        f3.b();
        B2.i iVar = new B2.i(this, 9);
        this.f4812f = iVar;
        iVar.n(attributeSet, com.ai.assistance.operit.provider.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = super.isFocusable();
        boolean isClickable = super.isClickable();
        boolean isLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener k3 = iVar.k(keyListener);
        if (k3 == keyListener) {
            return;
        }
        super.setKeyListener(k3);
        super.setRawInputType(inputType);
        super.setFocusable(isFocusable);
        super.setClickable(isClickable);
        super.setLongClickable(isLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0322m c0322m = this.f4810d;
        if (c0322m != null) {
            c0322m.a();
        }
        F f3 = this.f4811e;
        if (f3 != null) {
            f3.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof j1.o ? ((j1.o) customSelectionActionModeCallback).f4624a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0322m c0322m = this.f4810d;
        if (c0322m != null) {
            return c0322m.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0322m c0322m = this.f4810d;
        if (c0322m != null) {
            return c0322m.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        A1.e eVar = this.f4811e.h;
        if (eVar != null) {
            return (ColorStateList) eVar.f213c;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        A1.e eVar = this.f4811e.h;
        if (eVar != null) {
            return (PorterDuff.Mode) eVar.f214d;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        Z.b.E(onCreateInputConnection, editorInfo, this);
        return this.f4812f.p(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0322m c0322m = this.f4810d;
        if (c0322m != null) {
            c0322m.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C0322m c0322m = this.f4810d;
        if (c0322m != null) {
            c0322m.f(i3);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        F f3 = this.f4811e;
        if (f3 != null) {
            f3.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        F f3 = this.f4811e;
        if (f3 != null) {
            f3.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(Z0.d.W(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i3) {
        setDropDownBackgroundDrawable(Z.b.r(getContext(), i3));
    }

    public void setEmojiCompatEnabled(boolean z3) {
        this.f4812f.t(z3);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f4812f.k(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0322m c0322m = this.f4810d;
        if (c0322m != null) {
            c0322m.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0322m c0322m = this.f4810d;
        if (c0322m != null) {
            c0322m.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        F f3 = this.f4811e;
        f3.i(colorStateList);
        f3.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        F f3 = this.f4811e;
        f3.j(mode);
        f3.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        F f3 = this.f4811e;
        if (f3 != null) {
            f3.e(context, i3);
        }
    }
}
