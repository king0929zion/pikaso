package t;

import a.AbstractC0090a;
import d2.C0249t;
import l0.InterfaceC0360j;
import n0.AbstractC0418L;
import n0.InterfaceC0437s;

/* loaded from: classes.dex */
public final class w extends P.k implements InterfaceC0437s {

    /* renamed from: q, reason: collision with root package name */
    public float f6196q;

    /* renamed from: r, reason: collision with root package name */
    public float f6197r;

    @Override // n0.InterfaceC0437s
    public final M1.j R(AbstractC0418L abstractC0418L, InterfaceC0360j interfaceC0360j, long j3) {
        int j4;
        int i3 = 0;
        if (G0.e.a(this.f6196q, Float.NaN) || G0.a.j(j3) != 0) {
            j4 = G0.a.j(j3);
        } else {
            j4 = abstractC0418L.b(this.f6196q);
            int h = G0.a.h(j3);
            if (j4 > h) {
                j4 = h;
            }
            if (j4 < 0) {
                j4 = 0;
            }
        }
        int h3 = G0.a.h(j3);
        if (G0.e.a(this.f6197r, Float.NaN) || G0.a.i(j3) != 0) {
            i3 = G0.a.i(j3);
        } else {
            int b3 = abstractC0418L.b(this.f6197r);
            int g3 = G0.a.g(j3);
            if (b3 > g3) {
                b3 = g3;
            }
            if (b3 >= 0) {
                i3 = b3;
            }
        }
        l0.o a3 = interfaceC0360j.a(AbstractC0090a.a(j4, h3, i3, G0.a.g(j3)));
        return abstractC0418L.b0(a3.f4927d, a3.f4928e, C0249t.f4256d, new T.b(a3, 4));
    }
}
