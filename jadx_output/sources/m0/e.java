package M0;

import D1.w;
import N0.l;
import N0.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class e extends d {

    /* renamed from: d0, reason: collision with root package name */
    public ArrayList f1604d0 = new ArrayList();

    /* renamed from: e0, reason: collision with root package name */
    public final B0.a f1605e0 = new B0.a(this);

    /* renamed from: f0, reason: collision with root package name */
    public final N0.e f1606f0;

    /* renamed from: g0, reason: collision with root package name */
    public O0.e f1607g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f1608h0;
    public final L0.e i0;

    /* renamed from: j0, reason: collision with root package name */
    public int f1609j0;
    public int k0;

    /* renamed from: l0, reason: collision with root package name */
    public int f1610l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f1611m0;

    /* renamed from: n0, reason: collision with root package name */
    public b[] f1612n0;

    /* renamed from: o0, reason: collision with root package name */
    public b[] f1613o0;
    public int p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f1614q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f1615r0;

    public e() {
        N0.e eVar = new N0.e();
        eVar.f1811b = true;
        eVar.f1812c = true;
        eVar.f1814e = new ArrayList();
        new ArrayList();
        eVar.f1815f = null;
        eVar.f1816g = new N0.b();
        eVar.h = new ArrayList();
        eVar.f1810a = this;
        eVar.f1813d = this;
        this.f1606f0 = eVar;
        this.f1607g0 = null;
        this.f1608h0 = false;
        this.i0 = new L0.e();
        this.f1610l0 = 0;
        this.f1611m0 = 0;
        this.f1612n0 = new b[4];
        this.f1613o0 = new b[4];
        this.p0 = 263;
        this.f1614q0 = false;
        this.f1615r0 = false;
    }

    public final void B(d dVar, int i3) {
        if (i3 == 0) {
            int i4 = this.f1610l0 + 1;
            b[] bVarArr = this.f1613o0;
            if (i4 >= bVarArr.length) {
                this.f1613o0 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
            }
            b[] bVarArr2 = this.f1613o0;
            int i5 = this.f1610l0;
            bVarArr2[i5] = new b(dVar, 0, this.f1608h0);
            this.f1610l0 = i5 + 1;
            return;
        }
        if (i3 == 1) {
            int i6 = this.f1611m0 + 1;
            b[] bVarArr3 = this.f1612n0;
            if (i6 >= bVarArr3.length) {
                this.f1612n0 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length * 2);
            }
            b[] bVarArr4 = this.f1612n0;
            int i7 = this.f1611m0;
            bVarArr4[i7] = new b(dVar, 1, this.f1608h0);
            this.f1611m0 = i7 + 1;
        }
    }

    public final void C(L0.e eVar) {
        a(eVar);
        int size = this.f1604d0.size();
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            d dVar = (d) this.f1604d0.get(i3);
            boolean[] zArr = dVar.f1557H;
            zArr[0] = false;
            zArr[1] = false;
            if (dVar instanceof a) {
                z3 = true;
            }
        }
        if (z3) {
            for (int i4 = 0; i4 < size; i4++) {
                d dVar2 = (d) this.f1604d0.get(i4);
                if (dVar2 instanceof a) {
                    a aVar = (a) dVar2;
                    for (int i5 = 0; i5 < aVar.f1671e0; i5++) {
                        d dVar3 = aVar.f1670d0[i5];
                        int i6 = aVar.f1524f0;
                        if (i6 == 0 || i6 == 1) {
                            dVar3.f1557H[0] = true;
                        } else if (i6 == 2 || i6 == 3) {
                            dVar3.f1557H[1] = true;
                        }
                    }
                }
            }
        }
        for (int i7 = 0; i7 < size; i7++) {
            d dVar4 = (d) this.f1604d0.get(i7);
            dVar4.getClass();
            if ((dVar4 instanceof g) || (dVar4 instanceof h)) {
                dVar4.a(eVar);
            }
        }
        for (int i8 = 0; i8 < size; i8++) {
            d dVar5 = (d) this.f1604d0.get(i8);
            if (dVar5 instanceof e) {
                int[] iArr = dVar5.f1581c0;
                int i9 = iArr[0];
                int i10 = iArr[1];
                if (i9 == 2) {
                    dVar5.w(1);
                }
                if (i10 == 2) {
                    dVar5.x(1);
                }
                dVar5.a(eVar);
                if (i9 == 2) {
                    dVar5.w(i9);
                }
                if (i10 == 2) {
                    dVar5.x(i10);
                }
            } else {
                dVar5.h = -1;
                dVar5.f1586i = -1;
                int[] iArr2 = this.f1581c0;
                int i11 = iArr2[0];
                int[] iArr3 = dVar5.f1581c0;
                if (i11 != 2 && iArr3[0] == 4) {
                    c cVar = dVar5.f1601x;
                    int i12 = cVar.f1547e;
                    int l3 = l();
                    c cVar2 = dVar5.f1603z;
                    int i13 = l3 - cVar2.f1547e;
                    cVar.f1549g = eVar.j(cVar);
                    cVar2.f1549g = eVar.j(cVar2);
                    eVar.d(cVar.f1549g, i12);
                    eVar.d(cVar2.f1549g, i13);
                    dVar5.h = 2;
                    dVar5.f1563N = i12;
                    int i14 = i13 - i12;
                    dVar5.f1559J = i14;
                    int i15 = dVar5.f1566Q;
                    if (i14 < i15) {
                        dVar5.f1559J = i15;
                    }
                }
                if (iArr2[1] != 2 && iArr3[1] == 4) {
                    c cVar3 = dVar5.f1602y;
                    int i16 = cVar3.f1547e;
                    int i17 = i();
                    c cVar4 = dVar5.f1550A;
                    int i18 = i17 - cVar4.f1547e;
                    cVar3.f1549g = eVar.j(cVar3);
                    cVar4.f1549g = eVar.j(cVar4);
                    eVar.d(cVar3.f1549g, i16);
                    eVar.d(cVar4.f1549g, i18);
                    if (dVar5.f1565P > 0 || dVar5.f1571V == 8) {
                        c cVar5 = dVar5.f1551B;
                        L0.j j3 = eVar.j(cVar5);
                        cVar5.f1549g = j3;
                        eVar.d(j3, dVar5.f1565P + i16);
                    }
                    dVar5.f1586i = 2;
                    dVar5.f1564O = i16;
                    int i19 = i18 - i16;
                    dVar5.f1560K = i19;
                    int i20 = dVar5.f1567R;
                    if (i19 < i20) {
                        dVar5.f1560K = i20;
                    }
                }
                if (!(dVar5 instanceof g) && !(dVar5 instanceof h)) {
                    dVar5.a(eVar);
                }
            }
        }
        if (this.f1610l0 > 0) {
            j.a(this, eVar, 0);
        }
        if (this.f1611m0 > 0) {
            j.a(this, eVar, 1);
        }
    }

    public final boolean D(int i3, boolean z3) {
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        N0.e eVar = this.f1606f0;
        e eVar2 = eVar.f1810a;
        int h = eVar2.h(0);
        int h3 = eVar2.h(1);
        int m2 = eVar2.m();
        int n2 = eVar2.n();
        ArrayList arrayList = eVar.f1814e;
        l lVar = eVar2.f1583e;
        N0.j jVar = eVar2.f1582d;
        if (z3 && (h == 2 || h3 == 2)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z7 = z3;
                    break;
                }
                m mVar = (m) it.next();
                if (mVar.f1839f == i3 && !mVar.k()) {
                    z7 = false;
                    break;
                }
            }
            if (i3 == 0) {
                if (z7 && h == 2) {
                    eVar2.w(1);
                    eVar2.y(eVar.d(eVar2, 0));
                    jVar.f1838e.d(eVar2.l());
                }
            } else if (z7 && h3 == 2) {
                eVar2.x(1);
                eVar2.v(eVar.d(eVar2, 1));
                lVar.f1838e.d(eVar2.i());
            }
        }
        int[] iArr = eVar2.f1581c0;
        if (i3 == 0) {
            z4 = false;
            int i4 = iArr[0];
            if (i4 == 1 || i4 == 4) {
                int l3 = eVar2.l() + m2;
                jVar.f1841i.d(l3);
                jVar.f1838e.d(l3 - m2);
                z5 = true;
            }
            z5 = z4;
        } else {
            z4 = false;
            int i5 = iArr[1];
            if (i5 == 1 || i5 == 4) {
                int i6 = eVar2.i() + n2;
                lVar.f1841i.d(i6);
                lVar.f1838e.d(i6 - n2);
                z5 = true;
            }
            z5 = z4;
        }
        eVar.g();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            m mVar2 = (m) it2.next();
            if (mVar2.f1839f == i3 && (mVar2.f1835b != eVar2 || mVar2.f1840g)) {
                mVar2.e();
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            m mVar3 = (m) it3.next();
            if (mVar3.f1839f == i3 && (z5 || mVar3.f1835b != eVar2)) {
                if (!mVar3.h.f1825j || !mVar3.f1841i.f1825j || (!(mVar3 instanceof N0.c) && !mVar3.f1838e.f1825j)) {
                    z6 = z4;
                    break;
                }
            }
        }
        z6 = true;
        eVar2.w(h);
        eVar2.x(h3);
        return z6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0107  */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E() {
        /*
            Method dump skipped, instructions count: 523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M0.e.E():void");
    }

    @Override // M0.d
    public final void s() {
        this.i0.r();
        this.f1609j0 = 0;
        this.k0 = 0;
        this.f1604d0.clear();
        super.s();
    }

    @Override // M0.d
    public final void u(w wVar) {
        super.u(wVar);
        int size = this.f1604d0.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((d) this.f1604d0.get(i3)).u(wVar);
        }
    }

    @Override // M0.d
    public final void z(boolean z3, boolean z4) {
        super.z(z3, z4);
        int size = this.f1604d0.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((d) this.f1604d0.get(i3)).z(z3, z4);
        }
    }
}
