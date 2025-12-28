package C2;

import g2.InterfaceC0274g;
import g2.InterfaceC0275h;
import g2.InterfaceC0276i;

/* loaded from: classes.dex */
public final class p implements InterfaceC0276i {

    /* renamed from: d, reason: collision with root package name */
    public final Throwable f613d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0276i f614e;

    public p(InterfaceC0276i interfaceC0276i, Throwable th) {
        this.f613d = th;
        this.f614e = interfaceC0276i;
    }

    @Override // g2.InterfaceC0276i
    public final InterfaceC0276i e(InterfaceC0275h interfaceC0275h) {
        return this.f614e.e(interfaceC0275h);
    }

    @Override // g2.InterfaceC0276i
    public final InterfaceC0276i i(InterfaceC0276i interfaceC0276i) {
        return this.f614e.i(interfaceC0276i);
    }

    @Override // g2.InterfaceC0276i
    public final Object l(Object obj, o2.e eVar) {
        return this.f614e.l(obj, eVar);
    }

    @Override // g2.InterfaceC0276i
    public final InterfaceC0274g n(InterfaceC0275h interfaceC0275h) {
        return this.f614e.n(interfaceC0275h);
    }
}
