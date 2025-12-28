package C2;

import g2.InterfaceC0271d;
import g2.InterfaceC0276i;

/* loaded from: classes.dex */
public final class y implements InterfaceC0271d, i2.d {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0271d f625d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0276i f626e;

    public y(InterfaceC0271d interfaceC0271d, InterfaceC0276i interfaceC0276i) {
        this.f625d = interfaceC0271d;
        this.f626e = interfaceC0276i;
    }

    @Override // i2.d
    public final i2.d j() {
        InterfaceC0271d interfaceC0271d = this.f625d;
        if (interfaceC0271d instanceof i2.d) {
            return (i2.d) interfaceC0271d;
        }
        return null;
    }

    @Override // g2.InterfaceC0271d
    public final InterfaceC0276i o() {
        return this.f626e;
    }

    @Override // g2.InterfaceC0271d
    public final void t(Object obj) {
        this.f625d.t(obj);
    }
}
