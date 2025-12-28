package Z;

import W.AbstractC0081d;
import W.C0080c;
import W.D;
import a.AbstractC0090a;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import java.util.concurrent.atomic.AtomicBoolean;
import o0.C0507u;

/* loaded from: classes.dex */
public final class g implements f {

    /* renamed from: z, reason: collision with root package name */
    public static final AtomicBoolean f2813z = new AtomicBoolean(true);

    /* renamed from: b, reason: collision with root package name */
    public final W.p f2814b;

    /* renamed from: c, reason: collision with root package name */
    public final Y.b f2815c;

    /* renamed from: d, reason: collision with root package name */
    public final RenderNode f2816d;

    /* renamed from: e, reason: collision with root package name */
    public long f2817e;

    /* renamed from: f, reason: collision with root package name */
    public Matrix f2818f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2819g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public final int f2820i;

    /* renamed from: j, reason: collision with root package name */
    public float f2821j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2822k;

    /* renamed from: l, reason: collision with root package name */
    public float f2823l;

    /* renamed from: m, reason: collision with root package name */
    public float f2824m;

    /* renamed from: n, reason: collision with root package name */
    public float f2825n;

    /* renamed from: o, reason: collision with root package name */
    public float f2826o;

    /* renamed from: p, reason: collision with root package name */
    public float f2827p;

    /* renamed from: q, reason: collision with root package name */
    public long f2828q;

    /* renamed from: r, reason: collision with root package name */
    public long f2829r;

    /* renamed from: s, reason: collision with root package name */
    public float f2830s;

    /* renamed from: t, reason: collision with root package name */
    public float f2831t;

    /* renamed from: u, reason: collision with root package name */
    public float f2832u;

    /* renamed from: v, reason: collision with root package name */
    public float f2833v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2834w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2835x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f2836y;

