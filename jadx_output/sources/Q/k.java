package q;

import c2.C0174m;
import g2.InterfaceC0271d;
import java.io.Serializable;
import r.C0580e;
import y2.AbstractC0688v;

/* loaded from: classes.dex */
public final class k extends i2.j implements o2.f {
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ C0580e f6003i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ long f6004j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ l f6005k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, InterfaceC0271d interfaceC0271d) {
        super(3, interfaceC0271d);
        this.f6005k = lVar;
    }

    @Override // o2.f
    public final Object a(Object obj, Object obj2, Serializable serializable) {
        long j3 = ((V.c) obj2).f2444a;
        k kVar = new k(this.f6005k, (InterfaceC0271d) serializable);
        kVar.f6003i = (C0580e) obj;
        kVar.f6004j = j3;
        return kVar.l(C0174m.f3840a);
    }

    @Override // i2.a
    public final Object l(Object obj) {
        Object obj2;
        h2.a aVar = h2.a.f4407d;
        int i3 = this.h;
        C0174m c0174m = C0174m.f3840a;
        if (i3 == 0) {
            Z0.d.U(obj);
            C0580e c0580e = this.f6003i;
            long j3 = this.f6004j;
            l lVar = this.f6005k;
            if (lVar.f6020w) {
                this.h = 1;
                s.g gVar = lVar.f6016s;
                if (gVar == null || (obj2 = AbstractC0688v.b(new C0557d(c0580e, j3, gVar, lVar, null), this)) != aVar) {
                    obj2 = c0174m;
                }
                if (obj2 == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Z0.d.U(obj);
        }
        return c0174m;
    }
}
