package A;

import d2.C0249t;
import l0.InterfaceC0360j;
import n0.AbstractC0409C;
import n0.AbstractC0418L;
import n0.InterfaceC0426g;
import n0.InterfaceC0437s;

/* loaded from: classes.dex */
public final class A extends P.k implements InterfaceC0426g, InterfaceC0437s {
    @Override // n0.InterfaceC0437s
    public final M1.j R(AbstractC0418L abstractC0418L, InterfaceC0360j interfaceC0360j, long j3) {
        float f3 = ((G0.e) AbstractC0409C.h(this, w.f183a)).f1257d;
        float f4 = 0;
        if (f3 < f4) {
            f3 = f4;
        }
        l0.o a3 = interfaceC0360j.a(j3);
        boolean z3 = this.f2099p && !Float.isNaN(f3) && Float.compare(f3, f4) > 0;
        int b3 = Float.isNaN(f3) ? 0 : abstractC0418L.b(f3);
        int max = z3 ? Math.max(a3.f4927d, b3) : a3.f4927d;
        int max2 = z3 ? Math.max(a3.f4928e, b3) : a3.f4928e;
        return abstractC0418L.b0(max, max2, C0249t.f4256d, new z(max, a3, max2));
    }
}
