package N;

import D.C0032d;
import D.C0050m;
import D.C0065y;
import java.util.HashMap;
import n.C0375B;
import n.C0403w;
import n.C0405y;
import n0.C0416J;
import n0.f0;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final o2.c f1772a;

    /* renamed from: b, reason: collision with root package name */
    public f0 f1773b;

    /* renamed from: c, reason: collision with root package name */
    public C0403w f1774c;

    /* renamed from: j, reason: collision with root package name */
    public int f1780j;

    /* renamed from: d, reason: collision with root package name */
    public int f1775d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final A.t f1776e = new A.t(7);

    /* renamed from: f, reason: collision with root package name */
    public final C0405y f1777f = new C0405y();

    /* renamed from: g, reason: collision with root package name */
    public final C0375B f1778g = new C0375B();
    public final F.d h = new F.d(new D.D[16]);

    /* renamed from: i, reason: collision with root package name */
    public final C0050m f1779i = new C0050m(1, this);

    /* renamed from: k, reason: collision with root package name */
    public final A.t f1781k = new A.t(7);

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f1782l = new HashMap();

    public u(o2.c cVar) {
        this.f1772a = cVar;
    }

    public final void a(f0 f0Var, C0065y c0065y, o2.a aVar) {
        long[] jArr;
        long[] jArr2;
        int i3;
        f0 f0Var2 = this.f1773b;
        C0403w c0403w = this.f1774c;
        int i4 = this.f1775d;
        this.f1773b = f0Var;
        this.f1774c = (C0403w) this.f1777f.e(f0Var);
        if (this.f1775d == -1) {
            this.f1775d = o.k().d();
        }
        C0050m c0050m = this.f1779i;
        F.d v3 = C0032d.v();
        try {
            v3.b(c0050m);
            t.c(c0065y, aVar);
            v3.m(v3.f1160f - 1);
            f0 f0Var3 = this.f1773b;
            p2.g.b(f0Var3);
            int i5 = this.f1775d;
            C0403w c0403w2 = this.f1774c;
            if (c0403w2 != null) {
                long[] jArr3 = c0403w2.f5044a;
                int length = jArr3.length - 2;
                if (length >= 0) {
                    int i6 = 0;
                    while (true) {
                        long j3 = jArr3[i6];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i7 = 8;
                            int i8 = 8 - ((~(i6 - length)) >>> 31);
                            int i9 = 0;
                            while (i9 < i8) {
                                if ((j3 & 255) < 128) {
                                    int i10 = (i6 << 3) + i9;
                                    Object obj = c0403w2.f5045b[i10];
                                    jArr2 = jArr3;
                                    boolean z3 = c0403w2.f5046c[i10] != i5;
                                    if (z3) {
                                        d(f0Var3, obj);
                                    }
                                    if (z3) {
                                        c0403w2.e(i10);
                                    }
                                    i3 = 8;
                                } else {
                                    jArr2 = jArr3;
                                    i3 = i7;
                                }
                                j3 >>= i3;
                                i9++;
                                i7 = i3;
                                jArr3 = jArr2;
                            }
                            jArr = jArr3;
                            if (i8 != i7) {
                                break;
                            }
                        } else {
                            jArr = jArr3;
                        }
                        if (i6 == length) {
                            break;
                        }
                        i6++;
                        jArr3 = jArr;
                    }
                }
            }
            this.f1773b = f0Var2;
            this.f1774c = c0403w;
            this.f1775d = i4;
        } catch (Throwable th) {
            v3.m(v3.f1160f - 1);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0064, code lost:
    
        if (((N.z) r13).e(2) == false) goto L122;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(java.util.Set r44) {
        /*
            Method dump skipped, instructions count: 1802
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N.u.b(java.util.Set):boolean");
    }

    public final void c(Object obj, int i3, Object obj2, C0403w c0403w) {
        int i4;
        if (this.f1780j > 0) {
            return;
        }
        int b3 = c0403w.b(obj);
        if (b3 < 0) {
            b3 = ~b3;
            i4 = -1;
        } else {
            i4 = c0403w.f5046c[b3];
        }
        c0403w.f5045b[b3] = obj;
        c0403w.f5046c[b3] = i3;
        if ((obj instanceof D.D) && i4 != i3) {
            D.B h = ((D.D) obj).h();
            this.f1782l.put(obj, h.f645f);
            C0403w c0403w2 = h.f644e;
            A.t tVar = this.f1781k;
            tVar.F(obj);
            Object[] objArr = c0403w2.f5045b;
            long[] jArr = c0403w2.f5044a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i5 = 0;
                while (true) {
                    long j3 = jArr[i5];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                        for (int i7 = 0; i7 < i6; i7++) {
                            if ((j3 & 255) < 128) {
                                y yVar = (y) objArr[(i5 << 3) + i7];
                                if (yVar instanceof z) {
                                    ((z) yVar).f(2);
                                }
                                tVar.r(yVar, obj);
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
        if (i4 == -1) {
            if (obj instanceof z) {
                ((z) obj).f(2);
            }
            this.f1776e.r(obj, obj2);
        }
    }

    public final void d(Object obj, Object obj2) {
        A.t tVar = this.f1776e;
        tVar.D(obj2, obj);
        if (!(obj2 instanceof D.D) || ((C0405y) tVar.f175e).b(obj2)) {
            return;
        }
        this.f1781k.F(obj2);
        this.f1782l.remove(obj2);
    }

    public final void e() {
        C0416J c0416j;
        long[] jArr;
        int i3;
        C0416J c0416j2;
        long[] jArr2;
        int i4;
        int i5;
        int i6;
        char c3;
        long j3;
        int i7;
        int i8;
        C0416J c0416j3 = C0416J.f5153j;
        C0405y c0405y = this.f1777f;
        long[] jArr3 = c0405y.f5052a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i9 = 0;
        while (true) {
            long j4 = jArr3[i9];
            char c4 = 7;
            long j5 = -9187201950435737472L;
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8;
                int i11 = 8 - ((~(i9 - length)) >>> 31);
                int i12 = 0;
                while (i12 < i11) {
                    if ((j4 & 255) < 128) {
                        int i13 = (i9 << 3) + i12;
                        Object obj = c0405y.f5053b[i13];
                        C0403w c0403w = (C0403w) c0405y.f5054c[i13];
                        Boolean bool = (Boolean) c0416j3.i(obj);
                        if (bool.booleanValue()) {
                            Object[] objArr = c0403w.f5045b;
                            int[] iArr = c0403w.f5046c;
                            long[] jArr4 = c0403w.f5044a;
                            int length2 = jArr4.length - 2;
                            c0416j2 = c0416j3;
                            jArr2 = jArr3;
                            i4 = length;
                            if (length2 >= 0) {
                                int i14 = 0;
                                while (true) {
                                    long j6 = jArr4[i14];
                                    i6 = i11;
                                    long[] jArr5 = jArr4;
                                    c3 = 7;
                                    j3 = -9187201950435737472L;
                                    if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i15 = 8 - ((~(i14 - length2)) >>> 31);
                                        int i16 = 0;
                                        while (i16 < i15) {
                                            if ((j6 & 255) < 128) {
                                                int i17 = (i14 << 3) + i16;
                                                i8 = i9;
                                                Object obj2 = objArr[i17];
                                                int i18 = iArr[i17];
                                                d(obj, obj2);
                                            } else {
                                                i8 = i9;
                                            }
                                            j6 >>= 8;
                                            i16++;
                                            i9 = i8;
                                        }
                                        i5 = i9;
                                        if (i15 != 8) {
                                            break;
                                        }
                                    } else {
                                        i5 = i9;
                                    }
                                    if (i14 == length2) {
                                        break;
                                    }
                                    i14++;
                                    i11 = i6;
                                    jArr4 = jArr5;
                                    i9 = i5;
                                }
                            } else {
                                i5 = i9;
                                i6 = i11;
                                j3 = -9187201950435737472L;
                                c3 = 7;
                            }
                        } else {
                            c0416j2 = c0416j3;
                            jArr2 = jArr3;
                            i4 = length;
                            i5 = i9;
                            i6 = i11;
                            c3 = c4;
                            j3 = j5;
                        }
                        if (bool.booleanValue()) {
                            c0405y.h(i13);
                        }
                        i7 = 8;
                    } else {
                        c0416j2 = c0416j3;
                        jArr2 = jArr3;
                        i4 = length;
                        i5 = i9;
                        i6 = i11;
                        c3 = c4;
                        j3 = j5;
                        i7 = i10;
                    }
                    j4 >>= i7;
                    i12++;
                    i10 = i7;
                    j5 = j3;
                    c4 = c3;
                    c0416j3 = c0416j2;
                    jArr3 = jArr2;
                    length = i4;
                    i11 = i6;
                    i9 = i5;
                }
                c0416j = c0416j3;
                jArr = jArr3;
                int i19 = length;
                int i20 = i9;
                if (i11 != i10) {
                    return;
                }
                length = i19;
                i3 = i20;
            } else {
                c0416j = c0416j3;
                jArr = jArr3;
                i3 = i9;
            }
            if (i3 == length) {
                return;
            }
            i9 = i3 + 1;
            c0416j3 = c0416j;
            jArr3 = jArr;
        }
    }
}
