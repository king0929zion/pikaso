package n0;

import W.C0083f;
import W.C0086i;
import W.C0089l;
import o0.C0507u;

/* renamed from: n0.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0408B implements Y.d {

    /* renamed from: d, reason: collision with root package name */
    public final Y.b f5076d = new Y.b();

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0430k f5077e;

    @Override // Y.d
    public final void E(C0083f c0083f, long j3, long j4, long j5, long j6, float f3, Y.c cVar, C0089l c0089l, int i3, int i4) {
        this.f5076d.E(c0083f, j3, j4, j5, j6, f3, cVar, c0089l, i3, i4);
    }

    @Override // Y.d
    public final B0.a H() {
        return this.f5076d.f2770e;
    }

    @Override // G0.b
    public final long J(float f3) {
        return this.f5076d.J(f3);
    }

    @Override // Y.d
    public final long L() {
        return this.f5076d.L();
    }

    @Override // G0.b
    public final float O(long j3) {
        return this.f5076d.O(j3);
    }

    @Override // G0.b
    public final float P(float f3) {
        return f3 / this.f5076d.n();
    }

    public final void a() {
        Y.b bVar = this.f5076d;
        W.o j3 = bVar.f2770e.j();
        InterfaceC0427h interfaceC0427h = this.f5077e;
        p2.g.b(interfaceC0427h);
        P.k kVar = (P.k) interfaceC0427h;
        P.k kVar2 = kVar.f2088d.f2092i;
        if (kVar2 != null && (kVar2.f2091g & 4) != 0) {
            while (kVar2 != null) {
                int i3 = kVar2.f2090f;
                if ((i3 & 2) != 0) {
                    break;
                } else if ((i3 & 4) != 0) {
                    break;
                } else {
                    kVar2 = kVar2.f2092i;
                }
            }
        }
        kVar2 = null;
        if (kVar2 == null) {
            Y p3 = AbstractC0409C.p(interfaceC0427h, 4);
            if (p3.q0() == kVar.f2088d) {
                p3 = p3.f5218o;
                p2.g.b(p3);
            }
            p3.D0(j3, (Z.d) bVar.f2770e.f272c);
            return;
        }
        F.d dVar = null;
        while (kVar2 != null) {
            if (kVar2 instanceof InterfaceC0430k) {
                InterfaceC0430k interfaceC0430k = (InterfaceC0430k) kVar2;
                Z.d dVar2 = (Z.d) bVar.f2770e.f272c;
                Y p4 = AbstractC0409C.p(interfaceC0430k, 4);
                long c02 = r2.a.c0(p4.f4929f);
                C0444z c0444z = p4.f5217n;
                c0444z.getClass();
                ((C0507u) AbstractC0409C.s(c0444z)).getSharedDrawScope().c(j3, c02, p4, interfaceC0430k, dVar2);
            } else if ((kVar2.f2090f & 4) != 0 && (kVar2 instanceof AbstractC0428i)) {
                int i4 = 0;
                for (P.k kVar3 = ((AbstractC0428i) kVar2).f5256r; kVar3 != null; kVar3 = kVar3.f2092i) {
                    if ((kVar3.f2090f & 4) != 0) {
                        i4++;
                        if (i4 == 1) {
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
                if (i4 == 1) {
                }
            }
            kVar2 = AbstractC0409C.e(dVar);
        }
    }

    @Override // G0.b
    public final int b(float f3) {
        return this.f5076d.b(f3);
    }

    public final void c(W.o oVar, long j3, Y y3, InterfaceC0430k interfaceC0430k, Z.d dVar) {
        InterfaceC0430k interfaceC0430k2 = this.f5077e;
        this.f5077e = interfaceC0430k;
        G0.f fVar = y3.f5217n.f5315t;
        Y.b bVar = this.f5076d;
        G0.b l3 = bVar.f2770e.l();
        B0.a aVar = bVar.f2770e;
        G0.f p3 = aVar.p();
        W.o j4 = aVar.j();
        long r3 = aVar.r();
        Z.d dVar2 = (Z.d) aVar.f272c;
        aVar.G(y3);
        aVar.I(fVar);
        aVar.F(oVar);
        aVar.J(j3);
        aVar.f272c = dVar;
        oVar.d();
        try {
            interfaceC0430k.C(this);
            oVar.a();
            aVar.G(l3);
            aVar.I(p3);
            aVar.F(j4);
            aVar.J(r3);
            aVar.f272c = dVar2;
            this.f5077e = interfaceC0430k2;
        } catch (Throwable th) {
            oVar.a();
            aVar.G(l3);
            aVar.I(p3);
            aVar.F(j4);
            aVar.J(r3);
            aVar.f272c = dVar2;
            throw th;
        }
    }

    public final void d(C0086i c0086i, long j3, float f3, Y.c cVar, C0089l c0089l, int i3) {
        Y.b bVar = this.f5076d;
        bVar.f2769d.f2767c.h(c0086i, Y.b.a(bVar, j3, cVar, f3, c0089l, i3));
    }

    @Override // G0.b
    public final float f() {
        return this.f5076d.f();
    }

    public final void g(W.D d3, long j3, long j4, float f3, Y.c cVar, C0089l c0089l, int i3) {
        Y.b bVar = this.f5076d;
        bVar.f2769d.f2767c.p(V.c.b(j3), V.c.c(j3), V.f.d(j4) + V.c.b(j3), V.f.b(j4) + V.c.c(j3), bVar.c(d3, cVar, f3, c0089l, i3, 1));
    }

    @Override // Y.d
    public final G0.f getLayoutDirection() {
        return this.f5076d.f2769d.f2766b;
    }

    @Override // Y.d
    public final long k() {
        return this.f5076d.k();
    }

    @Override // Y.d
    public final void m(W.C c3, W.D d3, float f3, Y.c cVar, C0089l c0089l, int i3) {
        this.f5076d.m(c3, d3, f3, cVar, c0089l, i3);
    }

    @Override // G0.b
    public final float n() {
        return this.f5076d.n();
    }

    @Override // G0.b
    public final long q(long j3) {
        return this.f5076d.q(j3);
    }

    @Override // G0.b
    public final long s(float f3) {
        return this.f5076d.s(f3);
    }

    @Override // G0.b
    public final float u(float f3) {
        return this.f5076d.n() * f3;
    }

    @Override // G0.b
    public final float v(long j3) {
        return this.f5076d.v(j3);
    }

    @Override // Y.d
    public final void x(long j3, long j4, long j5, float f3, Y.c cVar, C0089l c0089l, int i3) {
        this.f5076d.x(j3, j4, j5, f3, cVar, c0089l, i3);
    }
}
