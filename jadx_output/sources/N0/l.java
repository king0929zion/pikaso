package N0;

import p.AbstractC0537f;

/* loaded from: classes.dex */
public final class l extends m {

    /* renamed from: k, reason: collision with root package name */
    public f f1832k;

    /* renamed from: l, reason: collision with root package name */
    public a f1833l;

    @Override // N0.d
    public final void a(d dVar) {
        float f3;
        float f4;
        float f5;
        int i3;
        if (AbstractC0537f.b(this.f1842j) == 3) {
            M0.d dVar2 = this.f1835b;
            l(dVar2.f1602y, dVar2.f1550A, 1);
            return;
        }
        g gVar = this.f1838e;
        if (gVar.f1819c && !gVar.f1825j && this.f1837d == 3) {
            M0.d dVar3 = this.f1835b;
            int i4 = dVar3.f1588k;
            if (i4 == 2) {
                M0.d dVar4 = dVar3.f1558I;
                if (dVar4 != null) {
                    if (dVar4.f1583e.f1838e.f1825j) {
                        gVar.d((int) ((r5.f1823g * dVar3.f1595r) + 0.5f));
                    }
                }
            } else if (i4 == 3) {
                g gVar2 = dVar3.f1582d.f1838e;
                if (gVar2.f1825j) {
                    int i5 = dVar3.f1562M;
                    if (i5 == -1) {
                        f3 = gVar2.f1823g;
                        f4 = dVar3.f1561L;
                    } else if (i5 == 0) {
                        f5 = gVar2.f1823g * dVar3.f1561L;
                        i3 = (int) (f5 + 0.5f);
                        gVar.d(i3);
                    } else if (i5 != 1) {
                        i3 = 0;
                        gVar.d(i3);
                    } else {
                        f3 = gVar2.f1823g;
                        f4 = dVar3.f1561L;
                    }
                    f5 = f3 / f4;
                    i3 = (int) (f5 + 0.5f);
                    gVar.d(i3);
                }
            }
        }
        f fVar = this.h;
        if (fVar.f1819c) {
            f fVar2 = this.f1841i;
            if (fVar2.f1819c) {
                if (fVar.f1825j && fVar2.f1825j && gVar.f1825j) {
                    return;
                }
                if (!gVar.f1825j && this.f1837d == 3) {
                    M0.d dVar5 = this.f1835b;
                    if (dVar5.f1587j == 0 && !dVar5.r()) {
                        f fVar3 = (f) fVar.f1827l.get(0);
                        f fVar4 = (f) fVar2.f1827l.get(0);
                        int i6 = fVar3.f1823g + fVar.f1822f;
                        int i7 = fVar4.f1823g + fVar2.f1822f;
                        fVar.d(i6);
                        fVar2.d(i7);
                        gVar.d(i7 - i6);
                        return;
                    }
                }
                if (!gVar.f1825j && this.f1837d == 3 && this.f1834a == 1 && fVar.f1827l.size() > 0 && fVar2.f1827l.size() > 0) {
                    f fVar5 = (f) fVar.f1827l.get(0);
                    int i8 = (((f) fVar2.f1827l.get(0)).f1823g + fVar2.f1822f) - (fVar5.f1823g + fVar.f1822f);
                    int i9 = gVar.f1828m;
                    if (i8 < i9) {
                        gVar.d(i8);
                    } else {
                        gVar.d(i9);
                    }
                }
                if (gVar.f1825j && fVar.f1827l.size() > 0 && fVar2.f1827l.size() > 0) {
                    f fVar6 = (f) fVar.f1827l.get(0);
                    f fVar7 = (f) fVar2.f1827l.get(0);
                    int i10 = fVar6.f1823g;
                    int i11 = fVar.f1822f + i10;
                    int i12 = fVar7.f1823g;
                    int i13 = fVar2.f1822f + i12;
                    float f6 = this.f1835b.f1569T;
                    if (fVar6 == fVar7) {
                        f6 = 0.5f;
                    } else {
                        i10 = i11;
                        i12 = i13;
                    }
                    fVar.d((int) ((((i12 - i10) - gVar.f1823g) * f6) + i10 + 0.5f));
                    fVar2.d(fVar.f1823g + gVar.f1823g);
                }
            }
        }
    }

