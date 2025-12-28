package h0;

import A.t;
import d2.C0248s;
import java.util.ArrayList;
import java.util.List;
import n.C0393m;
import n.C0404x;
import n0.AbstractC0409C;
import n0.AbstractC0428i;
import n0.C0435p;
import n0.Y;
import n0.j0;

/* loaded from: classes.dex */
public final class e extends t {

    /* renamed from: f, reason: collision with root package name */
    public final P.k f4349f;

    /* renamed from: g, reason: collision with root package name */
    public final I.m f4350g;
    public final C0393m h;

    /* renamed from: i, reason: collision with root package name */
    public Y f4351i;

    /* renamed from: j, reason: collision with root package name */
    public f f4352j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4353k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4354l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4355m;

    public e(P.k kVar) {
        super(22);
        this.f4349f = kVar;
        I.m mVar = new I.m();
        mVar.f1379f = new long[2];
        this.f4350g = mVar;
        this.h = new C0393m(2);
        this.f4354l = true;
        this.f4355m = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [P.k] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [P.k] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [P.k] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [F.d] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [F.d] */
    public final void J() {
        F.d dVar = (F.d) this.f175e;
        int i3 = dVar.f1160f;
        if (i3 > 0) {
            Object[] objArr = dVar.f1158d;
            int i4 = 0;
            do {
                ((e) objArr[i4]).J();
                i4++;
            } while (i4 < i3);
        }
        AbstractC0428i abstractC0428i = this.f4349f;
        ?? r4 = 0;
        while (abstractC0428i != 0) {
            if (abstractC0428i instanceof j0) {
                ((j0) abstractC0428i).B();
            } else if ((abstractC0428i.f2090f & 16) != 0 && (abstractC0428i instanceof AbstractC0428i)) {
                P.k kVar = abstractC0428i.f5256r;
                int i5 = 0;
                abstractC0428i = abstractC0428i;
                r4 = r4;
                while (kVar != null) {
                    if ((kVar.f2090f & 16) != 0) {
                        i5++;
                        r4 = r4;
                        if (i5 == 1) {
                            abstractC0428i = kVar;
                        } else {
                            if (r4 == 0) {
                                r4 = new F.d(new P.k[16]);
                            }
                            if (abstractC0428i != 0) {
                                r4.b(abstractC0428i);
                                abstractC0428i = 0;
                            }
                            r4.b(kVar);
                        }
                    }
                    kVar = kVar.f2092i;
                    abstractC0428i = abstractC0428i;
                    r4 = r4;
                }
                if (i5 == 1) {
                }
            }
            abstractC0428i = AbstractC0409C.e(r4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [P.k] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [P.k] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [F.d] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [F.d] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public final boolean K(B2.i iVar) {
        F.d dVar;
        int i3;
        C0393m c0393m = this.h;
        boolean z3 = false;
        int i4 = 0;
        z3 = false;
        if (!(c0393m.g() == 0)) {
            P.k kVar = this.f4349f;
            if (kVar.f2099p) {
                f fVar = this.f4352j;
                p2.g.b(fVar);
                Y y3 = this.f4351i;
                p2.g.b(y3);
                long j3 = y3.f4929f;
                AbstractC0428i abstractC0428i = kVar;
                ?? r9 = 0;
                while (abstractC0428i != 0) {
                    if (abstractC0428i instanceof j0) {
                        ((j0) abstractC0428i).y(fVar, g.f4360f, j3);
                    } else if ((abstractC0428i.f2090f & 16) != 0 && (abstractC0428i instanceof AbstractC0428i)) {
                        P.k kVar2 = abstractC0428i.f5256r;
                        int i5 = 0;
                        abstractC0428i = abstractC0428i;
                        r9 = r9;
                        while (kVar2 != null) {
                            if ((kVar2.f2090f & 16) != 0) {
                                i5++;
                                r9 = r9;
                                if (i5 == 1) {
                                    abstractC0428i = kVar2;
                                } else {
                                    if (r9 == 0) {
                                        r9 = new F.d(new P.k[16]);
                                    }
                                    if (abstractC0428i != 0) {
                                        r9.b(abstractC0428i);
                                        abstractC0428i = 0;
                                    }
                                    r9.b(kVar2);
                                }
                            }
                            kVar2 = kVar2.f2092i;
                            abstractC0428i = abstractC0428i;
                            r9 = r9;
                        }
                        if (i5 == 1) {
                        }
                    }
                    abstractC0428i = AbstractC0409C.e(r9);
                }
                if (kVar.f2099p && (i3 = (dVar = (F.d) this.f175e).f1160f) > 0) {
                    Object[] objArr = dVar.f1158d;
                    do {
                        ((e) objArr[i4]).K(iVar);
                        i4++;
                    } while (i4 < i3);
                }
                z3 = true;
            }
        }
        u(iVar);
        c0393m.a();
        this.f4351i = null;
        return z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [P.k] */
    /* JADX WARN: Type inference failed for: r0v5, types: [P.k] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [P.k] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [F.d] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [F.d] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [P.k] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [P.k] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10, types: [F.d] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [F.d] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final boolean L(B2.i iVar, boolean z3) {
        F.d dVar;
        int i3;
        if (this.h.g() == 0) {
            return false;
        }
        AbstractC0428i abstractC0428i = this.f4349f;
        if (!abstractC0428i.f2099p) {
            return false;
        }
        f fVar = this.f4352j;
        p2.g.b(fVar);
        Y y3 = this.f4351i;
        p2.g.b(y3);
        long j3 = y3.f4929f;
        AbstractC0428i abstractC0428i2 = abstractC0428i;
        ?? r8 = 0;
        while (abstractC0428i2 != 0) {
            if (abstractC0428i2 instanceof j0) {
                ((j0) abstractC0428i2).y(fVar, g.f4358d, j3);
            } else if ((abstractC0428i2.f2090f & 16) != 0 && (abstractC0428i2 instanceof AbstractC0428i)) {
                P.k kVar = abstractC0428i2.f5256r;
                int i4 = 0;
                abstractC0428i2 = abstractC0428i2;
                r8 = r8;
                while (kVar != null) {
                    if ((kVar.f2090f & 16) != 0) {
                        i4++;
                        r8 = r8;
                        if (i4 == 1) {
                            abstractC0428i2 = kVar;
                        } else {
                            if (r8 == 0) {
                                r8 = new F.d(new P.k[16]);
                            }
                            if (abstractC0428i2 != 0) {
                                r8.b(abstractC0428i2);
                                abstractC0428i2 = 0;
                            }
                            r8.b(kVar);
                        }
                    }
                    kVar = kVar.f2092i;
                    abstractC0428i2 = abstractC0428i2;
                    r8 = r8;
                }
                if (i4 == 1) {
                }
            }
            abstractC0428i2 = AbstractC0409C.e(r8);
        }
        if (abstractC0428i.f2099p && (i3 = (dVar = (F.d) this.f175e).f1160f) > 0) {
            Object[] objArr = dVar.f1158d;
            int i5 = 0;
            do {
                e eVar = (e) objArr[i5];
                p2.g.b(this.f4351i);
                eVar.L(iVar, z3);
                i5++;
            } while (i5 < i3);
        }
        if (abstractC0428i.f2099p) {
            ?? r14 = 0;
            while (abstractC0428i != 0) {
                if (abstractC0428i instanceof j0) {
                    ((j0) abstractC0428i).y(fVar, g.f4359e, j3);
                } else if ((abstractC0428i.f2090f & 16) != 0 && (abstractC0428i instanceof AbstractC0428i)) {
                    P.k kVar2 = abstractC0428i.f5256r;
                    int i6 = 0;
                    abstractC0428i = abstractC0428i;
                    r14 = r14;
                    while (kVar2 != null) {
                        if ((kVar2.f2090f & 16) != 0) {
                            i6++;
                            r14 = r14;
                            if (i6 == 1) {
                                abstractC0428i = kVar2;
                            } else {
                                if (r14 == 0) {
                                    r14 = new F.d(new P.k[16]);
                                }
                                if (abstractC0428i != 0) {
                                    r14.b(abstractC0428i);
                                    abstractC0428i = 0;
                                }
                                r14.b(kVar2);
                            }
                        }
                        kVar2 = kVar2.f2092i;
                        abstractC0428i = abstractC0428i;
                        r14 = r14;
                    }
                    if (i6 == 1) {
                    }
                }
                abstractC0428i = AbstractC0409C.e(r14);
            }
        }
        return true;
    }

    public final void M(long j3, C0404x c0404x) {
        I.m mVar = this.f4350g;
        int i3 = 0;
        if (mVar.b(j3)) {
            Object[] objArr = c0404x.f5050a;
            int i4 = c0404x.f5051b;
            int i5 = 0;
            while (true) {
                if (i5 >= i4) {
                    i5 = -1;
                    break;
                } else if (equals(objArr[i5])) {
                    break;
                } else {
                    i5++;
                }
            }
            if (!(i5 >= 0)) {
                int i6 = mVar.f1378e;
                int i7 = 0;
                while (true) {
                    if (i7 >= i6) {
                        break;
                    }
                    if (j3 == ((long[]) mVar.f1379f)[i7]) {
                        mVar.d(i7);
                        break;
                    }
                    i7++;
                }
                this.h.f(j3);
            }
        }
        F.d dVar = (F.d) this.f175e;
        int i8 = dVar.f1160f;
        if (i8 > 0) {
            Object[] objArr2 = dVar.f1158d;
            do {
                ((e) objArr2[i3]).M(j3, c0404x);
                i3++;
            } while (i3 < i8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [P.k] */
    /* JADX WARN: Type inference failed for: r5v1, types: [P.k] */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49, types: [P.k] */
    /* JADX WARN: Type inference failed for: r5v50, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v54 */
    /* JADX WARN: Type inference failed for: r5v55 */
    /* JADX WARN: Type inference failed for: r5v56 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16, types: [F.d] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19, types: [F.d] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    @Override // A.t
    public final boolean t(C0393m c0393m, C0435p c0435p, B2.i iVar, boolean z3) {
        C0393m c0393m2;
        I.m mVar;
        Object obj;
        boolean z4;
        boolean z5;
        boolean z6;
        f fVar;
        boolean z7;
        int i3;
        int i4;
        int i5;
        long j3;
        List list;
        boolean t3 = super.t(c0393m, c0435p, iVar, z3);
        AbstractC0428i abstractC0428i = this.f4349f;
        if (!abstractC0428i.f2099p) {
            return true;
        }
        ?? r8 = 0;
        while (abstractC0428i != 0) {
            if (abstractC0428i instanceof j0) {
                this.f4351i = AbstractC0409C.p((j0) abstractC0428i, 16);
            } else if ((abstractC0428i.f2090f & 16) != 0 && (abstractC0428i instanceof AbstractC0428i)) {
                P.k kVar = abstractC0428i.f5256r;
                int i6 = 0;
                abstractC0428i = abstractC0428i;
                r8 = r8;
                while (kVar != null) {
                    if ((kVar.f2090f & 16) != 0) {
                        i6++;
                        r8 = r8;
                        if (i6 == 1) {
                            abstractC0428i = kVar;
                        } else {
                            if (r8 == 0) {
                                r8 = new F.d(new P.k[16]);
                            }
                            if (abstractC0428i != 0) {
                                r8.b(abstractC0428i);
                                abstractC0428i = 0;
                            }
                            r8.b(kVar);
                        }
                    }
                    kVar = kVar.f2092i;
                    abstractC0428i = abstractC0428i;
                    r8 = r8;
                }
                if (i6 == 1) {
                }
            }
            abstractC0428i = AbstractC0409C.e(r8);
        }
        int g3 = c0393m.g();
        int i7 = 0;
        while (true) {
            c0393m2 = this.h;
            mVar = this.f4350g;
            if (i7 >= g3) {
                break;
            }
            long d3 = c0393m.d(i7);
            k kVar2 = (k) c0393m.h(i7);
            if (mVar.b(d3)) {
                long j4 = kVar2.f4370g;
                if (V.c.d(j4)) {
                    long j5 = kVar2.f4366c;
                    if (V.c.d(j5)) {
                        List list2 = kVar2.f4373k;
                        List list3 = C0248s.f4255d;
                        if (list2 == null) {
                            list2 = list3;
                        }
                        ArrayList arrayList = new ArrayList(list2.size());
                        List list4 = kVar2.f4373k;
                        i3 = g3;
                        if (list4 == null) {
                            list4 = list3;
                        }
                        int size = list4.size();
                        z7 = t3;
                        int i8 = 0;
                        while (i8 < size) {
                            int i9 = size;
                            C0279b c0279b = (C0279b) list4.get(i8);
                            long j6 = d3;
                            long j7 = c0279b.f4340b;
                            if (V.c.d(j7)) {
                                list = list4;
                                Y y3 = this.f4351i;
                                p2.g.b(y3);
                                long y02 = y3.y0(c0435p, j7);
                                i5 = i7;
                                j3 = j5;
                                arrayList.add(new C0279b(c0279b.f4339a, y02, c0279b.f4341c));
                            } else {
                                i5 = i7;
                                j3 = j5;
                                list = list4;
                            }
                            i8++;
                            i7 = i5;
                            list4 = list;
                            size = i9;
                            j5 = j3;
                            d3 = j6;
                        }
                        i4 = i7;
                        Y y4 = this.f4351i;
                        p2.g.b(y4);
                        long y03 = y4.y0(c0435p, j4);
                        Y y5 = this.f4351i;
                        p2.g.b(y5);
                        k kVar3 = new k(kVar2.f4364a, kVar2.f4365b, y5.y0(c0435p, j5), kVar2.f4367d, kVar2.f4368e, kVar2.f4369f, y03, kVar2.h, kVar2.f4371i, arrayList, kVar2.f4372j, kVar2.f4374l);
                        kVar3.f4375m = kVar2.f4375m;
                        c0393m2.e(d3, kVar3);
                        i7 = i4 + 1;
                        g3 = i3;
                        t3 = z7;
                    }
                }
            }
            z7 = t3;
            i3 = g3;
            i4 = i7;
            i7 = i4 + 1;
            g3 = i3;
            t3 = z7;
        }
        boolean z8 = t3;
        if (c0393m2.g() == 0) {
            mVar.f1378e = 0;
            ((F.d) this.f175e).g();
            return true;
        }
        for (int i10 = mVar.f1378e - 1; -1 < i10; i10--) {
            if (c0393m.c(((long[]) mVar.f1379f)[i10]) < 0) {
                mVar.d(i10);
            }
        }
        ArrayList arrayList2 = new ArrayList(c0393m2.g());
        int g4 = c0393m2.g();
        for (int i11 = 0; i11 < g4; i11++) {
            arrayList2.add(c0393m2.h(i11));
        }
        f fVar2 = new f(arrayList2, iVar);
        int size2 = arrayList2.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size2) {
                obj = null;
                break;
            }
            obj = arrayList2.get(i12);
            if (iVar.e(((k) obj).f4364a)) {
                break;
            }
            i12++;
        }
        k kVar4 = (k) obj;
        if (kVar4 != null) {
            boolean z9 = kVar4.f4367d;
            if (z3) {
                z4 = false;
                if (!this.f4354l && (z9 || kVar4.h)) {
                    Y y6 = this.f4351i;
                    p2.g.b(y6);
                    boolean C3 = Z0.d.C(kVar4, y6.f4929f);
                    z5 = true;
                    this.f4354l = !C3;
                    if (this.f4354l == this.f4353k && (Z.b.p(fVar2.f4357b, 3) || Z.b.p(fVar2.f4357b, 4) || Z.b.p(fVar2.f4357b, 5))) {
                        fVar2.f4357b = this.f4354l ? 4 : 5;
                    } else if (!Z.b.p(fVar2.f4357b, 4) && this.f4353k && !this.f4355m) {
                        fVar2.f4357b = 3;
                    } else if (Z.b.p(fVar2.f4357b, 5) && this.f4354l && z9) {
                        fVar2.f4357b = 3;
                    }
                }
            } else {
                z4 = false;
                this.f4354l = false;
            }
            z5 = true;
            if (this.f4354l == this.f4353k) {
            }
            if (!Z.b.p(fVar2.f4357b, 4)) {
            }
            if (Z.b.p(fVar2.f4357b, 5)) {
                fVar2.f4357b = 3;
            }
        } else {
            z4 = false;
            z5 = true;
        }
        if (!z8 && Z.b.p(fVar2.f4357b, 3) && (fVar = this.f4352j) != null) {
            ?? r12 = fVar.f4356a;
            int size3 = r12.size();
            ?? r5 = fVar2.f4356a;
            if (size3 == r5.size()) {
                int size4 = r5.size();
                for (?? r7 = z4; r7 < size4; r7++) {
                    if (V.c.a(((k) r12.get(r7)).f4366c, ((k) r5.get(r7)).f4366c)) {
                    }
                }
                z6 = z4;
                this.f4352j = fVar2;
                return z6;
            }
        }
        z6 = z5;
        this.f4352j = fVar2;
        return z6;
    }

    @Override // A.t
    public final String toString() {
        return "Node(pointerInputFilter=" + this.f4349f + ", children=" + ((F.d) this.f175e) + ", pointerIds=" + this.f4350g + ')';
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // A.t
    public final void u(B2.i iVar) {
        super.u(iVar);
        f fVar = this.f4352j;
        if (fVar == null) {
            return;
        }
        this.f4353k = this.f4354l;
        ?? r12 = fVar.f4356a;
        int size = r12.size();
        for (int i3 = 0; i3 < size; i3++) {
            k kVar = (k) r12.get(i3);
            boolean z3 = kVar.f4367d;
            long j3 = kVar.f4364a;
            boolean e3 = iVar.e(j3);
            boolean z4 = this.f4354l;
            if ((!z3 && !e3) || (!z3 && !z4)) {
                I.m mVar = this.f4350g;
                int i4 = mVar.f1378e;
                int i5 = 0;
                while (true) {
                    if (i5 >= i4) {
                        break;
                    }
                    if (j3 == ((long[]) mVar.f1379f)[i5]) {
                        mVar.d(i5);
                        break;
                    }
                    i5++;
                }
            }
        }
        this.f4354l = false;
        this.f4355m = Z.b.p(fVar.f4357b, 5);
    }
}
