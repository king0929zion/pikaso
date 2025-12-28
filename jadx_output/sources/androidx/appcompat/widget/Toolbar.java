package androidx.appcompat.widget;

import A.t;
import M1.h;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.ai.assistance.operit.provider.R;
import d1.AbstractC0189K;
import g.AbstractC0262a;
import i.C0286e;
import j.i;
import j.j;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import k.C0306e;
import k.C0312h;
import k.C0339v;
import k.C0341w;
import k.C0342w0;
import k.J;
import k.M0;
import k.N0;
import k.O0;
import k.P0;
import k.Q0;
import k.R0;
import k.S0;
import k.T;
import k.T0;
import k.U0;
import k.V0;
import k.Y0;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f3211A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f3212B;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f3213C;

    /* renamed from: D, reason: collision with root package name */
    public ColorStateList f3214D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f3215E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f3216F;

    /* renamed from: G, reason: collision with root package name */
    public final ArrayList f3217G;

    /* renamed from: H, reason: collision with root package name */
    public final ArrayList f3218H;

    /* renamed from: I, reason: collision with root package name */
    public final int[] f3219I;

    /* renamed from: J, reason: collision with root package name */
    public final t f3220J;

    /* renamed from: K, reason: collision with root package name */
    public ArrayList f3221K;

    /* renamed from: L, reason: collision with root package name */
    public final N0 f3222L;

    /* renamed from: M, reason: collision with root package name */
    public U0 f3223M;

    /* renamed from: N, reason: collision with root package name */
    public Q0 f3224N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f3225O;

    /* renamed from: P, reason: collision with root package name */
    public OnBackInvokedCallback f3226P;

    /* renamed from: Q, reason: collision with root package name */
    public OnBackInvokedDispatcher f3227Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f3228R;

    /* renamed from: S, reason: collision with root package name */
    public final h f3229S;

    /* renamed from: d, reason: collision with root package name */
    public ActionMenuView f3230d;

    /* renamed from: e, reason: collision with root package name */
    public J f3231e;

    /* renamed from: f, reason: collision with root package name */
    public J f3232f;

    /* renamed from: g, reason: collision with root package name */
    public C0339v f3233g;
    public C0341w h;

    /* renamed from: i, reason: collision with root package name */
    public final Drawable f3234i;

    /* renamed from: j, reason: collision with root package name */
    public final CharSequence f3235j;

    /* renamed from: k, reason: collision with root package name */
    public C0339v f3236k;

    /* renamed from: l, reason: collision with root package name */
    public View f3237l;

    /* renamed from: m, reason: collision with root package name */
    public Context f3238m;

    /* renamed from: n, reason: collision with root package name */
    public int f3239n;

    /* renamed from: o, reason: collision with root package name */
    public int f3240o;

    /* renamed from: p, reason: collision with root package name */
    public int f3241p;

    /* renamed from: q, reason: collision with root package name */
    public final int f3242q;

    /* renamed from: r, reason: collision with root package name */
    public final int f3243r;

    /* renamed from: s, reason: collision with root package name */
    public int f3244s;

    /* renamed from: t, reason: collision with root package name */
    public int f3245t;

    /* renamed from: u, reason: collision with root package name */
    public int f3246u;

    /* renamed from: v, reason: collision with root package name */
    public int f3247v;

    /* renamed from: w, reason: collision with root package name */
    public C0342w0 f3248w;

    /* renamed from: x, reason: collision with root package name */
    public int f3249x;

    /* renamed from: y, reason: collision with root package name */
    public int f3250y;

    /* renamed from: z, reason: collision with root package name */
    public final int f3251z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static R0 g() {
        R0 r02 = new R0(-2, -2);
        r02.f4715b = 0;
        r02.f4714a = 8388627;
        return r02;
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i3 = 0; i3 < menu.size(); i3++) {
            arrayList.add(menu.getItem(i3));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new C0286e(getContext());
    }

    public static R0 h(ViewGroup.LayoutParams layoutParams) {
        boolean z3 = layoutParams instanceof R0;
        if (z3) {
            R0 r02 = (R0) layoutParams;
            R0 r03 = new R0(r02);
            r03.f4715b = 0;
            r03.f4715b = r02.f4715b;
            return r03;
        }
        if (z3) {
            R0 r04 = new R0((R0) layoutParams);
            r04.f4715b = 0;
            return r04;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            R0 r05 = new R0(layoutParams);
            r05.f4715b = 0;
            return r05;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        R0 r06 = new R0(marginLayoutParams);
        r06.f4715b = 0;
        ((ViewGroup.MarginLayoutParams) r06).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) r06).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) r06).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) r06).bottomMargin = marginLayoutParams.bottomMargin;
        return r06;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i3, ArrayList arrayList) {
        Field field = AbstractC0189K.f4150a;
        boolean z3 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i3, getLayoutDirection());
        arrayList.clear();
        if (!z3) {
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                R0 r02 = (R0) childAt.getLayoutParams();
                if (r02.f4715b == 0 && t(childAt) && i(r02.f4714a) == absoluteGravity) {
                    arrayList.add(childAt);
                }
            }
            return;
        }
        for (int i5 = childCount - 1; i5 >= 0; i5--) {
            View childAt2 = getChildAt(i5);
            R0 r03 = (R0) childAt2.getLayoutParams();
            if (r03.f4715b == 0 && t(childAt2) && i(r03.f4714a) == absoluteGravity) {
                arrayList.add(childAt2);
            }
        }
    }

    public final void b(View view, boolean z3) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        R0 g3 = layoutParams == null ? g() : !checkLayoutParams(layoutParams) ? h(layoutParams) : (R0) layoutParams;
        g3.f4715b = 1;
        if (!z3 || this.f3237l == null) {
            addView(view, g3);
        } else {
            view.setLayoutParams(g3);
            this.f3218H.add(view);
        }
    }

    public final void c() {
        if (this.f3236k == null) {
            C0339v c0339v = new C0339v(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f3236k = c0339v;
            c0339v.setImageDrawable(this.f3234i);
            this.f3236k.setContentDescription(this.f3235j);
            R0 g3 = g();
            g3.f4714a = (this.f3242q & 112) | 8388611;
            g3.f4715b = 2;
            this.f3236k.setLayoutParams(g3);
            this.f3236k.setOnClickListener(new O0(this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof R0);
    }

    public final void d() {
        if (this.f3248w == null) {
            C0342w0 c0342w0 = new C0342w0();
            c0342w0.f4892a = 0;
            c0342w0.f4893b = 0;
            c0342w0.f4894c = Integer.MIN_VALUE;
            c0342w0.f4895d = Integer.MIN_VALUE;
            c0342w0.f4896e = 0;
            c0342w0.f4897f = 0;
            c0342w0.f4898g = false;
            c0342w0.h = false;
            this.f3248w = c0342w0;
        }
    }

    public final void e() {
        if (this.f3230d == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f3230d = actionMenuView;
            actionMenuView.setPopupTheme(this.f3239n);
            this.f3230d.setOnMenuItemClickListener(this.f3222L);
            ActionMenuView actionMenuView2 = this.f3230d;
            N0 n02 = new N0(this);
            actionMenuView2.getClass();
            actionMenuView2.f3154w = n02;
            R0 g3 = g();
            g3.f4714a = (this.f3242q & 112) | 8388613;
            this.f3230d.setLayoutParams(g3);
            b(this.f3230d, false);
        }
        ActionMenuView actionMenuView3 = this.f3230d;
        if (actionMenuView3.f3150s == null) {
            i iVar = (i) actionMenuView3.getMenu();
            if (this.f3224N == null) {
                this.f3224N = new Q0(this);
            }
            this.f3230d.setExpandedActionViewsExclusive(true);
            iVar.b(this.f3224N, this.f3238m);
            u();
        }
    }

    public final void f() {
        if (this.f3233g == null) {
            this.f3233g = new C0339v(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            R0 g3 = g();
            g3.f4714a = (this.f3242q & 112) | 8388611;
            this.f3233g.setLayoutParams(g3);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return g();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return h(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        C0339v c0339v = this.f3236k;
        if (c0339v != null) {
            return c0339v.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C0339v c0339v = this.f3236k;
        if (c0339v != null) {
            return c0339v.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C0342w0 c0342w0 = this.f3248w;
        if (c0342w0 != null) {
            return c0342w0.f4898g ? c0342w0.f4892a : c0342w0.f4893b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i3 = this.f3250y;
        return i3 != Integer.MIN_VALUE ? i3 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C0342w0 c0342w0 = this.f3248w;
        if (c0342w0 != null) {
            return c0342w0.f4892a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        C0342w0 c0342w0 = this.f3248w;
        if (c0342w0 != null) {
            return c0342w0.f4893b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        C0342w0 c0342w0 = this.f3248w;
        if (c0342w0 != null) {
            return c0342w0.f4898g ? c0342w0.f4893b : c0342w0.f4892a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i3 = this.f3249x;
        return i3 != Integer.MIN_VALUE ? i3 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        i iVar;
        ActionMenuView actionMenuView = this.f3230d;
        return (actionMenuView == null || (iVar = actionMenuView.f3150s) == null || !iVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f3250y, 0));
    }

    public int getCurrentContentInsetLeft() {
        Field field = AbstractC0189K.f4150a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        Field field = AbstractC0189K.f4150a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f3249x, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C0341w c0341w = this.h;
        if (c0341w != null) {
            return c0341w.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C0341w c0341w = this.h;
        if (c0341w != null) {
            return c0341w.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f3230d.getMenu();
    }

    public View getNavButtonView() {
        return this.f3233g;
    }

    public CharSequence getNavigationContentDescription() {
        C0339v c0339v = this.f3233g;
        if (c0339v != null) {
            return c0339v.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C0339v c0339v = this.f3233g;
        if (c0339v != null) {
            return c0339v.getDrawable();
        }
        return null;
    }

    public C0312h getOuterActionMenuPresenter() {
        return null;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f3230d.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f3238m;
    }

    public int getPopupTheme() {
        return this.f3239n;
    }

    public CharSequence getSubtitle() {
        return this.f3212B;
    }

    public final TextView getSubtitleTextView() {
        return this.f3232f;
    }

    public CharSequence getTitle() {
        return this.f3211A;
    }

    public int getTitleMarginBottom() {
        return this.f3247v;
    }

    public int getTitleMarginEnd() {
        return this.f3245t;
    }

    public int getTitleMarginStart() {
        return this.f3244s;
    }

    public int getTitleMarginTop() {
        return this.f3246u;
    }

    public final TextView getTitleTextView() {
        return this.f3231e;
    }

    public T getWrapper() {
        Drawable drawable;
        if (this.f3223M == null) {
            U0 u02 = new U0();
            u02.f4730l = 0;
            u02.f4720a = this;
            u02.h = getTitle();
            u02.f4727i = getSubtitle();
            u02.f4726g = u02.h != null;
            u02.f4725f = getNavigationIcon();
            B0.a y3 = B0.a.y(getContext(), null, AbstractC0262a.f4291a, R.attr.actionBarStyle);
            u02.f4731m = y3.m(15);
            TypedArray typedArray = (TypedArray) y3.f272c;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                u02.f4726g = true;
                u02.h = text;
                if ((u02.f4721b & 8) != 0) {
                    Toolbar toolbar = u02.f4720a;
                    toolbar.setTitle(text);
                    if (u02.f4726g) {
                        AbstractC0189K.k(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                u02.f4727i = text2;
                if ((u02.f4721b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable m2 = y3.m(20);
            if (m2 != null) {
                u02.f4724e = m2;
                u02.c();
            }
            Drawable m3 = y3.m(17);
            if (m3 != null) {
                u02.f4723d = m3;
                u02.c();
            }
            if (u02.f4725f == null && (drawable = u02.f4731m) != null) {
                u02.f4725f = drawable;
                int i3 = u02.f4721b & 4;
                Toolbar toolbar2 = u02.f4720a;
                if (i3 != 0) {
                    toolbar2.setNavigationIcon(drawable);
                } else {
                    toolbar2.setNavigationIcon((Drawable) null);
                }
            }
            u02.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = u02.f4722c;
                if (view != null && (u02.f4721b & 16) != 0) {
                    removeView(view);
                }
                u02.f4722c = inflate;
                if (inflate != null && (u02.f4721b & 16) != 0) {
                    addView(inflate);
                }
                u02.a(u02.f4721b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int max = Math.max(dimensionPixelOffset, 0);
                int max2 = Math.max(dimensionPixelOffset2, 0);
                d();
                this.f3248w.a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f3240o = resourceId2;
                J j3 = this.f3231e;
                if (j3 != null) {
                    j3.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f3241p = resourceId3;
                J j4 = this.f3232f;
                if (j4 != null) {
                    j4.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            y3.C();
            if (R.string.abc_action_bar_up_description != u02.f4730l) {
                u02.f4730l = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i4 = u02.f4730l;
                    u02.f4728j = i4 != 0 ? getContext().getString(i4) : null;
                    u02.b();
                }
            }
            u02.f4728j = getNavigationContentDescription();
            setNavigationOnClickListener(new O0(u02));
            this.f3223M = u02;
        }
        return this.f3223M;
    }

    public final int i(int i3) {
        Field field = AbstractC0189K.f4150a;
        int layoutDirection = getLayoutDirection();
        int absoluteGravity = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
        return (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) ? absoluteGravity : layoutDirection == 1 ? 5 : 3;
    }

    public final int j(View view, int i3) {
        R0 r02 = (R0) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i3 > 0 ? (measuredHeight - i3) / 2 : 0;
        int i5 = r02.f4714a & 112;
        if (i5 != 16 && i5 != 48 && i5 != 80) {
            i5 = this.f3251z & 112;
        }
        if (i5 == 48) {
            return getPaddingTop() - i4;
        }
        if (i5 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) r02).bottomMargin) - i4;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i6 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i7 = ((ViewGroup.MarginLayoutParams) r02).topMargin;
        if (i6 < i7) {
            i6 = i7;
        } else {
            int i8 = (((height - paddingBottom) - measuredHeight) - i6) - paddingTop;
            int i9 = ((ViewGroup.MarginLayoutParams) r02).bottomMargin;
            if (i8 < i9) {
                i6 = Math.max(0, i6 - (i9 - i8));
            }
        }
        return paddingTop + i6;
    }

    public void m(int i3) {
        getMenuInflater().inflate(i3, getMenu());
    }

    public final void n() {
        Iterator it = this.f3221K.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it2 = ((CopyOnWriteArrayList) this.f3220J.f175e).iterator();
        if (it2.hasNext()) {
            it2.next().getClass();
            throw new ClassCastException();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f3221K = currentMenuItems2;
    }

    public final boolean o(View view) {
        return view.getParent() == this || this.f3218H.contains(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        u();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f3229S);
        u();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f3216F = false;
        }
        if (!this.f3216F) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f3216F = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f3216F = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x029b A[LOOP:0: B:40:0x0299->B:41:0x029b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02b8 A[LOOP:1: B:44:0x02b6->B:45:0x02b8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02d6 A[LOOP:2: B:48:0x02d4->B:49:0x02d6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0325 A[LOOP:3: B:57:0x0323->B:58:0x0325, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0222  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean a3 = Y0.a(this);
        int i12 = !a3 ? 1 : 0;
        int i13 = 0;
        if (t(this.f3233g)) {
            s(this.f3233g, i3, 0, i4, this.f3243r);
            i5 = k(this.f3233g) + this.f3233g.getMeasuredWidth();
            i6 = Math.max(0, l(this.f3233g) + this.f3233g.getMeasuredHeight());
            i7 = View.combineMeasuredStates(0, this.f3233g.getMeasuredState());
        } else {
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (t(this.f3236k)) {
            s(this.f3236k, i3, 0, i4, this.f3243r);
            i5 = k(this.f3236k) + this.f3236k.getMeasuredWidth();
            i6 = Math.max(i6, l(this.f3236k) + this.f3236k.getMeasuredHeight());
            i7 = View.combineMeasuredStates(i7, this.f3236k.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i5);
        int max2 = Math.max(0, currentContentInsetStart - i5);
        int[] iArr = this.f3219I;
        iArr[a3 ? 1 : 0] = max2;
        if (t(this.f3230d)) {
            s(this.f3230d, i3, max, i4, this.f3243r);
            i8 = k(this.f3230d) + this.f3230d.getMeasuredWidth();
            i6 = Math.max(i6, l(this.f3230d) + this.f3230d.getMeasuredHeight());
            i7 = View.combineMeasuredStates(i7, this.f3230d.getMeasuredState());
        } else {
            i8 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i8);
        iArr[i12] = Math.max(0, currentContentInsetEnd - i8);
        if (t(this.f3237l)) {
            max3 += r(this.f3237l, i3, max3, i4, 0, iArr);
            i6 = Math.max(i6, l(this.f3237l) + this.f3237l.getMeasuredHeight());
            i7 = View.combineMeasuredStates(i7, this.f3237l.getMeasuredState());
        }
        if (t(this.h)) {
            max3 += r(this.h, i3, max3, i4, 0, iArr);
            i6 = Math.max(i6, l(this.h) + this.h.getMeasuredHeight());
            i7 = View.combineMeasuredStates(i7, this.h.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (((R0) childAt.getLayoutParams()).f4715b == 0 && t(childAt)) {
                max3 += r(childAt, i3, max3, i4, 0, iArr);
                i6 = Math.max(i6, l(childAt) + childAt.getMeasuredHeight());
                i7 = View.combineMeasuredStates(i7, childAt.getMeasuredState());
            }
        }
        int i15 = this.f3246u + this.f3247v;
        int i16 = this.f3244s + this.f3245t;
        if (t(this.f3231e)) {
            r(this.f3231e, i3, max3 + i16, i4, i15, iArr);
            int k3 = k(this.f3231e) + this.f3231e.getMeasuredWidth();
            i9 = l(this.f3231e) + this.f3231e.getMeasuredHeight();
            i10 = View.combineMeasuredStates(i7, this.f3231e.getMeasuredState());
            i11 = k3;
        } else {
            i9 = 0;
            i10 = i7;
            i11 = 0;
        }
        if (t(this.f3232f)) {
            i11 = Math.max(i11, r(this.f3232f, i3, max3 + i16, i4, i9 + i15, iArr));
            i9 += l(this.f3232f) + this.f3232f.getMeasuredHeight();
            i10 = View.combineMeasuredStates(i10, this.f3232f.getMeasuredState());
        }
        int max4 = Math.max(i6, i9);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max4;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + max3 + i11, getSuggestedMinimumWidth()), i3, (-16777216) & i10);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i4, i10 << 16);
        if (this.f3225O) {
            int childCount2 = getChildCount();
            for (int i17 = 0; i17 < childCount2; i17++) {
                View childAt2 = getChildAt(i17);
                if (!t(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, i13);
        }
        i13 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i13);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof T0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        T0 t02 = (T0) parcelable;
        super.onRestoreInstanceState(t02.f4957d);
        ActionMenuView actionMenuView = this.f3230d;
        i iVar = actionMenuView != null ? actionMenuView.f3150s : null;
        int i3 = t02.f4716f;
        if (i3 != 0 && this.f3224N != null && iVar != null && (findItem = iVar.findItem(i3)) != null) {
            findItem.expandActionView();
        }
        if (t02.f4717g) {
            h hVar = this.f3229S;
            removeCallbacks(hVar);
            post(hVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i3) {
        super.onRtlPropertiesChanged(i3);
        d();
        C0342w0 c0342w0 = this.f3248w;
        boolean z3 = i3 == 1;
        if (z3 == c0342w0.f4898g) {
            return;
        }
        c0342w0.f4898g = z3;
        if (!c0342w0.h) {
            c0342w0.f4892a = c0342w0.f4896e;
            c0342w0.f4893b = c0342w0.f4897f;
            return;
        }
        if (z3) {
            int i4 = c0342w0.f4895d;
            if (i4 == Integer.MIN_VALUE) {
                i4 = c0342w0.f4896e;
            }
            c0342w0.f4892a = i4;
            int i5 = c0342w0.f4894c;
            if (i5 == Integer.MIN_VALUE) {
                i5 = c0342w0.f4897f;
            }
            c0342w0.f4893b = i5;
            return;
        }
        int i6 = c0342w0.f4894c;
        if (i6 == Integer.MIN_VALUE) {
            i6 = c0342w0.f4896e;
        }
        c0342w0.f4892a = i6;
        int i7 = c0342w0.f4895d;
        if (i7 == Integer.MIN_VALUE) {
            i7 = c0342w0.f4897f;
        }
        c0342w0.f4893b = i7;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0312h c0312h;
        C0306e c0306e;
        j jVar;
        T0 t02 = new T0(super.onSaveInstanceState());
        Q0 q02 = this.f3224N;
        if (q02 != null && (jVar = q02.f4712e) != null) {
            t02.f4716f = jVar.f4540a;
        }
        ActionMenuView actionMenuView = this.f3230d;
        t02.f4717g = (actionMenuView == null || (c0312h = actionMenuView.f3153v) == null || (c0306e = c0312h.f4793u) == null || !c0306e.b()) ? false : true;
        return t02;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f3215E = false;
        }
        if (!this.f3215E) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f3215E = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f3215E = false;
        }
        return true;
    }

    public final int p(View view, int i3, int i4, int[] iArr) {
        R0 r02 = (R0) view.getLayoutParams();
        int i5 = ((ViewGroup.MarginLayoutParams) r02).leftMargin - iArr[0];
        int max = Math.max(0, i5) + i3;
        iArr[0] = Math.max(0, -i5);
        int j3 = j(view, i4);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, j3, max + measuredWidth, view.getMeasuredHeight() + j3);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) r02).rightMargin + max;
    }

    public final int q(View view, int i3, int i4, int[] iArr) {
        R0 r02 = (R0) view.getLayoutParams();
        int i5 = ((ViewGroup.MarginLayoutParams) r02).rightMargin - iArr[1];
        int max = i3 - Math.max(0, i5);
        iArr[1] = Math.max(0, -i5);
        int j3 = j(view, i4);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, j3, max, view.getMeasuredHeight() + j3);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) r02).leftMargin);
    }

    public final int r(View view, int i3, int i4, int i5, int i6, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i7 = marginLayoutParams.leftMargin - iArr[0];
        int i8 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i8) + Math.max(0, i7);
        iArr[0] = Math.max(0, -i7);
        iArr[1] = Math.max(0, -i8);
        view.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + max + i4, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i5, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i6, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void s(View view, int i3, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i4, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i5, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i6 >= 0) {
            if (mode != 0) {
                i6 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i6);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public void setBackInvokedCallbackEnabled(boolean z3) {
        if (this.f3228R != z3) {
            this.f3228R = z3;
            u();
        }
    }

    public void setCollapseContentDescription(int i3) {
        setCollapseContentDescription(i3 != 0 ? getContext().getText(i3) : null);
    }

    public void setCollapseIcon(int i3) {
        setCollapseIcon(Z.b.r(getContext(), i3));
    }

    public void setCollapsible(boolean z3) {
        this.f3225O = z3;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i3) {
        if (i3 < 0) {
            i3 = Integer.MIN_VALUE;
        }
        if (i3 != this.f3250y) {
            this.f3250y = i3;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i3) {
        if (i3 < 0) {
            i3 = Integer.MIN_VALUE;
        }
        if (i3 != this.f3249x) {
            this.f3249x = i3;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i3) {
        setLogo(Z.b.r(getContext(), i3));
    }

    public void setLogoDescription(int i3) {
        setLogoDescription(getContext().getText(i3));
    }

    public void setNavigationContentDescription(int i3) {
        setNavigationContentDescription(i3 != 0 ? getContext().getText(i3) : null);
    }

    public void setNavigationIcon(int i3) {
        setNavigationIcon(Z.b.r(getContext(), i3));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        f();
        this.f3233g.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(S0 s02) {
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f3230d.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i3) {
        if (this.f3239n != i3) {
            this.f3239n = i3;
            if (i3 == 0) {
                this.f3238m = getContext();
            } else {
                this.f3238m = new ContextThemeWrapper(getContext(), i3);
            }
        }
    }

    public void setSubtitle(int i3) {
        setSubtitle(getContext().getText(i3));
    }

    public void setSubtitleTextColor(int i3) {
        setSubtitleTextColor(ColorStateList.valueOf(i3));
    }

    public void setTitle(int i3) {
        setTitle(getContext().getText(i3));
    }

    public void setTitleMarginBottom(int i3) {
        this.f3247v = i3;
        requestLayout();
    }

    public void setTitleMarginEnd(int i3) {
        this.f3245t = i3;
        requestLayout();
    }

    public void setTitleMarginStart(int i3) {
        this.f3244s = i3;
        requestLayout();
    }

    public void setTitleMarginTop(int i3) {
        this.f3246u = i3;
        requestLayout();
    }

    public void setTitleTextColor(int i3) {
        setTitleTextColor(ColorStateList.valueOf(i3));
    }

    public final boolean t(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final void u() {
        boolean z3;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        int i3 = 0;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a3 = P0.a(this);
            Q0 q02 = this.f3224N;
            if (q02 != null && q02.f4712e != null && a3 != null) {
                Field field = AbstractC0189K.f4150a;
                if (isAttachedToWindow() && this.f3228R) {
                    z3 = true;
                    if (!z3 && this.f3227Q == null) {
                        if (this.f3226P == null) {
                            this.f3226P = P0.b(new M0(this, i3));
                        }
                        P0.c(a3, this.f3226P);
                        this.f3227Q = a3;
                        return;
                    }
                    if (!z3 || (onBackInvokedDispatcher = this.f3227Q) == null) {
                    }
                    P0.d(onBackInvokedDispatcher, this.f3226P);
                    this.f3227Q = null;
                    return;
                }
            }
            z3 = false;
            if (!z3) {
            }
            if (z3) {
            }
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f3251z = 8388627;
        this.f3217G = new ArrayList();
        this.f3218H = new ArrayList();
        this.f3219I = new int[2];
        this.f3220J = new t(new M0(this, 1));
        this.f3221K = new ArrayList();
        this.f3222L = new N0(this);
        this.f3229S = new h(4, this);
        Context context2 = getContext();
        int[] iArr = AbstractC0262a.f4309t;
        B0.a y3 = B0.a.y(context2, attributeSet, iArr, R.attr.toolbarStyle);
        AbstractC0189K.i(this, context, iArr, attributeSet, (TypedArray) y3.f272c, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) y3.f272c;
        this.f3240o = typedArray.getResourceId(28, 0);
        this.f3241p = typedArray.getResourceId(19, 0);
        this.f3251z = typedArray.getInteger(0, 8388627);
        this.f3242q = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f3247v = dimensionPixelOffset;
        this.f3246u = dimensionPixelOffset;
        this.f3245t = dimensionPixelOffset;
        this.f3244s = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f3244s = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f3245t = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f3246u = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f3247v = dimensionPixelOffset5;
        }
        this.f3243r = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        C0342w0 c0342w0 = this.f3248w;
        c0342w0.h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            c0342w0.f4896e = dimensionPixelSize;
            c0342w0.f4892a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            c0342w0.f4897f = dimensionPixelSize2;
            c0342w0.f4893b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            c0342w0.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f3249x = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f3250y = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f3234i = y3.m(4);
        this.f3235j = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f3238m = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable m2 = y3.m(16);
        if (m2 != null) {
            setNavigationIcon(m2);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable m3 = y3.m(11);
        if (m3 != null) {
            setLogo(m3);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(y3.k(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(y3.k(20));
        }
        if (typedArray.hasValue(14)) {
            m(typedArray.getResourceId(14, 0));
        }
        y3.C();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        R0 r02 = new R0(context, attributeSet);
        r02.f4714a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0262a.f4292b);
        r02.f4714a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        r02.f4715b = 0;
        return r02;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        C0339v c0339v = this.f3236k;
        if (c0339v != null) {
            c0339v.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f3236k.setImageDrawable(drawable);
        } else {
            C0339v c0339v = this.f3236k;
            if (c0339v != null) {
                c0339v.setImageDrawable(this.f3234i);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.h == null) {
                this.h = new C0341w(getContext(), 0);
            }
            if (!o(this.h)) {
                b(this.h, true);
            }
        } else {
            C0341w c0341w = this.h;
            if (c0341w != null && o(c0341w)) {
                removeView(this.h);
                this.f3218H.remove(this.h);
            }
        }
        C0341w c0341w2 = this.h;
        if (c0341w2 != null) {
            c0341w2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.h == null) {
            this.h = new C0341w(getContext(), 0);
        }
        C0341w c0341w = this.h;
        if (c0341w != null) {
            c0341w.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            f();
        }
        C0339v c0339v = this.f3233g;
        if (c0339v != null) {
            c0339v.setContentDescription(charSequence);
            V0.a(this.f3233g, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            f();
            if (!o(this.f3233g)) {
                b(this.f3233g, true);
            }
        } else {
            C0339v c0339v = this.f3233g;
            if (c0339v != null && o(c0339v)) {
                removeView(this.f3233g);
                this.f3218H.remove(this.f3233g);
            }
        }
        C0339v c0339v2 = this.f3233g;
        if (c0339v2 != null) {
            c0339v2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            J j3 = this.f3232f;
            if (j3 != null && o(j3)) {
                removeView(this.f3232f);
                this.f3218H.remove(this.f3232f);
            }
        } else {
            if (this.f3232f == null) {
                Context context = getContext();
                J j4 = new J(context, null);
                this.f3232f = j4;
                j4.setSingleLine();
                this.f3232f.setEllipsize(TextUtils.TruncateAt.END);
                int i3 = this.f3241p;
                if (i3 != 0) {
                    this.f3232f.setTextAppearance(context, i3);
                }
                ColorStateList colorStateList = this.f3214D;
                if (colorStateList != null) {
                    this.f3232f.setTextColor(colorStateList);
                }
            }
            if (!o(this.f3232f)) {
                b(this.f3232f, true);
            }
        }
        J j5 = this.f3232f;
        if (j5 != null) {
            j5.setText(charSequence);
        }
        this.f3212B = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f3214D = colorStateList;
        J j3 = this.f3232f;
        if (j3 != null) {
            j3.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            J j3 = this.f3231e;
            if (j3 != null && o(j3)) {
                removeView(this.f3231e);
                this.f3218H.remove(this.f3231e);
            }
        } else {
            if (this.f3231e == null) {
                Context context = getContext();
                J j4 = new J(context, null);
                this.f3231e = j4;
                j4.setSingleLine();
                this.f3231e.setEllipsize(TextUtils.TruncateAt.END);
                int i3 = this.f3240o;
                if (i3 != 0) {
                    this.f3231e.setTextAppearance(context, i3);
                }
                ColorStateList colorStateList = this.f3213C;
                if (colorStateList != null) {
                    this.f3231e.setTextColor(colorStateList);
                }
            }
            if (!o(this.f3231e)) {
                b(this.f3231e, true);
            }
        }
        J j5 = this.f3231e;
        if (j5 != null) {
            j5.setText(charSequence);
        }
        this.f3211A = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f3213C = colorStateList;
        J j3 = this.f3231e;
        if (j3 != null) {
            j3.setTextColor(colorStateList);
        }
    }
}
