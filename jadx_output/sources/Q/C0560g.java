package q;

import c2.C0174m;
import g2.InterfaceC0271d;
import s.C0586d;
import y2.AbstractC0688v;
import y2.InterfaceC0687u;

/* renamed from: q.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0560g extends i2.j implements o2.e {
    public final /* synthetic */ l h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0560g(l lVar, InterfaceC0271d interfaceC0271d) {
        super(2, interfaceC0271d);
        this.h = lVar;
    }

    @Override // i2.a
    public final InterfaceC0271d f(InterfaceC0271d interfaceC0271d, Object obj) {
        return new C0560g(this.h, interfaceC0271d);
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        C0560g c0560g = (C0560g) f((InterfaceC0271d) obj2, (InterfaceC0687u) obj);
        C0174m c0174m = C0174m.f3840a;
        c0560g.l(c0174m);
        return c0174m;
    }

    @Override // i2.a
    public final Object l(Object obj) {
        Z0.d.U(obj);
        l lVar = this.h;
        if (lVar.f6010D == null) {
            C0586d c0586d = new C0586d();
            s.g gVar = lVar.f6016s;
            if (gVar != null) {
                AbstractC0688v.l(lVar.U(), null, 0, new C0554a(gVar, c0586d, null), 3);
            }
            lVar.f6010D = c0586d;
        }
        return C0174m.f3840a;
    }
}
