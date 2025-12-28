package z;

import c2.C0174m;
import g2.InterfaceC0271d;
import p.C0528G;
import p.C0535d;
import y2.InterfaceC0687u;

/* renamed from: z.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0695C extends i2.j implements o2.e {
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Z.a f6835i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0528G f6836j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0695C(Z.a aVar, C0528G c0528g, InterfaceC0271d interfaceC0271d) {
        super(2, interfaceC0271d);
        this.f6835i = aVar;
        this.f6836j = c0528g;
    }

    @Override // i2.a
    public final InterfaceC0271d f(InterfaceC0271d interfaceC0271d, Object obj) {
        return new C0695C(this.f6835i, this.f6836j, interfaceC0271d);
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        return ((C0695C) f((InterfaceC0271d) obj2, (InterfaceC0687u) obj)).l(C0174m.f3840a);
    }

    @Override // i2.a
    public final Object l(Object obj) {
        h2.a aVar = h2.a.f4407d;
        int i3 = this.h;
        if (i3 == 0) {
            Z0.d.U(obj);
            C0535d c0535d = (C0535d) this.f6835i.f2786c;
            Float f3 = new Float(0.0f);
            this.h = 1;
            if (C0535d.b(c0535d, f3, this.f6836j, this) == aVar) {
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