    @Override // N0.m
    public final void d() {
        M0.d dVar;
        M0.d dVar2;
        M0.d dVar3;
        M0.d dVar4;
        M0.d dVar5 = this.f1835b;
        boolean z3 = dVar5.f1576a;
        g gVar = this.f1838e;
        if (z3) {
            gVar.d(dVar5.i());
        }
        boolean z4 = gVar.f1825j;
        f fVar = this.f1841i;
        f fVar2 = this.h;
        if (!z4) {
            M0.d dVar6 = this.f1835b;
            this.f1837d = dVar6.f1581c0[1];
            if (dVar6.f1600w) {
                this.f1833l = new a(this);
            }
            int i3 = this.f1837d;
            if (i3 != 3) {
                if (i3 == 4 && (dVar4 = this.f1835b.f1558I) != null && dVar4.f1581c0[1] == 1) {
                    int i4 = (dVar4.i() - this.f1835b.f1602y.c()) - this.f1835b.f1550A.c();
                    l lVar = dVar4.f1583e;
                    m.b(fVar2, lVar.h, this.f1835b.f1602y.c());
                    m.b(fVar, lVar.f1841i, -this.f1835b.f1550A.c());
                    gVar.d(i4);
                    return;
                }
                if (i3 == 1) {
                    gVar.d(this.f1835b.i());
                }
            }
        } else if (this.f1837d == 4 && (dVar2 = (dVar = this.f1835b).f1558I) != null && dVar2.f1581c0[1] == 1) {
            l lVar2 = dVar2.f1583e;
            m.b(fVar2, lVar2.h, dVar.f1602y.c());
            m.b(fVar, lVar2.f1841i, -this.f1835b.f1550A.c());
            return;
        }
        boolean z5 = gVar.f1825j;
        f fVar3 = this.f1832k;
        if (z5) {
            M0.d dVar7 = this.f1835b;
            if (dVar7.f1576a) {
                M0.c[] cVarArr = dVar7.f1555F;
                M0.c cVar = cVarArr[2];
                M0.c cVar2 = cVar.f1546d;
                if (cVar2 != null && cVarArr[3].f1546d != null) {
                    if (dVar7.r()) {
                        fVar2.f1822f = this.f1835b.f1555F[2].c();
                        fVar.f1822f = -this.f1835b.f1555F[3].c();
                    } else {
                        f h = m.h(this.f1835b.f1555F[2]);
                        if (h != null) {
                            m.b(fVar2, h, this.f1835b.f1555F[2].c());
                        }
                        f h3 = m.h(this.f1835b.f1555F[3]);
                        if (h3 != null) {
                            m.b(fVar, h3, -this.f1835b.f1555F[3].c());
                        }
                        fVar2.f1818b = true;
                        fVar.f1818b = true;
                    }
                    M0.d dVar8 = this.f1835b;
                    if (dVar8.f1600w) {
                        m.b(fVar3, fVar2, dVar8.f1565P);
                        return;
                    }
                    return;
                }
                if (cVar2 != null) {
                    f h4 = m.h(cVar);
                    if (h4 != null) {
                        m.b(fVar2, h4, this.f1835b.f1555F[2].c());
                        m.b(fVar, fVar2, gVar.f1823g);
                        M0.d dVar9 = this.f1835b;
                        if (dVar9.f1600w) {
                            m.b(fVar3, fVar2, dVar9.f1565P);
                            return;
                        }
                        return;
                    }
                    return;
                }
                M0.c cVar3 = cVarArr[3];
                if (cVar3.f1546d != null) {
                    f h5 = m.h(cVar3);
                    if (h5 != null) {
                        m.b(fVar, h5, -this.f1835b.f1555F[3].c());
                        m.b(fVar2, fVar, -gVar.f1823g);
                    }
                    M0.d dVar10 = this.f1835b;
                    if (dVar10.f1600w) {
                        m.b(fVar3, fVar2, dVar10.f1565P);
                        return;
                    }
                    return;
                }
                M0.c cVar4 = cVarArr[4];
                if (cVar4.f1546d != null) {
                    f h6 = m.h(cVar4);
                    if (h6 != null) {
                        m.b(fVar3, h6, 0);
                        m.b(fVar2, fVar3, -this.f1835b.f1565P);
                        m.b(fVar, fVar2, gVar.f1823g);
                        return;
                    }
                    return;
                }
                if ((dVar7 instanceof M0.i) || dVar7.f1558I == null || dVar7.g(7).f1546d != null) {
                    return;
                }
                M0.d dVar11 = this.f1835b;
                m.b(fVar2, dVar11.f1558I.f1583e.h, dVar11.n());
                m.b(fVar, fVar2, gVar.f1823g);
                M0.d dVar12 = this.f1835b;
                if (dVar12.f1600w) {
                    m.b(fVar3, fVar2, dVar12.f1565P);
                    return;
                }
                return;
            }
        }
        if (z5 || this.f1837d != 3) {
            gVar.b(this);
        } else {
            M0.d dVar13 = this.f1835b;
            int i5 = dVar13.f1588k;
            if (i5 == 2) {
                M0.d dVar14 = dVar13.f1558I;
                if (dVar14 != null) {
                    g gVar2 = dVar14.f1583e.f1838e;
                    gVar.f1827l.add(gVar2);
                    gVar2.f1826k.add(gVar);
                    gVar.f1818b = true;
                    gVar.f1826k.add(fVar2);
                    gVar.f1826k.add(fVar);
                }
            } else if (i5 == 3 && !dVar13.r()) {
                M0.d dVar15 = this.f1835b;
                if (dVar15.f1587j != 3) {
                    g gVar3 = dVar15.f1582d.f1838e;
                    gVar.f1827l.add(gVar3);
                    gVar3.f1826k.add(gVar);
                    gVar.f1818b = true;
                    gVar.f1826k.add(fVar2);
                    gVar.f1826k.add(fVar);
                }
            }
        }
        M0.d dVar16 = this.f1835b;
        M0.c[] cVarArr2 = dVar16.f1555F;
        M0.c cVar5 = cVarArr2[2];
        M0.c cVar6 = cVar5.f1546d;
        if (cVar6 != null && cVarArr2[3].f1546d != null) {
            if (dVar16.r()) {
                fVar2.f1822f = this.f1835b.f1555F[2].c();
                fVar.f1822f = -this.f1835b.f1555F[3].c();
            } else {
                f h7 = m.h(this.f1835b.f1555F[2]);
                f h8 = m.h(this.f1835b.f1555F[3]);
                h7.b(this);
                h8.b(this);
                this.f1842j = 4;
            }
            if (this.f1835b.f1600w) {
                c(fVar3, fVar2, 1, this.f1833l);
            }
        } else if (cVar6 != null) {
            f h9 = m.h(cVar5);
            if (h9 != null) {
                m.b(fVar2, h9, this.f1835b.f1555F[2].c());
                c(fVar, fVar2, 1, gVar);
                if (this.f1835b.f1600w) {
                    c(fVar3, fVar2, 1, this.f1833l);
                }
                if (this.f1837d == 3) {
                    M0.d dVar17 = this.f1835b;
                    if (dVar17.f1561L > 0.0f) {
                        j jVar = dVar17.f1582d;
                        if (jVar.f1837d == 3) {
                            jVar.f1838e.f1826k.add(gVar);
                            gVar.f1827l.add(this.f1835b.f1582d.f1838e);
                            gVar.f1817a = this;
                        }
                    }
                }
            }
        } else {
            M0.c cVar7 = cVarArr2[3];
            if (cVar7.f1546d != null) {
                f h10 = m.h(cVar7);
                if (h10 != null) {
                    m.b(fVar, h10, -this.f1835b.f1555F[3].c());
                    c(fVar2, fVar, -1, gVar);
                    if (this.f1835b.f1600w) {
                        c(fVar3, fVar2, 1, this.f1833l);
                    }
                }
            } else {
                M0.c cVar8 = cVarArr2[4];
                if (cVar8.f1546d != null) {
                    f h11 = m.h(cVar8);
                    if (h11 != null) {
                        m.b(fVar3, h11, 0);
                        c(fVar2, fVar3, -1, this.f1833l);
                        c(fVar, fVar2, 1, gVar);
                    }
                } else if (!(dVar16 instanceof M0.i) && (dVar3 = dVar16.f1558I) != null) {
                    m.b(fVar2, dVar3.f1583e.h, dVar16.n());
                    c(fVar, fVar2, 1, gVar);
                    if (this.f1835b.f1600w) {
                        c(fVar3, fVar2, 1, this.f1833l);
                    }
                    if (this.f1837d == 3) {
                        M0.d dVar18 = this.f1835b;
                        if (dVar18.f1561L > 0.0f) {
                            j jVar2 = dVar18.f1582d;
                            if (jVar2.f1837d == 3) {
                                jVar2.f1838e.f1826k.add(gVar);
                                gVar.f1827l.add(this.f1835b.f1582d.f1838e);
                                gVar.f1817a = this;
                            }
                        }
                    }
                }
            }
        }
        if (gVar.f1827l.size() == 0) {
            gVar.f1819c = true;
        }
    }

    @Override // N0.m
    public final void e() {
        f fVar = this.h;
        if (fVar.f1825j) {
            this.f1835b.f1564O = fVar.f1823g;
        }
    }

    @Override // N0.m
    public final void f() {
        this.f1836c = null;
        this.h.c();
        this.f1841i.c();
        this.f1832k.c();
        this.f1838e.c();
        this.f1840g = false;
    }

    @Override // N0.m
    public final boolean k() {
        return this.f1837d != 3 || this.f1835b.f1588k == 0;
    }

    public final void m() {
        this.f1840g = false;
        f fVar = this.h;
        fVar.c();
        fVar.f1825j = false;
        f fVar2 = this.f1841i;
        fVar2.c();
        fVar2.f1825j = false;
        f fVar3 = this.f1832k;
        fVar3.c();
        fVar3.f1825j = false;
        this.f1838e.f1825j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f1835b.f1572W;
    }
}
