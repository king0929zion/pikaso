package com.google.android.material.button;

import A.t;
import N1.a;
import N1.b;
import N1.c;
import S1.k;
import X1.j;
import X1.v;
import a.AbstractC0090a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import b2.AbstractC0139a;
import d1.AbstractC0189K;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedHashSet;
import k.AbstractC0324n;

/* loaded from: classes.dex */
public class MaterialButton extends AbstractC0324n implements Checkable, v {

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f3931u = {R.attr.state_checkable};

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f3932v = {R.attr.state_checked};

    /* renamed from: g, reason: collision with root package name */
    public final c f3933g;
    public final LinkedHashSet h;

    /* renamed from: i, reason: collision with root package name */
    public a f3934i;

    /* renamed from: j, reason: collision with root package name */
    public PorterDuff.Mode f3935j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f3936k;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f3937l;

    /* renamed from: m, reason: collision with root package name */
    public String f3938m;

    /* renamed from: n, reason: collision with root package name */
    public int f3939n;

    /* renamed from: o, reason: collision with root package name */
    public int f3940o;

    /* renamed from: p, reason: collision with root package name */
    public int f3941p;

    /* renamed from: q, reason: collision with root package name */
    public int f3942q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3943r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3944s;

    /* renamed from: t, reason: collision with root package name */
    public int f3945t;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(AbstractC0139a.a(context, attributeSet, com.ai.assistance.operit.provider.R.attr.materialButtonStyle, com.ai.assistance.operit.provider.R.style.Widget_MaterialComponents_Button), attributeSet);
        this.h = new LinkedHashSet();
        this.f3943r = false;
        this.f3944s = false;
        Context context2 = getContext();
        int[] iArr = H1.a.h;
        k.a(context2, attributeSet, com.ai.assistance.operit.provider.R.attr.materialButtonStyle, com.ai.assistance.operit.provider.R.style.Widget_MaterialComponents_Button);
        k.b(context2, attributeSet, iArr, com.ai.assistance.operit.provider.R.attr.materialButtonStyle, com.ai.assistance.operit.provider.R.style.Widget_MaterialComponents_Button, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.ai.assistance.operit.provider.R.attr.materialButtonStyle, com.ai.assistance.operit.provider.R.style.Widget_MaterialComponents_Button);
        this.f3942q = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        int i3 = obtainStyledAttributes.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f3935j = k.f(i3, mode);
        this.f3936k = AbstractC0090a.F(getContext(), obtainStyledAttributes, 14);
        this.f3937l = AbstractC0090a.H(getContext(), obtainStyledAttributes, 10);
        this.f3945t = obtainStyledAttributes.getInteger(11, 1);
        this.f3939n = obtainStyledAttributes.getDimensionPixelSize(13, 0);
        c cVar = new c(this, X1.k.a(context2, attributeSet, com.ai.assistance.operit.provider.R.attr.materialButtonStyle, com.ai.assistance.operit.provider.R.style.Widget_MaterialComponents_Button).a());
        this.f3933g = cVar;
        cVar.f1846c = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        cVar.f1847d = obtainStyledAttributes.getDimensionPixelOffset(2, 0);
        cVar.f1848e = obtainStyledAttributes.getDimensionPixelOffset(3, 0);
        cVar.f1849f = obtainStyledAttributes.getDimensionPixelOffset(4, 0);
        if (obtainStyledAttributes.hasValue(8)) {
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, -1);
            cVar.f1850g = dimensionPixelSize;
            float f3 = dimensionPixelSize;
            j d3 = cVar.f1845b.d();
            d3.f2711e = new X1.a(f3);
            d3.f2712f = new X1.a(f3);
            d3.f2713g = new X1.a(f3);
            d3.h = new X1.a(f3);
            cVar.c(d3.a());
            cVar.f1858p = true;
        }
        cVar.h = obtainStyledAttributes.getDimensionPixelSize(20, 0);
        cVar.f1851i = k.f(obtainStyledAttributes.getInt(7, -1), mode);
        cVar.f1852j = AbstractC0090a.F(getContext(), obtainStyledAttributes, 6);
        cVar.f1853k = AbstractC0090a.F(getContext(), obtainStyledAttributes, 19);
        cVar.f1854l = AbstractC0090a.F(getContext(), obtainStyledAttributes, 16);
        cVar.f1859q = obtainStyledAttributes.getBoolean(5, false);
        cVar.f1862t = obtainStyledAttributes.getDimensionPixelSize(9, 0);
        cVar.f1860r = obtainStyledAttributes.getBoolean(21, true);
        Field field = AbstractC0189K.f4150a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (obtainStyledAttributes.hasValue(0)) {
            cVar.f1857o = true;
            setSupportBackgroundTintList(cVar.f1852j);
            setSupportBackgroundTintMode(cVar.f1851i);
        } else {
            cVar.e();
        }
        setPaddingRelative(paddingStart + cVar.f1846c, paddingTop + cVar.f1848e, paddingEnd + cVar.f1847d, paddingBottom + cVar.f1849f);
        obtainStyledAttributes.recycle();
        setCompoundDrawablePadding(this.f3942q);
        d(this.f3937l != null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f3 = 0.0f;
        for (int i3 = 0; i3 < lineCount; i3++) {
            f3 = Math.max(f3, getLayout().getLineWidth(i3));
        }
        return (int) Math.ceil(f3);
    }

    public final boolean a() {
        c cVar = this.f3933g;
        return cVar != null && cVar.f1859q;
    }

    public final boolean b() {
        c cVar = this.f3933g;
        return (cVar == null || cVar.f1857o) ? false : true;
    }

    public final void c() {
        int i3 = this.f3945t;
        boolean z3 = true;
        if (i3 != 1 && i3 != 2) {
            z3 = false;
        }
        if (z3) {
            setCompoundDrawablesRelative(this.f3937l, null, null, null);
            return;
        }
        if (i3 == 3 || i3 == 4) {
            setCompoundDrawablesRelative(null, null, this.f3937l, null);
        } else if (i3 == 16 || i3 == 32) {
            setCompoundDrawablesRelative(null, this.f3937l, null, null);
        }
    }

    public final void d(boolean z3) {
        Drawable drawable = this.f3937l;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f3937l = mutate;
            W0.a.h(mutate, this.f3936k);
            PorterDuff.Mode mode = this.f3935j;
            if (mode != null) {
                W0.a.i(this.f3937l, mode);
            }
            int i3 = this.f3939n;
            if (i3 == 0) {
                i3 = this.f3937l.getIntrinsicWidth();
            }
            int i4 = this.f3939n;
            if (i4 == 0) {
                i4 = this.f3937l.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f3937l;
            int i5 = this.f3940o;
            int i6 = this.f3941p;
            drawable2.setBounds(i5, i6, i3 + i5, i4 + i6);
            this.f3937l.setVisible(true, z3);
        }
        if (z3) {
            c();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i7 = this.f3945t;
        if (((i7 == 1 || i7 == 2) && drawable3 != this.f3937l) || (((i7 == 3 || i7 == 4) && drawable5 != this.f3937l) || ((i7 == 16 || i7 == 32) && drawable4 != this.f3937l))) {
            c();
        }
    }

    public final void e(int i3, int i4) {
        if (this.f3937l == null || getLayout() == null) {
            return;
        }
        int i5 = this.f3945t;
        if (!(i5 == 1 || i5 == 2) && i5 != 3 && i5 != 4) {
            if (i5 == 16 || i5 == 32) {
                this.f3940o = 0;
                if (i5 == 16) {
                    this.f3941p = 0;
                    d(false);
                    return;
                }
                int i6 = this.f3939n;
                if (i6 == 0) {
                    i6 = this.f3937l.getIntrinsicHeight();
                }
                int max = Math.max(0, (((((i4 - getTextHeight()) - getPaddingTop()) - i6) - this.f3942q) - getPaddingBottom()) / 2);
                if (this.f3941p != max) {
                    this.f3941p = max;
                    d(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f3941p = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i7 = this.f3945t;
        if (i7 == 1 || i7 == 3 || ((i7 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i7 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f3940o = 0;
            d(false);
            return;
        }
        int i8 = this.f3939n;
        if (i8 == 0) {
            i8 = this.f3937l.getIntrinsicWidth();
        }
        int textLayoutWidth = i3 - getTextLayoutWidth();
        Field field = AbstractC0189K.f4150a;
        int paddingEnd = (((textLayoutWidth - getPaddingEnd()) - i8) - this.f3942q) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            paddingEnd /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.f3945t == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.f3940o != paddingEnd) {
            this.f3940o = paddingEnd;
            d(false);
        }
    }

    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.f3938m)) {
            return (a() ? CompoundButton.class : Button.class).getName();
        }
        return this.f3938m;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (b()) {
            return this.f3933g.f1850g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f3937l;
    }

    public int getIconGravity() {
        return this.f3945t;
    }

    public int getIconPadding() {
        return this.f3942q;
    }

    public int getIconSize() {
        return this.f3939n;
    }

    public ColorStateList getIconTint() {
        return this.f3936k;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f3935j;
    }

    public int getInsetBottom() {
        return this.f3933g.f1849f;
    }

    public int getInsetTop() {
        return this.f3933g.f1848e;
    }

    public ColorStateList getRippleColor() {
        if (b()) {
            return this.f3933g.f1854l;
        }
        return null;
    }

    public X1.k getShapeAppearanceModel() {
        if (b()) {
            return this.f3933g.f1845b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (b()) {
            return this.f3933g.f1853k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (b()) {
            return this.f3933g.h;
        }
        return 0;
    }

    @Override // k.AbstractC0324n
    public ColorStateList getSupportBackgroundTintList() {
        return b() ? this.f3933g.f1852j : super.getSupportBackgroundTintList();
    }

    @Override // k.AbstractC0324n
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return b() ? this.f3933g.f1851i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f3943r;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (b()) {
            r2.a.X(this, this.f3933g.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i3) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i3 + 2);
        if (a()) {
            View.mergeDrawableStates(onCreateDrawableState, f3931u);
        }
        if (this.f3943r) {
            View.mergeDrawableStates(onCreateDrawableState, f3932v);
        }
        return onCreateDrawableState;
    }

    @Override // k.AbstractC0324n, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f3943r);
    }

    @Override // k.AbstractC0324n, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(this.f3943r);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // k.AbstractC0324n, android.widget.TextView, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        super.onLayout(z3, i3, i4, i5, i6);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.f4957d);
        setChecked(bVar.f1843f);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f1843f = this.f3943r;
        return bVar;
    }

    @Override // k.AbstractC0324n, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
        super.onTextChanged(charSequence, i3, i4, i5);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f3933g.f1860r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f3937l != null) {
            if (this.f3937l.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f3938m = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i3) {
        if (!b()) {
            super.setBackgroundColor(i3);
            return;
        }
        c cVar = this.f3933g;
        if (cVar.b(false) != null) {
            cVar.b(false).setTint(i3);
        }
    }

    @Override // k.AbstractC0324n, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!b()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        c cVar = this.f3933g;
        cVar.f1857o = true;
        ColorStateList colorStateList = cVar.f1852j;
        MaterialButton materialButton = cVar.f1844a;
        materialButton.setSupportBackgroundTintList(colorStateList);
        materialButton.setSupportBackgroundTintMode(cVar.f1851i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // k.AbstractC0324n, android.view.View
    public void setBackgroundResource(int i3) {
        setBackgroundDrawable(i3 != 0 ? Z.b.r(getContext(), i3) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z3) {
        if (b()) {
            this.f3933g.f1859q = z3;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z3) {
        if (a() && isEnabled() && this.f3943r != z3) {
            this.f3943r = z3;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z4 = this.f3943r;
                if (!materialButtonToggleGroup.f3951i) {
                    materialButtonToggleGroup.b(getId(), z4);
                }
            }
            if (this.f3944s) {
                return;
            }
            this.f3944s = true;
            Iterator it = this.h.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            this.f3944s = false;
        }
    }

    public void setCornerRadius(int i3) {
        if (b()) {
            c cVar = this.f3933g;
            if (cVar.f1858p && cVar.f1850g == i3) {
                return;
            }
            cVar.f1850g = i3;
            cVar.f1858p = true;
            float f3 = i3;
            j d3 = cVar.f1845b.d();
            d3.f2711e = new X1.a(f3);
            d3.f2712f = new X1.a(f3);
            d3.f2713g = new X1.a(f3);
            d3.h = new X1.a(f3);
            cVar.c(d3.a());
        }
    }

    public void setCornerRadiusResource(int i3) {
        if (b()) {
            setCornerRadius(getResources().getDimensionPixelSize(i3));
        }
    }

    @Override // android.view.View
    public void setElevation(float f3) {
        super.setElevation(f3);
        if (b()) {
            this.f3933g.b(false).i(f3);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f3937l != drawable) {
            this.f3937l = drawable;
            d(true);
            e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i3) {
        if (this.f3945t != i3) {
            this.f3945t = i3;
            e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i3) {
        if (this.f3942q != i3) {
            this.f3942q = i3;
            setCompoundDrawablePadding(i3);
        }
    }

    public void setIconResource(int i3) {
        setIcon(i3 != 0 ? Z.b.r(getContext(), i3) : null);
    }

    public void setIconSize(int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f3939n != i3) {
            this.f3939n = i3;
            d(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f3936k != colorStateList) {
            this.f3936k = colorStateList;
            d(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f3935j != mode) {
            this.f3935j = mode;
            d(false);
        }
    }

    public void setIconTintResource(int i3) {
        setIconTint(r2.a.y(getContext(), i3));
    }

    public void setInsetBottom(int i3) {
        c cVar = this.f3933g;
        cVar.d(cVar.f1848e, i3);
    }

    public void setInsetTop(int i3) {
        c cVar = this.f3933g;
        cVar.d(i3, cVar.f1849f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(a aVar) {
        this.f3934i = aVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z3) {
        a aVar = this.f3934i;
        if (aVar != null) {
            ((MaterialButtonToggleGroup) ((t) aVar).f175e).invalidate();
        }
        super.setPressed(z3);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (b()) {
            c cVar = this.f3933g;
            if (cVar.f1854l != colorStateList) {
                cVar.f1854l = colorStateList;
                MaterialButton materialButton = cVar.f1844a;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(V1.a.a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i3) {
        if (b()) {
            setRippleColor(r2.a.y(getContext(), i3));
        }
    }

    @Override // X1.v
    public void setShapeAppearanceModel(X1.k kVar) {
        if (!b()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f3933g.c(kVar);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z3) {
        if (b()) {
            c cVar = this.f3933g;
            cVar.f1856n = z3;
            cVar.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (b()) {
            c cVar = this.f3933g;
            if (cVar.f1853k != colorStateList) {
                cVar.f1853k = colorStateList;
                cVar.f();
            }
        }
    }

    public void setStrokeColorResource(int i3) {
        if (b()) {
            setStrokeColor(r2.a.y(getContext(), i3));
        }
    }

    public void setStrokeWidth(int i3) {
        if (b()) {
            c cVar = this.f3933g;
            if (cVar.h != i3) {
                cVar.h = i3;
                cVar.f();
            }
        }
    }

    public void setStrokeWidthResource(int i3) {
        if (b()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i3));
        }
    }

    @Override // k.AbstractC0324n
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!b()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        c cVar = this.f3933g;
        if (cVar.f1852j != colorStateList) {
            cVar.f1852j = colorStateList;
            if (cVar.b(false) != null) {
                W0.a.h(cVar.b(false), cVar.f1852j);
            }
        }
    }

    @Override // k.AbstractC0324n
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!b()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        c cVar = this.f3933g;
        if (cVar.f1851i != mode) {
            cVar.f1851i = mode;
            if (cVar.b(false) == null || cVar.f1851i == null) {
                return;
            }
            W0.a.i(cVar.b(false), cVar.f1851i);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i3) {
        super.setTextAlignment(i3);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z3) {
        this.f3933g.f1860r = z3;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f3943r);
    }
}
