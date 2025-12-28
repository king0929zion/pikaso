package Z1;

import X1.g;
import X1.k;
import a.AbstractC0090a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import b2.AbstractC0139a;
import com.ai.assistance.operit.provider.R;
import d1.AbstractC0189K;
import d1.AbstractC0227x;
import d1.AbstractC0229z;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public abstract class c extends FrameLayout {

    /* renamed from: l, reason: collision with root package name */
    public static final b f2905l = new b();

    /* renamed from: d, reason: collision with root package name */
    public final k f2906d;

    /* renamed from: e, reason: collision with root package name */
    public int f2907e;

    /* renamed from: f, reason: collision with root package name */
    public final float f2908f;

    /* renamed from: g, reason: collision with root package name */
    public final float f2909g;
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final int f2910i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f2911j;

    /* renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f2912k;

    /* JADX WARN: Multi-variable type inference failed */
    public c(Context context, AttributeSet attributeSet) {
        super(AbstractC0139a.a(context, attributeSet, 0, 0), attributeSet);
        GradientDrawable gradientDrawable;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, H1.a.f1351q);
        if (obtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(6, 0);
            Field field = AbstractC0189K.f4150a;
            AbstractC0229z.s(this, dimensionPixelSize);
        }
        this.f2907e = obtainStyledAttributes.getInt(2, 0);
        if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
            this.f2906d = k.a(context2, attributeSet, 0, 0).a();
        }
        this.f2908f = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(AbstractC0090a.F(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(S1.k.f(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f2909g = obtainStyledAttributes.getFloat(1, 1.0f);
        this.h = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f2910i = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
        setOnTouchListener(f2905l);
        setFocusable(true);
        if (getBackground() == null) {
            int N2 = r2.a.N(getBackgroundOverlayColorAlpha(), r2.a.x(this, R.attr.colorSurface), r2.a.x(this, R.attr.colorOnSurface));
            k kVar = this.f2906d;
            if (kVar != null) {
                int i3 = d.f2913a;
                g gVar = new g(kVar);
                gVar.j(ColorStateList.valueOf(N2));
                gradientDrawable = gVar;
            } else {
                Resources resources = getResources();
                int i4 = d.f2913a;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(N2);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.f2911j;
            if (colorStateList != null) {
                W0.a.h(gradientDrawable, colorStateList);
            }
            Field field2 = AbstractC0189K.f4150a;
            setBackground(gradientDrawable);
        }
    }

    private void setBaseTransientBottomBar(d dVar) {
    }

    public float getActionTextColorAlpha() {
        return this.f2909g;
    }

    public int getAnimationMode() {
        return this.f2907e;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f2908f;
    }

    public int getMaxInlineActionWidth() {
        return this.f2910i;
    }

    public int getMaxWidth() {
        return this.h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Field field = AbstractC0189K.f4150a;
        AbstractC0227x.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        super.onLayout(z3, i3, i4, i5, i6);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i3, int i4) {
        super.onMeasure(i3, i4);
        int i5 = this.h;
        if (i5 <= 0 || getMeasuredWidth() <= i5) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), i4);
    }

    public void setAnimationMode(int i3) {
        this.f2907e = i3;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f2911j != null) {
            drawable = drawable.mutate();
            W0.a.h(drawable, this.f2911j);
            W0.a.i(drawable, this.f2912k);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f2911j = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            W0.a.h(mutate, colorStateList);
            W0.a.i(mutate, this.f2912k);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f2912k = mode;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            W0.a.i(mutate, mode);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f2905l);
        super.setOnClickListener(onClickListener);
    }
}
