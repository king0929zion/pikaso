package g2;

import java.io.Serializable;

/* renamed from: g2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0270c implements InterfaceC0276i, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0276i f4331d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0274g f4332e;

    public C0270c(InterfaceC0274g interfaceC0274g, InterfaceC0276i interfaceC0276i) {
        p2.g.e(interfaceC0276i, "left");
        p2.g.e(interfaceC0274g, "element");
        this.f4331d = interfaceC0276i;
        this.f4332e = interfaceC0274g;
    }

    @Override // g2.InterfaceC0276i
    public final InterfaceC0276i e(InterfaceC0275h interfaceC0275h) {
        p2.g.e(interfaceC0275h, "key");
        InterfaceC0274g interfaceC0274g = this.f4332e;
        InterfaceC0274g n2 = interfaceC0274g.n(interfaceC0275h);
        InterfaceC0276i interfaceC0276i = this.f4331d;
        if (n2 != null) {
            return interfaceC0276i;
        }
        InterfaceC0276i e3 = interfaceC0276i.e(interfaceC0275h);
        return e3 == interfaceC0276i ? this : e3 == C0277j.f4334d ? interfaceC0274g : new C0270c(interfaceC0274g, e3);
    }

    public final boolean equals(Object obj) {
        boolean z3;
        if (this != obj) {
            if (!(obj instanceof C0270c)) {
                return false;
            }
            C0270c c0270c = (C0270c) obj;
            c0270c.getClass();
            int i3 = 2;
            C0270c c0270c2 = c0270c;
            int i4 = 2;
            while (true) {
                InterfaceC0276i interfaceC0276i = c0270c2.f4331d;
                c0270c2 = interfaceC0276i instanceof C0270c ? (C0270c) interfaceC0276i : null;
                if (c0270c2 == null) {
                    break;
                }
                i4++;
            }
            C0270c c0270c3 = this;
            while (true) {
                InterfaceC0276i interfaceC0276i2 = c0270c3.f4331d;
                c0270c3 = interfaceC0276i2 instanceof C0270c ? (C0270c) interfaceC0276i2 : null;
                if (c0270c3 == null) {
                    break;
                }
                i3++;
            }
            if (i4 != i3) {
                return false;
            }
            C0270c c0270c4 = this;
            while (true) {
                InterfaceC0274g interfaceC0274g = c0270c4.f4332e;
                if (!p2.g.a(c0270c.n(interfaceC0274g.getKey()), interfaceC0274g)) {
                    z3 = false;
                    break;
                }
                InterfaceC0276i interfaceC0276i3 = c0270c4.f4331d;
                if (!(interfaceC0276i3 instanceof C0270c)) {
                    p2.g.c(interfaceC0276i3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                    InterfaceC0274g interfaceC0274g2 = (InterfaceC0274g) interfaceC0276i3;
                    z3 = p2.g.a(c0270c.n(interfaceC0274g2.getKey()), interfaceC0274g2);
                    break;
                }
                c0270c4 = (C0270c) interfaceC0276i3;
            }
            if (!z3) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f4332e.hashCode() + this.f4331d.hashCode();
    }

    @Override // g2.InterfaceC0276i
    public final InterfaceC0276i i(InterfaceC0276i interfaceC0276i) {
        p2.g.e(interfaceC0276i, "context");
        return interfaceC0276i == C0277j.f4334d ? this : (InterfaceC0276i) interfaceC0276i.l(this, C0269b.f4329g);
    }

    @Override // g2.InterfaceC0276i
    public final Object l(Object obj, o2.e eVar) {
        return eVar.h(this.f4331d.l(obj, eVar), this.f4332e);
    }

    @Override // g2.InterfaceC0276i
    public final InterfaceC0274g n(InterfaceC0275h interfaceC0275h) {
        p2.g.e(interfaceC0275h, "key");
        C0270c c0270c = this;
        while (true) {
            InterfaceC0274g n2 = c0270c.f4332e.n(interfaceC0275h);
            if (n2 != null) {
                return n2;
            }
            InterfaceC0276i interfaceC0276i = c0270c.f4331d;
            if (!(interfaceC0276i instanceof C0270c)) {
                return interfaceC0276i.n(interfaceC0275h);
            }
            c0270c = (C0270c) interfaceC0276i;
        }
    }

    public final String toString() {
        return "[" + ((String) l("", C0269b.f4328f)) + ']';
    }
}
