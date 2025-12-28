package C2;

import B2.InterfaceC0022f;
import c2.C0174m;
import g2.InterfaceC0271d;

/* loaded from: classes.dex */
public final class A extends i2.j implements o2.e {
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f578i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0022f f579j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(InterfaceC0022f interfaceC0022f, InterfaceC0271d interfaceC0271d) {
        super(2, interfaceC0271d);
        this.f579j = interfaceC0022f;
    }

    @Override // i2.a
    public final InterfaceC0271d f(InterfaceC0271d interfaceC0271d, Object obj) {
        A a3 = new A(this.f579j, interfaceC0271d);
        a3.f578i = obj;
        return a3;
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        return ((A) f((InterfaceC0271d) obj2, obj)).l(C0174m.f3840a);
    }

    @Override // i2.a
    public final Object l(Object obj) {
        h2.a aVar = h2.a.f4407d;
        int i3 = this.h;
        if (i3 == 0) {
            Z0.d.U(obj);
            Object obj2 = this.f578i;
            this.h = 1;
            if (this.f579j.b(obj2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Z0.d.U(obj);
        }
        return C0174m.f3840a;
    }
}
