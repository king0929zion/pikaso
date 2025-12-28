package q;

import c2.C0174m;
import g2.InterfaceC0271d;
import y2.InterfaceC0687u;

/* renamed from: q.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0555b extends i2.j implements o2.e {
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s.g f5977i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s.e f5978j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0555b(s.g gVar, s.e eVar, InterfaceC0271d interfaceC0271d) {
        super(2, interfaceC0271d);
        this.f5977i = gVar;
        this.f5978j = eVar;
    }

    @Override // i2.a
    public final InterfaceC0271d f(InterfaceC0271d interfaceC0271d, Object obj) {
        return new C0555b(this.f5977i, this.f5978j, interfaceC0271d);
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        return ((C0555b) f((InterfaceC0271d) obj2, (InterfaceC0687u) obj)).l(C0174m.f3840a);
    }

    @Override // i2.a
    public final Object l(Object obj) {
        h2.a aVar = h2.a.f4407d;
        int i3 = this.h;
        if (i3 == 0) {
            Z0.d.U(obj);
            this.h = 1;
            if (this.f5977i.a(this.f5978j, this) == aVar) {
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
