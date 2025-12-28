package B2;

import c2.C0174m;
import g2.InterfaceC0271d;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class k extends i2.j implements o2.f {
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ InterfaceC0022f f322i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f323j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ q f324k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(q qVar, InterfaceC0271d interfaceC0271d) {
        super(3, interfaceC0271d);
        this.f324k = qVar;
    }

    @Override // o2.f
    public final Object a(Object obj, Object obj2, Serializable serializable) {
        k kVar = new k(this.f324k, (InterfaceC0271d) serializable);
        kVar.f322i = (InterfaceC0022f) obj;
        kVar.f323j = obj2;
        return kVar.l(C0174m.f3840a);
    }

    @Override // i2.a
    public final Object l(Object obj) {
        InterfaceC0022f interfaceC0022f;
        h2.a aVar = h2.a.f4407d;
        int i3 = this.h;
        if (i3 == 0) {
            Z0.d.U(obj);
            interfaceC0022f = this.f322i;
            Object obj2 = this.f323j;
            this.f322i = interfaceC0022f;
            this.h = 1;
            obj = this.f324k.h(obj2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Z0.d.U(obj);
                return C0174m.f3840a;
            }
            interfaceC0022f = this.f322i;
            Z0.d.U(obj);
        }
        this.f322i = null;
        this.h = 2;
        if (interfaceC0022f.b(obj, this) == aVar) {
            return aVar;
        }
        return C0174m.f3840a;
    }
}
