package t;

import d2.C0249t;
import java.util.List;
import l0.InterfaceC0360j;
import l0.InterfaceC0361k;
import n0.AbstractC0418L;

/* loaded from: classes.dex */
public final class i implements InterfaceC0361k {

    /* renamed from: a, reason: collision with root package name */
    public final P.d f6166a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6167b;

    public i(P.d dVar, boolean z3) {
        this.f6166a = dVar;
        this.f6167b = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f6166a.equals(iVar.f6166a) && this.f6167b == iVar.f6167b;
    }

    @Override // l0.InterfaceC0361k
    public final M1.j f(AbstractC0418L abstractC0418L, List list, long j3) {
        boolean isEmpty = list.isEmpty();
        C0249t c0249t = C0249t.f4256d;
        if (isEmpty) {
            return abstractC0418L.b0(G0.a.j(j3), G0.a.i(j3), c0249t, f.f6155e);
        }
        long a3 = this.f6167b ? j3 : G0.a.a(0, 0, j3);
        if (list.size() == 1) {
            InterfaceC0360j interfaceC0360j = (InterfaceC0360j) list.get(0);
            boolean z3 = interfaceC0360j.o() instanceof d;
            l0.o a4 = interfaceC0360j.a(a3);
            int max = Math.max(G0.a.j(j3), a4.f4927d);
            int max2 = Math.max(G0.a.i(j3), a4.f4928e);
            return abstractC0418L.b0(max, max2, c0249t, new g(a4, interfaceC0360j, abstractC0418L, max, max2, this));
        }
        l0.o[] oVarArr = new l0.o[list.size()];
        p2.n nVar = new p2.n();
        nVar.f5959d = G0.a.j(j3);
        p2.n nVar2 = new p2.n();
        nVar2.f5959d = G0.a.i(j3);
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC0360j interfaceC0360j2 = (InterfaceC0360j) list.get(i3);
            boolean z4 = interfaceC0360j2.o() instanceof d;
            l0.o a5 = interfaceC0360j2.a(a3);
            oVarArr[i3] = a5;
            nVar.f5959d = Math.max(nVar.f5959d, a5.f4927d);
            nVar2.f5959d = Math.max(nVar2.f5959d, a5.f4928e);
        }
        return abstractC0418L.b0(nVar.f5959d, nVar2.f5959d, c0249t, new h(oVarArr, list, abstractC0418L, nVar, nVar2, this));
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f6167b) + (this.f6166a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.f6166a + ", propagateMinConstraints=" + this.f6167b + ')';
    }
}
