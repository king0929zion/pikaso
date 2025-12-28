package o0;

import A.C0003d;
import c2.C0174m;
import g2.InterfaceC0271d;
import y2.InterfaceC0687u;

/* loaded from: classes.dex */
public final class T0 extends i2.j implements o2.e {
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ B2.E f5500i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0499p0 f5501j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T0(B2.E e3, C0499p0 c0499p0, InterfaceC0271d interfaceC0271d) {
        super(2, interfaceC0271d);
        this.f5500i = e3;
        this.f5501j = c0499p0;
    }

    @Override // i2.a
    public final InterfaceC0271d f(InterfaceC0271d interfaceC0271d, Object obj) {
        return new T0(this.f5500i, this.f5501j, interfaceC0271d);
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        ((T0) f((InterfaceC0271d) obj2, (InterfaceC0687u) obj)).l(C0174m.f3840a);
        return h2.a.f4407d;
    }

    @Override // i2.a
    public final Object l(Object obj) {
        h2.a aVar = h2.a.f4407d;
        int i3 = this.h;
        if (i3 == 0) {
            Z0.d.U(obj);
            C0003d c0003d = new C0003d(1, this.f5501j);
            this.h = 1;
            if (this.f5500i.o(c0003d, this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Z0.d.U(obj);
        }
        throw new B1.c();
    }
}
