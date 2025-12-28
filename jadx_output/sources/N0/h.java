package N0;

/* loaded from: classes.dex */
public final class h extends m {
    @Override // N0.d
    public final void a(d dVar) {
        f fVar = this.h;
        if (fVar.f1819c && !fVar.f1825j) {
            fVar.d((int) ((((f) fVar.f1827l.get(0)).f1823g * ((M0.h) this.f1835b).f1665d0) + 0.5f));
        }
    }

    @Override // N0.m
    public final void d() {
        M0.d dVar = this.f1835b;
        M0.h hVar = (M0.h) dVar;
        int i3 = hVar.f1666e0;
        int i4 = hVar.f1667f0;
        int i5 = hVar.f1669h0;
        f fVar = this.h;
        if (i5 == 1) {
            if (i3 != -1) {
                fVar.f1827l.add(dVar.f1558I.f1582d.h);
                this.f1835b.f1558I.f1582d.h.f1826k.add(fVar);
                fVar.f1822f = i3;
            } else if (i4 != -1) {
                fVar.f1827l.add(dVar.f1558I.f1582d.f1841i);
                this.f1835b.f1558I.f1582d.f1841i.f1826k.add(fVar);
                fVar.f1822f = -i4;
            } else {
                fVar.f1818b = true;
                fVar.f1827l.add(dVar.f1558I.f1582d.f1841i);
                this.f1835b.f1558I.f1582d.f1841i.f1826k.add(fVar);
            }
            m(this.f1835b.f1582d.h);
            m(this.f1835b.f1582d.f1841i);
            return;
        }
        if (i3 != -1) {
            fVar.f1827l.add(dVar.f1558I.f1583e.h);
            this.f1835b.f1558I.f1583e.h.f1826k.add(fVar);
            fVar.f1822f = i3;
        } else if (i4 != -1) {
            fVar.f1827l.add(dVar.f1558I.f1583e.f1841i);
            this.f1835b.f1558I.f1583e.f1841i.f1826k.add(fVar);
            fVar.f1822f = -i4;
        } else {
            fVar.f1818b = true;
            fVar.f1827l.add(dVar.f1558I.f1583e.f1841i);
            this.f1835b.f1558I.f1583e.f1841i.f1826k.add(fVar);
        }
        m(this.f1835b.f1583e.h);
        m(this.f1835b.f1583e.f1841i);
    }

    @Override // N0.m
    public final void e() {
        M0.d dVar = this.f1835b;
        int i3 = ((M0.h) dVar).f1669h0;
        f fVar = this.h;
        if (i3 == 1) {
            dVar.f1563N = fVar.f1823g;
        } else {
            dVar.f1564O = fVar.f1823g;
        }
    }

    @Override // N0.m
    public final void f() {
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
