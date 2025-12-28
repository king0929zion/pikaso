package q;

import D.C0065y;
import c2.C0174m;
import g2.InterfaceC0271d;
import r.C0580e;
import y2.AbstractC0688v;

/* renamed from: q.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0562i extends i2.j implements o2.e {
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f5993i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l f5994j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0562i(l lVar, InterfaceC0271d interfaceC0271d) {
        super(2, interfaceC0271d);
        this.f5994j = lVar;
    }

    @Override // i2.a
    public final InterfaceC0271d f(InterfaceC0271d interfaceC0271d, Object obj) {
        C0562i c0562i = new C0562i(this.f5994j, interfaceC0271d);
        c0562i.f5993i = obj;
        return c0562i;
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        return ((C0562i) f((InterfaceC0271d) obj2, (h0.r) obj)).l(C0174m.f3840a);
    }

    @Override // i2.a
    public final Object l(Object obj) {
        h2.a aVar = h2.a.f4407d;
        int i3 = this.h;
        C0174m c0174m = C0174m.f3840a;
        if (i3 == 0) {
            Z0.d.U(obj);
            h0.r rVar = (h0.r) this.f5993i;
            this.h = 1;
            l lVar = this.f5994j;
            lVar.getClass();
            k kVar = new k(lVar, null);
            C0065y c0065y = new C0065y(21, lVar);
            r.g gVar = r.p.f6106a;
            Object b3 = AbstractC0688v.b(new r.n(rVar, kVar, c0065y, new C0580e(rVar), null), this);
            if (b3 != aVar) {
                b3 = c0174m;
            }
            if (b3 != aVar) {
                b3 = c0174m;
            }
            if (b3 == aVar) {
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
