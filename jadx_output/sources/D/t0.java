package D;

import N.C0074b;
import android.os.Trace;
import c2.C0174m;
import d2.AbstractC0239j;
import java.util.List;
import java.util.Set;
import n.C0375B;

/* loaded from: classes.dex */
public final class t0 extends p2.h implements o2.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v0 f882e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0375B f883f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0375B f884g;
    public final /* synthetic */ List h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ List f885i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0375B f886j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ List f887k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0375B f888l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Set f889m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(v0 v0Var, C0375B c0375b, C0375B c0375b2, List list, List list2, C0375B c0375b3, List list3, C0375B c0375b4, Set set) {
        super(1);
        this.f882e = v0Var;
        this.f883f = c0375b;
        this.f884g = c0375b2;
        this.h = list;
        this.f885i = list2;
        this.f886j = c0375b3;
        this.f887k = list3;
        this.f888l = c0375b4;
        this.f889m = set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v3, types: [int] */
    /* JADX WARN: Type inference failed for: r10v5, types: [int] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [int] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [int] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [int] */
    /* JADX WARN: Type inference failed for: r9v10, types: [int] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12, types: [int] */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // o2.c
    public final Object i(Object obj) {
        boolean f3;
        C0375B c0375b;
        C0375B c0375b2;
        v0 v0Var;
        C0375B c0375b3;
        C0375B c0375b4;
        v0 v0Var2;
        v0 v0Var3;
        char c3;
        boolean z3;
        long longValue = ((Number) obj).longValue();
        v0 v0Var4 = this.f882e;
        synchronized (v0Var4.f908b) {
            f3 = v0Var4.f();
        }
        boolean z4 = false;
        if (f3) {
            v0 v0Var5 = this.f882e;
            Trace.beginSection("Recomposer:animation");
            try {
                v0Var5.f907a.c(longValue);
                synchronized (N.o.f1756b) {
                    C0375B c0375b5 = ((C0074b) N.o.f1762i.get()).h;
                    if (c0375b5 != null) {
                        z3 = c0375b5.h();
                    }
                }
                if (z3) {
                    N.o.a();
                }
            } finally {
            }
        }
        v0 v0Var6 = this.f882e;
        C0375B c0375b6 = this.f883f;
        C0375B c0375b7 = this.f884g;
        ?? r22 = this.h;
        List list = this.f885i;
        C0375B c0375b8 = this.f886j;
        ?? r14 = this.f887k;
        C0375B c0375b9 = this.f888l;
        Set set = this.f889m;
        Trace.beginSection("Recomposer:recompose");
        try {
            v0.b(v0Var6);
            synchronized (v0Var6.f908b) {
                try {
                    F.d dVar = v0Var6.h;
                    int i3 = dVar.f1160f;
                    if (i3 > 0) {
                        Object[] objArr = dVar.f1158d;
                        int i4 = 0;
                        do {
                            r22.add((C0060t) objArr[i4]);
                            i4++;
                        } while (i4 < i3);
                    }
                    v0Var6.h.g();
                } finally {
                }
            }
            c0375b6.b();
            c0375b7.b();
        } finally {
        }
        while (true) {
            if (r22.isEmpty() && list.isEmpty()) {
                break;
            }
            v0 v0Var7 = v0Var6;
            C0375B c0375b10 = c0375b6;
            C0375B c0375b11 = c0375b7;
            try {
                try {
                    int size = r22.size();
                    for (?? r6 = z4; r6 < size; r6++) {
                        C0060t c0060t = (C0060t) r22.get(r6);
                        c0375b = c0375b10;
                        try {
                            C0060t a3 = v0.a(v0Var7, c0060t, c0375b);
                            if (a3 != null) {
                                r14.add(a3);
                            }
                            c0375b2 = c0375b11;
                        } catch (Exception e3) {
                            e = e3;
                            c0375b2 = c0375b11;
                            v0.l(v0Var7, e, true, 2);
                            u0.n(v0Var7, r22, list, r14, c0375b8, c0375b9, c0375b, c0375b2);
                            return C0174m.f3840a;
                        }
                        try {
                            c0375b2.a(c0060t);
                            c0375b10 = c0375b;
                            c0375b11 = c0375b2;
                        } catch (Exception e4) {
                            e = e4;
                            v0.l(v0Var7, e, true, 2);
                            u0.n(v0Var7, r22, list, r14, c0375b8, c0375b9, c0375b, c0375b2);
                            return C0174m.f3840a;
                        }
                    }
                    c0375b6 = c0375b10;
                    c0375b7 = c0375b11;
                    r22.clear();
                    if (c0375b6.h() || v0Var7.h.k()) {
                        synchronized (v0Var7.f908b) {
                            try {
                                ?? h = v0Var7.h();
                                int size2 = h.size();
                                for (?? r10 = z4; r10 < size2; r10++) {
                                    C0060t c0060t2 = (C0060t) h.get(r10);
                                    if (!c0375b7.c(c0060t2) && c0060t2.q(set)) {
                                        r22.add(c0060t2);
                                    }
                                }
                                F.d dVar2 = v0Var7.h;
                                int i5 = dVar2.f1160f;
                                ?? r11 = z4;
                                for (?? r102 = r10; r102 < i5; r102++) {
                                    C0060t c0060t3 = (C0060t) dVar2.f1158d[r102];
                                    if (!c0375b7.c(c0060t3) && !r22.contains(c0060t3)) {
                                        r22.add(c0060t3);
                                        r11++;
                                    } else if (r11 > 0) {
                                        Object[] objArr2 = dVar2.f1158d;
                                        objArr2[r102 - r11] = objArr2[r102];
                                    }
                                }
                                int i6 = i5 - r11;
                                AbstractC0239j.c0(dVar2.f1158d, i6, i5);
                                dVar2.f1160f = i6;
                            } finally {
                            }
                        }
                    }
                    if (r22.isEmpty()) {
                        try {
                            u0.p(list, v0Var7);
                            while (!list.isEmpty()) {
                                List j3 = v0Var7.j(list, c0375b6);
                                c0375b8.getClass();
                                for (Object obj2 : j3) {
                                    c0375b8.f4961b[c0375b8.d(obj2)] = obj2;
                                }
                                u0.p(list, v0Var7);
                            }
                        } catch (Exception e5) {
                            v0.l(v0Var7, e5, true, 2);
                            u0.n(v0Var7, r22, list, r14, c0375b8, c0375b9, c0375b6, c0375b7);
                        }
                    }
                    v0Var6 = v0Var7;
                    z4 = false;
                } finally {
                    r22.clear();
                }
            } catch (Exception e6) {
                e = e6;
                c0375b = c0375b10;
            }
        }
        try {
            if (!r14.isEmpty()) {
                try {
                    int size3 = r14.size();
                    for (?? r9 = z4; r9 < size3; r9++) {
                        c0375b9.a((C0060t) r14.get(r9));
                    }
                    int size4 = r14.size();
                    for (?? r92 = z4; r92 < size4; r92++) {
                        ((C0060t) r14.get(r92)).d();
                    }
                    r14.clear();
                } catch (Exception e7) {
                    v0.l(v0Var6, e7, z4, 6);
                    u0.n(v0Var6, r22, list, r14, c0375b8, c0375b9, c0375b6, c0375b7);
                    r14.clear();
                }
            }
            if (c0375b8.h()) {
                try {
                    try {
                        c0375b9.i(c0375b8);
                        Object[] objArr3 = c0375b8.f4961b;
                        long[] jArr = c0375b8.f4960a;
                        int length = jArr.length - 2;
                        v0Var = v0Var6;
                        if (length >= 0) {
                            int i7 = 0;
                            while (true) {
                                try {
                                    long j4 = jArr[i7];
                                    c0375b3 = c0375b6;
                                    c0375b4 = c0375b7;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i8 = 8 - ((~(i7 - length)) >>> 31);
                                        for (int i9 = 0; i9 < i8; i9++) {
                                            if ((j4 & 255) < 128) {
                                                try {
                                                    ((C0060t) objArr3[(i7 << 3) + i9]).f();
                                                } catch (Exception e8) {
                                                    e = e8;
                                                    v0 v0Var8 = v0Var;
                                                    v0.l(v0Var8, e, false, 6);
                                                    u0.n(v0Var8, r22, list, r14, c0375b8, c0375b9, c0375b3, c0375b4);
                                                    c0375b8.b();
                                                    return C0174m.f3840a;
                                                }
                                            }
                                            j4 >>= 8;
                                        }
                                        if (i8 != 8) {
                                            break;
                                        }
                                    }
                                    if (i7 == length) {
                                        break;
                                    }
                                    i7++;
                                    c0375b6 = c0375b3;
                                    c0375b7 = c0375b4;
                                } catch (Exception e9) {
                                    e = e9;
                                    c0375b3 = c0375b6;
                                    c0375b4 = c0375b7;
                                    v0 v0Var82 = v0Var;
                                    v0.l(v0Var82, e, false, 6);
                                    u0.n(v0Var82, r22, list, r14, c0375b8, c0375b9, c0375b3, c0375b4);
                                    c0375b8.b();
                                    return C0174m.f3840a;
                                }
                            }
                        } else {
                            c0375b3 = c0375b6;
                            c0375b4 = c0375b7;
                        }
                        v0Var2 = v0Var;
                    } catch (Exception e10) {
                        e = e10;
                        v0Var = v0Var6;
                    }
                } finally {
                    c0375b8.b();
                }
            } else {
                v0Var2 = v0Var6;
                c0375b3 = c0375b6;
                c0375b4 = c0375b7;
            }
            if (c0375b9.h()) {
                try {
                    try {
                        Object[] objArr4 = c0375b9.f4961b;
                        long[] jArr2 = c0375b9.f4960a;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i10 = 0;
                            while (true) {
                                long j5 = jArr2[i10];
                                v0Var3 = v0Var2;
                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                    for (int i12 = 0; i12 < i11; i12++) {
                                        if ((j5 & 255) < 128) {
                                            try {
                                                ((C0060t) objArr4[(i10 << 3) + i12]).g();
                                            } catch (Exception e11) {
                                                e = e11;
                                                v0Var2 = v0Var3;
                                                v0.l(v0Var2, e, false, 6);
                                                u0.n(v0Var2, r22, list, r14, c0375b8, c0375b9, c0375b3, c0375b4);
                                                c0375b9.b();
                                                return C0174m.f3840a;
                                            }
                                        }
                                        j5 >>= 8;
                                    }
                                    c3 = '\b';
                                    if (i11 != 8) {
                                        break;
                                    }
                                } else {
                                    c3 = '\b';
                                }
                                if (i10 == length2) {
                                    break;
                                }
                                i10++;
                                v0Var2 = v0Var3;
                            }
                        } else {
                            v0Var3 = v0Var2;
                        }
                        v0Var2 = v0Var3;
                    } catch (Exception e12) {
                        e = e12;
                    }
                } finally {
                    c0375b9.b();
                }
            }
            synchronized (v0Var2.f908b) {
                v0Var2.e();
            }
            N.o.k().m();
            c0375b4.b();
            c0375b3.b();
            v0Var2.f919n = null;
            return C0174m.f3840a;
        } finally {
            r14.clear();
        }
    }
}
