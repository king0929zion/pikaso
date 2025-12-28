package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class BaselineLayout extends ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public int f3980d;

    public BaselineLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f3980d = -1;
    }

    @Override // android.view.View
    public int getBaseline() {
        return this.f3980d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = ((i5 - i3) - getPaddingRight()) - paddingLeft;
        int paddingTop = getPaddingTop();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i8 = ((paddingRight - measuredWidth) / 2) + paddingLeft;
                int baseline = (this.f3980d == -1 || childAt.getBaseline() == -1) ? paddingTop : (this.f3980d + paddingTop) - childAt.getBaseline();
                childAt.layout(i8, baseline, measuredWidth + i8, measuredHeight + baseline);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        int childCount = getChildCount();
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = -1;
        int i9 = -1;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i3, i4);
                int baseline = childAt.getBaseline();
                if (baseline != -1) {
                    i8 = Math.max(i8, baseline);
                    i9 = Math.max(i9, childAt.getMeasuredHeight() - baseline);
                }
                i6 = Math.max(i6, childAt.getMeasuredWidth());
                i5 = Math.max(i5, childAt.getMeasuredHeight());
                i7 = View.combineMeasuredStates(i7, childAt.getMeasuredState());
            }
        }
        if (i8 != -1) {
            i5 = Math.max(i5, Math.max(i9, getPaddingBottom()) + i8);
            this.f3980d = i8;
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i6, getSuggestedMinimumWidth()), i3, i7), View.resolveSizeAndState(Math.max(i5, getSuggestedMinimumHeight()), i4, i7 << 16));
    }
}
