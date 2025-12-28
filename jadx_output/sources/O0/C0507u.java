package o0;

import A.C0008i;
import D.AbstractC0028b;
import D.C0032d;
import D.C0037f0;
import D.C0059s;
import N.C0074b;
import W.C0080c;
import a.AbstractC0090a;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import androidx.lifecycle.InterfaceC0123d;
import c2.C0167f;
import c2.C0174m;
import c2.InterfaceC0162a;
import d1.AbstractC0189K;
import d1.AbstractC0190L;
import d2.AbstractC0239j;
import d2.AbstractC0240k;
import e0.InterfaceC0254a;
import f0.C0257a;
import f0.C0259c;
import f0.InterfaceC0258b;
import g2.InterfaceC0276i;
import h0.C0280c;
import j0.C0292a;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import l0.C0358h;
import m0.C0370b;
import n.C0375B;
import n.C0405y;
import n0.AbstractC0409C;
import n0.AbstractC0428i;
import n0.C0407A;
import n0.C0408B;
import n0.C0412F;
import n0.C0415I;
import n0.C0421b;
import n0.C0433n;
import n0.C0435p;
import n0.C0444z;
import p.AbstractC0537f;
import z0.AbstractC0718b;
import z0.InterfaceC0720d;
import z0.InterfaceC0721e;

