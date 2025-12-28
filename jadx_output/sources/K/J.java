package k;

import a.AbstractC0090a;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import b1.C0138c;
import i1.AbstractC0287a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public class J extends TextView {

    /* renamed from: d, reason: collision with root package name */
    public final C0322m f4680d;

    /* renamed from: e, reason: collision with root package name */
    public final F f4681e;

    /* renamed from: f, reason: collision with root package name */
    public final B2.i f4682f;

    /* renamed from: g, reason: collision with root package name */
    public C0337u f4683g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public H f4684i;

    /* renamed from: j, reason: collision with root package name */
    public Future f4685j;

    public J(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private C0337u getEmojiTextViewHelper() {
        if (this.f4683g == null) {
            this.f4683g = new C0337u(this);
        }
        return this.f4683g;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0322m c0322m = this.f4680d;
        if (c0322m != null) {
            c0322m.a();
        }
        F f3 = this.f4681e;
        if (f3 != null) {
            f3.b();
        }
    }

    public final void f() {
        Future future = this.f4685j;
        if (future == null) {
            return;
        }
        try {
            this.f4685j = null;
            if (future.get() != null) {
                throw new ClassCastException();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                throw null;
            }
            Z0.d.z(this);
            throw null;
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (Y0.f4739a) {
            return super.getAutoSizeMaxTextSize();
        }
        F f3 = this.f4681e;
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
        F f3 = this.f4681e;
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
        F f3 = this.f4681e;
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
        F f3 = this.f4681e;
        return f3 != null ? f3.f4643i.f4706f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (Y0.f4739a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        F f3 = this.f4681e;
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

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public G getSuperCaller() {
        if (this.f4684i == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                this.f4684i = new I(this);
            } else {
                this.f4684i = new H(0, this);
            }
        }
        return this.f4684i;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0322m c0322m = this.f4680d;
        if (c0322m != null) {
            return c0322m.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0322m c0322m = this.f4680d;
        if (c0322m != null) {
            return c0322m.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        A1.e eVar = this.f4681e.h;
        if (eVar != null) {
            return (ColorStateList) eVar.f213c;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        A1.e eVar = this.f4681e.h;
        if (eVar != null) {
            return (PorterDuff.Mode) eVar.f214d;
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        f();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        B2.i iVar;
        if (Build.VERSION.SDK_INT >= 28 || (iVar = this.f4682f) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) iVar.f317f;
        return textClassifier == null ? AbstractC0347z.a((TextView) iVar.f316e) : textClassifier;
    }

    public C0138c getTextMetricsParamsCompat() {
        return Z0.d.z(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f4681e.getClass();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 30 && onCreateInputConnection != null) {
            CharSequence text = getText();
            if (i3 >= 30) {
                AbstractC0287a.a(editorInfo, text);
            } else {
                text.getClass();
                if (i3 >= 30) {
                    AbstractC0287a.a(editorInfo, text);
                } else {
                    int i4 = editorInfo.initialSelStart;
                    int i5 = editorInfo.initialSelEnd;
                    int i6 = i4 > i5 ? i5 : i4;
                    if (i4 <= i5) {
                        i4 = i5;
                    }
                    int length = text.length();
                    if (i6 < 0 || i4 > length) {
                        Z0.d.Q(editorInfo, null, 0, 0);
                    } else {
                        int i7 = editorInfo.inputType & 4095;
                        if (i7 == 129 || i7 == 225 || i7 == 18) {
                            Z0.d.Q(editorInfo, null, 0, 0);
                        } else if (length <= 2048) {
                            Z0.d.Q(editorInfo, text, i6, i4);
                        } else {
                            int i8 = i4 - i6;
                            int i9 = i8 > 1024 ? 0 : i8;
                            int i10 = 2048 - i9;
                            int min = Math.min(text.length() - i4, i10 - Math.min(i6, (int) (i10 * 0.8d)));
                            int min2 = Math.min(i6, i10 - min);
                            int i11 = i6 - min2;
                            if (Character.isLowSurrogate(text.charAt(i11))) {
                                i11++;
                                min2--;
                            }
                            if (Character.isHighSurrogate(text.charAt((i4 + min) - 1))) {
                                min--;
                            }
                            int i12 = min2 + i9;
                            Z0.d.Q(editorInfo, i9 != i8 ? TextUtils.concat(text.subSequence(i11, i11 + min2), text.subSequence(i4, min + i4)) : text.subSequence(i11, i12 + min + i11), min2, i12);
                        }
                    }
                }
            }
        }
        Z.b.E(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        super.onLayout(z3, i3, i4, i5, i6);
        F f3 = this.f4681e;
        if (f3 == null || Y0.f4739a) {
            return;
        }
        f3.f4643i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i3, int i4) {
        f();
        super.onMeasure(i3, i4);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
        super.onTextChanged(charSequence, i3, i4, i5);
        F f3 = this.f4681e;
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
        F f3 = this.f4681e;
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
        F f3 = this.f4681e;
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
        F f3 = this.f4681e;
        if (f3 != null) {
            f3.h(i3);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0322m c0322m = this.f4680d;
        if (c0322m != null) {
            c0322m.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C0322m c0322m = this.f4680d;
        if (c0322m != null) {
            c0322m.f(i3);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        F f3 = this.f4681e;
        if (f3 != null) {
            f3.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        F f3 = this.f4681e;
        if (f3 != null) {
            f3.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        F f3 = this.f4681e;
        if (f3 != null) {
            f3.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        F f3 = this.f4681e;
        if (f3 != null) {
            f3.b();
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

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i3) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().i(i3);
        } else {
            Z0.d.N(this, i3);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i3) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().h(i3);
        } else {
            Z0.d.P(this, i3);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i3) {
        Z.b.f(i3);
        if (i3 != getPaint().getFontMetricsInt(null)) {
            setLineSpacing(i3 - r0, 1.0f);
        }
    }

    public void setPrecomputedText(b1.d dVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        Z0.d.z(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0322m c0322m = this.f4680d;
        if (c0322m != null) {
            c0322m.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0322m c0322m = this.f4680d;
        if (c0322m != null) {
            c0322m.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        F f3 = this.f4681e;
        f3.i(colorStateList);
        f3.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        F f3 = this.f4681e;
        f3.j(mode);
        f3.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        F f3 = this.f4681e;
        if (f3 != null) {
            f3.e(context, i3);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        B2.i iVar;
        if (Build.VERSION.SDK_INT >= 28 || (iVar = this.f4682f) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            iVar.f317f = textClassifier;
        }
    }

    public void setTextFuture(Future<b1.d> future) {
        this.f4685j = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C0138c c0138c) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = c0138c.f3653b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i3 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i3 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i3 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i3 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i3 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i3 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i3 = 7;
            }
        }
        setTextDirection(i3);
        getPaint().set(c0138c.f3652a);
        j1.l.e(this, c0138c.f3654c);
        j1.l.h(this, c0138c.f3655d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i3, float f3) {
        boolean z3 = Y0.f4739a;
        if (z3) {
            super.setTextSize(i3, f3);
            return;
        }
        F f4 = this.f4681e;
        if (f4 == null || z3) {
            return;
        }
        Q q3 = f4.f4643i;
        if (q3.f()) {
            return;
        }
        q3.g(i3, f3);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i3) {
        Typeface typeface2;
        if (this.h) {
            return;
        }
        if (typeface == null || i3 <= 0) {
            typeface2 = null;
        } else {
            Context context = getContext();
            AbstractC0090a abstractC0090a = V0.g.f2467a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typeface2 = Typeface.create(typeface, i3);
        }
        this.h = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i3);
        } finally {
            this.h = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        K0.a(context);
        this.h = false;
        this.f4684i = null;
        J0.a(this, getContext());
        C0322m c0322m = new C0322m(this);
        this.f4680d = c0322m;
        c0322m.d(attributeSet, i3);
        F f3 = new F(this);
        this.f4681e = f3;
        f3.d(attributeSet, i3);
        f3.b();
        B2.i iVar = new B2.i(10, false);
        iVar.f316e = this;
        this.f4682f = iVar;
        getEmojiTextViewHelper().a(attributeSet, i3);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i3, int i4, int i5, int i6) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i3 != 0 ? Z.b.r(context, i3) : null, i4 != 0 ? Z.b.r(context, i4) : null, i5 != 0 ? Z.b.r(context, i5) : null, i6 != 0 ? Z.b.r(context, i6) : null);
        F f3 = this.f4681e;
        if (f3 != null) {
            f3.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i3, int i4, int i5, int i6) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i3 != 0 ? Z.b.r(context, i3) : null, i4 != 0 ? Z.b.r(context, i4) : null, i5 != 0 ? Z.b.r(context, i5) : null, i6 != 0 ? Z.b.r(context, i6) : null);
        F f3 = this.f4681e;
        if (f3 != null) {
            f3.b();
        }
    }
}
