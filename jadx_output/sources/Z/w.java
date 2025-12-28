package z;

import d2.AbstractC0239j;
import n.C0404x;
import n0.AbstractC0409C;
import n0.C0408B;
import n0.InterfaceC0426g;
import n0.InterfaceC0430k;
import y2.AbstractC0688v;

/* loaded from: classes.dex */
public abstract class w extends P.k implements InterfaceC0426g, InterfaceC0430k, n0.r {

    /* renamed from: q, reason: collision with root package name */
    public final s.g f6904q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f6905r;

    /* renamed from: s, reason: collision with root package name */
    public final float f6906s;

    /* renamed from: t, reason: collision with root package name */
    public final A.t f6907t;

    /* renamed from: u, reason: collision with root package name */
    public final A.u f6908u;

    /* renamed from: v, reason: collision with root package name */
    public Z.a f6909v;

    /* renamed from: w, reason: collision with root package name */
    public float f6910w;

    /* renamed from: y, reason: collision with root package name */
    public boolean f6912y;

    /* renamed from: x, reason: collision with root package name */
    public long f6911x = 0;

    /* renamed from: z, reason: collision with root package name */
    public final C0404x f6913z = new C0404x();

    public w(s.g gVar, boolean z3, float f3, A.t tVar, A.u uVar) {
        this.f6904q = gVar;
        this.f6905r = z3;
        this.f6906s = f3;
        this.f6907t = tVar;
        this.f6908u = uVar;
    }

    @Override // n0.InterfaceC0430k
    public final void C(C0408B c0408b) {
        c0408b.a();
        Z.a aVar = this.f6909v;
        if (aVar != null) {
            aVar.a(c0408b, this.f6910w, this.f6907t.z());
        }
        g0(c0408b);
    }

    @Override // P.k
    public final boolean V() {
        return false;
    }

    @Override // P.k
    public final void Y() {
        AbstractC0688v.l(U(), null, 0, new v(this, null), 3);
    }

    public abstract void f0(s.i iVar, long j3, float f3);

    public abstract void g0(C0408B c0408b);

    public final void h0(s.k kVar) {
        if (kVar instanceof s.i) {
            f0((s.i) kVar, this.f6911x, this.f6910w);
        } else if (kVar instanceof s.j) {
            i0(((s.j) kVar).f6119a);
        } else if (kVar instanceof s.h) {
            i0(((s.h) kVar).f6117a);
        }
    }

    public abstract void i0(s.i iVar);

    @Override // n0.r
    public final void o(long j3) {
        this.f6912y = true;
        G0.b bVar = AbstractC0409C.q(this).f5314s;
        this.f6911x = r2.a.c0(j3);
        float f3 = this.f6906s;
        this.f6910w = Float.isNaN(f3) ? AbstractC0714q.a(bVar, this.f6905r, this.f6911x) : bVar.u(f3);
        C0404x c0404x = this.f6913z;
        Object[] objArr = c0404x.f5050a;
        int i3 = c0404x.f5051b;
        for (int i4 = 0; i4 < i3; i4++) {
            h0((s.k) objArr[i4]);
        }
        AbstractC0239j.c0(c0404x.f5050a, 0, c0404x.f5051b);
        c0404x.f5051b = 0;
    }
}
