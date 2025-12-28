package t;

import a.AbstractC0090a;
import d2.C0249t;
import l0.InterfaceC0360j;
import n0.AbstractC0418L;
import n0.InterfaceC0437s;

/* loaded from: classes.dex */
public final class n extends P.k implements InterfaceC0437s {

    /* renamed from: q, reason: collision with root package name */
    public int f6175q;

    /* renamed from: r, reason: collision with root package name */
    public float f6176r;

    @Override // n0.InterfaceC0437s
    public final M1.j R(AbstractC0418L abstractC0418L, InterfaceC0360j interfaceC0360j, long j3) {
        int j4;
        int h;
        int g3;
        int i3;
        if (!G0.a.d(j3) || this.f6175q == 1) {
            j4 = G0.a.j(j3);
            h = G0.a.h(j3);
        } else {
            j4 = Z.b.k(Math.round(G0.a.h(j3) * this.f6176r), G0.a.j(j3), G0.a.h(j3));
            h = j4;
        }
        if (!G0.a.c(j3) || this.f6175q == 2) {
            int i4 = G0.a.i(j3);
            g3 = G0.a.g(j3);
            i3 = i4;
        } else {
            i3 = Z.b.k(Math.round(G0.a.g(j3) * this.f6176r), G0.a.i(j3), G0.a.g(j3));
            g3 = i3;
        }
        l0.o a3 = interfaceC0360j.a(AbstractC0090a.a(j4, h, i3, g3));
        return abstractC0418L.b0(a3.f4927d, a3.f4928e, C0249t.f4256d, new T.b(a3, 2));
    }
}
