package y2;

import g2.InterfaceC0271d;

/* loaded from: classes.dex */
public final class X extends C0673f {

    /* renamed from: l, reason: collision with root package name */
    public final C0678k f6773l;

    public X(InterfaceC0271d interfaceC0271d, C0678k c0678k) {
        super(1, interfaceC0271d);
        this.f6773l = c0678k;
    }

    @Override // y2.C0673f
    public final String B() {
        return "AwaitContinuation";
    }

    @Override // y2.C0673f
    public final Throwable r(b0 b0Var) {
        Throwable c3;
        Object M2 = this.f6773l.M();
        return (!(M2 instanceof Z) || (c3 = ((Z) M2).c()) == null) ? M2 instanceof C0680m ? ((C0680m) M2).f6805a : b0Var.f() : c3;
    }
}
