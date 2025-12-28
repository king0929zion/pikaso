package L0;

import D1.w;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: o, reason: collision with root package name */
    public static int f1470o = 1000;

    /* renamed from: p, reason: collision with root package name */
    public static boolean f1471p = true;

    /* renamed from: b, reason: collision with root package name */
    public final i f1473b;

    /* renamed from: e, reason: collision with root package name */
    public c[] f1476e;

    /* renamed from: k, reason: collision with root package name */
    public final w f1481k;

    /* renamed from: n, reason: collision with root package name */
    public c f1484n;

    /* renamed from: a, reason: collision with root package name */
    public int f1472a = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f1474c = 32;

    /* renamed from: d, reason: collision with root package name */
    public int f1475d = 32;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1477f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean[] f1478g = new boolean[32];
    public int h = 1;

    /* renamed from: i, reason: collision with root package name */
    public int f1479i = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f1480j = 32;

    /* renamed from: l, reason: collision with root package name */
    public j[] f1482l = new j[f1470o];

    /* renamed from: m, reason: collision with root package name */
    public int f1483m = 0;

    public e() {
        this.f1476e = null;
        this.f1476e = new c[32];
        q();
        w wVar = new w();
        wVar.f1031a = new f();
        wVar.f1032b = new f();
        wVar.f1033c = new f();
        wVar.f1034d = new j[32];
        this.f1481k = wVar;
        i iVar = new i(wVar);
        iVar.f1491f = new j[128];
        iVar.f1492g = new j[128];
        iVar.h = 0;
        iVar.f1493i = new h(iVar);
        this.f1473b = iVar;
        if (f1471p) {
            this.f1484n = new d(wVar);
        } else {
            this.f1484n = new c(wVar);
        }
    }

    public static int m(Object obj) {
        j jVar = ((M0.c) obj).f1549g;
        if (jVar != null) {
            return (int) (jVar.f1498e + 0.5f);
        }
        return 0;
    }

    public final j a(int i3) {
        j jVar = (j) ((f) this.f1481k.f1033c).a();
        if (jVar == null) {
            jVar = new j(i3);
            jVar.f1504l = i3;
        } else {
            jVar.c();
            jVar.f1504l = i3;
        }
        int i4 = this.f1483m;
        int i5 = f1470o;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            f1470o = i6;
            this.f1482l = (j[]) Arrays.copyOf(this.f1482l, i6);
        }
        j[] jVarArr = this.f1482l;
        int i7 = this.f1483m;
        this.f1483m = i7 + 1;
        jVarArr[i7] = jVar;
        return jVar;
    }

    public final void b(j jVar, j jVar2, int i3, float f3, j jVar3, j jVar4, int i4, int i5) {
        c k3 = k();
        if (jVar2 == jVar3) {
            k3.f1468d.b(jVar, 1.0f);
            k3.f1468d.b(jVar4, 1.0f);
            k3.f1468d.b(jVar2, -2.0f);
        } else if (f3 == 0.5f) {
            k3.f1468d.b(jVar, 1.0f);
            k3.f1468d.b(jVar2, -1.0f);
            k3.f1468d.b(jVar3, -1.0f);
            k3.f1468d.b(jVar4, 1.0f);
            if (i3 > 0 || i4 > 0) {
                k3.f1466b = (-i3) + i4;
            }
        } else if (f3 <= 0.0f) {
            k3.f1468d.b(jVar, -1.0f);
            k3.f1468d.b(jVar2, 1.0f);
            k3.f1466b = i3;
        } else if (f3 >= 1.0f) {
            k3.f1468d.b(jVar4, -1.0f);
            k3.f1468d.b(jVar3, 1.0f);
            k3.f1466b = -i4;
        } else {
            float f4 = 1.0f - f3;
            k3.f1468d.b(jVar, f4 * 1.0f);
            k3.f1468d.b(jVar2, f4 * (-1.0f));
            k3.f1468d.b(jVar3, (-1.0f) * f3);
            k3.f1468d.b(jVar4, 1.0f * f3);
            if (i3 > 0 || i4 > 0) {
                k3.f1466b = (i4 * f3) + ((-i3) * f4);
            }
        }
        if (i5 != 8) {
            k3.a(this, i5);
        }
        c(k3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b9, code lost:
    
        if (r4.f1503k <= 1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00bc, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00c6, code lost:
    
        if (r4.f1503k <= 1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00db, code lost:
    
        if (r4.f1503k <= 1) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00de, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00e8, code lost:
    
        if (r4.f1503k <= 1) goto L80;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(L0.c r17) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L0.e.c(L0.c):void");
    }

    public final void d(j jVar, int i3) {
        int i4 = jVar.f1496c;
        if (i4 == -1) {
            jVar.f1498e = i3;
            jVar.f1499f = true;
            int i5 = jVar.f1502j;
            for (int i6 = 0; i6 < i5; i6++) {
                jVar.f1501i[i6].g(jVar, false);
            }
            jVar.f1502j = 0;
            return;
        }
        if (i4 == -1) {
            c k3 = k();
            k3.f1465a = jVar;
            float f3 = i3;
            jVar.f1498e = f3;
            k3.f1466b = f3;
            k3.f1469e = true;
            c(k3);
            return;
        }
        c cVar = this.f1476e[i4];
        if (cVar.f1469e) {
            cVar.f1466b = i3;
            return;
        }
        if (cVar.f1468d.k() == 0) {
            cVar.f1469e = true;
            cVar.f1466b = i3;
            return;
        }
        c k4 = k();
        if (i3 < 0) {
            k4.f1466b = i3 * (-1);
            k4.f1468d.b(jVar, 1.0f);
        } else {
            k4.f1466b = i3;
            k4.f1468d.b(jVar, -1.0f);
        }
        c(k4);
    }

    public final void e(j jVar, j jVar2, int i3, int i4) {
        boolean z3 = false;
        if (i4 == 8 && jVar2.f1499f && jVar.f1496c == -1) {
            jVar.f1498e = jVar2.f1498e + i3;
            jVar.f1499f = true;
            int i5 = jVar.f1502j;
            for (int i6 = 0; i6 < i5; i6++) {
                jVar.f1501i[i6].g(jVar, false);
            }
            jVar.f1502j = 0;
            return;
        }
        c k3 = k();
        if (i3 != 0) {
            if (i3 < 0) {
                i3 *= -1;
                z3 = true;
            }
            k3.f1466b = i3;
        }
        if (z3) {
            k3.f1468d.b(jVar, 1.0f);
            k3.f1468d.b(jVar2, -1.0f);
        } else {
            k3.f1468d.b(jVar, -1.0f);
            k3.f1468d.b(jVar2, 1.0f);
        }
        if (i4 != 8) {
            k3.a(this, i4);
        }
        c(k3);
    }

    public final void f(j jVar, j jVar2, int i3, int i4) {
        c k3 = k();
        j l3 = l();
        l3.f1497d = 0;
        k3.b(jVar, jVar2, l3, i3);
        if (i4 != 8) {
            k3.f1468d.b(i(i4), (int) (k3.f1468d.d(l3) * (-1.0f)));
        }
        c(k3);
    }

    public final void g(j jVar, j jVar2, int i3, int i4) {
        c k3 = k();
        j l3 = l();
        l3.f1497d = 0;
        k3.c(jVar, jVar2, l3, i3);
        if (i4 != 8) {
            k3.f1468d.b(i(i4), (int) (k3.f1468d.d(l3) * (-1.0f)));
        }
        c(k3);
    }

    public final void h(c cVar) {
        boolean z3 = f1471p;
        w wVar = this.f1481k;
        if (z3) {
            c cVar2 = this.f1476e[this.f1479i];
            if (cVar2 != null) {
                ((f) wVar.f1031a).b(cVar2);
            }
        } else {
            c cVar3 = this.f1476e[this.f1479i];
            if (cVar3 != null) {
                ((f) wVar.f1032b).b(cVar3);
            }
        }
        c[] cVarArr = this.f1476e;
        int i3 = this.f1479i;
        cVarArr[i3] = cVar;
        j jVar = cVar.f1465a;
        jVar.f1496c = i3;
        this.f1479i = i3 + 1;
        jVar.d(cVar);
    }

    public final j i(int i3) {
        if (this.h + 1 >= this.f1475d) {
            n();
        }
        j a3 = a(4);
        int i4 = this.f1472a + 1;
        this.f1472a = i4;
        this.h++;
        a3.f1495b = i4;
        a3.f1497d = i3;
        ((j[]) this.f1481k.f1034d)[i4] = a3;
        i iVar = this.f1473b;
        iVar.f1493i.f1489d = a3;
        float[] fArr = a3.h;
        Arrays.fill(fArr, 0.0f);
        fArr[a3.f1497d] = 1.0f;
        iVar.i(a3);
        return a3;
    }

    public final j j(Object obj) {
        j jVar = null;
        if (obj == null) {
            return null;
        }
        if (this.h + 1 >= this.f1475d) {
            n();
        }
        if (obj instanceof M0.c) {
            M0.c cVar = (M0.c) obj;
            jVar = cVar.f1549g;
            if (jVar == null) {
                cVar.i();
                jVar = cVar.f1549g;
            }
            int i3 = jVar.f1495b;
            w wVar = this.f1481k;
            if (i3 == -1 || i3 > this.f1472a || ((j[]) wVar.f1034d)[i3] == null) {
                if (i3 != -1) {
                    jVar.c();
                }
                int i4 = this.f1472a + 1;
                this.f1472a = i4;
                this.h++;
                jVar.f1495b = i4;
                jVar.f1504l = 1;
                ((j[]) wVar.f1034d)[i4] = jVar;
            }
        }
        return jVar;
    }

    public final c k() {
        boolean z3 = f1471p;
        w wVar = this.f1481k;
        if (z3) {
            c cVar = (c) ((f) wVar.f1031a).a();
            if (cVar == null) {
                return new d(wVar);
            }
            cVar.f1465a = null;
            cVar.f1468d.clear();
            cVar.f1466b = 0.0f;
            cVar.f1469e = false;
            return cVar;
        }
        c cVar2 = (c) ((f) wVar.f1032b).a();
        if (cVar2 == null) {
            return new c(wVar);
        }
        cVar2.f1465a = null;
        cVar2.f1468d.clear();
        cVar2.f1466b = 0.0f;
        cVar2.f1469e = false;
        return cVar2;
    }

    public final j l() {
        if (this.h + 1 >= this.f1475d) {
            n();
        }
        j a3 = a(3);
        int i3 = this.f1472a + 1;
        this.f1472a = i3;
        this.h++;
        a3.f1495b = i3;
        ((j[]) this.f1481k.f1034d)[i3] = a3;
        return a3;
    }

    public final void n() {
        int i3 = this.f1474c * 2;
        this.f1474c = i3;
        this.f1476e = (c[]) Arrays.copyOf(this.f1476e, i3);
        w wVar = this.f1481k;
        wVar.f1034d = (j[]) Arrays.copyOf((j[]) wVar.f1034d, this.f1474c);
        int i4 = this.f1474c;
        this.f1478g = new boolean[i4];
        this.f1475d = i4;
        this.f1480j = i4;
    }

    public final void o(i iVar) {
        w wVar;
        int i3 = 0;
        while (true) {
            if (i3 >= this.f1479i) {
                break;
            }
            c cVar = this.f1476e[i3];
            int i4 = 1;
            if (cVar.f1465a.f1504l != 1) {
                float f3 = 0.0f;
                if (cVar.f1466b < 0.0f) {
                    boolean z3 = false;
                    int i5 = 0;
                    while (!z3) {
                        i5 += i4;
                        float f4 = Float.MAX_VALUE;
                        int i6 = -1;
                        int i7 = -1;
                        int i8 = 0;
                        int i9 = 0;
                        while (true) {
                            int i10 = this.f1479i;
                            wVar = this.f1481k;
                            if (i8 >= i10) {
                                break;
                            }
                            c cVar2 = this.f1476e[i8];
                            if (cVar2.f1465a.f1504l != i4 && !cVar2.f1469e && cVar2.f1466b < f3) {
                                int i11 = i4;
                                while (i11 < this.h) {
                                    j jVar = ((j[]) wVar.f1034d)[i11];
                                    float d3 = cVar2.f1468d.d(jVar);
                                    if (d3 > f3) {
                                        for (int i12 = 0; i12 < 9; i12++) {
                                            float f5 = jVar.f1500g[i12] / d3;
                                            if ((f5 < f4 && i12 == i9) || i12 > i9) {
                                                i9 = i12;
                                                f4 = f5;
                                                i6 = i8;
                                                i7 = i11;
                                            }
                                        }
                                    }
                                    i11++;
                                    f3 = 0.0f;
                                }
                            }
                            i8++;
                            f3 = 0.0f;
                            i4 = 1;
                        }
                        if (i6 != -1) {
                            c cVar3 = this.f1476e[i6];
                            cVar3.f1465a.f1496c = -1;
                            cVar3.f(((j[]) wVar.f1034d)[i7]);
                            j jVar2 = cVar3.f1465a;
                            jVar2.f1496c = i6;
                            jVar2.d(cVar3);
                        } else {
                            z3 = true;
                        }
                        if (i5 > this.h / 2) {
                            z3 = true;
                        }
                        f3 = 0.0f;
                        i4 = 1;
                    }
                }
            }
            i3++;
        }
        p(iVar);
        for (int i13 = 0; i13 < this.f1479i; i13++) {
            c cVar4 = this.f1476e[i13];
            cVar4.f1465a.f1498e = cVar4.f1466b;
        }
    }

    public final void p(c cVar) {
        for (int i3 = 0; i3 < this.h; i3++) {
            this.f1478g[i3] = false;
        }
        boolean z3 = false;
        int i4 = 0;
        while (!z3) {
            i4++;
            if (i4 >= this.h * 2) {
                return;
            }
            j jVar = cVar.f1465a;
            if (jVar != null) {
                this.f1478g[jVar.f1495b] = true;
            }
            j d3 = cVar.d(this.f1478g);
            if (d3 != null) {
                boolean[] zArr = this.f1478g;
                int i5 = d3.f1495b;
                if (zArr[i5]) {
                    return;
                } else {
                    zArr[i5] = true;
                }
            }
            if (d3 != null) {
                float f3 = Float.MAX_VALUE;
                int i6 = -1;
                for (int i7 = 0; i7 < this.f1479i; i7++) {
                    c cVar2 = this.f1476e[i7];
                    if (cVar2.f1465a.f1504l != 1 && !cVar2.f1469e && cVar2.f1468d.g(d3)) {
                        float d4 = cVar2.f1468d.d(d3);
                        if (d4 < 0.0f) {
                            float f4 = (-cVar2.f1466b) / d4;
                            if (f4 < f3) {
                                i6 = i7;
                                f3 = f4;
                            }
                        }
                    }
                }
                if (i6 > -1) {
                    c cVar3 = this.f1476e[i6];
                    cVar3.f1465a.f1496c = -1;
                    cVar3.f(d3);
                    j jVar2 = cVar3.f1465a;
                    jVar2.f1496c = i6;
                    jVar2.d(cVar3);
                }
            } else {
                z3 = true;
            }
        }
    }

    public final void q() {
        boolean z3 = f1471p;
        w wVar = this.f1481k;
        int i3 = 0;
        if (z3) {
            while (true) {
                c[] cVarArr = this.f1476e;
                if (i3 >= cVarArr.length) {
                    return;
                }
                c cVar = cVarArr[i3];
                if (cVar != null) {
                    ((f) wVar.f1031a).b(cVar);
                }
                this.f1476e[i3] = null;
                i3++;
            }
        } else {
            while (true) {
                c[] cVarArr2 = this.f1476e;
                if (i3 >= cVarArr2.length) {
                    return;
                }
                c cVar2 = cVarArr2[i3];
                if (cVar2 != null) {
                    ((f) wVar.f1032b).b(cVar2);
                }
                this.f1476e[i3] = null;
                i3++;
            }
        }
    }

    public final void r() {
        w wVar;
        int i3 = 0;
        while (true) {
            wVar = this.f1481k;
            j[] jVarArr = (j[]) wVar.f1034d;
            if (i3 >= jVarArr.length) {
                break;
            }
            j jVar = jVarArr[i3];
            if (jVar != null) {
                jVar.c();
            }
            i3++;
        }
        f fVar = (f) wVar.f1033c;
        j[] jVarArr2 = this.f1482l;
        int i4 = this.f1483m;
        fVar.getClass();
        if (i4 > jVarArr2.length) {
            i4 = jVarArr2.length;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            j jVar2 = jVarArr2[i5];
            int i6 = fVar.f1487c;
            Object[] objArr = fVar.f1486b;
            if (i6 < objArr.length) {
                objArr[i6] = jVar2;
                fVar.f1487c = i6 + 1;
            }
        }
        this.f1483m = 0;
        Arrays.fill((j[]) wVar.f1034d, (Object) null);
        this.f1472a = 0;
        i iVar = this.f1473b;
        iVar.h = 0;
        iVar.f1466b = 0.0f;
        this.h = 1;
        for (int i7 = 0; i7 < this.f1479i; i7++) {
            this.f1476e[i7].getClass();
        }
        q();
        this.f1479i = 0;
        if (f1471p) {
            this.f1484n = new d(wVar);
        } else {
            this.f1484n = new c(wVar);
        }
    }
}
