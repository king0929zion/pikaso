package M0;

import A.AbstractC0000a;
import java.util.ArrayList;
import p.AbstractC0537f;

/* loaded from: classes.dex */
public final class h extends d {

    /* renamed from: d0, reason: collision with root package name */
    public float f1665d0 = -1.0f;

    /* renamed from: e0, reason: collision with root package name */
    public int f1666e0 = -1;

    /* renamed from: f0, reason: collision with root package name */
    public int f1667f0 = -1;

    /* renamed from: g0, reason: collision with root package name */
    public c f1668g0 = this.f1602y;

    /* renamed from: h0, reason: collision with root package name */
    public int f1669h0 = 0;

    public h() {
        this.f1556G.clear();
        this.f1556G.add(this.f1668g0);
        int length = this.f1555F.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.f1555F[i3] = this.f1668g0;
        }
    }

    @Override // M0.d
    public final void A(L0.e eVar) {
        if (this.f1558I == null) {
            return;
        }
        c cVar = this.f1668g0;
        eVar.getClass();
        int m2 = L0.e.m(cVar);
        if (this.f1669h0 == 1) {
            this.f1563N = m2;
            this.f1564O = 0;
            v(this.f1558I.i());
            y(0);
            return;
        }
        this.f1563N = 0;
        this.f1564O = m2;
        y(this.f1558I.l());
        v(0);
    }

    public final void B(int i3) {
        if (this.f1669h0 == i3) {
            return;
        }
        this.f1669h0 = i3;
        ArrayList arrayList = this.f1556G;
        arrayList.clear();
        if (this.f1669h0 == 1) {
            this.f1668g0 = this.f1601x;
        } else {
            this.f1668g0 = this.f1602y;
        }
        arrayList.add(this.f1668g0);
        c[] cVarArr = this.f1555F;
        int length = cVarArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            cVarArr[i4] = this.f1668g0;
        }
    }

    @Override // M0.d
    public final void a(L0.e eVar) {
        e eVar2 = (e) this.f1558I;
        if (eVar2 == null) {
            return;
        }
        c g3 = eVar2.g(2);
        c g4 = eVar2.g(4);
        d dVar = this.f1558I;
        boolean z3 = dVar != null && dVar.f1581c0[0] == 2;
        if (this.f1669h0 == 0) {
            g3 = eVar2.g(3);
            g4 = eVar2.g(5);
            d dVar2 = this.f1558I;
            z3 = dVar2 != null && dVar2.f1581c0[1] == 2;
        }
        if (this.f1666e0 != -1) {
            L0.j j3 = eVar.j(this.f1668g0);
            eVar.e(j3, eVar.j(g3), this.f1666e0, 8);
            if (z3) {
                eVar.f(eVar.j(g4), j3, 0, 5);
                return;
            }
            return;
        }
        if (this.f1667f0 != -1) {
            L0.j j4 = eVar.j(this.f1668g0);
            L0.j j5 = eVar.j(g4);
            eVar.e(j4, j5, -this.f1667f0, 8);
            if (z3) {
                eVar.f(j4, eVar.j(g3), 0, 5);
                eVar.f(j5, j4, 0, 5);
                return;
            }
            return;
        }
        if (this.f1665d0 != -1.0f) {
            L0.j j6 = eVar.j(this.f1668g0);
            L0.j j7 = eVar.j(g4);
            float f3 = this.f1665d0;
            L0.c k3 = eVar.k();
            k3.f1468d.b(j6, -1.0f);
            k3.f1468d.b(j7, f3);
            eVar.c(k3);
        }
    }

    @Override // M0.d
    public final boolean b() {
        return true;
    }

    @Override // M0.d
    public final c g(int i3) {
        switch (AbstractC0537f.b(i3)) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
            case 3:
                if (this.f1669h0 == 1) {
                    return this.f1668g0;
                }
                break;
            case 2:
            case 4:
                if (this.f1669h0 == 0) {
                    return this.f1668g0;
                }
                break;
        }
        throw new AssertionError(AbstractC0000a.m(i3));
    }
}
