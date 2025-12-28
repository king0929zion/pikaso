package o0;

import A.C0008i;
import D.C0065y;
import W.AbstractC0081d;
import W.C0084g;
import W.C0086i;
import a.AbstractC0090a;
import android.graphics.Canvas;
import android.os.Build;
import n.AbstractC0378E;
import n.C0375B;

/* renamed from: o0.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0495n0 implements n0.d0 {

    /* renamed from: d, reason: collision with root package name */
    public Z.d f5612d;

    /* renamed from: e, reason: collision with root package name */
    public final W.w f5613e;

    /* renamed from: f, reason: collision with root package name */
    public final C0507u f5614f;

    /* renamed from: g, reason: collision with root package name */
    public C0008i f5615g;
    public A0.c h;

    /* renamed from: j, reason: collision with root package name */
    public boolean f5617j;

    /* renamed from: l, reason: collision with root package name */
    public float[] f5619l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f5620m;

    /* renamed from: q, reason: collision with root package name */
    public int f5624q;

    /* renamed from: s, reason: collision with root package name */
    public W.B f5626s;

    /* renamed from: t, reason: collision with root package name */
    public C0086i f5627t;

    /* renamed from: u, reason: collision with root package name */
    public C0084g f5628u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f5629v;

    /* renamed from: i, reason: collision with root package name */
    public long f5616i = r2.a.d(Integer.MAX_VALUE, Integer.MAX_VALUE);

    /* renamed from: k, reason: collision with root package name */
    public final float[] f5618k = W.D.j();

    /* renamed from: n, reason: collision with root package name */
    public G0.b f5621n = new G0.c(1.0f, 1.0f);

    /* renamed from: o, reason: collision with root package name */
    public G0.f f5622o = G0.f.f1258d;

    /* renamed from: p, reason: collision with root package name */
    public final Y.b f5623p = new Y.b();

    /* renamed from: r, reason: collision with root package name */
    public long f5625r = W.K.f2530a;

    /* renamed from: w, reason: collision with root package name */
    public final C0065y f5630w = new C0065y(19, this);

    public C0495n0(Z.d dVar, W.w wVar, C0507u c0507u, C0008i c0008i, A0.c cVar) {
        this.f5612d = dVar;
        this.f5613e = wVar;
        this.f5614f = c0507u;
        this.f5615g = c0008i;
        this.h = cVar;
    }

    @Override // n0.d0
    public final void a() {
        this.f5615g = null;
        this.h = null;
        this.f5617j = true;
        boolean z3 = this.f5620m;
        C0507u c0507u = this.f5614f;
        if (z3) {
            this.f5620m = false;
            c0507u.t(this, false);
        }
        W.w wVar = this.f5613e;
        if (wVar != null) {
            wVar.a(this.f5612d);
            c0507u.B(this);
        }
    }

    @Override // n0.d0
    public final long b(long j3, boolean z3) {
        if (!z3) {
            return W.D.t(k(), j3);
        }
        float[] k3 = k();
        float[] fArr = this.f5619l;
        if (fArr == null) {
            fArr = W.D.j();
            this.f5619l = fArr;
        }
        if (!AbstractC0461K.g(k3, fArr)) {
            fArr = null;
        }
        if (fArr != null) {
            return W.D.t(fArr, j3);
        }
        return 9187343241974906880L;
    }

    @Override // n0.d0
    public final void c(long j3) {
        Z.d dVar = this.f5612d;
        if (!AbstractC0090a.v(dVar.f2808r, j3)) {
            dVar.f2808r = j3;
            long j4 = dVar.f2809s;
            dVar.f2792a.v((int) (j3 >> 32), (int) (j3 & 4294967295L), j4);
        }
        c1.f5560a.a(this.f5614f);
    }

    @Override // n0.d0
    public final void d() {
        if (this.f5620m) {
            if (this.f5625r != W.K.f2530a && !AbstractC0090a.x(this.f5612d.f2809s, this.f5616i)) {
                Z.d dVar = this.f5612d;
                long f3 = r2.a.f(W.K.a(this.f5625r) * ((int) (this.f5616i >> 32)), W.K.b(this.f5625r) * ((int) (this.f5616i & 4294967295L)));
                if (!V.c.a(dVar.f2810t, f3)) {
                    dVar.f2810t = f3;
                    dVar.f2792a.G(f3);
                }
            }
            Z.d dVar2 = this.f5612d;
            G0.b bVar = this.f5621n;
            G0.f fVar = this.f5622o;
            long j3 = this.f5616i;
            if (!AbstractC0090a.x(dVar2.f2809s, j3)) {
                dVar2.f2809s = j3;
                long j4 = dVar2.f2808r;
                dVar2.f2792a.v((int) (j4 >> 32), (int) (4294967295L & j4), j3);
                if (dVar2.h == 9205357640488583168L) {
                    dVar2.f2797f = true;
                    dVar2.a();
                }
            }
            dVar2.f2793b = bVar;
            dVar2.f2794c = fVar;
            dVar2.f2795d = this.f5630w;
            dVar2.e();
            if (this.f5620m) {
                this.f5620m = false;
                this.f5614f.t(this, false);
            }
        }
    }

    @Override // n0.d0
    public final void e(long j3) {
        if (AbstractC0090a.x(j3, this.f5616i)) {
            return;
        }
        this.f5616i = j3;
        if (this.f5620m || this.f5617j) {
            return;
        }
        C0507u c0507u = this.f5614f;
        c0507u.invalidate();
        if (true != this.f5620m) {
            this.f5620m = true;
            c0507u.t(this, true);
        }
    }

    @Override // n0.d0
    public final void f(V.b bVar, boolean z3) {
        if (!z3) {
            W.D.u(k(), bVar);
            return;
        }
        float[] k3 = k();
        float[] fArr = this.f5619l;
        if (fArr == null) {
            fArr = W.D.j();
            this.f5619l = fArr;
        }
        if (!AbstractC0461K.g(k3, fArr)) {
            fArr = null;
        }
        if (fArr != null) {
            W.D.u(fArr, bVar);
            return;
        }
        bVar.f2440a = 0.0f;
        bVar.f2441b = 0.0f;
        bVar.f2442c = 0.0f;
        bVar.f2443d = 0.0f;
    }

    @Override // n0.d0
    public final boolean g(long j3) {
        float b3 = V.c.b(j3);
        float c3 = V.c.c(j3);
        if (this.f5612d.f2792a.e()) {
            return AbstractC0461K.j(this.f5612d.c(), b3, c3, null, null);
        }
        return true;
    }

    @Override // n0.d0
    public final void h(W.o oVar, Z.d dVar) {
        W.o oVar2;
        Canvas canvas;
        W.o oVar3;
        int i3;
        boolean z3;
        Canvas a3 = AbstractC0081d.a(oVar);
        if (!a3.isHardwareAccelerated()) {
            Z.d dVar2 = this.f5612d;
            long j3 = dVar2.f2808r;
            float f3 = (int) (j3 >> 32);
            float f4 = (int) (j3 & 4294967295L);
            long j4 = this.f5616i;
            float f5 = ((int) (j4 >> 32)) + f3;
            float f6 = f4 + ((int) (4294967295L & j4));
            if (dVar2.f2792a.a() < 1.0f) {
                C0084g c0084g = this.f5628u;
                if (c0084g == null) {
                    c0084g = W.D.e();
                    this.f5628u = c0084g;
                }
                c0084g.a(this.f5612d.f2792a.a());
                a3.saveLayer(f3, f4, f5, f6, c0084g.f2539a);
            } else {
                oVar.d();
            }
            oVar.o(f3, f4);
            oVar.k(k());
            if (this.f5612d.f2792a.e() && this.f5612d.f2792a.e()) {
                W.B c3 = this.f5612d.c();
                if (c3 instanceof W.z) {
                    W.o.g(oVar, ((W.z) c3).f2572a);
                } else if (c3 instanceof W.A) {
                    C0086i c0086i = this.f5627t;
                    if (c0086i == null) {
                        c0086i = W.D.f();
                        this.f5627t = c0086i;
                    }
                    c0086i.b();
                    W.C.a(c0086i, ((W.A) c3).f2482a);
                    oVar.j(c0086i, 1);
                } else if (c3 instanceof W.y) {
                    oVar.j(((W.y) c3).f2571a, 1);
                }
            }
            C0008i c0008i = this.f5615g;
            if (c0008i != null) {
                c0008i.h(oVar, null);
            }
            oVar.a();
            return;
        }
        d();
        this.f5629v = this.f5612d.f2792a.B() > 0.0f;
        Y.b bVar = this.f5623p;
        B0.a aVar = bVar.f2770e;
        aVar.F(oVar);
        aVar.f272c = dVar;
        Z.d dVar3 = this.f5612d;
        B0.a aVar2 = bVar.f2770e;
        W.o j5 = aVar2.j();
        Z.d dVar4 = (Z.d) aVar2.f272c;
        if (dVar3.f2807q) {
            return;
        }
        Z.f fVar = dVar3.f2792a;
        if (!fVar.k()) {
            try {
                dVar3.e();
            } catch (Throwable unused) {
            }
        }
        dVar3.a();
        boolean z4 = fVar.B() > 0.0f;
        if (z4) {
            j5.m();
        }
        Canvas a4 = AbstractC0081d.a(j5);
        boolean isHardwareAccelerated = a4.isHardwareAccelerated();
        if (isHardwareAccelerated) {
            oVar2 = j5;
            canvas = a4;
        } else {
            a4.save();
            long j6 = dVar3.f2808r;
            oVar2 = j5;
            float f7 = (int) (j6 >> 32);
            float f8 = (int) (j6 & 4294967295L);
            long j7 = dVar3.f2809s;
            float f9 = f7 + ((int) (j7 >> 32));
            float f10 = f8 + ((int) (4294967295L & j7));
            float a5 = fVar.a();
            int F3 = fVar.F();
            if (a5 < 1.0f || !W.D.l(F3, 3) || Z.b.o(fVar.K(), 1)) {
                C0084g c0084g2 = dVar3.f2804n;
                if (c0084g2 == null) {
                    c0084g2 = W.D.e();
                    dVar3.f2804n = c0084g2;
                }
                c0084g2.a(a5);
                c0084g2.b(F3);
                c0084g2.d(null);
                canvas = a4;
                a4.saveLayer(f7, f8, f9, f10, c0084g2.f2539a);
            } else {
                a4.save();
                canvas = a4;
            }
            canvas.translate(f7, f8);
            canvas.concat(fVar.s());
        }
        boolean z5 = dVar3.f2803m || (!isHardwareAccelerated && fVar.e());
        if (z5) {
            oVar2.d();
            W.B c4 = dVar3.c();
            if (c4 instanceof W.z) {
                oVar3 = oVar2;
                W.o.g(oVar3, c4.a());
            } else {
                oVar3 = oVar2;
                if (c4 instanceof W.A) {
                    C0086i c0086i2 = dVar3.f2802l;
                    if (c0086i2 != null) {
                        c0086i2.f2545a.rewind();
                    } else {
                        c0086i2 = W.D.f();
                        dVar3.f2802l = c0086i2;
                    }
                    W.C.a(c0086i2, ((W.A) c4).f2482a);
                    oVar3.j(c0086i2, 1);
                } else if (c4 instanceof W.y) {
                    oVar3.j(((W.y) c4).f2571a, 1);
                }
            }
        } else {
            oVar3 = oVar2;
        }
        if (dVar4 != null) {
            Z.a aVar3 = dVar4.f2806p;
            if (!aVar3.f2784a) {
                throw new IllegalArgumentException("Only add dependencies during a tracking");
            }
            C0375B c0375b = (C0375B) aVar3.f2787d;
            if (c0375b != null) {
                c0375b.a(dVar3);
            } else if (((Z.d) aVar3.f2785b) != null) {
                int i4 = AbstractC0378E.f4967a;
                C0375B c0375b2 = new C0375B();
                Z.d dVar5 = (Z.d) aVar3.f2785b;
                p2.g.b(dVar5);
                c0375b2.a(dVar5);
                c0375b2.a(dVar3);
                aVar3.f2787d = c0375b2;
                aVar3.f2785b = null;
            } else {
                aVar3.f2785b = dVar3;
            }
            C0375B c0375b3 = (C0375B) aVar3.f2788e;
            if (c0375b3 != null) {
                boolean j8 = c0375b3.j(dVar3);
                i3 = 1;
                z3 = !j8;
            } else {
                i3 = 1;
                if (((Z.d) aVar3.f2786c) != dVar3) {
                    z3 = true;
                } else {
                    aVar3.f2786c = null;
                    z3 = false;
                }
            }
            if (z3) {
                dVar3.f2805o += i3;
            }
        }
        fVar.x(oVar3);
        if (z5) {
            oVar3.a();
        }
        if (z4) {
            oVar3.e();
        }
        if (isHardwareAccelerated) {
            return;
        }
        canvas.restore();
    }

    @Override // n0.d0
    public final void i(C0008i c0008i, A0.c cVar) {
        W.w wVar = this.f5613e;
        if (wVar == null) {
            throw new IllegalArgumentException("currently reuse is only supported when we manage the layer lifecycle");
        }
        if (!this.f5612d.f2807q) {
            throw new IllegalArgumentException("layer should have been released before reuse");
        }
        this.f5612d = wVar.b();
        this.f5617j = false;
        this.f5615g = c0008i;
        this.h = cVar;
        this.f5625r = W.K.f2530a;
        this.f5629v = false;
        this.f5616i = r2.a.d(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.f5626s = null;
        this.f5624q = 0;
    }

    @Override // n0.d0
    public final void invalidate() {
        if (this.f5620m || this.f5617j) {
            return;
        }
        C0507u c0507u = this.f5614f;
        c0507u.invalidate();
        if (true != this.f5620m) {
            this.f5620m = true;
            c0507u.t(this, true);
        }
    }

    @Override // n0.d0
    public final void j(W.F f3) {
        A0.c cVar;
        int i3;
        A0.c cVar2;
        int i4 = f3.f2488d | this.f5624q;
        this.f5622o = f3.f2506w;
        this.f5621n = f3.f2505v;
        int i5 = i4 & 4096;
        if (i5 != 0) {
            this.f5625r = f3.f2500q;
        }
        if ((i4 & 1) != 0) {
            Z.d dVar = this.f5612d;
            float f4 = f3.f2489e;
            Z.f fVar = dVar.f2792a;
            if (fVar.r() != f4) {
                fVar.m(f4);
            }
        }
        if ((i4 & 2) != 0) {
            Z.d dVar2 = this.f5612d;
            float f5 = f3.f2490f;
            Z.f fVar2 = dVar2.f2792a;
            if (fVar2.C() != f5) {
                fVar2.f(f5);
            }
        }
        if ((i4 & 4) != 0) {
            Z.d dVar3 = this.f5612d;
            float f6 = f3.f2491g;
            Z.f fVar3 = dVar3.f2792a;
            if (fVar3.a() != f6) {
                fVar3.d(f6);
            }
        }
        if ((i4 & 8) != 0) {
            Z.d dVar4 = this.f5612d;
            float f7 = f3.h;
            Z.f fVar4 = dVar4.f2792a;
            if (fVar4.I() != f7) {
                fVar4.c(f7);
            }
        }
        if ((i4 & 16) != 0) {
            Z.d dVar5 = this.f5612d;
            float f8 = f3.f2492i;
            Z.f fVar5 = dVar5.f2792a;
            if (fVar5.u() != f8) {
                fVar5.i(f8);
            }
        }
        boolean z3 = false;
        if ((i4 & 32) != 0) {
            Z.d dVar6 = this.f5612d;
            float f9 = f3.f2493j;
            Z.f fVar6 = dVar6.f2792a;
            if (fVar6.B() != f9) {
                fVar6.t(f9);
                fVar6.J(fVar6.e() || f9 > 0.0f);
                dVar6.f2797f = true;
                dVar6.a();
            }
            if (f3.f2493j > 0.0f && !this.f5629v && (cVar2 = this.h) != null) {
                cVar2.c();
            }
        }
        if ((i4 & 64) != 0) {
            Z.d dVar7 = this.f5612d;
            long j3 = f3.f2494k;
            Z.f fVar7 = dVar7.f2792a;
            if (!W.r.c(j3, fVar7.H())) {
                fVar7.A(j3);
            }
        }
        if ((i4 & 128) != 0) {
            Z.d dVar8 = this.f5612d;
            long j4 = f3.f2495l;
            Z.f fVar8 = dVar8.f2792a;
            if (!W.r.c(j4, fVar8.z())) {
                fVar8.q(j4);
            }
        }
        if ((i4 & 1024) != 0) {
            Z.d dVar9 = this.f5612d;
            float f10 = f3.f2498o;
            Z.f fVar9 = dVar9.f2792a;
            if (fVar9.E() != f10) {
                fVar9.h(f10);
            }
        }
        if ((i4 & 256) != 0) {
            Z.d dVar10 = this.f5612d;
            float f11 = f3.f2496m;
            Z.f fVar10 = dVar10.f2792a;
            if (fVar10.L() != f11) {
                fVar10.n(f11);
            }
        }
        if ((i4 & 512) != 0) {
            Z.d dVar11 = this.f5612d;
            float f12 = f3.f2497n;
            Z.f fVar11 = dVar11.f2792a;
            if (fVar11.w() != f12) {
                fVar11.b(f12);
            }
        }
        if ((i4 & 2048) != 0) {
            Z.d dVar12 = this.f5612d;
            float f13 = f3.f2499p;
            Z.f fVar12 = dVar12.f2792a;
            if (fVar12.D() != f13) {
                fVar12.j(f13);
            }
        }
        if (i5 != 0) {
            long j5 = this.f5625r;
            if (j5 == W.K.f2530a) {
                Z.d dVar13 = this.f5612d;
                if (!V.c.a(dVar13.f2810t, 9205357640488583168L)) {
                    dVar13.f2810t = 9205357640488583168L;
                    dVar13.f2792a.G(9205357640488583168L);
                }
            } else {
                Z.d dVar14 = this.f5612d;
                long f14 = r2.a.f(W.K.a(j5) * ((int) (this.f5616i >> 32)), W.K.b(this.f5625r) * ((int) (this.f5616i & 4294967295L)));
                if (!V.c.a(dVar14.f2810t, f14)) {
                    dVar14.f2810t = f14;
                    dVar14.f2792a.G(f14);
                }
            }
        }
        if ((i4 & 16384) != 0) {
            Z.d dVar15 = this.f5612d;
            boolean z4 = f3.f2502s;
            Z.f fVar13 = dVar15.f2792a;
            if (fVar13.e() != z4) {
                fVar13.J(z4);
                dVar15.f2797f = true;
                dVar15.a();
            }
        }
        if ((131072 & i4) != 0) {
            Z.f fVar14 = this.f5612d.f2792a;
            if (!p2.g.a(null, null)) {
                fVar14.g();
            }
        }
        if ((32768 & i4) != 0) {
            Z.d dVar16 = this.f5612d;
            int i6 = f3.f2503t;
            if (W.D.m(i6, 0)) {
                i3 = 0;
            } else if (W.D.m(i6, 1)) {
                i3 = 1;
            } else {
                i3 = 2;
                if (!W.D.m(i6, 2)) {
                    throw new IllegalStateException("Not supported composition strategy");
                }
            }
            Z.f fVar15 = dVar16.f2792a;
            if (!Z.b.o(fVar15.K(), i3)) {
                fVar15.p(i3);
            }
        }
        if (!p2.g.a(this.f5626s, f3.f2507x)) {
            W.B b3 = f3.f2507x;
            this.f5626s = b3;
            if (b3 != null) {
                Z.d dVar17 = this.f5612d;
                if (b3 instanceof W.z) {
                    V.d dVar18 = ((W.z) b3).f2572a;
                    dVar17.f(r2.a.f(dVar18.f2446a, dVar18.f2447b), AbstractC0090a.d(dVar18.c(), dVar18.b()), 0.0f);
                } else if (b3 instanceof W.y) {
                    dVar17.f2800j = null;
                    dVar17.h = 9205357640488583168L;
                    dVar17.f2798g = 0L;
                    dVar17.f2799i = 0.0f;
                    dVar17.f2797f = true;
                    dVar17.f2803m = false;
                    dVar17.f2801k = ((W.y) b3).f2571a;
                    dVar17.a();
                } else if (b3 instanceof W.A) {
                    W.A a3 = (W.A) b3;
                    C0086i c0086i = a3.f2483b;
                    if (c0086i != null) {
                        dVar17.f2800j = null;
                        dVar17.h = 9205357640488583168L;
                        dVar17.f2798g = 0L;
                        dVar17.f2799i = 0.0f;
                        dVar17.f2797f = true;
                        dVar17.f2803m = false;
                        dVar17.f2801k = c0086i;
                        dVar17.a();
                    } else {
                        V.e eVar = a3.f2482a;
                        dVar17.f(r2.a.f(eVar.f2450a, eVar.f2451b), AbstractC0090a.d(eVar.b(), eVar.a()), V.a.b(eVar.h));
                    }
                }
                if ((b3 instanceof W.y) && Build.VERSION.SDK_INT < 33 && (cVar = this.h) != null) {
                    cVar.c();
                }
            }
            z3 = true;
        }
        this.f5624q = f3.f2488d;
        if (i4 != 0 || z3) {
            c1.f5560a.a(this.f5614f);
        }
    }

    public final float[] k() {
        Z.d dVar = this.f5612d;
        long D3 = r2.a.M(dVar.f2810t) ? AbstractC0090a.D(r2.a.c0(this.f5616i)) : dVar.f2810t;
        float[] fArr = this.f5618k;
        W.D.v(fArr);
        float[] j3 = W.D.j();
        W.D.F(j3, -V.c.b(D3), -V.c.c(D3));
        W.D.z(fArr, j3);
        float[] j4 = W.D.j();
        Z.f fVar = dVar.f2792a;
        W.D.F(j4, fVar.I(), fVar.u());
        double L2 = (fVar.L() * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(L2);
        float sin = (float) Math.sin(L2);
        float f3 = j4[1];
        float f4 = j4[2];
        float f5 = j4[5];
        float f6 = j4[6];
        float f7 = j4[9];
        float f8 = j4[10];
        float f9 = j4[13];
        float f10 = j4[14];
        j4[1] = (f3 * cos) - (f4 * sin);
        j4[2] = (f4 * cos) + (f3 * sin);
        j4[5] = (f5 * cos) - (f6 * sin);
        j4[6] = (f6 * cos) + (f5 * sin);
        j4[9] = (f7 * cos) - (f8 * sin);
        j4[10] = (f8 * cos) + (f7 * sin);
        j4[13] = (f9 * cos) - (f10 * sin);
        j4[14] = (f10 * cos) + (f9 * sin);
        double w3 = (fVar.w() * 3.141592653589793d) / 180.0d;
        float cos2 = (float) Math.cos(w3);
        float sin2 = (float) Math.sin(w3);
        float f11 = j4[0];
        float f12 = j4[2];
        float f13 = j4[4];
        float f14 = j4[6];
        float f15 = (f14 * sin2) + (f13 * cos2);
        float f16 = (f14 * cos2) + ((-f13) * sin2);
        float f17 = j4[8];
        float f18 = j4[10];
        float f19 = j4[12];
        float f20 = j4[14];
        j4[0] = (f12 * sin2) + (f11 * cos2);
        j4[2] = (f12 * cos2) + ((-f11) * sin2);
        j4[4] = f15;
        j4[6] = f16;
        j4[8] = (f18 * sin2) + (f17 * cos2);
        j4[10] = (f18 * cos2) + ((-f17) * sin2);
        j4[12] = (f20 * sin2) + (f19 * cos2);
        j4[14] = (f20 * cos2) + ((-f19) * sin2);
        W.D.w(j4, fVar.E());
        W.D.x(j4, fVar.r(), fVar.C(), 1.0f);
        W.D.z(fArr, j4);
        float[] j5 = W.D.j();
        W.D.F(j5, V.c.b(D3), V.c.c(D3));
        W.D.z(fArr, j5);
        return fArr;
    }
}
