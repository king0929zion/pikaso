package o0;

import D.C0065y;
import W.C0080c;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;

/* renamed from: o0.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0508u0 implements InterfaceC0481g0 {

    /* renamed from: a, reason: collision with root package name */
    public final RenderNode f5736a = d1.a0.e();

    @Override // o0.InterfaceC0481g0
    public final int A() {
        int left;
        left = this.f5736a.getLeft();
        return left;
    }

    @Override // o0.InterfaceC0481g0
    public final void B(boolean z3) {
        this.f5736a.setClipToOutline(z3);
    }

    @Override // o0.InterfaceC0481g0
    public final int C() {
        int height;
        height = this.f5736a.getHeight();
        return height;
    }

    @Override // o0.InterfaceC0481g0
    public final void D(int i3) {
        RenderNode renderNode = this.f5736a;
        if (W.D.m(i3, 1)) {
            renderNode.setUseCompositingLayer(true, null);
            renderNode.setHasOverlappingRendering(true);
        } else if (W.D.m(i3, 2)) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // o0.InterfaceC0481g0
    public final void E(float f3) {
        this.f5736a.setPivotX(f3);
    }

    @Override // o0.InterfaceC0481g0
    public final void F(boolean z3) {
        this.f5736a.setClipToBounds(z3);
    }

    @Override // o0.InterfaceC0481g0
    public final void G(int i3) {
        this.f5736a.setSpotShadowColor(i3);
    }

    @Override // o0.InterfaceC0481g0
    public final boolean H(int i3, int i4, int i5, int i6) {
        boolean position;
        position = this.f5736a.setPosition(i3, i4, i5, i6);
        return position;
    }

    @Override // o0.InterfaceC0481g0
    public final boolean I() {
        boolean hasOverlappingRendering;
        hasOverlappingRendering = this.f5736a.setHasOverlappingRendering(true);
        return hasOverlappingRendering;
    }

    @Override // o0.InterfaceC0481g0
    public final void J(Matrix matrix) {
        this.f5736a.getMatrix(matrix);
    }

    @Override // o0.InterfaceC0481g0
    public final float K() {
        float elevation;
        elevation = this.f5736a.getElevation();
        return elevation;
    }

    @Override // o0.InterfaceC0481g0
    public final void L(int i3) {
        this.f5736a.setAmbientShadowColor(i3);
    }

    @Override // o0.InterfaceC0481g0
    public final float a() {
        float alpha;
        alpha = this.f5736a.getAlpha();
        return alpha;
    }

    @Override // o0.InterfaceC0481g0
    public final void b(float f3) {
        this.f5736a.setRotationY(f3);
    }

    @Override // o0.InterfaceC0481g0
    public final void c(float f3) {
        this.f5736a.setTranslationX(f3);
    }

    @Override // o0.InterfaceC0481g0
    public final void d(float f3) {
        this.f5736a.setAlpha(f3);
    }

    @Override // o0.InterfaceC0481g0
    public final void e(float f3) {
        this.f5736a.setPivotY(f3);
    }

    @Override // o0.InterfaceC0481g0
    public final void f(float f3) {
        this.f5736a.setScaleY(f3);
    }

    @Override // o0.InterfaceC0481g0
    public final void g() {
        if (Build.VERSION.SDK_INT >= 31) {
            C0510v0.f5738a.a(this.f5736a, null);
        }
    }

    @Override // o0.InterfaceC0481g0
    public final void h(float f3) {
        this.f5736a.setRotationZ(f3);
    }

    @Override // o0.InterfaceC0481g0
    public final void i(float f3) {
        this.f5736a.setTranslationY(f3);
    }

    @Override // o0.InterfaceC0481g0
    public final void j(float f3) {
        this.f5736a.setCameraDistance(f3);
    }

    @Override // o0.InterfaceC0481g0
    public final boolean k() {
        boolean hasDisplayList;
        hasDisplayList = this.f5736a.hasDisplayList();
        return hasDisplayList;
    }

    @Override // o0.InterfaceC0481g0
    public final void l(Outline outline) {
        this.f5736a.setOutline(outline);
    }

    @Override // o0.InterfaceC0481g0
    public final void m(float f3) {
        this.f5736a.setScaleX(f3);
    }

    @Override // o0.InterfaceC0481g0
    public final void n(float f3) {
        this.f5736a.setRotationX(f3);
    }

    @Override // o0.InterfaceC0481g0
    public final void o() {
        this.f5736a.discardDisplayList();
    }

    @Override // o0.InterfaceC0481g0
    public final void p(W.p pVar, W.C c3, C0065y c0065y) {
        RecordingCanvas beginRecording;
        beginRecording = this.f5736a.beginRecording();
        C0080c c0080c = pVar.f2556a;
        Canvas canvas = c0080c.f2534a;
        c0080c.f2534a = beginRecording;
        if (c3 != null) {
            c0080c.d();
            c0080c.j(c3, 1);
        }
        c0065y.i(c0080c);
        if (c3 != null) {
            c0080c.a();
        }
        pVar.f2556a.f2534a = canvas;
        this.f5736a.endRecording();
    }

    @Override // o0.InterfaceC0481g0
    public final void q(float f3) {
        this.f5736a.setElevation(f3);
    }

    @Override // o0.InterfaceC0481g0
    public final void r(int i3) {
        this.f5736a.offsetLeftAndRight(i3);
    }

    @Override // o0.InterfaceC0481g0
    public final int s() {
        int bottom;
        bottom = this.f5736a.getBottom();
        return bottom;
    }

    @Override // o0.InterfaceC0481g0
    public final int t() {
        int right;
        right = this.f5736a.getRight();
        return right;
    }

    @Override // o0.InterfaceC0481g0
    public final boolean u() {
        boolean clipToOutline;
        clipToOutline = this.f5736a.getClipToOutline();
        return clipToOutline;
    }

    @Override // o0.InterfaceC0481g0
    public final void v(int i3) {
        this.f5736a.offsetTopAndBottom(i3);
    }

    @Override // o0.InterfaceC0481g0
    public final boolean w() {
        boolean clipToBounds;
        clipToBounds = this.f5736a.getClipToBounds();
        return clipToBounds;
    }

    @Override // o0.InterfaceC0481g0
    public final int x() {
        int width;
        width = this.f5736a.getWidth();
        return width;
    }

    @Override // o0.InterfaceC0481g0
    public final void y(Canvas canvas) {
        canvas.drawRenderNode(this.f5736a);
    }

    @Override // o0.InterfaceC0481g0
    public final int z() {
        int top;
        top = this.f5736a.getTop();
        return top;
    }
}
