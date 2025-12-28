package r;

import D.C0065y;
import c2.C0174m;
import g2.InterfaceC0271d;
import g2.InterfaceC0276i;
import h0.r;
import y2.C0673f;
import y2.InterfaceC0687u;

/* loaded from: classes.dex */
public final class n extends i2.j implements o2.e {
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f6098i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r f6099j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ q.k f6100k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0065y f6101l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0580e f6102m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(r rVar, q.k kVar, C0065y c0065y, C0580e c0580e, InterfaceC0271d interfaceC0271d) {
        super(2, interfaceC0271d);
        this.f6099j = rVar;
        this.f6100k = kVar;
        this.f6101l = c0065y;
        this.f6102m = c0580e;
    }

    @Override // i2.a
    public final InterfaceC0271d f(InterfaceC0271d interfaceC0271d, Object obj) {
        C0065y c0065y = this.f6101l;
        C0580e c0580e = this.f6102m;
        n nVar = new n(this.f6099j, this.f6100k, c0065y, c0580e, interfaceC0271d);
        nVar.f6098i = obj;
        return nVar;
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        return ((n) f((InterfaceC0271d) obj2, (InterfaceC0687u) obj)).l(C0174m.f3840a);
    }

    @Override // i2.a
    public final Object l(Object obj) {
        h2.a aVar;
        Object obj2;
        h2.a aVar2 = h2.a.f4407d;
        int i3 = this.h;
        if (i3 == 0) {
            Z0.d.U(obj);
            m mVar = new m((InterfaceC0687u) this.f6098i, this.f6100k, this.f6101l, this.f6102m, null);
            this.h = 1;
            r rVar = this.f6099j;
            InterfaceC0276i interfaceC0276i = this.f4461e;
            p2.g.b(interfaceC0276i);
            C0577b c0577b = new C0577b(interfaceC0276i, mVar, null);
            rVar.getClass();
            C0673f c0673f = new C0673f(1, Z.b.z(this));
            c0673f.u();
            h0.p pVar = new h0.p(rVar, c0673f);
            synchronized (rVar.f4403w) {
                rVar.f4403w.b(pVar);
                InterfaceC0271d z3 = Z.b.z(Z.b.n(pVar, pVar, c0577b));
                aVar = h2.a.f4407d;
                g2.k kVar = new g2.k(z3);
                obj2 = C0174m.f3840a;
                kVar.t(obj2);
            }
            c0673f.x(new C0065y(12, pVar));
            Object s3 = c0673f.s();
            if (s3 == aVar) {
                obj2 = s3;
            }
            if (obj2 == aVar2) {
                return aVar2;
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
