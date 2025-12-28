package B2;

import c2.C0174m;
import g2.InterfaceC0271d;

/* loaded from: classes.dex */
public final class p extends i2.j implements o2.e {
    public /* synthetic */ int h;

    @Override // i2.a
    public final InterfaceC0271d f(InterfaceC0271d interfaceC0271d, Object obj) {
        p pVar = new p(2, interfaceC0271d);
        pVar.h = ((Number) obj).intValue();
        return pVar;
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        return ((p) f((InterfaceC0271d) obj2, Integer.valueOf(((Number) obj).intValue()))).l(C0174m.f3840a);
    }

    @Override // i2.a
    public final Object l(Object obj) {
        Z0.d.U(obj);
        return Boolean.valueOf(this.h > 0);
    }
}
