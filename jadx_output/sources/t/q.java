package t;

import a.AbstractC0090a;
import d2.C0249t;
import l0.InterfaceC0360j;
import n0.AbstractC0418L;
import n0.InterfaceC0437s;

/* loaded from: classes.dex */
public final class q extends P.k implements InterfaceC0437s {

    /* renamed from: q, reason: collision with root package name */
    public p f6186q;

    @Override // n0.InterfaceC0437s
    public final M1.j R(AbstractC0418L abstractC0418L, InterfaceC0360j interfaceC0360j, long j3) {
        p pVar = this.f6186q;
        G0.f layoutDirection = abstractC0418L.getLayoutDirection();
        G0.f fVar = G0.f.f1258d;
        float f3 = layoutDirection == fVar ? pVar.f6182a : pVar.f6184c;
        float f4 = 0;
        if (Float.compare(f3, f4) >= 0 && Float.compare(this.f6186q.f6183b, f4) >= 0) {
            p pVar2 = this.f6186q;
            if (Float.compare(abstractC0418L.getLayoutDirection() == fVar ? pVar2.f6184c : pVar2.f6182a, f4) >= 0 && Float.compare(this.f6186q.f6185d, f4) >= 0) {
                p pVar3 = this.f6186q;
                int b3 = abstractC0418L.b(abstractC0418L.getLayoutDirection() == fVar ? pVar3.f6182a : pVar3.f6184c);
                p pVar4 = this.f6186q;
                int b4 = abstractC0418L.b(abstractC0418L.getLayoutDirection() == fVar ? pVar4.f6184c : pVar4.f6182a) + b3;
                int b5 = abstractC0418L.b(this.f6186q.f6185d) + abstractC0418L.b(this.f6186q.f6183b);
                l0.o a3 = interfaceC0360j.a(AbstractC0090a.V(-b4, -b5, j3));
                return abstractC0418L.b0(AbstractC0090a.p(j3, a3.f4927d + b4), AbstractC0090a.o(j3, a3.f4928e + b5), C0249t.f4256d, new D2.p(a3, abstractC0418L, this, 4));
            }
        }
        throw new IllegalArgumentException("Padding must be non-negative");
    }
}
