package t;

import a.AbstractC0090a;
import d2.C0249t;
import java.util.List;
import l0.InterfaceC0361k;
import n0.AbstractC0418L;
import s1.C0589c;

/* loaded from: classes.dex */
public final class l implements InterfaceC0361k, r {

    /* renamed from: a, reason: collision with root package name */
    public final P.b f6173a;

    public l(P.b bVar) {
        C0589c c0589c = AbstractC0598c.f6149a;
        this.f6173a = bVar;
    }

    @Override // t.r
    public final M1.j a(l0.o[] oVarArr, AbstractC0418L abstractC0418L, int[] iArr, int i3, int i4) {
        return abstractC0418L.b0(i4, i3, C0249t.f4256d, new k(oVarArr, this, i4, abstractC0418L, iArr));
    }

    @Override // t.r
    public final long b(int i3, int i4, boolean z3) {
        if (!z3) {
            return AbstractC0090a.a(0, i4, 0, i3);
        }
        int min = Math.min(0, 262142);
        int min2 = i3 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i3, 262142);
        int h = AbstractC0090a.h(min2 == Integer.MAX_VALUE ? min : min2);
        return AbstractC0090a.a(Math.min(h, 0), i4 != Integer.MAX_VALUE ? Math.min(h, i4) : Integer.MAX_VALUE, min, min2);
    }

    @Override // t.r
    public final int c(l0.o oVar) {
        return oVar.f4927d;
    }

    @Override // t.r
    public final int d(l0.o oVar) {
        return oVar.f4928e;
    }

    @Override // t.r
    public final void e(int i3, int[] iArr, int[] iArr2, AbstractC0418L abstractC0418L) {
        C0589c c0589c = AbstractC0598c.f6149a;
        AbstractC0598c.b(iArr, iArr2, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        lVar.getClass();
        Object obj2 = AbstractC0598c.f6150b;
        return obj2.equals(obj2) && this.f6173a.equals(lVar.f6173a);
    }

    @Override // l0.InterfaceC0361k
    public final M1.j f(AbstractC0418L abstractC0418L, List list, long j3) {
        int i3 = G0.a.i(j3);
        int j4 = G0.a.j(j3);
        int g3 = G0.a.g(j3);
        int h = G0.a.h(j3);
        C0589c c0589c = AbstractC0598c.f6149a;
        return Z0.d.F(this, i3, j4, g3, h, abstractC0418L.b(0), abstractC0418L, list, new l0.o[list.size()], list.size());
    }

    public final int hashCode() {
        return Float.hashCode(this.f6173a.f2078a) + (AbstractC0598c.f6150b.hashCode() * 31);
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + AbstractC0598c.f6150b + ", horizontalAlignment=" + this.f6173a + ')';
    }
}
