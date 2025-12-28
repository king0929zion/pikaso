package z;

import c2.C0174m;
import g2.InterfaceC0271d;
import y2.AbstractC0688v;
import y2.InterfaceC0687u;

/* renamed from: z.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0710m extends i2.j implements o2.e {
    public /* synthetic */ Object h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0713p f6877i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0710m(C0713p c0713p, InterfaceC0271d interfaceC0271d) {
        super(2, interfaceC0271d);
        this.f6877i = c0713p;
    }

    @Override // i2.a
    public final InterfaceC0271d f(InterfaceC0271d interfaceC0271d, Object obj) {
        C0710m c0710m = new C0710m(this.f6877i, interfaceC0271d);
        c0710m.h = obj;
        return c0710m;
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        return ((C0710m) f((InterfaceC0271d) obj2, (InterfaceC0687u) obj)).l(C0174m.f3840a);
    }

    @Override // i2.a
    public final Object l(Object obj) {
        Z0.d.U(obj);
        InterfaceC0687u interfaceC0687u = (InterfaceC0687u) this.h;
        C0713p c0713p = this.f6877i;
        AbstractC0688v.l(interfaceC0687u, null, 0, new C0707j(c0713p, null), 3);
        AbstractC0688v.l(interfaceC0687u, null, 0, new C0708k(c0713p, null), 3);
        return AbstractC0688v.l(interfaceC0687u, null, 0, new C0709l(c0713p, null), 3);
    }
}
