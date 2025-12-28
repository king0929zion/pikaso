package com.google.android.material.bottomsheet;

import A.AbstractC0000a;
import I.m;
import M1.b;
import M1.c;
import M1.e;
import M1.i;
import M1.j;
import Q0.a;
import Q0.d;
import S1.l;
import X1.f;
import X1.g;
import X1.k;
import a.AbstractC0090a;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.ai.assistance.operit.provider.R;
import d1.AbstractC0189K;
import d1.AbstractC0227x;
import d1.AbstractC0229z;
import d1.C0197T;
import d1.C0198U;
import d1.C0204a;
import d1.C0205b;
import d1.ViewOnApplyWindowInsetsListenerC0196S;
import f1.AbstractC0260a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import n1.C0449e;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends a {

    /* renamed from: A, reason: collision with root package name */
    public final i f3876A;

    /* renamed from: B, reason: collision with root package name */
    public final ValueAnimator f3877B;

    /* renamed from: C, reason: collision with root package name */
    public final int f3878C;

    /* renamed from: D, reason: collision with root package name */
    public int f3879D;

    /* renamed from: E, reason: collision with root package name */
    public int f3880E;

    /* renamed from: F, reason: collision with root package name */
    public final float f3881F;

    /* renamed from: G, reason: collision with root package name */
    public int f3882G;

    /* renamed from: H, reason: collision with root package name */
    public final float f3883H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f3884I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f3885J;

    /* renamed from: K, reason: collision with root package name */
    public final boolean f3886K;

    /* renamed from: L, reason: collision with root package name */
    public int f3887L;

    /* renamed from: M, reason: collision with root package name */
    public C0449e f3888M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f3889N;

    /* renamed from: O, reason: collision with root package name */
    public int f3890O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f3891P;

    /* renamed from: Q, reason: collision with root package name */
    public final float f3892Q;

    /* renamed from: R, reason: collision with root package name */
    public int f3893R;

    /* renamed from: S, reason: collision with root package name */
    public int f3894S;

    /* renamed from: T, reason: collision with root package name */
    public int f3895T;

    /* renamed from: U, reason: collision with root package name */
    public WeakReference f3896U;

    /* renamed from: V, reason: collision with root package name */
    public WeakReference f3897V;

    /* renamed from: W, reason: collision with root package name */
    public final ArrayList f3898W;

    /* renamed from: X, reason: collision with root package name */
    public VelocityTracker f3899X;

    /* renamed from: Y, reason: collision with root package name */
    public int f3900Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f3901Z;

    /* renamed from: a, reason: collision with root package name */
    public final int f3902a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f3903a0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3904b;

    /* renamed from: b0, reason: collision with root package name */
    public HashMap f3905b0;

    /* renamed from: c, reason: collision with root package name */
    public final float f3906c;

    /* renamed from: c0, reason: collision with root package name */
    public final SparseIntArray f3907c0;

    /* renamed from: d, reason: collision with root package name */
    public final int f3908d;

    /* renamed from: d0, reason: collision with root package name */
    public final e f3909d0;

    /* renamed from: e, reason: collision with root package name */
    public int f3910e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3911f;

    /* renamed from: g, reason: collision with root package name */
    public int f3912g;
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final g f3913i;

    /* renamed from: j, reason: collision with root package name */
    public final ColorStateList f3914j;

    /* renamed from: k, reason: collision with root package name */
    public final int f3915k;

    /* renamed from: l, reason: collision with root package name */
    public final int f3916l;

    /* renamed from: m, reason: collision with root package name */
    public int f3917m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f3918n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f3919o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f3920p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f3921q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f3922r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f3923s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f3924t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f3925u;

    /* renamed from: v, reason: collision with root package name */
    public int f3926v;

    /* renamed from: w, reason: collision with root package name */
    public int f3927w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f3928x;

    /* renamed from: y, reason: collision with root package name */
    public final k f3929y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f3930z;

    public BottomSheetBehavior() {
        this.f3902a = 0;
        this.f3904b = true;
        this.f3915k = -1;
        this.f3916l = -1;
        this.f3876A = new i(this);
        this.f3881F = 0.5f;
        this.f3883H = -1.0f;
        this.f3886K = true;
        this.f3887L = 4;
        this.f3892Q = 0.1f;
        this.f3898W = new ArrayList();
        this.f3901Z = -1;
        this.f3907c0 = new SparseIntArray();
        this.f3909d0 = new e(this, 0);
    }

    public static View v(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        Field field = AbstractC0189K.f4150a;
        if (AbstractC0229z.p(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View v3 = v(viewGroup.getChildAt(i3));
                if (v3 != null) {
                    return v3;
                }
            }
        }
        return null;
    }

    public static int w(int i3, int i4, int i5, int i6) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, i4, i6);
        if (i5 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i5), 1073741824);
        }
        if (size != 0) {
            i5 = Math.min(size, i5);
        }
        return View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
    }

    public final void A(int i3) {
        if (i3 == -1) {
            if (this.f3911f) {
                return;
            } else {
                this.f3911f = true;
            }
        } else {
            if (!this.f3911f && this.f3910e == i3) {
                return;
            }
            this.f3911f = false;
            this.f3910e = Math.max(0, i3);
        }
        I();
    }

    public final void B(int i3) {
        if (i3 == 1 || i3 == 2) {
            StringBuilder sb = new StringBuilder("STATE_");
            sb.append(i3 == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        if (!this.f3884I && i3 == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i3);
            return;
        }
        int i4 = (i3 == 6 && this.f3904b && y(i3) <= this.f3879D) ? 3 : i3;
        WeakReference weakReference = this.f3896U;
        if (weakReference == null || weakReference.get() == null) {
            C(i3);
            return;
        }
        View view = (View) this.f3896U.get();
        b bVar = new b(this, view, i4);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            Field field = AbstractC0189K.f4150a;
            if (view.isAttachedToWindow()) {
                view.post(bVar);
                return;
            }
        }
        bVar.run();
    }

    public final void C(int i3) {
        if (this.f3887L == i3) {
            return;
        }
        this.f3887L = i3;
        if (i3 != 4 && i3 != 3 && i3 != 6) {
            boolean z3 = this.f3884I;
        }
        WeakReference weakReference = this.f3896U;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i3 == 3) {
            H(true);
        } else if (i3 == 6 || i3 == 5 || i3 == 4) {
            H(false);
        }
        G(i3, true);
        ArrayList arrayList = this.f3898W;
        if (arrayList.size() <= 0) {
            F();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final boolean D(View view, float f3) {
        if (this.f3885J) {
            return true;
        }
        if (view.getTop() < this.f3882G) {
            return false;
        }
        return Math.abs(((f3 * this.f3892Q) + ((float) view.getTop())) - ((float) this.f3882G)) / ((float) t()) > 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r1.o(r3.getLeft(), r0) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0032, code lost:
    
        C(2);
        G(r4, true);
        r2.f3876A.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            int r0 = r2.y(r4)
            n1.e r1 = r2.f3888M
            if (r1 == 0) goto L40
            if (r5 == 0) goto L15
            int r3 = r3.getLeft()
            boolean r3 = r1.o(r3, r0)
            if (r3 == 0) goto L40
            goto L32
        L15:
            int r5 = r3.getLeft()
            r1.f5358r = r3
            r3 = -1
            r1.f5344c = r3
            r3 = 0
            boolean r3 = r1.h(r5, r0, r3, r3)
            if (r3 != 0) goto L30
            int r5 = r1.f5342a
            if (r5 != 0) goto L30
            android.view.View r5 = r1.f5358r
            if (r5 == 0) goto L30
            r5 = 0
            r1.f5358r = r5
        L30:
            if (r3 == 0) goto L40
        L32:
            r3 = 2
            r2.C(r3)
            r3 = 1
            r2.G(r4, r3)
            M1.i r3 = r2.f3876A
            r3.a(r4)
            goto L43
        L40:
            r2.C(r4)
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.E(android.view.View, int, boolean):void");
    }

    public final void F() {
        View view;
        int i3;
        WeakReference weakReference = this.f3896U;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        AbstractC0189K.g(view, 524288);
        AbstractC0189K.e(view, 0);
        AbstractC0189K.g(view, 262144);
        AbstractC0189K.e(view, 0);
        AbstractC0189K.g(view, 1048576);
        AbstractC0189K.e(view, 0);
        SparseIntArray sparseIntArray = this.f3907c0;
        int i4 = sparseIntArray.get(0, -1);
        if (i4 != -1) {
            AbstractC0189K.g(view, i4);
            AbstractC0189K.e(view, 0);
            sparseIntArray.delete(0);
        }
        if (!this.f3904b && this.f3887L != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            m mVar = new m(r5, 1, this);
            ArrayList c3 = AbstractC0189K.c(view);
            int i5 = 0;
            while (true) {
                if (i5 >= c3.size()) {
                    int i6 = -1;
                    for (int i7 = 0; i7 < 32 && i6 == -1; i7++) {
                        int i8 = AbstractC0189K.f4152c[i7];
                        boolean z3 = true;
                        for (int i9 = 0; i9 < c3.size(); i9++) {
                            z3 &= ((e1.e) c3.get(i9)).a() != i8;
                        }
                        if (z3) {
                            i6 = i8;
                        }
                    }
                    i3 = i6;
                } else {
                    if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((e1.e) c3.get(i5)).f4273a).getLabel())) {
                        i3 = ((e1.e) c3.get(i5)).a();
                        break;
                    }
                    i5++;
                }
            }
            if (i3 != -1) {
                e1.e eVar = new e1.e(null, i3, string, mVar, null);
                View.AccessibilityDelegate a3 = AbstractC0189K.a(view);
                C0205b c0205b = a3 == null ? null : a3 instanceof C0204a ? ((C0204a) a3).f4185a : new C0205b(a3);
                if (c0205b == null) {
                    c0205b = new C0205b();
                }
                AbstractC0189K.j(view, c0205b);
                AbstractC0189K.g(view, eVar.a());
                AbstractC0189K.c(view).add(eVar);
                AbstractC0189K.e(view, 0);
            }
            sparseIntArray.put(0, i3);
        }
        if (this.f3884I) {
            int i10 = 5;
            if (this.f3887L != 5) {
                AbstractC0189K.h(view, e1.e.f4270l, new m(i10, 1, this));
            }
        }
        int i11 = this.f3887L;
        int i12 = 4;
        int i13 = 3;
        if (i11 == 3) {
            AbstractC0189K.h(view, e1.e.f4269k, new m(this.f3904b ? 4 : 6, 1, this));
            return;
        }
        if (i11 == 4) {
            AbstractC0189K.h(view, e1.e.f4268j, new m(this.f3904b ? 3 : 6, 1, this));
        } else {
            if (i11 != 6) {
                return;
            }
            AbstractC0189K.h(view, e1.e.f4269k, new m(i12, 1, this));
            AbstractC0189K.h(view, e1.e.f4268j, new m(i13, 1, this));
        }
    }

    public final void G(int i3, boolean z3) {
        g gVar = this.f3913i;
        ValueAnimator valueAnimator = this.f3877B;
        if (i3 == 2) {
            return;
        }
        boolean z4 = this.f3887L == 3 && (this.f3928x || z());
        if (this.f3930z == z4 || gVar == null) {
            return;
        }
        this.f3930z = z4;
        if (z3 && valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            } else {
                valueAnimator.setFloatValues(gVar.f2685d.f2676i, z4 ? s() : 1.0f);
                valueAnimator.start();
                return;
            }
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        float s3 = this.f3930z ? s() : 1.0f;
        f fVar = gVar.f2685d;
        if (fVar.f2676i != s3) {
            fVar.f2676i = s3;
            gVar.h = true;
            gVar.invalidateSelf();
        }
    }

    public final void H(boolean z3) {
        WeakReference weakReference = this.f3896U;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z3) {
                if (this.f3905b0 != null) {
                    return;
                } else {
                    this.f3905b0 = new HashMap(childCount);
                }
            }
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = coordinatorLayout.getChildAt(i3);
                if (childAt != this.f3896U.get() && z3) {
                    this.f3905b0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z3) {
                return;
            }
            this.f3905b0 = null;
        }
    }

    public final void I() {
        View view;
        if (this.f3896U != null) {
            r();
            if (this.f3887L != 4 || (view = (View) this.f3896U.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // Q0.a
    public final void c(d dVar) {
        this.f3896U = null;
        this.f3888M = null;
    }

    @Override // Q0.a
    public final void e() {
        this.f3896U = null;
        this.f3888M = null;
    }

    @Override // Q0.a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i3;
        C0449e c0449e;
        if (!view.isShown() || !this.f3886K) {
            this.f3889N = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f3900Y = -1;
            this.f3901Z = -1;
            VelocityTracker velocityTracker = this.f3899X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f3899X = null;
            }
        }
        if (this.f3899X == null) {
            this.f3899X = VelocityTracker.obtain();
        }
        this.f3899X.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x3 = (int) motionEvent.getX();
            this.f3901Z = (int) motionEvent.getY();
            if (this.f3887L != 2) {
                WeakReference weakReference = this.f3897V;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.o(view2, x3, this.f3901Z)) {
                    this.f3900Y = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f3903a0 = true;
                }
            }
            this.f3889N = this.f3900Y == -1 && !coordinatorLayout.o(view, x3, this.f3901Z);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f3903a0 = false;
            this.f3900Y = -1;
            if (this.f3889N) {
                this.f3889N = false;
                return false;
            }
        }
        if (!this.f3889N && (c0449e = this.f3888M) != null && c0449e.p(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.f3897V;
        View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
        return (actionMasked != 2 || view3 == null || this.f3889N || this.f3887L == 1 || coordinatorLayout.o(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f3888M == null || (i3 = this.f3901Z) == -1 || Math.abs(((float) i3) - motionEvent.getY()) <= ((float) this.f3888M.f5343b)) ? false : true;
    }

    @Override // Q0.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i3) {
        int i4 = this.f3916l;
        g gVar = this.f3913i;
        int i5 = 4;
        Field field = AbstractC0189K.f4150a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f3896U == null) {
            this.f3912g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            int i6 = Build.VERSION.SDK_INT;
            boolean z3 = (i6 < 29 || this.f3918n || this.f3911f) ? false : true;
            if (this.f3919o || this.f3920p || this.f3921q || this.f3923s || this.f3924t || this.f3925u || z3) {
                M1.d dVar = new M1.d(this, z3);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                S1.m mVar = new S1.m();
                mVar.f2320a = paddingStart;
                mVar.f2321b = paddingEnd;
                mVar.f2322c = paddingBottom;
                AbstractC0229z.u(view, new B2.i(dVar, i5, mVar));
                if (view.isAttachedToWindow()) {
                    AbstractC0227x.c(view);
                } else {
                    view.addOnAttachStateChangeListener(new l());
                }
            }
            j jVar = new j();
            jVar.f1696b = new int[2];
            jVar.f1699e = view;
            if (i6 >= 30) {
                view.setWindowInsetsAnimationCallback(new C0198U(jVar));
            } else {
                PathInterpolator pathInterpolator = C0197T.f4163e;
                Object tag = view.getTag(R.id.tag_on_apply_window_listener);
                View.OnApplyWindowInsetsListener viewOnApplyWindowInsetsListenerC0196S = new ViewOnApplyWindowInsetsListenerC0196S(view, jVar);
                view.setTag(R.id.tag_window_insets_animation_callback, viewOnApplyWindowInsetsListenerC0196S);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(viewOnApplyWindowInsetsListenerC0196S);
                }
            }
            this.f3896U = new WeakReference(view);
            Context context = view.getContext();
            AbstractC0090a.b0(context, R.attr.motionEasingStandardDecelerateInterpolator, AbstractC0260a.b(0.0f, 0.0f, 0.0f, 1.0f));
            AbstractC0090a.a0(context, R.attr.motionDurationMedium2, 300);
            AbstractC0090a.a0(context, R.attr.motionDurationShort3, 150);
            AbstractC0090a.a0(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
            if (gVar != null) {
                view.setBackground(gVar);
                float f3 = this.f3883H;
                if (f3 == -1.0f) {
                    f3 = AbstractC0229z.i(view);
                }
                gVar.i(f3);
            } else {
                ColorStateList colorStateList = this.f3914j;
                if (colorStateList != null) {
                    AbstractC0229z.q(view, colorStateList);
                }
            }
            F();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.f3888M == null) {
            this.f3888M = new C0449e(coordinatorLayout.getContext(), coordinatorLayout, this.f3909d0);
        }
        int top = view.getTop();
        coordinatorLayout.q(view, i3);
        this.f3894S = coordinatorLayout.getWidth();
        this.f3895T = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f3893R = height;
        int i7 = this.f3895T;
        int i8 = i7 - height;
        int i9 = this.f3927w;
        if (i8 < i9) {
            if (this.f3922r) {
                if (i4 != -1) {
                    i7 = Math.min(i7, i4);
                }
                this.f3893R = i7;
            } else {
                int i10 = i7 - i9;
                if (i4 != -1) {
                    i10 = Math.min(i10, i4);
                }
                this.f3893R = i10;
            }
        }
        this.f3879D = Math.max(0, this.f3895T - this.f3893R);
        this.f3880E = (int) ((1.0f - this.f3881F) * this.f3895T);
        r();
        int i11 = this.f3887L;
        if (i11 == 3) {
            view.offsetTopAndBottom(x());
        } else if (i11 == 6) {
            view.offsetTopAndBottom(this.f3880E);
        } else if (this.f3884I && i11 == 5) {
            view.offsetTopAndBottom(this.f3895T);
        } else if (i11 == 4) {
            view.offsetTopAndBottom(this.f3882G);
        } else if (i11 == 1 || i11 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        G(this.f3887L, false);
        this.f3897V = new WeakReference(v(view));
        ArrayList arrayList = this.f3898W;
        if (arrayList.size() <= 0) {
            return true;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // Q0.a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(w(i3, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i4, this.f3915k, marginLayoutParams.width), w(i5, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f3916l, marginLayoutParams.height));
        return true;
    }

    @Override // Q0.a
    public final boolean i(View view) {
        WeakReference weakReference = this.f3897V;
        return (weakReference == null || view != weakReference.get() || this.f3887L == 3) ? false : true;
    }

    @Override // Q0.a
    public final void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i3, int i4, int[] iArr, int i5) {
        boolean z3 = this.f3886K;
        if (i5 == 1) {
            return;
        }
        WeakReference weakReference = this.f3897V;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i6 = top - i4;
        if (i4 > 0) {
            if (i6 < x()) {
                int x3 = top - x();
                iArr[1] = x3;
                Field field = AbstractC0189K.f4150a;
                view.offsetTopAndBottom(-x3);
                C(3);
            } else {
                if (!z3) {
                    return;
                }
                iArr[1] = i4;
                Field field2 = AbstractC0189K.f4150a;
                view.offsetTopAndBottom(-i4);
                C(1);
            }
        } else if (i4 < 0 && !view2.canScrollVertically(-1)) {
            int i7 = this.f3882G;
            if (i6 > i7 && !this.f3884I) {
                int i8 = top - i7;
                iArr[1] = i8;
                Field field3 = AbstractC0189K.f4150a;
                view.offsetTopAndBottom(-i8);
                C(4);
            } else {
                if (!z3) {
                    return;
                }
                iArr[1] = i4;
                Field field4 = AbstractC0189K.f4150a;
                view.offsetTopAndBottom(-i4);
                C(1);
            }
        }
        u(view.getTop());
        this.f3890O = i4;
        this.f3891P = true;
    }

    @Override // Q0.a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i3, int i4, int i5, int[] iArr) {
    }

    @Override // Q0.a
    public final void m(View view, Parcelable parcelable) {
        M1.g gVar = (M1.g) parcelable;
        int i3 = this.f3902a;
        if (i3 != 0) {
            if (i3 == -1 || (i3 & 1) == 1) {
                this.f3910e = gVar.f1685g;
            }
            if (i3 == -1 || (i3 & 2) == 2) {
                this.f3904b = gVar.h;
            }
            if (i3 == -1 || (i3 & 4) == 4) {
                this.f3884I = gVar.f1686i;
            }
            if (i3 == -1 || (i3 & 8) == 8) {
                this.f3885J = gVar.f1687j;
            }
        }
        int i4 = gVar.f1684f;
        if (i4 == 1 || i4 == 2) {
            this.f3887L = 4;
        } else {
            this.f3887L = i4;
        }
    }

    @Override // Q0.a
    public final Parcelable n(View view) {
        return new M1.g(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // Q0.a
    public final boolean o(View view, int i3, int i4) {
        this.f3890O = 0;
        this.f3891P = false;
        return (i3 & 2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r4.getTop() <= r3.f3880E) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        if (java.lang.Math.abs(r5 - r3.f3879D) < java.lang.Math.abs(r5 - r3.f3882G)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0080, code lost:
    
        if (r5 < java.lang.Math.abs(r5 - r3.f3882G)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
    
        if (java.lang.Math.abs(r5 - r2) < java.lang.Math.abs(r5 - r3.f3882G)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ac, code lost:
    
        if (java.lang.Math.abs(r5 - r3.f3880E) < java.lang.Math.abs(r5 - r3.f3882G)) goto L50;
     */
    @Override // Q0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(android.view.View r4, android.view.View r5, int r6) {
        /*
            r3 = this;
            int r6 = r4.getTop()
            int r0 = r3.x()
            r1 = 3
            if (r6 != r0) goto Lf
            r3.C(r1)
            return
        Lf:
            java.lang.ref.WeakReference r6 = r3.f3897V
            if (r6 == 0) goto Lb5
            java.lang.Object r6 = r6.get()
            if (r5 != r6) goto Lb5
            boolean r5 = r3.f3891P
            if (r5 != 0) goto L1f
            goto Lb5
        L1f:
            int r5 = r3.f3890O
            r6 = 6
            if (r5 <= 0) goto L34
            boolean r5 = r3.f3904b
            if (r5 == 0) goto L2a
            goto Laf
        L2a:
            int r5 = r4.getTop()
            int r0 = r3.f3880E
            if (r5 <= r0) goto Laf
            goto Lae
        L34:
            boolean r5 = r3.f3884I
            if (r5 == 0) goto L55
            android.view.VelocityTracker r5 = r3.f3899X
            if (r5 != 0) goto L3e
            r5 = 0
            goto L4d
        L3e:
            r0 = 1000(0x3e8, float:1.401E-42)
            float r2 = r3.f3906c
            r5.computeCurrentVelocity(r0, r2)
            android.view.VelocityTracker r5 = r3.f3899X
            int r0 = r3.f3900Y
            float r5 = r5.getYVelocity(r0)
        L4d:
            boolean r5 = r3.D(r4, r5)
            if (r5 == 0) goto L55
            r1 = 5
            goto Laf
        L55:
            int r5 = r3.f3890O
            r0 = 4
            if (r5 != 0) goto L93
            int r5 = r4.getTop()
            boolean r2 = r3.f3904b
            if (r2 == 0) goto L74
            int r6 = r3.f3879D
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            int r2 = r3.f3882G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r6 >= r5) goto L97
            goto Laf
        L74:
            int r2 = r3.f3880E
            if (r5 >= r2) goto L83
            int r0 = r3.f3882G
            int r0 = r5 - r0
            int r0 = java.lang.Math.abs(r0)
            if (r5 >= r0) goto Lae
            goto Laf
        L83:
            int r1 = r5 - r2
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f3882G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r1 >= r5) goto L97
            goto Lae
        L93:
            boolean r5 = r3.f3904b
            if (r5 == 0) goto L99
        L97:
            r1 = r0
            goto Laf
        L99:
            int r5 = r4.getTop()
            int r1 = r3.f3880E
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f3882G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r1 >= r5) goto L97
        Lae:
            r1 = r6
        Laf:
            r5 = 0
            r3.E(r4, r1, r5)
            r3.f3891P = r5
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.p(android.view.View, android.view.View, int):void");
    }

    @Override // Q0.a
    public final boolean q(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i3 = this.f3887L;
        if (i3 == 1 && actionMasked == 0) {
            return true;
        }
        C0449e c0449e = this.f3888M;
        if (c0449e != null && (this.f3886K || i3 == 1)) {
            c0449e.j(motionEvent);
        }
        if (actionMasked == 0) {
            this.f3900Y = -1;
            this.f3901Z = -1;
            VelocityTracker velocityTracker = this.f3899X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f3899X = null;
            }
        }
        if (this.f3899X == null) {
            this.f3899X = VelocityTracker.obtain();
        }
        this.f3899X.addMovement(motionEvent);
        if (this.f3888M != null && ((this.f3886K || this.f3887L == 1) && actionMasked == 2 && !this.f3889N)) {
            float abs = Math.abs(this.f3901Z - motionEvent.getY());
            C0449e c0449e2 = this.f3888M;
            if (abs > c0449e2.f5343b) {
                c0449e2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f3889N;
    }

    public final void r() {
        int t3 = t();
        if (this.f3904b) {
            this.f3882G = Math.max(this.f3895T - t3, this.f3879D);
        } else {
            this.f3882G = this.f3895T - t3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float s() {
        /*
            r5 = this;
            X1.g r0 = r5.f3913i
            r1 = 0
            if (r0 == 0) goto L79
            java.lang.ref.WeakReference r0 = r5.f3896U
            if (r0 == 0) goto L79
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L79
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r0 < r2) goto L79
            java.lang.ref.WeakReference r0 = r5.f3896U
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            boolean r2 = r5.z()
            if (r2 == 0) goto L79
            android.view.WindowInsets r0 = r0.getRootWindowInsets()
            if (r0 == 0) goto L79
            X1.g r2 = r5.f3913i
            X1.f r3 = r2.f2685d
            X1.k r3 = r3.f2669a
            X1.c r3 = r3.f2722e
            android.graphics.RectF r2 = r2.f()
            float r2 = r3.a(r2)
            android.view.RoundedCorner r3 = M1.a.h(r0)
            if (r3 == 0) goto L4e
            int r3 = M1.a.c(r3)
            float r3 = (float) r3
            int r4 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r4 <= 0) goto L4e
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L4e
            float r3 = r3 / r2
            goto L4f
        L4e:
            r3 = r1
        L4f:
            X1.g r2 = r5.f3913i
            X1.f r4 = r2.f2685d
            X1.k r4 = r4.f2669a
            X1.c r4 = r4.f2723f
            android.graphics.RectF r2 = r2.f()
            float r2 = r4.a(r2)
            android.view.RoundedCorner r0 = M1.a.A(r0)
            if (r0 == 0) goto L74
            int r0 = M1.a.c(r0)
            float r0 = (float) r0
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 <= 0) goto L74
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L74
            float r1 = r0 / r2
        L74:
            float r0 = java.lang.Math.max(r3, r1)
            return r0
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.s():float");
    }

    public final int t() {
        int i3;
        return this.f3911f ? Math.min(Math.max(this.f3912g, this.f3895T - ((this.f3894S * 9) / 16)), this.f3893R) + this.f3926v : (this.f3918n || this.f3919o || (i3 = this.f3917m) <= 0) ? this.f3910e + this.f3926v : Math.max(this.f3910e, i3 + this.h);
    }

    public final void u(int i3) {
        if (((View) this.f3896U.get()) != null) {
            ArrayList arrayList = this.f3898W;
            if (arrayList.isEmpty()) {
                return;
            }
            int i4 = this.f3882G;
            if (i3 <= i4 && i4 != x()) {
                x();
            }
            if (arrayList.size() <= 0) {
                return;
            }
            AbstractC0000a.j(arrayList.get(0));
            throw null;
        }
    }

    public final int x() {
        if (this.f3904b) {
            return this.f3879D;
        }
        return Math.max(this.f3878C, this.f3922r ? 0 : this.f3927w);
    }

    public final int y(int i3) {
        if (i3 == 3) {
            return x();
        }
        if (i3 == 4) {
            return this.f3882G;
        }
        if (i3 == 5) {
            return this.f3895T;
        }
        if (i3 == 6) {
            return this.f3880E;
        }
        throw new IllegalArgumentException(AbstractC0000a.c("Invalid state to get top offset: ", i3));
    }

    public final boolean z() {
        WeakReference weakReference = this.f3896U;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        ((View) this.f3896U.get()).getLocationOnScreen(iArr);
        return iArr[1] == 0;
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i3;
        int i4 = 0;
        this.f3902a = 0;
        this.f3904b = true;
        this.f3915k = -1;
        this.f3916l = -1;
        this.f3876A = new i(this);
        this.f3881F = 0.5f;
        this.f3883H = -1.0f;
        this.f3886K = true;
        this.f3887L = 4;
        this.f3892Q = 0.1f;
        this.f3898W = new ArrayList();
        this.f3901Z = -1;
        this.f3907c0 = new SparseIntArray();
        this.f3909d0 = new e(this, i4);
        this.h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, H1.a.f1336a);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f3914j = AbstractC0090a.F(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(21)) {
            this.f3929y = k.a(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
        }
        k kVar = this.f3929y;
        if (kVar != null) {
            g gVar = new g(kVar);
            this.f3913i = gVar;
            gVar.h(context);
            ColorStateList colorStateList = this.f3914j;
            if (colorStateList != null) {
                this.f3913i.j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f3913i.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(s(), 1.0f);
        this.f3877B = ofFloat;
        ofFloat.setDuration(500L);
        this.f3877B.addUpdateListener(new c(i4, this));
        this.f3883H = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f3915k = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f3916l = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue != null && (i3 = peekValue.data) == -1) {
            A(i3);
        } else {
            A(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        boolean z3 = obtainStyledAttributes.getBoolean(8, false);
        if (this.f3884I != z3) {
            this.f3884I = z3;
            if (!z3 && this.f3887L == 5) {
                B(4);
            }
            F();
        }
        this.f3918n = obtainStyledAttributes.getBoolean(13, false);
        boolean z4 = obtainStyledAttributes.getBoolean(6, true);
        if (this.f3904b != z4) {
            this.f3904b = z4;
            if (this.f3896U != null) {
                r();
            }
            C((this.f3904b && this.f3887L == 6) ? 3 : this.f3887L);
            G(this.f3887L, true);
            F();
        }
        this.f3885J = obtainStyledAttributes.getBoolean(12, false);
        this.f3886K = obtainStyledAttributes.getBoolean(4, true);
        this.f3902a = obtainStyledAttributes.getInt(10, 0);
        float f3 = obtainStyledAttributes.getFloat(7, 0.5f);
        if (f3 > 0.0f && f3 < 1.0f) {
            this.f3881F = f3;
            if (this.f3896U != null) {
                this.f3880E = (int) ((1.0f - f3) * this.f3895T);
            }
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
            if (peekValue2 != null && peekValue2.type == 16) {
                int i5 = peekValue2.data;
                if (i5 >= 0) {
                    this.f3878C = i5;
                    G(this.f3887L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset >= 0) {
                    this.f3878C = dimensionPixelOffset;
                    G(this.f3887L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.f3908d = obtainStyledAttributes.getInt(11, 500);
            this.f3919o = obtainStyledAttributes.getBoolean(17, false);
            this.f3920p = obtainStyledAttributes.getBoolean(18, false);
            this.f3921q = obtainStyledAttributes.getBoolean(19, false);
            this.f3922r = obtainStyledAttributes.getBoolean(20, true);
            this.f3923s = obtainStyledAttributes.getBoolean(14, false);
            this.f3924t = obtainStyledAttributes.getBoolean(15, false);
            this.f3925u = obtainStyledAttributes.getBoolean(16, false);
            this.f3928x = obtainStyledAttributes.getBoolean(23, true);
            obtainStyledAttributes.recycle();
            this.f3906c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }
}
