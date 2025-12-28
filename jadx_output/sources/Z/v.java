package z;

import c2.C0174m;
import g2.InterfaceC0271d;
import y2.InterfaceC0687u;

/* loaded from: classes.dex */
public final class v extends i2.j implements o2.e {
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f6902i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ w f6903j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, InterfaceC0271d interfaceC0271d) {
        super(2, interfaceC0271d);
        this.f6903j = wVar;
    }

    @Override // i2.a
    public final InterfaceC0271d f(InterfaceC0271d interfaceC0271d, Object obj) {
        v vVar = new v(this.f6903j, interfaceC0271d);
        vVar.f6902i = obj;
        return vVar;
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        return ((v) f((InterfaceC0271d) obj2, (InterfaceC0687u) obj)).l(C0174m.f3840a);
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
        InterfaceC0687u interfaceC0687u = (InterfaceC0687u) this.f6902i;
        w wVar = this.f6903j;
        B2.v vVar = wVar.f6904q.f6116a;
        B2.n nVar = new B2.n(wVar, interfaceC0687u, 2);
        this.h = 1;
        B2.v.i(vVar, nVar, this);
        return aVar;
    }
}
