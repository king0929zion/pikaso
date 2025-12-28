package q;

import c2.C0174m;
import g2.InterfaceC0271d;
import y2.InterfaceC0687u;

/* loaded from: classes.dex */
public final class n extends i2.j implements o2.e {
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o f6026i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, InterfaceC0271d interfaceC0271d) {
        super(2, interfaceC0271d);
        this.f6026i = oVar;
    }

    @Override // i2.a
    public final InterfaceC0271d f(InterfaceC0271d interfaceC0271d, Object obj) {
        return new n(this.f6026i, interfaceC0271d);
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        return ((n) f((InterfaceC0271d) obj2, (InterfaceC0687u) obj)).l(C0174m.f3840a);
    }

    @Override // i2.a
    public final Object l(Object obj) {
        h2.a aVar = h2.a.f4407d;
        int i3 = this.h;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Z0.d.U(obj);
            return C0174m.f3840a;
        }
        Z0.d.U(obj);
        p2.n nVar = new p2.n();
        p2.n nVar2 = new p2.n();
        p2.n nVar3 = new p2.n();
        o oVar = this.f6026i;
        B2.v vVar = oVar.f6027q.f6116a;
        C2.l lVar = new C2.l(nVar, nVar2, nVar3, oVar, 1);
        this.h = 1;
        B2.v.i(vVar, lVar, this);
        return aVar;
    }
}
