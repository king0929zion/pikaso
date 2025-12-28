package x;

import A.t;
import W.D;
import W.G;
import W.o;
import W.r;
import a.AbstractC0090a;
import d2.C0248s;
import java.util.LinkedHashMap;
import java.util.Map;
import l0.AbstractC0353c;
import l0.C0356f;
import l0.InterfaceC0360j;
import n0.AbstractC0409C;
import n0.AbstractC0418L;
import n0.C0408B;
import n0.InterfaceC0430k;
import n0.InterfaceC0437s;
import n0.l0;
import t0.C0599a;
import t0.n;
import t0.p;
import t0.q;
import v0.C0613B;
import v0.C0616a;
import v0.C0618c;
import v0.v;
import w0.w;
import z0.InterfaceC0721e;

/* renamed from: x.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0648m extends P.k implements InterfaceC0437s, InterfaceC0430k, l0 {

    /* renamed from: A, reason: collision with root package name */
    public C0647l f6644A;

    /* renamed from: B, reason: collision with root package name */
    public C0646k f6645B;

    /* renamed from: q, reason: collision with root package name */
    public String f6646q;

    /* renamed from: r, reason: collision with root package name */
    public C0613B f6647r;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC0721e f6648s;

    /* renamed from: t, reason: collision with root package name */
    public int f6649t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f6650u;

    /* renamed from: v, reason: collision with root package name */
    public int f6651v;

    /* renamed from: w, reason: collision with root package name */
    public int f6652w;

    /* renamed from: x, reason: collision with root package name */
    public t f6653x;

    /* renamed from: y, reason: collision with root package name */
    public Map f6654y;

    /* renamed from: z, reason: collision with root package name */
    public C0642g f6655z;

    @Override // n0.l0
    public final void A(t0.g gVar) {
        C0647l c0647l = this.f6644A;
        if (c0647l == null) {
            c0647l = new C0647l(this, 0);
            this.f6644A = c0647l;
        }
        C0618c c0618c = new C0618c(this.f6646q, null, null, null);
        v2.c[] cVarArr = p.f6284a;
        gVar.b(n.f6275s, Z.b.D(c0618c));
        C0646k c0646k = this.f6645B;
        if (c0646k != null) {
            boolean z3 = c0646k.f6640c;
            q qVar = n.f6277u;
            v2.c[] cVarArr2 = p.f6284a;
            v2.c cVar = cVarArr2[15];
            Boolean valueOf = Boolean.valueOf(z3);
            qVar.getClass();
            gVar.b(qVar, valueOf);
            C0618c c0618c2 = new C0618c(c0646k.f6639b, null, null, null);
            q qVar2 = n.f6276t;
            v2.c cVar2 = cVarArr2[14];
            qVar2.getClass();
            gVar.b(qVar2, c0618c2);
        }
        gVar.b(t0.f.f6213i, new C0599a(null, new C0647l(this, 1)));
        gVar.b(t0.f.f6214j, new C0599a(null, new C0647l(this, 2)));
        gVar.b(t0.f.f6215k, new C0599a(null, new A0.c(20, this)));
        gVar.b(t0.f.f6206a, new C0599a(null, c0647l));
    }

    @Override // n0.InterfaceC0430k
    public final void C(C0408B c0408b) {
        C0642g f02;
        if (this.f2099p) {
            C0646k c0646k = this.f6645B;
            if (c0646k == null || !c0646k.f6640c || (f02 = c0646k.f6641d) == null) {
                f02 = f0();
                f02.a(c0408b);
            } else {
                f02.a(c0408b);
            }
            C0616a c0616a = f02.f6609j;
            if (c0616a == null) {
                throw new IllegalArgumentException(("no paragraph (layoutCache=" + this.f6655z + ", textSubstitution=" + this.f6645B + ')').toString());
            }
            o j3 = c0408b.f5076d.f2770e.j();
            boolean z3 = f02.f6610k;
            if (z3) {
                long j4 = f02.f6611l;
                j3.d();
                j3.n(0.0f, 0.0f, (int) (j4 >> 32), (int) (j4 & 4294967295L), 1);
            }
            try {
                v vVar = this.f6647r.f6319a;
                F0.g gVar = vVar.f6456m;
                if (gVar == null) {
                    gVar = F0.g.f1182b;
                }
                F0.g gVar2 = gVar;
                G g3 = vVar.f6457n;
                if (g3 == null) {
                    g3 = G.f2508d;
                }
                G g4 = g3;
                Y.c cVar = vVar.f6458o;
                if (cVar == null) {
                    cVar = Y.f.f2774b;
                }
                Y.c cVar2 = cVar;
                D c3 = vVar.f6445a.c();
                if (c3 != null) {
                    c0616a.f(j3, c3, this.f6647r.f6319a.f6445a.a(), g4, gVar2, cVar2, 3);
                } else {
                    t tVar = this.f6653x;
                    long z4 = tVar != null ? tVar.z() : r.f2562f;
                    if (z4 == 16) {
                        z4 = this.f6647r.b() != 16 ? this.f6647r.b() : r.f2558b;
                    }
                    c0616a.e(j3, z4, g4, gVar2, cVar2, 3);
                }
                if (z3) {
                    j3.a();
                }
            } catch (Throwable th) {
                if (z3) {
                    j3.a();
                }
                throw th;
            }
        }
    }

    @Override // n0.InterfaceC0437s
    public final M1.j R(AbstractC0418L abstractC0418L, InterfaceC0360j interfaceC0360j, long j3) {
        C0642g f02;
        long j4;
        int i3;
        int i4;
        boolean z3;
        v0.m mVar;
        C0646k c0646k = this.f6645B;
        if (c0646k == null || !c0646k.f6640c || (f02 = c0646k.f6641d) == null) {
            f02 = f0();
            f02.a(abstractC0418L);
        } else {
            f02.a(abstractC0418L);
        }
        G0.f layoutDirection = abstractC0418L.getLayoutDirection();
        if (f02.f6607g > 1) {
            C0639d c0639d = f02.f6612m;
            C0613B c0613b = f02.f6602b;
            G0.b bVar = f02.f6608i;
            p2.g.b(bVar);
            C0639d d3 = AbstractC0638c.d(c0639d, layoutDirection, c0613b, bVar, f02.f6603c);
            f02.f6612m = d3;
            j4 = d3.a(j3, f02.f6607g);
        } else {
            j4 = j3;
        }
        C0616a c0616a = f02.f6609j;
        if (c0616a == null || (mVar = f02.f6613n) == null || mVar.a() || layoutDirection != f02.f6614o || (!G0.a.b(j4, f02.f6615p) && (G0.a.h(j4) != G0.a.h(f02.f6615p) || G0.a.g(j4) < c0616a.b() || c0616a.f6327d.f6541d))) {
            v0.m mVar2 = f02.f6613n;
            if (mVar2 == null || layoutDirection != f02.f6614o || mVar2.a()) {
                f02.f6614o = layoutDirection;
                String str = f02.f6601a;
                C0613B K2 = Z.b.K(f02.f6602b, layoutDirection);
                G0.b bVar2 = f02.f6608i;
                p2.g.b(bVar2);
                InterfaceC0721e interfaceC0721e = f02.f6603c;
                C0248s c0248s = C0248s.f4255d;
                mVar2 = new C0.d(str, K2, c0248s, c0248s, interfaceC0721e, bVar2);
            }
            f02.f6613n = mVar2;
            long b3 = AbstractC0637b.b(j4, f02.f6605e, f02.f6604d, mVar2.b());
            boolean z4 = f02.f6605e;
            int i5 = f02.f6604d;
            int i6 = f02.f6606f;
            if (z4) {
                i3 = 2;
            } else {
                i3 = 2;
                if (AbstractC0090a.z(i5, 2)) {
                    i4 = 1;
                    C0616a c0616a2 = new C0616a((C0.d) mVar2, i4, AbstractC0090a.z(f02.f6604d, i3), b3);
                    f02.f6615p = j4;
                    long n2 = AbstractC0090a.n(j4, r2.a.d(Z.b.d(c0616a2.c()), Z.b.d(c0616a2.b())));
                    f02.f6611l = n2;
                    f02.f6610k = AbstractC0090a.z(f02.f6604d, 3) && (((float) ((int) (n2 >> 32))) < c0616a2.c() || ((float) ((int) (n2 & 4294967295L))) < c0616a2.b());
                    f02.f6609j = c0616a2;
                    z3 = true;
                }
            }
            if (i6 < 1) {
                i6 = 1;
            }
            i4 = i6;
            C0616a c0616a22 = new C0616a((C0.d) mVar2, i4, AbstractC0090a.z(f02.f6604d, i3), b3);
            f02.f6615p = j4;
            long n22 = AbstractC0090a.n(j4, r2.a.d(Z.b.d(c0616a22.c()), Z.b.d(c0616a22.b())));
            f02.f6611l = n22;
            f02.f6610k = AbstractC0090a.z(f02.f6604d, 3) && (((float) ((int) (n22 >> 32))) < c0616a22.c() || ((float) ((int) (n22 & 4294967295L))) < c0616a22.b());
            f02.f6609j = c0616a22;
            z3 = true;
        } else {
            if (!G0.a.b(j4, f02.f6615p)) {
                C0616a c0616a3 = f02.f6609j;
                p2.g.b(c0616a3);
                long n3 = AbstractC0090a.n(j4, r2.a.d(Z.b.d(Math.min(c0616a3.f6324a.f559i.b(), c0616a3.c())), Z.b.d(c0616a3.b())));
                f02.f6611l = n3;
                f02.f6610k = !AbstractC0090a.z(f02.f6604d, 3) && (((float) ((int) (n3 >> 32))) < c0616a3.c() || ((float) ((int) (n3 & 4294967295L))) < c0616a3.b());
                f02.f6615p = j4;
            }
            z3 = false;
        }
        v0.m mVar3 = f02.f6613n;
        if (mVar3 != null) {
            mVar3.a();
        }
        C0616a c0616a4 = f02.f6609j;
        p2.g.b(c0616a4);
        long j5 = f02.f6611l;
        if (z3) {
            AbstractC0409C.p(this, 2).w0();
            Map map = this.f6654y;
            if (map == null) {
                map = new LinkedHashMap(2);
            }
            C0356f c0356f = AbstractC0353c.f4917a;
            w wVar = c0616a4.f6327d;
            map.put(c0356f, Integer.valueOf(Math.round(wVar.c(0))));
            map.put(AbstractC0353c.f4918b, Integer.valueOf(Math.round(wVar.c(wVar.f6543f - 1))));
            this.f6654y = map;
        }
        int i7 = (int) (j5 >> 32);
        int i8 = (int) (j5 & 4294967295L);
        int min = Math.min(i7, 262142);
        int min2 = i7 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i7, 262142);
        int h = AbstractC0090a.h(min2 == Integer.MAX_VALUE ? min : min2);
        l0.o a3 = interfaceC0360j.a(AbstractC0090a.a(min, min2, Math.min(h, i8), i8 != Integer.MAX_VALUE ? Math.min(h, i8) : Integer.MAX_VALUE));
        Map map2 = this.f6654y;
        p2.g.b(map2);
        return abstractC0418L.c0(i7, i8, map2, new T.b(a3, 6));
    }

    public final C0642g f0() {
        if (this.f6655z == null) {
            this.f6655z = new C0642g(this.f6646q, this.f6647r, this.f6648s, this.f6649t, this.f6650u, this.f6651v, this.f6652w);
        }
        C0642g c0642g = this.f6655z;
        p2.g.b(c0642g);
        return c0642g;
    }
}
