package D2;

import g2.InterfaceC0271d;
import g2.InterfaceC0276i;
import y2.AbstractC0668a;
import y2.AbstractC0688v;

/* loaded from: classes.dex */
public class t extends AbstractC0668a implements i2.d {

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0271d f1083g;

    public t(InterfaceC0271d interfaceC0271d, InterfaceC0276i interfaceC0276i) {
        super(interfaceC0276i, true);
        this.f1083g = interfaceC0271d;
    }

    @Override // y2.b0
    public final boolean Q() {
        return true;
    }

    @Override // i2.d
    public final i2.d j() {
        InterfaceC0271d interfaceC0271d = this.f1083g;
        if (interfaceC0271d instanceof i2.d) {
            return (i2.d) interfaceC0271d;
        }
        return null;
    }

    @Override // y2.b0
    public void y(Object obj) {
        AbstractC0071a.h(Z.b.z(this.f1083g), AbstractC0688v.m(obj), null);
    }

    @Override // y2.b0
    public void z(Object obj) {
        this.f1083g.t(AbstractC0688v.m(obj));
    }
}
