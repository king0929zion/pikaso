package y2;

import g2.InterfaceC0274g;
import g2.InterfaceC0275h;
import g2.InterfaceC0276i;

/* loaded from: classes.dex */
public final class o0 implements InterfaceC0274g, InterfaceC0275h {

    /* renamed from: d, reason: collision with root package name */
    public static final o0 f6812d = new o0();

    @Override // g2.InterfaceC0276i
    public final InterfaceC0276i e(InterfaceC0275h interfaceC0275h) {
        return Z0.d.H(this, interfaceC0275h);
    }

    @Override // g2.InterfaceC0274g
    public final InterfaceC0275h getKey() {
        return this;
    }

    @Override // g2.InterfaceC0276i
    public final InterfaceC0276i i(InterfaceC0276i interfaceC0276i) {
        return Z0.d.K(this, interfaceC0276i);
    }

    @Override // g2.InterfaceC0276i
    public final Object l(Object obj, o2.e eVar) {
        return eVar.h(obj, this);
    }

    @Override // g2.InterfaceC0276i
    public final InterfaceC0274g n(InterfaceC0275h interfaceC0275h) {
        return Z0.d.w(this, interfaceC0275h);
    }
}
