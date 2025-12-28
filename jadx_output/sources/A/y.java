package A;

import D.C0032d;
import D.C0048l;
import D.C0049l0;
import D.C0052n;
import D.C0053n0;
import D.T;
import q.InterfaceC0550C;
import y.AbstractC0666d;
import y.C0665c;

/* loaded from: classes.dex */
public abstract class y {
    static {
        new T(C0015p.f162k);
    }

    public static final void a(C0014o c0014o, G g3, P p3, C0052n c0052n, int i3) {
        L.a aVar = G1.c.f1270a;
        c0052n.O(-2127166334);
        int i4 = (i3 & 6) == 0 ? i3 | 2 : i3;
        if ((i3 & 48) == 0) {
            i4 |= 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= c0052n.h(aVar) ? 2048 : 1024;
        }
        if ((i4 & 1171) == 1170 && c0052n.y()) {
            c0052n.K();
        } else {
            c0052n.L(-127, null, 0, null);
            if ((i3 & 1) == 0 || c0052n.x()) {
                c0014o = (C0014o) c0052n.k(AbstractC0016q.f170a);
                g3 = (G) c0052n.k(H.f19a);
                p3 = (P) c0052n.k(Q.f71a);
            } else {
                c0052n.K();
            }
            c0052n.r();
            InterfaceC0550C a3 = D.a(c0052n);
            long j3 = c0014o.f133a;
            boolean e3 = c0052n.e(j3);
            Object H2 = c0052n.H();
            if (e3 || H2 == C0048l.f781a) {
                H2 = new C0665c(j3, W.r.b(j3, 0.4f));
                c0052n.V(H2);
            }
            C0032d.b(new C0049l0[]{AbstractC0016q.f170a.a(c0014o), androidx.compose.foundation.c.f3275a.a(a3), z.z.f6915a.a(r.f172a), H.f19a.a(g3), AbstractC0666d.f6740a.a((C0665c) H2), Q.f71a.a(p3)}, L.b.b(-1066563262, new C0008i(p3), c0052n), c0052n, 56);
        }
        C0053n0 s3 = c0052n.s();
        if (s3 != null) {
            s3.f834d = new x(c0014o, g3, p3, i3);
        }
    }
}
