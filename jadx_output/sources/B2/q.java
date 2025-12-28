package B2;

import c2.C0174m;
import g2.InterfaceC0271d;

/* loaded from: classes.dex */
public final class q extends i2.j implements o2.e {
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f337i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0021e f338j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ G f339k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Float f340l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(InterfaceC0021e interfaceC0021e, G g3, Float f3, InterfaceC0271d interfaceC0271d) {
        super(2, interfaceC0271d);
        this.f338j = interfaceC0021e;
        this.f339k = g3;
        this.f340l = f3;
    }

    @Override // i2.a
    public final InterfaceC0271d f(InterfaceC0271d interfaceC0271d, Object obj) {
        q qVar = new q(this.f338j, this.f339k, this.f340l, interfaceC0271d);
        qVar.f337i = obj;
        return qVar;
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        return ((q) f((InterfaceC0271d) obj2, (y) obj)).l(C0174m.f3840a);
    }

    @Override // i2.a
    public final Object l(Object obj) {
        h2.a aVar = h2.a.f4407d;
        int i3 = this.h;
        if (i3 == 0) {
            Z0.d.U(obj);
            int ordinal = ((y) this.f337i).ordinal();
            G g3 = this.f339k;
            if (ordinal == 0) {
                this.h = 1;
                if (this.f338j.o(g3, this) == aVar) {
                    return aVar;
                }
            } else if (ordinal == 2) {
                D2.w wVar = w.f363a;
                Float f3 = this.f340l;
                if (f3 == wVar) {
                    throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
                }
                g3.g(null, f3);
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
