package A;

import c2.C0174m;
import g2.InterfaceC0271d;
import y2.InterfaceC0687u;

/* renamed from: A.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0004e extends i2.j implements o2.e {
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s.g f80i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ N.s f81j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0004e(s.g gVar, N.s sVar, InterfaceC0271d interfaceC0271d) {
        super(2, interfaceC0271d);
        this.f80i = gVar;
        this.f81j = sVar;
    }

    @Override // i2.a
    public final InterfaceC0271d f(InterfaceC0271d interfaceC0271d, Object obj) {
        return new C0004e(this.f80i, this.f81j, interfaceC0271d);
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        return ((C0004e) f((InterfaceC0271d) obj2, (InterfaceC0687u) obj)).l(C0174m.f3840a);
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
        B2.v vVar = this.f80i.f6116a;
        C0003d c0003d = new C0003d(0, this.f81j);
        this.h = 1;
        B2.v.i(vVar, c0003d, this);
        return aVar;
    }
}
