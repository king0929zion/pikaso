package y2;

import D2.AbstractC0071a;
import c2.C0174m;
import g2.InterfaceC0271d;
import g2.InterfaceC0276i;

/* loaded from: classes.dex */
public final class c0 extends h0 {

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0271d f6790g;

    public c0(InterfaceC0276i interfaceC0276i, o2.e eVar) {
        super(interfaceC0276i, false);
        this.f6790g = Z.b.n(this, this, eVar);
    }

    @Override // y2.b0
    public final void V() {
        try {
            AbstractC0071a.h(Z.b.z(this.f6790g), C0174m.f3840a, null);
        } catch (Throwable th) {
            t(Z0.d.q(th));
            throw th;
        }
    }
}
