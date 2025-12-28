package t;

import D.C;
import a.AbstractC0090a;
import d2.C0249t;
import java.util.List;
import l0.InterfaceC0361k;
import n0.AbstractC0418L;

/* loaded from: classes.dex */
public final class t implements InterfaceC0361k, r {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0597b f6188a;

    /* renamed from: b, reason: collision with root package name */
    public final P.c f6189b;

    public t(InterfaceC0597b interfaceC0597b, P.c cVar) {
        this.f6188a = interfaceC0597b;
        this.f6189b = cVar;
    }

    @Override // t.r
    public final M1.j a(l0.o[] oVarArr, AbstractC0418L abstractC0418L, int[] iArr, int i3, int i4) {
        return abstractC0418L.b0(i3, i4, C0249t.f4256d, new C(oVarArr, this, i4, iArr));
    }

    @Override // t.r
    public final long b(int i3, int i4, boolean z3) {
        if (!z3) {
            return AbstractC0090a.a(0, i3, 0, i4);
        }
        int min = Math.min(0, 262142);
        int min2 = i3 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i3, 262142);
        int h = AbstractC0090a.h(min2 == Integer.MAX_VALUE ? min : min2);
        return AbstractC0090a.a(min, min2, Math.min(h, 0), i4 != Integer.MAX_VALUE ? Math.min(h, i4) : Integer.MAX_VALUE);
    }

    @Override // t.r
    public final int c(l0.o oVar) {
        return oVar.f4928e;
    }

    @Override // t.r
    public final int d(l0.o oVar) {
        return oVar.f4927d;
    }

    @Override // t.r
    public final void e(int i3, int[] iArr, int[] iArr2, AbstractC0418L abstractC0418L) {
        this.f6188a.c(i3, iArr, abstractC0418L.getLayoutDirection(), iArr2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return p2.g.a(this.f6188a, tVar.f6188a) && this.f6189b.equals(tVar.f6189b);
    }

    @Override // l0.InterfaceC0361k
    public final M1.j f(AbstractC0418L abstractC0418L, List list, long j3) {
        return Z0.d.F(this, G0.a.j(j3), G0.a.i(j3), G0.a.h(j3), G0.a.g(j3), abstractC0418L.b(this.f6188a.a()), abstractC0418L, list, new l0.o[list.size()], list.size());
    }

    public final int hashCode() {
        return Float.hashCode(this.f6189b.f2079a) + (this.f6188a.hashCode() * 31);
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.f6188a + ", verticalAlignment=" + this.f6189b + ')';
    }
}
