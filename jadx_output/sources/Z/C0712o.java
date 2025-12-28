package z;

import c2.C0174m;
import g2.InterfaceC0271d;
import y2.AbstractC0688v;
import y2.InterfaceC0687u;

/* renamed from: z.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0712o extends i2.j implements o2.e {
    public /* synthetic */ Object h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0713p f6879i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0712o(C0713p c0713p, InterfaceC0271d interfaceC0271d) {
        super(2, interfaceC0271d);
        this.f6879i = c0713p;
    }

    @Override // i2.a
    public final InterfaceC0271d f(InterfaceC0271d interfaceC0271d, Object obj) {
        C0712o c0712o = new C0712o(this.f6879i, interfaceC0271d);
        c0712o.h = obj;
        return c0712o;
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        return ((C0712o) f((InterfaceC0271d) obj2, (InterfaceC0687u) obj)).l(C0174m.f3840a);
    }

    @Override // i2.a
    public final Object l(Object obj) {
        Z0.d.U(obj);
        return AbstractC0688v.l((InterfaceC0687u) this.h, null, 0, new C0711n(this.f6879i, null), 3);
    }
}
