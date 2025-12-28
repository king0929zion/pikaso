package q;

import W.C0086i;
import a.AbstractC0090a;
import n0.AbstractC0409C;
import n0.C0408B;
import n0.C0410D;
import n0.InterfaceC0430k;
import n0.a0;

/* loaded from: classes.dex */
public final class j extends P.k implements InterfaceC0430k, a0 {

    /* renamed from: q, reason: collision with root package name */
    public long f5995q;

    /* renamed from: r, reason: collision with root package name */
    public W.D f5996r;

    /* renamed from: s, reason: collision with root package name */
    public float f5997s;

    /* renamed from: t, reason: collision with root package name */
    public W.H f5998t;

    /* renamed from: u, reason: collision with root package name */
    public long f5999u;

    /* renamed from: v, reason: collision with root package name */
    public G0.f f6000v;

    /* renamed from: w, reason: collision with root package name */
    public W.B f6001w;

    /* renamed from: x, reason: collision with root package name */
    public W.H f6002x;

    @Override // n0.InterfaceC0430k
    public final void C(C0408B c0408b) {
        C0086i c0086i;
        C0086i c0086i2;
        C0408B c0408b2;
        if (this.f5998t == W.D.f2484a) {
            if (!W.r.c(this.f5995q, W.r.f2562f)) {
                c0408b.x(this.f5995q, 0L, (r17 & 4) != 0 ? Y.d.S(c0408b.L(), 0L) : 0L, 1.0f, Y.f.f2774b, null, (r17 & 64) != 0 ? 3 : 0);
            }
            W.D d3 = this.f5996r;
            if (d3 != null) {
                float f3 = this.f5997s;
                long S2 = (118 & 4) != 0 ? Y.d.S(c0408b.f5076d.L(), 0L) : 0L;
                if ((118 & 8) != 0) {
                    f3 = 1.0f;
                }
                c0408b.g(d3, 0L, S2, f3, (118 & 16) != 0 ? Y.f.f2774b : null, null, 3);
            }
        } else {
            p2.o oVar = new p2.o();
            Y.b bVar = c0408b.f5076d;
            if (V.f.a(bVar.L(), this.f5999u) && c0408b.getLayoutDirection() == this.f6000v && p2.g.a(this.f6002x, this.f5998t)) {
                W.B b3 = this.f6001w;
                p2.g.b(b3);
                oVar.f5960d = b3;
            } else {
                AbstractC0409C.o(this, new C0410D(oVar, this, c0408b, 3));
            }
            this.f6001w = (W.B) oVar.f5960d;
            this.f5999u = bVar.L();
            this.f6000v = c0408b.getLayoutDirection();
            this.f6002x = this.f5998t;
            Object obj = oVar.f5960d;
            p2.g.b(obj);
            W.B b4 = (W.B) obj;
            boolean c3 = W.r.c(this.f5995q, W.r.f2562f);
            Y.f fVar = Y.f.f2774b;
            if (!c3) {
                long j3 = this.f5995q;
                if (b4 instanceof W.z) {
                    V.d dVar = ((W.z) b4).f2572a;
                    c0408b.x(j3, r2.a.f(dVar.f2446a, dVar.f2447b), AbstractC0090a.d(dVar.c(), dVar.b()), 1.0f, fVar, null, 3);
                } else {
                    if (b4 instanceof W.A) {
                        W.A a3 = (W.A) b4;
                        C0086i c0086i3 = a3.f2483b;
                        if (c0086i3 != null) {
                            c0408b2 = c0408b;
                            c0086i2 = c0086i3;
                        } else {
                            V.e eVar = a3.f2482a;
                            float b5 = V.a.b(eVar.h);
                            long f4 = r2.a.f(eVar.f2450a, eVar.f2451b);
                            long d4 = AbstractC0090a.d(eVar.b(), eVar.a());
                            long a4 = r2.a.a(b5, b5);
                            bVar.f2769d.f2767c.f(V.c.b(f4), V.c.c(f4), V.f.d(d4) + V.c.b(f4), V.f.b(d4) + V.c.c(f4), V.a.b(a4), V.a.c(a4), Y.b.a(bVar, j3, fVar, 1.0f, null, 3));
                        }
                    } else {
                        if (!(b4 instanceof W.y)) {
                            throw new B1.c();
                        }
                        c0086i2 = ((W.y) b4).f2571a;
                        c0408b2 = c0408b;
                    }
                    c0408b2.d(c0086i2, j3, 1.0f, fVar, null, 3);
                }
            }
            W.D d5 = this.f5996r;
            if (d5 != null) {
                float f5 = this.f5997s;
                if (b4 instanceof W.z) {
                    V.d dVar2 = ((W.z) b4).f2572a;
                    c0408b.g(d5, r2.a.f(dVar2.f2446a, dVar2.f2447b), AbstractC0090a.d(dVar2.c(), dVar2.b()), f5, fVar, null, 3);
                } else {
                    if (b4 instanceof W.A) {
                        W.A a5 = (W.A) b4;
                        c0086i = a5.f2483b;
                        if (c0086i == null) {
                            V.e eVar2 = a5.f2482a;
                            float b6 = V.a.b(eVar2.h);
                            long f6 = r2.a.f(eVar2.f2450a, eVar2.f2451b);
                            long d6 = AbstractC0090a.d(eVar2.b(), eVar2.a());
                            long a6 = r2.a.a(b6, b6);
                            Y.b bVar2 = c0408b.f5076d;
                            bVar2.f2769d.f2767c.f(V.c.b(f6), V.c.c(f6), V.f.d(d6) + V.c.b(f6), V.f.b(d6) + V.c.c(f6), V.a.b(a6), V.a.c(a6), bVar2.c(d5, fVar, f5, null, 3, 1));
                        }
                    } else {
                        if (!(b4 instanceof W.y)) {
                            throw new B1.c();
                        }
                        c0086i = ((W.y) b4).f2571a;
                    }
                    c0408b.m(c0086i, d5, f5, fVar, null, 3);
                }
            }
        }
        c0408b.a();
    }

    @Override // n0.a0
    public final void Q() {
        this.f5999u = 9205357640488583168L;
        this.f6000v = null;
        this.f6001w = null;
        this.f6002x = null;
        AbstractC0409C.k(this);
    }
}
