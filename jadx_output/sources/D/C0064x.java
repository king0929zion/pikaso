package D;

import android.view.Choreographer;
import c2.C0174m;
import g2.InterfaceC0271d;
import y2.InterfaceC0687u;

/* renamed from: D.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0064x extends i2.j implements o2.e {
    @Override // i2.a
    public final InterfaceC0271d f(InterfaceC0271d interfaceC0271d, Object obj) {
        return new C0064x(2, interfaceC0271d);
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        return ((C0064x) f((InterfaceC0271d) obj2, (InterfaceC0687u) obj)).l(C0174m.f3840a);
    }

    @Override // i2.a
    public final Object l(Object obj) {
        Z0.d.U(obj);
        return Choreographer.getInstance();
    }
}
