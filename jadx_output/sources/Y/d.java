package Y;

import W.C;
import W.C0083f;
import W.C0089l;
import W.D;
import a.AbstractC0090a;
import n0.C0408B;

/* loaded from: classes.dex */
public interface d extends G0.b {
    static long S(long j3, long j4) {
        return AbstractC0090a.d(V.f.d(j3) - V.c.b(j4), V.f.b(j3) - V.c.c(j4));
    }

    static /* synthetic */ void T(d dVar, C c3, D d3, float f3, g gVar, int i3) {
        if ((i3 & 4) != 0) {
            f3 = 1.0f;
        }
        float f4 = f3;
        c cVar = gVar;
        if ((i3 & 8) != 0) {
            cVar = f.f2774b;
        }
        dVar.m(c3, d3, f4, cVar, null, (i3 & 32) != 0 ? 3 : 0);
    }

    static void e(d dVar, C0083f c0083f, long j3, long j4, long j5, float f3, C0089l c0089l, int i3, int i4) {
        dVar.E(c0083f, (i4 & 2) != 0 ? 0L : j3, j4, 0L, (i4 & 16) != 0 ? j4 : j5, (i4 & 32) != 0 ? 1.0f : f3, f.f2774b, c0089l, 3, (i4 & 512) != 0 ? 1 : i3);
    }

    static void i(C0408B c0408b, long j3, float f3, long j4, int i3) {
        if ((i3 & 4) != 0) {
            j4 = c0408b.f5076d.k();
        }
        f fVar = f.f2774b;
        b bVar = c0408b.f5076d;
        bVar.f2769d.f2767c.i(f3, j4, b.a(bVar, j3, fVar, 1.0f, null, 3));
    }

    void E(C0083f c0083f, long j3, long j4, long j5, long j6, float f3, c cVar, C0089l c0089l, int i3, int i4);

    B0.a H();

    default long L() {
        return H().r();
    }

    G0.f getLayoutDirection();

    default long k() {
        return AbstractC0090a.D(H().r());
    }

    void m(C c3, D d3, float f3, c cVar, C0089l c0089l, int i3);

    void x(long j3, long j4, long j5, float f3, c cVar, C0089l c0089l, int i3);
}
