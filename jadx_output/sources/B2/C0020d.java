package B2;

import c2.C0174m;
import g2.InterfaceC0271d;

/* renamed from: B2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0020d implements InterfaceC0021e {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0021e f308d;

    public C0020d(InterfaceC0021e interfaceC0021e) {
        this.f308d = interfaceC0021e;
    }

    @Override // B2.InterfaceC0021e
    public final Object o(InterfaceC0022f interfaceC0022f, InterfaceC0271d interfaceC0271d) {
        p2.o oVar = new p2.o();
        oVar.f5960d = C2.c.f586b;
        Object o3 = this.f308d.o(new C0019c(this, oVar, interfaceC0022f), interfaceC0271d);
        return o3 == h2.a.f4407d ? o3 : C0174m.f3840a;
    }
}
