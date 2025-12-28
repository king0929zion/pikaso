package com.google.android.material.behavior;

import D1.l;
import Q0.a;
import a.AbstractC0090a;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.ai.assistance.operit.provider.R;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends a {

    /* renamed from: b, reason: collision with root package name */
    public int f3863b;

    /* renamed from: c, reason: collision with root package name */
    public int f3864c;

    /* renamed from: d, reason: collision with root package name */
    public TimeInterpolator f3865d;

    /* renamed from: e, reason: collision with root package name */
    public TimeInterpolator f3866e;
    public ViewPropertyAnimator h;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f3862a = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public int f3867f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f3868g = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // Q0.a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i3) {
        this.f3867f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f3863b = AbstractC0090a.a0(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f3864c = AbstractC0090a.a0(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f3865d = AbstractC0090a.b0(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, I1.a.f1393d);
        this.f3866e = AbstractC0090a.b0(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, I1.a.f1392c);
        return false;
    }

    @Override // Q0.a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i3, int i4, int i5, int[] iArr) {
        LinkedHashSet linkedHashSet = this.f3862a;
        if (i3 > 0) {
            if (this.f3868g == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.h;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f3868g = 1;
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            this.h = view.animate().translationY(this.f3867f).setInterpolator(this.f3866e).setDuration(this.f3864c).setListener(new l(1, this));
            return;
        }
        if (i3 >= 0 || this.f3868g == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.h;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.f3868g = 2;
        Iterator it2 = linkedHashSet.iterator();
        if (it2.hasNext()) {
            it2.next().getClass();
            throw new ClassCastException();
        }
        this.h = view.animate().translationY(0).setInterpolator(this.f3865d).setDuration(this.f3863b).setListener(new l(1, this));
    }

    @Override // Q0.a
    public boolean o(View view, int i3, int i4) {
        return i3 == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
