package D;

import c2.C0174m;
import g2.InterfaceC0271d;
import y2.InterfaceC0687u;

/* loaded from: classes.dex */
public final class r0 extends i2.j implements o2.e {
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f849i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u0 f850j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ V f851k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(u0 u0Var, V v3, InterfaceC0271d interfaceC0271d) {
        super(2, interfaceC0271d);
        this.f850j = u0Var;
        this.f851k = v3;
    }

    @Override // i2.a
    public final InterfaceC0271d f(InterfaceC0271d interfaceC0271d, Object obj) {
        r0 r0Var = new r0(this.f850j, this.f851k, interfaceC0271d);
        r0Var.f849i = obj;
        return r0Var;
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        return ((r0) f((InterfaceC0271d) obj2, (InterfaceC0687u) obj)).l(C0174m.f3840a);
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
        InterfaceC0687u interfaceC0687u = (InterfaceC0687u) this.f849i;
        this.h = 1;
        this.f850j.a(interfaceC0687u, this.f851k, this);
        return aVar;
    }
}
