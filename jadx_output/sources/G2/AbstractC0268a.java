package g2;

/* renamed from: g2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0268a implements InterfaceC0274g {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0275h f4327d;

    public AbstractC0268a(InterfaceC0275h interfaceC0275h) {
        this.f4327d = interfaceC0275h;
    }

    @Override // g2.InterfaceC0276i
    public InterfaceC0276i e(InterfaceC0275h interfaceC0275h) {
        return Z0.d.H(this, interfaceC0275h);
    }

    @Override // g2.InterfaceC0274g
    public final InterfaceC0275h getKey() {
        return this.f4327d;
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
    public InterfaceC0274g n(InterfaceC0275h interfaceC0275h) {
        return Z0.d.w(this, interfaceC0275h);
    }
}
