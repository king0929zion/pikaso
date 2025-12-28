package com.google.android.material.appbar;

import J1.a;
import Q0.d;
import a.AbstractC0090a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import d1.AbstractC0189K;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends a {

    /* renamed from: b, reason: collision with root package name */
    public final int f3855b;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    public static void s(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
        }
    }

    @Override // Q0.a
    public final void b(View view) {
    }

    @Override // Q0.a
    public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        Q0.a aVar = ((d) view2.getLayoutParams()).f2174a;
        if (aVar instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            ((AppBarLayout$BaseBehavior) aVar).getClass();
            int i3 = this.f3855b;
            int m2 = bottom - (i3 == 0 ? 0 : AbstractC0090a.m((int) (0.0f * i3), 0, i3));
            Field field = AbstractC0189K.f4150a;
            view.offsetTopAndBottom(m2);
        }
        return false;
    }

    @Override // Q0.a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i3, int i4, int i5) {
        int i6 = view.getLayoutParams().height;
        if (i6 != -1 && i6 != -2) {
            return false;
        }
        s(coordinatorLayout.j(view));
        return false;
    }

    @Override // Q0.a
    public final void l(CoordinatorLayout coordinatorLayout, View view) {
        s(coordinatorLayout.j(view));
    }

    @Override // J1.a
    public final void r(CoordinatorLayout coordinatorLayout, View view, int i3) {
        s(coordinatorLayout.j(view));
        coordinatorLayout.q(view, i3);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        new Rect();
        new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, H1.a.f1348n);
        this.f3855b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }
}
