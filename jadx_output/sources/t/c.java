package T;

import A.t;
import M1.j;
import P.d;
import P.k;
import V.f;
import W.C0089l;
import a.AbstractC0090a;
import b0.AbstractC0135b;
import d2.C0249t;
import l0.C0354d;
import l0.InterfaceC0360j;
import l0.o;
import n0.AbstractC0418L;
import n0.C0408B;
import n0.InterfaceC0430k;
import n0.InterfaceC0437s;

/* loaded from: classes.dex */
public final class c extends k implements InterfaceC0437s, InterfaceC0430k {

    /* renamed from: q, reason: collision with root package name */
    public AbstractC0135b f2325q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2326r;

    /* renamed from: s, reason: collision with root package name */
    public d f2327s;

    /* renamed from: t, reason: collision with root package name */
    public C0354d f2328t;

    /* renamed from: u, reason: collision with root package name */
    public float f2329u;

    /* renamed from: v, reason: collision with root package name */
    public C0089l f2330v;

    public static boolean f0(long j3) {
        if (!f.a(j3, 9205357640488583168L)) {
            float b3 = f.b(j3);
            if (!Float.isInfinite(b3) && !Float.isNaN(b3)) {
                return true;
            }
        }
        return false;
    }

    public static boolean g0(long j3) {
        if (!f.a(j3, 9205357640488583168L)) {
            float d3 = f.d(j3);
            if (!Float.isInfinite(d3) && !Float.isNaN(d3)) {
                return true;
            }
        }
        return false;
    }

    @Override // n0.InterfaceC0430k
    public final void C(C0408B c0408b) {
        long d3 = this.f2325q.d();
        boolean g02 = g0(d3);
        Y.b bVar = c0408b.f5076d;
        long d4 = AbstractC0090a.d(g02 ? f.d(d3) : f.d(bVar.L()), f0(d3) ? f.b(d3) : f.b(bVar.L()));
        long V2 = (f.d(bVar.L()) == 0.0f || f.b(bVar.L()) == 0.0f) ? 0L : Z0.d.V(d4, this.f2328t.a(d4, bVar.L()));
        long a3 = this.f2327s.a(r2.a.d(Math.round(f.d(V2)), Math.round(f.b(V2))), r2.a.d(Math.round(f.d(bVar.L())), Math.round(f.b(bVar.L()))), c0408b.getLayoutDirection());
        float f3 = (int) (a3 >> 32);
        float f4 = (int) (a3 & 4294967295L);
        ((t) bVar.f2770e.f271b).I(f3, f4);
        try {
            this.f2325q.c(c0408b, V2, this.f2329u, this.f2330v);
            ((t) bVar.f2770e.f271b).I(-f3, -f4);
            c0408b.a();
        } catch (Throwable th) {
            ((t) bVar.f2770e.f271b).I(-f3, -f4);
            throw th;
        }
    }

    @Override // n0.InterfaceC0437s
    public final j R(AbstractC0418L abstractC0418L, InterfaceC0360j interfaceC0360j, long j3) {
        long a3;
        boolean z3 = false;
        boolean z4 = G0.a.d(j3) && G0.a.c(j3);
        if (G0.a.f(j3) && G0.a.e(j3)) {
            z3 = true;
        }
        if (((!this.f2326r || this.f2325q.d() == 9205357640488583168L) && z4) || z3) {
            a3 = G0.a.a(G0.a.h(j3), G0.a.g(j3), j3);
        } else {
            long d3 = this.f2325q.d();
            long d4 = AbstractC0090a.d(AbstractC0090a.p(j3, g0(d3) ? Math.round(f.d(d3)) : G0.a.j(j3)), AbstractC0090a.o(j3, f0(d3) ? Math.round(f.b(d3)) : G0.a.i(j3)));
            if (this.f2326r && this.f2325q.d() != 9205357640488583168L) {
                long d5 = AbstractC0090a.d(!g0(this.f2325q.d()) ? f.d(d4) : f.d(this.f2325q.d()), !f0(this.f2325q.d()) ? f.b(d4) : f.b(this.f2325q.d()));
                d4 = (f.d(d4) == 0.0f || f.b(d4) == 0.0f) ? 0L : Z0.d.V(d5, this.f2328t.a(d5, d4));
            }
            a3 = G0.a.a(AbstractC0090a.p(j3, Math.round(f.d(d4))), AbstractC0090a.o(j3, Math.round(f.b(d4))), j3);
        }
        o a4 = interfaceC0360j.a(a3);
        return abstractC0418L.b0(a4.f4927d, a4.f4928e, C0249t.f4256d, new b(a4, 0));
    }

    @Override // P.k
    public final boolean V() {
        return false;
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.f2325q + ", sizeToIntrinsics=" + this.f2326r + ", alignment=" + this.f2327s + ", alpha=" + this.f2329u + ", colorFilter=" + this.f2330v + ')';
    }
}
