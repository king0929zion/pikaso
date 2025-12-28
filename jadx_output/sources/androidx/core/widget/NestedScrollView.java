package androidx.core.widget;

import A.t;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.google.android.material.datepicker.b;
import d1.AbstractC0189K;
import d1.AbstractC0229z;
import d1.C0210g;
import d1.C0214k;
import d1.C0217n;
import d1.InterfaceC0216m;
import j1.e;
import j1.h;
import j1.i;
import j1.j;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0216m {

    /* renamed from: E, reason: collision with root package name */
    public static final float f3404E = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: F, reason: collision with root package name */
    public static final b f3405F = new b(1);

    /* renamed from: G, reason: collision with root package name */
    public static final int[] f3406G = {R.attr.fillViewport};

    /* renamed from: A, reason: collision with root package name */
    public final C0217n f3407A;

    /* renamed from: B, reason: collision with root package name */
    public final C0214k f3408B;

    /* renamed from: C, reason: collision with root package name */
    public float f3409C;

    /* renamed from: D, reason: collision with root package name */
    public final C0210g f3410D;

    /* renamed from: d, reason: collision with root package name */
    public final float f3411d;

    /* renamed from: e, reason: collision with root package name */
    public long f3412e;

    /* renamed from: f, reason: collision with root package name */
    public final Rect f3413f;

    /* renamed from: g, reason: collision with root package name */
    public final OverScroller f3414g;
    public final EdgeEffect h;

    /* renamed from: i, reason: collision with root package name */
    public final EdgeEffect f3415i;

    /* renamed from: j, reason: collision with root package name */
    public int f3416j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3417k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3418l;

    /* renamed from: m, reason: collision with root package name */
    public View f3419m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3420n;

    /* renamed from: o, reason: collision with root package name */
    public VelocityTracker f3421o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3422p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3423q;

    /* renamed from: r, reason: collision with root package name */
    public final int f3424r;

    /* renamed from: s, reason: collision with root package name */
    public final int f3425s;

    /* renamed from: t, reason: collision with root package name */
    public final int f3426t;

    /* renamed from: u, reason: collision with root package name */
    public int f3427u;

    /* renamed from: v, reason: collision with root package name */
    public final int[] f3428v;

    /* renamed from: w, reason: collision with root package name */
    public final int[] f3429w;

    /* renamed from: x, reason: collision with root package name */
    public int f3430x;

    /* renamed from: y, reason: collision with root package name */
    public int f3431y;

    /* renamed from: z, reason: collision with root package name */
    public j f3432z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.ai.assistance.operit.provider.R.attr.nestedScrollViewStyle);
        this.f3413f = new Rect();
        this.f3417k = true;
        this.f3418l = false;
        this.f3419m = null;
        this.f3420n = false;
        this.f3423q = true;
        this.f3427u = -1;
        this.f3428v = new int[2];
        this.f3429w = new int[2];
        this.f3410D = new C0210g(getContext(), new t(27, this));
        int i3 = Build.VERSION.SDK_INT;
        this.h = i3 >= 31 ? e.a(context, attributeSet) : new EdgeEffect(context);
        this.f3415i = i3 >= 31 ? e.a(context, attributeSet) : new EdgeEffect(context);
        this.f3411d = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f3414g = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f3424r = viewConfiguration.getScaledTouchSlop();
        this.f3425s = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3426t = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3406G, com.ai.assistance.operit.provider.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f3407A = new C0217n(0);
        this.f3408B = new C0214k(this);
        setNestedScrollingEnabled(true);
        AbstractC0189K.j(this, f3405F);
    }

    public static boolean k(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && k((View) parent, nestedScrollView);
    }

    @Override // d1.InterfaceC0215l
    public final void a(View view, View view2, int i3, int i4) {
        C0217n c0217n = this.f3407A;
        if (i4 == 1) {
            c0217n.f4231c = i3;
        } else {
            c0217n.f4230b = i3;
        }
        this.f3408B.g(2, i4);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // d1.InterfaceC0215l
    public final void b(View view, int i3) {
        C0217n c0217n = this.f3407A;
        if (i3 == 1) {
            c0217n.f4231c = 0;
        } else {
            c0217n.f4230b = 0;
        }
        v(i3);
    }

    @Override // d1.InterfaceC0215l
    public final void c(View view, int i3, int i4, int[] iArr, int i5) {
        this.f3408B.c(i3, i4, i5, iArr, null);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e6  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void computeScroll() {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    @Override // d1.InterfaceC0216m
    public final void d(View view, int i3, int i4, int i5, int i6, int i7, int[] iArr) {
        m(i6, i7, iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r7) {
        /*
            r6 = this;
            boolean r0 = super.dispatchKeyEvent(r7)
            r1 = 1
            if (r0 != 0) goto Lce
            android.graphics.Rect r0 = r6.f3413f
            r0.setEmpty()
            int r0 = r6.getChildCount()
            r2 = 0
            r3 = 130(0x82, float:1.82E-43)
            if (r0 <= 0) goto La1
            android.view.View r0 = r6.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r4 = (android.widget.FrameLayout.LayoutParams) r4
            int r0 = r0.getHeight()
            int r5 = r4.topMargin
            int r0 = r0 + r5
            int r4 = r4.bottomMargin
            int r0 = r0 + r4
            int r4 = r6.getHeight()
            int r5 = r6.getPaddingTop()
            int r4 = r4 - r5
            int r5 = r6.getPaddingBottom()
            int r4 = r4 - r5
            if (r0 <= r4) goto La1
            int r0 = r7.getAction()
            if (r0 != 0) goto Lc9
            int r0 = r7.getKeyCode()
            r4 = 19
            r5 = 33
            if (r0 == r4) goto L91
            r4 = 20
            if (r0 == r4) goto L81
            r4 = 62
            if (r0 == r4) goto L76
            r7 = 92
            if (r0 == r7) goto L71
            r7 = 93
            if (r0 == r7) goto L6c
            r7 = 122(0x7a, float:1.71E-43)
            if (r0 == r7) goto L68
            r7 = 123(0x7b, float:1.72E-43)
            if (r0 == r7) goto L63
            goto Lc9
        L63:
            r6.p(r3)
            goto Lc9
        L68:
            r6.p(r5)
            goto Lc9
        L6c:
            boolean r7 = r6.j(r3)
            goto Lca
        L71:
            boolean r7 = r6.j(r5)
            goto Lca
        L76:
            boolean r7 = r7.isShiftPressed()
            if (r7 == 0) goto L7d
            r3 = r5
        L7d:
            r6.p(r3)
            goto Lc9
        L81:
            boolean r7 = r7.isAltPressed()
            if (r7 == 0) goto L8c
            boolean r7 = r6.j(r3)
            goto Lca
        L8c:
            boolean r7 = r6.g(r3)
            goto Lca
        L91:
            boolean r7 = r7.isAltPressed()
            if (r7 == 0) goto L9c
            boolean r7 = r6.j(r5)
            goto Lca
        L9c:
            boolean r7 = r6.g(r5)
            goto Lca
        La1:
            boolean r0 = r6.isFocused()
            if (r0 == 0) goto Lc9
            int r7 = r7.getKeyCode()
            r0 = 4
            if (r7 == r0) goto Lc9
            android.view.View r7 = r6.findFocus()
            if (r7 != r6) goto Lb5
            r7 = 0
        Lb5:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r7 = r0.findNextFocus(r6, r7, r3)
            if (r7 == 0) goto Lc9
            if (r7 == r6) goto Lc9
            boolean r7 = r7.requestFocus(r3)
            if (r7 == 0) goto Lc9
            r7 = r1
            goto Lca
        Lc9:
            r7 = r2
        Lca:
            if (r7 == 0) goto Lcd
            goto Lce
        Lcd:
            r1 = r2
        Lce:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f3, float f4, boolean z3) {
        return this.f3408B.a(f3, f4, z3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f3, float f4) {
        return this.f3408B.b(f3, f4);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i3, int i4, int[] iArr, int[] iArr2) {
        return this.f3408B.c(i3, i4, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i3, int i4, int i5, int i6, int[] iArr) {
        return this.f3408B.d(i3, i4, i5, i6, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i3;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.h;
        int i4 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (h.a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                i3 = getPaddingLeft();
            } else {
                i3 = 0;
            }
            if (h.a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate(i3, min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.f3415i;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getScrollRange(), scrollY) + height2;
        if (h.a(this)) {
            width2 -= getPaddingRight() + getPaddingLeft();
            i4 = getPaddingLeft();
        }
        if (h.a(this)) {
            height2 -= getPaddingBottom() + getPaddingTop();
            max -= getPaddingBottom();
        }
        canvas.translate(i4 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(save2);
    }

    @Override // d1.InterfaceC0215l
    public final void e(View view, int i3, int i4, int i5, int i6, int i7) {
        m(i6, i7, null);
    }

    @Override // d1.InterfaceC0215l
    public final boolean f(View view, View view2, int i3, int i4) {
        return (i3 & 2) != 0;
    }

    public final boolean g(int i3) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i3);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !l(findNextFocus, maxScrollAmount, getHeight())) {
            if (i3 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i3 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i3 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            r(maxScrollAmount, 0, 1, true);
        } else {
            Rect rect = this.f3413f;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            r(h(rect), 0, 1, true);
            findNextFocus.requestFocus(i3);
        }
        if (findFocus != null && findFocus.isFocused() && !l(findFocus, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0217n c0217n = this.f3407A;
        return c0217n.f4231c | c0217n.f4230b;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.f3409C == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f3409C = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f3409C;
    }

    public final int h(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i3 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i4 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i3 - verticalFadingEdgeLength : i3;
        int i5 = rect.bottom;
        if (i5 > i4 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i4, (childAt.getBottom() + layoutParams.bottomMargin) - i3);
        }
        if (rect.top >= scrollY || i5 >= i4) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i4 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f3408B.f(0);
    }

    public final void i(int i3) {
        if (getChildCount() > 0) {
            this.f3414g.fling(getScrollX(), getScrollY(), 0, i3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.f3408B.g(2, 1);
            this.f3431y = getScrollY();
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f3408B.f4225d;
    }

    public final boolean j(int i3) {
        int childCount;
        boolean z3 = i3 == 130;
        int height = getHeight();
        Rect rect = this.f3413f;
        rect.top = 0;
        rect.bottom = height;
        if (z3 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return q(i3, rect.top, rect.bottom);
    }

    public final boolean l(View view, int i3, int i4) {
        Rect rect = this.f3413f;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i3 >= getScrollY() && rect.top - i3 <= getScrollY() + i4;
    }

    public final void m(int i3, int i4, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i3);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f3408B.d(0, scrollY2, 0, i3 - scrollY2, null, i4, iArr);
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i3, int i4) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i3, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i4, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3427u) {
            int i3 = actionIndex == 0 ? 1 : 0;
            this.f3416j = (int) motionEvent.getY(i3);
            this.f3427u = motionEvent.getPointerId(i3);
            VelocityTracker velocityTracker = this.f3421o;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean o(int i3, int i4, int i5, int i6) {
        boolean z3;
        boolean z4;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i7 = i5 + i3;
        if (i4 <= 0 && i4 >= 0) {
            z3 = false;
        } else {
            i4 = 0;
            z3 = true;
        }
        if (i7 <= i6) {
            if (i7 >= 0) {
                i6 = i7;
                z4 = false;
                if (z4 && !this.f3408B.f(1)) {
                    this.f3414g.springBack(i4, i6, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i4, i6);
                return z3 || z4;
            }
            i6 = 0;
        }
        z4 = true;
        if (z4) {
            this.f3414g.springBack(i4, i6, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i4, i6);
        if (z3) {
            return true;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3418l = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02b1  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r26) {
        /*
            Method dump skipped, instructions count: 847
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z3 = true;
        if (action == 2 && this.f3420n) {
            return true;
        }
        int i3 = action & 255;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = this.f3427u;
                    if (i4 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i4);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i4 + " in onInterceptTouchEvent");
                        } else {
                            int y3 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y3 - this.f3416j) > this.f3424r && (2 & getNestedScrollAxes()) == 0) {
                                this.f3420n = true;
                                this.f3416j = y3;
                                if (this.f3421o == null) {
                                    this.f3421o = VelocityTracker.obtain();
                                }
                                this.f3421o.addMovement(motionEvent);
                                this.f3430x = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i3 != 3) {
                    if (i3 == 6) {
                        n(motionEvent);
                    }
                }
            }
            this.f3420n = false;
            this.f3427u = -1;
            VelocityTracker velocityTracker = this.f3421o;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f3421o = null;
            }
            if (this.f3414g.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            v(0);
        } else {
            int y4 = (int) motionEvent.getY();
            int x3 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y4 >= childAt.getTop() - scrollY && y4 < childAt.getBottom() - scrollY && x3 >= childAt.getLeft() && x3 < childAt.getRight()) {
                    this.f3416j = y4;
                    this.f3427u = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.f3421o;
                    if (velocityTracker2 == null) {
                        this.f3421o = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f3421o.addMovement(motionEvent);
                    this.f3414g.computeScrollOffset();
                    if (!u(motionEvent) && this.f3414g.isFinished()) {
                        z3 = false;
                    }
                    this.f3420n = z3;
                    this.f3408B.g(2, 0);
                }
            }
            if (!u(motionEvent) && this.f3414g.isFinished()) {
                z3 = false;
            }
            this.f3420n = z3;
            VelocityTracker velocityTracker3 = this.f3421o;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f3421o = null;
            }
        }
        return this.f3420n;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        int i7;
        super.onLayout(z3, i3, i4, i5, i6);
        int i8 = 0;
        this.f3417k = false;
        View view = this.f3419m;
        if (view != null && k(view, this)) {
            View view2 = this.f3419m;
            Rect rect = this.f3413f;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h = h(rect);
            if (h != 0) {
                scrollBy(0, h);
            }
        }
        this.f3419m = null;
        if (!this.f3418l) {
            if (this.f3432z != null) {
                scrollTo(getScrollX(), this.f3432z.f4623d);
                this.f3432z = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i7 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i7 = 0;
            }
            int paddingTop = ((i6 - i4) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i7 && scrollY >= 0) {
                i8 = paddingTop + scrollY > i7 ? i7 - paddingTop : scrollY;
            }
            if (i8 != scrollY) {
                scrollTo(getScrollX(), i8);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f3418l = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i4) {
        super.onMeasure(i3, i4);
        if (this.f3422p && View.MeasureSpec.getMode(i4) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f3, float f4, boolean z3) {
        if (z3) {
            return false;
        }
        dispatchNestedFling(0.0f, f4, true);
        i((int) f4);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f3, float f4) {
        return this.f3408B.b(f3, f4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i3, int i4, int[] iArr) {
        this.f3408B.c(i3, i4, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i3, int i4, int i5, int i6) {
        m(i6, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i3) {
        a(view, view2, i3, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i3, int i4, boolean z3, boolean z4) {
        super.scrollTo(i3, i4);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i3, Rect rect) {
        if (i3 == 2) {
            i3 = 130;
        } else if (i3 == 1) {
            i3 = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i3) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i3);
        if (findNextFocus != null && l(findNextFocus, 0, getHeight())) {
            return findNextFocus.requestFocus(i3, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof j)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        j jVar = (j) parcelable;
        super.onRestoreInstanceState(jVar.getSuperState());
        this.f3432z = jVar;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        j jVar = new j(super.onSaveInstanceState());
        jVar.f4623d = getScrollY();
        return jVar;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i3, int i4, int i5, int i6) {
        super.onScrollChanged(i3, i4, i5, i6);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i4, int i5, int i6) {
        super.onSizeChanged(i3, i4, i5, i6);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !l(findFocus, 0, i6)) {
            return;
        }
        Rect rect = this.f3413f;
        findFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(findFocus, rect);
        int h = h(rect);
        if (h != 0) {
            if (this.f3423q) {
                t(0, h, false);
            } else {
                scrollBy(0, h);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i3) {
        return f(view, view2, i3, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        b(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (this.f3421o == null) {
            this.f3421o = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f3430x = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float f3 = 0.0f;
        obtain.offsetLocation(0.0f, this.f3430x);
        C0214k c0214k = this.f3408B;
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f3415i;
            EdgeEffect edgeEffect2 = this.h;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f3421o;
                velocityTracker.computeCurrentVelocity(1000, this.f3426t);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f3427u);
                if (Math.abs(yVelocity) >= this.f3425s) {
                    if (Z.b.q(edgeEffect2) != 0.0f) {
                        if (s(edgeEffect2, yVelocity)) {
                            edgeEffect2.onAbsorb(yVelocity);
                        } else {
                            i(-yVelocity);
                        }
                    } else if (Z.b.q(edgeEffect) != 0.0f) {
                        int i3 = -yVelocity;
                        if (s(edgeEffect, i3)) {
                            edgeEffect.onAbsorb(i3);
                        } else {
                            i(i3);
                        }
                    } else {
                        int i4 = -yVelocity;
                        float f4 = i4;
                        if (!c0214k.b(0.0f, f4)) {
                            dispatchNestedFling(0.0f, f4, true);
                            i(i4);
                        }
                    }
                } else if (this.f3414g.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f3427u = -1;
                this.f3420n = false;
                VelocityTracker velocityTracker2 = this.f3421o;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f3421o = null;
                }
                v(0);
                this.h.onRelease();
                this.f3415i.onRelease();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f3427u);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f3427u + " in onTouchEvent");
                } else {
                    int y3 = (int) motionEvent.getY(findPointerIndex);
                    int i5 = this.f3416j - y3;
                    float x3 = motionEvent.getX(findPointerIndex) / getWidth();
                    float height = i5 / getHeight();
                    if (Z.b.q(edgeEffect2) != 0.0f) {
                        float f5 = -Z.b.F(edgeEffect2, -height, x3);
                        if (Z.b.q(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                        f3 = f5;
                    } else if (Z.b.q(edgeEffect) != 0.0f) {
                        float F3 = Z.b.F(edgeEffect, height, 1.0f - x3);
                        if (Z.b.q(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                        f3 = F3;
                    }
                    int round = Math.round(f3 * getHeight());
                    if (round != 0) {
                        invalidate();
                    }
                    int i6 = i5 - round;
                    if (!this.f3420n && Math.abs(i6) > this.f3424r) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f3420n = true;
                        i6 = i6 > 0 ? i6 - this.f3424r : i6 + this.f3424r;
                    }
                    if (this.f3420n) {
                        int r3 = r(i6, (int) motionEvent.getX(findPointerIndex), 0, false);
                        this.f3416j = y3 - r3;
                        this.f3430x += r3;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f3420n && getChildCount() > 0 && this.f3414g.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f3427u = -1;
                this.f3420n = false;
                VelocityTracker velocityTracker3 = this.f3421o;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f3421o = null;
                }
                v(0);
                this.h.onRelease();
                this.f3415i.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f3416j = (int) motionEvent.getY(actionIndex);
                this.f3427u = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                n(motionEvent);
                this.f3416j = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f3427u));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f3420n && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f3414g.isFinished()) {
                this.f3414g.abortAnimation();
                v(1);
            }
            int y4 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f3416j = y4;
            this.f3427u = pointerId;
            c0214k.g(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f3421o;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public final void p(int i3) {
        boolean z3 = i3 == 130;
        int height = getHeight();
        Rect rect = this.f3413f;
        if (z3) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i4 = rect.top;
        int i5 = height + i4;
        rect.bottom = i5;
        q(i3, i4, i5);
    }

    public final boolean q(int i3, int i4, int i5) {
        boolean z3;
        int height = getHeight();
        int scrollY = getScrollY();
        int i6 = height + scrollY;
        boolean z4 = i3 == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z5 = false;
        for (int i7 = 0; i7 < size; i7++) {
            View view2 = focusables.get(i7);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i4 < bottom && top < i5) {
                boolean z6 = i4 < top && bottom < i5;
                if (view == null) {
                    view = view2;
                    z5 = z6;
                } else {
                    boolean z7 = (z4 && top < view.getTop()) || (!z4 && bottom > view.getBottom());
                    if (z5) {
                        if (z6) {
                            if (!z7) {
                            }
                            view = view2;
                        }
                    } else if (z6) {
                        view = view2;
                        z5 = true;
                    } else {
                        if (!z7) {
                        }
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i4 < scrollY || i5 > i6) {
            r(z4 ? i4 - scrollY : i5 - i6, 0, 1, true);
            z3 = true;
        } else {
            z3 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i3);
        }
        return z3;
    }

    public final int r(int i3, int i4, int i5, boolean z3) {
        int i6;
        int i7;
        boolean z4;
        VelocityTracker velocityTracker;
        C0214k c0214k = this.f3408B;
        if (i5 == 1) {
            c0214k.g(2, i5);
        }
        boolean c3 = this.f3408B.c(0, i3, i5, this.f3429w, this.f3428v);
        int[] iArr = this.f3429w;
        int[] iArr2 = this.f3428v;
        if (c3) {
            i6 = i3 - iArr[1];
            i7 = iArr2[1];
        } else {
            i6 = i3;
            i7 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z5 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z3;
        boolean z6 = o(i6, 0, scrollY, scrollRange) && !c0214k.f(i5);
        int scrollY2 = getScrollY() - scrollY;
        iArr[1] = 0;
        this.f3408B.d(0, scrollY2, 0, i6 - scrollY2, this.f3428v, i5, iArr);
        int i8 = i7 + iArr2[1];
        int i9 = i6 - iArr[1];
        int i10 = scrollY + i9;
        EdgeEffect edgeEffect = this.f3415i;
        EdgeEffect edgeEffect2 = this.h;
        if (i10 < 0) {
            if (z5) {
                Z.b.F(edgeEffect2, (-i9) / getHeight(), i4 / getWidth());
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i10 > scrollRange && z5) {
            Z.b.F(edgeEffect, i9 / getHeight(), 1.0f - (i4 / getWidth()));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (edgeEffect2.isFinished() && edgeEffect.isFinished()) {
            z4 = z6;
        } else {
            postInvalidateOnAnimation();
            z4 = false;
        }
        if (z4 && i5 == 0 && (velocityTracker = this.f3421o) != null) {
            velocityTracker.clear();
        }
        if (i5 == 1) {
            v(i5);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i8;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f3417k) {
            this.f3419m = view2;
        } else {
            Rect rect = this.f3413f;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h = h(rect);
            if (h != 0) {
                scrollBy(0, h);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z3) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int h = h(rect);
        boolean z4 = h != 0;
        if (z4) {
            if (z3) {
                scrollBy(0, h);
            } else {
                t(0, h, false);
            }
        }
        return z4;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z3) {
        VelocityTracker velocityTracker;
        if (z3 && (velocityTracker = this.f3421o) != null) {
            velocityTracker.recycle();
            this.f3421o = null;
        }
        super.requestDisallowInterceptTouchEvent(z3);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f3417k = true;
        super.requestLayout();
    }

    public final boolean s(EdgeEffect edgeEffect, int i3) {
        if (i3 > 0) {
            return true;
        }
        float q3 = Z.b.q(edgeEffect) * getHeight();
        float abs = Math.abs(-i3) * 0.35f;
        float f3 = this.f3411d * 0.015f;
        double log = Math.log(abs / f3);
        double d3 = f3404E;
        return ((float) (Math.exp((d3 / (d3 - 1.0d)) * log) * ((double) f3))) < q3;
    }

    @Override // android.view.View
    public final void scrollTo(int i3, int i4) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i3 < 0) {
                i3 = 0;
            } else if (width + i3 > width2) {
                i3 = width2 - width;
            }
            if (height >= height2 || i4 < 0) {
                i4 = 0;
            } else if (height + i4 > height2) {
                i4 = height2 - height;
            }
            if (i3 == getScrollX() && i4 == getScrollY()) {
                return;
            }
            super.scrollTo(i3, i4);
        }
    }

    public void setFillViewport(boolean z3) {
        if (z3 != this.f3422p) {
            this.f3422p = z3;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z3) {
        C0214k c0214k = this.f3408B;
        if (c0214k.f4225d) {
            Field field = AbstractC0189K.f4150a;
            AbstractC0229z.z(c0214k.f4224c);
        }
        c0214k.f4225d = z3;
    }

    public void setOnScrollChangeListener(i iVar) {
    }

    public void setSmoothScrollingEnabled(boolean z3) {
        this.f3423q = z3;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i3) {
        return this.f3408B.g(i3, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        v(0);
    }

    public final void t(int i3, int i4, boolean z3) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f3412e > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f3414g.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i4 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            if (z3) {
                this.f3408B.g(2, 1);
            } else {
                v(1);
            }
            this.f3431y = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f3414g.isFinished()) {
                this.f3414g.abortAnimation();
                v(1);
            }
            scrollBy(i3, i4);
        }
        this.f3412e = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean u(MotionEvent motionEvent) {
        boolean z3;
        EdgeEffect edgeEffect = this.h;
        if (Z.b.q(edgeEffect) != 0.0f) {
            Z.b.F(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z3 = true;
        } else {
            z3 = false;
        }
        EdgeEffect edgeEffect2 = this.f3415i;
        if (Z.b.q(edgeEffect2) == 0.0f) {
            return z3;
        }
        Z.b.F(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void v(int i3) {
        this.f3408B.h(i3);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i3) {
        if (getChildCount() <= 0) {
            super.addView(view, i3);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i3, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
