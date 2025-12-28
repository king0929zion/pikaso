package com.google.android.material.sidesheet;

import M1.e;
import M1.i;
import Q0.a;
import Q0.d;
import U0.n;
import X1.g;
import X1.j;
import X1.k;
import Y1.c;
import a.AbstractC0090a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.ai.assistance.operit.provider.R;
import com.google.android.material.sidesheet.SideSheetBehavior;
import d1.AbstractC0189K;
import d1.AbstractC0229z;
import e1.s;
import f1.AbstractC0260a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedHashSet;
import n1.C0449e;

/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends a {

    /* renamed from: a, reason: collision with root package name */
    public r2.a f3997a;

    /* renamed from: b, reason: collision with root package name */
    public final g f3998b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f3999c;

    /* renamed from: d, reason: collision with root package name */
    public final k f4000d;

    /* renamed from: e, reason: collision with root package name */
    public final i f4001e;

    /* renamed from: f, reason: collision with root package name */
    public final float f4002f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4003g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public C0449e f4004i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4005j;

    /* renamed from: k, reason: collision with root package name */
    public final float f4006k;

    /* renamed from: l, reason: collision with root package name */
    public int f4007l;

    /* renamed from: m, reason: collision with root package name */
    public int f4008m;

    /* renamed from: n, reason: collision with root package name */
    public int f4009n;

    /* renamed from: o, reason: collision with root package name */
    public int f4010o;

    /* renamed from: p, reason: collision with root package name */
    public WeakReference f4011p;

    /* renamed from: q, reason: collision with root package name */
    public WeakReference f4012q;

    /* renamed from: r, reason: collision with root package name */
    public final int f4013r;

    /* renamed from: s, reason: collision with root package name */
    public VelocityTracker f4014s;

    /* renamed from: t, reason: collision with root package name */
    public int f4015t;

    /* renamed from: u, reason: collision with root package name */
    public final LinkedHashSet f4016u;

    /* renamed from: v, reason: collision with root package name */
    public final e f4017v;

    public SideSheetBehavior() {
        this.f4001e = new i(this);
        this.f4003g = true;
        this.h = 5;
        this.f4006k = 0.1f;
        this.f4013r = -1;
        this.f4016u = new LinkedHashSet();
        this.f4017v = new e(this, 1);
    }

    @Override // Q0.a
    public final void c(d dVar) {
        this.f4011p = null;
        this.f4004i = null;
    }

    @Override // Q0.a
    public final void e() {
        this.f4011p = null;
        this.f4004i = null;
    }

    @Override // Q0.a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        C0449e c0449e;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && AbstractC0189K.b(view) == null) || !this.f4003g) {
            this.f4005j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f4014s) != null) {
            velocityTracker.recycle();
            this.f4014s = null;
        }
        if (this.f4014s == null) {
            this.f4014s = VelocityTracker.obtain();
        }
        this.f4014s.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f4015t = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f4005j) {
            this.f4005j = false;
            return false;
        }
        return (this.f4005j || (c0449e = this.f4004i) == null || !c0449e.p(motionEvent)) ? false : true;
    }

    @Override // Q0.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i3) {
        View view2;
        View view3;
        int i4;
        View findViewById;
        int i5 = 0;
        int i6 = 1;
        g gVar = this.f3998b;
        Field field = AbstractC0189K.f4150a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f4011p == null) {
            this.f4011p = new WeakReference(view);
            Context context = view.getContext();
            AbstractC0090a.b0(context, R.attr.motionEasingStandardDecelerateInterpolator, AbstractC0260a.b(0.0f, 0.0f, 0.0f, 1.0f));
            AbstractC0090a.a0(context, R.attr.motionDurationMedium2, 300);
            AbstractC0090a.a0(context, R.attr.motionDurationShort3, 150);
            AbstractC0090a.a0(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
            if (gVar != null) {
                view.setBackground(gVar);
                float f3 = this.f4002f;
                if (f3 == -1.0f) {
                    f3 = AbstractC0229z.i(view);
                }
                gVar.i(f3);
            } else {
                ColorStateList colorStateList = this.f3999c;
                if (colorStateList != null) {
                    AbstractC0229z.q(view, colorStateList);
                }
            }
            int i7 = this.h == 5 ? 4 : 0;
            if (view.getVisibility() != i7) {
                view.setVisibility(i7);
            }
            u();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (AbstractC0189K.b(view) == null) {
                AbstractC0189K.k(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i8 = Gravity.getAbsoluteGravity(((d) view.getLayoutParams()).f2176c, i3) == 3 ? 1 : 0;
        r2.a aVar = this.f3997a;
        if (aVar == null || aVar.F() != i8) {
            k kVar = this.f4000d;
            d dVar = null;
            if (i8 == 0) {
                this.f3997a = new Y1.a(this, i6);
                if (kVar != null) {
                    WeakReference weakReference = this.f4011p;
                    if (weakReference != null && (view3 = (View) weakReference.get()) != null && (view3.getLayoutParams() instanceof d)) {
                        dVar = (d) view3.getLayoutParams();
                    }
                    if (dVar == null || ((ViewGroup.MarginLayoutParams) dVar).rightMargin <= 0) {
                        j d3 = kVar.d();
                        d3.f2712f = new X1.a(0.0f);
                        d3.f2713g = new X1.a(0.0f);
                        k a3 = d3.a();
                        if (gVar != null) {
                            gVar.setShapeAppearanceModel(a3);
                        }
                    }
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalArgumentException("Invalid sheet edge position value: " + i8 + ". Must be 0 or 1.");
                }
                this.f3997a = new Y1.a(this, i5);
                if (kVar != null) {
                    WeakReference weakReference2 = this.f4011p;
                    if (weakReference2 != null && (view2 = (View) weakReference2.get()) != null && (view2.getLayoutParams() instanceof d)) {
                        dVar = (d) view2.getLayoutParams();
                    }
                    if (dVar == null || ((ViewGroup.MarginLayoutParams) dVar).leftMargin <= 0) {
                        j d4 = kVar.d();
                        d4.f2711e = new X1.a(0.0f);
                        d4.h = new X1.a(0.0f);
                        k a4 = d4.a();
                        if (gVar != null) {
                            gVar.setShapeAppearanceModel(a4);
                        }
                    }
                }
            }
        }
        if (this.f4004i == null) {
            this.f4004i = new C0449e(coordinatorLayout.getContext(), coordinatorLayout, this.f4017v);
        }
        int D3 = this.f3997a.D(view);
        coordinatorLayout.q(view, i3);
        this.f4008m = coordinatorLayout.getWidth();
        this.f4009n = this.f3997a.E(coordinatorLayout);
        this.f4007l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f4010o = marginLayoutParams != null ? this.f3997a.j(marginLayoutParams) : 0;
        int i9 = this.h;
        if (i9 == 1 || i9 == 2) {
            i5 = D3 - this.f3997a.D(view);
        } else if (i9 != 3) {
            if (i9 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.h);
            }
            i5 = this.f3997a.A();
        }
        view.offsetLeftAndRight(i5);
        if (this.f4012q == null && (i4 = this.f4013r) != -1 && (findViewById = coordinatorLayout.findViewById(i4)) != null) {
            this.f4012q = new WeakReference(findViewById);
        }
        Iterator it = this.f4016u.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // Q0.a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i4, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i5, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // Q0.a
    public final void m(View view, Parcelable parcelable) {
        int i3 = ((c) parcelable).f2783f;
        if (i3 == 1 || i3 == 2) {
            i3 = 5;
        }
        this.h = i3;
    }

    @Override // Q0.a
    public final Parcelable n(View view) {
        return new c(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // Q0.a
    public final boolean q(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.h == 1 && actionMasked == 0) {
            return true;
        }
        if (s()) {
            this.f4004i.j(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f4014s) != null) {
            velocityTracker.recycle();
            this.f4014s = null;
        }
        if (this.f4014s == null) {
            this.f4014s = VelocityTracker.obtain();
        }
        this.f4014s.addMovement(motionEvent);
        if (s() && actionMasked == 2 && !this.f4005j && s()) {
            float abs = Math.abs(this.f4015t - motionEvent.getX());
            C0449e c0449e = this.f4004i;
            if (abs > c0449e.f5343b) {
                c0449e.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f4005j;
    }

    public final void r(int i3) {
        View view;
        if (this.h == i3) {
            return;
        }
        this.h = i3;
        WeakReference weakReference = this.f4011p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i4 = this.h == 5 ? 4 : 0;
        if (view.getVisibility() != i4) {
            view.setVisibility(i4);
        }
        Iterator it = this.f4016u.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        u();
    }

    public final boolean s() {
        return this.f4004i != null && (this.f4003g || this.h == 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (r1.o(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
    
        r(2);
        r2.f4001e.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (r3 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            r0 = 3
            if (r4 == r0) goto L19
            r0 = 5
            if (r4 != r0) goto Ld
            r2.a r0 = r2.f3997a
            int r0 = r0.A()
            goto L1f
        Ld:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Invalid state to get outer edge offset: "
            java.lang.String r4 = A.AbstractC0000a.c(r5, r4)
            r3.<init>(r4)
            throw r3
        L19:
            r2.a r0 = r2.f3997a
            int r0 = r0.z()
        L1f:
            n1.e r1 = r2.f4004i
            if (r1 == 0) goto L57
            if (r5 == 0) goto L30
            int r3 = r3.getTop()
            boolean r3 = r1.o(r0, r3)
            if (r3 == 0) goto L57
            goto L4d
        L30:
            int r5 = r3.getTop()
            r1.f5358r = r3
            r3 = -1
            r1.f5344c = r3
            r3 = 0
            boolean r3 = r1.h(r0, r5, r3, r3)
            if (r3 != 0) goto L4b
            int r5 = r1.f5342a
            if (r5 != 0) goto L4b
            android.view.View r5 = r1.f5358r
            if (r5 == 0) goto L4b
            r5 = 0
            r1.f5358r = r5
        L4b:
            if (r3 == 0) goto L57
        L4d:
            r3 = 2
            r2.r(r3)
            M1.i r3 = r2.f4001e
            r3.a(r4)
            goto L5a
        L57:
            r2.r(r4)
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.t(android.view.View, int, boolean):void");
    }

    public final void u() {
        View view;
        WeakReference weakReference = this.f4011p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        AbstractC0189K.g(view, 262144);
        AbstractC0189K.e(view, 0);
        AbstractC0189K.g(view, 1048576);
        AbstractC0189K.e(view, 0);
        final int i3 = 5;
        if (this.h != 5) {
            AbstractC0189K.h(view, e1.e.f4270l, new s() { // from class: Y1.b
                @Override // e1.s
                public final boolean f(View view2) {
                    int i4 = 1;
                    SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                    sideSheetBehavior.getClass();
                    int i5 = i3;
                    if (i5 == 1 || i5 == 2) {
                        StringBuilder sb = new StringBuilder("STATE_");
                        sb.append(i5 == 1 ? "DRAGGING" : "SETTLING");
                        sb.append(" should not be set externally.");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    WeakReference weakReference2 = sideSheetBehavior.f4011p;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.r(i5);
                    } else {
                        View view3 = (View) sideSheetBehavior.f4011p.get();
                        n nVar = new n(i5, i4, sideSheetBehavior);
                        ViewParent parent = view3.getParent();
                        if (parent != null && parent.isLayoutRequested()) {
                            Field field = AbstractC0189K.f4150a;
                            if (view3.isAttachedToWindow()) {
                                view3.post(nVar);
                            }
                        }
                        nVar.run();
                    }
                    return true;
                }
            });
        }
        final int i4 = 3;
        if (this.h != 3) {
            AbstractC0189K.h(view, e1.e.f4268j, new s() { // from class: Y1.b
                @Override // e1.s
                public final boolean f(View view2) {
                    int i42 = 1;
                    SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                    sideSheetBehavior.getClass();
                    int i5 = i4;
                    if (i5 == 1 || i5 == 2) {
                        StringBuilder sb = new StringBuilder("STATE_");
                        sb.append(i5 == 1 ? "DRAGGING" : "SETTLING");
                        sb.append(" should not be set externally.");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    WeakReference weakReference2 = sideSheetBehavior.f4011p;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.r(i5);
                    } else {
                        View view3 = (View) sideSheetBehavior.f4011p.get();
                        n nVar = new n(i5, i42, sideSheetBehavior);
                        ViewParent parent = view3.getParent();
                        if (parent != null && parent.isLayoutRequested()) {
                            Field field = AbstractC0189K.f4150a;
                            if (view3.isAttachedToWindow()) {
                                view3.post(nVar);
                            }
                        }
                        nVar.run();
                    }
                    return true;
                }
            });
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.f4001e = new i(this);
        this.f4003g = true;
        this.h = 5;
        this.f4006k = 0.1f;
        this.f4013r = -1;
        this.f4016u = new LinkedHashSet();
        this.f4017v = new e(this, 1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, H1.a.f1350p);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f3999c = AbstractC0090a.F(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.f4000d = k.a(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.f4013r = resourceId;
            WeakReference weakReference = this.f4012q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f4012q = null;
            WeakReference weakReference2 = this.f4011p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    Field field = AbstractC0189K.f4150a;
                    if (view.isLaidOut()) {
                        view.requestLayout();
                    }
                }
            }
        }
        k kVar = this.f4000d;
        if (kVar != null) {
            g gVar = new g(kVar);
            this.f3998b = gVar;
            gVar.h(context);
            ColorStateList colorStateList = this.f3999c;
            if (colorStateList != null) {
                this.f3998b.j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f3998b.setTint(typedValue.data);
            }
        }
        this.f4002f = obtainStyledAttributes.getDimension(2, -1.0f);
        this.f4003g = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
