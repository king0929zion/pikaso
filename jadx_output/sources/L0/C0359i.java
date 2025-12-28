package l0;

import a.AbstractC0090a;
import n0.AbstractC0419M;
import n0.Y;

/* renamed from: l0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0359i implements InterfaceC0357g {

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0419M f4924d;

    public C0359i(AbstractC0419M abstractC0419M) {
        this.f4924d = abstractC0419M;
    }

    public final long a(InterfaceC0357g interfaceC0357g, long j3) {
        boolean z3 = interfaceC0357g instanceof C0359i;
        AbstractC0419M abstractC0419M = this.f4924d;
        if (!z3) {
            AbstractC0419M w3 = Z.b.w(abstractC0419M);
            long a3 = a(w3.f5171q, j3);
            Y y3 = w3.f5168n;
            y3.getClass();
            return V.c.f(a3, y3.y0(interfaceC0357g, 0L));
        }
        AbstractC0419M abstractC0419M2 = ((C0359i) interfaceC0357g).f4924d;
        abstractC0419M2.f5168n.A0();
        AbstractC0419M o02 = abstractC0419M.f5168n.m0(abstractC0419M2.f5168n).o0();
        if (o02 != null) {
            long U2 = AbstractC0090a.U(AbstractC0090a.X(abstractC0419M2.h0(o02, false), (Math.round(V.c.c(j3)) & 4294967295L) | (Math.round(V.c.b(j3)) << 32)), abstractC0419M.h0(o02, false));
            return r2.a.f((int) (U2 >> 32), (int) (U2 & 4294967295L));
        }
        AbstractC0419M w4 = Z.b.w(abstractC0419M2);
        long X2 = AbstractC0090a.X(AbstractC0090a.X(abstractC0419M2.h0(w4, false), w4.f5169o), (Math.round(V.c.c(j3)) & 4294967295L) | (Math.round(V.c.b(j3)) << 32));
        AbstractC0419M w5 = Z.b.w(abstractC0419M);
        long U3 = AbstractC0090a.U(X2, AbstractC0090a.X(abstractC0419M.h0(w5, false), w5.f5169o));
        long f3 = r2.a.f((int) (U3 >> 32), (int) (U3 & 4294967295L));
        Y y4 = w5.f5168n.f5219p;
        p2.g.b(y4);
        Y y5 = w4.f5168n.f5219p;
        p2.g.b(y5);
        return y4.y0(y5, f3);
    }

    @Override // l0.InterfaceC0357g
    public final V.d h(InterfaceC0357g interfaceC0357g, boolean z3) {
        return this.f4924d.f5168n.h(interfaceC0357g, z3);
    }

    @Override // l0.InterfaceC0357g
    public final long j(long j3) {
        AbstractC0419M abstractC0419M = this.f4924d;
        Y y3 = abstractC0419M.f5168n;
        AbstractC0419M w3 = Z.b.w(abstractC0419M);
        return y3.j(V.c.f(j3, V.c.e(a(w3.f5171q, 0L), abstractC0419M.f5168n.y0(w3.f5168n, 0L))));
    }

    @Override // l0.InterfaceC0357g
    public final boolean l() {
        return this.f4924d.f5168n.q0().f2099p;
    }

    @Override // l0.InterfaceC0357g
    public final InterfaceC0357g p() {
        AbstractC0419M o02;
        if (!l()) {
            Z0.d.S("LayoutCoordinate operations are only valid when isAttached is true");
            throw null;
        }
        Y y3 = ((Y) this.f4924d.f5168n.f5217n.f5319x.f855d).f5219p;
        if (y3 == null || (o02 = y3.o0()) == null) {
            return null;
        }
        return o02.f5171q;
    }

    @Override // l0.InterfaceC0357g
    public final long t() {
        AbstractC0419M abstractC0419M = this.f4924d;
        return r2.a.d(abstractC0419M.f4927d, abstractC0419M.f4928e);
    }
}
