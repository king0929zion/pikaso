package o0;

import A.C0008i;
import W.AbstractC0081d;
import W.C0084g;
import android.graphics.Canvas;
import android.os.Build;

/* renamed from: o0.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0512w0 implements n0.d0 {

    /* renamed from: d, reason: collision with root package name */
    public final C0507u f5740d;

    /* renamed from: e, reason: collision with root package name */
    public C0008i f5741e;

    /* renamed from: f, reason: collision with root package name */
    public A0.c f5742f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5743g;

    /* renamed from: i, reason: collision with root package name */
    public boolean f5744i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f5745j;

    /* renamed from: k, reason: collision with root package name */
    public C0084g f5746k;

    /* renamed from: o, reason: collision with root package name */
    public final InterfaceC0481g0 f5750o;

    /* renamed from: p, reason: collision with root package name */
    public int f5751p;
    public final C0502r0 h = new C0502r0();

    /* renamed from: l, reason: collision with root package name */
    public final C0497o0 f5747l = new C0497o0(C0454D.h);

    /* renamed from: m, reason: collision with root package name */
    public final W.p f5748m = new W.p();

    /* renamed from: n, reason: collision with root package name */
    public long f5749n = W.K.f2530a;

    public C0512w0(C0507u c0507u, C0008i c0008i, A0.c cVar) {
        this.f5740d = c0507u;
        this.f5741e = c0008i;
        this.f5742f = cVar;
        InterfaceC0481g0 c0508u0 = Build.VERSION.SDK_INT >= 29 ? new C0508u0() : new C0504s0(c0507u);
        c0508u0.I();
        c0508u0.F(false);
        this.f5750o = c0508u0;
    }

    @Override // n0.d0
    public final void a() {
        InterfaceC0481g0 interfaceC0481g0 = this.f5750o;
        if (interfaceC0481g0.k()) {
            interfaceC0481g0.o();
        }
        this.f5741e = null;
        this.f5742f = null;
        this.f5744i = true;
        k(false);
        C0507u c0507u = this.f5740d;
        c0507u.f5669B = true;
        c0507u.B(this);
    }

    @Override // n0.d0
    public final long b(long j3, boolean z3) {
        InterfaceC0481g0 interfaceC0481g0 = this.f5750o;
        C0497o0 c0497o0 = this.f5747l;
        if (!z3) {
            return W.D.t(c0497o0.b(interfaceC0481g0), j3);
        }
        float[] a3 = c0497o0.a(interfaceC0481g0);
        if (a3 != null) {
            return W.D.t(a3, j3);
        }
        return 9187343241974906880L;
    }

    @Override // n0.d0
    public final void c(long j3) {
        InterfaceC0481g0 interfaceC0481g0 = this.f5750o;
        int A3 = interfaceC0481g0.A();
        int z3 = interfaceC0481g0.z();
        int i3 = (int) (j3 >> 32);
        int i4 = (int) (j3 & 4294967295L);
        if (A3 == i3 && z3 == i4) {
            return;
        }
        if (A3 != i3) {
            interfaceC0481g0.r(i3 - A3);
        }
        if (z3 != i4) {
            interfaceC0481g0.v(i4 - z3);
        }
        c1.f5560a.a(this.f5740d);
        this.f5747l.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0023  */
    @Override // n0.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            r5 = this;
            boolean r0 = r5.f5743g
            o0.g0 r1 = r5.f5750o
            if (r0 != 0) goto Lc
            boolean r0 = r1.k()
            if (r0 != 0) goto L33
        Lc:
            boolean r0 = r1.u()
            if (r0 == 0) goto L1e
            o0.r0 r0 = r5.h
            boolean r2 = r0.f5650g
            if (r2 == 0) goto L1e
            r0.d()
            W.C r0 = r0.f5648e
            goto L1f
        L1e:
            r0 = 0
        L1f:
            A.i r2 = r5.f5741e
            if (r2 == 0) goto L2f
            D.y r3 = new D.y
            r4 = 20
            r3.<init>(r4, r2)
            W.p r2 = r5.f5748m
            r1.p(r2, r0, r3)
        L2f:
            r0 = 0
            r5.k(r0)
        L33:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.C0512w0.d():void");
    }

    @Override // n0.d0
    public final void e(long j3) {
        int i3 = (int) (j3 >> 32);
        int i4 = (int) (j3 & 4294967295L);
        float a3 = W.K.a(this.f5749n) * i3;
        InterfaceC0481g0 interfaceC0481g0 = this.f5750o;
        interfaceC0481g0.E(a3);
        interfaceC0481g0.e(W.K.b(this.f5749n) * i4);
        if (interfaceC0481g0.H(interfaceC0481g0.A(), interfaceC0481g0.z(), interfaceC0481g0.A() + i3, interfaceC0481g0.z() + i4)) {
            interfaceC0481g0.l(this.h.b());
            if (!this.f5743g && !this.f5744i) {
                this.f5740d.invalidate();
                k(true);
            }
            this.f5747l.c();
        }
    }

    @Override // n0.d0
    public final void f(V.b bVar, boolean z3) {
        InterfaceC0481g0 interfaceC0481g0 = this.f5750o;
        C0497o0 c0497o0 = this.f5747l;
        if (!z3) {
            W.D.u(c0497o0.b(interfaceC0481g0), bVar);
            return;
        }
        float[] a3 = c0497o0.a(interfaceC0481g0);
        if (a3 != null) {
            W.D.u(a3, bVar);
            return;
        }
        bVar.f2440a = 0.0f;
        bVar.f2441b = 0.0f;
        bVar.f2442c = 0.0f;
        bVar.f2443d = 0.0f;
    }

    @Override // n0.d0
    public final boolean g(long j3) {
        W.B b3;
        float b4 = V.c.b(j3);
        float c3 = V.c.c(j3);
        InterfaceC0481g0 interfaceC0481g0 = this.f5750o;
        if (interfaceC0481g0.w()) {
            return 0.0f <= b4 && b4 < ((float) interfaceC0481g0.x()) && 0.0f <= c3 && c3 < ((float) interfaceC0481g0.C());
        }
        if (!interfaceC0481g0.u()) {
            return true;
        }
        C0502r0 c0502r0 = this.h;
        if (c0502r0.f5655m && (b3 = c0502r0.f5646c) != null) {
            return AbstractC0461K.j(b3, V.c.b(j3), V.c.c(j3), null, null);
        }
        return true;
    }

    @Override // n0.d0
    public final void h(W.o oVar, Z.d dVar) {
        Canvas a3 = AbstractC0081d.a(oVar);
        boolean isHardwareAccelerated = a3.isHardwareAccelerated();
        InterfaceC0481g0 interfaceC0481g0 = this.f5750o;
        if (isHardwareAccelerated) {
            d();
            boolean z3 = interfaceC0481g0.K() > 0.0f;
            this.f5745j = z3;
            if (z3) {
                oVar.m();
            }
            interfaceC0481g0.y(a3);
            if (this.f5745j) {
                oVar.e();
                return;
            }
            return;
        }
        float A3 = interfaceC0481g0.A();
        float z4 = interfaceC0481g0.z();
        float t3 = interfaceC0481g0.t();
        float s3 = interfaceC0481g0.s();
        if (interfaceC0481g0.a() < 1.0f) {
            C0084g c0084g = this.f5746k;
            if (c0084g == null) {
                c0084g = W.D.e();
                this.f5746k = c0084g;
            }
            c0084g.a(interfaceC0481g0.a());
            a3.saveLayer(A3, z4, t3, s3, c0084g.f2539a);
        } else {
            oVar.d();
        }
        oVar.o(A3, z4);
        oVar.k(this.f5747l.b(interfaceC0481g0));
        if (interfaceC0481g0.u() || interfaceC0481g0.w()) {
            this.h.a(oVar);
        }
        C0008i c0008i = this.f5741e;
        if (c0008i != null) {
            c0008i.h(oVar, null);
        }
        oVar.a();
        k(false);
    }

    @Override // n0.d0
    public final void i(C0008i c0008i, A0.c cVar) {
        k(false);
        this.f5744i = false;
        this.f5745j = false;
        this.f5749n = W.K.f2530a;
        this.f5741e = c0008i;
        this.f5742f = cVar;
    }

    @Override // n0.d0
    public final void invalidate() {
        if (this.f5743g || this.f5744i) {
            return;
        }
        this.f5740d.invalidate();
        k(true);
    }

    @Override // n0.d0
    public final void j(W.F f3) {
        A0.c cVar;
        int i3 = f3.f2488d | this.f5751p;
        int i4 = i3 & 4096;
        if (i4 != 0) {
            this.f5749n = f3.f2500q;
        }
        InterfaceC0481g0 interfaceC0481g0 = this.f5750o;
        boolean u3 = interfaceC0481g0.u();
        C0502r0 c0502r0 = this.h;
        boolean z3 = false;
        boolean z4 = u3 && c0502r0.f5650g;
        if ((i3 & 1) != 0) {
            interfaceC0481g0.m(f3.f2489e);
        }
        if ((i3 & 2) != 0) {
            interfaceC0481g0.f(f3.f2490f);
        }
        if ((i3 & 4) != 0) {
            interfaceC0481g0.d(f3.f2491g);
        }
        if ((i3 & 8) != 0) {
            interfaceC0481g0.c(f3.h);
        }
        if ((i3 & 16) != 0) {
            interfaceC0481g0.i(f3.f2492i);
        }
        if ((i3 & 32) != 0) {
            interfaceC0481g0.q(f3.f2493j);
        }
        if ((i3 & 64) != 0) {
            interfaceC0481g0.L(W.D.C(f3.f2494k));
        }
        if ((i3 & 128) != 0) {
            interfaceC0481g0.G(W.D.C(f3.f2495l));
        }
        if ((i3 & 1024) != 0) {
            interfaceC0481g0.h(f3.f2498o);
        }
        if ((i3 & 256) != 0) {
            interfaceC0481g0.n(f3.f2496m);
        }
        if ((i3 & 512) != 0) {
            interfaceC0481g0.b(f3.f2497n);
        }
        if ((i3 & 2048) != 0) {
            interfaceC0481g0.j(f3.f2499p);
        }
        if (i4 != 0) {
            interfaceC0481g0.E(W.K.a(this.f5749n) * interfaceC0481g0.x());
            interfaceC0481g0.e(W.K.b(this.f5749n) * interfaceC0481g0.C());
        }
        boolean z5 = f3.f2502s;
        X1.e eVar = W.D.f2484a;
        boolean z6 = z5 && f3.f2501r != eVar;
        if ((i3 & 24576) != 0) {
            interfaceC0481g0.B(z6);
            interfaceC0481g0.F(f3.f2502s && f3.f2501r == eVar);
        }
        if ((131072 & i3) != 0) {
            interfaceC0481g0.g();
        }
        if ((32768 & i3) != 0) {
            interfaceC0481g0.D(f3.f2503t);
        }
        boolean c3 = this.h.c(f3.f2507x, f3.f2491g, z6, f3.f2493j, f3.f2504u);
        if (c0502r0.f5649f) {
            interfaceC0481g0.l(c0502r0.b());
        }
        if (z6 && c0502r0.f5650g) {
            z3 = true;
        }
        C0507u c0507u = this.f5740d;
        if (z4 == z3 && (!z3 || !c3)) {
            c1.f5560a.a(c0507u);
        } else if (!this.f5743g && !this.f5744i) {
            c0507u.invalidate();
            k(true);
        }
        if (!this.f5745j && interfaceC0481g0.K() > 0.0f && (cVar = this.f5742f) != null) {
            cVar.c();
        }
        if ((i3 & 7963) != 0) {
            this.f5747l.c();
        }
        this.f5751p = f3.f2488d;
    }

    public final void k(boolean z3) {
        if (z3 != this.f5743g) {
            this.f5743g = z3;
            this.f5740d.t(this, z3);
        }
    }
}
