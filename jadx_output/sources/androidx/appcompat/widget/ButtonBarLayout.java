package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.ai.assistance.operit.provider.R;
import d1.AbstractC0189K;
import g.AbstractC0262a;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public boolean f3159d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3160e;

    /* renamed from: f, reason: collision with root package name */
    public int f3161f;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3161f = -1;
        int[] iArr = AbstractC0262a.f4298i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        AbstractC0189K.i(this, context, iArr, attributeSet, obtainStyledAttributes, 0);
        this.f3159d = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f3159d);
        }
    }

    private void setStacked(boolean z3) {
        if (this.f3160e != z3) {
            if (!z3 || this.f3159d) {
                this.f3160e = z3;
                setOrientation(z3 ? 1 : 0);
                setGravity(z3 ? 8388613 : 80);
                View findViewById = findViewById(R.id.spacer);
                if (findViewById != null) {
                    findViewById.setVisibility(z3 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i3, int i4) {
        int i5;
        boolean z3;
        int i6;
        int size = View.MeasureSpec.getSize(i3);
        int i7 = 0;
        if (this.f3159d) {
            if (size > this.f3161f && this.f3160e) {
                setStacked(false);
            }
            this.f3161f = size;
        }
        if (this.f3160e || View.MeasureSpec.getMode(i3) != 1073741824) {
            i5 = i3;
            z3 = false;
        } else {
            i5 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z3 = true;
        }
        super.onMeasure(i5, i4);
        if (this.f3159d && !this.f3160e && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z3 = true;
        }
        if (z3) {
            super.onMeasure(i3, i4);
        }
        int childCount = getChildCount();
        int i8 = 0;
        while (true) {
            i6 = -1;
            if (i8 >= childCount) {
                i8 = -1;
                break;
            } else if (getChildAt(i8).getVisibility() == 0) {
                break;
            } else {
                i8++;
            }
        }
        if (i8 >= 0) {
            View childAt = getChildAt(i8);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f3160e) {
                int i9 = i8 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i9 >= childCount2) {
                        break;
                    }
                    if (getChildAt(i9).getVisibility() == 0) {
                        i6 = i9;
                        break;
                    }
                    i9++;
                }
                i7 = i6 >= 0 ? getChildAt(i6).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                i7 = getPaddingBottom() + measuredHeight;
            }
        }
        Field field = AbstractC0189K.f4150a;
        if (getMinimumHeight() != i7) {
            setMinimumHeight(i7);
            if (i4 == 0) {
                super.onMeasure(i3, i4);
            }
        }
    }

    public void setAllowStacking(boolean z3) {
        if (this.f3159d != z3) {
            this.f3159d = z3;
            if (!z3 && this.f3160e) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
