package l0;

import a.AbstractC0090a;
import n0.Q;

/* loaded from: classes.dex */
public abstract class n {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(n nVar, o oVar) {
        nVar.getClass();
        if (oVar instanceof Q) {
            ((Q) oVar).z();
        }
    }

    public static void d(n nVar, o oVar, int i3, int i4) {
        nVar.getClass();
        long c3 = r2.a.c(i3, i4);
        a(nVar, oVar);
        oVar.G(AbstractC0090a.X(c3, oVar.h), 0.0f, null);
    }

    public static void e(n nVar, o oVar, long j3) {
        nVar.getClass();
        a(nVar, oVar);
        oVar.G(AbstractC0090a.X(j3, oVar.h), 0.0f, null);
    }

    public static void f(n nVar, o oVar, int i3, int i4) {
        long c3 = r2.a.c(i3, i4);
        if (nVar.b() == G0.f.f1258d || nVar.c() == 0) {
            a(nVar, oVar);
            oVar.G(AbstractC0090a.X(c3, oVar.h), 0.0f, null);
        } else {
            long c4 = r2.a.c((nVar.c() - oVar.f4927d) - ((int) (c3 >> 32)), (int) (c3 & 4294967295L));
            a(nVar, oVar);
            oVar.G(AbstractC0090a.X(c4, oVar.h), 0.0f, null);
        }
    }

    public static void g(n nVar, o oVar) {
        int i3 = q.f4935b;
        p pVar = p.f4931f;
        long c3 = r2.a.c(0, 0);
        if (nVar.b() == G0.f.f1258d || nVar.c() == 0) {
            a(nVar, oVar);
            oVar.G(AbstractC0090a.X(c3, oVar.h), 0.0f, pVar);
        } else {
            long c4 = r2.a.c((nVar.c() - oVar.f4927d) - ((int) (c3 >> 32)), (int) (c3 & 4294967295L));
            a(nVar, oVar);
            oVar.G(AbstractC0090a.X(c4, oVar.h), 0.0f, pVar);
        }
    }

    public abstract G0.f b();

    public abstract int c();
}
