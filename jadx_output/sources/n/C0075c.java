package N;

import D.C0032d;
import c2.C0168g;
import d2.AbstractC0240k;
import java.util.ArrayList;
import java.util.HashMap;
import n.AbstractC0378E;
import n.C0375B;

/* renamed from: N.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0075c extends h {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f1720n = new int[0];

    /* renamed from: e, reason: collision with root package name */
    public final o2.c f1721e;

    /* renamed from: f, reason: collision with root package name */
    public final o2.c f1722f;

    /* renamed from: g, reason: collision with root package name */
    public int f1723g;
    public C0375B h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f1724i;

    /* renamed from: j, reason: collision with root package name */
    public l f1725j;

    /* renamed from: k, reason: collision with root package name */
    public int[] f1726k;

    /* renamed from: l, reason: collision with root package name */
    public int f1727l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1728m;

    public C0075c(int i3, l lVar, o2.c cVar, o2.c cVar2) {
        super(i3, lVar);
        this.f1721e = cVar;
        this.f1722f = cVar2;
        this.f1725j = l.h;
        this.f1726k = f1720n;
        this.f1727l = 1;
    }

    public void A(C0375B c0375b) {
        this.h = c0375b;
    }

    public C0075c B(o2.c cVar, o2.c cVar2) {
        C0076d c0076d;
        if (this.f1738c) {
            C0032d.H("Cannot use a disposed snapshot");
            throw null;
        }
        if (this.f1728m && this.f1739d < 0) {
            C0032d.I("Unsupported operation on a disposed or applied snapshot");
            throw null;
        }
        z(d());
        Object obj = o.f1756b;
        synchronized (obj) {
            int i3 = o.f1758d;
            o.f1758d = i3 + 1;
            o.f1757c = o.f1757c.e(i3);
            l e3 = e();
            r(e3.e(i3));
            c0076d = new C0076d(i3, o.e(e3, d() + 1, i3), o.l(cVar, f(), true), o.b(cVar2, i()), this);
        }
        if (!this.f1728m && !this.f1738c) {
            int d3 = d();
            synchronized (obj) {
                int i4 = o.f1758d;
                o.f1758d = i4 + 1;
                q(i4);
                o.f1757c = o.f1757c.e(d());
            }
            r(o.e(e(), d3 + 1, d()));
        }
        return c0076d;
    }

    @Override // N.h
    public final void b() {
        o.f1757c = o.f1757c.b(d()).a(this.f1725j);
    }

    @Override // N.h
    public void c() {
        if (this.f1738c) {
            return;
        }
        this.f1738c = true;
        synchronized (o.f1756b) {
            int i3 = this.f1739d;
            if (i3 >= 0) {
                o.u(i3);
                this.f1739d = -1;
            }
        }
        l();
    }

    @Override // N.h
    public boolean g() {
        return false;
    }

    @Override // N.h
    public int h() {
        return this.f1723g;
    }

    @Override // N.h
    public o2.c i() {
        return this.f1722f;
    }

    @Override // N.h
    public void k() {
        this.f1727l++;
    }

    @Override // N.h
    public void l() {
        int i3 = this.f1727l;
        if (!(i3 > 0)) {
            C0032d.H("no pending nested snapshots");
            throw null;
        }
        int i4 = i3 - 1;
        this.f1727l = i4;
        if (i4 != 0 || this.f1728m) {
            return;
        }
        C0375B w3 = w();
        if (w3 != null) {
            if (this.f1728m) {
                C0032d.I("Unsupported operation on a snapshot that has been applied");
                throw null;
            }
            A(null);
            int d3 = d();
            Object[] objArr = w3.f4961b;
            long[] jArr = w3.f4960a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i5 = 0;
                while (true) {
                    long j3 = jArr[i5];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                        for (int i7 = 0; i7 < i6; i7++) {
                            if ((255 & j3) < 128) {
                                for (A b3 = ((y) objArr[(i5 << 3) + i7]).b(); b3 != null; b3 = b3.f1701b) {
                                    int i8 = b3.f1700a;
                                    if (i8 == d3 || AbstractC0240k.Z(this.f1725j, Integer.valueOf(i8))) {
                                        b3.f1700a = 0;
                                    }
                                }
                            }
                            j3 >>= 8;
                        }
                        if (i6 != 8) {
                            break;
                        }
                    }
                    if (i5 == length) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
        }
        a();
    }

    @Override // N.h
    public void m() {
        if (this.f1728m || this.f1738c) {
            return;
        }
        u();
    }

    @Override // N.h
    public void n(y yVar) {
        C0375B w3 = w();
        if (w3 == null) {
            int i3 = AbstractC0378E.f4967a;
            w3 = new C0375B();
            A(w3);
        }
        w3.a(yVar);
    }

    @Override // N.h
    public final void o() {
        int length = this.f1726k.length;
        for (int i3 = 0; i3 < length; i3++) {
            o.u(this.f1726k[i3]);
        }
        int i4 = this.f1739d;
        if (i4 >= 0) {
            o.u(i4);
            this.f1739d = -1;
        }
    }

    @Override // N.h
    public void s(int i3) {
        this.f1723g = i3;
    }

    @Override // N.h
    public h t(o2.c cVar) {
        C0077e c0077e;
        if (this.f1738c) {
            C0032d.H("Cannot use a disposed snapshot");
            throw null;
        }
        if (this.f1728m && this.f1739d < 0) {
            C0032d.I("Unsupported operation on a disposed or applied snapshot");
            throw null;
        }
        int d3 = d();
        z(d());
        Object obj = o.f1756b;
        synchronized (obj) {
            int i3 = o.f1758d;
            o.f1758d = i3 + 1;
            o.f1757c = o.f1757c.e(i3);
            c0077e = new C0077e(i3, o.e(e(), d3 + 1, i3), o.l(cVar, f(), true), this);
        }
        if (!this.f1728m && !this.f1738c) {
            int d4 = d();
            synchronized (obj) {
                int i4 = o.f1758d;
                o.f1758d = i4 + 1;
                q(i4);
                o.f1757c = o.f1757c.e(d());
            }
            r(o.e(e(), d4 + 1, d()));
        }
        return c0077e;
    }

    public final void u() {
        z(d());
        if (this.f1728m || this.f1738c) {
            return;
        }
        int d3 = d();
        synchronized (o.f1756b) {
            int i3 = o.f1758d;
            o.f1758d = i3 + 1;
            q(i3);
            o.f1757c = o.f1757c.e(d());
        }
        r(o.e(e(), d3 + 1, d()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bf A[LOOP:1: B:31:0x00bd->B:32:0x00bf, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public N.t v() {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N.C0075c.v():N.t");
    }

    public C0375B w() {
        return this.h;
    }

    @Override // N.h
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public o2.c f() {
        return this.f1721e;
    }

    public final t y(int i3, HashMap hashMap, l lVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        l lVar2;
        Object[] objArr;
        long[] jArr;
        l lVar3;
        Object[] objArr2;
        long[] jArr2;
        int i4;
        A s3;
        A c3;
        l d3 = e().e(d()).d(this.f1725j);
        C0375B w3 = w();
        p2.g.b(w3);
        Object[] objArr3 = w3.f4961b;
        long[] jArr3 = w3.f4960a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i5 = 0;
            arrayList4 = null;
            arrayList3 = null;
            while (true) {
                long j3 = jArr3[i5];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8;
                    int i7 = 8 - ((~(i5 - length)) >>> 31);
                    int i8 = 0;
                    while (i8 < i7) {
                        if ((j3 & 255) < 128) {
                            y yVar = (y) objArr3[(i5 << 3) + i8];
                            A b3 = yVar.b();
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            A s4 = o.s(b3, i3, lVar);
                            if (s4 == null || (s3 = o.s(b3, d(), d3)) == null) {
                                lVar3 = d3;
                            } else {
                                lVar3 = d3;
                                if (s3.f1700a != 1 && !s4.equals(s3)) {
                                    A s5 = o.s(b3, d(), e());
                                    if (s5 == null) {
                                        o.r();
                                        throw null;
                                    }
                                    if (hashMap == null || (c3 = (A) hashMap.get(s4)) == null) {
                                        c3 = yVar.c(s3, s4, s5);
                                    }
                                    if (c3 == null) {
                                        return new i();
                                    }
                                    if (!c3.equals(s5)) {
                                        if (c3.equals(s4)) {
                                            if (arrayList4 == null) {
                                                arrayList4 = new ArrayList();
                                            }
                                            arrayList4.add(new C0168g(yVar, s4.b()));
                                            if (arrayList3 == null) {
                                                arrayList3 = new ArrayList();
                                            }
                                            arrayList3.add(yVar);
                                        } else {
                                            if (arrayList4 == null) {
                                                arrayList4 = new ArrayList();
                                            }
                                            arrayList4.add(!c3.equals(s3) ? new C0168g(yVar, c3) : new C0168g(yVar, s3.b()));
                                        }
                                    }
                                }
                            }
                            i4 = 8;
                        } else {
                            lVar3 = d3;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i4 = i6;
                        }
                        j3 >>= i4;
                        i8++;
                        i6 = i4;
                        objArr3 = objArr2;
                        jArr3 = jArr2;
                        d3 = lVar3;
                    }
                    lVar2 = d3;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i7 != i6) {
                        break;
                    }
                } else {
                    lVar2 = d3;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i5 == length) {
                    arrayList2 = arrayList4;
                    arrayList = arrayList3;
                    break;
                }
                i5++;
                objArr3 = objArr;
                jArr3 = jArr;
                d3 = lVar2;
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        arrayList3 = arrayList;
        arrayList4 = arrayList2;
        if (arrayList4 != null) {
            u();
            int size = arrayList4.size();
            for (int i9 = 0; i9 < size; i9++) {
                C0168g c0168g = (C0168g) arrayList4.get(i9);
                y yVar2 = (y) c0168g.f3833d;
                A a3 = (A) c0168g.f3834e;
                a3.f1700a = d();
                synchronized (o.f1756b) {
                    a3.f1701b = yVar2.b();
                    yVar2.a(a3);
                }
            }
        }
        if (arrayList3 != null) {
            int size2 = arrayList3.size();
            for (int i10 = 0; i10 < size2; i10++) {
                w3.j((y) arrayList3.get(i10));
            }
            ArrayList arrayList5 = this.f1724i;
            if (arrayList5 != null) {
                arrayList3 = AbstractC0240k.g0(arrayList5, arrayList3);
            }
            this.f1724i = arrayList3;
        }
        return j.f1740b;
    }

    public final void z(int i3) {
        synchronized (o.f1756b) {
            this.f1725j = this.f1725j.e(i3);
        }
    }
}
