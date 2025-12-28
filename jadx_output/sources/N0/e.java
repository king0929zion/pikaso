package N0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public M0.e f1810a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1811b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1812c;

    /* renamed from: d, reason: collision with root package name */
    public M0.e f1813d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f1814e;

    /* renamed from: f, reason: collision with root package name */
    public O0.e f1815f;

    /* renamed from: g, reason: collision with root package name */
    public b f1816g;
    public ArrayList h;

    public final void a(f fVar, int i3, ArrayList arrayList, k kVar) {
        m mVar = fVar.f1820d;
        if (mVar.f1836c == null) {
            M0.e eVar = this.f1810a;
            if (mVar == eVar.f1582d || mVar == eVar.f1583e) {
                return;
            }
            if (kVar == null) {
                kVar = new k();
                kVar.f1830a = null;
                kVar.f1831b = new ArrayList();
                kVar.f1830a = mVar;
                arrayList.add(kVar);
            }
            mVar.f1836c = kVar;
            kVar.f1831b.add(mVar);
            f fVar2 = mVar.h;
            Iterator it = fVar2.f1826k.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                if (dVar instanceof f) {
                    a((f) dVar, i3, arrayList, kVar);
                }
            }
            f fVar3 = mVar.f1841i;
            Iterator it2 = fVar3.f1826k.iterator();
            while (it2.hasNext()) {
                d dVar2 = (d) it2.next();
                if (dVar2 instanceof f) {
                    a((f) dVar2, i3, arrayList, kVar);
                }
            }
            if (i3 == 1 && (mVar instanceof l)) {
                Iterator it3 = ((l) mVar).f1832k.f1826k.iterator();
                while (it3.hasNext()) {
                    d dVar3 = (d) it3.next();
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i3, arrayList, kVar);
                    }
                }
            }
            Iterator it4 = fVar2.f1827l.iterator();
            while (it4.hasNext()) {
                a((f) it4.next(), i3, arrayList, kVar);
            }
            Iterator it5 = fVar3.f1827l.iterator();
            while (it5.hasNext()) {
                a((f) it5.next(), i3, arrayList, kVar);
            }
            if (i3 == 1 && (mVar instanceof l)) {
                Iterator it6 = ((l) mVar).f1832k.f1827l.iterator();
                while (it6.hasNext()) {
                    a((f) it6.next(), i3, arrayList, kVar);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0008 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0206 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0191 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0268 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(M0.e r20) {
        /*
            Method dump skipped, instructions count: 795
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N0.e.b(M0.e):void");
    }

    public final void c() {
        ArrayList arrayList = this.f1814e;
        arrayList.clear();
        M0.e eVar = this.f1813d;
        eVar.f1582d.f();
        l lVar = eVar.f1583e;
        lVar.f();
        arrayList.add(eVar.f1582d);
        arrayList.add(lVar);
        Iterator it = eVar.f1604d0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            M0.d dVar = (M0.d) it.next();
            if (dVar instanceof M0.h) {
                h hVar = new h(dVar);
                dVar.f1582d.f();
                dVar.f1583e.f();
                hVar.f1839f = ((M0.h) dVar).f1669h0;
                arrayList.add(hVar);
            } else {
                if (dVar.q()) {
                    if (dVar.f1578b == null) {
                        dVar.f1578b = new c(dVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f1578b);
                } else {
                    arrayList.add(dVar.f1582d);
                }
                if (dVar.r()) {
                    if (dVar.f1580c == null) {
                        dVar.f1580c = new c(dVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f1580c);
                } else {
                    arrayList.add(dVar.f1583e);
                }
                if (dVar instanceof M0.i) {
                    arrayList.add(new i(dVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((m) it2.next()).f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            m mVar = (m) it3.next();
            if (mVar.f1835b != eVar) {
                mVar.d();
            }
        }
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        M0.e eVar2 = this.f1810a;
        e(eVar2.f1582d, 0, arrayList2);
        e(eVar2.f1583e, 1, arrayList2);
        this.f1811b = false;
    }

    public final int d(M0.e eVar, int i3) {
        ArrayList arrayList;
        int i4;
        int i5;
        long max;
        float f3;
        M0.e eVar2 = eVar;
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        int i6 = 0;
        long j3 = 0;
        while (i6 < size) {
            m mVar = ((k) arrayList2.get(i6)).f1830a;
            if (!(mVar instanceof c) ? !(i3 != 0 ? (mVar instanceof l) : (mVar instanceof j)) : ((c) mVar).f1839f != i3) {
                f fVar = (i3 == 0 ? eVar2.f1582d : eVar2.f1583e).h;
                f fVar2 = (i3 == 0 ? eVar2.f1582d : eVar2.f1583e).f1841i;
                boolean contains = mVar.h.f1827l.contains(fVar);
                f fVar3 = mVar.f1841i;
                boolean contains2 = fVar3.f1827l.contains(fVar2);
                long j4 = mVar.j();
                f fVar4 = mVar.h;
                if (contains && contains2) {
                    long b3 = k.b(fVar4, 0L);
                    ArrayList arrayList3 = arrayList2;
                    i4 = size;
                    long a3 = k.a(fVar3, 0L);
                    long j5 = b3 - j4;
                    int i7 = fVar3.f1822f;
                    arrayList = arrayList3;
                    i5 = i6;
                    if (j5 >= (-i7)) {
                        j5 += i7;
                    }
                    long j6 = (-a3) - j4;
                    long j7 = fVar4.f1822f;
                    long j8 = j6 - j7;
                    if (j8 >= j7) {
                        j8 -= j7;
                    }
                    M0.d dVar = mVar.f1835b;
                    if (i3 == 0) {
                        f3 = dVar.f1568S;
                    } else if (i3 == 1) {
                        f3 = dVar.f1569T;
                    } else {
                        dVar.getClass();
                        f3 = -1.0f;
                    }
                    float f4 = f3 > 0.0f ? (long) ((j5 / (1.0f - f3)) + (j8 / f3)) : 0L;
                    max = (fVar4.f1822f + ((((long) ((f4 * f3) + 0.5f)) + j4) + ((long) (((1.0f - f3) * f4) + 0.5f)))) - fVar3.f1822f;
                } else {
                    arrayList = arrayList2;
                    i4 = size;
                    i5 = i6;
                    max = contains ? Math.max(k.b(fVar4, fVar4.f1822f), fVar4.f1822f + j4) : contains2 ? Math.max(-k.a(fVar3, fVar3.f1822f), (-fVar3.f1822f) + j4) : (mVar.j() + fVar4.f1822f) - fVar3.f1822f;
                }
            } else {
                arrayList = arrayList2;
                i4 = size;
                i5 = i6;
                max = 0;
            }
            j3 = Math.max(j3, max);
            i6 = i5 + 1;
            eVar2 = eVar;
            size = i4;
            arrayList2 = arrayList;
        }
        return (int) j3;
    }

    public final void e(m mVar, int i3, ArrayList arrayList) {
        f fVar;
        Iterator it = mVar.h.f1826k.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            fVar = mVar.f1841i;
            if (!hasNext) {
                break;
            }
            d dVar = (d) it.next();
            if (dVar instanceof f) {
                a((f) dVar, i3, arrayList, null);
            } else if (dVar instanceof m) {
                a(((m) dVar).h, i3, arrayList, null);
            }
        }
        Iterator it2 = fVar.f1826k.iterator();
        while (it2.hasNext()) {
            d dVar2 = (d) it2.next();
            if (dVar2 instanceof f) {
                a((f) dVar2, i3, arrayList, null);
            } else if (dVar2 instanceof m) {
                a(((m) dVar2).f1841i, i3, arrayList, null);
            }
        }
        if (i3 == 1) {
            Iterator it3 = ((l) mVar).f1832k.f1826k.iterator();
            while (it3.hasNext()) {
                d dVar3 = (d) it3.next();
                if (dVar3 instanceof f) {
                    a((f) dVar3, i3, arrayList, null);
                }
            }
        }
    }

    public final void f(int i3, int i4, int i5, int i6, M0.d dVar) {
        b bVar = this.f1816g;
        bVar.f1799a = i3;
        bVar.f1800b = i5;
        bVar.f1801c = i4;
        bVar.f1802d = i6;
        this.f1815f.a(dVar, bVar);
        dVar.y(bVar.f1803e);
        dVar.v(bVar.f1804f);
        dVar.f1600w = bVar.h;
        int i7 = bVar.f1805g;
        dVar.f1565P = i7;
        dVar.f1600w = i7 > 0;
    }

    public final void g() {
        a aVar;
        Iterator it = this.f1810a.f1604d0.iterator();
        while (it.hasNext()) {
            M0.d dVar = (M0.d) it.next();
            if (!dVar.f1576a) {
                int[] iArr = dVar.f1581c0;
                boolean z3 = false;
                int i3 = iArr[0];
                int i4 = iArr[1];
                int i5 = dVar.f1587j;
                int i6 = dVar.f1588k;
                boolean z4 = i3 == 2 || (i3 == 3 && i5 == 1);
                if (i4 == 2 || (i4 == 3 && i6 == 1)) {
                    z3 = true;
                }
                j jVar = dVar.f1582d;
                g gVar = jVar.f1838e;
                boolean z5 = gVar.f1825j;
                l lVar = dVar.f1583e;
                g gVar2 = lVar.f1838e;
                boolean z6 = gVar2.f1825j;
                if (z5 && z6) {
                    f(1, gVar.f1823g, 1, gVar2.f1823g, dVar);
                    dVar.f1576a = true;
                } else if (z5 && z3) {
                    f(1, gVar.f1823g, 2, gVar2.f1823g, dVar);
                    if (i4 == 3) {
                        lVar.f1838e.f1828m = dVar.i();
                    } else {
                        lVar.f1838e.d(dVar.i());
                        dVar.f1576a = true;
                    }
                } else if (z6 && z4) {
                    f(2, gVar.f1823g, 1, gVar2.f1823g, dVar);
                    if (i3 == 3) {
                        jVar.f1838e.f1828m = dVar.l();
                    } else {
                        jVar.f1838e.d(dVar.l());
                        dVar.f1576a = true;
                    }
                }
                if (dVar.f1576a && (aVar = lVar.f1833l) != null) {
                    aVar.d(dVar.f1565P);
                }
            }
        }
    }
}
