package Z;

import W.AbstractC0081d;
import W.C0080c;
import W.D;
import a.AbstractC0090a;
import a0.AbstractC0091a;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public final class k implements f {

    /* renamed from: A, reason: collision with root package name */
    public static final j f2859A = new j();

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0091a f2860b;

    /* renamed from: c, reason: collision with root package name */
    public final W.p f2861c;

    /* renamed from: d, reason: collision with root package name */
    public final q f2862d;

    /* renamed from: e, reason: collision with root package name */
    public final Resources f2863e;

    /* renamed from: f, reason: collision with root package name */
    public final Rect f2864f;

    /* renamed from: g, reason: collision with root package name */
    public int f2865g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public long f2866i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2867j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2868k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2869l;

    /* renamed from: m, reason: collision with root package name */
    public final int f2870m;

    /* renamed from: n, reason: collision with root package name */
    public int f2871n;

    /* renamed from: o, reason: collision with root package name */
    public float f2872o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2873p;

    /* renamed from: q, reason: collision with root package name */
    public float f2874q;

    /* renamed from: r, reason: collision with root package name */
    public float f2875r;

    /* renamed from: s, reason: collision with root package name */
    public float f2876s;

    /* renamed from: t, reason: collision with root package name */
    public float f2877t;

    /* renamed from: u, reason: collision with root package name */
    public float f2878u;

    /* renamed from: v, reason: collision with root package name */
    public long f2879v;

    /* renamed from: w, reason: collision with root package name */
    public long f2880w;

    /* renamed from: x, reason: collision with root package name */
    public float f2881x;

    /* renamed from: y, reason: collision with root package name */
    public float f2882y;

    /* renamed from: z, reason: collision with root package name */
    public float f2883z;

    public k(AbstractC0091a abstractC0091a) {
        W.p pVar = new W.p();
        Y.b bVar = new Y.b();
        this.f2860b = abstractC0091a;
        this.f2861c = pVar;
        q qVar = new q(abstractC0091a, pVar, bVar);
        this.f2862d = qVar;
        this.f2863e = abstractC0091a.getResources();
        this.f2864f = new Rect();
        abstractC0091a.addView(qVar);
        qVar.setClipBounds(null);
        this.f2866i = 0L;
        View.generateViewId();
        this.f2870m = 3;
        this.f2871n = 0;
        this.f2872o = 1.0f;
        this.f2874q = 1.0f;
        this.f2875r = 1.0f;
        long j3 = W.r.f2558b;
        this.f2879v = j3;
        this.f2880w = j3;
    }

    @Override // Z.f
    public final void A(long j3) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f2879v = j3;
            r.f2899a.b(this.f2862d, D.C(j3));
        }
    }

    @Override // Z.f
    public final float B() {
        return this.f2878u;
    }

    @Override // Z.f
    public final float C() {
        return this.f2875r;
    }

    @Override // Z.f
    public final float D() {
        return this.f2862d.getCameraDistance() / this.f2863e.getDisplayMetrics().densityDpi;
    }

    @Override // Z.f
    public final float E() {
        return this.f2883z;
    }

    @Override // Z.f
    public final int F() {
        return this.f2870m;
    }

    @Override // Z.f
    public final void G(long j3) {
        boolean M2 = r2.a.M(j3);
        q qVar = this.f2862d;
        if (!M2) {
            this.f2873p = false;
            qVar.setPivotX(V.c.b(j3));
            qVar.setPivotY(V.c.c(j3));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                r.f2899a.a(qVar);
                return;
            }
            this.f2873p = true;
            qVar.setPivotX(((int) (this.f2866i >> 32)) / 2.0f);
            qVar.setPivotY(((int) (this.f2866i & 4294967295L)) / 2.0f);
        }
    }

    @Override // Z.f
    public final long H() {
        return this.f2879v;
    }

    @Override // Z.f
    public final float I() {
        return this.f2876s;
    }

    @Override // Z.f
    public final void J(boolean z3) {
        boolean z4 = false;
        this.f2869l = z3 && !this.f2868k;
        this.f2867j = true;
        if (z3 && this.f2868k) {
            z4 = true;
        }
        this.f2862d.setClipToOutline(z4);
    }

    @Override // Z.f
    public final int K() {
        return this.f2871n;
    }

    @Override // Z.f
    public final float L() {
        return this.f2881x;
    }

    public final void M(int i3) {
        boolean z3 = true;
        boolean o3 = b.o(i3, 1);
        q qVar = this.f2862d;
        if (o3) {
            qVar.setLayerType(2, null);
        } else if (b.o(i3, 2)) {
            qVar.setLayerType(0, null);
            z3 = false;
        } else {
            qVar.setLayerType(0, null);
        }
        qVar.setCanUseCompositingLayer$ui_graphics_release(z3);
    }

    @Override // Z.f
    public final float a() {
        return this.f2872o;
    }

    @Override // Z.f
    public final void b(float f3) {
        this.f2882y = f3;
        this.f2862d.setRotationY(f3);
    }

    @Override // Z.f
    public final void c(float f3) {
        this.f2876s = f3;
        this.f2862d.setTranslationX(f3);
    }

    @Override // Z.f
    public final void d(float f3) {
        this.f2872o = f3;
        this.f2862d.setAlpha(f3);
    }

    @Override // Z.f
    public final boolean e() {
        return this.f2869l || this.f2862d.getClipToOutline();
    }

    @Override // Z.f
    public final void f(float f3) {
        this.f2875r = f3;
        this.f2862d.setScaleY(f3);
    }

    @Override // Z.f
    public final void g() {
        if (Build.VERSION.SDK_INT >= 31) {
            s.f2900a.a(this.f2862d, null);
        }
    }

    @Override // Z.f
    public final void h(float f3) {
        this.f2883z = f3;
        this.f2862d.setRotation(f3);
    }

    @Override // Z.f
    public final void i(float f3) {
        this.f2877t = f3;
        this.f2862d.setTranslationY(f3);
    }

    @Override // Z.f
    public final void j(float f3) {
        this.f2862d.setCameraDistance(f3 * this.f2863e.getDisplayMetrics().densityDpi);
    }

    @Override // Z.f
    public final void l(Outline outline) {
        q qVar = this.f2862d;
        qVar.h = outline;
        qVar.invalidateOutline();
        if (e() && outline != null) {
            qVar.setClipToOutline(true);
            if (this.f2869l) {
                this.f2869l = false;
                this.f2867j = true;
            }
        }
        this.f2868k = outline != null;
    }

    @Override // Z.f
    public final void m(float f3) {
        this.f2874q = f3;
        this.f2862d.setScaleX(f3);
    }

    @Override // Z.f
    public final void n(float f3) {
        this.f2881x = f3;
        this.f2862d.setRotationX(f3);
    }

    @Override // Z.f
    public final void o() {
        this.f2860b.removeViewInLayout(this.f2862d);
    }

    @Override // Z.f
    public final void p(int i3) {
        this.f2871n = i3;
        if (b.o(i3, 1) || !D.l(this.f2870m, 3)) {
            M(1);
        } else {
            M(this.f2871n);
        }
    }

    @Override // Z.f
    public final void q(long j3) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f2880w = j3;
            r.f2899a.c(this.f2862d, D.C(j3));
        }
    }

    @Override // Z.f
    public final float r() {
        return this.f2874q;
    }

    @Override // Z.f
    public final Matrix s() {
        return this.f2862d.getMatrix();
    }

    @Override // Z.f
    public final void t(float f3) {
        this.f2878u = f3;
        this.f2862d.setElevation(f3);
    }

    @Override // Z.f
    public final float u() {
        return this.f2877t;
    }

    @Override // Z.f
    public final void v(int i3, int i4, long j3) {
        boolean x3 = AbstractC0090a.x(this.f2866i, j3);
        q qVar = this.f2862d;
        if (x3) {
            int i5 = this.f2865g;
            if (i5 != i3) {
                qVar.offsetLeftAndRight(i3 - i5);
            }
            int i6 = this.h;
            if (i6 != i4) {
                qVar.offsetTopAndBottom(i4 - i6);
            }
        } else {
            if (e()) {
                this.f2867j = true;
            }
            int i7 = (int) (j3 >> 32);
            int i8 = (int) (4294967295L & j3);
            qVar.layout(i3, i4, i3 + i7, i4 + i8);
            this.f2866i = j3;
            if (this.f2873p) {
                qVar.setPivotX(i7 / 2.0f);
                qVar.setPivotY(i8 / 2.0f);
            }
        }
        this.f2865g = i3;
        this.h = i4;
    }

    @Override // Z.f
    public final float w() {
        return this.f2882y;
    }

    @Override // Z.f
    public final void x(W.o oVar) {
        Rect rect;
        boolean z3 = this.f2867j;
        q qVar = this.f2862d;
        if (z3) {
            if (!e() || this.f2868k) {
                rect = null;
            } else {
                rect = this.f2864f;
                rect.left = 0;
                rect.top = 0;
                rect.right = qVar.getWidth();
                rect.bottom = qVar.getHeight();
            }
            qVar.setClipBounds(rect);
        }
        if (AbstractC0081d.a(oVar).isHardwareAccelerated()) {
            this.f2860b.a(oVar, qVar, qVar.getDrawingTime());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Z.f
    public final void y(G0.b bVar, G0.f fVar, d dVar, o2.c cVar) {
        q qVar = this.f2862d;
        ViewParent parent = qVar.getParent();
        AbstractC0091a abstractC0091a = this.f2860b;
        if (parent == null) {
            abstractC0091a.addView(qVar);
        }
        qVar.f2895j = bVar;
        qVar.f2896k = fVar;
        qVar.f2897l = (p2.h) cVar;
        qVar.f2898m = dVar;
        if (qVar.isAttachedToWindow()) {
            qVar.setVisibility(4);
            qVar.setVisibility(0);
            try {
                W.p pVar = this.f2861c;
                j jVar = f2859A;
                C0080c c0080c = pVar.f2556a;
                Canvas canvas = c0080c.f2534a;
                c0080c.f2534a = jVar;
                abstractC0091a.a(c0080c, qVar, qVar.getDrawingTime());
                pVar.f2556a.f2534a = canvas;
            } catch (Throwable unused) {
            }
        }
    }

    @Override // Z.f
    public final long z() {
        return this.f2880w;
    }
}
