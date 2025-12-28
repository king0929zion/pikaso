package S1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import k.AbstractC0307e0;

/* loaded from: classes.dex */
public abstract class d extends AbstractC0307e0 {

    /* renamed from: s, reason: collision with root package name */
    public Drawable f2295s;

    /* renamed from: t, reason: collision with root package name */
    public final Rect f2296t;

    /* renamed from: u, reason: collision with root package name */
    public final Rect f2297u;

    /* renamed from: v, reason: collision with root package name */
    public int f2298v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f2299w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2300x;

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f2296t = new Rect();
        this.f2297u = new Rect();
        this.f2298v = 119;
        this.f2299w = true;
        this.f2300x = false;
        int[] iArr = H1.a.f1342g;
        k.a(context, attributeSet, 0, 0);
        k.b(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f2298v = obtainStyledAttributes.getInt(1, this.f2298v);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f2299w = obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f2295s;
        if (drawable != null) {
            if (this.f2300x) {
                this.f2300x = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z3 = this.f2299w;
                Rect rect = this.f2296t;
                if (z3) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i3 = this.f2298v;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f2297u;
                Gravity.apply(i3, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f3, float f4) {
        super.drawableHotspotChanged(f3, f4);
        Drawable drawable = this.f2295s;
        if (drawable != null) {
            drawable.setHotspot(f3, f4);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f2295s;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f2295s.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f2295s;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f2298v;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2295s;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // k.AbstractC0307e0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        super.onLayout(z3, i3, i4, i5, i6);
        this.f2300x = z3 | this.f2300x;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i4, int i5, int i6) {
        super.onSizeChanged(i3, i4, i5, i6);
        this.f2300x = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f2295s;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f2295s);
            }
            this.f2295s = drawable;
            this.f2300x = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f2298v == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i3) {
        if (this.f2298v != i3) {
            if ((8388615 & i3) == 0) {
                i3 |= 8388611;
            }
            if ((i3 & 112) == 0) {
                i3 |= 48;
            }
            this.f2298v = i3;
            if (i3 == 119 && this.f2295s != null) {
                this.f2295s.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f2295s;
    }
}
