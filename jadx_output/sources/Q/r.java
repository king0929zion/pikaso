package q;

import c2.C0174m;
import g2.InterfaceC0271d;
import y2.InterfaceC0687u;

/* loaded from: classes.dex */
public final class r extends i2.j implements o2.e {
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s.g f6032i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s.f f6033j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ y2.C f6034k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s.g gVar, s.f fVar, y2.C c3, InterfaceC0271d interfaceC0271d) {
        super(2, interfaceC0271d);
        this.f6032i = gVar;
        this.f6033j = fVar;
        this.f6034k = c3;
    }

    @Override // i2.a
    public final InterfaceC0271d f(InterfaceC0271d interfaceC0271d, Object obj) {
        return new r(this.f6032i, this.f6033j, this.f6034k, interfaceC0271d);
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        return ((r) f((InterfaceC0271d) obj2, (InterfaceC0687u) obj)).l(C0174m.f3840a);
    }

    @Override // i2.a
    public final Object l(Object obj) {
        h2.a aVar = h2.a.f4407d;
        int i3 = this.h;
        if (i3 == 0) {
            Z0.d.U(obj);
            this.h = 1;
            if (this.f6032i.a(this.f6033j, this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Z0.d.U(obj);
        }
        y2.C c3 = this.f6034k;
        if (c3 != null) {
            c3.d();
        }
        return C0174m.f3840a;
    }
}
