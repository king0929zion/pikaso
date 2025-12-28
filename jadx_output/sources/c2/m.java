package C2;

import B2.InterfaceC0021e;
import B2.InterfaceC0022f;
import c2.C0174m;
import g2.InterfaceC0271d;
import y2.InterfaceC0687u;

/* loaded from: classes.dex */
public final class m extends i2.j implements o2.e {
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f609i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n f610j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0022f f611k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, InterfaceC0022f interfaceC0022f, InterfaceC0271d interfaceC0271d) {
        super(2, interfaceC0271d);
        this.f610j = nVar;
        this.f611k = interfaceC0022f;
    }

    @Override // i2.a
    public final InterfaceC0271d f(InterfaceC0271d interfaceC0271d, Object obj) {
        m mVar = new m(this.f610j, this.f611k, interfaceC0271d);
        mVar.f609i = obj;
        return mVar;
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        return ((m) f((InterfaceC0271d) obj2, (InterfaceC0687u) obj)).l(C0174m.f3840a);
    }

    @Override // i2.a
    public final Object l(Object obj) {
        h2.a aVar = h2.a.f4407d;
        int i3 = this.h;
        if (i3 == 0) {
            Z0.d.U(obj);
            InterfaceC0687u interfaceC0687u = (InterfaceC0687u) this.f609i;
            p2.o oVar = new p2.o();
            n nVar = this.f610j;
            InterfaceC0021e interfaceC0021e = nVar.f597g;
            l lVar = new l(oVar, interfaceC0687u, nVar, this.f611k, 0);
            this.h = 1;
            if (interfaceC0021e.o(lVar, this) == aVar) {
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
