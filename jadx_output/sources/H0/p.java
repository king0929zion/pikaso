package h0;

import g2.C0277j;
import g2.InterfaceC0271d;
import g2.InterfaceC0276i;
import y2.C0673f;

/* loaded from: classes.dex */
public final class p implements G0.b, InterfaceC0271d {

    /* renamed from: d, reason: collision with root package name */
    public final C0673f f4392d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f4393e;

    /* renamed from: f, reason: collision with root package name */
    public C0673f f4394f;

    /* renamed from: g, reason: collision with root package name */
    public g f4395g = g.f4359e;
    public final /* synthetic */ r h;

    public p(r rVar, C0673f c0673f) {
        this.h = rVar;
        this.f4392d = c0673f;
        this.f4393e = rVar;
    }

    @Override // G0.b
    public final long J(float f3) {
        return this.f4393e.J(f3);
    }

    @Override // G0.b
    public final float O(long j3) {
        return this.f4393e.O(j3);
    }

    @Override // G0.b
    public final float P(float f3) {
        return f3 / this.f4393e.n();
    }

    public final Object a(g gVar, i2.a aVar) {
        C0673f c0673f = new C0673f(1, Z.b.z(aVar));
        c0673f.u();
        this.f4395g = gVar;
        this.f4394f = c0673f;
        return c0673f.s();
    }

    @Override // G0.b
    public final int b(float f3) {
        return this.f4393e.b(f3);
    }

    @Override // G0.b
    public final float f() {
        return this.f4393e.f();
    }

    @Override // G0.b
    public final float n() {
        return this.f4393e.n();
    }

    @Override // g2.InterfaceC0271d
    public final InterfaceC0276i o() {
        return C0277j.f4334d;
    }

    @Override // G0.b
    public final long q(long j3) {
        return this.f4393e.q(j3);
    }

    @Override // G0.b
    public final long s(float f3) {
        return this.f4393e.s(f3);
    }

    @Override // g2.InterfaceC0271d
    public final void t(Object obj) {
        r rVar = this.h;
        synchronized (rVar.f4403w) {
            rVar.f4403w.l(this);
        }
        this.f4392d.t(obj);
    }

    @Override // G0.b
    public final float u(float f3) {
        return this.f4393e.n() * f3;
    }

    @Override // G0.b
    public final float v(long j3) {
        return this.f4393e.v(j3);
    }
}
