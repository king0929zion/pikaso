package Z;

import W.AbstractC0081d;
import W.C0080c;
import W.D;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;

/* loaded from: classes.dex */
public final class i implements f {

    /* renamed from: b, reason: collision with root package name */
    public final W.p f2837b;

    /* renamed from: c, reason: collision with root package name */
    public final Y.b f2838c;

    /* renamed from: d, reason: collision with root package name */
    public final RenderNode f2839d;

    /* renamed from: e, reason: collision with root package name */
    public long f2840e;

    /* renamed from: f, reason: collision with root package name */
    public Matrix f2841f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2842g;
    public float h;

    /* renamed from: i, reason: collision with root package name */
    public final int f2843i;

    /* renamed from: j, reason: collision with root package name */
    public float f2844j;

    /* renamed from: k, reason: collision with root package name */
    public float f2845k;

    /* renamed from: l, reason: collision with root package name */
    public float f2846l;

    /* renamed from: m, reason: collision with root package name */
    public float f2847m;

    /* renamed from: n, reason: collision with root package name */
    public float f2848n;

    /* renamed from: o, reason: collision with root package name */
    public long f2849o;

    /* renamed from: p, reason: collision with root package name */
    public long f2850p;

    /* renamed from: q, reason: collision with root package name */
    public float f2851q;

    /* renamed from: r, reason: collision with root package name */
    public float f2852r;

    /* renamed from: s, reason: collision with root package name */
    public float f2853s;

    /* renamed from: t, reason: collision with root package name */
    public float f2854t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2855u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2856v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2857w;

    /* renamed from: x, reason: collision with root package name */
    public int f2858x;

    public i() {
        W.p pVar = new W.p();
        Y.b bVar = new Y.b();
        this.f2837b = pVar;
        this.f2838c = bVar;
        RenderNode b3 = h.b();
        this.f2839d = b3;
        this.f2840e = 0L;
        b3.setClipToBounds(false);
        N(b3, 0);
        this.h = 1.0f;
        this.f2843i = 3;
        this.f2844j = 1.0f;
        this.f2845k = 1.0f;
        long j3 = W.r.f2558b;
        this.f2849o = j3;
        this.f2850p = j3;
        this.f2854t = 8.0f;
        this.f2858x = 0;
    }

