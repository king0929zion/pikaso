package androidx.coordinatorlayout.widget;

import A.t;
import D1.w;
import L0.g;
import P0.a;
import Q0.b;
import Q0.c;
import Q0.d;
import Q0.e;
import Q0.f;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import c1.C0161a;
import com.ai.assistance.operit.provider.R;
import d1.AbstractC0189K;
import d1.AbstractC0227x;
import d1.AbstractC0229z;
import d1.C0217n;
import d1.InterfaceC0215l;
import d1.InterfaceC0216m;
import d1.l0;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import n.C0379F;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC0215l, InterfaceC0216m {

    /* renamed from: A, reason: collision with root package name */
    public static final C0161a f3365A;

    /* renamed from: w, reason: collision with root package name */
    public static final String f3366w;

    /* renamed from: x, reason: collision with root package name */
    public static final Class[] f3367x;

    /* renamed from: y, reason: collision with root package name */
    public static final ThreadLocal f3368y;

    /* renamed from: z, reason: collision with root package name */
    public static final g f3369z;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f3370d;

    /* renamed from: e, reason: collision with root package name */
    public final w f3371e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f3372f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f3373g;
    public final int[] h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f3374i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3375j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3376k;

    /* renamed from: l, reason: collision with root package name */
    public final int[] f3377l;

    /* renamed from: m, reason: collision with root package name */
    public View f3378m;

    /* renamed from: n, reason: collision with root package name */
    public View f3379n;

    /* renamed from: o, reason: collision with root package name */
    public e f3380o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3381p;

    /* renamed from: q, reason: collision with root package name */
    public l0 f3382q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3383r;

    /* renamed from: s, reason: collision with root package name */
    public Drawable f3384s;

    /* renamed from: t, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f3385t;

    /* renamed from: u, reason: collision with root package name */
    public t f3386u;

    /* renamed from: v, reason: collision with root package name */
    public final C0217n f3387v;

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        f3366w = r02 != null ? r02.getName() : null;
        f3369z = new g(1);
        f3367x = new Class[]{Context.class, AttributeSet.class};
        f3368y = new ThreadLocal();
        f3365A = new C0161a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f3370d = new ArrayList();
        this.f3371e = new w(2);
        this.f3372f = new ArrayList();
        this.f3373g = new ArrayList();
        this.h = new int[2];
        this.f3374i = new int[2];
        this.f3387v = new C0217n(0);
        int[] iArr = a.f2101a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f3377l = intArray;
            float f3 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i3 = 0; i3 < length; i3++) {
                this.f3377l[i3] = (int) (r2[i3] * f3);
            }
        }
        this.f3384s = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        w();
        super.setOnHierarchyChangeListener(new c(this));
        Field field = AbstractC0189K.f4150a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect g() {
        Rect rect = (Rect) f3365A.a();
        return rect == null ? new Rect() : rect;
    }

    public static void l(int i3, Rect rect, Rect rect2, d dVar, int i4, int i5) {
        int i6 = dVar.f2176c;
        if (i6 == 0) {
            i6 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i6, i3);
        int i7 = dVar.f2177d;
        if ((i7 & 7) == 0) {
            i7 |= 8388611;
        }
        if ((i7 & 112) == 0) {
            i7 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i7, i3);
        int i8 = absoluteGravity & 7;
        int i9 = absoluteGravity & 112;
        int i10 = absoluteGravity2 & 7;
        int i11 = absoluteGravity2 & 112;
        int width = i10 != 1 ? i10 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i11 != 16 ? i11 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i8 == 1) {
            width -= i4 / 2;
        } else if (i8 != 5) {
            width -= i4;
        }
        if (i9 == 16) {
            height -= i5 / 2;
        } else if (i9 != 80) {
            height -= i5;
        }
        rect2.set(width, height, i4 + width, i5 + height);
    }

    public static d n(View view) {
        d dVar = (d) view.getLayoutParams();
        if (!dVar.f2175b) {
            b bVar = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                bVar = (b) cls.getAnnotation(b.class);
                if (bVar != null) {
                    break;
                }
            }
            if (bVar != null) {
                try {
                    Q0.a aVar = (Q0.a) bVar.value().getDeclaredConstructor(null).newInstance(null);
                    Q0.a aVar2 = dVar.f2174a;
                    if (aVar2 != aVar) {
                        if (aVar2 != null) {
                            aVar2.e();
                        }
                        dVar.f2174a = aVar;
                        dVar.f2175b = true;
                        if (aVar != null) {
                            aVar.c(dVar);
                        }
                    }
                } catch (Exception e3) {
                    Log.e("CoordinatorLayout", "Default behavior class " + bVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e3);
                }
            }
            dVar.f2175b = true;
        }
        return dVar;
    }

    public static void u(View view, int i3) {
        d dVar = (d) view.getLayoutParams();
        int i4 = dVar.f2181i;
        if (i4 != i3) {
            Field field = AbstractC0189K.f4150a;
            view.offsetLeftAndRight(i3 - i4);
            dVar.f2181i = i3;
        }
    }

    public static void v(View view, int i3) {
        d dVar = (d) view.getLayoutParams();
        int i4 = dVar.f2182j;
        if (i4 != i3) {
            Field field = AbstractC0189K.f4150a;
            view.offsetTopAndBottom(i3 - i4);
            dVar.f2182j = i3;
        }
    }

    @Override // d1.InterfaceC0215l
    public final void a(View view, View view2, int i3, int i4) {
        C0217n c0217n = this.f3387v;
        if (i4 == 1) {
            c0217n.f4231c = i3;
        } else {
            c0217n.f4230b = i3;
        }
        this.f3379n = view2;
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            ((d) getChildAt(i5).getLayoutParams()).getClass();
        }
    }

    @Override // d1.InterfaceC0215l
    public final void b(View view, int i3) {
        C0217n c0217n = this.f3387v;
        if (i3 == 1) {
            c0217n.f4231c = 0;
        } else {
            c0217n.f4230b = 0;
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            d dVar = (d) childAt.getLayoutParams();
            if (dVar.a(i3)) {
                Q0.a aVar = dVar.f2174a;
                if (aVar != null) {
                    aVar.p(childAt, view, i3);
                }
                if (i3 == 0) {
                    dVar.f2185m = false;
                } else if (i3 == 1) {
                    dVar.f2186n = false;
                }
            }
        }
        this.f3379n = null;
    }

    @Override // d1.InterfaceC0215l
    public final void c(View view, int i3, int i4, int[] iArr, int i5) {
        Q0.a aVar;
        int childCount = getChildCount();
        boolean z3 = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.a(i5) && (aVar = dVar.f2174a) != null) {
                    int[] iArr2 = this.h;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    aVar.j(this, childAt, view, i3, i4, iArr2, i5);
                    i6 = i3 > 0 ? Math.max(i6, iArr2[0]) : Math.min(i6, iArr2[0]);
                    i7 = i4 > 0 ? Math.max(i7, iArr2[1]) : Math.min(i7, iArr2[1]);
                    z3 = true;
                }
            }
        }
        iArr[0] = i6;
        iArr[1] = i7;
        if (z3) {
            p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof d) && super.checkLayoutParams(layoutParams);
    }

    @Override // d1.InterfaceC0216m
    public final void d(View view, int i3, int i4, int i5, int i6, int i7, int[] iArr) {
        Q0.a aVar;
        int childCount = getChildCount();
        boolean z3 = false;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.a(i7) && (aVar = dVar.f2174a) != null) {
                    int[] iArr2 = this.h;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    aVar.k(this, childAt, i4, i5, i6, iArr2);
                    i8 = i5 > 0 ? Math.max(i8, iArr2[0]) : Math.min(i8, iArr2[0]);
                    i9 = i6 > 0 ? Math.max(i9, iArr2[1]) : Math.min(i9, iArr2[1]);
                    z3 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i8;
        iArr[1] = iArr[1] + i9;
        if (z3) {
            p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        Q0.a aVar = ((d) view.getLayoutParams()).f2174a;
        if (aVar != null) {
            aVar.getClass();
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f3384s;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // d1.InterfaceC0215l
    public final void e(View view, int i3, int i4, int i5, int i6, int i7) {
        d(view, i3, i4, i5, i6, 0, this.f3374i);
    }

    @Override // d1.InterfaceC0215l
    public final boolean f(View view, View view2, int i3, int i4) {
        int childCount = getChildCount();
        boolean z3 = false;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                Q0.a aVar = dVar.f2174a;
                if (aVar != null) {
                    boolean o3 = aVar.o(childAt, i3, i4);
                    z3 |= o3;
                    if (i4 == 0) {
                        dVar.f2185m = o3;
                    } else if (i4 == 1) {
                        dVar.f2186n = o3;
                    }
                } else if (i4 == 0) {
                    dVar.f2185m = false;
                } else if (i4 == 1) {
                    dVar.f2186n = false;
                }
            }
        }
        return z3;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new d();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        s();
        return Collections.unmodifiableList(this.f3370d);
    }

    public final l0 getLastWindowInsets() {
        return this.f3382q;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0217n c0217n = this.f3387v;
        return c0217n.f4231c | c0217n.f4230b;
    }

    public Drawable getStatusBarBackground() {
        return this.f3384s;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(d dVar, Rect rect, int i3, int i4) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i3) - ((ViewGroup.MarginLayoutParams) dVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) dVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i4) - ((ViewGroup.MarginLayoutParams) dVar).bottomMargin));
        rect.set(max, max2, i3 + max, i4 + max2);
    }

    public final void i(View view, Rect rect, boolean z3) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z3) {
            k(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final ArrayList j(View view) {
        C0379F c0379f = (C0379F) this.f3371e.f1032b;
        int i3 = c0379f.f4970f;
        ArrayList arrayList = null;
        for (int i4 = 0; i4 < i3; i4++) {
            ArrayList arrayList2 = (ArrayList) c0379f.i(i4);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c0379f.f(i4));
            }
        }
        ArrayList arrayList3 = this.f3373g;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void k(View view, Rect rect) {
        ThreadLocal threadLocal = Q0.g.f2190a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = Q0.g.f2190a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        Q0.g.a(this, view, matrix);
        ThreadLocal threadLocal3 = Q0.g.f2191b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int m(int i3) {
        int[] iArr = this.f3377l;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i3);
            return 0;
        }
        if (i3 >= 0 && i3 < iArr.length) {
            return iArr[i3];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i3 + " out of range for " + this);
        return 0;
    }

    public final boolean o(View view, int i3, int i4) {
        C0161a c0161a = f3365A;
        Rect g3 = g();
        k(view, g3);
        try {
            return g3.contains(i3, i4);
        } finally {
            g3.setEmpty();
            c0161a.c(g3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t(false);
        if (this.f3381p) {
            if (this.f3380o == null) {
                this.f3380o = new e(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f3380o);
        }
        if (this.f3382q == null) {
            Field field = AbstractC0189K.f4150a;
            if (getFitsSystemWindows()) {
                AbstractC0227x.c(this);
            }
        }
        this.f3376k = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t(false);
        if (this.f3381p && this.f3380o != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f3380o);
        }
        View view = this.f3379n;
        if (view != null) {
            b(view, 0);
        }
        this.f3376k = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f3383r || this.f3384s == null) {
            return;
        }
        l0 l0Var = this.f3382q;
        int a3 = l0Var != null ? l0Var.a() : 0;
        if (a3 > 0) {
            this.f3384s.setBounds(0, 0, getWidth(), a3);
            this.f3384s.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            t(true);
        }
        boolean r3 = r(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            t(true);
        }
        return r3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        Q0.a aVar;
        Field field = AbstractC0189K.f4150a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f3370d;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            View view = (View) arrayList.get(i7);
            if (view.getVisibility() != 8 && ((aVar = ((d) view.getLayoutParams()).f2174a) == null || !aVar.g(this, view, layoutDirection))) {
                q(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0192, code lost:
    
        if (r0.h(r32, r20, r25, r8, r26) == false) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0195  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r33, int r34) {
        /*
            Method dump skipped, instructions count: 527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f3, float f4, boolean z3) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.a(0)) {
                    Q0.a aVar = dVar.f2174a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f3, float f4) {
        Q0.a aVar;
        int childCount = getChildCount();
        boolean z3 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.a(0) && (aVar = dVar.f2174a) != null) {
                    z3 |= aVar.i(view);
                }
            }
        }
        return z3;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i3, int i4, int[] iArr) {
        c(view, i3, i4, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i3, int i4, int i5, int i6) {
        e(view, i3, i4, i5, i6, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i3) {
        a(view, view2, i3, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.f4957d);
        SparseArray sparseArray = fVar.f2189f;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            int id = childAt.getId();
            Q0.a aVar = n(childAt).f2174a;
            if (id != -1 && aVar != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                aVar.m(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable n2;
        f fVar = new f(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            int id = childAt.getId();
            Q0.a aVar = ((d) childAt.getLayoutParams()).f2174a;
            if (id != -1 && aVar != null && (n2 = aVar.n(childAt)) != null) {
                sparseArray.append(id, n2);
            }
        }
        fVar.f2189f = sparseArray;
        return fVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i3) {
        return f(view, view2, i3, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        b(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r3 != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f3378m
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L17
            boolean r3 = r0.r(r1, r4)
            if (r3 == 0) goto L15
            goto L18
        L15:
            r6 = r5
            goto L2a
        L17:
            r3 = r5
        L18:
            android.view.View r6 = r0.f3378m
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            Q0.d r6 = (Q0.d) r6
            Q0.a r6 = r6.f2174a
            if (r6 == 0) goto L15
            android.view.View r7 = r0.f3378m
            boolean r6 = r6.q(r7, r1)
        L2a:
            android.view.View r7 = r0.f3378m
            r8 = 0
            if (r7 != 0) goto L35
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L48
        L35:
            if (r3 == 0) goto L48
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L48:
            if (r8 == 0) goto L4d
            r8.recycle()
        L4d:
            if (r2 == r4) goto L52
            r1 = 3
            if (r2 != r1) goto L55
        L52:
            r0.t(r5)
        L55:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x004b A[EDGE_INSN: B:114:0x004b->B:9:0x004b BREAK  A[LOOP:2: B:106:0x02db->B:112:0x02f2], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(int r26) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.p(int):void");
    }

    public final void q(View view, int i3) {
        Rect g3;
        Rect g4;
        d dVar = (d) view.getLayoutParams();
        View view2 = dVar.f2183k;
        if (view2 == null && dVar.f2179f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        C0161a c0161a = f3365A;
        if (view2 != null) {
            g3 = g();
            g4 = g();
            try {
                k(view2, g3);
                d dVar2 = (d) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                l(i3, g3, g4, dVar2, measuredWidth, measuredHeight);
                h(dVar2, g4, measuredWidth, measuredHeight);
                view.layout(g4.left, g4.top, g4.right, g4.bottom);
                return;
            } finally {
                g3.setEmpty();
                c0161a.c(g3);
                g4.setEmpty();
                c0161a.c(g4);
            }
        }
        int i4 = dVar.f2178e;
        if (i4 < 0) {
            d dVar3 = (d) view.getLayoutParams();
            g3 = g();
            g3.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) dVar3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) dVar3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) dVar3).bottomMargin);
            if (this.f3382q != null) {
                Field field = AbstractC0189K.f4150a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    g3.left = this.f3382q.f4228a.j().f2460a + g3.left;
                    g3.top = this.f3382q.a() + g3.top;
                    g3.right -= this.f3382q.f4228a.j().f2462c;
                    g3.bottom -= this.f3382q.f4228a.j().f2463d;
                }
            }
            g4 = g();
            int i5 = dVar3.f2176c;
            if ((i5 & 7) == 0) {
                i5 |= 8388611;
            }
            if ((i5 & 112) == 0) {
                i5 |= 48;
            }
            Gravity.apply(i5, view.getMeasuredWidth(), view.getMeasuredHeight(), g3, g4, i3);
            view.layout(g4.left, g4.top, g4.right, g4.bottom);
            return;
        }
        d dVar4 = (d) view.getLayoutParams();
        int i6 = dVar4.f2176c;
        if (i6 == 0) {
            i6 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i6, i3);
        int i7 = absoluteGravity & 7;
        int i8 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i3 == 1) {
            i4 = width - i4;
        }
        int m2 = m(i4) - measuredWidth2;
        if (i7 == 1) {
            m2 += measuredWidth2 / 2;
        } else if (i7 == 5) {
            m2 += measuredWidth2;
        }
        int i9 = i8 != 16 ? i8 != 80 ? 0 : measuredHeight2 : measuredHeight2 / 2;
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar4).leftMargin, Math.min(m2, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) dVar4).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) dVar4).topMargin, Math.min(i9, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) dVar4).bottomMargin));
        view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
    }

    public final boolean r(MotionEvent motionEvent, int i3) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f3372f;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            arrayList.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i4) : i4));
        }
        g gVar = f3369z;
        if (gVar != null) {
            Collections.sort(arrayList, gVar);
        }
        int size = arrayList.size();
        MotionEvent motionEvent2 = null;
        boolean z3 = false;
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            Q0.a aVar = ((d) view.getLayoutParams()).f2174a;
            if (z3 && actionMasked != 0) {
                if (aVar != null) {
                    if (motionEvent2 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i3 == 0) {
                        aVar.f(this, view, motionEvent2);
                    } else if (i3 == 1) {
                        aVar.q(view, motionEvent2);
                    }
                }
            } else if (!z3 && aVar != null) {
                if (i3 == 0) {
                    z3 = aVar.f(this, view, motionEvent);
                } else if (i3 == 1) {
                    z3 = aVar.q(view, motionEvent);
                }
                if (z3) {
                    this.f3378m = view;
                }
            }
        }
        arrayList.clear();
        return z3;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z3) {
        Q0.a aVar = ((d) view.getLayoutParams()).f2174a;
        if (aVar != null) {
            aVar.l(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z3) {
        super.requestDisallowInterceptTouchEvent(z3);
        if (!z3 || this.f3375j) {
            return;
        }
        t(false);
        this.f3375j = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0144, code lost:
    
        throw new java.lang.IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s() {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.s():void");
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z3) {
        super.setFitsSystemWindows(z3);
        w();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f3385t = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f3384s;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f3384s = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f3384s.setState(getDrawableState());
                }
                Drawable drawable3 = this.f3384s;
                Field field = AbstractC0189K.f4150a;
                W0.b.b(drawable3, getLayoutDirection());
                this.f3384s.setVisible(getVisibility() == 0, false);
                this.f3384s.setCallback(this);
            }
            Field field2 = AbstractC0189K.f4150a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i3) {
        setStatusBarBackground(new ColorDrawable(i3));
    }

    public void setStatusBarBackgroundResource(int i3) {
        setStatusBarBackground(i3 != 0 ? T0.a.b(getContext(), i3) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        super.setVisibility(i3);
        boolean z3 = i3 == 0;
        Drawable drawable = this.f3384s;
        if (drawable == null || drawable.isVisible() == z3) {
            return;
        }
        this.f3384s.setVisible(z3, false);
    }

    public final void t(boolean z3) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            Q0.a aVar = ((d) childAt.getLayoutParams()).f2174a;
            if (aVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z3) {
                    aVar.f(this, childAt, obtain);
                } else {
                    aVar.q(childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            ((d) getChildAt(i4).getLayoutParams()).getClass();
        }
        this.f3378m = null;
        this.f3375j = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f3384s;
    }

    public final void w() {
        Field field = AbstractC0189K.f4150a;
        if (!getFitsSystemWindows()) {
            AbstractC0229z.u(this, null);
            return;
        }
        if (this.f3386u == null) {
            this.f3386u = new t(10, this);
        }
        AbstractC0229z.u(this, this.f3386u);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d ? new d((d) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new d((ViewGroup.MarginLayoutParams) layoutParams) : new d(layoutParams);
    }
}
