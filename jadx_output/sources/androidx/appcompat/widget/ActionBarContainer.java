package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.ai.assistance.operit.provider.R;
import d1.AbstractC0189K;
import g.AbstractC0262a;
import java.lang.reflect.Field;
import k.AbstractC0344x0;
import k.C0298a;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public boolean f3105d;

    /* renamed from: e, reason: collision with root package name */
    public View f3106e;

    /* renamed from: f, reason: collision with root package name */
    public View f3107f;

    /* renamed from: g, reason: collision with root package name */
    public Drawable f3108g;
    public Drawable h;

    /* renamed from: i, reason: collision with root package name */
    public Drawable f3109i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f3110j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3111k;

    /* renamed from: l, reason: collision with root package name */
    public final int f3112l;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0298a c0298a = new C0298a(this);
        Field field = AbstractC0189K.f4150a;
        setBackground(c0298a);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0262a.f4291a);
        boolean z3 = false;
        this.f3108g = obtainStyledAttributes.getDrawable(0);
        this.h = obtainStyledAttributes.getDrawable(2);
        this.f3112l = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f3110j = true;
            this.f3109i = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f3110j ? !(this.f3108g != null || this.h != null) : this.f3109i == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f3108g;
        if (drawable != null && drawable.isStateful()) {
            this.f3108g.setState(getDrawableState());
        }
        Drawable drawable2 = this.h;
        if (drawable2 != null && drawable2.isStateful()) {
            this.h.setState(getDrawableState());
        }
        Drawable drawable3 = this.f3109i;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f3109i.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f3108g;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.h;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f3109i;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f3106e = findViewById(R.id.action_bar);
        this.f3107f = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f3105d || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        super.onLayout(z3, i3, i4, i5, i6);
        boolean z4 = true;
        if (this.f3110j) {
            Drawable drawable = this.f3109i;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z4 = false;
            }
        } else {
            if (this.f3108g == null) {
                z4 = false;
            } else if (this.f3106e.getVisibility() == 0) {
                this.f3108g.setBounds(this.f3106e.getLeft(), this.f3106e.getTop(), this.f3106e.getRight(), this.f3106e.getBottom());
            } else {
                View view = this.f3107f;
                if (view == null || view.getVisibility() != 0) {
                    this.f3108g.setBounds(0, 0, 0, 0);
                } else {
                    this.f3108g.setBounds(this.f3107f.getLeft(), this.f3107f.getTop(), this.f3107f.getRight(), this.f3107f.getBottom());
                }
            }
            this.f3111k = false;
        }
        if (z4) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i4) {
        int i5;
        if (this.f3106e == null && View.MeasureSpec.getMode(i4) == Integer.MIN_VALUE && (i5 = this.f3112l) >= 0) {
            i4 = View.MeasureSpec.makeMeasureSpec(Math.min(i5, View.MeasureSpec.getSize(i4)), Integer.MIN_VALUE);
        }
        super.onMeasure(i3, i4);
        if (this.f3106e == null) {
            return;
        }
        View.MeasureSpec.getMode(i4);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f3108g;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f3108g);
        }
        this.f3108g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f3106e;
            if (view != null) {
                this.f3108g.setBounds(view.getLeft(), this.f3106e.getTop(), this.f3106e.getRight(), this.f3106e.getBottom());
            }
        }
        boolean z3 = false;
        if (!this.f3110j ? !(this.f3108g != null || this.h != null) : this.f3109i == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f3109i;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f3109i);
        }
        this.f3109i = drawable;
        boolean z3 = this.f3110j;
        boolean z4 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z3 && (drawable2 = this.f3109i) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z3 ? !(this.f3108g != null || this.h != null) : this.f3109i == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.h;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.h);
        }
        this.h = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f3111k && this.h != null) {
                throw null;
            }
        }
        boolean z3 = false;
        if (!this.f3110j ? !(this.f3108g != null || this.h != null) : this.f3109i == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(AbstractC0344x0 abstractC0344x0) {
    }

    public void setTransitioning(boolean z3) {
        this.f3105d = z3;
        setDescendantFocusability(z3 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        super.setVisibility(i3);
        boolean z3 = i3 == 0;
        Drawable drawable = this.f3108g;
        if (drawable != null) {
            drawable.setVisible(z3, false);
        }
        Drawable drawable2 = this.h;
        if (drawable2 != null) {
            drawable2.setVisible(z3, false);
        }
        Drawable drawable3 = this.f3109i;
        if (drawable3 != null) {
            drawable3.setVisible(z3, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f3108g;
        boolean z3 = this.f3110j;
        return (drawable == drawable2 && !z3) || (drawable == this.h && this.f3111k) || ((drawable == this.f3109i && z3) || super.verifyDrawable(drawable));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i3) {
        if (i3 != 0) {
            return super.startActionModeForChild(view, callback, i3);
        }
        return null;
    }
}
