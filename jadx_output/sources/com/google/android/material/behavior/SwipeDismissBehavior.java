package com.google.android.material.behavior;

import A.t;
import Q0.a;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import d1.AbstractC0189K;
import e1.e;
import java.lang.reflect.Field;
import n1.C0449e;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends a {

    /* renamed from: a, reason: collision with root package name */
    public C0449e f3869a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3870b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3871c;

    /* renamed from: d, reason: collision with root package name */
    public int f3872d = 2;

    /* renamed from: e, reason: collision with root package name */
    public float f3873e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public float f3874f = 0.5f;

    /* renamed from: g, reason: collision with root package name */
    public final K1.a f3875g = new K1.a(this);

    @Override // Q0.a
    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z3 = this.f3870b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z3 = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f3870b = z3;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f3870b = false;
        }
        if (!z3) {
            return false;
        }
        if (this.f3869a == null) {
            this.f3869a = new C0449e(coordinatorLayout.getContext(), coordinatorLayout, this.f3875g);
        }
        return !this.f3871c && this.f3869a.p(motionEvent);
    }

    @Override // Q0.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i3) {
        Field field = AbstractC0189K.f4150a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            AbstractC0189K.g(view, 1048576);
            AbstractC0189K.e(view, 0);
            if (r(view)) {
                AbstractC0189K.h(view, e.f4270l, new t(8, this));
            }
        }
        return false;
    }

    @Override // Q0.a
    public final boolean q(View view, MotionEvent motionEvent) {
        if (this.f3869a == null) {
            return false;
        }
        if (this.f3871c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f3869a.j(motionEvent);
        return true;
    }

    public boolean r(View view) {
        return true;
    }
}
