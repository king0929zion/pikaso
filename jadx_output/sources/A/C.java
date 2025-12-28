package A;

import D.C0032d;
import D.C0048l;
import D.C0049l0;
import D.C0052n;
import D.C0053n0;
import D.U;
import D.Z;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import d2.AbstractC0240k;
import java.util.concurrent.atomic.AtomicInteger;
import p.AbstractC0530I;
import p.C0535d;
import p.C0540i;
import s.C0584b;
import s.C0586d;
import z.C0705h;

/* loaded from: classes.dex */
public abstract class C {

    /* renamed from: a, reason: collision with root package name */
    public static final C0705h f2a = new C0705h(0.16f, 0.1f, 0.08f, 0.1f);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean, int] */
    public static final void a(A0.c cVar, P.l lVar, boolean z3, W.H h, C0001b c0001b, C0006g c0006g, t.p pVar, s.g gVar, C0052n c0052n, int i3) {
        int i4;
        int i5;
        C0006g c0006g2;
        C0001b c0001b2;
        s.g gVar2;
        W.H h3;
        boolean z4;
        s.g gVar3;
        Object obj;
        C0001b c0001b3;
        s.g gVar4;
        long j3;
        long j4;
        C0540i c0540i;
        ?? r12;
        C0001b c0001b4;
        W.H h4;
        C0006g c0006g3;
        s.g gVar5;
        L.a aVar = G1.c.f1272c;
        c0052n.O(650121315);
        if ((i3 & 6) == 0) {
            i4 = (c0052n.h(cVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0052n.f(lVar) ? 32 : 16;
        }
        int i6 = i4 | 384;
        if ((i3 & 3072) == 0) {
            i6 = i4 | 1408;
        }
        if ((i3 & 24576) == 0) {
            i6 |= 8192;
        }
        if ((196608 & i3) == 0) {
            i6 |= 65536;
        }
        int i7 = 1572864 | i6;
        if ((12582912 & i3) == 0) {
            i7 |= c0052n.f(pVar) ? 8388608 : 4194304;
        }
        int i8 = i7 | 100663296;
        if ((805306368 & i3) == 0) {
            i8 |= c0052n.h(aVar) ? 536870912 : 268435456;
        }
        if ((306783379 & i8) == 306783378 && c0052n.y()) {
            c0052n.K();
            z4 = z3;
            h4 = h;
            c0001b4 = c0001b;
            c0006g3 = c0006g;
            gVar5 = gVar;
        } else {
            c0052n.L(-127, null, 0, null);
            if ((i3 & 1) == 0 || c0052n.x()) {
                float f3 = AbstractC0002c.f76a;
                W.H a3 = H.a(C.c.f412b, c0052n);
                C0014o c0014o = (C0014o) c0052n.k(AbstractC0016q.f170a);
                C0001b c0001b5 = c0014o.f131K;
                if (c0001b5 == null) {
                    c0001b5 = new C0001b(AbstractC0016q.b(c0014o, 26), AbstractC0016q.b(c0014o, C.c.h), W.r.b(AbstractC0016q.b(c0014o, C.c.f413c), 0.12f), W.r.b(AbstractC0016q.b(c0014o, C.c.f415e), 0.38f));
                    c0014o.f131K = c0001b5;
                }
                i5 = i8 & (-523265);
                c0006g2 = new C0006g(C.c.f411a, C.c.f418i, C.c.f416f, C.c.f417g, C.c.f414d);
                c0001b2 = c0001b5;
                gVar2 = null;
                h3 = a3;
                z4 = true;
            } else {
                c0052n.K();
                int i9 = i8 & (-523265);
                h3 = h;
                c0001b2 = c0001b;
                c0006g2 = c0006g;
                gVar2 = gVar;
                i5 = i9;
                z4 = z3;
            }
            c0052n.r();
            c0052n.N(-239156623);
            Object obj2 = C0048l.f781a;
            if (gVar2 == null) {
                Object H2 = c0052n.H();
                if (H2 == obj2) {
                    H2 = new s.g();
                    c0052n.V(H2);
                }
                gVar3 = (s.g) H2;
            } else {
                gVar3 = gVar2;
            }
            c0052n.q(false);
            long j5 = z4 ? c0001b2.f72a : c0001b2.f74c;
            long j6 = z4 ? c0001b2.f73b : c0001b2.f75d;
            c0052n.N(-239150048);
            if (c0006g2 == null) {
                c0001b3 = c0001b2;
                gVar4 = gVar3;
                j4 = j6;
                r12 = 0;
                c0540i = null;
            } else {
                int i10 = i5 >> 6;
                Object H3 = c0052n.H();
                if (H3 == obj2) {
                    N.s sVar = new N.s();
                    H.j jVar = H.j.f1327e;
                    N.q qVar = new N.q(jVar);
                    if (N.o.f1755a.i() != null) {
                        N.q qVar2 = new N.q(jVar);
                        qVar2.f1700a = 1;
                        qVar.f1701b = qVar2;
                    }
                    sVar.f1770d = qVar;
                    c0052n.V(sVar);
                    obj = sVar;
                } else {
                    obj = H3;
                }
                N.s sVar2 = (N.s) obj;
                boolean f4 = c0052n.f(gVar3);
                Object H4 = c0052n.H();
                if (f4 || H4 == obj2) {
                    H4 = new C0004e(gVar3, sVar2, null);
                    c0052n.V(H4);
                }
                C0032d.d(c0052n, gVar3, (o2.e) H4);
                s.f fVar = (s.f) AbstractC0240k.f0(sVar2);
                float f5 = !z4 ? c0006g2.f91e : fVar instanceof s.i ? c0006g2.f88b : fVar instanceof C0586d ? c0006g2.f90d : fVar instanceof C0584b ? c0006g2.f89c : c0006g2.f87a;
                Object H5 = c0052n.H();
                if (H5 == obj2) {
                    c0001b3 = c0001b2;
                    gVar4 = gVar3;
                    j3 = j6;
                    H5 = new C0535d(new G0.e(f5), AbstractC0530I.f5855b, null, 12);
                    c0052n.V(H5);
                } else {
                    c0001b3 = c0001b2;
                    gVar4 = gVar3;
                    j3 = j6;
                }
                C0535d c0535d = (C0535d) H5;
                G0.e eVar = new G0.e(f5);
                boolean h5 = c0052n.h(c0535d) | c0052n.c(f5) | (((i10 & 14) ^ 6) > 4 && c0052n.g(z4)) | c0052n.f(c0006g2) | c0052n.h(fVar);
                Object H6 = c0052n.H();
                if (h5 || H6 == obj2) {
                    j4 = j3;
                    H6 = new C0005f(c0535d, f5, z4, c0006g2, fVar, null);
                    c0052n.V(H6);
                } else {
                    j4 = j3;
                }
                C0032d.d(c0052n, eVar, (o2.e) H6);
                c0540i = c0535d.f5869c;
                r12 = 0;
            }
            c0052n.q(r12);
            float f6 = c0540i != null ? ((G0.e) c0540i.f5892e.getValue()).f1257d : (float) r12;
            C0007h c0007h = C0007h.f92f;
            AtomicInteger atomicInteger = t0.h.f6233a;
            P.l c3 = lVar.c(new AppendedSemanticsElement(c0007h, r12));
            L.a b3 = L.b.b(956488494, new C0009j(j4, pVar), c0052n);
            D.H h6 = L.f33a;
            float f7 = ((G0.e) c0052n.k(h6)).f1257d + ((float) r12);
            C0032d.b(new C0049l0[]{s.f173a.a(new W.r(j4)), h6.a(new G0.e(f7))}, L.b.b(1279702876, new K(c3, h3, j5, f7, gVar4, z4, cVar, f6, b3), c0052n), c0052n, 56);
            c0001b4 = c0001b3;
            h4 = h3;
            c0006g3 = c0006g2;
            gVar5 = gVar2;
        }
        C0053n0 s3 = c0052n.s();
        if (s3 != null) {
            s3.f834d = new C0010k(cVar, lVar, z4, h4, c0001b4, c0006g3, pVar, gVar5, i3);
        }
    }

    public static final void b(P.l lVar, W.H h, C0011l c0011l, C0012m c0012m, L.a aVar, C0052n c0052n, int i3) {
        int i4;
        C0011l c0011l2;
        int i5 = 1;
        c0052n.O(1179621553);
        if ((i3 & 6) == 0) {
            i4 = (c0052n.f(lVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0052n.f(h) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= c0052n.f(c0012m) ? 2048 : 1024;
        }
        int i6 = i4 | 24576;
        if ((196608 & i3) == 0) {
            i6 |= c0052n.h(aVar) ? 131072 : 65536;
        }
        if ((i6 & 74899) == 74898 && c0052n.y()) {
            c0052n.K();
            c0011l2 = c0011l;
        } else {
            c0052n.L(-127, null, 0, null);
            if ((i3 & 1) == 0 || c0052n.x()) {
                C0014o c0014o = (C0014o) c0052n.k(AbstractC0016q.f170a);
                C0011l c0011l3 = c0014o.f132L;
                if (c0011l3 == null) {
                    float f3 = C.d.f419a;
                    c0011l3 = new C0011l(AbstractC0016q.b(c0014o, 39), AbstractC0016q.a(c0014o, AbstractC0016q.b(c0014o, 39)), W.D.i(W.r.b(AbstractC0016q.b(c0014o, C.d.f420b), C.d.f422d), AbstractC0016q.b(c0014o, 39)), W.r.b(AbstractC0016q.a(c0014o, AbstractC0016q.b(c0014o, 39)), 0.38f));
                    c0014o.f132L = c0011l3;
                }
                c0011l2 = c0011l3;
            } else {
                c0052n.K();
                c0011l2 = c0011l;
            }
            c0052n.r();
            long j3 = c0011l2.f107a;
            c0012m.getClass();
            c0052n.N(-1763481333);
            c0052n.N(-734838460);
            U u3 = C0048l.f781a;
            Object H2 = c0052n.H();
            if (H2 == u3) {
                H2 = C0032d.A(new G0.e(c0012m.f111a));
                c0052n.V(H2);
            }
            c0052n.q(false);
            c0052n.q(false);
            float f4 = ((G0.e) ((Z) H2).getValue()).f1257d;
            L.a b3 = L.b.b(664103990, new C0008i(i5, aVar), c0052n);
            D.H h3 = L.f33a;
            float f5 = ((G0.e) c0052n.k(h3)).f1257d + 0;
            C0032d.b(new C0049l0[]{s.f173a.a(new W.r(c0011l2.f108b)), h3.a(new G0.e(f5))}, L.b.b(-70914509, new J(lVar, h, j3, f5, f4, b3), c0052n), c0052n, 56);
        }
        C0053n0 s3 = c0052n.s();
        if (s3 != null) {
            s3.f834d = new C0013n(lVar, h, c0011l2, c0012m, aVar, i3);
        }
    }
}
