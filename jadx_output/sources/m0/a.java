package M0;

import A.AbstractC0000a;

/* loaded from: classes.dex */
public final class a extends i {

    /* renamed from: f0, reason: collision with root package name */
    public int f1524f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f1525g0;

    /* renamed from: h0, reason: collision with root package name */
    public int f1526h0;

    @Override // M0.d
    public final void a(L0.e eVar) {
        boolean z3;
        int i3;
        int i4;
        c[] cVarArr = this.f1555F;
        c cVar = this.f1601x;
        cVarArr[0] = cVar;
        c cVar2 = this.f1602y;
        int i5 = 2;
        cVarArr[2] = cVar2;
        c cVar3 = this.f1603z;
        cVarArr[1] = cVar3;
        c cVar4 = this.f1550A;
        cVarArr[3] = cVar4;
        for (c cVar5 : cVarArr) {
            cVar5.f1549g = eVar.j(cVar5);
        }
        int i6 = this.f1524f0;
        if (i6 < 0 || i6 >= 4) {
            return;
        }
        c cVar6 = cVarArr[i6];
        for (int i7 = 0; i7 < this.f1671e0; i7++) {
            d dVar = this.f1670d0[i7];
            if ((this.f1525g0 || dVar.b()) && ((((i4 = this.f1524f0) == 0 || i4 == 1) && dVar.f1581c0[0] == 3 && dVar.f1601x.f1546d != null && dVar.f1603z.f1546d != null) || ((i4 == 2 || i4 == 3) && dVar.f1581c0[1] == 3 && dVar.f1602y.f1546d != null && dVar.f1550A.f1546d != null))) {
                z3 = true;
                break;
            }
        }
        z3 = false;
        boolean z4 = cVar.e() || cVar3.e();
        boolean z5 = cVar2.e() || cVar4.e();
        int i8 = (z3 || !(((i3 = this.f1524f0) == 0 && z4) || ((i3 == 2 && z5) || ((i3 == 1 && z4) || (i3 == 3 && z5))))) ? 4 : 5;
        int i9 = 0;
        while (i9 < this.f1671e0) {
            d dVar2 = this.f1670d0[i9];
            if (this.f1525g0 || dVar2.b()) {
                L0.j j3 = eVar.j(dVar2.f1555F[this.f1524f0]);
                int i10 = this.f1524f0;
                c cVar7 = dVar2.f1555F[i10];
                cVar7.f1549g = j3;
                c cVar8 = cVar7.f1546d;
                int i11 = (cVar8 == null || cVar8.f1544b != this) ? 0 : cVar7.f1547e;
                if (i10 == 0 || i10 == i5) {
                    L0.j jVar = cVar6.f1549g;
                    int i12 = this.f1526h0 - i11;
                    L0.c k3 = eVar.k();
                    L0.j l3 = eVar.l();
                    l3.f1497d = 0;
                    k3.c(jVar, j3, l3, i12);
                    eVar.c(k3);
                } else {
                    L0.j jVar2 = cVar6.f1549g;
                    int i13 = this.f1526h0 + i11;
                    L0.c k4 = eVar.k();
                    L0.j l4 = eVar.l();
                    l4.f1497d = 0;
                    k4.b(jVar2, j3, l4, i13);
                    eVar.c(k4);
                }
                eVar.e(cVar6.f1549g, j3, this.f1526h0 + i11, i8);
            }
            i9++;
            i5 = 2;
        }
        int i14 = this.f1524f0;
        if (i14 == 0) {
            eVar.e(cVar3.f1549g, cVar.f1549g, 0, 8);
            eVar.e(cVar.f1549g, this.f1558I.f1603z.f1549g, 0, 4);
            eVar.e(cVar.f1549g, this.f1558I.f1601x.f1549g, 0, 0);
            return;
        }
        if (i14 == 1) {
            eVar.e(cVar.f1549g, cVar3.f1549g, 0, 8);
            eVar.e(cVar.f1549g, this.f1558I.f1601x.f1549g, 0, 4);
            eVar.e(cVar.f1549g, this.f1558I.f1603z.f1549g, 0, 0);
        } else if (i14 == 2) {
            eVar.e(cVar4.f1549g, cVar2.f1549g, 0, 8);
            eVar.e(cVar2.f1549g, this.f1558I.f1550A.f1549g, 0, 4);
            eVar.e(cVar2.f1549g, this.f1558I.f1602y.f1549g, 0, 0);
        } else if (i14 == 3) {
            eVar.e(cVar2.f1549g, cVar4.f1549g, 0, 8);
            eVar.e(cVar2.f1549g, this.f1558I.f1602y.f1549g, 0, 4);
            eVar.e(cVar2.f1549g, this.f1558I.f1550A.f1549g, 0, 0);
        }
    }

    @Override // M0.d
    public final boolean b() {
        return true;
    }

    @Override // M0.d
    public final String toString() {
        String str = "[Barrier] " + this.f1572W + " {";
        for (int i3 = 0; i3 < this.f1671e0; i3++) {
            d dVar = this.f1670d0[i3];
            if (i3 > 0) {
                str = AbstractC0000a.e(str, ", ");
            }
            str = str + dVar.f1572W;
        }
        return AbstractC0000a.e(str, "}");
    }
}
