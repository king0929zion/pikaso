package C2;

import B2.InterfaceC0022f;
import c2.C0174m;
import g2.InterfaceC0271d;

/* loaded from: classes.dex */
public final class x implements InterfaceC0022f {

    /* renamed from: d, reason: collision with root package name */
    public final A2.q f624d;

    public x(A2.q qVar) {
        this.f624d = qVar;
    }

    @Override // B2.InterfaceC0022f
    public final Object b(Object obj, InterfaceC0271d interfaceC0271d) {
        Object p3 = this.f624d.p(interfaceC0271d, obj);
        return p3 == h2.a.f4407d ? p3 : C0174m.f3840a;
    }
}
