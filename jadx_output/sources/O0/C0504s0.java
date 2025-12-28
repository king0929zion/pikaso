package o0;

import D.C0065y;
import W.C0080c;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;

/* renamed from: o0.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0504s0 implements InterfaceC0481g0 {

    /* renamed from: g, reason: collision with root package name */
    public static boolean f5657g = true;

    /* renamed from: a, reason: collision with root package name */
    public final RenderNode f5658a;

    /* renamed from: b, reason: collision with root package name */
    public int f5659b;

    /* renamed from: c, reason: collision with root package name */
    public int f5660c;

    /* renamed from: d, reason: collision with root package name */
    public int f5661d;

    /* renamed from: e, reason: collision with root package name */
    public int f5662e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5663f;

    public C0504s0(C0507u c0507u) {
        RenderNode create = RenderNode.create("Compose", c0507u);
        this.f5658a = create;
        if (f5657g) {
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
                C0516y0 c0516y0 = C0516y0.f5753a;
                c0516y0.c(create, c0516y0.a(create));
                c0516y0.d(create, c0516y0.b(create));
            }
            C0514x0.f5752a.a(create);
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
            f5657g = false;
        }
    }

    @Override // o0.InterfaceC0481g0
    public final int A() {
        return this.f5659b;
    }

    @Override // o0.InterfaceC0481g0
    public final void B(boolean z3) {
        this.f5658a.setClipToOutline(z3);
    }

    @Override // o0.InterfaceC0481g0
    public final int C() {
        return this.f5662e - this.f5660c;
    }

    @Override // o0.InterfaceC0481g0
    public final void D(int i3) {
        if (W.D.m(i3, 1)) {
            this.f5658a.setLayerType(2);
            this.f5658a.setHasOverlappingRendering(true);
        } else if (W.D.m(i3, 2)) {
            this.f5658a.setLayerType(0);
            this.f5658a.setHasOverlappingRendering(false);
        } else {
            this.f5658a.setLayerType(0);
            this.f5658a.setHasOverlappingRendering(true);
        }
    }

    @Override // o0.InterfaceC0481g0
    public final void E(float f3) {
        this.f5658a.setPivotX(f3);
    }

    @Override // o0.InterfaceC0481g0
    public final void F(boolean z3) {
        this.f5663f = z3;
        this.f5658a.setClipToBounds(z3);
    }

    @Override // o0.InterfaceC0481g0
    public final void G(int i3) {
        if (Build.VERSION.SDK_INT >= 28) {
            C0516y0.f5753a.d(this.f5658a, i3);
        }
    }

    @Override // o0.InterfaceC0481g0
    public final boolean H(int i3, int i4, int i5, int i6) {
        this.f5659b = i3;
        this.f5660c = i4;
        this.f5661d = i5;
        this.f5662e = i6;
        return this.f5658a.setLeftTopRightBottom(i3, i4, i5, i6);
    }

    @Override // o0.InterfaceC0481g0
    public final boolean I() {
        return this.f5658a.setHasOverlappingRendering(true);
    }

    @Override // o0.InterfaceC0481g0
    public final void J(Matrix matrix) {
        this.f5658a.getMatrix(matrix);
    }

    @Override // o0.InterfaceC0481g0
    public final float K() {
        return this.f5658a.getElevation();
    }

    @Override // o0.InterfaceC0481g0
    public final void L(int i3) {
        if (Build.VERSION.SDK_INT >= 28) {
            C0516y0.f5753a.c(this.f5658a, i3);
        }
    }

    @Override // o0.InterfaceC0481g0
    public final float a() {
        return this.f5658a.getAlpha();
    }

    @Override // o0.InterfaceC0481g0
    public final void b(float f3) {
        this.f5658a.setRotationY(f3);
    }

    @Override // o0.InterfaceC0481g0
    public final void c(float f3) {
        this.f5658a.setTranslationX(f3);
    }

    @Override // o0.InterfaceC0481g0
    public final void d(float f3) {
        this.f5658a.setAlpha(f3);
    }

    @Override // o0.InterfaceC0481g0
    public final void e(float f3) {
        this.f5658a.setPivotY(f3);
    }

    @Override // o0.InterfaceC0481g0
    public final void f(float f3) {
        this.f5658a.setScaleY(f3);
    }

    @Override // o0.InterfaceC0481g0
    public final void g() {
    }

    @Override // o0.InterfaceC0481g0
    public final void h(float f3) {
        this.f5658a.setRotation(f3);
    }

    @Override // o0.InterfaceC0481g0
    public final void i(float f3) {
        this.f5658a.setTranslationY(f3);
    }

    @Override // o0.InterfaceC0481g0
    public final void j(float f3) {
        this.f5658a.setCameraDistance(-f3);
    }

    @Override // o0.InterfaceC0481g0
    public final boolean k() {
        return this.f5658a.isValid();
    }

    @Override // o0.InterfaceC0481g0
    public final void l(Outline outline) {
        this.f5658a.setOutline(outline);
    }

    @Override // o0.InterfaceC0481g0
    public final void m(float f3) {
        this.f5658a.setScaleX(f3);
    }

    @Override // o0.InterfaceC0481g0
    public final void n(float f3) {
        this.f5658a.setRotationX(f3);
    }

    @Override // o0.InterfaceC0481g0
    public final void o() {
        C0514x0.f5752a.a(this.f5658a);
    }

    @Override // o0.InterfaceC0481g0
    public final void p(W.p pVar, W.C c3, C0065y c0065y) {
        DisplayListCanvas start = this.f5658a.start(x(), C());
        Canvas r3 = pVar.a().r();
        pVar.a().s((Canvas) start);
        C0080c a3 = pVar.a();
        if (c3 != null) {
            a3.d();
            a3.j(c3, 1);
        }
        c0065y.i(a3);
        if (c3 != null) {
            a3.a();
        }
        pVar.a().s(r3);
        this.f5658a.end(start);
    }

    @Override // o0.InterfaceC0481g0
    public final void q(float f3) {
        this.f5658a.setElevation(f3);
    }

    @Override // o0.InterfaceC0481g0
    public final void r(int i3) {
        this.f5659b += i3;
        this.f5661d += i3;
        this.f5658a.offsetLeftAndRight(i3);
    }

    @Override // o0.InterfaceC0481g0
    public final int s() {
        return this.f5662e;
    }

    @Override // o0.InterfaceC0481g0
    public final int t() {
        return this.f5661d;
    }

    @Override // o0.InterfaceC0481g0
    public final boolean u() {
        return this.f5658a.getClipToOutline();
    }

    @Override // o0.InterfaceC0481g0
    public final void v(int i3) {
        this.f5660c += i3;
        this.f5662e += i3;
        this.f5658a.offsetTopAndBottom(i3);
    }

    @Override // o0.InterfaceC0481g0
    public final boolean w() {
        return this.f5663f;
    }

    @Override // o0.InterfaceC0481g0
    public final int x() {
        return this.f5661d - this.f5659b;
    }

    @Override // o0.InterfaceC0481g0
    public final void y(Canvas canvas) {
        ((DisplayListCanvas) canvas).drawRenderNode(this.f5658a);
    }

    @Override // o0.InterfaceC0481g0
    public final int z() {
        return this.f5660c;
    }
}