/* renamed from: o0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0507u extends ViewGroup implements n0.e0, n0.k0, InterfaceC0123d {

    /* renamed from: A0, reason: collision with root package name */
    public static Class f5666A0;

    /* renamed from: B0, reason: collision with root package name */
    public static Method f5667B0;

    /* renamed from: A, reason: collision with root package name */
    public final Q.a f5668A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f5669B;

    /* renamed from: C, reason: collision with root package name */
    public final C0482h f5670C;

    /* renamed from: D, reason: collision with root package name */
    public final n0.g0 f5671D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f5672E;

    /* renamed from: F, reason: collision with root package name */
    public Z f5673F;

    /* renamed from: G, reason: collision with root package name */
    public C0489k0 f5674G;

    /* renamed from: H, reason: collision with root package name */
    public G0.a f5675H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f5676I;

    /* renamed from: J, reason: collision with root package name */
    public final n0.O f5677J;

    /* renamed from: K, reason: collision with root package name */
    public final Y f5678K;

    /* renamed from: L, reason: collision with root package name */
    public long f5679L;

    /* renamed from: M, reason: collision with root package name */
    public final int[] f5680M;

    /* renamed from: N, reason: collision with root package name */
    public final float[] f5681N;

    /* renamed from: O, reason: collision with root package name */
    public final float[] f5682O;

    /* renamed from: P, reason: collision with root package name */
    public long f5683P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f5684Q;

    /* renamed from: R, reason: collision with root package name */
    public long f5685R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f5686S;

    /* renamed from: T, reason: collision with root package name */
    public final C0037f0 f5687T;

    /* renamed from: U, reason: collision with root package name */
    public final D.D f5688U;

    /* renamed from: V, reason: collision with root package name */
    public o2.c f5689V;

    /* renamed from: W, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC0484i f5690W;

    /* renamed from: a0, reason: collision with root package name */
    public final ViewTreeObserverOnScrollChangedListenerC0486j f5691a0;

    /* renamed from: b0, reason: collision with root package name */
    public final ViewTreeObserverOnTouchModeChangeListenerC0488k f5692b0;

    /* renamed from: c0, reason: collision with root package name */
    public final A0.d f5693c0;

    /* renamed from: d, reason: collision with root package name */
    public long f5694d;

    /* renamed from: d0, reason: collision with root package name */
    public final A0.f f5695d0;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f5696e;

    /* renamed from: e0, reason: collision with root package name */
    public final AtomicReference f5697e0;

    /* renamed from: f, reason: collision with root package name */
    public final C0408B f5698f;

    /* renamed from: f0, reason: collision with root package name */
    public final O0 f5699f0;

    /* renamed from: g, reason: collision with root package name */
    public final C0037f0 f5700g;

    /* renamed from: g0, reason: collision with root package name */
    public final O0 f5701g0;
    public final androidx.compose.ui.focus.a h;

    /* renamed from: h0, reason: collision with root package name */
    public final C0037f0 f5702h0;

    /* renamed from: i, reason: collision with root package name */
    public InterfaceC0276i f5703i;
    public int i0;

    /* renamed from: j, reason: collision with root package name */
    public final ViewOnDragListenerC0487j0 f5704j;

    /* renamed from: j0, reason: collision with root package name */
    public final C0037f0 f5705j0;

    /* renamed from: k, reason: collision with root package name */
    public final M0 f5706k;
    public final X1.e k0;

    /* renamed from: l, reason: collision with root package name */
    public final W.p f5707l;

    /* renamed from: l0, reason: collision with root package name */
    public final C0259c f5708l0;

    /* renamed from: m, reason: collision with root package name */
    public final C0444z f5709m;

    /* renamed from: m0, reason: collision with root package name */
    public final C0370b f5710m0;

    /* renamed from: n, reason: collision with root package name */
    public final C0507u f5711n;

    /* renamed from: n0, reason: collision with root package name */
    public final O0 f5712n0;

    /* renamed from: o, reason: collision with root package name */
    public final t0.l f5713o;

    /* renamed from: o0, reason: collision with root package name */
    public MotionEvent f5714o0;

    /* renamed from: p, reason: collision with root package name */
    public final C0455E f5715p;
    public long p0;

    /* renamed from: q, reason: collision with root package name */
    public R.e f5716q;

    /* renamed from: q0, reason: collision with root package name */
    public final B2.i f5717q0;

    /* renamed from: r, reason: collision with root package name */
    public final C0480g f5718r;

    /* renamed from: r0, reason: collision with root package name */
    public final F.d f5719r0;

    /* renamed from: s, reason: collision with root package name */
    public final B0.a f5720s;

    /* renamed from: s0, reason: collision with root package name */
    public final M1.h f5721s0;

    /* renamed from: t, reason: collision with root package name */
    public final Q.f f5722t;

    /* renamed from: t0, reason: collision with root package name */
    public final R.a f5723t0;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f5724u;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f5725u0;

    /* renamed from: v, reason: collision with root package name */
    public ArrayList f5726v;

    /* renamed from: v0, reason: collision with root package name */
    public final C0505t f5727v0;

    /* renamed from: w, reason: collision with root package name */
    public boolean f5728w;

    /* renamed from: w0, reason: collision with root package name */
    public final InterfaceC0469a0 f5729w0;

    /* renamed from: x, reason: collision with root package name */
    public final C0280c f5730x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f5731x0;

    /* renamed from: y, reason: collision with root package name */
    public final Z.a f5732y;

    /* renamed from: y0, reason: collision with root package name */
    public final s0.b f5733y0;

    /* renamed from: z, reason: collision with root package name */
    public o2.c f5734z;

    /* renamed from: z0, reason: collision with root package name */
    public final O0 f5735z0;

    /* JADX WARN: Type inference failed for: r1v36, types: [o0.i] */
    /* JADX WARN: Type inference failed for: r1v37, types: [o0.j] */
    /* JADX WARN: Type inference failed for: r1v38, types: [o0.k] */
    public C0507u(Context context, InterfaceC0276i interfaceC0276i) {
        super(context);
        this.f5694d = 9205357640488583168L;
        this.f5696e = true;
        this.f5698f = new C0408B();
        G0.d b3 = r2.a.b(context);
        D.U u3 = D.U.f730g;
        int i3 = AbstractC0028b.f737b;
        this.f5700g = new C0037f0(b3, u3);
        t0.c cVar = new t0.c();
        EmptySemanticsElement emptySemanticsElement = new EmptySemanticsElement(cVar);
        this.h = new androidx.compose.ui.focus.a(new C0494n(1, this, C0507u.class, "registerOnEndApplyChangesListener", "registerOnEndApplyChangesListener(Lkotlin/jvm/functions/Function0;)V", 0), new C0496o(2, this, C0507u.class, "onRequestFocusForOwner", "onRequestFocusForOwner-7o62pno(Landroidx/compose/ui/focus/FocusDirection;Landroidx/compose/ui/geometry/Rect;)Z", 0), new U.d(0, this, C0507u.class, "onClearFocusForOwner", "onClearFocusForOwner()V", 0, 3), new C0498p(this, C0507u.class, "layoutDirection", "getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;", 0));
        ViewOnDragListenerC0487j0 viewOnDragListenerC0487j0 = new ViewOnDragListenerC0487j0();
        this.f5703i = interfaceC0276i;
        this.f5704j = viewOnDragListenerC0487j0;
        this.f5706k = new M0();
        P.l a3 = androidx.compose.ui.input.key.a.a(new r(this, 0));
        P.l a4 = androidx.compose.ui.input.rotary.a.a();
        this.f5707l = new W.p();
        C0444z c0444z = new C0444z(3, 0, false);
        l0.r rVar = l0.r.f4936a;
        if (!p2.g.a(c0444z.f5313r, rVar)) {
            c0444z.f5313r = rVar;
            c0444z.r();
        }
        c0444z.I(getDensity());
        c0444z.K(emptySemanticsElement.c(a4).c(a3).c(((androidx.compose.ui.focus.a) getFocusOwner()).f3322g).c(viewOnDragListenerC0487j0.f5597c));
        this.f5709m = c0444z;
        this.f5711n = this;
        this.f5713o = new t0.l(getRoot(), cVar);
        C0455E c0455e = new C0455E(this);
        this.f5715p = c0455e;
        this.f5716q = new R.e(this, new U.d(0, this, AbstractC0461K.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", 1, 2));
        C0480g c0480g = new C0480g();
        Object systemService = context.getSystemService("accessibility");
        p2.g.c(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.f5718r = c0480g;
        this.f5720s = new B0.a(this);
        this.f5722t = new Q.f();
        this.f5724u = new ArrayList();
        this.f5730x = new C0280c();
        C0444z root = getRoot();
        Z.a aVar = new Z.a();
        aVar.f2785b = root;
        aVar.f2786c = new B0.a((C0435p) root.f5319x.f854c);
        aVar.f2787d = new A.t(23);
        aVar.f2788e = new C0433n();
        this.f5732y = aVar;
        this.f5734z = C0492m.f5605f;
        this.f5668A = new Q.a(this, getAutofillTree());
        this.f5670C = new C0482h(context);
        this.f5671D = new n0.g0(new r(this, 1));
        this.f5677J = new n0.O(getRoot());
        ViewConfiguration.get(context);
        this.f5678K = new Y();
        this.f5679L = r2.a.c(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.f5680M = new int[]{0, 0};
        float[] j3 = W.D.j();
        this.f5681N = W.D.j();
        this.f5682O = W.D.j();
        this.f5683P = -1L;
        this.f5685R = 9187343241974906880L;
        this.f5686S = true;
        this.f5687T = C0032d.A(null);
        C0505t c0505t = new C0505t(this, 1);
        B0.a aVar2 = D.I0.f694a;
        this.f5688U = new D.D(c0505t);
        this.f5690W = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: o0.i
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                C0507u.this.G();
            }
        };
        this.f5691a0 = new ViewTreeObserver.OnScrollChangedListener() { // from class: o0.j
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                C0507u.this.G();
            }
        };
        this.f5692b0 = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: o0.k
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z3) {
                C0259c c0259c = C0507u.this.f5708l0;
                int i4 = z3 ? 1 : 2;
                c0259c.getClass();
                c0259c.f4289a.setValue(new C0257a(i4));
            }
        };
        this.f5693c0 = new A0.d(getView(), this);
        A0.f fVar = new A0.f();
        new AtomicReference(null);
        this.f5695d0 = fVar;
        this.f5697e0 = new AtomicReference(null);
        getTextInputService();
        this.f5699f0 = new O0();
        this.f5701g0 = new O0();
        z0.f a5 = AbstractC0718b.a(context);
        int i4 = AbstractC0028b.f737b;
        this.f5702h0 = new C0037f0(a5, u3);
        Configuration configuration = context.getResources().getConfiguration();
        int i5 = Build.VERSION.SDK_INT;
        this.i0 = i5 >= 31 ? configuration.fontWeightAdjustment : 0;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        G0.f fVar2 = G0.f.f1258d;
        G0.f fVar3 = layoutDirection != 0 ? layoutDirection != 1 ? null : G0.f.f1259e : fVar2;
        this.f5705j0 = C0032d.A(fVar3 != null ? fVar3 : fVar2);
        this.k0 = new X1.e(17);
        this.f5708l0 = new C0259c(isInTouchMode() ? 1 : 2);
        C0370b c0370b = new C0370b();
        new F.d(new C0421b[16]);
        new F.d(new Z0.d[16]);
        new F.d(new C0444z[16]);
        new F.d(new Z0.d[16]);
        this.f5710m0 = c0370b;
        this.f5712n0 = new O0();
        this.f5717q0 = new B2.i(15);
        this.f5719r0 = new F.d(new o2.a[16]);
        this.f5721s0 = new M1.h(6, this);
        this.f5723t0 = new R.a(9, this);
        this.f5727v0 = new C0505t(this, 0);
        this.f5729w0 = i5 < 29 ? new U0.i(j3) : new C0471b0();
        addOnAttachStateChangeListener(this.f5716q);
        setWillNotDraw(false);
        setFocusable(true);
        C0460J.f5443a.a(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        AbstractC0189K.j(this, c0455e);
        setOnDragListener(viewOnDragListenerC0487j0);
        getRoot().b(this);
        if (i5 >= 29) {
            C0457G.f5421a.a(this);
        }
        this.f5733y0 = i5 >= 31 ? new s0.b() : null;
        O0 o02 = new O0();
        h0.i.f4363a.getClass();
        this.f5735z0 = o02;
    }

    public static final boolean g(C0507u c0507u, U.a aVar, V.d dVar) {
        Integer H2;
        if (c0507u.isFocused() || c0507u.hasFocus()) {
            return true;
        }
        return super.requestFocus((aVar == null || (H2 = U.c.H(aVar.f2331a)) == null) ? 130 : H2.intValue(), dVar != null ? W.D.B(dVar) : null);
    }

    @InterfaceC0162a
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C0490l get_viewTreeOwners() {
        return (C0490l) this.f5687T.getValue();
    }

    public static void h(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = viewGroup.getChildAt(i3);
            if (childAt instanceof C0507u) {
                ((C0507u) childAt).u();
            } else if (childAt instanceof ViewGroup) {
                h((ViewGroup) childAt);
            }
        }
    }

    public static long i(int i3) {
        long j3;
        long j4;
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode == Integer.MIN_VALUE) {
            j3 = 0 << 32;
        } else {
            if (mode != 0) {
                if (mode != 1073741824) {
                    throw new IllegalStateException();
                }
                j4 = size;
                j3 = j4 << 32;
                return j3 | j4;
            }
            j3 = 0 << 32;
            size = Integer.MAX_VALUE;
        }
        j4 = size;
        return j3 | j4;
    }

    public static View j(View view, int i3) {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (p2.g.a(declaredMethod.invoke(view, null), Integer.valueOf(i3))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    View j3 = j(viewGroup.getChildAt(i4), i3);
                    if (j3 != null) {
                        return j3;
                    }
                }
            }
        }
        return null;
    }

    public static void m(C0444z c0444z) {
        c0444z.q();
        F.d n2 = c0444z.n();
        int i3 = n2.f1160f;
        if (i3 > 0) {
            Object[] objArr = n2.f1158d;
            int i4 = 0;
            do {
                m((C0444z) objArr[i4]);
                i4++;
            } while (i4 < i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0082 A[LOOP:0: B:20:0x004c->B:35:0x0082, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085 A[EDGE_INSN: B:36:0x0085->B:39:0x0085 BREAK  A[LOOP:0: B:20:0x004c->B:35:0x0082], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean o(android.view.MotionEvent r6) {
        /*
            float r0 = r6.getX()
            boolean r1 = java.lang.Float.isInfinite(r0)
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L44
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L44
            float r0 = r6.getY()
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L44
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L44
            float r0 = r6.getRawX()
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L44
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L44
            float r0 = r6.getRawY()
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L44
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L44
            r0 = r2
            goto L45
        L44:
            r0 = r3
        L45:
            if (r0 != 0) goto L85
            int r1 = r6.getPointerCount()
            r4 = r3
        L4c:
            if (r4 >= r1) goto L85
            float r0 = r6.getX(r4)
            boolean r5 = java.lang.Float.isInfinite(r0)
            if (r5 != 0) goto L7f
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L7f
            float r0 = r6.getY(r4)
            boolean r5 = java.lang.Float.isInfinite(r0)
            if (r5 != 0) goto L7f
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L7f
            int r0 = android.os.Build.VERSION.SDK_INT
            r5 = 29
            if (r0 < r5) goto L7d
            o0.q0 r0 = o0.C0501q0.f5641a
            boolean r0 = r0.a(r6, r4)
            if (r0 != 0) goto L7d
            goto L7f
        L7d:
            r0 = r2
            goto L80
        L7f:
            r0 = r3
        L80:
            if (r0 != 0) goto L85
            int r4 = r4 + 1
            goto L4c
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.C0507u.o(android.view.MotionEvent):boolean");
    }

    private void setDensity(G0.b bVar) {
        this.f5700g.setValue(bVar);
    }

    private void setFontFamilyResolver(InterfaceC0721e interfaceC0721e) {
        this.f5702h0.setValue(interfaceC0721e);
    }

    private void setLayoutDirection(G0.f fVar) {
        this.f5705j0.setValue(fVar);
    }

    private final void set_viewTreeOwners(C0490l c0490l) {
        this.f5687T.setValue(c0490l);
    }

    public final void A() {
        if (this.f5684Q) {
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (currentAnimationTimeMillis != this.f5683P) {
            this.f5683P = currentAnimationTimeMillis;
            InterfaceC0469a0 interfaceC0469a0 = this.f5729w0;
            float[] fArr = this.f5681N;
            interfaceC0469a0.a(this, fArr);
            AbstractC0461K.g(fArr, this.f5682O);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.f5680M;
            view.getLocationOnScreen(iArr);
            float f3 = iArr[0];
            float f4 = iArr[1];
            view.getLocationInWindow(iArr);
            this.f5685R = r2.a.f(f3 - iArr[0], f4 - iArr[1]);
        }
    }

    public final void B(n0.d0 d0Var) {
        B2.i iVar;
        Reference poll;
        F.d dVar;
        if (this.f5674G != null) {
            Z.p pVar = H0.f5423s;
        }
        do {
            iVar = this.f5717q0;
            poll = ((ReferenceQueue) iVar.f317f).poll();
            dVar = (F.d) iVar.f316e;
            if (poll != null) {
                dVar.l(poll);
            }
        } while (poll != null);
        dVar.b(new WeakReference(d0Var, (ReferenceQueue) iVar.f317f));
    }

    public final void C(C0444z c0444z) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (c0444z != null) {
            while (c0444z != null && c0444z.f5320y.f5146q.f5116n == 1) {
                if (!this.f5676I) {
                    C0444z k3 = c0444z.k();
                    if (k3 == null) {
                        break;
                    }
                    long j3 = ((C0435p) k3.f5319x.f854c).f4930g;
                    if (G0.a.f(j3) && G0.a.e(j3)) {
                        break;
                    }
                }
                c0444z = c0444z.k();
            }
            if (c0444z == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final long D(long j3) {
        A();
        return W.D.t(this.f5682O, r2.a.f(V.c.b(j3) - V.c.b(this.f5685R), V.c.c(j3) - V.c.c(this.f5685R)));
    }

    public final int E(MotionEvent motionEvent) {
        Object obj;
        int i3 = 0;
        if (this.f5731x0) {
            this.f5731x0 = false;
            int metaState = motionEvent.getMetaState();
            this.f5706k.getClass();
            M0.f5476b.setValue(new h0.n(metaState));
        }
        C0280c c0280c = this.f5730x;
        B2.i a3 = c0280c.a(motionEvent, this);
        Z.a aVar = this.f5732y;
        if (a3 != null) {
            ArrayList arrayList = (ArrayList) a3.f316e;
            int size = arrayList.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i4 = size - 1;
                    obj = arrayList.get(size);
                    if (((h0.m) obj).f4383e) {
                        break;
                    }
                    if (i4 < 0) {
                        break;
                    }
                    size = i4;
                }
            }
            obj = null;
            h0.m mVar = (h0.m) obj;
            if (mVar != null) {
                this.f5694d = mVar.f4382d;
            }
            i3 = aVar.c(a3, this, p(motionEvent));
            int actionMasked = motionEvent.getActionMasked();
            if ((actionMasked == 0 || actionMasked == 5) && (i3 & 1) == 0) {
                int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                c0280c.f4344c.delete(pointerId);
                c0280c.f4343b.delete(pointerId);
            }
        } else {
            aVar.d();
        }
        return i3;
    }

    public final void F(MotionEvent motionEvent, int i3, long j3, boolean z3) {
        int actionMasked = motionEvent.getActionMasked();
        int i4 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i4 = motionEvent.getActionIndex();
            }
        } else if (i3 != 9 && i3 != 10) {
            i4 = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (i4 >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i5 = 0; i5 < pointerCount; i5++) {
            pointerPropertiesArr[i5] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i6 = 0; i6 < pointerCount; i6++) {
            pointerCoordsArr[i6] = new MotionEvent.PointerCoords();
        }
        int i7 = 0;
        while (i7 < pointerCount) {
            int i8 = ((i4 < 0 || i7 < i4) ? 0 : 1) + i7;
            motionEvent.getPointerProperties(i8, pointerPropertiesArr[i7]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i7];
            motionEvent.getPointerCoords(i8, pointerCoords);
            long r3 = r(r2.a.f(pointerCoords.x, pointerCoords.y));
            pointerCoords.x = V.c.b(r3);
            pointerCoords.y = V.c.c(r3);
            i7++;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j3 : motionEvent.getDownTime(), j3, i3, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z3 ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        B2.i a3 = this.f5730x.a(obtain, this);
        p2.g.b(a3);
        this.f5732y.c(a3, this, true);
        obtain.recycle();
    }

    public final void G() {
        int[] iArr = this.f5680M;
        getLocationOnScreen(iArr);
        long j3 = this.f5679L;
        int i3 = (int) (j3 >> 32);
        int i4 = (int) (j3 & 4294967295L);
        boolean z3 = false;
        int i5 = iArr[0];
        if (i3 != i5 || i4 != iArr[1]) {
            this.f5679L = r2.a.c(i5, iArr[1]);
            if (i3 != Integer.MAX_VALUE && i4 != Integer.MAX_VALUE) {
                getRoot().f5320y.f5146q.Q();
                z3 = true;
            }
        }
        this.f5677J.a(z3);
    }

    @Override // androidx.lifecycle.InterfaceC0123d
    public final void a(androidx.lifecycle.r rVar) {
        setShowLayoutBounds(O0.a());
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        Q.a aVar = this.f5668A;
        if (aVar != null) {
            int size = sparseArray.size();
            for (int i3 = 0; i3 < size; i3++) {
                int keyAt = sparseArray.keyAt(i3);
                AutofillValue autofillValue = (AutofillValue) sparseArray.get(keyAt);
                Q.d dVar = Q.d.f2170a;
                if (dVar.d(autofillValue)) {
                    dVar.i(autofillValue).toString();
                    if (aVar.f2167b.f2172a.get(Integer.valueOf(keyAt)) != null) {
                        throw new ClassCastException();
                    }
                } else {
                    if (dVar.b(autofillValue)) {
                        throw new C0167f("An operation is not implemented: b/138604541: Add onFill() callback for date");
                    }
                    if (dVar.c(autofillValue)) {
                        throw new C0167f("An operation is not implemented: b/138604541: Add onFill() callback for list");
                    }
                    if (dVar.e(autofillValue)) {
                        throw new C0167f("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i3) {
        this.f5715p.n(this.f5694d, false);
        return false;
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i3) {
        this.f5715p.n(this.f5694d, true);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z3;
        if (!isAttachedToWindow()) {
            m(getRoot());
        }
        s(true);
        synchronized (N.o.f1756b) {
            C0375B c0375b = ((C0074b) N.o.f1762i.get()).h;
            if (c0375b != null) {
                z3 = c0375b.h();
            }
        }
        if (z3) {
            N.o.a();
        }
        this.f5728w = true;
        W.p pVar = this.f5707l;
        C0080c c0080c = pVar.f2556a;
        Canvas canvas2 = c0080c.f2534a;
        c0080c.f2534a = canvas;
        getRoot().g(c0080c, null);
        pVar.f2556a.f2534a = canvas2;
        if (!this.f5724u.isEmpty()) {
            int size = this.f5724u.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((n0.d0) this.f5724u.get(i3)).d();
            }
        }
        if (H0.f5427w) {
            int save = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
        }
        this.f5724u.clear();
        this.f5728w = false;
        ArrayList arrayList = this.f5726v;
        if (arrayList != null) {
            this.f5724u.addAll(arrayList);
            arrayList.clear();
        }
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        C0292a c0292a;
        int size;
        C0059s c0059s;
        P.k kVar;
        C0059s c0059s2;
        if (this.f5725u0) {
            R.a aVar = this.f5723t0;
            removeCallbacks(aVar);
            if (motionEvent.getActionMasked() == 8) {
                this.f5725u0 = false;
            } else {
                aVar.run();
            }
        }
        if (motionEvent.getActionMasked() != 8) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (o(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (!motionEvent.isFromSource(4194304)) {
            return (l(motionEvent) & 1) != 0;
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        motionEvent.getAxisValue(26);
        getContext();
        AbstractC0190L.b(viewConfiguration);
        getContext();
        AbstractC0190L.a(viewConfiguration);
        motionEvent.getEventTime();
        motionEvent.getDeviceId();
        androidx.compose.ui.focus.a aVar2 = (androidx.compose.ui.focus.a) getFocusOwner();
        if (aVar2.f3320e.a()) {
            throw new IllegalStateException("Dispatching rotary event while focus system is invalidated.");
        }
        U.q g3 = U.c.g(aVar2.f3319d);
        if (g3 != null) {
            P.k kVar2 = g3.f2088d;
            if (!kVar2.f2099p) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            C0444z q3 = AbstractC0409C.q(g3);
            loop0: while (true) {
                if (q3 == null) {
                    kVar = null;
                    break;
                }
                if ((((P.k) q3.f5319x.f857f).f2091g & 16384) != 0) {
                    while (kVar2 != null) {
                        if ((kVar2.f2090f & 16384) != 0) {
                            F.d dVar = null;
                            kVar = kVar2;
                            while (kVar != null) {
                                if (kVar instanceof C0292a) {
                                    break loop0;
                                }
                                if ((kVar.f2090f & 16384) != 0 && (kVar instanceof AbstractC0428i)) {
                                    int i3 = 0;
                                    for (P.k kVar3 = ((AbstractC0428i) kVar).f5256r; kVar3 != null; kVar3 = kVar3.f2092i) {
                                        if ((kVar3.f2090f & 16384) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                kVar = kVar3;
                                            } else {
                                                if (dVar == null) {
                                                    dVar = new F.d(new P.k[16]);
                                                }
                                                if (kVar != null) {
                                                    dVar.b(kVar);
                                                    kVar = null;
                                                }
                                                dVar.b(kVar3);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                kVar = AbstractC0409C.e(dVar);
                            }
                        }
                        kVar2 = kVar2.h;
                    }
                }
                q3 = q3.k();
                kVar2 = (q3 == null || (c0059s2 = q3.f5319x) == null) ? null : (n0.m0) c0059s2.f856e;
            }
            c0292a = (C0292a) kVar;
        } else {
            c0292a = null;
        }
        if (c0292a == null) {
            return false;
        }
        C0292a c0292a2 = c0292a;
        P.k kVar4 = c0292a2.f2088d;
        if (!kVar4.f2099p) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        P.k kVar5 = kVar4.h;
        C0444z q4 = AbstractC0409C.q(c0292a);
        ArrayList arrayList = null;
        while (q4 != null) {
            if ((((P.k) q4.f5319x.f857f).f2091g & 16384) != 0) {
                while (kVar5 != null) {
                    if ((kVar5.f2090f & 16384) != 0) {
                        P.k kVar6 = kVar5;
                        F.d dVar2 = null;
                        while (kVar6 != null) {
                            if (kVar6 instanceof C0292a) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.add(kVar6);
                            } else if ((kVar6.f2090f & 16384) != 0 && (kVar6 instanceof AbstractC0428i)) {
                                int i4 = 0;
                                for (P.k kVar7 = ((AbstractC0428i) kVar6).f5256r; kVar7 != null; kVar7 = kVar7.f2092i) {
                                    if ((kVar7.f2090f & 16384) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            kVar6 = kVar7;
                                        } else {
                                            if (dVar2 == null) {
                                                dVar2 = new F.d(new P.k[16]);
                                            }
                                            if (kVar6 != null) {
                                                dVar2.b(kVar6);
                                                kVar6 = null;
                                            }
                                            dVar2.b(kVar7);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            kVar6 = AbstractC0409C.e(dVar2);
                        }
                    }
                    kVar5 = kVar5.h;
                }
            }
            q4 = q4.k();
            kVar5 = (q4 == null || (c0059s = q4.f5319x) == null) ? null : (n0.m0) c0059s.f856e;
        }
        if (arrayList != null && arrayList.size() - 1 >= 0) {
            while (true) {
                int i5 = size - 1;
                ((C0292a) arrayList.get(size)).getClass();
                if (i5 < 0) {
                    break;
                }
                size = i5;
            }
        }
        P.k kVar8 = c0292a2.f2088d;
        F.d dVar3 = null;
        while (kVar8 != null) {
            if (kVar8 instanceof C0292a) {
            } else if ((kVar8.f2090f & 16384) != 0 && (kVar8 instanceof AbstractC0428i)) {
                int i6 = 0;
                for (P.k kVar9 = ((AbstractC0428i) kVar8).f5256r; kVar9 != null; kVar9 = kVar9.f2092i) {
                    if ((kVar9.f2090f & 16384) != 0) {
                        i6++;
                        if (i6 == 1) {
                            kVar8 = kVar9;
                        } else {
                            if (dVar3 == null) {
                                dVar3 = new F.d(new P.k[16]);
                            }
                            if (kVar8 != null) {
                                dVar3.b(kVar8);
                                kVar8 = null;
                            }
                            dVar3.b(kVar9);
                        }
                    }
                }
                if (i6 == 1) {
                }
            }
            kVar8 = AbstractC0409C.e(dVar3);
        }
        P.k kVar10 = c0292a2.f2088d;
        F.d dVar4 = null;
        while (kVar10 != null) {
            if (kVar10 instanceof C0292a) {
            } else if ((kVar10.f2090f & 16384) != 0 && (kVar10 instanceof AbstractC0428i)) {
                int i7 = 0;
                for (P.k kVar11 = ((AbstractC0428i) kVar10).f5256r; kVar11 != null; kVar11 = kVar11.f2092i) {
                    if ((kVar11.f2090f & 16384) != 0) {
                        i7++;
                        if (i7 == 1) {
                            kVar10 = kVar11;
                        } else {
                            if (dVar4 == null) {
                                dVar4 = new F.d(new P.k[16]);
                            }
                            if (kVar10 != null) {
                                dVar4.b(kVar10);
                                kVar10 = null;
                            }
                            dVar4.b(kVar11);
                        }
                    }
                }
                if (i7 == 1) {
                }
            }
            kVar10 = AbstractC0409C.e(dVar4);
        }
        if (arrayList == null) {
            return false;
        }
        int size2 = arrayList.size();
        for (int i8 = 0; i8 < size2; i8++) {
            C0492m c0492m = ((C0292a) arrayList.get(i8)).f4597q;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010b  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r25) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.C0507u.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return ((androidx.compose.ui.focus.a) getFocusOwner()).b(keyEvent, new D.q0(this, 5, keyEvent));
        }
        int metaState = keyEvent.getMetaState();
        this.f5706k.getClass();
        M0.f5476b.setValue(new h0.n(metaState));
        return ((androidx.compose.ui.focus.a) getFocusOwner()).b(keyEvent, U.f.f2340f) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        C0059s c0059s;
        if (isFocused()) {
            androidx.compose.ui.focus.a aVar = (androidx.compose.ui.focus.a) getFocusOwner();
            if (aVar.f3320e.a()) {
                throw new IllegalStateException("Dispatching intercepted soft keyboard event while focus system is invalidated.");
            }
            U.q g3 = U.c.g(aVar.f3319d);
            if (g3 != null) {
                P.k kVar = g3.f2088d;
                if (!kVar.f2099p) {
                    throw new IllegalStateException("visitAncestors called on an unattached node");
                }
                C0444z q3 = AbstractC0409C.q(g3);
                while (q3 != null) {
                    if ((((P.k) q3.f5319x.f857f).f2091g & 131072) != 0) {
                        while (kVar != null) {
                            if ((kVar.f2090f & 131072) != 0) {
                                P.k kVar2 = kVar;
                                F.d dVar = null;
                                while (kVar2 != null) {
                                    if ((kVar2.f2090f & 131072) != 0 && (kVar2 instanceof AbstractC0428i)) {
                                        int i3 = 0;
                                        for (P.k kVar3 = ((AbstractC0428i) kVar2).f5256r; kVar3 != null; kVar3 = kVar3.f2092i) {
                                            if ((kVar3.f2090f & 131072) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    kVar2 = kVar3;
                                                } else {
                                                    if (dVar == null) {
                                                        dVar = new F.d(new P.k[16]);
                                                    }
                                                    if (kVar2 != null) {
                                                        dVar.b(kVar2);
                                                        kVar2 = null;
                                                    }
                                                    dVar.b(kVar3);
                                                }
                                            }
                                        }
                                        if (i3 == 1) {
                                        }
                                    }
                                    kVar2 = AbstractC0409C.e(dVar);
                                }
                            }
                            kVar = kVar.h;
                        }
                    }
                    q3 = q3.k();
                    kVar = (q3 == null || (c0059s = q3.f5319x) == null) ? null : (n0.m0) c0059s.f856e;
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            C0456F.f5420a.a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f5725u0) {
            R.a aVar = this.f5723t0;
            removeCallbacks(aVar);
            MotionEvent motionEvent2 = this.f5714o0;
            p2.g.b(motionEvent2);
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.f5725u0 = false;
            } else {
                aVar.run();
            }
        }
        if (o(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && !q(motionEvent)) {
            return false;
        }
        int l3 = l(motionEvent);
        if ((l3 & 2) != 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return (l3 & 1) != 0;
    }

    public final View findViewByAccessibilityIdTraversal(int i3) {
        View view = null;
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(this, Integer.valueOf(i3));
                if (invoke instanceof View) {
                    view = (View) invoke;
                }
            } else {
                view = j(this, i3);
            }
        } catch (NoSuchMethodException unused) {
        }
        return view;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i3) {
        if (view != null) {
            V.d d3 = U.c.d(view);
            U.a I2 = U.c.I(i3);
            if (p2.g.a(((androidx.compose.ui.focus.a) getFocusOwner()).c(I2 != null ? I2.f2331a : 6, d3, C0492m.f5606g), Boolean.TRUE)) {
                return this;
            }
        }
        return super.focusSearch(view, i3);
    }

    public final Z getAndroidViewsHandler$ui_release() {
        if (this.f5673F == null) {
            Z z3 = new Z(getContext());
            this.f5673F = z3;
            addView(z3, -1);
            requestLayout();
        }
        Z z4 = this.f5673F;
        p2.g.b(z4);
        return z4;
    }

    public Q.b getAutofill() {
        return this.f5668A;
    }

    public Q.f getAutofillTree() {
        return this.f5722t;
    }

    public final o2.c getConfigurationChangeObserver() {
        return this.f5734z;
    }

    public final R.e getContentCaptureManager$ui_release() {
        return this.f5716q;
    }

    public InterfaceC0276i getCoroutineContext() {
        return this.f5703i;
    }

    public G0.b getDensity() {
        return (G0.b) this.f5700g.getValue();
    }

    public S.a getDragAndDropManager() {
        return this.f5704j;
    }

    public U.g getFocusOwner() {
        return this.h;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        C0174m c0174m;
        V.d v3 = v();
        if (v3 != null) {
            rect.left = Math.round(v3.f2446a);
            rect.top = Math.round(v3.f2447b);
            rect.right = Math.round(v3.f2448c);
            rect.bottom = Math.round(v3.f2449d);
            c0174m = C0174m.f3840a;
        } else {
            c0174m = null;
        }
        if (c0174m == null) {
            super.getFocusedRect(rect);
        }
    }

    public InterfaceC0721e getFontFamilyResolver() {
        return (InterfaceC0721e) this.f5702h0.getValue();
    }

    public InterfaceC0720d getFontLoader() {
        return this.f5701g0;
    }

    public W.w getGraphicsContext() {
        return this.f5720s;
    }

    public InterfaceC0254a getHapticFeedBack() {
        return this.k0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.f5677J.f5178b.l();
    }

    public InterfaceC0258b getInputModeManager() {
        return this.f5708l0;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.f5683P;
    }

    @Override // android.view.View, android.view.ViewParent
    public G0.f getLayoutDirection() {
        return (G0.f) this.f5705j0.getValue();
    }

    public long getMeasureIteration() {
        n0.O o3 = this.f5677J;
        if (o3.f5179c) {
            return o3.f5183g;
        }
        Z0.d.R("measureIteration should be only used during the measure/layout pass");
        throw null;
    }

    public C0370b getModifierLocalManager() {
        return this.f5710m0;
    }

    public l0.n getPlacementScope() {
        int i3 = l0.q.f4935b;
        return new C0358h(1, this);
    }

    public h0.j getPointerIconService() {
        return this.f5735z0;
    }

    public C0444z getRoot() {
        return this.f5709m;
    }

    public n0.k0 getRootForTest() {
        return this.f5711n;
    }

    public final boolean getScrollCaptureInProgress$ui_release() {
        s0.b bVar;
        if (Build.VERSION.SDK_INT < 31 || (bVar = this.f5733y0) == null) {
            return false;
        }
        return ((Boolean) bVar.f6123a.getValue()).booleanValue();
    }

    public t0.l getSemanticsOwner() {
        return this.f5713o;
    }

    public C0408B getSharedDrawScope() {
        return this.f5698f;
    }

    public boolean getShowLayoutBounds() {
        return this.f5672E;
    }

    public n0.g0 getSnapshotObserver() {
        return this.f5671D;
    }

    public C0 getSoftwareKeyboardController() {
        return this.f5699f0;
    }

    public A0.f getTextInputService() {
        return this.f5695d0;
    }

    public D0 getTextToolbar() {
        return this.f5712n0;
    }

    public View getView() {
        return this;
    }

    public F0 getViewConfiguration() {
        return this.f5678K;
    }

    public final C0490l getViewTreeOwners() {
        return (C0490l) this.f5688U.getValue();
    }

    public L0 getWindowInfo() {
        return this.f5706k;
    }

    public final void k(C0444z c0444z, boolean z3) {
        this.f5677J.d(c0444z, z3);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0085 A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:5:0x004f, B:7:0x0058, B:12:0x006b, B:14:0x0075, B:19:0x0085, B:22:0x00ae, B:23:0x008c, B:29:0x0098, B:32:0x00a0, B:34:0x00b1, B:42:0x00c4, B:44:0x00ca, B:46:0x00de, B:47:0x00e1, B:49:0x00e5, B:51:0x00eb, B:53:0x00ef, B:54:0x00f5, B:57:0x00fd, B:60:0x0105, B:61:0x0111, B:63:0x0117, B:65:0x011d, B:67:0x0123, B:68:0x0129, B:70:0x012d, B:71:0x0131, B:76:0x0144, B:78:0x0148, B:79:0x014f, B:85:0x015f, B:86:0x0169, B:92:0x0178), top: B:4:0x004f, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int l(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.C0507u.l(android.view.MotionEvent):int");
    }

    public final void n(C0444z c0444z) {
        int i3 = 0;
        this.f5677J.m(c0444z, false);
        F.d n2 = c0444z.n();
        int i4 = n2.f1160f;
        if (i4 > 0) {
            Object[] objArr = n2.f1158d;
            do {
                n((C0444z) objArr[i3]);
                i3++;
            } while (i3 < i4);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        androidx.lifecycle.t c3;
        androidx.lifecycle.r rVar;
        super.onAttachedToWindow();
        this.f5706k.f5477a.setValue(Boolean.valueOf(hasWindowFocus()));
        n(getRoot());
        m(getRoot());
        N.v vVar = getSnapshotObserver().f5248a;
        C0008i c0008i = vVar.f1786d;
        B0.a aVar = N.o.f1755a;
        N.o.f(N.m.f1751g);
        synchronized (N.o.f1756b) {
            N.o.f1761g = AbstractC0240k.h0((List) N.o.f1761g, c0008i);
        }
        vVar.f1789g = new N.g((o2.e) c0008i);
        Q.a aVar2 = this.f5668A;
        if (aVar2 != null) {
            Q.e.f2171a.a(aVar2);
        }
        androidx.lifecycle.r b3 = androidx.lifecycle.E.b(this);
        A1.g gVar = (A1.g) w2.h.X(w2.h.Z(w2.h.Y(this, A1.h.f218f), A1.h.f219g));
        C0490l viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (b3 != null && gVar != null && (b3 != (rVar = viewTreeOwners.f5600a) || gVar != rVar))) {
            if (b3 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (gVar == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (c3 = viewTreeOwners.f5600a.c()) != null) {
                c3.f(this);
            }
            b3.c().a(this);
            C0490l c0490l = new C0490l(b3, gVar);
            set_viewTreeOwners(c0490l);
            o2.c cVar = this.f5689V;
            if (cVar != null) {
                cVar.i(c0490l);
            }
            this.f5689V = null;
        }
        C0259c c0259c = this.f5708l0;
        int i3 = isInTouchMode() ? 1 : 2;
        c0259c.getClass();
        c0259c.f4289a.setValue(new C0257a(i3));
        C0490l viewTreeOwners2 = getViewTreeOwners();
        androidx.lifecycle.t c4 = viewTreeOwners2 != null ? viewTreeOwners2.f5600a.c() : null;
        if (c4 == null) {
            Z0.d.T("No lifecycle owner exists");
            throw null;
        }
        c4.a(this);
        c4.a(this.f5716q);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f5690W);
        getViewTreeObserver().addOnScrollChangedListener(this.f5691a0);
        getViewTreeObserver().addOnTouchModeChangeListener(this.f5692b0);
        if (Build.VERSION.SDK_INT >= 31) {
            C0459I.f5442a.b(this);
        }
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        if (this.f5697e0.get() != null) {
            throw new ClassCastException();
        }
        this.f5693c0.getClass();
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setDensity(r2.a.b(getContext()));
        int i3 = Build.VERSION.SDK_INT;
        if ((i3 >= 31 ? configuration.fontWeightAdjustment : 0) != this.i0) {
            this.i0 = i3 >= 31 ? configuration.fontWeightAdjustment : 0;
            setFontFamilyResolver(AbstractC0718b.a(getContext()));
        }
        this.f5734z.i(configuration);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        if (this.f5697e0.get() != null) {
            throw new ClassCastException();
        }
        this.f5693c0.getClass();
        return null;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        R.e eVar = this.f5716q;
        eVar.getClass();
        R.c.f2201a.b(eVar, jArr, iArr, consumer);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        n0.g0 snapshotObserver = getSnapshotObserver();
        N.g gVar = snapshotObserver.f5248a.f1789g;
        if (gVar != null) {
            gVar.a();
        }
        N.v vVar = snapshotObserver.f5248a;
        synchronized (vVar.f1788f) {
            F.d dVar = vVar.f1788f;
            int i3 = dVar.f1160f;
            if (i3 > 0) {
                Object[] objArr = dVar.f1158d;
                int i4 = 0;
                do {
                    N.u uVar = (N.u) objArr[i4];
                    ((C0405y) uVar.f1776e.f175e).a();
                    uVar.f1777f.a();
                    ((C0405y) uVar.f1781k.f175e).a();
                    uVar.f1782l.clear();
                    i4++;
                } while (i4 < i3);
            }
        }
        C0490l viewTreeOwners = getViewTreeOwners();
        androidx.lifecycle.t c3 = viewTreeOwners != null ? viewTreeOwners.f5600a.c() : null;
        if (c3 == null) {
            Z0.d.T("No lifecycle owner exists");
            throw null;
        }
        c3.f(this.f5716q);
        c3.f(this);
        Q.a aVar = this.f5668A;
        if (aVar != null) {
            Q.e.f2171a.b(aVar);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f5690W);
        getViewTreeObserver().removeOnScrollChangedListener(this.f5691a0);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.f5692b0);
        if (Build.VERSION.SDK_INT >= 31) {
            C0459I.f5442a.a(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z3, int i3, Rect rect) {
        super.onFocusChanged(z3, i3, rect);
        if (z3 || hasFocus()) {
            return;
        }
        androidx.compose.ui.focus.a aVar = (androidx.compose.ui.focus.a) getFocusOwner();
        A1.f fVar = aVar.f3321f;
        boolean z4 = fVar.f215a;
        U.q qVar = aVar.f3319d;
        if (z4) {
            U.c.e(qVar, true, true);
            return;
        }
        try {
            fVar.f215a = true;
            U.c.e(qVar, true, true);
        } finally {
            A1.f.b(fVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        this.f5677J.h(this.f5727v0);
        this.f5675H = null;
        G();
        if (this.f5673F != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i5 - i3, i6 - i4);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        n0.O o3 = this.f5677J;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                n(getRoot());
            }
            long i5 = i(i3);
            long i6 = i(i4);
            long a3 = AbstractC0090a.a((int) (i5 >>> 32), (int) (i5 & 4294967295L), (int) (i6 >>> 32), (int) (4294967295L & i6));
            G0.a aVar = this.f5675H;
            if (aVar == null) {
                this.f5675H = new G0.a(a3);
                this.f5676I = false;
            } else if (!G0.a.b(aVar.f1251a, a3)) {
                this.f5676I = true;
            }
            o3.n(a3);
            o3.i();
            setMeasuredDimension(getRoot().f5320y.f5146q.f4927d, getRoot().f5320y.f5146q.f4928e);
            if (this.f5673F != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().f5320y.f5146q.f4927d, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().f5320y.f5146q.f4928e, 1073741824));
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i3) {
        Q.a aVar;
        if (viewStructure == null || (aVar = this.f5668A) == null) {
            return;
        }
        Q.c cVar = Q.c.f2169a;
        Q.f fVar = aVar.f2167b;
        int a3 = cVar.a(viewStructure, fVar.f2172a.size());
        for (Map.Entry entry : fVar.f2172a.entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            if (entry.getValue() != null) {
                throw new ClassCastException();
            }
            ViewStructure b3 = cVar.b(viewStructure, a3);
            if (b3 != null) {
                Q.d dVar = Q.d.f2170a;
                AutofillId a4 = dVar.a(viewStructure);
                p2.g.b(a4);
                dVar.g(b3, a4, intValue);
                cVar.d(b3, intValue, aVar.f2166a.getContext().getPackageName(), null, null);
                dVar.h(b3, 1);
                throw null;
            }
            a3++;
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i3) {
        if (this.f5696e) {
            G0.f fVar = G0.f.f1258d;
            G0.f fVar2 = i3 != 0 ? i3 != 1 ? null : G0.f.f1259e : fVar;
            if (fVar2 != null) {
                fVar = fVar2;
            }
            setLayoutDirection(fVar);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        s0.b bVar;
        if (Build.VERSION.SDK_INT < 31 || (bVar = this.f5733y0) == null) {
            return;
        }
        bVar.a(this, getSemanticsOwner(), getCoroutineContext(), consumer);
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        R.e eVar = this.f5716q;
        eVar.getClass();
        R.c.f2201a.c(eVar, longSparseArray);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z3) {
        boolean a3;
        this.f5706k.f5477a.setValue(Boolean.valueOf(z3));
        this.f5731x0 = true;
        super.onWindowFocusChanged(z3);
        if (!z3 || getShowLayoutBounds() == (a3 = O0.a())) {
            return;
        }
        setShowLayoutBounds(a3);
        m(getRoot());
    }

    public final boolean p(MotionEvent motionEvent) {
        float x3 = motionEvent.getX();
        float y3 = motionEvent.getY();
        return 0.0f <= x3 && x3 <= ((float) getWidth()) && 0.0f <= y3 && y3 <= ((float) getHeight());
    }

    public final boolean q(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.f5714o0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    public final long r(long j3) {
        A();
        long t3 = W.D.t(this.f5681N, j3);
        return r2.a.f(V.c.b(this.f5685R) + V.c.b(t3), V.c.c(this.f5685R) + V.c.c(t3));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i3, Rect rect) {
        if (isFocused()) {
            return true;
        }
        int ordinal = ((androidx.compose.ui.focus.a) getFocusOwner()).f3319d.h0().ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            return super.requestFocus(i3, rect);
        }
        if (ordinal != 3) {
            throw new B1.c();
        }
        if (isInTouchMode()) {
            return false;
        }
        U.a I2 = U.c.I(i3);
        int i4 = I2 != null ? I2.f2331a : 7;
        Boolean c3 = ((androidx.compose.ui.focus.a) getFocusOwner()).c(i4, rect != null ? new V.d(rect.left, rect.top, rect.right, rect.bottom) : null, new C0503s(i4));
        if (c3 != null) {
            return c3.booleanValue();
        }
        return false;
    }

    public final void s(boolean z3) {
        C0505t c0505t;
        n0.O o3 = this.f5677J;
        if (o3.f5178b.l() || ((F.d) o3.f5181e.f316e).k()) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z3) {
                try {
                    c0505t = this.f5727v0;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } else {
                c0505t = null;
            }
            if (o3.h(c0505t)) {
                requestLayout();
            }
            o3.a(false);
            Trace.endSection();
        }
    }

    public void setAccessibilityEventBatchIntervalMillis(long j3) {
        this.f5715p.h = j3;
    }

    public final void setConfigurationChangeObserver(o2.c cVar) {
        this.f5734z = cVar;
    }

    public final void setContentCaptureManager$ui_release(R.e eVar) {
        this.f5716q = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [P.k] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [P.k] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [F.d] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [F.d] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public void setCoroutineContext(InterfaceC0276i interfaceC0276i) {
        int i3;
        int i4;
        this.f5703i = interfaceC0276i;
        P.k kVar = (P.k) getRoot().f5319x.f857f;
        if (kVar instanceof h0.r) {
            ((h0.r) kVar).g0();
        }
        P.k kVar2 = kVar.f2088d;
        if (!kVar2.f2099p) {
            Z0.d.S("visitSubtree called on an unattached node");
            throw null;
        }
        P.k kVar3 = kVar2.f2092i;
        C0444z q3 = AbstractC0409C.q(kVar);
        int[] iArr = new int[16];
        F.d[] dVarArr = new F.d[16];
        int i5 = 0;
        while (q3 != null) {
            if (kVar3 == null) {
                kVar3 = (P.k) q3.f5319x.f857f;
            }
            if ((kVar3.f2091g & 16) != 0) {
                while (kVar3 != null) {
                    if ((kVar3.f2090f & 16) != 0) {
                        AbstractC0428i abstractC0428i = kVar3;
                        ?? r9 = 0;
                        while (abstractC0428i != 0) {
                            if (abstractC0428i instanceof n0.j0) {
                                n0.j0 j0Var = (n0.j0) abstractC0428i;
                                if (j0Var instanceof h0.r) {
                                    ((h0.r) j0Var).g0();
                                }
                            } else if ((abstractC0428i.f2090f & 16) != 0 && (abstractC0428i instanceof AbstractC0428i)) {
                                P.k kVar4 = abstractC0428i.f5256r;
                                int i6 = 0;
                                abstractC0428i = abstractC0428i;
                                r9 = r9;
                                while (kVar4 != null) {
                                    if ((kVar4.f2090f & 16) != 0) {
                                        i6++;
                                        r9 = r9;
                                        if (i6 == 1) {
                                            abstractC0428i = kVar4;
                                        } else {
                                            if (r9 == 0) {
                                                r9 = new F.d(new P.k[16]);
                                            }
                                            if (abstractC0428i != 0) {
                                                r9.b(abstractC0428i);
                                                abstractC0428i = 0;
                                            }
                                            r9.b(kVar4);
                                        }
                                    }
                                    kVar4 = kVar4.f2092i;
                                    abstractC0428i = abstractC0428i;
                                    r9 = r9;
                                }
                                if (i6 == 1) {
                                }
                            }
                            abstractC0428i = AbstractC0409C.e(r9);
                        }
                    }
                    kVar3 = kVar3.f2092i;
                }
            }
            F.d n2 = q3.n();
            if (!n2.j()) {
                if (i5 >= iArr.length) {
                    iArr = Arrays.copyOf(iArr, iArr.length * 2);
                    p2.g.d(iArr, "copyOf(this, newSize)");
                    Object[] copyOf = Arrays.copyOf(dVarArr, dVarArr.length * 2);
                    p2.g.d(copyOf, "copyOf(this, newSize)");
                    dVarArr = (F.d[]) copyOf;
                }
                iArr[i5] = n2.f1160f - 1;
                dVarArr[i5] = n2;
                i5++;
            }
            if (i5 <= 0 || (i4 = iArr[i5 - 1]) < 0) {
                q3 = null;
            } else {
                if (i5 <= 0) {
                    throw new IllegalStateException("Cannot call pop() on an empty stack. Guard with a call to isNotEmpty()");
                }
                F.d dVar = dVarArr[i3];
                p2.g.b(dVar);
                if (i4 > 0) {
                    iArr[i3] = iArr[i3] - 1;
                } else if (i4 == 0) {
                    dVarArr[i3] = null;
                    i5--;
                }
                q3 = (C0444z) dVar.f1158d[i4];
            }
            kVar3 = null;
        }
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j3) {
        this.f5683P = j3;
    }

    public final void setOnViewTreeOwnersAvailable(o2.c cVar) {
        C0490l viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            cVar.i(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.f5689V = cVar;
    }

    public void setShowLayoutBounds(boolean z3) {
        this.f5672E = z3;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void t(n0.d0 d0Var, boolean z3) {
        ArrayList arrayList = this.f5724u;
        if (!z3) {
            if (this.f5728w) {
                return;
            }
            arrayList.remove(d0Var);
            ArrayList arrayList2 = this.f5726v;
            if (arrayList2 != null) {
                arrayList2.remove(d0Var);
                return;
            }
            return;
        }
        if (!this.f5728w) {
            arrayList.add(d0Var);
            return;
        }
        ArrayList arrayList3 = this.f5726v;
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            this.f5726v = arrayList3;
        }
        arrayList3.add(d0Var);
    }

    public final void u() {
        if (this.f5669B) {
            N.v vVar = getSnapshotObserver().f5248a;
            synchronized (vVar.f1788f) {
                try {
                    F.d dVar = vVar.f1788f;
                    int i3 = dVar.f1160f;
                    int i4 = 0;
                    for (int i5 = 0; i5 < i3; i5++) {
                        N.u uVar = (N.u) dVar.f1158d[i5];
                        uVar.e();
                        if (uVar.f1777f.f5056e == 0) {
                            i4++;
                        } else if (i4 > 0) {
                            Object[] objArr = dVar.f1158d;
                            objArr[i5 - i4] = objArr[i5];
                        }
                    }
                    int i6 = i3 - i4;
                    AbstractC0239j.c0(dVar.f1158d, i6, i3);
                    dVar.f1160f = i6;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f5669B = false;
        }
        Z z3 = this.f5673F;
        if (z3 != null) {
            h(z3);
        }
        while (this.f5719r0.k()) {
            int i7 = this.f5719r0.f1160f;
            for (int i8 = 0; i8 < i7; i8++) {
                Object[] objArr2 = this.f5719r0.f1158d;
                o2.a aVar = (o2.a) objArr2[i8];
                objArr2[i8] = null;
                if (aVar != null) {
                    aVar.c();
                }
            }
            this.f5719r0.n(0, i7);
        }
    }

    public final V.d v() {
        if (isFocused()) {
            U.q g3 = U.c.g(((androidx.compose.ui.focus.a) getFocusOwner()).f3319d);
            if (g3 != null) {
                return U.c.j(g3);
            }
            return null;
        }
        View findFocus = findFocus();
        if (findFocus != null) {
            return U.c.d(findFocus);
        }
        return null;
    }

    public final void w(C0444z c0444z) {
        C0455E c0455e = this.f5715p;
        c0455e.f5416w = true;
        if (c0455e.z()) {
            c0455e.B(c0444z);
        }
        R.e eVar = this.f5716q;
        eVar.f2212k = true;
        if (eVar.h() && eVar.f2213l.add(c0444z)) {
            eVar.f2214m.c(C0174m.f3840a);
        }
    }

    public final void x(C0444z c0444z, boolean z3, boolean z4, boolean z5) {
        C0444z k3;
        C0444z k4;
        C0412F c0412f;
        C0407A c0407a;
        n0.O o3 = this.f5677J;
        if (!z3) {
            if (o3.m(c0444z, z4) && z5) {
                C(c0444z);
                return;
            }
            return;
        }
        o3.getClass();
        if (c0444z.f5302f == null) {
            Z0.d.S("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
            throw null;
        }
        C0415I c0415i = c0444z.f5320y;
        int b3 = AbstractC0537f.b(c0415i.f5132b);
        if (b3 != 0) {
            if (b3 == 1) {
                return;
            }
            if (b3 != 2 && b3 != 3) {
                if (b3 != 4) {
                    throw new B1.c();
                }
                if (!c0415i.f5136f || z4) {
                    c0415i.f5136f = true;
                    c0415i.f5133c = true;
                    if (c0444z.f5297E) {
                        return;
                    }
                    boolean a3 = p2.g.a(c0444z.x(), Boolean.TRUE);
                    B2.i iVar = o3.f5178b;
                    if ((a3 || (c0415i.f5136f && (c0444z.j() == 1 || !((c0412f = c0415i.f5147r) == null || (c0407a = c0412f.f5095s) == null || !c0407a.e())))) && ((k3 = c0444z.k()) == null || !k3.f5320y.f5136f)) {
                        iVar.g(c0444z, true);
                    } else if ((c0444z.v() || n0.O.f(c0444z)) && ((k4 = c0444z.k()) == null || !k4.f5320y.f5133c)) {
                        iVar.g(c0444z, false);
                    }
                    if (o3.f5180d || !z5) {
                        return;
                    }
                    C(c0444z);
                    return;
                }
                return;
            }
        }
        o3.h.b(new n0.N(c0444z, true, z4));
    }

    public final void y(C0444z c0444z, boolean z3, boolean z4) {
        n0.O o3 = this.f5677J;
        if (!z3) {
            o3.getClass();
            int b3 = AbstractC0537f.b(c0444z.f5320y.f5132b);
            if (b3 == 0 || b3 == 1 || b3 == 2 || b3 == 3) {
                return;
            }
            if (b3 != 4) {
                throw new B1.c();
            }
            C0415I c0415i = c0444z.f5320y;
            if (!z4 && c0444z.v() == c0415i.f5146q.f5123u && (c0415i.f5133c || c0415i.f5134d)) {
                return;
            }
            c0415i.f5134d = true;
            c0415i.f5135e = true;
            if (!c0444z.f5297E && c0415i.f5146q.f5123u) {
                C0444z k3 = c0444z.k();
                if ((k3 == null || !k3.f5320y.f5134d) && (k3 == null || !k3.f5320y.f5133c)) {
                    o3.f5178b.g(c0444z, false);
                }
                if (o3.f5180d) {
                    return;
                }
                C(null);
                return;
            }
            return;
        }
        o3.getClass();
        int b4 = AbstractC0537f.b(c0444z.f5320y.f5132b);
        if (b4 != 0) {
            if (b4 == 1) {
                return;
            }
            if (b4 != 2) {
                if (b4 == 3) {
                    return;
                }
                if (b4 != 4) {
                    throw new B1.c();
                }
            }
        }
        C0415I c0415i2 = c0444z.f5320y;
        if ((c0415i2.f5136f || c0415i2.f5137g) && !z4) {
            return;
        }
        c0415i2.f5137g = true;
        c0415i2.h = true;
        c0415i2.f5134d = true;
        c0415i2.f5135e = true;
        if (c0444z.f5297E) {
            return;
        }
        C0444z k4 = c0444z.k();
        boolean a3 = p2.g.a(c0444z.x(), Boolean.TRUE);
        B2.i iVar = o3.f5178b;
        if (a3 && ((k4 == null || !k4.f5320y.f5136f) && (k4 == null || !k4.f5320y.f5137g))) {
            iVar.g(c0444z, true);
        } else if (c0444z.v() && ((k4 == null || !k4.f5320y.f5134d) && (k4 == null || !k4.f5320y.f5133c))) {
            iVar.g(c0444z, false);
        }
        if (o3.f5180d) {
            return;
        }
        C(null);
    }

    public final void z() {
        C0455E c0455e = this.f5715p;
        c0455e.f5416w = true;
        if (c0455e.z() && !c0455e.f5394H) {
            c0455e.f5394H = true;
            c0455e.f5405l.post(c0455e.f5395I);
        }
        R.e eVar = this.f5716q;
        eVar.f2212k = true;
        if (!eVar.h() || eVar.f2220s) {
            return;
        }
        eVar.f2220s = true;
        eVar.f2215n.post(eVar.f2221t);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i3) {
        p2.g.b(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i3, layoutParams, true);
    }

    public C0480g getAccessibilityManager() {
        return this.f5718r;
    }

    public C0482h getClipboardManager() {
        return this.f5670C;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i3, int i4) {
        ViewGroup.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.width = i3;
        generateDefaultLayoutParams.height = i4;
        addViewInLayout(view, -1, generateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i3, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }
}
