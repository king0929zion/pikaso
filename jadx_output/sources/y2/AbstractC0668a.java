package y2;

import D2.AbstractC0071a;
import a.AbstractC0090a;
import c2.AbstractC0171j;
import c2.C0174m;
import g2.InterfaceC0271d;
import g2.InterfaceC0276i;
import p.AbstractC0537f;

/* renamed from: y2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0668a extends b0 implements InterfaceC0271d, InterfaceC0687u {

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0276i f6781f;

    public AbstractC0668a(InterfaceC0276i interfaceC0276i, boolean z3) {
        super(z3);
        P((S) interfaceC0276i.n(C0685s.f6818e));
        this.f6781f = interfaceC0276i.i(this);
    }

    @Override // y2.b0
    public final String D() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // y2.b0
    public final void O(B1.c cVar) {
        AbstractC0688v.h(this.f6781f, cVar);
    }

    @Override // y2.b0
    public final void U(Object obj) {
        if (!(obj instanceof C0680m)) {
            b0(obj);
            return;
        }
        C0680m c0680m = (C0680m) obj;
        Throwable th = c0680m.f6805a;
        c0680m.getClass();
        a0(th, C0680m.f6804b.get(c0680m) != 0);
    }

    public void a0(Throwable th, boolean z3) {
    }

    public void b0(Object obj) {
    }

    public final void c0(int i3, AbstractC0668a abstractC0668a, o2.e eVar) {
        int b3 = AbstractC0537f.b(i3);
        if (b3 == 0) {
            AbstractC0090a.g0(eVar, abstractC0668a, this);
            return;
        }
        if (b3 != 1) {
            if (b3 == 2) {
                p2.g.e(eVar, "<this>");
                Z.b.z(Z.b.n(abstractC0668a, this, eVar)).t(C0174m.f3840a);
                return;
            }
            if (b3 != 3) {
                throw new B1.c();
            }
            try {
                InterfaceC0276i interfaceC0276i = this.f6781f;
                Object m2 = AbstractC0071a.m(interfaceC0276i, null);
                try {
                    p2.r.c(2, eVar);
                    Object h = eVar.h(abstractC0668a, this);
                    if (h != h2.a.f4407d) {
                        t(h);
                    }
                } finally {
                    AbstractC0071a.g(interfaceC0276i, m2);
                }
            } catch (Throwable th) {
                t(Z0.d.q(th));
            }
        }
    }

    @Override // y2.InterfaceC0687u
    public final InterfaceC0276i m() {
        return this.f6781f;
    }

    @Override // g2.InterfaceC0271d
    public final InterfaceC0276i o() {
        return this.f6781f;
    }

    @Override // g2.InterfaceC0271d
    public final void t(Object obj) {
        Throwable a3 = AbstractC0171j.a(obj);
        if (a3 != null) {
            obj = new C0680m(a3, false);
        }
        Object R2 = R(obj);
        if (R2 == AbstractC0688v.f6823e) {
            return;
        }
        z(R2);
    }
}
