package com.google.android.material.appbar;

import H1.a;
import S1.k;
import X1.g;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import b2.AbstractC0139a;
import com.ai.assistance.operit.provider.R;
import d1.AbstractC0189K;
import d1.AbstractC0229z;
import j.i;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: b0, reason: collision with root package name */
    public static final ImageView.ScaleType[] f3856b0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: T, reason: collision with root package name */
    public Integer f3857T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f3858U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f3859V;

    /* renamed from: W, reason: collision with root package name */
    public ImageView.ScaleType f3860W;

    /* renamed from: a0, reason: collision with root package name */
    public Boolean f3861a0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(AbstractC0139a.a(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        Context context2 = getContext();
        int[] iArr = a.f1346l;
        k.a(context2, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar);
        k.b(context2, attributeSet, iArr, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar);
        if (obtainStyledAttributes.hasValue(2)) {
            setNavigationIconTint(obtainStyledAttributes.getColor(2, -1));
        }
        this.f3858U = obtainStyledAttributes.getBoolean(4, false);
        this.f3859V = obtainStyledAttributes.getBoolean(3, false);
        int i3 = obtainStyledAttributes.getInt(1, -1);
        if (i3 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f3856b0;
            if (i3 < scaleTypeArr.length) {
                this.f3860W = scaleTypeArr[i3];
            }
        }
        if (obtainStyledAttributes.hasValue(0)) {
            this.f3861a0 = Boolean.valueOf(obtainStyledAttributes.getBoolean(0, false));
        }
        obtainStyledAttributes.recycle();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            g gVar = new g();
            gVar.j(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            gVar.h(context2);
            Field field = AbstractC0189K.f4150a;
            gVar.i(AbstractC0229z.i(this));
            setBackground(gVar);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f3860W;
    }

    public Integer getNavigationIconTint() {
        return this.f3857T;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void m(int i3) {
        Menu menu = getMenu();
        boolean z3 = menu instanceof i;
        if (z3) {
            ((i) menu).s();
        }
        super.m(i3);
        if (z3) {
            ((i) menu).r();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof g) {
            r2.a.X(this, (g) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z3, i3, i4, i5, i6);
        int i7 = 0;
        ImageView imageView2 = null;
        if (this.f3858U || this.f3859V) {
            ArrayList d3 = k.d(this, getTitle());
            boolean isEmpty = d3.isEmpty();
            L0.g gVar = k.f2319c;
            TextView textView = isEmpty ? null : (TextView) Collections.min(d3, gVar);
            ArrayList d4 = k.d(this, getSubtitle());
            TextView textView2 = d4.isEmpty() ? null : (TextView) Collections.max(d4, gVar);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i8 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i9 = 0; i9 < getChildCount(); i9++) {
                    View childAt = getChildAt(i9);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i8 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i8 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f3858U && textView != null) {
                    v(textView, pair);
                }
                if (this.f3859V && textView2 != null) {
                    v(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i7 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i7);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i7++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f3861a0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f3860W;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f3) {
        super.setElevation(f3);
        Drawable background = getBackground();
        if (background instanceof g) {
            ((g) background).i(f3);
        }
    }

    public void setLogoAdjustViewBounds(boolean z3) {
        Boolean bool = this.f3861a0;
        if (bool == null || bool.booleanValue() != z3) {
            this.f3861a0 = Boolean.valueOf(z3);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f3860W != scaleType) {
            this.f3860W = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f3857T != null) {
            drawable = drawable.mutate();
            W0.a.g(drawable, this.f3857T.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i3) {
        this.f3857T = Integer.valueOf(i3);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z3) {
        if (this.f3859V != z3) {
            this.f3859V = z3;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z3) {
        if (this.f3858U != z3) {
            this.f3858U = z3;
            requestLayout();
        }
    }

    public final void v(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i3 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i4 = measuredWidth2 + i3;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i3, 0), Math.max(i4 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i3 += max;
            i4 -= max;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i4 - i3, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i3, textView.getTop(), i4, textView.getBottom());
    }
}
