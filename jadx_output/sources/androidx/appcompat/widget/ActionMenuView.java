package androidx.appcompat.widget;

import A.t;
import X1.e;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import j.h;
import j.i;
import j.j;
import k.AbstractC0307e0;
import k.C0305d0;
import k.C0306e;
import k.C0310g;
import k.C0312h;
import k.C0316j;
import k.InterfaceC0314i;
import k.InterfaceC0318k;
import k.N0;
import k.Y0;

/* loaded from: classes.dex */
public class ActionMenuView extends AbstractC0307e0 implements h {

    /* renamed from: A, reason: collision with root package name */
    public final int f3148A;

    /* renamed from: B, reason: collision with root package name */
    public InterfaceC0318k f3149B;

    /* renamed from: s, reason: collision with root package name */
    public i f3150s;

    /* renamed from: t, reason: collision with root package name */
    public Context f3151t;

    /* renamed from: u, reason: collision with root package name */
    public int f3152u;

    /* renamed from: v, reason: collision with root package name */
    public C0312h f3153v;

    /* renamed from: w, reason: collision with root package name */
    public N0 f3154w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f3155x;

    /* renamed from: y, reason: collision with root package name */
    public int f3156y;

    /* renamed from: z, reason: collision with root package name */
    public final int f3157z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f3 = context.getResources().getDisplayMetrics().density;
        this.f3157z = (int) (56.0f * f3);
        this.f3148A = (int) (f3 * 4.0f);
        this.f3151t = context;
        this.f3152u = 0;
    }

    public static C0316j i() {
        C0316j c0316j = new C0316j(-2, -2);
        c0316j.f4800a = false;
        ((LinearLayout.LayoutParams) c0316j).gravity = 16;
        return c0316j;
    }

    public static C0316j j(ViewGroup.LayoutParams layoutParams) {
        C0316j c0316j;
        if (layoutParams == null) {
            return i();
        }
        if (layoutParams instanceof C0316j) {
            C0316j c0316j2 = (C0316j) layoutParams;
            c0316j = new C0316j(c0316j2);
            c0316j.f4800a = c0316j2.f4800a;
        } else {
            c0316j = new C0316j(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c0316j).gravity <= 0) {
            ((LinearLayout.LayoutParams) c0316j).gravity = 16;
        }
        return c0316j;
    }

    @Override // j.h
    public final boolean a(j jVar) {
        return this.f3150s.p(jVar, null, 0);
    }

    @Override // k.AbstractC0307e0, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0316j;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // k.AbstractC0307e0
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C0305d0 generateDefaultLayoutParams() {
        return i();
    }

    @Override // k.AbstractC0307e0
    /* renamed from: f */
    public final C0305d0 generateLayoutParams(AttributeSet attributeSet) {
        return new C0316j(getContext(), attributeSet);
    }

    @Override // k.AbstractC0307e0
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ C0305d0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    @Override // k.AbstractC0307e0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return i();
    }

    @Override // k.AbstractC0307e0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    public Menu getMenu() {
        if (this.f3150s == null) {
            Context context = getContext();
            i iVar = new i(context);
            this.f3150s = iVar;
            iVar.f4523e = new t(29, this);
            C0312h c0312h = new C0312h(context);
            this.f3153v = c0312h;
            c0312h.f4786n = true;
            c0312h.f4787o = true;
            c0312h.h = new e(18);
            this.f3150s.b(c0312h, this.f3151t);
            C0312h c0312h2 = this.f3153v;
            c0312h2.f4782j = this;
            this.f3150s = c0312h2.f4779f;
        }
        return this.f3150s;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C0312h c0312h = this.f3153v;
        C0310g c0310g = c0312h.f4783k;
        if (c0310g != null) {
            return c0310g.getDrawable();
        }
        if (c0312h.f4785m) {
            return c0312h.f4784l;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f3152u;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final boolean k(int i3) {
        boolean z3 = false;
        if (i3 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i3 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i3);
        if (i3 < getChildCount() && (childAt instanceof InterfaceC0314i)) {
            z3 = ((InterfaceC0314i) childAt).a();
        }
        return (i3 <= 0 || !(childAt2 instanceof InterfaceC0314i)) ? z3 : z3 | ((InterfaceC0314i) childAt2).b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0312h c0312h = this.f3153v;
        if (c0312h != null) {
            c0312h.g();
            C0306e c0306e = this.f3153v.f4793u;
            if (c0306e == null || !c0306e.b()) {
                return;
            }
            this.f3153v.e();
            this.f3153v.h();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0312h c0312h = this.f3153v;
        if (c0312h != null) {
            c0312h.e();
            C0306e c0306e = c0312h.f4794v;
            if (c0306e == null || !c0306e.b()) {
                return;
            }
            c0306e.f4574i.e();
        }
    }

    @Override // k.AbstractC0307e0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        int width;
        int i7;
        if (!this.f3155x) {
            super.onLayout(z3, i3, i4, i5, i6);
            return;
        }
        int childCount = getChildCount();
        int i8 = (i6 - i4) / 2;
        int dividerWidth = getDividerWidth();
        int i9 = i5 - i3;
        int paddingRight = (i9 - getPaddingRight()) - getPaddingLeft();
        boolean a3 = Y0.a(this);
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                C0316j c0316j = (C0316j) childAt.getLayoutParams();
                if (c0316j.f4800a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (k(i12)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a3) {
                        i7 = getPaddingLeft() + ((LinearLayout.LayoutParams) c0316j).leftMargin;
                        width = i7 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c0316j).rightMargin;
                        i7 = width - measuredWidth;
                    }
                    int i13 = i8 - (measuredHeight / 2);
                    childAt.layout(i7, i13, width, measuredHeight + i13);
                    paddingRight -= measuredWidth;
                    i10 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0316j).leftMargin) + ((LinearLayout.LayoutParams) c0316j).rightMargin;
                    k(i12);
                    i11++;
                }
            }
        }
        if (childCount == 1 && i10 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i14 = (i9 / 2) - (measuredWidth2 / 2);
            int i15 = i8 - (measuredHeight2 / 2);
            childAt2.layout(i14, i15, measuredWidth2 + i14, measuredHeight2 + i15);
            return;
        }
        int i16 = i11 - (i10 ^ 1);
        int max = Math.max(0, i16 > 0 ? paddingRight / i16 : 0);
        if (a3) {
            int width2 = getWidth() - getPaddingRight();
            for (int i17 = 0; i17 < childCount; i17++) {
                View childAt3 = getChildAt(i17);
                C0316j c0316j2 = (C0316j) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0316j2.f4800a) {
                    int i18 = width2 - ((LinearLayout.LayoutParams) c0316j2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i19 = i8 - (measuredHeight3 / 2);
                    childAt3.layout(i18 - measuredWidth3, i19, i18, measuredHeight3 + i19);
                    width2 = i18 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c0316j2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt4 = getChildAt(i20);
            C0316j c0316j3 = (C0316j) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0316j3.f4800a) {
                int i21 = paddingLeft + ((LinearLayout.LayoutParams) c0316j3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i22 = i8 - (measuredHeight4 / 2);
                childAt4.layout(i21, i22, i21 + measuredWidth4, measuredHeight4 + i22);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) c0316j3).rightMargin + max + i21;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v36 */
    @Override // k.AbstractC0307e0, android.view.View
    public final void onMeasure(int i3, int i4) {
        int i5;
        boolean z3;
        int i6;
        boolean z4;
        int i7;
        int i8;
        int i9;
        ?? r4;
        int i10;
        int i11;
        int i12;
        i iVar;
        boolean z5 = this.f3155x;
        boolean z6 = View.MeasureSpec.getMode(i3) == 1073741824;
        this.f3155x = z6;
        if (z5 != z6) {
            this.f3156y = 0;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (this.f3155x && (iVar = this.f3150s) != null && size != this.f3156y) {
            this.f3156y = size;
            iVar.o(true);
        }
        int childCount = getChildCount();
        if (!this.f3155x || childCount <= 0) {
            for (int i13 = 0; i13 < childCount; i13++) {
                C0316j c0316j = (C0316j) getChildAt(i13).getLayoutParams();
                ((LinearLayout.LayoutParams) c0316j).rightMargin = 0;
                ((LinearLayout.LayoutParams) c0316j).leftMargin = 0;
            }
            super.onMeasure(i3, i4);
            return;
        }
        int mode = View.MeasureSpec.getMode(i4);
        int size2 = View.MeasureSpec.getSize(i3);
        int size3 = View.MeasureSpec.getSize(i4);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i4, paddingBottom, -2);
        int i14 = size2 - paddingRight;
        int i15 = this.f3157z;
        int i16 = i14 / i15;
        int i17 = i14 % i15;
        if (i16 == 0) {
            setMeasuredDimension(i14, 0);
            return;
        }
        int i18 = (i17 / i16) + i15;
        int childCount2 = getChildCount();
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        boolean z7 = false;
        int i23 = 0;
        long j3 = 0;
        while (true) {
            i5 = this.f3148A;
            if (i22 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i22);
            int i24 = size3;
            int i25 = i14;
            if (childAt.getVisibility() == 8) {
                i10 = mode;
                i11 = paddingBottom;
            } else {
                boolean z8 = childAt instanceof ActionMenuItemView;
                int i26 = i20 + 1;
                if (z8) {
                    childAt.setPadding(i5, 0, i5, 0);
                }
                C0316j c0316j2 = (C0316j) childAt.getLayoutParams();
                c0316j2.f4805f = false;
                c0316j2.f4802c = 0;
                c0316j2.f4801b = 0;
                c0316j2.f4803d = false;
                ((LinearLayout.LayoutParams) c0316j2).leftMargin = 0;
                ((LinearLayout.LayoutParams) c0316j2).rightMargin = 0;
                c0316j2.f4804e = z8 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i27 = c0316j2.f4800a ? 1 : i16;
                C0316j c0316j3 = (C0316j) childAt.getLayoutParams();
                i10 = mode;
                i11 = paddingBottom;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z8 ? (ActionMenuItemView) childAt : null;
                boolean z9 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                if (i27 <= 0 || (z9 && i27 < 2)) {
                    i12 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i27 * i18, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i12 = measuredWidth / i18;
                    if (measuredWidth % i18 != 0) {
                        i12++;
                    }
                    if (z9 && i12 < 2) {
                        i12 = 2;
                    }
                }
                c0316j3.f4803d = !c0316j3.f4800a && z9;
                c0316j3.f4801b = i12;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i12 * i18, 1073741824), makeMeasureSpec);
                i21 = Math.max(i21, i12);
                if (c0316j2.f4803d) {
                    i23++;
                }
                if (c0316j2.f4800a) {
                    z7 = true;
                }
                i16 -= i12;
                i19 = Math.max(i19, childAt.getMeasuredHeight());
                if (i12 == 1) {
                    j3 |= 1 << i22;
                }
                i20 = i26;
            }
            i22++;
            size3 = i24;
            i14 = i25;
            paddingBottom = i11;
            mode = i10;
        }
        int i28 = mode;
        int i29 = i14;
        int i30 = size3;
        boolean z10 = z7 && i20 == 2;
        boolean z11 = false;
        while (i23 > 0 && i16 > 0) {
            int i31 = Integer.MAX_VALUE;
            int i32 = 0;
            int i33 = 0;
            long j4 = 0;
            while (i33 < childCount2) {
                C0316j c0316j4 = (C0316j) getChildAt(i33).getLayoutParams();
                boolean z12 = z11;
                if (c0316j4.f4803d) {
                    int i34 = c0316j4.f4801b;
                    if (i34 < i31) {
                        j4 = 1 << i33;
                        i31 = i34;
                        i32 = 1;
                    } else if (i34 == i31) {
                        j4 |= 1 << i33;
                        i32++;
                    }
                }
                i33++;
                z11 = z12;
            }
            z3 = z11;
            j3 |= j4;
            if (i32 > i16) {
                break;
            }
            int i35 = i31 + 1;
            int i36 = 0;
            while (i36 < childCount2) {
                View childAt2 = getChildAt(i36);
                C0316j c0316j5 = (C0316j) childAt2.getLayoutParams();
                int i37 = i19;
                int i38 = childMeasureSpec;
                int i39 = childCount2;
                long j5 = 1 << i36;
                if ((j4 & j5) != 0) {
                    if (z10 && c0316j5.f4804e) {
                        r4 = 1;
                        r4 = 1;
                        if (i16 == 1) {
                            childAt2.setPadding(i5 + i18, 0, i5, 0);
                        }
                    } else {
                        r4 = 1;
                    }
                    c0316j5.f4801b += r4;
                    c0316j5.f4805f = r4;
                    i16--;
                } else if (c0316j5.f4801b == i35) {
                    j3 |= j5;
                }
                i36++;
                childMeasureSpec = i38;
                i19 = i37;
                childCount2 = i39;
            }
            z11 = true;
        }
        z3 = z11;
        int i40 = i19;
        int i41 = childMeasureSpec;
        int i42 = childCount2;
        boolean z13 = !z7 && i20 == 1;
        if (i16 <= 0 || j3 == 0 || (i16 >= i20 - 1 && !z13 && i21 <= 1)) {
            i6 = i42;
            z4 = z3;
        } else {
            float bitCount = Long.bitCount(j3);
            if (!z13) {
                if ((j3 & 1) != 0 && !((C0316j) getChildAt(0).getLayoutParams()).f4804e) {
                    bitCount -= 0.5f;
                }
                int i43 = i42 - 1;
                if ((j3 & (1 << i43)) != 0 && !((C0316j) getChildAt(i43).getLayoutParams()).f4804e) {
                    bitCount -= 0.5f;
                }
            }
            int i44 = bitCount > 0.0f ? (int) ((i16 * i18) / bitCount) : 0;
            boolean z14 = z3;
            i6 = i42;
            for (int i45 = 0; i45 < i6; i45++) {
                if ((j3 & (1 << i45)) != 0) {
                    View childAt3 = getChildAt(i45);
                    C0316j c0316j6 = (C0316j) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c0316j6.f4802c = i44;
                        c0316j6.f4805f = true;
                        if (i45 == 0 && !c0316j6.f4804e) {
                            ((LinearLayout.LayoutParams) c0316j6).leftMargin = (-i44) / 2;
                        }
                        z14 = true;
                    } else {
                        if (c0316j6.f4800a) {
                            c0316j6.f4802c = i44;
                            c0316j6.f4805f = true;
                            ((LinearLayout.LayoutParams) c0316j6).rightMargin = (-i44) / 2;
                            z14 = true;
                        } else {
                            if (i45 != 0) {
                                ((LinearLayout.LayoutParams) c0316j6).leftMargin = i44 / 2;
                            }
                            if (i45 != i6 - 1) {
                                ((LinearLayout.LayoutParams) c0316j6).rightMargin = i44 / 2;
                            }
                        }
                    }
                }
            }
            z4 = z14;
        }
        if (z4) {
            int i46 = 0;
            while (i46 < i6) {
                View childAt4 = getChildAt(i46);
                C0316j c0316j7 = (C0316j) childAt4.getLayoutParams();
                if (c0316j7.f4805f) {
                    i9 = i41;
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c0316j7.f4801b * i18) + c0316j7.f4802c, 1073741824), i9);
                } else {
                    i9 = i41;
                }
                i46++;
                i41 = i9;
            }
        }
        if (i28 != 1073741824) {
            i8 = i29;
            i7 = i40;
        } else {
            i7 = i30;
            i8 = i29;
        }
        setMeasuredDimension(i8, i7);
    }

    public void setExpandedActionViewsExclusive(boolean z3) {
        this.f3153v.f4791s = z3;
    }

    public void setOnMenuItemClickListener(InterfaceC0318k interfaceC0318k) {
        this.f3149B = interfaceC0318k;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C0312h c0312h = this.f3153v;
        C0310g c0310g = c0312h.f4783k;
        if (c0310g != null) {
            c0310g.setImageDrawable(drawable);
        } else {
            c0312h.f4785m = true;
            c0312h.f4784l = drawable;
        }
    }

    public void setOverflowReserved(boolean z3) {
    }

    public void setPopupTheme(int i3) {
        if (this.f3152u != i3) {
            this.f3152u = i3;
            if (i3 == 0) {
                this.f3151t = getContext();
            } else {
                this.f3151t = new ContextThemeWrapper(getContext(), i3);
            }
        }
    }

    public void setPresenter(C0312h c0312h) {
        this.f3153v = c0312h;
        c0312h.f4782j = this;
        this.f3150s = c0312h.f4779f;
    }

    @Override // k.AbstractC0307e0, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0316j(getContext(), attributeSet);
    }
}
