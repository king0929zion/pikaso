package androidx.appcompat.widget;

import D1.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import com.ai.assistance.operit.provider.R;
import d1.AbstractC0189K;
import d1.AbstractC0227x;
import d1.AbstractC0229z;
import d1.C0203Z;
import d1.C0217n;
import d1.InterfaceC0215l;
import d1.InterfaceC0216m;
import d1.b0;
import d1.c0;
import d1.d0;
import d1.j0;
import d1.l0;
import java.lang.reflect.Field;
import k.C0304d;
import k.InterfaceC0302c;
import k.RunnableC0300b;
import k.T;
import k.U0;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0215l, InterfaceC0216m {

    /* renamed from: B, reason: collision with root package name */
    public static final int[] f3124B = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* renamed from: A, reason: collision with root package name */
    public final C0217n f3125A;

    /* renamed from: d, reason: collision with root package name */
    public int f3126d;

    /* renamed from: e, reason: collision with root package name */
    public ContentFrameLayout f3127e;

    /* renamed from: f, reason: collision with root package name */
    public ActionBarContainer f3128f;

    /* renamed from: g, reason: collision with root package name */
    public T f3129g;
    public Drawable h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3130i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3131j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3132k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3133l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3134m;

    /* renamed from: n, reason: collision with root package name */
    public int f3135n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f3136o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f3137p;

    /* renamed from: q, reason: collision with root package name */
    public final Rect f3138q;

    /* renamed from: r, reason: collision with root package name */
    public l0 f3139r;

    /* renamed from: s, reason: collision with root package name */
    public l0 f3140s;

    /* renamed from: t, reason: collision with root package name */
    public l0 f3141t;

    /* renamed from: u, reason: collision with root package name */
    public l0 f3142u;

    /* renamed from: v, reason: collision with root package name */
    public OverScroller f3143v;

    /* renamed from: w, reason: collision with root package name */
    public ViewPropertyAnimator f3144w;

    /* renamed from: x, reason: collision with root package name */
    public final l f3145x;

    /* renamed from: y, reason: collision with root package name */
    public final RunnableC0300b f3146y;

    /* renamed from: z, reason: collision with root package name */
    public final RunnableC0300b f3147z;

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3136o = new Rect();
        this.f3137p = new Rect();
        this.f3138q = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        l0 l0Var = l0.f4227b;
        this.f3139r = l0Var;
        this.f3140s = l0Var;
        this.f3141t = l0Var;
        this.f3142u = l0Var;
        this.f3145x = new l(3, this);
        this.f3146y = new RunnableC0300b(this, 0);
        this.f3147z = new RunnableC0300b(this, 1);
        i(context);
        this.f3125A = new C0217n(0);
    }

    public static boolean g(View view, Rect rect, boolean z3) {
        boolean z4;
        C0304d c0304d = (C0304d) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c0304d).leftMargin;
        int i4 = rect.left;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) c0304d).leftMargin = i4;
            z4 = true;
        } else {
            z4 = false;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) c0304d).topMargin;
        int i6 = rect.top;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) c0304d).topMargin = i6;
            z4 = true;
        }
        int i7 = ((ViewGroup.MarginLayoutParams) c0304d).rightMargin;
        int i8 = rect.right;
        if (i7 != i8) {
            ((ViewGroup.MarginLayoutParams) c0304d).rightMargin = i8;
            z4 = true;
        }
        if (z3) {
            int i9 = ((ViewGroup.MarginLayoutParams) c0304d).bottomMargin;
            int i10 = rect.bottom;
            if (i9 != i10) {
                ((ViewGroup.MarginLayoutParams) c0304d).bottomMargin = i10;
                return true;
            }
        }
        return z4;
    }

    @Override // d1.InterfaceC0215l
    public final void a(View view, View view2, int i3, int i4) {
        if (i4 == 0) {
            onNestedScrollAccepted(view, view2, i3);
        }
    }

    @Override // d1.InterfaceC0215l
    public final void b(View view, int i3) {
        if (i3 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // d1.InterfaceC0215l
    public final void c(View view, int i3, int i4, int[] iArr, int i5) {
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0304d;
    }

    @Override // d1.InterfaceC0216m
    public final void d(View view, int i3, int i4, int i5, int i6, int i7, int[] iArr) {
        e(view, i3, i4, i5, i6, i7);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i3;
        super.draw(canvas);
        if (this.h == null || this.f3130i) {
            return;
        }
        if (this.f3128f.getVisibility() == 0) {
            i3 = (int) (this.f3128f.getTranslationY() + this.f3128f.getBottom() + 0.5f);
        } else {
            i3 = 0;
        }
        this.h.setBounds(0, i3, getWidth(), this.h.getIntrinsicHeight() + i3);
        this.h.draw(canvas);
    }

    @Override // d1.InterfaceC0215l
    public final void e(View view, int i3, int i4, int i5, int i6, int i7) {
        if (i7 == 0) {
            onNestedScroll(view, i3, i4, i5, i6);
        }
    }

    @Override // d1.InterfaceC0215l
    public final boolean f(View view, View view2, int i3, int i4) {
        return i4 == 0 && onStartNestedScroll(view, view2, i3);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0304d(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0304d(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f3128f;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0217n c0217n = this.f3125A;
        return c0217n.f4231c | c0217n.f4230b;
    }

    public CharSequence getTitle() {
        j();
        return ((U0) this.f3129g).f4720a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f3146y);
        removeCallbacks(this.f3147z);
        ViewPropertyAnimator viewPropertyAnimator = this.f3144w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f3124B);
        this.f3126d = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.h = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f3130i = context.getApplicationInfo().targetSdkVersion < 19;
        this.f3143v = new OverScroller(context);
    }

    public final void j() {
        T wrapper;
        if (this.f3127e == null) {
            this.f3127e = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f3128f = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof T) {
                wrapper = (T) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f3129g = wrapper;
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        j();
        l0 d3 = l0.d(this, windowInsets);
        j0 j0Var = d3.f4228a;
        boolean g3 = g(this.f3128f, new Rect(j0Var.j().f2460a, d3.a(), j0Var.j().f2462c, j0Var.j().f2463d), false);
        Field field = AbstractC0189K.f4150a;
        Rect rect = this.f3136o;
        AbstractC0229z.b(this, d3, rect);
        l0 l3 = j0Var.l(rect.left, rect.top, rect.right, rect.bottom);
        this.f3139r = l3;
        boolean z3 = true;
        if (!this.f3140s.equals(l3)) {
            this.f3140s = this.f3139r;
            g3 = true;
        }
        Rect rect2 = this.f3137p;
        if (rect2.equals(rect)) {
            z3 = g3;
        } else {
            rect2.set(rect);
        }
        if (z3) {
            requestLayout();
        }
        return j0Var.a().f4228a.c().f4228a.b().c();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        Field field = AbstractC0189K.f4150a;
        AbstractC0227x.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                C0304d c0304d = (C0304d) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i8 = ((ViewGroup.MarginLayoutParams) c0304d).leftMargin + paddingLeft;
                int i9 = ((ViewGroup.MarginLayoutParams) c0304d).topMargin + paddingTop;
                childAt.layout(i8, i9, measuredWidth + i8, measuredHeight + i9);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        int measuredHeight;
        j();
        measureChildWithMargins(this.f3128f, i3, 0, i4, 0);
        C0304d c0304d = (C0304d) this.f3128f.getLayoutParams();
        int max = Math.max(0, this.f3128f.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0304d).leftMargin + ((ViewGroup.MarginLayoutParams) c0304d).rightMargin);
        int max2 = Math.max(0, this.f3128f.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0304d).topMargin + ((ViewGroup.MarginLayoutParams) c0304d).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f3128f.getMeasuredState());
        Field field = AbstractC0189K.f4150a;
        boolean z3 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z3) {
            measuredHeight = this.f3126d;
            if (this.f3132k && this.f3128f.getTabContainer() != null) {
                measuredHeight += this.f3126d;
            }
        } else {
            measuredHeight = this.f3128f.getVisibility() != 8 ? this.f3128f.getMeasuredHeight() : 0;
        }
        Rect rect = this.f3136o;
        Rect rect2 = this.f3138q;
        rect2.set(rect);
        l0 l0Var = this.f3139r;
        this.f3141t = l0Var;
        if (this.f3131j || z3) {
            V0.c b3 = V0.c.b(l0Var.f4228a.j().f2460a, this.f3141t.a() + measuredHeight, this.f3141t.f4228a.j().f2462c, this.f3141t.f4228a.j().f2463d);
            l0 l0Var2 = this.f3141t;
            int i5 = Build.VERSION.SDK_INT;
            d0 c0Var = i5 >= 30 ? new c0(l0Var2) : i5 >= 29 ? new b0(l0Var2) : new C0203Z(l0Var2);
            c0Var.g(b3);
            this.f3141t = c0Var.b();
        } else {
            rect2.top += measuredHeight;
            rect2.bottom = rect2.bottom;
            this.f3141t = l0Var.f4228a.l(0, measuredHeight, 0, 0);
        }
        g(this.f3127e, rect2, true);
        if (!this.f3142u.equals(this.f3141t)) {
            l0 l0Var3 = this.f3141t;
            this.f3142u = l0Var3;
            ContentFrameLayout contentFrameLayout = this.f3127e;
            WindowInsets c3 = l0Var3.c();
            if (c3 != null) {
                WindowInsets a3 = AbstractC0227x.a(contentFrameLayout, c3);
                if (!a3.equals(c3)) {
                    l0.d(contentFrameLayout, a3);
                }
            }
        }
        measureChildWithMargins(this.f3127e, i3, 0, i4, 0);
        C0304d c0304d2 = (C0304d) this.f3127e.getLayoutParams();
        int max3 = Math.max(max, this.f3127e.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0304d2).leftMargin + ((ViewGroup.MarginLayoutParams) c0304d2).rightMargin);
        int max4 = Math.max(max2, this.f3127e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0304d2).topMargin + ((ViewGroup.MarginLayoutParams) c0304d2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f3127e.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i3, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i4, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f3, float f4, boolean z3) {
        if (!this.f3133l || !z3) {
            return false;
        }
        this.f3143v.fling(0, 0, 0, (int) f4, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f3143v.getFinalY() > this.f3128f.getHeight()) {
            h();
            this.f3147z.run();
        } else {
            h();
            this.f3146y.run();
        }
        this.f3134m = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f3, float f4) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i3, int i4, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i3, int i4, int i5, int i6) {
        int i7 = this.f3135n + i4;
        this.f3135n = i7;
        setActionBarHideOffset(i7);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i3) {
        this.f3125A.f4230b = i3;
        this.f3135n = getActionBarHideOffset();
        h();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i3) {
        if ((i3 & 2) == 0 || this.f3128f.getVisibility() != 0) {
            return false;
        }
        return this.f3133l;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f3133l || this.f3134m) {
            return;
        }
        if (this.f3135n <= this.f3128f.getHeight()) {
            h();
            postDelayed(this.f3146y, 600L);
        } else {
            h();
            postDelayed(this.f3147z, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i3) {
        super.onWindowSystemUiVisibilityChanged(i3);
        j();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i3) {
        super.onWindowVisibilityChanged(i3);
    }

    public void setActionBarHideOffset(int i3) {
        h();
        this.f3128f.setTranslationY(-Math.max(0, Math.min(i3, this.f3128f.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0302c interfaceC0302c) {
        if (getWindowToken() != null) {
            throw null;
        }
    }

    public void setHasNonEmbeddedTabs(boolean z3) {
        this.f3132k = z3;
    }

    public void setHideOnContentScrollEnabled(boolean z3) {
        if (z3 != this.f3133l) {
            this.f3133l = z3;
            if (z3) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i3) {
        j();
        U0 u02 = (U0) this.f3129g;
        u02.f4723d = i3 != 0 ? Z.b.r(u02.f4720a.getContext(), i3) : null;
        u02.c();
    }

    public void setLogo(int i3) {
        j();
        U0 u02 = (U0) this.f3129g;
        u02.f4724e = i3 != 0 ? Z.b.r(u02.f4720a.getContext(), i3) : null;
        u02.c();
    }

    public void setOverlayMode(boolean z3) {
        this.f3131j = z3;
        this.f3130i = z3 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z3) {
    }

    public void setUiOptions(int i3) {
    }

    public void setWindowCallback(Window.Callback callback) {
        j();
        ((U0) this.f3129g).f4729k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        j();
        U0 u02 = (U0) this.f3129g;
        if (u02.f4726g) {
            return;
        }
        u02.h = charSequence;
        if ((u02.f4721b & 8) != 0) {
            Toolbar toolbar = u02.f4720a;
            toolbar.setTitle(charSequence);
            if (u02.f4726g) {
                AbstractC0189K.k(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0304d(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        j();
        U0 u02 = (U0) this.f3129g;
        u02.f4723d = drawable;
        u02.c();
    }
}
