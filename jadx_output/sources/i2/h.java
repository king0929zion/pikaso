package i2;

import g2.C0277j;
import g2.InterfaceC0271d;
import g2.InterfaceC0276i;

/* loaded from: classes.dex */
public abstract class h extends a {
    public h(InterfaceC0271d interfaceC0271d) {
        super(interfaceC0271d);
        if (interfaceC0271d != null && interfaceC0271d.o() != C0277j.f4334d) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // g2.InterfaceC0271d
    public final InterfaceC0276i o() {
        return C0277j.f4334d;
    }
}
