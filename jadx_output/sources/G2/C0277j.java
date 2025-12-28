package g2;

import java.io.Serializable;

/* renamed from: g2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0277j implements InterfaceC0276i, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final C0277j f4334d = new C0277j();

    @Override // g2.InterfaceC0276i
    public final InterfaceC0276i e(InterfaceC0275h interfaceC0275h) {
        p2.g.e(interfaceC0275h, "key");
        return this;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // g2.InterfaceC0276i
    public final InterfaceC0276i i(InterfaceC0276i interfaceC0276i) {
        p2.g.e(interfaceC0276i, "context");
        return interfaceC0276i;
    }

    @Override // g2.InterfaceC0276i
    public final Object l(Object obj, o2.e eVar) {
        return obj;
    }

    @Override // g2.InterfaceC0276i
    public final InterfaceC0274g n(InterfaceC0275h interfaceC0275h) {
        p2.g.e(interfaceC0275h, "key");
        return null;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }
}
