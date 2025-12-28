package B2;

import c2.C0174m;
import g2.InterfaceC0271d;

/* loaded from: classes.dex */
public final class C extends i2.j implements o2.e {
    public /* synthetic */ Object h;

    @Override // i2.a
    public final InterfaceC0271d f(InterfaceC0271d interfaceC0271d, Object obj) {
        C c3 = new C(2, interfaceC0271d);
        c3.h = obj;
        return c3;
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        return ((C) f((InterfaceC0271d) obj2, (y) obj)).l(C0174m.f3840a);
    }

    @Override // i2.a
    public final Object l(Object obj) {
        Z0.d.U(obj);
        return Boolean.valueOf(((y) this.h) != y.f368d);
    }
}
