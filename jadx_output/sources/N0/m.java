package N0;

import p.AbstractC0537f;

/* loaded from: classes.dex */
public abstract class m implements d {

    /* renamed from: a, reason: collision with root package name */
    public int f1834a;

    /* renamed from: b, reason: collision with root package name */
    public M0.d f1835b;

    /* renamed from: c, reason: collision with root package name */
    public k f1836c;

    /* renamed from: d, reason: collision with root package name */
    public int f1837d;

    /* renamed from: e, reason: collision with root package name */
    public final g f1838e = new g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f1839f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1840g = false;
    public final f h = new f(this);

    /* renamed from: i, reason: collision with root package name */
    public final f f1841i = new f(this);

    /* renamed from: j, reason: collision with root package name */
    public int f1842j = 1;

    public m(M0.d dVar) {
        this.f1835b = dVar;
    }

    public static void b(f fVar, f fVar2, int i3) {
        fVar.f1827l.add(fVar2);
        fVar.f1822f = i3;
        fVar2.f1826k.add(fVar);
    }

    public static f h(M0.c cVar) {
        M0.c cVar2 = cVar.f1546d;
        if (cVar2 == null) {
            return null;
        }
        int b3 = AbstractC0537f.b(cVar2.f1545c);
        M0.d dVar = cVar2.f1544b;
        if (b3 == 1) {
            return dVar.f1582d.h;
        }
        if (b3 == 2) {
            return dVar.f1583e.h;
        }
        if (b3 == 3) {
            return dVar.f1582d.f1841i;
        }
        if (b3 == 4) {
            return dVar.f1583e.f1841i;
        }
        if (b3 != 5) {
            return null;
        }
        return dVar.f1583e.f1832k;
    }

    public static f i(M0.c cVar, int i3) {
        M0.c cVar2 = cVar.f1546d;
        if (cVar2 == null) {
            return null;
        }
        M0.d dVar = cVar2.f1544b;
        m mVar = i3 == 0 ? dVar.f1582d : dVar.f1583e;
        int b3 = AbstractC0537f.b(cVar2.f1545c);
        if (b3 == 1 || b3 == 2) {
            return mVar.h;
        }
        if (b3 == 3 || b3 == 4) {
            return mVar.f1841i;
        }
        return null;
    }

    public final void c(f fVar, f fVar2, int i3, g gVar) {
        fVar.f1827l.add(fVar2);
        fVar.f1827l.add(this.f1838e);
        fVar.h = i3;
        fVar.f1824i = gVar;
        fVar2.f1826k.add(fVar);
        gVar.f1826k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i3, int i4) {
        int max;
        if (i4 == 0) {
            M0.d dVar = this.f1835b;
            int i5 = dVar.f1591n;
            max = Math.max(dVar.f1590m, i3);
            if (i5 > 0) {
                max = Math.min(i5, i3);
            }
            if (max == i3) {
                return i3;
            }
        } else {
            M0.d dVar2 = this.f1835b;
            int i6 = dVar2.f1594q;
            max = Math.max(dVar2.f1593p, i3);
            if (i6 > 0) {
                max = Math.min(i6, i3);
            }
            if (max == i3) {
                return i3;
            }
        }
        return max;
    }

    public long j() {
        if (this.f1838e.f1825j) {
            return r0.f1823g;
        }
        return 0L;
    }

    public abstract boolean k();

    public final void l(M0.c cVar, M0.c cVar2, int i3) {
        f h = h(cVar);
        f h3 = h(cVar2);
        if (h.f1825j && h3.f1825j) {
            int c3 = cVar.c() + h.f1823g;
            int c4 = h3.f1823g - cVar2.c();
            int i4 = c4 - c3;
            g gVar = this.f1838e;
            if (!gVar.f1825j && this.f1837d == 3) {
                int i5 = this.f1834a;
                if (i5 == 0) {
                    gVar.d(g(i4, i3));
                } else if (i5 == 1) {
                    gVar.d(Math.min(g(gVar.f1828m, i3), i4));
                } else if (i5 == 2) {
                    M0.d dVar = this.f1835b;
                    M0.d dVar2 = dVar.f1558I;
                    if (dVar2 != null) {
                        if ((i3 == 0 ? dVar2.f1582d : dVar2.f1583e).f1838e.f1825j) {
                            gVar.d(g((int) ((r6.f1823g * (i3 == 0 ? dVar.f1592o : dVar.f1595r)) + 0.5f), i3));
                        }
                    }
                } else if (i5 == 3) {
                    M0.d dVar3 = this.f1835b;
                    m mVar = dVar3.f1582d;
                    int i6 = mVar.f1837d;
                    m mVar2 = dVar3.f1583e;
                    if (i6 != 3 || mVar.f1834a != 3 || mVar2.f1837d != 3 || mVar2.f1834a != 3) {
                        if (i3 == 0) {
                            mVar = mVar2;
                        }
                        if (mVar.f1838e.f1825j) {
                            float f3 = dVar3.f1561L;
                            gVar.d(i3 == 1 ? (int) ((r6.f1823g / f3) + 0.5f) : (int) ((f3 * r6.f1823g) + 0.5f));
                        }
                    }
                }
            }
            if (gVar.f1825j) {
                int i7 = gVar.f1823g;
                f fVar = this.f1841i;
                f fVar2 = this.h;
                if (i7 == i4) {
                    fVar2.d(c3);
                    fVar.d(c4);
                    return;
                }
                M0.d dVar4 = this.f1835b;
                float f4 = i3 == 0 ? dVar4.f1568S : dVar4.f1569T;
                if (h == h3) {
                    c3 = h.f1823g;
                    c4 = h3.f1823g;
                    f4 = 0.5f;
                }
                fVar2.d((int) ((((c4 - c3) - i7) * f4) + c3 + 0.5f));
                fVar.d(fVar2.f1823g + gVar.f1823g);
            }
        }
    }
}
