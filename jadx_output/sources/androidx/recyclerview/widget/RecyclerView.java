package androidx.recyclerview.widget;

import B0.a;
import B2.i;
import M1.h;
import S1.m;
import Z0.e;
import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import d1.AbstractC0189K;
import d1.AbstractC0229z;
import d1.C0214k;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import n.C0379F;
import n1.InterpolatorC0448d;
import s1.C0589c;
import z1.AbstractC0743q;
import z1.C0722A;
import z1.C0723B;
import z1.C0724C;
import z1.C0726E;
import z1.C0728b;
import z1.C0735i;
import z1.C0742p;
import z1.F;
import z1.G;
import z1.H;
import z1.I;
import z1.InterfaceC0725D;
import z1.K;
import z1.Q;
import z1.RunnableC0737k;
import z1.r;
import z1.s;
import z1.t;
import z1.u;
import z1.w;
import z1.x;
import z1.y;
import z1.z;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* renamed from: m0, reason: collision with root package name */
    public static final int[] f3506m0 = {R.attr.nestedScrollingEnabled};

    /* renamed from: n0, reason: collision with root package name */
    public static final Class[] f3507n0;

    /* renamed from: o0, reason: collision with root package name */
    public static final InterpolatorC0448d f3508o0;

    /* renamed from: A, reason: collision with root package name */
    public int f3509A;

    /* renamed from: B, reason: collision with root package name */
    public final int f3510B;

    /* renamed from: C, reason: collision with root package name */
    public s f3511C;

    /* renamed from: D, reason: collision with root package name */
    public EdgeEffect f3512D;

    /* renamed from: E, reason: collision with root package name */
    public EdgeEffect f3513E;

    /* renamed from: F, reason: collision with root package name */
    public EdgeEffect f3514F;

    /* renamed from: G, reason: collision with root package name */
    public EdgeEffect f3515G;

    /* renamed from: H, reason: collision with root package name */
    public t f3516H;

    /* renamed from: I, reason: collision with root package name */
    public int f3517I;

    /* renamed from: J, reason: collision with root package name */
    public int f3518J;

    /* renamed from: K, reason: collision with root package name */
    public VelocityTracker f3519K;

    /* renamed from: L, reason: collision with root package name */
    public int f3520L;

    /* renamed from: M, reason: collision with root package name */
    public int f3521M;

    /* renamed from: N, reason: collision with root package name */
    public int f3522N;

    /* renamed from: O, reason: collision with root package name */
    public int f3523O;

    /* renamed from: P, reason: collision with root package name */
    public int f3524P;

    /* renamed from: Q, reason: collision with root package name */
    public final int f3525Q;

    /* renamed from: R, reason: collision with root package name */
    public final int f3526R;

    /* renamed from: S, reason: collision with root package name */
    public final float f3527S;

    /* renamed from: T, reason: collision with root package name */
    public final float f3528T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f3529U;

    /* renamed from: V, reason: collision with root package name */
    public final H f3530V;

    /* renamed from: W, reason: collision with root package name */
    public RunnableC0737k f3531W;

    /* renamed from: a0, reason: collision with root package name */
    public final m f3532a0;

    /* renamed from: b0, reason: collision with root package name */
    public final F f3533b0;

    /* renamed from: c0, reason: collision with root package name */
    public z f3534c0;

    /* renamed from: d, reason: collision with root package name */
    public final C0724C f3535d;

    /* renamed from: d0, reason: collision with root package name */
    public ArrayList f3536d0;

    /* renamed from: e, reason: collision with root package name */
    public C0726E f3537e;

    /* renamed from: e0, reason: collision with root package name */
    public final C0742p f3538e0;

    /* renamed from: f, reason: collision with root package name */
    public final a f3539f;

    /* renamed from: f0, reason: collision with root package name */
    public K f3540f0;

    /* renamed from: g, reason: collision with root package name */
    public final a f3541g;

    /* renamed from: g0, reason: collision with root package name */
    public C0214k f3542g0;
    public final i h;

    /* renamed from: h0, reason: collision with root package name */
    public final int[] f3543h0;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3544i;
    public final int[] i0;

    /* renamed from: j, reason: collision with root package name */
    public final Rect f3545j;

    /* renamed from: j0, reason: collision with root package name */
    public final int[] f3546j0;

    /* renamed from: k, reason: collision with root package name */
    public final Rect f3547k;
    public final ArrayList k0;

    /* renamed from: l, reason: collision with root package name */
    public w f3548l;

    /* renamed from: l0, reason: collision with root package name */
    public final h f3549l0;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f3550m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f3551n;

    /* renamed from: o, reason: collision with root package name */
    public C0735i f3552o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3553p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3554q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3555r;

    /* renamed from: s, reason: collision with root package name */
    public int f3556s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f3557t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3558u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f3559v;

    /* renamed from: w, reason: collision with root package name */
    public int f3560w;

    /* renamed from: x, reason: collision with root package name */
    public final AccessibilityManager f3561x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f3562y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f3563z;

    static {
        Class cls = Integer.TYPE;
        f3507n0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f3508o0 = new InterpolatorC0448d(1);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.ai.assistance.operit.provider.R.attr.recyclerViewStyle);
    }

    public static void d(I i3) {
        WeakReference weakReference = i3.f6971a;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            i3.f6971a = null;
        }
    }

    private C0214k getScrollingChildHelper() {
        if (this.f3542g0 == null) {
            this.f3542g0 = new C0214k(this);
        }
        return this.f3542g0;
    }

    public static I r(View view) {
        if (view == null) {
            return null;
        }
        ((x) view.getLayoutParams()).getClass();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A(int r12, int r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A(int, int, android.view.MotionEvent):boolean");
    }

    public final void B(int i3, int i4, boolean z3) {
        int i5;
        w wVar = this.f3548l;
        if (wVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f3558u) {
            return;
        }
        int i6 = !wVar.b() ? 0 : i3;
        int i7 = !this.f3548l.c() ? 0 : i4;
        if (i6 == 0 && i7 == 0) {
            return;
        }
        if (z3) {
            int i8 = i6 != 0 ? 1 : 0;
            if (i7 != 0) {
                i8 |= 2;
            }
            getScrollingChildHelper().g(i8, 1);
        }
        H h = this.f3530V;
        RecyclerView recyclerView = h.f6970j;
        int abs = Math.abs(i6);
        int abs2 = Math.abs(i7);
        boolean z4 = abs > abs2;
        int sqrt = (int) Math.sqrt(0);
        int sqrt2 = (int) Math.sqrt((i7 * i7) + (i6 * i6));
        int width = z4 ? recyclerView.getWidth() : recyclerView.getHeight();
        int i9 = width / 2;
        float f3 = width;
        float f4 = i9;
        float sin = (((float) Math.sin((Math.min(1.0f, (sqrt2 * 1.0f) / f3) - 0.5f) * 0.47123894f)) * f4) + f4;
        if (sqrt > 0) {
            i5 = Math.round(Math.abs(sin / sqrt) * 1000.0f) * 4;
        } else {
            if (!z4) {
                abs = abs2;
            }
            i5 = (int) (((abs / f3) + 1.0f) * 300.0f);
        }
        int min = Math.min(i5, 2000);
        InterpolatorC0448d interpolatorC0448d = f3508o0;
        if (h.f6968g != interpolatorC0448d) {
            h.f6968g = interpolatorC0448d;
            h.f6967f = new OverScroller(recyclerView.getContext(), interpolatorC0448d);
        }
        h.f6966e = 0;
        h.f6965d = 0;
        recyclerView.setScrollState(2);
        h.f6967f.startScroll(0, 0, i6, i7, min);
        h.a();
    }

    public final void C() {
        int i3 = this.f3556s + 1;
        this.f3556s = i3;
        if (i3 != 1 || this.f3558u) {
            return;
        }
        this.f3557t = false;
    }

    public final void D(boolean z3) {
        if (this.f3556s < 1) {
            this.f3556s = 1;
        }
        if (!z3 && !this.f3558u) {
            this.f3557t = false;
        }
        int i3 = this.f3556s;
        if (i3 == 1) {
            if (z3) {
                boolean z4 = this.f3557t;
            }
            if (!this.f3558u) {
                this.f3557t = false;
            }
        }
        this.f3556s = i3 - 1;
    }

    public final void E(int i3) {
        getScrollingChildHelper().h(i3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i3, int i4) {
        w wVar = this.f3548l;
        if (wVar != null) {
            wVar.getClass();
        }
        super.addFocusables(arrayList, i3, i4);
    }

    public final void c(String str) {
        if (t()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + o());
        }
        if (this.f3510B > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + o()));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof x) && this.f3548l.d((x) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        w wVar = this.f3548l;
        if (wVar != null && wVar.b()) {
            return this.f3548l.f(this.f3533b0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        w wVar = this.f3548l;
        if (wVar != null && wVar.b()) {
            return this.f3548l.g(this.f3533b0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        w wVar = this.f3548l;
        if (wVar != null && wVar.b()) {
            return this.f3548l.h(this.f3533b0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        w wVar = this.f3548l;
        if (wVar != null && wVar.c()) {
            return this.f3548l.i(this.f3533b0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        w wVar = this.f3548l;
        if (wVar != null && wVar.c()) {
            return this.f3548l.j(this.f3533b0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        w wVar = this.f3548l;
        if (wVar != null && wVar.c()) {
            return this.f3548l.k(this.f3533b0);
        }
        return 0;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f3, float f4, boolean z3) {
        return getScrollingChildHelper().a(f3, f4, z3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f3, float f4) {
        return getScrollingChildHelper().b(f3, f4);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i3, int i4, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i3, i4, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i3, int i4, int i5, int i6, int[] iArr) {
        return getScrollingChildHelper().d(i3, i4, i5, i6, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z3;
        super.draw(canvas);
        ArrayList arrayList = this.f3550m;
        int size = arrayList.size();
        boolean z4 = false;
        for (int i3 = 0; i3 < size; i3++) {
            ((u) arrayList.get(i3)).b(canvas, this);
        }
        EdgeEffect edgeEffect = this.f3512D;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z3 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f3544i ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f3512D;
            z3 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f3513E;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f3544i) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f3513E;
            z3 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f3514F;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f3544i ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f3514F;
            z3 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f3515G;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f3544i) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f3515G;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z4 = true;
            }
            z3 |= z4;
            canvas.restoreToCount(save4);
        }
        if ((z3 || this.f3516H == null || arrayList.size() <= 0 || !this.f3516H.d()) ? z3 : true) {
            Field field = AbstractC0189K.f4150a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        return super.drawChild(canvas, view, j3);
    }

    public final void e(int i3, int i4) {
        boolean z3;
        EdgeEffect edgeEffect = this.f3512D;
        if (edgeEffect == null || edgeEffect.isFinished() || i3 <= 0) {
            z3 = false;
        } else {
            this.f3512D.onRelease();
            z3 = this.f3512D.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f3514F;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i3 < 0) {
            this.f3514F.onRelease();
            z3 |= this.f3514F.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f3513E;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i4 > 0) {
            this.f3513E.onRelease();
            z3 |= this.f3513E.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f3515G;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i4 < 0) {
            this.f3515G.onRelease();
            z3 |= this.f3515G.isFinished();
        }
        if (z3) {
            Field field = AbstractC0189K.f4150a;
            postInvalidateOnAnimation();
        }
    }

    public final void f() {
        a aVar = this.f3539f;
        if (!this.f3555r || this.f3562y) {
            int i3 = e.f2904a;
            Trace.beginSection("RV FullInvalidate");
            h();
            Trace.endSection();
            return;
        }
        if (aVar.v()) {
            aVar.getClass();
            if (aVar.v()) {
                int i4 = e.f2904a;
                Trace.beginSection("RV FullInvalidate");
                h();
                Trace.endSection();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00bf, code lost:
    
        if (r4 > 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00de, code lost:
    
        if (r7 > 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e2, code lost:
    
        if (r4 < 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e6, code lost:
    
        if (r7 < 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ef, code lost:
    
        if ((r7 * r3) < 0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00f8, code lost:
    
        if ((r7 * r3) > 0) goto L86;
     */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View focusSearch(android.view.View r13, int r14) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final void g(int i3, int i4) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        Field field = AbstractC0189K.f4150a;
        setMeasuredDimension(w.e(i3, paddingRight, getMinimumWidth()), w.e(i4, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        w wVar = this.f3548l;
        if (wVar != null) {
            return wVar.l();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + o());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        w wVar = this.f3548l;
        if (wVar != null) {
            return wVar.m(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + o());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC0743q getAdapter() {
        return null;
    }

    @Override // android.view.View
    public int getBaseline() {
        w wVar = this.f3548l;
        if (wVar == null) {
            return super.getBaseline();
        }
        wVar.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i3, int i4) {
        return super.getChildDrawingOrder(i3, i4);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f3544i;
    }

    public K getCompatAccessibilityDelegate() {
        return this.f3540f0;
    }

    public s getEdgeEffectFactory() {
        return this.f3511C;
    }

    public t getItemAnimator() {
        return this.f3516H;
    }

    public int getItemDecorationCount() {
        return this.f3550m.size();
    }

    public w getLayoutManager() {
        return this.f3548l;
    }

    public int getMaxFlingVelocity() {
        return this.f3526R;
    }

    public int getMinFlingVelocity() {
        return this.f3525Q;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public y getOnFlingListener() {
        return null;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f3529U;
    }

    public C0723B getRecycledViewPool() {
        return this.f3535d.b();
    }

    public int getScrollState() {
        return this.f3517I;
    }

    public final void h() {
        Log.e("RecyclerView", "No adapter attached; skipping layout");
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final boolean i(int i3, int i4, int i5, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i3, i4, i5, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f3553p;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f3558u;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f4225d;
    }

    public final void j(int i3, int i4, int i5, int i6, int[] iArr, int i7, int[] iArr2) {
        getScrollingChildHelper().d(i3, i4, i5, i6, iArr, i7, iArr2);
    }

    public final void k() {
        if (this.f3515G != null) {
            return;
        }
        this.f3511C.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f3515G = edgeEffect;
        if (this.f3544i) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void l() {
        if (this.f3512D != null) {
            return;
        }
        this.f3511C.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f3512D = edgeEffect;
        if (this.f3544i) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void m() {
        if (this.f3514F != null) {
            return;
        }
        this.f3511C.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f3514F = edgeEffect;
        if (this.f3544i) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void n() {
        if (this.f3513E != null) {
            return;
        }
        this.f3511C.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f3513E = edgeEffect;
        if (this.f3544i) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String o() {
        return " " + super.toString() + ", adapter:" + ((Object) null) + ", layout:" + this.f3548l + ", context:" + getContext();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r1 >= 30.0f) goto L19;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.f3509A = r0
            r1 = 1
            r5.f3553p = r1
            boolean r2 = r5.f3555r
            if (r2 == 0) goto L14
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L14
            r0 = r1
        L14:
            r5.f3555r = r0
            z1.w r0 = r5.f3548l
            if (r0 == 0) goto L1c
            r0.f7085e = r1
        L1c:
            java.lang.ThreadLocal r0 = z1.RunnableC0737k.h
            java.lang.Object r1 = r0.get()
            z1.k r1 = (z1.RunnableC0737k) r1
            r5.f3531W = r1
            if (r1 != 0) goto L64
            z1.k r1 = new z1.k
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f7057d = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f7060g = r2
            r5.f3531W = r1
            java.lang.reflect.Field r1 = d1.AbstractC0189K.f4150a
            android.view.Display r1 = r5.getDisplay()
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L56
            if (r1 == 0) goto L56
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L56
            goto L58
        L56:
            r1 = 1114636288(0x42700000, float:60.0)
        L58:
            z1.k r2 = r5.f3531W
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f7059f = r3
            r0.set(r2)
        L64:
            z1.k r0 = r5.f3531W
            java.util.ArrayList r0 = r0.f7057d
            r0.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t tVar = this.f3516H;
        if (tVar != null) {
            tVar.c();
        }
        setScrollState(0);
        H h = this.f3530V;
        h.f6970j.removeCallbacks(h);
        h.f6967f.abortAnimation();
        this.f3553p = false;
        w wVar = this.f3548l;
        if (wVar != null) {
            wVar.f7085e = false;
            wVar.B(this);
        }
        this.k0.clear();
        removeCallbacks(this.f3549l0);
        this.h.getClass();
        while (Q.f7005b.a() != null) {
        }
        RunnableC0737k runnableC0737k = this.f3531W;
        if (runnableC0737k != null) {
            runnableC0737k.f7057d.remove(this);
            this.f3531W = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f3550m;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((u) arrayList.get(i3)).getClass();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            z1.w r0 = r5.f3548l
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.f3558u
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L77
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3e
            z1.w r0 = r5.f3548l
            boolean r0 = r0.c()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = r2
        L2d:
            z1.w r3 = r5.f3548l
            boolean r3 = r3.b()
            if (r3 == 0) goto L3c
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L64
        L3c:
            r3 = r2
            goto L64
        L3e:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L62
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            z1.w r3 = r5.f3548l
            boolean r3 = r3.c()
            if (r3 == 0) goto L57
            float r0 = -r0
            goto L3c
        L57:
            z1.w r3 = r5.f3548l
            boolean r3 = r3.b()
            if (r3 == 0) goto L62
            r3 = r0
            r0 = r2
            goto L64
        L62:
            r0 = r2
            r3 = r0
        L64:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L77
        L6c:
            float r2 = r5.f3527S
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.f3528T
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.A(r2, r0, r6)
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z3;
        if (this.f3558u) {
            return false;
        }
        this.f3552o = null;
        if (q(motionEvent)) {
            z();
            setScrollState(0);
            return true;
        }
        w wVar = this.f3548l;
        if (wVar == null) {
            return false;
        }
        boolean b3 = wVar.b();
        boolean c3 = this.f3548l.c();
        if (this.f3519K == null) {
            this.f3519K = VelocityTracker.obtain();
        }
        this.f3519K.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f3559v) {
                this.f3559v = false;
            }
            this.f3518J = motionEvent.getPointerId(0);
            int x3 = (int) (motionEvent.getX() + 0.5f);
            this.f3522N = x3;
            this.f3520L = x3;
            int y3 = (int) (motionEvent.getY() + 0.5f);
            this.f3523O = y3;
            this.f3521M = y3;
            if (this.f3517I == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                E(1);
            }
            int[] iArr = this.i0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i3 = b3;
            if (c3) {
                i3 = (b3 ? 1 : 0) | 2;
            }
            getScrollingChildHelper().g(i3, 0);
        } else if (actionMasked == 1) {
            this.f3519K.clear();
            E(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f3518J);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f3518J + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x4 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y4 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f3517I != 1) {
                int i4 = x4 - this.f3520L;
                int i5 = y4 - this.f3521M;
                if (b3 == 0 || Math.abs(i4) <= this.f3524P) {
                    z3 = false;
                } else {
                    this.f3522N = x4;
                    z3 = true;
                }
                if (c3 && Math.abs(i5) > this.f3524P) {
                    this.f3523O = y4;
                    z3 = true;
                }
                if (z3) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            z();
            setScrollState(0);
        } else if (actionMasked == 5) {
            this.f3518J = motionEvent.getPointerId(actionIndex);
            int x5 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f3522N = x5;
            this.f3520L = x5;
            int y5 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f3523O = y5;
            this.f3521M = y5;
        } else if (actionMasked == 6) {
            w(motionEvent);
        }
        return this.f3517I == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        int i7 = e.f2904a;
        Trace.beginSection("RV OnLayout");
        h();
        Trace.endSection();
        this.f3555r = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        w wVar = this.f3548l;
        if (wVar == null) {
            g(i3, i4);
            return;
        }
        if (wVar.A()) {
            View.MeasureSpec.getMode(i3);
            View.MeasureSpec.getMode(i4);
            this.f3548l.f7082b.g(i3, i4);
        } else {
            if (this.f3554q) {
                this.f3548l.f7082b.g(i3, i4);
                return;
            }
            F f3 = this.f3533b0;
            if (f3.f6964j) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            f3.f6959d = 0;
            C();
            this.f3548l.f7082b.g(i3, i4);
            D(false);
            f3.f6961f = false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i3, Rect rect) {
        if (t()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i3, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C0726E)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0726E c0726e = (C0726E) parcelable;
        this.f3537e = c0726e;
        super.onRestoreInstanceState(c0726e.f4957d);
        w wVar = this.f3548l;
        if (wVar == null || (parcelable2 = this.f3537e.f6955f) == null) {
            return;
        }
        wVar.F(parcelable2);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0726E c0726e = new C0726E(super.onSaveInstanceState());
        C0726E c0726e2 = this.f3537e;
        if (c0726e2 != null) {
            c0726e.f6955f = c0726e2.f6955f;
        } else {
            w wVar = this.f3548l;
            if (wVar != null) {
                c0726e.f6955f = wVar.G();
            } else {
                c0726e.f6955f = null;
            }
        }
        return c0726e;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i4, int i5, int i6) {
        super.onSizeChanged(i3, i4, i5, i6);
        if (i3 == i5 && i4 == i6) {
            return;
        }
        this.f3515G = null;
        this.f3513E = null;
        this.f3514F = null;
        this.f3512D = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x020f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instructions count: 911
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View p(android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            goto L18
        L17:
            r3 = 0
        L18:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.p(android.view.View):android.view.View");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(android.view.MotionEvent r12) {
        /*
            r11 = this;
            int r0 = r12.getAction()
            java.util.ArrayList r1 = r11.f3551n
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        Lc:
            if (r4 >= r2) goto L64
            java.lang.Object r5 = r1.get(r4)
            z1.i r5 = (z1.C0735i) r5
            int r6 = r5.f7044q
            r7 = 1
            r8 = 2
            if (r6 != r7) goto L59
            float r6 = r12.getX()
            float r9 = r12.getY()
            boolean r6 = r5.d(r6, r9)
            float r9 = r12.getX()
            float r10 = r12.getY()
            boolean r9 = r5.c(r9, r10)
            int r10 = r12.getAction()
            if (r10 != 0) goto L61
            if (r6 != 0) goto L3c
            if (r9 == 0) goto L61
        L3c:
            if (r9 == 0) goto L49
            r5.f7045r = r7
            float r6 = r12.getX()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.f7038k = r6
            goto L55
        L49:
            if (r6 == 0) goto L55
            r5.f7045r = r8
            float r6 = r12.getY()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.f7037j = r6
        L55:
            r5.f(r8)
            goto L5b
        L59:
            if (r6 != r8) goto L61
        L5b:
            r6 = 3
            if (r0 == r6) goto L61
            r11.f3552o = r5
            return r7
        L61:
            int r4 = r4 + 1
            goto Lc
        L64:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.q(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z3) {
        r(view);
        view.clearAnimation();
        r(view);
        super.removeDetachedView(view, z3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        this.f3548l.getClass();
        if (!t() && view2 != null) {
            y(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z3) {
        return this.f3548l.K(this, view, rect, z3, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z3) {
        ArrayList arrayList = this.f3551n;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((C0735i) arrayList.get(i3)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z3);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f3556s != 0 || this.f3558u) {
            this.f3557t = true;
        } else {
            super.requestLayout();
        }
    }

    public final boolean s() {
        return !this.f3555r || this.f3562y || this.f3539f.v();
    }

    @Override // android.view.View
    public final void scrollBy(int i3, int i4) {
        w wVar = this.f3548l;
        if (wVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f3558u) {
            return;
        }
        boolean b3 = wVar.b();
        boolean c3 = this.f3548l.c();
        if (b3 || c3) {
            if (!b3) {
                i3 = 0;
            }
            if (!c3) {
                i4 = 0;
            }
            A(i3, i4, null);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i3, int i4) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!t()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.f3560w |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(K k3) {
        this.f3540f0 = k3;
        AbstractC0189K.j(this, k3);
    }

    public void setAdapter(AbstractC0743q abstractC0743q) {
        setLayoutFrozen(false);
        t tVar = this.f3516H;
        if (tVar != null) {
            tVar.c();
        }
        w wVar = this.f3548l;
        C0724C c0724c = this.f3535d;
        if (wVar != null) {
            wVar.I(c0724c);
            this.f3548l.J(c0724c);
        }
        c0724c.f6948a.clear();
        c0724c.c();
        a aVar = this.f3539f;
        aVar.D((ArrayList) aVar.f272c);
        aVar.D((ArrayList) aVar.f273d);
        c0724c.f6948a.clear();
        c0724c.c();
        C0723B b3 = c0724c.b();
        if (b3.f6947b == 0) {
            int i3 = 0;
            while (true) {
                SparseArray sparseArray = b3.f6946a;
                if (i3 >= sparseArray.size()) {
                    break;
                }
                ((C0722A) sparseArray.valueAt(i3)).f6943a.clear();
                i3++;
            }
        }
        this.f3533b0.f6960e = true;
        this.f3563z = false | this.f3563z;
        this.f3562y = true;
        int t3 = this.f3541g.t();
        for (int i4 = 0; i4 < t3; i4++) {
            r(this.f3541g.s(i4));
        }
        u();
        C0724C c0724c2 = this.f3535d;
        ArrayList arrayList = c0724c2.f6950c;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
        }
        c0724c2.f6954g.getClass();
        c0724c2.c();
        requestLayout();
    }

    public void setChildDrawingOrderCallback(r rVar) {
        if (rVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z3) {
        if (z3 != this.f3544i) {
            this.f3515G = null;
            this.f3513E = null;
            this.f3514F = null;
            this.f3512D = null;
        }
        this.f3544i = z3;
        super.setClipToPadding(z3);
        if (this.f3555r) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(s sVar) {
        sVar.getClass();
        this.f3511C = sVar;
        this.f3515G = null;
        this.f3513E = null;
        this.f3514F = null;
        this.f3512D = null;
    }

    public void setHasFixedSize(boolean z3) {
        this.f3554q = z3;
    }

    public void setItemAnimator(t tVar) {
        t tVar2 = this.f3516H;
        if (tVar2 != null) {
            tVar2.c();
            this.f3516H.f7073a = null;
        }
        this.f3516H = tVar;
        if (tVar != null) {
            tVar.f7073a = this.f3538e0;
        }
    }

    public void setItemViewCacheSize(int i3) {
        C0724C c0724c = this.f3535d;
        c0724c.f6951d = i3;
        c0724c.i();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z3) {
        suppressLayout(z3);
    }

    public void setLayoutManager(w wVar) {
        RecyclerView recyclerView;
        if (wVar == this.f3548l) {
            return;
        }
        setScrollState(0);
        H h = this.f3530V;
        h.f6970j.removeCallbacks(h);
        h.f6967f.abortAnimation();
        w wVar2 = this.f3548l;
        C0724C c0724c = this.f3535d;
        if (wVar2 != null) {
            t tVar = this.f3516H;
            if (tVar != null) {
                tVar.c();
            }
            this.f3548l.I(c0724c);
            this.f3548l.J(c0724c);
            c0724c.f6948a.clear();
            c0724c.c();
            if (this.f3553p) {
                w wVar3 = this.f3548l;
                wVar3.f7085e = false;
                wVar3.B(this);
            }
            this.f3548l.M(null);
            this.f3548l = null;
        } else {
            c0724c.f6948a.clear();
            c0724c.c();
        }
        a aVar = this.f3541g;
        ((C0728b) aVar.f272c).f();
        ArrayList arrayList = (ArrayList) aVar.f273d;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = ((C0742p) aVar.f271b).f7072a;
            if (size < 0) {
                break;
            }
            r((View) arrayList.get(size));
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f3548l = wVar;
        if (wVar != null) {
            if (wVar.f7082b != null) {
                throw new IllegalArgumentException("LayoutManager " + wVar + " is already attached to a RecyclerView:" + wVar.f7082b.o());
            }
            wVar.M(this);
            if (this.f3553p) {
                this.f3548l.f7085e = true;
            }
        }
        c0724c.i();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z3) {
        C0214k scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f4225d) {
            Field field = AbstractC0189K.f4150a;
            AbstractC0229z.z(scrollingChildHelper.f4224c);
        }
        scrollingChildHelper.f4225d = z3;
    }

    public void setOnFlingListener(y yVar) {
    }

    @Deprecated
    public void setOnScrollListener(z zVar) {
        this.f3534c0 = zVar;
    }

    public void setPreserveFocusAfterLayout(boolean z3) {
        this.f3529U = z3;
    }

    public void setRecycledViewPool(C0723B c0723b) {
        C0724C c0724c = this.f3535d;
        if (c0724c.f6953f != null) {
            r1.f6947b--;
        }
        c0724c.f6953f = c0723b;
        if (c0723b != null) {
            c0724c.f6954g.getAdapter();
        }
    }

    public void setRecyclerListener(InterfaceC0725D interfaceC0725D) {
    }

    public void setScrollState(int i3) {
        if (i3 == this.f3517I) {
            return;
        }
        this.f3517I = i3;
        if (i3 != 2) {
            H h = this.f3530V;
            h.f6970j.removeCallbacks(h);
            h.f6967f.abortAnimation();
        }
        w wVar = this.f3548l;
        if (wVar != null) {
            wVar.H(i3);
        }
        z zVar = this.f3534c0;
        if (zVar != null) {
            zVar.a(this, i3);
        }
        ArrayList arrayList = this.f3536d0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((z) this.f3536d0.get(size)).a(this, i3);
            }
        }
    }

    public void setScrollingTouchSlop(int i3) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i3 != 0) {
            if (i3 == 1) {
                this.f3524P = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i3 + "; using default value");
        }
        this.f3524P = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(G g3) {
        this.f3535d.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i3) {
        return getScrollingChildHelper().g(i3, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z3) {
        if (z3 != this.f3558u) {
            c("Do not suppressLayout in layout or scroll");
            if (!z3) {
                this.f3558u = false;
                this.f3557t = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f3558u = true;
            this.f3559v = true;
            setScrollState(0);
            H h = this.f3530V;
            h.f6970j.removeCallbacks(h);
            h.f6967f.abortAnimation();
        }
    }

    public final boolean t() {
        return this.f3509A > 0;
    }

    public final void u() {
        int t3 = this.f3541g.t();
        for (int i3 = 0; i3 < t3; i3++) {
            ((x) this.f3541g.s(i3).getLayoutParams()).f7089b = true;
        }
        ArrayList arrayList = this.f3535d.f6950c;
        if (arrayList.size() <= 0) {
            return;
        }
        ((I) arrayList.get(0)).getClass();
        throw null;
    }

    public final void v(boolean z3) {
        AccessibilityManager accessibilityManager;
        int i3 = this.f3509A - 1;
        this.f3509A = i3;
        if (i3 < 1) {
            this.f3509A = 0;
            if (z3) {
                int i4 = this.f3560w;
                this.f3560w = 0;
                if (i4 != 0 && (accessibilityManager = this.f3561x) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i4);
                    sendAccessibilityEventUnchecked(obtain);
                }
                ArrayList arrayList = this.k0;
                int size = arrayList.size() - 1;
                if (size < 0) {
                    arrayList.clear();
                } else {
                    ((I) arrayList.get(size)).getClass();
                    throw null;
                }
            }
        }
    }

    public final void w(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3518J) {
            int i3 = actionIndex == 0 ? 1 : 0;
            this.f3518J = motionEvent.getPointerId(i3);
            int x3 = (int) (motionEvent.getX(i3) + 0.5f);
            this.f3522N = x3;
            this.f3520L = x3;
            int y3 = (int) (motionEvent.getY(i3) + 0.5f);
            this.f3523O = y3;
            this.f3521M = y3;
        }
    }

    public final void x(I i3, C0589c c0589c) {
        i3.f6972b &= -8193;
        if (this.f3533b0.f6962g && i3.l() && !i3.i() && !i3.o()) {
            throw null;
        }
        C0379F c0379f = (C0379F) this.h.f316e;
        Q q3 = (Q) c0379f.get(i3);
        if (q3 == null) {
            q3 = Q.a();
            c0379f.put(i3, q3);
        }
        q3.getClass();
        q3.f7006a |= 4;
    }

    public final void y(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f3545j;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof x) {
            x xVar = (x) layoutParams;
            if (!xVar.f7089b) {
                int i3 = rect.left;
                Rect rect2 = xVar.f7088a;
                rect.left = i3 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f3548l.K(this, view, this.f3545j, !this.f3555r, view2 == null);
    }

    public final void z() {
        VelocityTracker velocityTracker = this.f3519K;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z3 = false;
        E(0);
        EdgeEffect edgeEffect = this.f3512D;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z3 = this.f3512D.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f3513E;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z3 |= this.f3513E.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f3514F;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z3 |= this.f3514F.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f3515G;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z3 |= this.f3515G.isFinished();
        }
        if (z3) {
            Field field = AbstractC0189K.f4150a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x03b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RecyclerView(android.content.Context r19, android.util.AttributeSet r20, int r21) {
        /*
            Method dump skipped, instructions count: 971
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        w wVar = this.f3548l;
        if (wVar != null) {
            return wVar.n(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + o());
    }
}
