package C2;

import B2.InterfaceC0022f;
import c2.C0174m;
import g2.InterfaceC0271d;

/* loaded from: classes.dex */
public final class g extends i2.j implements o2.e {
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f592i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h f593j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, InterfaceC0271d interfaceC0271d) {
        super(2, interfaceC0271d);
        this.f593j = hVar;
    }

    @Override // i2.a
    public final InterfaceC0271d f(InterfaceC0271d interfaceC0271d, Object obj) {
        g gVar = new g(this.f593j, interfaceC0271d);
        gVar.f592i = obj;
        return gVar;
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        return ((g) f((InterfaceC0271d) obj2, (InterfaceC0022f) obj)).l(C0174m.f3840a);
    }

    @Override // i2.a
    public final Object l(Object obj) {
        h2.a aVar = h2.a.f4407d;
        int i3 = this.h;
        if (i3 == 0) {
            Z0.d.U(obj);
            InterfaceC0022f interfaceC0022f = (InterfaceC0022f) this.f592i;
            this.h = 1;
            if (this.f593j.c(interfaceC0022f, this) == aVar) {
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
