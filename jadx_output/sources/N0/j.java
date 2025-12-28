package N0;

/* loaded from: classes.dex */
public final class j extends m {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f1829k = new int[2];

    public static void m(int[] iArr, int i3, int i4, int i5, int i6, float f3, int i7) {
        int i8 = i4 - i3;
        int i9 = i6 - i5;
        if (i7 != -1) {
            if (i7 == 0) {
                iArr[0] = (int) ((i9 * f3) + 0.5f);
                iArr[1] = i9;
                return;
            } else {
                if (i7 != 1) {
                    return;
                }
                iArr[0] = i8;
                iArr[1] = (int) ((i8 * f3) + 0.5f);
                return;
            }
        }
        int i10 = (int) ((i9 * f3) + 0.5f);
        int i11 = (int) ((i8 / f3) + 0.5f);
        if (i10 <= i8) {
            iArr[0] = i10;
            iArr[1] = i9;
        } else if (i11 <= i9) {
            iArr[0] = i8;
            iArr[1] = i11;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0244, code lost:
    
        if (r3 != 1) goto L128;
     */
    @Override // N0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(N0.d r24) {
        /*
            Method dump skipped, instructions count: 907
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N0.j.a(N0.d):void");
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
            gVar.d(dVar5.l());
        }
        boolean z4 = gVar.f1825j;
        f fVar = this.f1841i;
        f fVar2 = this.h;
        if (!z4) {
            M0.d dVar6 = this.f1835b;
            int i3 = dVar6.f1581c0[0];
            this.f1837d = i3;
            if (i3 != 3) {
                if (i3 == 4 && (((dVar4 = dVar6.f1558I) != null && dVar4.f1581c0[0] == 1) || dVar4.f1581c0[0] == 4)) {
                    int l3 = (dVar4.l() - this.f1835b.f1601x.c()) - this.f1835b.f1603z.c();
                    j jVar = dVar4.f1582d;
                    m.b(fVar2, jVar.h, this.f1835b.f1601x.c());
                    m.b(fVar, jVar.f1841i, -this.f1835b.f1603z.c());
                    gVar.d(l3);
                    return;
                }
                if (i3 == 1) {
                    gVar.d(dVar6.l());
                }
            }
        } else if (this.f1837d == 4 && (((dVar2 = (dVar = this.f1835b).f1558I) != null && dVar2.f1581c0[0] == 1) || dVar2.f1581c0[0] == 4)) {
            m.b(fVar2, dVar2.f1582d.h, dVar.f1601x.c());
            m.b(fVar, dVar2.f1582d.f1841i, -this.f1835b.f1603z.c());
            return;
        }
        if (gVar.f1825j) {
            M0.d dVar7 = this.f1835b;
            if (dVar7.f1576a) {
                M0.c[] cVarArr = dVar7.f1555F;
                M0.c cVar = cVarArr[0];
                M0.c cVar2 = cVar.f1546d;
                if (cVar2 != null && cVarArr[1].f1546d != null) {
                    if (dVar7.q()) {
                        fVar2.f1822f = this.f1835b.f1555F[0].c();
                        fVar.f1822f = -this.f1835b.f1555F[1].c();
                        return;
                    }
                    f h = m.h(this.f1835b.f1555F[0]);
                    if (h != null) {
                        m.b(fVar2, h, this.f1835b.f1555F[0].c());
                    }
                    f h3 = m.h(this.f1835b.f1555F[1]);
                    if (h3 != null) {
                        m.b(fVar, h3, -this.f1835b.f1555F[1].c());
                    }
                    fVar2.f1818b = true;
                    fVar.f1818b = true;
                    return;
                }
                if (cVar2 != null) {
                    f h4 = m.h(cVar);
                    if (h4 != null) {
                        m.b(fVar2, h4, this.f1835b.f1555F[0].c());
                        m.b(fVar, fVar2, gVar.f1823g);
                        return;
                    }
                    return;
                }
                M0.c cVar3 = cVarArr[1];
                if (cVar3.f1546d != null) {
                    f h5 = m.h(cVar3);
                    if (h5 != null) {
                        m.b(fVar, h5, -this.f1835b.f1555F[1].c());
                        m.b(fVar2, fVar, -gVar.f1823g);
                        return;
                    }
                    return;
                }
                if ((dVar7 instanceof M0.i) || dVar7.f1558I == null || dVar7.g(7).f1546d != null) {
                    return;
                }
                M0.d dVar8 = this.f1835b;
                m.b(fVar2, dVar8.f1558I.f1582d.h, dVar8.m());
                m.b(fVar, fVar2, gVar.f1823g);
                return;
            }
        }
        if (this.f1837d == 3) {
            M0.d dVar9 = this.f1835b;
            int i4 = dVar9.f1587j;
            if (i4 == 2) {
                M0.d dVar10 = dVar9.f1558I;
                if (dVar10 != null) {
                    g gVar2 = dVar10.f1583e.f1838e;
                    gVar.f1827l.add(gVar2);
                    gVar2.f1826k.add(gVar);
                    gVar.f1818b = true;
                    gVar.f1826k.add(fVar2);
                    gVar.f1826k.add(fVar);
                }
            } else if (i4 == 3) {
                if (dVar9.f1588k == 3) {
                    fVar2.f1817a = this;
                    fVar.f1817a = this;
                    l lVar = dVar9.f1583e;
                    lVar.h.f1817a = this;
                    lVar.f1841i.f1817a = this;
                    gVar.f1817a = this;
                    if (dVar9.r()) {
                        gVar.f1827l.add(this.f1835b.f1583e.f1838e);
                        this.f1835b.f1583e.f1838e.f1826k.add(gVar);
                        l lVar2 = this.f1835b.f1583e;
                        lVar2.f1838e.f1817a = this;
                        gVar.f1827l.add(lVar2.h);
                        gVar.f1827l.add(this.f1835b.f1583e.f1841i);
                        this.f1835b.f1583e.h.f1826k.add(gVar);
                        this.f1835b.f1583e.f1841i.f1826k.add(gVar);
                    } else if (this.f1835b.q()) {
                        this.f1835b.f1583e.f1838e.f1827l.add(gVar);
                        gVar.f1826k.add(this.f1835b.f1583e.f1838e);
                    } else {
                        this.f1835b.f1583e.f1838e.f1827l.add(gVar);
                    }
                } else {
                    g gVar3 = dVar9.f1583e.f1838e;
                    gVar.f1827l.add(gVar3);
                    gVar3.f1826k.add(gVar);
                    this.f1835b.f1583e.h.f1826k.add(gVar);
                    this.f1835b.f1583e.f1841i.f1826k.add(gVar);
                    gVar.f1818b = true;
                    gVar.f1826k.add(fVar2);
                    gVar.f1826k.add(fVar);
                    fVar2.f1827l.add(gVar);
                    fVar.f1827l.add(gVar);
                }
            }
        }
        M0.d dVar11 = this.f1835b;
        M0.c[] cVarArr2 = dVar11.f1555F;
        M0.c cVar4 = cVarArr2[0];
        M0.c cVar5 = cVar4.f1546d;
        if (cVar5 != null && cVarArr2[1].f1546d != null) {
            if (dVar11.q()) {
                fVar2.f1822f = this.f1835b.f1555F[0].c();
                fVar.f1822f = -this.f1835b.f1555F[1].c();
                return;
            }
            f h6 = m.h(this.f1835b.f1555F[0]);
            f h7 = m.h(this.f1835b.f1555F[1]);
            h6.b(this);
            h7.b(this);
            this.f1842j = 4;
            return;
        }
        if (cVar5 != null) {
            f h8 = m.h(cVar4);
            if (h8 != null) {
                m.b(fVar2, h8, this.f1835b.f1555F[0].c());
                c(fVar, fVar2, 1, gVar);
                return;
            }
            return;
        }
        M0.c cVar6 = cVarArr2[1];
        if (cVar6.f1546d != null) {
            f h9 = m.h(cVar6);
            if (h9 != null) {
                m.b(fVar, h9, -this.f1835b.f1555F[1].c());
                c(fVar2, fVar, -1, gVar);
                return;
            }
            return;
        }
        if ((dVar11 instanceof M0.i) || (dVar3 = dVar11.f1558I) == null) {
            return;
        }
        m.b(fVar2, dVar3.f1582d.h, dVar11.m());
        c(fVar, fVar2, 1, gVar);
    }

    @Override // N0.m
    public final void e() {
        f fVar = this.h;
        if (fVar.f1825j) {
            this.f1835b.f1563N = fVar.f1823g;
        }
    }

    @Override // N0.m
    public final void f() {
        this.f1836c = null;
        this.h.c();
        this.f1841i.c();
        this.f1838e.c();
        this.f1840g = false;
    }

    @Override // N0.m
    public final boolean k() {
        return this.f1837d != 3 || this.f1835b.f1587j == 0;
    }

    public final void n() {
        this.f1840g = false;
        f fVar = this.h;
        fVar.c();
        fVar.f1825j = false;
        f fVar2 = this.f1841i;
        fVar2.c();
        fVar2.f1825j = false;
        this.f1838e.f1825j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f1835b.f1572W;
    }
}
