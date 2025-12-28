package r;

import c2.C0174m;
import g2.InterfaceC0271d;
import y2.InterfaceC0687u;

/* loaded from: classes.dex */
public final class l extends i2.j implements o2.e {
    public final /* synthetic */ C0580e h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(C0580e c0580e, InterfaceC0271d interfaceC0271d) {
        super(2, interfaceC0271d);
        this.h = c0580e;
    }

    @Override // i2.a
    public final InterfaceC0271d f(InterfaceC0271d interfaceC0271d, Object obj) {
        return new l(this.h, interfaceC0271d);
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        l lVar = (l) f((InterfaceC0271d) obj2, (InterfaceC0687u) obj);
        C0174m c0174m = C0174m.f3840a;
        lVar.l(c0174m);
        return c0174m;
    }

    @Override // i2.a
    public final Object l(Object obj) {
        Z0.d.U(obj);
        C0580e c0580e = this.h;
        c0580e.f6081e = true;
        c0580e.f6083g.d(null);
        return C0174m.f3840a;
    }
}
