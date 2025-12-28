package q;

import c2.C0174m;
import g2.InterfaceC0271d;
import y2.InterfaceC0687u;

/* renamed from: q.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0558e extends i2.j implements o2.e {
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l f5989i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s.i f5990j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0558e(l lVar, s.i iVar, InterfaceC0271d interfaceC0271d) {
        super(2, interfaceC0271d);
        this.f5989i = lVar;
        this.f5990j = iVar;
    }

    @Override // i2.a
    public final InterfaceC0271d f(InterfaceC0271d interfaceC0271d, Object obj) {
        return new C0558e(this.f5989i, this.f5990j, interfaceC0271d);
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        return ((C0558e) f((InterfaceC0271d) obj2, (InterfaceC0687u) obj)).l(C0174m.f3840a);
    }

    @Override // i2.a
    public final Object l(Object obj) {
        h2.a aVar = h2.a.f4407d;
        int i3 = this.h;
        if (i3 == 0) {
            Z0.d.U(obj);
            s.g gVar = this.f5989i.f6016s;
            if (gVar != null) {
                this.h = 1;
                if (gVar.a(this.f5990j, this) == aVar) {
                    return aVar;
                }
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