    public g(C0507u c0507u, W.p pVar, Y.b bVar) {
        this.f2814b = pVar;
        this.f2815c = bVar;
        RenderNode create = RenderNode.create("Compose", c0507u);
        this.f2816d = create;
        this.f2817e = 0L;
        if (f2813z.getAndSet(false)) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            if (Build.VERSION.SDK_INT >= 28) {
                n nVar = n.f2886a;
                nVar.c(create, nVar.a(create));
                nVar.d(create, nVar.b(create));
            }
            m.f2885a.a(create);
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
        }
        create.setClipToBounds(false);
        N(0);
        this.h = 0;
        this.f2820i = 3;
        this.f2821j = 1.0f;
        this.f2823l = 1.0f;
        this.f2824m = 1.0f;
        int i3 = W.r.f2563g;
        this.f2828q = D.r();
        this.f2829r = D.r();
        this.f2833v = 8.0f;
    }

    @Override // Z.f
    public final void A(long j3) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f2828q = j3;
            n.f2886a.c(this.f2816d, D.C(j3));
        }
    }

    @Override // Z.f
    public final float B() {
        return this.f2827p;
    }

    @Override // Z.f
    public final float C() {
        return this.f2824m;
    }

    @Override // Z.f
    public final float D() {
        return this.f2833v;
    }

    @Override // Z.f
    public final float E() {
        return this.f2832u;
    }

    @Override // Z.f
    public final int F() {
        return this.f2820i;
    }

    @Override // Z.f
    public final void G(long j3) {
        if (r2.a.M(j3)) {
            this.f2822k = true;
            this.f2816d.setPivotX(AbstractC0090a.N(this.f2817e) / 2.0f);
            this.f2816d.setPivotY(AbstractC0090a.I(this.f2817e) / 2.0f);
        } else {
            this.f2822k = false;
            this.f2816d.setPivotX(V.c.b(j3));
            this.f2816d.setPivotY(V.c.c(j3));
        }
    }

    @Override // Z.f
    public final long H() {
        return this.f2828q;
    }

    @Override // Z.f
    public final float I() {
        return this.f2825n;
    }

    @Override // Z.f
    public final void J(boolean z3) {
        this.f2834w = z3;
        M();
    }

    @Override // Z.f
    public final int K() {
        return this.h;
    }

    @Override // Z.f
    public final float L() {
        return this.f2830s;
    }

    public final void M() {
        boolean z3 = this.f2834w;
        boolean z4 = false;
        boolean z5 = z3 && !this.f2819g;
        if (z3 && this.f2819g) {
            z4 = true;
        }
        if (z5 != this.f2835x) {
            this.f2835x = z5;
            this.f2816d.setClipToBounds(z5);
        }
        if (z4 != this.f2836y) {
            this.f2836y = z4;
            this.f2816d.setClipToOutline(z4);
        }
    }

    public final void N(int i3) {
        RenderNode renderNode = this.f2816d;
        if (b.o(i3, 1)) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(true);
        } else if (b.o(i3, 2)) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // Z.f
    public final float a() {
        return this.f2821j;
    }

    @Override // Z.f
    public final void b(float f3) {
        this.f2831t = f3;
        this.f2816d.setRotationY(f3);
    }

    @Override // Z.f
    public final void c(float f3) {
        this.f2825n = f3;
        this.f2816d.setTranslationX(f3);
    }

    @Override // Z.f
    public final void d(float f3) {
        this.f2821j = f3;
        this.f2816d.setAlpha(f3);
    }

    @Override // Z.f
    public final boolean e() {
        return this.f2834w;
    }

    @Override // Z.f
    public final void f(float f3) {
        this.f2824m = f3;
        this.f2816d.setScaleY(f3);
    }

    @Override // Z.f
    public final void g() {
    }

    @Override // Z.f
    public final void h(float f3) {
        this.f2832u = f3;
        this.f2816d.setRotation(f3);
    }

    @Override // Z.f
    public final void i(float f3) {
        this.f2826o = f3;
        this.f2816d.setTranslationY(f3);
    }

    @Override // Z.f
    public final void j(float f3) {
        this.f2833v = f3;
        this.f2816d.setCameraDistance(-f3);
    }

    @Override // Z.f
    public final boolean k() {
        return this.f2816d.isValid();
    }

    @Override // Z.f
    public final void l(Outline outline) {
        this.f2816d.setOutline(outline);
        this.f2819g = outline != null;
        M();
    }

    @Override // Z.f
    public final void m(float f3) {
        this.f2823l = f3;
        this.f2816d.setScaleX(f3);
    }

    @Override // Z.f
    public final void n(float f3) {
        this.f2830s = f3;
        this.f2816d.setRotationX(f3);
    }

    @Override // Z.f
    public final void o() {
        m.f2885a.a(this.f2816d);
    }

    @Override // Z.f
    public final void p(int i3) {
        this.h = i3;
        if (b.o(i3, 1) || !D.l(this.f2820i, 3)) {
            N(1);
        } else {
            N(this.h);
        }
    }

    @Override // Z.f
    public final void q(long j3) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f2829r = j3;
            n.f2886a.d(this.f2816d, D.C(j3));
        }
    }

    @Override // Z.f
    public final float r() {
        return this.f2823l;
    }

    @Override // Z.f
    public final Matrix s() {
        Matrix matrix = this.f2818f;
        if (matrix == null) {
            matrix = new Matrix();
            this.f2818f = matrix;
        }
        this.f2816d.getMatrix(matrix);
        return matrix;
    }

    @Override // Z.f
    public final void t(float f3) {
        this.f2827p = f3;
        this.f2816d.setElevation(f3);
    }

    @Override // Z.f
    public final float u() {
        return this.f2826o;
    }

    @Override // Z.f
    public final void v(int i3, int i4, long j3) {
        this.f2816d.setLeftTopRightBottom(i3, i4, AbstractC0090a.N(j3) + i3, AbstractC0090a.I(j3) + i4);
        if (AbstractC0090a.x(this.f2817e, j3)) {
            return;
        }
        if (this.f2822k) {
            this.f2816d.setPivotX(AbstractC0090a.N(j3) / 2.0f);
            this.f2816d.setPivotY(AbstractC0090a.I(j3) / 2.0f);
        }
        this.f2817e = j3;
    }

    @Override // Z.f
    public final float w() {
        return this.f2831t;
    }

    @Override // Z.f
    public final void x(W.o oVar) {
        DisplayListCanvas a3 = AbstractC0081d.a(oVar);
        p2.g.c(a3, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        a3.drawRenderNode(this.f2816d);
    }

    @Override // Z.f
    public final void y(G0.b bVar, G0.f fVar, d dVar, o2.c cVar) {
        Canvas start = this.f2816d.start(AbstractC0090a.N(this.f2817e), AbstractC0090a.I(this.f2817e));
        try {
            W.p pVar = this.f2814b;
            Canvas r3 = pVar.a().r();
            pVar.a().s(start);
            C0080c a3 = pVar.a();
            Y.b bVar2 = this.f2815c;
            long c02 = r2.a.c0(this.f2817e);
            G0.b l3 = bVar2.H().l();
            G0.f p3 = bVar2.H().p();
            W.o j3 = bVar2.H().j();
            long r4 = bVar2.H().r();
            d o3 = bVar2.H().o();
            B0.a H2 = bVar2.H();
            H2.G(bVar);
            H2.I(fVar);
            H2.F(a3);
            H2.J(c02);
            H2.H(dVar);
            a3.d();
            try {
                cVar.i(bVar2);
                a3.a();
                B0.a H3 = bVar2.H();
                H3.G(l3);
                H3.I(p3);
                H3.F(j3);
                H3.J(r4);
                H3.H(o3);
                pVar.a().s(r3);
            } catch (Throwable th) {
                a3.a();
                B0.a H4 = bVar2.H();
                H4.G(l3);
                H4.I(p3);
                H4.F(j3);
                H4.J(r4);
                H4.H(o3);
                throw th;
            }
        } finally {
            this.f2816d.end(start);
        }
    }

    @Override // Z.f
    public final long z() {
        return this.f2829r;
    }
}
