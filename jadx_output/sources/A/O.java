package A;

import D.AbstractC0047k0;
import D.C0032d;
import D.C0052n;
import D.C0053n0;
import D.U;
import v0.C0613B;

/* loaded from: classes.dex */
public abstract class O {

    /* renamed from: a, reason: collision with root package name */
    public static final D.H f56a = new D.H(U.f731i, C0015p.f167p);

    public static final void a(C0613B c0613b, C0052n c0052n, int i3) {
        int i4;
        L.a aVar = G1.c.f1270a;
        c0052n.O(-460300127);
        if ((i3 & 6) == 0) {
            i4 = (c0052n.f(c0613b) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0052n.h(aVar) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && c0052n.y()) {
            c0052n.K();
        } else {
            AbstractC0047k0 abstractC0047k0 = f56a;
            C0032d.a(abstractC0047k0.a(((C0613B) c0052n.k(abstractC0047k0)).c(c0613b)), aVar, c0052n, (i4 & 112) | 8);
        }
        C0053n0 s3 = c0052n.s();
        if (s3 != null) {
            s3.f834d = new M(c0613b, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(java.lang.String r34, P.l r35, long r36, long r38, z0.j r40, z0.l r41, z0.r r42, long r43, F0.g r45, F0.f r46, long r47, int r49, boolean r50, int r51, int r52, o2.c r53, v0.C0613B r54, D.C0052n r55, int r56, int r57, int r58) {
        /*
            Method dump skipped, instructions count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A.O.b(java.lang.String, P.l, long, long, z0.j, z0.l, z0.r, long, F0.g, F0.f, long, int, boolean, int, int, o2.c, v0.B, D.n, int, int, int):void");
    }
}
