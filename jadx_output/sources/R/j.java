package r;

import c2.C0174m;
import g2.InterfaceC0271d;
import y2.InterfaceC0687u;

/* loaded from: classes.dex */
public final class j extends i2.j implements o2.e {
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q.k f6090i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0580e f6091j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ h0.k f6092k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(q.k kVar, C0580e c0580e, h0.k kVar2, InterfaceC0271d interfaceC0271d) {
        super(2, interfaceC0271d);
        this.f6090i = kVar;
        this.f6091j = c0580e;
        this.f6092k = kVar2;
    }

    @Override // i2.a
    public final InterfaceC0271d f(InterfaceC0271d interfaceC0271d, Object obj) {
        return new j(this.f6090i, this.f6091j, this.f6092k, interfaceC0271d);
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        return ((j) f((InterfaceC0271d) obj2, (InterfaceC0687u) obj)).l(C0174m.f3840a);
    }

    @Override // i2.a
    public final Object l(Object obj) {
        h2.a aVar = h2.a.f4407d;
        int i3 = this.h;
        C0174m c0174m = C0174m.f3840a;
        if (i3 == 0) {
            Z0.d.U(obj);
            long j3 = this.f6092k.f4366c;
            this.h = 1;
            q.k kVar = this.f6090i;
            C0580e c0580e = this.f6091j;
            q.k kVar2 = new q.k(kVar.f6005k, this);
            kVar2.f6003i = c0580e;
            kVar2.f6004j = j3;
            if (kVar2.l(c0174m) == aVar) {
                return aVar;
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
