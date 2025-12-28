package D;

import c2.C0174m;
import g2.InterfaceC0271d;
import y2.AbstractC0688v;
import y2.InterfaceC0687u;

/* loaded from: classes.dex */
public final class y0 extends i2.j implements o2.e {
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o2.c f932i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(o2.c cVar, InterfaceC0271d interfaceC0271d) {
        super(2, interfaceC0271d);
        this.f932i = cVar;
    }

    @Override // i2.a
    public final InterfaceC0271d f(InterfaceC0271d interfaceC0271d, Object obj) {
        return new y0(this.f932i, interfaceC0271d);
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        return ((y0) f((InterfaceC0271d) obj2, (InterfaceC0687u) obj)).l(C0174m.f3840a);
    }

    @Override // i2.a
    public final Object l(Object obj) {
        h2.a aVar = h2.a.f4407d;
        int i3 = this.h;
        if (i3 == 0) {
            Z0.d.U(obj);
            this.h = 1;
            if (AbstractC0688v.c(16L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Z0.d.U(obj);
        }
        return this.f932i.i(new Long(System.nanoTime()));
    }
}
