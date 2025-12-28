package D;

import c2.C0174m;
import g2.InterfaceC0271d;

/* renamed from: D.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0057p0 extends i2.j implements o2.e {
    public /* synthetic */ Object h;

    @Override // i2.a
    public final InterfaceC0271d f(InterfaceC0271d interfaceC0271d, Object obj) {
        C0057p0 c0057p0 = new C0057p0(2, interfaceC0271d);
        c0057p0.h = obj;
        return c0057p0;
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        return ((C0057p0) f((InterfaceC0271d) obj2, (EnumC0055o0) obj)).l(C0174m.f3840a);
    }

    @Override // i2.a
    public final Object l(Object obj) {
        Z0.d.U(obj);
        return Boolean.valueOf(((EnumC0055o0) this.h) == EnumC0055o0.f839d);
    }
}
