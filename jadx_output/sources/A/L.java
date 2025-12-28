package A;

import D.C0052n;
import D.U;

/* loaded from: classes.dex */
public abstract class L {

    /* renamed from: a, reason: collision with root package name */
    public static final D.H f33a = new D.H(U.f731i, C0015p.f166o);

    public static final P.l a(P.l lVar, W.H h, long j3, float f3) {
        P.i iVar = P.i.f2087a;
        return androidx.compose.ui.graphics.a.a(androidx.compose.foundation.a.a(lVar.c(f3 > 0.0f ? androidx.compose.ui.graphics.a.a(iVar, f3, h, false, 124895) : iVar).c(iVar), j3, h), 0.0f, h, true, 124927);
    }

    public static final long b(long j3, float f3, C0052n c0052n) {
        C0014o c0014o = (C0014o) c0052n.k(AbstractC0016q.f170a);
        boolean booleanValue = ((Boolean) c0052n.k(AbstractC0016q.f171b)).booleanValue();
        if (!W.r.c(j3, c0014o.f147p) || !booleanValue) {
            return j3;
        }
        boolean a3 = G0.e.a(f3, 0);
        long j4 = c0014o.f147p;
        if (a3) {
            return j4;
        }
        return W.D.i(W.r.b(c0014o.f151t, ((((float) Math.log(f3 + 1)) * 4.5f) + 2.0f) / 100.0f), j4);
    }
}
