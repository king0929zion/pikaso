package k;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import d1.AbstractC0189K;
import g.AbstractC0262a;

/* renamed from: k.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0307e0 extends ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public boolean f4759d;

    /* renamed from: e, reason: collision with root package name */
    public int f4760e;

    /* renamed from: f, reason: collision with root package name */
    public int f4761f;

    /* renamed from: g, reason: collision with root package name */
    public int f4762g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public int f4763i;

    /* renamed from: j, reason: collision with root package name */
    public float f4764j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4765k;

    /* renamed from: l, reason: collision with root package name */
    public int[] f4766l;

    /* renamed from: m, reason: collision with root package name */
    public int[] f4767m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f4768n;

    /* renamed from: o, reason: collision with root package name */
    public int f4769o;

    /* renamed from: p, reason: collision with root package name */
    public int f4770p;

    /* renamed from: q, reason: collision with root package name */
    public int f4771q;

    /* renamed from: r, reason: collision with root package name */
    public int f4772r;

    public AbstractC0307e0(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.f4759d = true;
        this.f4760e = -1;
        this.f4761f = 0;
        this.h = 8388659;
        int[] iArr = AbstractC0262a.f4300k;
        B0.a y3 = B0.a.y(context, attributeSet, iArr, i3);
        AbstractC0189K.i(this, context, iArr, attributeSet, (TypedArray) y3.f272c, i3);
        TypedArray typedArray = (TypedArray) y3.f272c;
        int i4 = typedArray.getInt(1, -1);
        if (i4 >= 0) {
            setOrientation(i4);
        }
        int i5 = typedArray.getInt(0, -1);
        if (i5 >= 0) {
            setGravity(i5);
        }
        boolean z3 = typedArray.getBoolean(2, true);
        if (!z3) {
            setBaselineAligned(z3);
        }
        this.f4764j = typedArray.getFloat(4, -1.0f);
        this.f4760e = typedArray.getInt(3, -1);
        this.f4765k = typedArray.getBoolean(7, false);
        setDividerDrawable(y3.m(5));
        this.f4771q = typedArray.getInt(8, 0);
        this.f4772r = typedArray.getDimensionPixelSize(6, 0);
        y3.C();
    }

    public final void b(Canvas canvas, int i3) {
        this.f4768n.setBounds(getPaddingLeft() + this.f4772r, i3, (getWidth() - getPaddingRight()) - this.f4772r, this.f4770p + i3);
        this.f4768n.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0305d0;
    }

    public final void d(Canvas canvas, int i3) {
        this.f4768n.setBounds(i3, getPaddingTop() + this.f4772r, this.f4769o + i3, (getHeight() - getPaddingBottom()) - this.f4772r);
        this.f4768n.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public C0305d0 generateDefaultLayoutParams() {
        int i3 = this.f4762g;
        if (i3 == 0) {
            return new C0305d0(-2, -2);
        }
        if (i3 == 1) {
            return new C0305d0(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C0305d0 generateLayoutParams(AttributeSet attributeSet) {
        return new C0305d0(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C0305d0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0305d0(layoutParams);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i3;
        if (this.f4760e < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i4 = this.f4760e;
        if (childCount <= i4) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i4);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f4760e == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i5 = this.f4761f;
        if (this.f4762g == 1 && (i3 = this.h & 112) != 48) {
            if (i3 == 16) {
                i5 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f4763i) / 2;
            } else if (i3 == 80) {
                i5 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f4763i;
            }
        }
        return i5 + ((LinearLayout.LayoutParams) ((C0305d0) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f4760e;
    }

    public Drawable getDividerDrawable() {
        return this.f4768n;
    }

    public int getDividerPadding() {
        return this.f4772r;
    }

    public int getDividerWidth() {
        return this.f4769o;
    }

    public int getGravity() {
        return this.h;
    }

    public int getOrientation() {
        return this.f4762g;
    }

    public int getShowDividers() {
        return this.f4771q;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f4764j;
    }

    public final boolean h(int i3) {
        if (i3 == 0) {
            return (this.f4771q & 1) != 0;
        }
        if (i3 == getChildCount()) {
            return (this.f4771q & 4) != 0;
        }
        if ((this.f4771q & 2) == 0) {
            return false;
        }
        for (int i4 = i3 - 1; i4 >= 0; i4--) {
            if (getChildAt(i4).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i3;
        if (this.f4768n == null) {
            return;
        }
        int i4 = 0;
        if (this.f4762g == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i4 < virtualChildCount) {
                View childAt = getChildAt(i4);
                if (childAt != null && childAt.getVisibility() != 8 && h(i4)) {
                    b(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((C0305d0) childAt.getLayoutParams())).topMargin) - this.f4770p);
                }
                i4++;
            }
            if (h(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                b(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f4770p : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((C0305d0) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean a3 = Y0.a(this);
        while (i4 < virtualChildCount2) {
            View childAt3 = getChildAt(i4);
            if (childAt3 != null && childAt3.getVisibility() != 8 && h(i4)) {
                C0305d0 c0305d0 = (C0305d0) childAt3.getLayoutParams();
                d(canvas, a3 ? childAt3.getRight() + ((LinearLayout.LayoutParams) c0305d0).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) c0305d0).leftMargin) - this.f4769o);
            }
            i4++;
        }
        if (h(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                C0305d0 c0305d02 = (C0305d0) childAt4.getLayoutParams();
                if (a3) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) c0305d02).leftMargin;
                    i3 = this.f4769o;
                    right = left - i3;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) c0305d02).rightMargin;
                }
            } else if (a3) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i3 = this.f4769o;
                right = left - i3;
            }
            d(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018c  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r24, int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k.AbstractC0307e0.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x02e0, code lost:
    
        if (((android.widget.LinearLayout.LayoutParams) r13).width == (-1)) goto L148;
     */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0860  */
    /* JADX WARN: Removed duplicated region for block: B:352:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x06b4  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r38, int r39) {
        /*
            Method dump skipped, instructions count: 2208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k.AbstractC0307e0.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z3) {
        this.f4759d = z3;
    }

    public void setBaselineAlignedChildIndex(int i3) {
        if (i3 >= 0 && i3 < getChildCount()) {
            this.f4760e = i3;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f4768n) {
            return;
        }
        this.f4768n = drawable;
        if (drawable != null) {
            this.f4769o = drawable.getIntrinsicWidth();
            this.f4770p = drawable.getIntrinsicHeight();
        } else {
            this.f4769o = 0;
            this.f4770p = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i3) {
        this.f4772r = i3;
    }

    public void setGravity(int i3) {
        if (this.h != i3) {
            if ((8388615 & i3) == 0) {
                i3 |= 8388611;
            }
            if ((i3 & 112) == 0) {
                i3 |= 48;
            }
            this.h = i3;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i3) {
        int i4 = i3 & 8388615;
        int i5 = this.h;
        if ((8388615 & i5) != i4) {
            this.h = i4 | ((-8388616) & i5);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z3) {
        this.f4765k = z3;
    }

    public void setOrientation(int i3) {
        if (this.f4762g != i3) {
            this.f4762g = i3;
            requestLayout();
        }
    }

    public void setShowDividers(int i3) {
        if (i3 != this.f4771q) {
            requestLayout();
        }
        this.f4771q = i3;
    }

    public void setVerticalGravity(int i3) {
        int i4 = i3 & 112;
        int i5 = this.h;
        if ((i5 & 112) != i4) {
            this.h = i4 | (i5 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f3) {
        this.f4764j = Math.max(0.0f, f3);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
