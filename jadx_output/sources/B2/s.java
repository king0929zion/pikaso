package B2;

import g2.InterfaceC0271d;
import g2.InterfaceC0276i;

/* loaded from: classes.dex */
public final class s implements E, InterfaceC0021e, C2.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ G f345d;

    public s(G g3) {
        this.f345d = g3;
    }

    @Override // B2.E
    public final Object getValue() {
        return this.f345d.getValue();
    }

    @Override // C2.q
    public final InterfaceC0021e m(InterfaceC0276i interfaceC0276i, int i3, int i4) {
        return ((((i3 < 0 || i3 >= 2) && i3 != -2) || i4 != 2) && !((i3 == 0 || i3 == -3) && i4 == 1)) ? new C2.i(this, interfaceC0276i, i3, i4) : this;
    }

    @Override // B2.InterfaceC0021e
    public final Object o(InterfaceC0022f interfaceC0022f, InterfaceC0271d interfaceC0271d) {
        this.f345d.o(interfaceC0022f, interfaceC0271d);
        return h2.a.f4407d;
    }
}
