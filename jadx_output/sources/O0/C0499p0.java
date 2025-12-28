package o0;

import D.AbstractC0028b;
import D.C0031c0;
import g2.InterfaceC0274g;
import g2.InterfaceC0275h;
import g2.InterfaceC0276i;

/* renamed from: o0.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0499p0 implements InterfaceC0274g {

    /* renamed from: d, reason: collision with root package name */
    public final C0031c0 f5638d;

    public C0499p0() {
        int i3 = AbstractC0028b.f737b;
        this.f5638d = new C0031c0(1.0f);
    }

    @Override // g2.InterfaceC0276i
    public final InterfaceC0276i e(InterfaceC0275h interfaceC0275h) {
        return Z0.d.H(this, interfaceC0275h);
    }

    @Override // g2.InterfaceC0274g
    public InterfaceC0275h getKey() {
        return P.a.f2077q;
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
