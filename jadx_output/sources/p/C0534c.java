package p;

import c2.C0174m;
import g2.InterfaceC0271d;

/* renamed from: p.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0534c extends i2.j implements o2.c {
    public final /* synthetic */ C0535d h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ G0.e f5866i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0534c(C0535d c0535d, G0.e eVar, InterfaceC0271d interfaceC0271d) {
        super(1, interfaceC0271d);
        this.h = c0535d;
        this.f5866i = eVar;
    }

    @Override // o2.c
    public final Object i(Object obj) {
        G0.e eVar = this.f5866i;
        C0534c c0534c = new C0534c(this.h, eVar, (InterfaceC0271d) obj);
        C0174m c0174m = C0174m.f3840a;
        c0534c.l(c0174m);
        return c0174m;
    }

    @Override // i2.a
    public final Object l(Object obj) {
        Z0.d.U(obj);
        C0535d c0535d = this.h;
        C0540i c0540i = c0535d.f5869c;
        c0540i.f5893f.d();
        c0540i.f5894g = Long.MIN_VALUE;
        c0535d.f5870d.setValue(Boolean.FALSE);
        Object a3 = C0535d.a(c0535d, this.f5866i);
        c0535d.f5869c.f5892e.setValue(a3);
        c0535d.f5871e.setValue(a3);
        return C0174m.f3840a;
    }
}
