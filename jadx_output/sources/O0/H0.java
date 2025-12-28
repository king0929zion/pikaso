package o0;

import A.C0008i;
import W.C0080c;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class H0 extends View implements n0.d0 {

    /* renamed from: s, reason: collision with root package name */
    public static final Z.p f5423s = new Z.p(1);

    /* renamed from: t, reason: collision with root package name */
    public static Method f5424t;

    /* renamed from: u, reason: collision with root package name */
    public static Field f5425u;

    /* renamed from: v, reason: collision with root package name */
    public static boolean f5426v;

    /* renamed from: w, reason: collision with root package name */
    public static boolean f5427w;

    /* renamed from: d, reason: collision with root package name */
    public final C0507u f5428d;

    /* renamed from: e, reason: collision with root package name */
    public final C0489k0 f5429e;

    /* renamed from: f, reason: collision with root package name */
    public C0008i f5430f;

    /* renamed from: g, reason: collision with root package name */
    public A0.c f5431g;
    public final C0502r0 h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f5432i;

    /* renamed from: j, reason: collision with root package name */
    public Rect f5433j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5434k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f5435l;

    /* renamed from: m, reason: collision with root package name */
    public final W.p f5436m;

    /* renamed from: n, reason: collision with root package name */
    public final C0497o0 f5437n;

    /* renamed from: o, reason: collision with root package name */
    public long f5438o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f5439p;

    /* renamed from: q, reason: collision with root package name */
    public final long f5440q;

    /* renamed from: r, reason: collision with root package name */
    public int f5441r;

    public H0(C0507u c0507u, C0489k0 c0489k0, C0008i c0008i, A0.c cVar) {
        super(c0507u.getContext());
        this.f5428d = c0507u;
        this.f5429e = c0489k0;
        this.f5430f = c0008i;
        this.f5431g = cVar;
        this.h = new C0502r0();
        this.f5436m = new W.p();
        this.f5437n = new C0497o0(C0454D.f5384i);
        this.f5438o = W.K.f2530a;
        this.f5439p = true;
        setWillNotDraw(false);
        c0489k0.addView(this);
        this.f5440q = View.generateViewId();
    }

    private final W.C getManualClipPath() {
        if (getClipToOutline()) {
            C0502r0 c0502r0 = this.h;
            if (c0502r0.f5650g) {
                c0502r0.d();
                return c0502r0.f5648e;
            }
        }
        return null;
    }

    private final void setInvalidated(boolean z3) {
        if (z3 != this.f5434k) {
            this.f5434k = z3;
            this.f5428d.t(this, z3);
        }
    }

    @Override // n0.d0
    public final void a() {
        setInvalidated(false);
        C0507u c0507u = this.f5428d;
        c0507u.f5669B = true;
        this.f5430f = null;
        this.f5431g = null;
        c0507u.B(this);
        this.f5429e.removeViewInLayout(this);
    }

    @Override // n0.d0
    public final long b(long j3, boolean z3) {
        C0497o0 c0497o0 = this.f5437n;
        if (!z3) {
            return W.D.t(c0497o0.b(this), j3);
        }
        float[] a3 = c0497o0.a(this);
        if (a3 != null) {
            return W.D.t(a3, j3);
        }
        return 9187343241974906880L;
    }

    @Override // n0.d0
    public final void c(long j3) {
        int i3 = (int) (j3 >> 32);
        int left = getLeft();
        C0497o0 c0497o0 = this.f5437n;
        if (i3 != left) {
            offsetLeftAndRight(i3 - getLeft());
            c0497o0.c();
        }
        int i4 = (int) (j3 & 4294967295L);
        if (i4 != getTop()) {
            offsetTopAndBottom(i4 - getTop());
            c0497o0.c();
        }
    }

    @Override // n0.d0
    public final void d() {
        if (!this.f5434k || f5427w) {
            return;
        }
        AbstractC0461K.q(this);
        setInvalidated(false);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z3;
        W.p pVar = this.f5436m;
        C0080c c0080c = pVar.f2556a;
        Canvas canvas2 = c0080c.f2534a;
        c0080c.f2534a = canvas;
        if (getManualClipPath() == null && canvas.isHardwareAccelerated()) {
            z3 = false;
        } else {
            c0080c.d();
            this.h.a(c0080c);
            z3 = true;
        }
        C0008i c0008i = this.f5430f;
        if (c0008i != null) {
            c0008i.h(c0080c, null);
        }
        if (z3) {
            c0080c.a();
        }
        pVar.f2556a.f2534a = canvas2;
        setInvalidated(false);
    }

    @Override // n0.d0
    public final void e(long j3) {
        int i3 = (int) (j3 >> 32);
        int i4 = (int) (j3 & 4294967295L);
        if (i3 == getWidth() && i4 == getHeight()) {
            return;
        }
        setPivotX(W.K.a(this.f5438o) * i3);
        setPivotY(W.K.b(this.f5438o) * i4);
        setOutlineProvider(this.h.b() != null ? f5423s : null);
        layout(getLeft(), getTop(), getLeft() + i3, getTop() + i4);
        k();
        this.f5437n.c();
    }

    @Override // n0.d0
    public final void f(V.b bVar, boolean z3) {
        C0497o0 c0497o0 = this.f5437n;
        if (!z3) {
            W.D.u(c0497o0.b(this), bVar);
            return;
        }
        float[] a3 = c0497o0.a(this);
        if (a3 != null) {
            W.D.u(a3, bVar);
            return;
        }
        bVar.f2440a = 0.0f;
        bVar.f2441b = 0.0f;
        bVar.f2442c = 0.0f;
        bVar.f2443d = 0.0f;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // n0.d0
    public final boolean g(long j3) {
        W.B b3;
        float b4 = V.c.b(j3);
        float c3 = V.c.c(j3);
        if (this.f5432i) {
            return 0.0f <= b4 && b4 < ((float) getWidth()) && 0.0f <= c3 && c3 < ((float) getHeight());
        }
        if (!getClipToOutline()) {
            return true;
        }
        C0502r0 c0502r0 = this.h;
        if (c0502r0.f5655m && (b3 = c0502r0.f5646c) != null) {
            return AbstractC0461K.j(b3, V.c.b(j3), V.c.c(j3), null, null);
        }
        return true;
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    public final C0489k0 getContainer() {
        return this.f5429e;
    }

    public long getLayerId() {
        return this.f5440q;
    }

    public final C0507u getOwnerView() {
        return this.f5428d;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return G0.a(this.f5428d);
        }
        return -1L;
    }

    @Override // n0.d0
    public final void h(W.o oVar, Z.d dVar) {
        boolean z3 = getElevation() > 0.0f;
        this.f5435l = z3;
        if (z3) {
            oVar.m();
        }
        this.f5429e.a(oVar, this, getDrawingTime());
        if (this.f5435l) {
            oVar.e();
        }
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f5439p;
    }

    @Override // n0.d0
    public final void i(C0008i c0008i, A0.c cVar) {
        this.f5429e.addView(this);
        this.f5432i = false;
        this.f5435l = false;
        this.f5438o = W.K.f2530a;
        this.f5430f = c0008i;
        this.f5431g = cVar;
    }

    @Override // android.view.View, n0.d0
    public final void invalidate() {
        if (this.f5434k) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.f5428d.invalidate();
    }

    @Override // n0.d0
    public final void j(W.F f3) {
        A0.c cVar;
        int i3 = f3.f2488d | this.f5441r;
        if ((i3 & 4096) != 0) {
            long j3 = f3.f2500q;
            this.f5438o = j3;
            setPivotX(W.K.a(j3) * getWidth());
            setPivotY(W.K.b(this.f5438o) * getHeight());
        }
        if ((i3 & 1) != 0) {
            setScaleX(f3.f2489e);
        }
        if ((i3 & 2) != 0) {
            setScaleY(f3.f2490f);
        }
        if ((i3 & 4) != 0) {
            setAlpha(f3.f2491g);
        }
        if ((i3 & 8) != 0) {
            setTranslationX(f3.h);
        }
        if ((i3 & 16) != 0) {
            setTranslationY(f3.f2492i);
        }
        if ((i3 & 32) != 0) {
            setElevation(f3.f2493j);
        }
        if ((i3 & 1024) != 0) {
            setRotation(f3.f2498o);
        }
        if ((i3 & 256) != 0) {
            setRotationX(f3.f2496m);
        }
        if ((i3 & 512) != 0) {
            setRotationY(f3.f2497n);
        }
        if ((i3 & 2048) != 0) {
            setCameraDistancePx(f3.f2499p);
        }
        boolean z3 = true;
        boolean z4 = getManualClipPath() != null;
        boolean z5 = f3.f2502s;
        X1.e eVar = W.D.f2484a;
        boolean z6 = z5 && f3.f2501r != eVar;
        if ((i3 & 24576) != 0) {
            this.f5432i = z5 && f3.f2501r == eVar;
            k();
            setClipToOutline(z6);
        }
        boolean c3 = this.h.c(f3.f2507x, f3.f2491g, z6, f3.f2493j, f3.f2504u);
        C0502r0 c0502r0 = this.h;
        if (c0502r0.f5649f) {
            setOutlineProvider(c0502r0.b() != null ? f5423s : null);
        }
        boolean z7 = getManualClipPath() != null;
        if (z4 != z7 || (z7 && c3)) {
            invalidate();
        }
        if (!this.f5435l && getElevation() > 0.0f && (cVar = this.f5431g) != null) {
            cVar.c();
        }
        if ((i3 & 7963) != 0) {
            this.f5437n.c();
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            int i5 = i3 & 64;
            J0 j02 = J0.f5444a;
            if (i5 != 0) {
                j02.a(this, W.D.C(f3.f2494k));
            }
            if ((i3 & 128) != 0) {
                j02.b(this, W.D.C(f3.f2495l));
            }
        }
        if (i4 >= 31 && (131072 & i3) != 0) {
            K0.f5447a.a(this, null);
        }
        if ((i3 & 32768) != 0) {
            int i6 = f3.f2503t;
            if (W.D.m(i6, 1)) {
                setLayerType(2, null);
            } else if (W.D.m(i6, 2)) {
                setLayerType(0, null);
                z3 = false;
            } else {
                setLayerType(0, null);
            }
            this.f5439p = z3;
        }
        this.f5441r = f3.f2488d;
    }

    public final void k() {
        Rect rect;
        if (this.f5432i) {
            Rect rect2 = this.f5433j;
            if (rect2 == null) {
                this.f5433j = new Rect(0, 0, getWidth(), getHeight());
            } else {
                p2.g.b(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.f5433j;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    @Override // android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
    }

    public final void setCameraDistancePx(float f3) {
        setCameraDistance(f3 * getResources().getDisplayMetrics().densityDpi);
    }
}
