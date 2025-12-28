package o0;

import A.C0008i;
import D.AbstractC0058q;
import D.C0052n;
import a2.ViewOnAttachStateChangeListenerC0115n;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import n0.C0410D;

/* renamed from: o0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0468a extends ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public WeakReference f5537d;

    /* renamed from: e, reason: collision with root package name */
    public IBinder f5538e;

    /* renamed from: f, reason: collision with root package name */
    public b1 f5539f;

    /* renamed from: g, reason: collision with root package name */
    public AbstractC0058q f5540g;
    public C0410D h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f5541i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f5542j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5543k;

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final void setParentContext(AbstractC0058q abstractC0058q) {
        if (this.f5540g != abstractC0058q) {
            this.f5540g = abstractC0058q;
            if (abstractC0058q != null) {
                this.f5537d = null;
            }
            b1 b1Var = this.f5539f;
            if (b1Var != null) {
                b1Var.e();
                this.f5539f = null;
                if (isAttachedToWindow()) {
                    c();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f5538e != iBinder) {
            this.f5538e = iBinder;
            this.f5537d = null;
        }
    }

    public abstract void a(int i3, C0052n c0052n);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        b();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        b();
        return super.addViewInLayout(view, i3, layoutParams);
    }

    public final void b() {
        if (this.f5542j) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final void c() {
        if (this.f5539f == null) {
            try {
                this.f5542j = true;
                this.f5539f = d1.a(this, d(), new L.a(-656146368, true, new C0008i(8, this)));
            } finally {
                this.f5542j = false;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006d, code lost:
    
        if (r2 > 0) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
    /* JADX WARN: Type inference failed for: r0v0, types: [D.q] */
    /* JADX WARN: Type inference failed for: r0v1, types: [D.q] */
    /* JADX WARN: Type inference failed for: r0v17, types: [D.v0] */
    /* JADX WARN: Type inference failed for: r0v2, types: [D.q] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [D.h0] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final D.AbstractC0058q d() {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.AbstractC0468a.d():D.q");
    }

    public final boolean getHasComposition() {
        return this.f5539f != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f5541i;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.f5543k || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            c();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i5 - i3) - getPaddingRight(), (i6 - i4) - getPaddingBottom());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        c();
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i3, i4);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i3) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i3)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i4) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i4)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i3) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        childAt.setLayoutDirection(i3);
    }

    public final void setParentCompositionContext(AbstractC0058q abstractC0058q) {
        setParentContext(abstractC0058q);
    }

    public final void setShowLayoutBounds(boolean z3) {
        this.f5541i = z3;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((C0507u) ((n0.e0) childAt)).setShowLayoutBounds(z3);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z3) {
        super.setTransitionGroup(z3);
        this.f5543k = true;
    }

    public final void setViewCompositionStrategy(E0 e02) {
        C0410D c0410d = this.h;
        if (c0410d != null) {
            c0410d.c();
        }
        ((AbstractC0461K) e02).getClass();
        ViewOnAttachStateChangeListenerC0115n viewOnAttachStateChangeListenerC0115n = new ViewOnAttachStateChangeListenerC0115n(4, this);
        addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0115n);
        X.d dVar = new X.d(4);
        Z.b.v(this).f4939a.add(dVar);
        this.h = new C0410D(this, viewOnAttachStateChangeListenerC0115n, dVar, 2);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i3) {
        b();
        super.addView(view, i3);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i3, ViewGroup.LayoutParams layoutParams, boolean z3) {
        b();
        return super.addViewInLayout(view, i3, layoutParams, z3);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i3, int i4) {
        b();
        super.addView(view, i3, i4);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, i3, layoutParams);
    }
}