    public static void N(RenderNode renderNode, int i3) {
        if (b.o(i3, 1)) {
            renderNode.setUseCompositingLayer(true, null);
            renderNode.setHasOverlappingRendering(true);
        } else if (b.o(i3, 2)) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // Z.f
    public final void A(long j3) {
        this.f2849o = j3;
        this.f2839d.setAmbientShadowColor(D.C(j3));
    }

    @Override // Z.f
    public final float B() {
        return this.f2848n;
    }

    @Override // Z.f
    public final float C() {
        return this.f2845k;
    }

    @Override // Z.f
    public final float D() {
        return this.f2854t;
    }

    @Override // Z.f
    public final float E() {
        return this.f2853s;
    }

    @Override // Z.f
    public final int F() {
        return this.f2843i;
    }

    @Override // Z.f
    public final void G(long j3) {
        if (r2.a.M(j3)) {
            this.f2839d.resetPivot();
        } else {
            this.f2839d.setPivotX(V.c.b(j3));
            this.f2839d.setPivotY(V.c.c(j3));
        }
    }

    @Override // Z.f
    public final long H() {
        return this.f2849o;
    }

    @Override // Z.f
    public final float I() {
        return this.f2846l;
    }

    @Override // Z.f
    public final void J(boolean z3) {
        this.f2855u = z3;
        M();
    }

    @Override // Z.f
    public final int K() {
        return this.f2858x;
    }

    @Override // Z.f
    public final float L() {
        return this.f2851q;
    }

    public final void M() {
        boolean z3 = this.f2855u;
        boolean z4 = false;
        boolean z5 = z3 && !this.f2842g;
        if (z3 && this.f2842g) {
            z4 = true;
        }
        if (z5 != this.f2856v) {
            this.f2856v = z5;
            this.f2839d.setClipToBounds(z5);
        }
        if (z4 != this.f2857w) {
            this.f2857w = z4;
            this.f2839d.setClipToOutline(z4);
        }
    }

    @Override // Z.f
    public final float a() {
        return this.h;
    }

    @Override // Z.f
    public final void b(float f3) {
        this.f2852r = f3;
        this.f2839d.setRotationY(f3);
    }

    @Override // Z.f
    public final void c(float f3) {
        this.f2846l = f3;
        this.f2839d.setTranslationX(f3);
    }

    @Override // Z.f
    public final void d(float f3) {
        this.h = f3;
        this.f2839d.setAlpha(f3);
    }

    @Override // Z.f
    public final boolean e() {
        return this.f2855u;
    }

    @Override // Z.f
    public final void f(float f3) {
        this.f2845k = f3;
        this.f2839d.setScaleY(f3);
    }

    @Override // Z.f
    public final void g() {
        if (Build.VERSION.SDK_INT >= 31) {
            o.f2887a.a(this.f2839d, null);
        }
    }

    @Override // Z.f
    public final void h(float f3) {
        this.f2853s = f3;
        this.f2839d.setRotationZ(f3);
    }

    @Override // Z.f
    public final void i(float f3) {
        this.f2847m = f3;
        this.f2839d.setTranslationY(f3);
    }

    @Override // Z.f
    public final void j(float f3) {
        this.f2854t = f3;
        this.f2839d.setCameraDistance(f3);
    }

    @Override // Z.f
    public final boolean k() {
        boolean hasDisplayList;
        hasDisplayList = this.f2839d.hasDisplayList();
        return hasDisplayList;
    }

    @Override // Z.f
    public final void l(Outline outline) {
        this.f2839d.setOutline(outline);
        this.f2842g = outline != null;
        M();
    }

    @Override // Z.f
    public final void m(float f3) {
        this.f2844j = f3;
        this.f2839d.setScaleX(f3);
    }

    @Override // Z.f
    public final void n(float f3) {
        this.f2851q = f3;
        this.f2839d.setRotationX(f3);
    }

    @Override // Z.f
    public final void o() {
        this.f2839d.discardDisplayList();
    }

    @Override // Z.f
    public final void p(int i3) {
        this.f2858x = i3;
        if (b.o(i3, 1) || !D.l(this.f2843i, 3)) {
            N(this.f2839d, 1);
        } else {
            N(this.f2839d, this.f2858x);
        }
    }

    @Override // Z.f
    public final void q(long j3) {
        this.f2850p = j3;
        this.f2839d.setSpotShadowColor(D.C(j3));
    }

    @Override // Z.f
    public final float r() {
        return this.f2844j;
    }

    @Override // Z.f
    public final Matrix s() {
        Matrix matrix = this.f2841f;
        if (matrix == null) {
            matrix = new Matrix();
            this.f2841f = matrix;
        }
        this.f2839d.getMatrix(matrix);
        return matrix;
    }

    @Override // Z.f
    public final void t(float f3) {
        this.f2848n = f3;
        this.f2839d.setElevation(f3);
    }

    @Override // Z.f
    public final float u() {
        return this.f2847m;
    }

    @Override // Z.f
    public final void v(int i3, int i4, long j3) {
        this.f2839d.setPosition(i3, i4, ((int) (j3 >> 32)) + i3, ((int) (4294967295L & j3)) + i4);
        this.f2840e = r2.a.c0(j3);
    }

    @Override // Z.f
    public final float w() {
        return this.f2852r;
    }

    @Override // Z.f
    public final void x(W.o oVar) {
        AbstractC0081d.a(oVar).drawRenderNode(this.f2839d);
    }

    @Override // Z.f
    public final void y(G0.b bVar, G0.f fVar, d dVar, o2.c cVar) {
        RecordingCanvas beginRecording;
        Y.b bVar2 = this.f2838c;
        beginRecording = this.f2839d.beginRecording();
        try {
            W.p pVar = this.f2837b;
            C0080c c0080c = pVar.f2556a;
            Canvas canvas = c0080c.f2534a;
            c0080c.f2534a = beginRecording;
            B0.a aVar = bVar2.f2770e;
            aVar.G(bVar);
            aVar.I(fVar);
            aVar.f272c = dVar;
            aVar.J(this.f2840e);
            aVar.F(c0080c);
            cVar.i(bVar2);
            pVar.f2556a.f2534a = canvas;
        } finally {
            this.f2839d.endRecording();
        }
    }

    @Override // Z.f
    public final long z() {
        return this.f2850p;
    }
}
