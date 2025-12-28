package Z;

import W.C0080c;
import a.AbstractC0090a;
import a0.AbstractC0091a;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;

/* loaded from: classes.dex */
public final class q extends View {

    /* renamed from: n, reason: collision with root package name */
    public static final p f2889n = new p(0);

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0091a f2890d;

    /* renamed from: e, reason: collision with root package name */
    public final W.p f2891e;

    /* renamed from: f, reason: collision with root package name */
    public final Y.b f2892f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2893g;
    public Outline h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2894i;

    /* renamed from: j, reason: collision with root package name */
    public G0.b f2895j;

    /* renamed from: k, reason: collision with root package name */
    public G0.f f2896k;

    /* renamed from: l, reason: collision with root package name */
    public p2.h f2897l;

    /* renamed from: m, reason: collision with root package name */
    public d f2898m;

    public q(AbstractC0091a abstractC0091a, W.p pVar, Y.b bVar) {
        super(abstractC0091a.getContext());
        this.f2890d = abstractC0091a;
        this.f2891e = pVar;
        this.f2892f = bVar;
        setOutlineProvider(f2889n);
        this.f2894i = true;
        this.f2895j = Y.c.f2773a;
        this.f2896k = G0.f.f1258d;
        f.f2812a.getClass();
        this.f2897l = c.f2790g;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [o2.c, p2.h] */
    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        W.p pVar = this.f2891e;
        C0080c c0080c = pVar.f2556a;
        Canvas canvas2 = c0080c.f2534a;
        c0080c.f2534a = canvas;
        G0.b bVar = this.f2895j;
        G0.f fVar = this.f2896k;
        long d3 = AbstractC0090a.d(getWidth(), getHeight());
        d dVar = this.f2898m;
        ?? r9 = this.f2897l;
        Y.b bVar2 = this.f2892f;
        G0.b l3 = bVar2.f2770e.l();
        B0.a aVar = bVar2.f2770e;
        G0.f p3 = aVar.p();
        W.o j3 = aVar.j();
        long r3 = aVar.r();
        d dVar2 = (d) aVar.f272c;
        aVar.G(bVar);
        aVar.I(fVar);
        aVar.F(c0080c);
        aVar.J(d3);
        aVar.f272c = dVar;
        c0080c.d();
        try {
            r9.i(bVar2);
            c0080c.a();
            aVar.G(l3);
            aVar.I(p3);
            aVar.F(j3);
            aVar.J(r3);
            aVar.f272c = dVar2;
            pVar.f2556a.f2534a = canvas2;
            this.f2893g = false;
        } catch (Throwable th) {
            c0080c.a();
            aVar.G(l3);
            aVar.I(p3);
            aVar.F(j3);
            aVar.J(r3);
            aVar.f272c = dVar2;
            throw th;
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    public final boolean getCanUseCompositingLayer$ui_graphics_release() {
        return this.f2894i;
    }

    public final W.p getCanvasHolder() {
        return this.f2891e;
    }

    public final View getOwnerView() {
        return this.f2890d;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f2894i;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.f2893g) {
            return;
        }
        this.f2893g = true;
        super.invalidate();
    }

    @Override // android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
    }

    public final void setCanUseCompositingLayer$ui_graphics_release(boolean z3) {
        if (this.f2894i != z3) {
            this.f2894i = z3;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z3) {
        this.f2893g = z3;
    }
}
