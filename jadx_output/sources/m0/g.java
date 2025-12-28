package M0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g extends i {

    /* renamed from: A0, reason: collision with root package name */
    public float f1633A0;

    /* renamed from: B0, reason: collision with root package name */
    public float f1634B0;

    /* renamed from: C0, reason: collision with root package name */
    public int f1635C0;

    /* renamed from: D0, reason: collision with root package name */
    public int f1636D0;

    /* renamed from: E0, reason: collision with root package name */
    public int f1637E0;

    /* renamed from: F0, reason: collision with root package name */
    public int f1638F0;

    /* renamed from: G0, reason: collision with root package name */
    public int f1639G0;

    /* renamed from: H0, reason: collision with root package name */
    public int f1640H0;
    public int I0;

    /* renamed from: J0, reason: collision with root package name */
    public ArrayList f1641J0;

    /* renamed from: K0, reason: collision with root package name */
    public d[] f1642K0;

    /* renamed from: L0, reason: collision with root package name */
    public d[] f1643L0;

    /* renamed from: M0, reason: collision with root package name */
    public int[] f1644M0;

    /* renamed from: N0, reason: collision with root package name */
    public d[] f1645N0;

    /* renamed from: O0, reason: collision with root package name */
    public int f1646O0;

    /* renamed from: f0, reason: collision with root package name */
    public int f1647f0;

    /* renamed from: g0, reason: collision with root package name */
    public int f1648g0;

    /* renamed from: h0, reason: collision with root package name */
    public int f1649h0;
    public int i0;

    /* renamed from: j0, reason: collision with root package name */
    public int f1650j0;
    public int k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f1651l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f1652m0;

    /* renamed from: n0, reason: collision with root package name */
    public int f1653n0;

    /* renamed from: o0, reason: collision with root package name */
    public N0.b f1654o0;
    public O0.e p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f1655q0;

    /* renamed from: r0, reason: collision with root package name */
    public int f1656r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f1657s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f1658t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f1659u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f1660v0;

    /* renamed from: w0, reason: collision with root package name */
    public float f1661w0;

    /* renamed from: x0, reason: collision with root package name */
    public float f1662x0;

    /* renamed from: y0, reason: collision with root package name */
    public float f1663y0;

    /* renamed from: z0, reason: collision with root package name */
    public float f1664z0;

    @Override // M0.i
    public final void B() {
        for (int i3 = 0; i3 < this.f1671e0; i3++) {
            d dVar = this.f1670d0[i3];
        }
    }

    public final int C(d dVar, int i3) {
        if (dVar == null) {
            return 0;
        }
        int[] iArr = dVar.f1581c0;
        if (iArr[1] == 3) {
            int i4 = dVar.f1588k;
            if (i4 == 0) {
                return 0;
            }
            if (i4 == 2) {
                int i5 = (int) (dVar.f1595r * i3);
                if (i5 != dVar.i()) {
                    E(iArr[0], dVar.l(), 1, i5, dVar);
                }
                return i5;
            }
            if (i4 == 1) {
                return dVar.i();
            }
            if (i4 == 3) {
                return (int) ((dVar.l() * dVar.f1561L) + 0.5f);
            }
        }
        return dVar.i();
    }

    public final int D(d dVar, int i3) {
        if (dVar == null) {
            return 0;
        }
        int[] iArr = dVar.f1581c0;
        if (iArr[0] == 3) {
            int i4 = dVar.f1587j;
            if (i4 == 0) {
                return 0;
            }
            if (i4 == 2) {
                int i5 = (int) (dVar.f1592o * i3);
                if (i5 != dVar.l()) {
                    E(1, i5, iArr[1], dVar.i(), dVar);
                }
                return i5;
            }
            if (i4 == 1) {
                return dVar.l();
            }
            if (i4 == 3) {
                return (int) ((dVar.i() * dVar.f1561L) + 0.5f);
            }
        }
        return dVar.l();
    }

    public final void E(int i3, int i4, int i5, int i6, d dVar) {
        O0.e eVar;
        d dVar2;
        while (true) {
            eVar = this.p0;
            if (eVar != null || (dVar2 = this.f1558I) == null) {
                break;
            } else {
                this.p0 = ((e) dVar2).f1607g0;
            }
        }
        N0.b bVar = this.f1654o0;
        bVar.f1799a = i3;
        bVar.f1800b = i5;
        bVar.f1801c = i4;
        bVar.f1802d = i6;
        eVar.a(dVar, bVar);
        dVar.y(bVar.f1803e);
        dVar.v(bVar.f1804f);
        dVar.f1600w = bVar.h;
        int i7 = bVar.f1805g;
        dVar.f1565P = i7;
        dVar.f1600w = i7 > 0;
    }

    @Override // M0.d
    public final void a(L0.e eVar) {
        d dVar;
        super.a(eVar);
        d dVar2 = this.f1558I;
        boolean z3 = dVar2 != null ? ((e) dVar2).f1608h0 : false;
        int i3 = this.f1639G0;
        ArrayList arrayList = this.f1641J0;
        if (i3 != 0) {
            if (i3 == 1) {
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    ((f) arrayList.get(i4)).b(i4, z3, i4 == size + (-1));
                    i4++;
                }
            } else if (i3 == 2 && this.f1644M0 != null && this.f1643L0 != null && this.f1642K0 != null) {
                for (int i5 = 0; i5 < this.f1646O0; i5++) {
                    this.f1645N0[i5].t();
                }
                int[] iArr = this.f1644M0;
                int i6 = iArr[0];
                int i7 = iArr[1];
                d dVar3 = null;
                for (int i8 = 0; i8 < i6; i8++) {
                    d dVar4 = this.f1643L0[z3 ? (i6 - i8) - 1 : i8];
                    if (dVar4 != null && dVar4.f1571V != 8) {
                        c cVar = dVar4.f1601x;
                        if (i8 == 0) {
                            dVar4.e(cVar, this.f1601x, this.f1650j0);
                            dVar4.f1573X = this.f1655q0;
                            dVar4.f1568S = this.f1661w0;
                        }
                        if (i8 == i6 - 1) {
                            dVar4.e(dVar4.f1603z, this.f1603z, this.k0);
                        }
                        if (i8 > 0) {
                            dVar4.e(cVar, dVar3.f1603z, this.f1635C0);
                            dVar3.e(dVar3.f1603z, cVar, 0);
                        }
                        dVar3 = dVar4;
                    }
                }
                for (int i9 = 0; i9 < i7; i9++) {
                    d dVar5 = this.f1642K0[i9];
                    if (dVar5 != null && dVar5.f1571V != 8) {
                        c cVar2 = dVar5.f1602y;
                        if (i9 == 0) {
                            dVar5.e(cVar2, this.f1602y, this.f1647f0);
                            dVar5.f1574Y = this.f1656r0;
                            dVar5.f1569T = this.f1662x0;
                        }
                        if (i9 == i7 - 1) {
                            dVar5.e(dVar5.f1550A, this.f1550A, this.f1648g0);
                        }
                        if (i9 > 0) {
                            dVar5.e(cVar2, dVar3.f1550A, this.f1636D0);
                            dVar3.e(dVar3.f1550A, cVar2, 0);
                        }
                        dVar3 = dVar5;
                    }
                }
                for (int i10 = 0; i10 < i6; i10++) {
                    for (int i11 = 0; i11 < i7; i11++) {
                        int i12 = (i11 * i6) + i10;
                        if (this.I0 == 1) {
                            i12 = (i10 * i7) + i11;
                        }
                        d[] dVarArr = this.f1645N0;
                        if (i12 < dVarArr.length && (dVar = dVarArr[i12]) != null && dVar.f1571V != 8) {
                            d dVar6 = this.f1643L0[i10];
                            d dVar7 = this.f1642K0[i11];
                            if (dVar != dVar6) {
                                dVar.e(dVar.f1601x, dVar6.f1601x, 0);
                                dVar.e(dVar.f1603z, dVar6.f1603z, 0);
                            }
                            if (dVar != dVar7) {
                                dVar.e(dVar.f1602y, dVar7.f1602y, 0);
                                dVar.e(dVar.f1550A, dVar7.f1550A, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((f) arrayList.get(0)).b(0, z3, true);
        }
        this.f1651l0 = false;
    }
}
