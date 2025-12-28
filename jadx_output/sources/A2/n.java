package A2;

import c2.C0174m;
import g2.InterfaceC0271d;
import g2.InterfaceC0276i;
import java.util.concurrent.CancellationException;
import y2.AbstractC0668a;
import y2.AbstractC0688v;
import y2.C0680m;
import y2.T;
import y2.Z;

/* loaded from: classes.dex */
public final class n extends AbstractC0668a implements o, f {

    /* renamed from: g, reason: collision with root package name */
    public final b f260g;

    public n(InterfaceC0276i interfaceC0276i, b bVar) {
        super(interfaceC0276i, true);
        this.f260g = bVar;
    }

    @Override // y2.b0
    public final void B(CancellationException cancellationException) {
        this.f260g.g(cancellationException, true);
        A(cancellationException);
    }

    @Override // y2.b0, y2.S, A2.p
    public final void a(CancellationException cancellationException) {
        Object M2 = M();
        if (M2 instanceof C0680m) {
            return;
        }
        if ((M2 instanceof Z) && ((Z) M2).d()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new T(D(), null, this);
        }
        B(cancellationException);
    }

    @Override // y2.AbstractC0668a
    public final void a0(Throwable th, boolean z3) {
        if (this.f260g.g(th, false) || z3) {
            return;
        }
        AbstractC0688v.h(this.f6781f, th);
    }

    @Override // y2.AbstractC0668a
    public final void b0(Object obj) {
        this.f260g.g(null, false);
    }

    @Override // A2.q
    public final Object c(Object obj) {
        return this.f260g.c(C0174m.f3840a);
    }

    @Override // A2.q
    public final Object p(InterfaceC0271d interfaceC0271d, Object obj) {
        return this.f260g.p(interfaceC0271d, obj);
    }
}
