package o0;

import c2.C0174m;
import g2.InterfaceC0271d;
import y2.InterfaceC0687u;

/* loaded from: classes.dex */
public final class Z0 extends i2.j implements o2.e {
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b1 f5536i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z0(b1 b1Var, InterfaceC0271d interfaceC0271d) {
        super(2, interfaceC0271d);
        this.f5536i = b1Var;
    }

    @Override // i2.a
    public final InterfaceC0271d f(InterfaceC0271d interfaceC0271d, Object obj) {
        return new Z0(this.f5536i, interfaceC0271d);
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        return ((Z0) f((InterfaceC0271d) obj2, (InterfaceC0687u) obj)).l(C0174m.f3840a);
    }

    @Override // i2.a
    public final Object l(Object obj) {
        h2.a aVar = h2.a.f4407d;
        int i3 = this.h;
        C0174m c0174m = C0174m.f3840a;
        if (i3 == 0) {
            Z0.d.U(obj);
            C0507u c0507u = this.f5536i.f5551d;
            this.h = 1;
            Object e3 = c0507u.f5716q.e(this);
            if (e3 != aVar) {
                e3 = c0174m;
            }
            if (e3 == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Z0.d.U(obj);
        }
        return c0174m;
    }
}
