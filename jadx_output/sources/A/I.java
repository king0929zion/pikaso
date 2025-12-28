package A;

import c2.C0174m;
import g2.InterfaceC0271d;

/* loaded from: classes.dex */
public final class I extends i2.j implements o2.e {
    @Override // i2.a
    public final InterfaceC0271d f(InterfaceC0271d interfaceC0271d, Object obj) {
        return new I(2, interfaceC0271d);
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        I i3 = (I) f((InterfaceC0271d) obj2, (h0.r) obj);
        C0174m c0174m = C0174m.f3840a;
        i3.l(c0174m);
        return c0174m;
    }

    @Override // i2.a
    public final Object l(Object obj) {
        Z0.d.U(obj);
        return C0174m.f3840a;
    }
}
