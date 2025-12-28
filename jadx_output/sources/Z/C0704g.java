package z;

import c2.C0174m;
import g2.InterfaceC0271d;
import y2.InterfaceC0687u;

/* renamed from: z.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0704g extends i2.j implements o2.e {
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f6864i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s.g f6865j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0698a f6866k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0704g(s.g gVar, C0698a c0698a, InterfaceC0271d interfaceC0271d) {
        super(2, interfaceC0271d);
        this.f6865j = gVar;
        this.f6866k = c0698a;
    }

    @Override // i2.a
    public final InterfaceC0271d f(InterfaceC0271d interfaceC0271d, Object obj) {
        C0704g c0704g = new C0704g(this.f6865j, this.f6866k, interfaceC0271d);
        c0704g.f6864i = obj;
        return c0704g;
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        return ((C0704g) f((InterfaceC0271d) obj2, (InterfaceC0687u) obj)).l(C0174m.f3840a);
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
        InterfaceC0687u interfaceC0687u = (InterfaceC0687u) this.f6864i;
        B2.v vVar = this.f6865j.f6116a;
        B2.n nVar = new B2.n(this.f6866k, interfaceC0687u, 1);
        this.h = 1;
        B2.v.i(vVar, nVar, this);
        return aVar;
    }
}
