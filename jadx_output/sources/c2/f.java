package C2;

import c2.C0174m;
import g2.InterfaceC0271d;

/* loaded from: classes.dex */
public final class f extends i2.j implements o2.e {
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f590i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h f591j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, InterfaceC0271d interfaceC0271d) {
        super(2, interfaceC0271d);
        this.f591j = hVar;
    }

    @Override // i2.a
    public final InterfaceC0271d f(InterfaceC0271d interfaceC0271d, Object obj) {
        f fVar = new f(this.f591j, interfaceC0271d);
        fVar.f590i = obj;
        return fVar;
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        return ((f) f((InterfaceC0271d) obj2, (A2.o) obj)).l(C0174m.f3840a);
    }

    @Override // i2.a
    public final Object l(Object obj) {
        h2.a aVar = h2.a.f4407d;
        int i3 = this.h;
        C0174m c0174m = C0174m.f3840a;
        if (i3 == 0) {
            Z0.d.U(obj);
            A2.o oVar = (A2.o) this.f590i;
            this.h = 1;
            h hVar = this.f591j;
            hVar.getClass();
            Object c3 = hVar.c(new x(oVar), this);
            if (c3 != aVar) {
                c3 = c0174m;
            }
            if (c3 == aVar) {
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
