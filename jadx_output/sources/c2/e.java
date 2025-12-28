package C2;

import B2.InterfaceC0022f;
import c2.C0174m;
import g2.C0272e;
import g2.InterfaceC0271d;
import g2.InterfaceC0276i;
import y2.AbstractC0688v;
import y2.B;
import y2.InterfaceC0687u;

/* loaded from: classes.dex */
public final class e extends i2.j implements o2.e {
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f587i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0022f f588j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ h f589k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(InterfaceC0022f interfaceC0022f, h hVar, InterfaceC0271d interfaceC0271d) {
        super(2, interfaceC0271d);
        this.f588j = interfaceC0022f;
        this.f589k = hVar;
    }

    @Override // i2.a
    public final InterfaceC0271d f(InterfaceC0271d interfaceC0271d, Object obj) {
        e eVar = new e(this.f588j, this.f589k, interfaceC0271d);
        eVar.f587i = obj;
        return eVar;
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        return ((e) f((InterfaceC0271d) obj2, (InterfaceC0687u) obj)).l(C0174m.f3840a);
    }

    @Override // i2.a
    public final Object l(Object obj) {
        h2.a aVar = h2.a.f4407d;
        int i3 = this.h;
        C0174m c0174m = C0174m.f3840a;
        if (i3 == 0) {
            Z0.d.U(obj);
            InterfaceC0687u interfaceC0687u = (InterfaceC0687u) this.f587i;
            h hVar = this.f589k;
            int i4 = hVar.f595e;
            if (i4 == -3) {
                i4 = -2;
            }
            o2.e fVar = new f(hVar, null);
            A2.b a3 = A2.i.a(i4, hVar.f596f, 4);
            InterfaceC0276i e3 = AbstractC0688v.e(interfaceC0687u.m(), hVar.f594d, true);
            F2.d dVar = B.f6749a;
            if (e3 != dVar && e3.n(C0272e.f4333d) == null) {
                e3 = e3.i(dVar);
            }
            A2.n nVar = new A2.n(e3, a3);
            nVar.c0(3, nVar, fVar);
            this.h = 1;
            Object c3 = B2.w.c(this.f588j, nVar, true, this);
            if (c3 != aVar) {
                c3 = c0174m;
            }
            if (c3 == aVar) {
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
