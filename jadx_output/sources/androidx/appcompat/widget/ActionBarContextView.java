package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ai.assistance.operit.provider.R;
import d1.AbstractC0189K;
import g.AbstractC0262a;
import java.lang.reflect.Field;
import k.Y0;

/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public int f3113d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3114e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3115f;

    /* renamed from: g, reason: collision with root package name */
    public CharSequence f3116g;
    public CharSequence h;

    /* renamed from: i, reason: collision with root package name */
    public View f3117i;

    /* renamed from: j, reason: collision with root package name */
    public LinearLayout f3118j;

    /* renamed from: k, reason: collision with root package name */
    public TextView f3119k;

    /* renamed from: l, reason: collision with root package name */
    public TextView f3120l;

    /* renamed from: m, reason: collision with root package name */
    public final int f3121m;

    /* renamed from: n, reason: collision with root package name */
    public final int f3122n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3123o;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        int resourceId;
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0262a.f4294d, R.attr.actionModeStyle, 0);
        Drawable drawable = (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : Z.b.r(context, resourceId);
        Field field = AbstractC0189K.f4150a;
        setBackground(drawable);
        this.f3121m = obtainStyledAttributes.getResourceId(5, 0);
        this.f3122n = obtainStyledAttributes.getResourceId(4, 0);
        this.f3113d = obtainStyledAttributes.getLayoutDimension(3, 0);
        obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public static int b(View view, int i3, int i4, int i5, boolean z3) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i6 = ((i5 - measuredHeight) / 2) + i4;
        if (z3) {
            view.layout(i3 - measuredWidth, i6, i3, measuredHeight + i6);
        } else {
            view.layout(i3, i6, i3 + measuredWidth, measuredHeight + i6);
        }
        return z3 ? -measuredWidth : measuredWidth;
    }

    public final void a() {
        if (this.f3118j == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f3118j = linearLayout;
            this.f3119k = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f3120l = (TextView) this.f3118j.findViewById(R.id.action_bar_subtitle);
            int i3 = this.f3121m;
            if (i3 != 0) {
                this.f3119k.setTextAppearance(getContext(), i3);
            }
            int i4 = this.f3122n;
            if (i4 != 0) {
                this.f3120l.setTextAppearance(getContext(), i4);
            }
        }
        this.f3119k.setText(this.f3116g);
        this.f3120l.setText(this.h);
        boolean isEmpty = TextUtils.isEmpty(this.f3116g);
        boolean isEmpty2 = TextUtils.isEmpty(this.h);
        this.f3120l.setVisibility(!isEmpty2 ? 0 : 8);
        this.f3118j.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.f3118j.getParent() == null) {
            addView(this.f3118j);
        }
    }

    @Override // android.view.View
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i3) {
        if (i3 != getVisibility()) {
            super.setVisibility(i3);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f3113d;
    }

    public CharSequence getSubtitle() {
        return this.h;
    }

    public CharSequence getTitle() {
        return this.f3116g;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC0262a.f4291a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f3115f = false;
        }
        if (!this.f3115f) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f3115f = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f3115f = false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        boolean a3 = Y0.a(this);
        int paddingRight = a3 ? (i5 - i3) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i6 - i4) - getPaddingTop()) - getPaddingBottom();
        LinearLayout linearLayout = this.f3118j;
        if (linearLayout != null && this.f3117i == null && linearLayout.getVisibility() != 8) {
            paddingRight += b(this.f3118j, paddingRight, paddingTop, paddingTop2, a3);
        }
        View view = this.f3117i;
        if (view != null) {
            b(view, paddingRight, paddingTop, paddingTop2, a3);
        }
        if (a3) {
            getPaddingLeft();
        } else {
            getPaddingRight();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        if (View.MeasureSpec.getMode(i3) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i4) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i3);
        int i5 = this.f3113d;
        if (i5 <= 0) {
            i5 = View.MeasureSpec.getSize(i4);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i6 = i5 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
        LinearLayout linearLayout = this.f3118j;
        if (linearLayout != null && this.f3117i == null) {
            if (this.f3123o) {
                this.f3118j.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f3118j.getMeasuredWidth();
                boolean z3 = measuredWidth <= paddingLeft;
                if (z3) {
                    paddingLeft -= measuredWidth;
                }
                this.f3118j.setVisibility(z3 ? 0 : 8);
            } else {
                linearLayout.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), makeMeasureSpec);
                paddingLeft = Math.max(0, paddingLeft - linearLayout.getMeasuredWidth());
            }
        }
        View view = this.f3117i;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int i7 = layoutParams.width;
            int i8 = i7 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i7 >= 0) {
                paddingLeft = Math.min(i7, paddingLeft);
            }
            int i9 = layoutParams.height;
            int i10 = i9 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i9 >= 0) {
                i6 = Math.min(i9, i6);
            }
            this.f3117i.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i8), View.MeasureSpec.makeMeasureSpec(i6, i10));
        }
        if (this.f3113d > 0) {
            setMeasuredDimension(size, i5);
            return;
        }
        int childCount = getChildCount();
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            int measuredHeight = getChildAt(i12).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i11) {
                i11 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i11);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f3114e = false;
        }
        if (!this.f3114e) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f3114e = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f3114e = false;
        }
        return true;
    }

    public void setContentHeight(int i3) {
        this.f3113d = i3;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f3117i;
        if (view2 != null) {
            removeView(view2);
        }
        this.f3117i = view;
        if (view != null && (linearLayout = this.f3118j) != null) {
            removeView(linearLayout);
            this.f3118j = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.h = charSequence;
        a();
    }

    public void setTitle(CharSequence charSequence) {
        this.f3116g = charSequence;
        a();
        AbstractC0189K.k(this, charSequence);
    }

    public void setTitleOptional(boolean z3) {
        if (z3 != this.f3123o) {
            requestLayout();
        }
        this.f3123o = z3;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
