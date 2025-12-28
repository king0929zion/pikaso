package y2;

import g2.AbstractC0268a;
import g2.C0272e;
import g2.C0277j;
import g2.InterfaceC0273f;
import g2.InterfaceC0274g;
import g2.InterfaceC0275h;
import g2.InterfaceC0276i;

/* loaded from: classes.dex */
public abstract class r extends AbstractC0268a implements InterfaceC0273f {

    /* renamed from: e, reason: collision with root package name */
    public static final C0684q f6816e = new C0684q(C0272e.f4333d, C0683p.f6813e);

    public r() {
        super(C0272e.f4333d);
    }

    public abstract void d(InterfaceC0276i interfaceC0276i, Runnable runnable);

    /* JADX WARN: Type inference failed for: r4v2, types: [o2.c, p2.h] */
    @Override // g2.AbstractC0268a, g2.InterfaceC0276i
    public final InterfaceC0276i e(InterfaceC0275h interfaceC0275h) {
        p2.g.e(interfaceC0275h, "key");
        boolean z3 = interfaceC0275h instanceof C0684q;
        C0277j c0277j = C0277j.f4334d;
        if (z3) {
            C0684q c0684q = (C0684q) interfaceC0275h;
            InterfaceC0275h interfaceC0275h2 = this.f4327d;
            if ((interfaceC0275h2 == c0684q || c0684q.f6815e == interfaceC0275h2) && ((InterfaceC0274g) c0684q.f6814d.i(this)) != null) {
                return c0277j;
            }
        } else if (C0272e.f4333d == interfaceC0275h) {
            return c0277j;
        }
        return this;
    }

    public boolean g() {
        return !(this instanceof m0);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [o2.c, p2.h] */
    @Override // g2.AbstractC0268a, g2.InterfaceC0276i
    public final InterfaceC0274g n(InterfaceC0275h interfaceC0275h) {
        InterfaceC0274g interfaceC0274g;
        p2.g.e(interfaceC0275h, "key");
        if (!(interfaceC0275h instanceof C0684q)) {
            if (C0272e.f4333d == interfaceC0275h) {
                return this;
            }
            return null;
        }
        C0684q c0684q = (C0684q) interfaceC0275h;
        InterfaceC0275h interfaceC0275h2 = this.f4327d;
        if ((interfaceC0275h2 == c0684q || c0684q.f6815e == interfaceC0275h2) && (interfaceC0274g = (InterfaceC0274g) c0684q.f6814d.i(this)) != null) {
            return interfaceC0274g;
        }
        return null;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0688v.f(this);
    }
}
