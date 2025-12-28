package N0;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class i extends m {
    @Override // N0.d
    public final void a(d dVar) {
        M0.a aVar = (M0.a) this.f1835b;
        int i3 = aVar.f1524f0;
        f fVar = this.h;
        Iterator it = fVar.f1827l.iterator();
        int i4 = 0;
        int i5 = -1;
        while (it.hasNext()) {
            int i6 = ((f) it.next()).f1823g;
            if (i5 == -1 || i6 < i5) {
                i5 = i6;
            }
            if (i4 < i6) {
                i4 = i6;
            }
        }
        if (i3 == 0 || i3 == 2) {
            fVar.d(i5 + aVar.f1526h0);
        } else {
            fVar.d(i4 + aVar.f1526h0);
        }
    }

    @Override // N0.m
    public final void d() {
        M0.d dVar = this.f1835b;
        if (dVar instanceof M0.a) {
            f fVar = this.h;
            fVar.f1818b = true;
            M0.a aVar = (M0.a) dVar;
            int i3 = aVar.f1524f0;
            boolean z3 = aVar.f1525g0;
            int i4 = 0;
            if (i3 == 0) {
                fVar.f1821e = 4;
                while (i4 < aVar.f1671e0) {
                    M0.d dVar2 = aVar.f1670d0[i4];
                    if (z3 || dVar2.f1571V != 8) {
                        f fVar2 = dVar2.f1582d.h;
                        fVar2.f1826k.add(fVar);
                        fVar.f1827l.add(fVar2);
                    }
                    i4++;
                }
                m(this.f1835b.f1582d.h);
                m(this.f1835b.f1582d.f1841i);
                return;
            }
            if (i3 == 1) {
                fVar.f1821e = 5;
                while (i4 < aVar.f1671e0) {
                    M0.d dVar3 = aVar.f1670d0[i4];
                    if (z3 || dVar3.f1571V != 8) {
                        f fVar3 = dVar3.f1582d.f1841i;
                        fVar3.f1826k.add(fVar);
                        fVar.f1827l.add(fVar3);
                    }
                    i4++;
                }
                m(this.f1835b.f1582d.h);
                m(this.f1835b.f1582d.f1841i);
                return;
            }
            if (i3 == 2) {
                fVar.f1821e = 6;
                while (i4 < aVar.f1671e0) {
                    M0.d dVar4 = aVar.f1670d0[i4];
                    if (z3 || dVar4.f1571V != 8) {
                        f fVar4 = dVar4.f1583e.h;
                        fVar4.f1826k.add(fVar);
                        fVar.f1827l.add(fVar4);
                    }
                    i4++;
                }
                m(this.f1835b.f1583e.h);
                m(this.f1835b.f1583e.f1841i);
                return;
            }
            if (i3 != 3) {
                return;
            }
            fVar.f1821e = 7;
            while (i4 < aVar.f1671e0) {
                M0.d dVar5 = aVar.f1670d0[i4];
                if (z3 || dVar5.f1571V != 8) {
                    f fVar5 = dVar5.f1583e.f1841i;
                    fVar5.f1826k.add(fVar);
                    fVar.f1827l.add(fVar5);
                }
                i4++;
            }
            m(this.f1835b.f1583e.h);
            m(this.f1835b.f1583e.f1841i);
        }
    }

    @Override // N0.m
    public final void e() {
        M0.d dVar = this.f1835b;
        if (dVar instanceof M0.a) {
            int i3 = ((M0.a) dVar).f1524f0;
            f fVar = this.h;
            if (i3 == 0 || i3 == 1) {
                dVar.f1563N = fVar.f1823g;
            } else {
                dVar.f1564O = fVar.f1823g;
            }
        }
    }

    @Override // N0.m
    public final void f() {
        this.f1836c = null;
        this.h.c();
    }

    @Override // N0.m
    public final boolean k() {
        return false;
    }

    public final void m(f fVar) {
        f fVar2 = this.h;
        fVar2.f1826k.add(fVar);
        fVar.f1827l.add(fVar2);
    }
}
