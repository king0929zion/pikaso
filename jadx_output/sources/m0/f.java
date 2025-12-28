package M0;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f1616a;

    /* renamed from: d, reason: collision with root package name */
    public c f1619d;

    /* renamed from: e, reason: collision with root package name */
    public c f1620e;

    /* renamed from: f, reason: collision with root package name */
    public c f1621f;

    /* renamed from: g, reason: collision with root package name */
    public c f1622g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public int f1623i;

    /* renamed from: j, reason: collision with root package name */
    public int f1624j;

    /* renamed from: k, reason: collision with root package name */
    public int f1625k;

    /* renamed from: q, reason: collision with root package name */
    public int f1631q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f1632r;

    /* renamed from: b, reason: collision with root package name */
    public d f1617b = null;

    /* renamed from: c, reason: collision with root package name */
    public int f1618c = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f1626l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f1627m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f1628n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f1629o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f1630p = 0;

    public f(g gVar, int i3, c cVar, c cVar2, c cVar3, c cVar4, int i4) {
        this.f1632r = gVar;
        this.h = 0;
        this.f1623i = 0;
        this.f1624j = 0;
        this.f1625k = 0;
        this.f1631q = 0;
        this.f1616a = i3;
        this.f1619d = cVar;
        this.f1620e = cVar2;
        this.f1621f = cVar3;
        this.f1622g = cVar4;
        this.h = gVar.f1650j0;
        this.f1623i = gVar.f1647f0;
        this.f1624j = gVar.k0;
        this.f1625k = gVar.f1648g0;
        this.f1631q = i4;
    }

    public final void a(d dVar) {
        int i3 = this.f1616a;
        g gVar = this.f1632r;
        if (i3 == 0) {
            int D3 = gVar.D(dVar, this.f1631q);
            if (dVar.f1581c0[0] == 3) {
                this.f1630p++;
                D3 = 0;
            }
            this.f1626l = D3 + (dVar.f1571V != 8 ? gVar.f1635C0 : 0) + this.f1626l;
            int C3 = gVar.C(dVar, this.f1631q);
            if (this.f1617b == null || this.f1618c < C3) {
                this.f1617b = dVar;
                this.f1618c = C3;
                this.f1627m = C3;
            }
        } else {
            int D4 = gVar.D(dVar, this.f1631q);
            int C4 = gVar.C(dVar, this.f1631q);
            if (dVar.f1581c0[1] == 3) {
                this.f1630p++;
                C4 = 0;
            }
            this.f1627m = C4 + (dVar.f1571V != 8 ? gVar.f1636D0 : 0) + this.f1627m;
            if (this.f1617b == null || this.f1618c < D4) {
                this.f1617b = dVar;
                this.f1618c = D4;
                this.f1626l = D4;
            }
        }
        this.f1629o++;
    }

    public final void b(int i3, boolean z3, boolean z4) {
        g gVar;
        int i4;
        int i5;
        d dVar;
        char c3;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = this.f1629o;
        int i12 = 0;
        while (true) {
            gVar = this.f1632r;
            if (i12 >= i11 || (i10 = this.f1628n + i12) >= gVar.f1646O0) {
                break;
            }
            d dVar2 = gVar.f1645N0[i10];
            if (dVar2 != null) {
                dVar2.t();
            }
            i12++;
        }
        if (i11 == 0 || this.f1617b == null) {
            return;
        }
        boolean z5 = z4 && i3 == 0;
        int i13 = -1;
        int i14 = -1;
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = this.f1628n + (z3 ? (i11 - 1) - i15 : i15);
            if (i16 >= gVar.f1646O0) {
                break;
            }
            if (gVar.f1645N0[i16].f1571V == 0) {
                if (i13 == -1) {
                    i13 = i15;
                }
                i14 = i15;
            }
        }
        if (this.f1616a != 0) {
            d dVar3 = this.f1617b;
            dVar3.f1573X = gVar.f1655q0;
            int i17 = this.h;
            if (i3 > 0) {
                i17 += gVar.f1635C0;
            }
            c cVar = dVar3.f1601x;
            c cVar2 = dVar3.f1603z;
            if (z3) {
                cVar2.a(this.f1621f, i17);
                if (z4) {
                    cVar.a(this.f1619d, this.f1624j);
                }
                if (i3 > 0) {
                    this.f1621f.f1544b.f1601x.a(cVar2, 0);
                }
            } else {
                cVar.a(this.f1619d, i17);
                if (z4) {
                    cVar2.a(this.f1621f, this.f1624j);
                }
                if (i3 > 0) {
                    this.f1619d.f1544b.f1603z.a(cVar, 0);
                }
            }
            int i18 = 0;
            d dVar4 = null;
            while (i18 < i11) {
                int i19 = this.f1628n + i18;
                if (i19 >= gVar.f1646O0) {
                    return;
                }
                d dVar5 = gVar.f1645N0[i19];
                if (i18 == 0) {
                    dVar5.e(dVar5.f1602y, this.f1620e, this.f1623i);
                    int i20 = gVar.f1656r0;
                    float f3 = gVar.f1662x0;
                    if (this.f1628n == 0) {
                        i5 = gVar.f1658t0;
                        i4 = -1;
                        if (i5 != -1) {
                            f3 = gVar.f1664z0;
                            i20 = i5;
                            dVar5.f1574Y = i20;
                            dVar5.f1569T = f3;
                        }
                    } else {
                        i4 = -1;
                    }
                    if (z4 && (i5 = gVar.f1660v0) != i4) {
                        f3 = gVar.f1634B0;
                        i20 = i5;
                    }
                    dVar5.f1574Y = i20;
                    dVar5.f1569T = f3;
                }
                if (i18 == i11 - 1) {
                    dVar5.e(dVar5.f1550A, this.f1622g, this.f1625k);
                }
                if (dVar4 != null) {
                    c cVar3 = dVar5.f1602y;
                    int i21 = gVar.f1636D0;
                    c cVar4 = dVar4.f1550A;
                    cVar3.a(cVar4, i21);
                    c cVar5 = dVar5.f1602y;
                    if (i18 == i13) {
                        int i22 = this.f1623i;
                        if (cVar5.f()) {
                            cVar5.f1548f = i22;
                        }
                    }
                    cVar4.a(cVar5, 0);
                    if (i18 == i14 + 1) {
                        int i23 = this.f1625k;
                        if (cVar4.f()) {
                            cVar4.f1548f = i23;
                        }
                    }
                }
                if (dVar5 != dVar3) {
                    if (z3) {
                        int i24 = gVar.f1637E0;
                        if (i24 == 0) {
                            dVar5.f1603z.a(cVar2, 0);
                        } else if (i24 == 1) {
                            dVar5.f1601x.a(cVar, 0);
                        } else if (i24 == 2) {
                            dVar5.f1601x.a(cVar, 0);
                            dVar5.f1603z.a(cVar2, 0);
                        }
                    } else {
                        int i25 = gVar.f1637E0;
                        if (i25 == 0) {
                            dVar5.f1601x.a(cVar, 0);
                        } else if (i25 == 1) {
                            dVar5.f1603z.a(cVar2, 0);
                        } else if (i25 == 2) {
                            if (z5) {
                                dVar5.f1601x.a(this.f1619d, this.h);
                                dVar5.f1603z.a(this.f1621f, this.f1624j);
                            } else {
                                dVar5.f1601x.a(cVar, 0);
                                dVar5.f1603z.a(cVar2, 0);
                            }
                        }
                        i18++;
                        dVar4 = dVar5;
                    }
                }
                i18++;
                dVar4 = dVar5;
            }
            return;
        }
        d dVar6 = this.f1617b;
        dVar6.f1574Y = gVar.f1656r0;
        int i26 = this.f1623i;
        if (i3 > 0) {
            i26 += gVar.f1636D0;
        }
        c cVar6 = this.f1620e;
        c cVar7 = dVar6.f1602y;
        cVar7.a(cVar6, i26);
        c cVar8 = dVar6.f1550A;
        if (z4) {
            cVar8.a(this.f1622g, this.f1625k);
        }
        if (i3 > 0) {
            this.f1620e.f1544b.f1550A.a(cVar7, 0);
        }
        if (gVar.f1638F0 == 3 && !dVar6.f1600w) {
            for (int i27 = 0; i27 < i11; i27++) {
                int i28 = this.f1628n + (z3 ? (i11 - 1) - i27 : i27);
                if (i28 >= gVar.f1646O0) {
                    break;
                }
                dVar = gVar.f1645N0[i28];
                if (dVar.f1600w) {
                    break;
                }
            }
        }
        dVar = dVar6;
        int i29 = 0;
        d dVar7 = null;
        while (i29 < i11) {
            int i30 = z3 ? (i11 - 1) - i29 : i29;
            int i31 = this.f1628n + i30;
            if (i31 >= gVar.f1646O0) {
                return;
            }
            d dVar8 = gVar.f1645N0[i31];
            if (i29 == 0) {
                dVar8.e(dVar8.f1601x, this.f1619d, this.h);
            }
            if (i30 == 0) {
                int i32 = gVar.f1655q0;
                float f4 = gVar.f1661w0;
                if (this.f1628n == 0) {
                    i9 = gVar.f1657s0;
                    i6 = i32;
                    i7 = -1;
                    if (i9 != -1) {
                        f4 = gVar.f1663y0;
                        i8 = i9;
                        dVar8.f1573X = i8;
                        dVar8.f1568S = f4;
                    }
                } else {
                    i6 = i32;
                    i7 = -1;
                }
                if (!z4 || (i9 = gVar.f1659u0) == i7) {
                    i8 = i6;
                    dVar8.f1573X = i8;
                    dVar8.f1568S = f4;
                } else {
                    f4 = gVar.f1633A0;
                    i8 = i9;
                    dVar8.f1573X = i8;
                    dVar8.f1568S = f4;
                }
            }
            if (i29 == i11 - 1) {
                dVar8.e(dVar8.f1603z, this.f1621f, this.f1624j);
            }
            if (dVar7 != null) {
                c cVar9 = dVar8.f1601x;
                int i33 = gVar.f1635C0;
                c cVar10 = dVar7.f1603z;
                cVar9.a(cVar10, i33);
                c cVar11 = dVar8.f1601x;
                if (i29 == i13) {
                    int i34 = this.h;
                    if (cVar11.f()) {
                        cVar11.f1548f = i34;
                    }
                }
                cVar10.a(cVar11, 0);
                if (i29 == i14 + 1) {
                    int i35 = this.f1624j;
                    if (cVar10.f()) {
                        cVar10.f1548f = i35;
                    }
                }
            }
            if (dVar8 != dVar6) {
                int i36 = gVar.f1638F0;
                c3 = 3;
                if (i36 == 3 && dVar.f1600w && dVar8 != dVar && dVar8.f1600w) {
                    dVar8.f1551B.a(dVar.f1551B, 0);
                } else if (i36 == 0) {
                    dVar8.f1602y.a(cVar7, 0);
                } else if (i36 == 1) {
                    dVar8.f1550A.a(cVar8, 0);
                } else if (z5) {
                    dVar8.f1602y.a(this.f1620e, this.f1623i);
                    dVar8.f1550A.a(this.f1622g, this.f1625k);
                } else {
                    dVar8.f1602y.a(cVar7, 0);
                    dVar8.f1550A.a(cVar8, 0);
                }
            } else {
                c3 = 3;
            }
            i29++;
            dVar7 = dVar8;
        }
    }

    public final int c() {
        return this.f1616a == 1 ? this.f1627m - this.f1632r.f1636D0 : this.f1627m;
    }

    public final int d() {
        return this.f1616a == 0 ? this.f1626l - this.f1632r.f1635C0 : this.f1626l;
    }

    public final void e(int i3) {
        g gVar;
        int i4;
        int i5 = this.f1630p;
        if (i5 == 0) {
            return;
        }
        int i6 = this.f1629o;
        int i7 = i3 / i5;
        int i8 = 0;
        while (true) {
            gVar = this.f1632r;
            if (i8 >= i6 || (i4 = this.f1628n + i8) >= gVar.f1646O0) {
                break;
            }
            d dVar = gVar.f1645N0[i4];
            if (this.f1616a == 0) {
                if (dVar != null) {
                    int[] iArr = dVar.f1581c0;
                    if (iArr[0] == 3 && dVar.f1587j == 0) {
                        gVar.E(1, i7, iArr[1], dVar.i(), dVar);
                    }
                }
            } else if (dVar != null) {
                int[] iArr2 = dVar.f1581c0;
                if (iArr2[1] == 3 && dVar.f1588k == 0) {
                    gVar.E(iArr2[0], dVar.l(), 1, i7, dVar);
                }
            }
            i8++;
        }
        this.f1626l = 0;
        this.f1627m = 0;
        this.f1617b = null;
        this.f1618c = 0;
        int i9 = this.f1629o;
        for (int i10 = 0; i10 < i9; i10++) {
            int i11 = this.f1628n + i10;
            if (i11 >= gVar.f1646O0) {
                return;
            }
            d dVar2 = gVar.f1645N0[i11];
            if (this.f1616a == 0) {
                int l3 = dVar2.l();
                int i12 = gVar.f1635C0;
                if (dVar2.f1571V == 8) {
                    i12 = 0;
                }
                this.f1626l = l3 + i12 + this.f1626l;
                int C3 = gVar.C(dVar2, this.f1631q);
                if (this.f1617b == null || this.f1618c < C3) {
                    this.f1617b = dVar2;
                    this.f1618c = C3;
                    this.f1627m = C3;
                }
            } else {
                int D3 = gVar.D(dVar2, this.f1631q);
                int C4 = gVar.C(dVar2, this.f1631q);
                int i13 = gVar.f1636D0;
                if (dVar2.f1571V == 8) {
                    i13 = 0;
                }
                this.f1627m = C4 + i13 + this.f1627m;
                if (this.f1617b == null || this.f1618c < D3) {
                    this.f1617b = dVar2;
                    this.f1618c = D3;
                    this.f1626l = D3;
                }
            }
        }
    }

    public final void f(int i3, c cVar, c cVar2, c cVar3, c cVar4, int i4, int i5, int i6, int i7, int i8) {
        this.f1616a = i3;
        this.f1619d = cVar;
        this.f1620e = cVar2;
        this.f1621f = cVar3;
        this.f1622g = cVar4;
        this.h = i4;
        this.f1623i = i5;
        this.f1624j = i6;
        this.f1625k = i7;
        this.f1631q = i8;
    }
}
