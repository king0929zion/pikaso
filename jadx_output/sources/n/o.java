package N;

import D.C0034e;
import D.P0;
import d2.AbstractC0239j;
import d2.C0248s;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import n.C0375B;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final B0.a f1755a = new B0.a(3);

    /* renamed from: b, reason: collision with root package name */
    public static final Object f1756b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static l f1757c;

    /* renamed from: d, reason: collision with root package name */
    public static int f1758d;

    /* renamed from: e, reason: collision with root package name */
    public static final M1.j f1759e;

    /* renamed from: f, reason: collision with root package name */
    public static final w f1760f;

    /* renamed from: g, reason: collision with root package name */
    public static Object f1761g;
    public static Object h;

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicReference f1762i;

    /* renamed from: j, reason: collision with root package name */
    public static final h f1763j;

    /* renamed from: k, reason: collision with root package name */
    public static final C0034e f1764k;

    static {
        l lVar = l.h;
        f1757c = lVar;
        f1758d = 2;
        M1.j jVar = new M1.j();
        jVar.f1696b = new int[16];
        jVar.f1698d = new int[16];
        int[] iArr = new int[16];
        int i3 = 0;
        while (i3 < 16) {
            int i4 = i3 + 1;
            iArr[i3] = i4;
            i3 = i4;
        }
        jVar.f1699e = iArr;
        f1759e = jVar;
        w wVar = new w();
        wVar.f1792b = new int[16];
        wVar.f1793c = new P0[16];
        f1760f = wVar;
        C0248s c0248s = C0248s.f4255d;
        f1761g = c0248s;
        h = c0248s;
        int i5 = f1758d;
        f1758d = i5 + 1;
        C0074b c0074b = new C0074b(i5, lVar);
        f1757c = f1757c.e(c0074b.f1737b);
        AtomicReference atomicReference = new AtomicReference(c0074b);
        f1762i = atomicReference;
        f1763j = (h) atomicReference.get();
        f1764k = new C0034e(0);
    }

    public static final void a() {
        f(m.f1750f);
    }

    public static final o2.c b(o2.c cVar, o2.c cVar2) {
        return (cVar == null || cVar2 == null || cVar == cVar2) ? cVar == null ? cVar2 : cVar : new C0073a(cVar, cVar2, 2);
    }

    public static final HashMap c(C0075c c0075c, C0075c c0075c2, l lVar) {
        long[] jArr;
        int i3;
        l lVar2;
        long[] jArr2;
        int i4;
        l lVar3;
        C0375B w3 = c0075c2.w();
        int d3 = c0075c.d();
        if (w3 != null) {
            l d4 = c0075c2.e().e(c0075c2.d()).d(c0075c2.f1725j);
            Object[] objArr = w3.f4961b;
            long[] jArr3 = w3.f4960a;
            int length = jArr3.length - 2;
            if (length < 0) {
                return null;
            }
            int i5 = 0;
            HashMap hashMap = null;
            loop0: while (true) {
                long j3 = jArr3[i5];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8;
                    int i7 = 8 - ((~(i5 - length)) >>> 31);
                    int i8 = 0;
                    while (i8 < i7) {
                        if ((255 & j3) < 128) {
                            y yVar = (y) objArr[(i5 << 3) + i8];
                            A b3 = yVar.b();
                            A s3 = s(b3, d3, lVar);
                            if (s3 == null) {
                                jArr2 = jArr3;
                            } else {
                                jArr2 = jArr3;
                                A s4 = s(b3, d3, d4);
                                if (s4 != null && !s3.equals(s4)) {
                                    i4 = d3;
                                    lVar3 = d4;
                                    A s5 = s(b3, c0075c2.d(), c0075c2.e());
                                    if (s5 == null) {
                                        r();
                                        throw null;
                                    }
                                    A c3 = yVar.c(s4, s3, s5);
                                    if (c3 == null) {
                                        break loop0;
                                    }
                                    if (hashMap == null) {
                                        hashMap = new HashMap();
                                    }
                                    hashMap.put(s3, c3);
                                    hashMap = hashMap;
                                }
                            }
                            i4 = d3;
                            lVar3 = d4;
                        } else {
                            jArr2 = jArr3;
                            i4 = d3;
                            lVar3 = d4;
                        }
                        j3 >>= 8;
                        i8++;
                        i6 = 8;
                        jArr3 = jArr2;
                        d3 = i4;
                        d4 = lVar3;
                    }
                    jArr = jArr3;
                    i3 = d3;
                    lVar2 = d4;
                    if (i7 != i6) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                    i3 = d3;
                    lVar2 = d4;
                }
                if (i5 == length) {
                    break;
                }
                i5++;
                jArr3 = jArr;
                d3 = i3;
                d4 = lVar2;
            }
            return hashMap;
        }
        return null;
    }

    public static final void d(h hVar) {
        int i3;
        if (f1757c.c(hVar.d())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: id=");
        sb.append(hVar.d());
        sb.append(", disposed=");
        sb.append(hVar.f1738c);
        sb.append(", applied=");
        C0075c c0075c = hVar instanceof C0075c ? (C0075c) hVar : null;
        sb.append(c0075c != null ? Boolean.valueOf(c0075c.f1728m) : "read-only");
        sb.append(", lowestPin=");
        synchronized (f1756b) {
            M1.j jVar = f1759e;
            i3 = jVar.f1695a > 0 ? ((int[]) jVar.f1696b)[0] : -1;
        }
        sb.append(i3);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final l e(l lVar, int i3, int i4) {
        while (i3 < i4) {
            lVar = lVar.e(i3);
            i3++;
        }
        return lVar;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.List] */
    public static final Object f(o2.c cVar) {
        Object obj;
        C0375B c0375b;
        Object v3;
        h hVar = f1763j;
        p2.g.c(hVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.GlobalSnapshot");
        synchronized (f1756b) {
            try {
                obj = f1762i.get();
                c0375b = ((C0074b) obj).h;
                if (c0375b != null) {
                    f1764k.addAndGet(1);
                }
                v3 = v((h) obj, cVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c0375b != null) {
            try {
                ?? r4 = f1761g;
                int size = r4.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((o2.e) r4.get(i3)).h(new F.f(c0375b), obj);
                }
            } finally {
                f1764k.addAndGet(-1);
            }
        }
        synchronized (f1756b) {
            g();
            if (c0375b != null) {
                Object[] objArr = c0375b.f4961b;
                long[] jArr = c0375b.f4960a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j3 = jArr[i4];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8 - ((~(i4 - length)) >>> 31);
                            for (int i6 = 0; i6 < i5; i6++) {
                                if ((255 & j3) < 128) {
                                    q((y) objArr[(i4 << 3) + i6]);
                                }
                                j3 >>= 8;
                            }
                            if (i5 != 8) {
                                break;
                            }
                        }
                        if (i4 == length) {
                            break;
                        }
                        i4++;
                    }
                }
            }
        }
        return v3;
    }

    public static final void g() {
        w wVar = f1760f;
        int i3 = wVar.f1791a;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i4 >= i3) {
                break;
            }
            P0 p0 = ((P0[]) wVar.f1793c)[i4];
            Object obj = p0 != null ? p0.get() : null;
            if (obj != null && p((y) obj)) {
                if (i5 != i4) {
                    ((P0[]) wVar.f1793c)[i5] = p0;
                    int[] iArr = (int[]) wVar.f1792b;
                    iArr[i5] = iArr[i4];
                }
                i5++;
            }
            i4++;
        }
        for (int i6 = i5; i6 < i3; i6++) {
            ((P0[]) wVar.f1793c)[i6] = null;
            ((int[]) wVar.f1792b)[i6] = 0;
        }
        if (i5 != i3) {
            wVar.f1791a = i5;
        }
    }

    public static final h h(h hVar, o2.c cVar, boolean z3) {
        boolean z4 = hVar instanceof C0075c;
        if (z4 || hVar == null) {
            return new D(z4 ? (C0075c) hVar : null, cVar, null, false, z3);
        }
        return new E(hVar, cVar, z3);
    }

    public static final A i(A a3) {
        A s3;
        h k3 = k();
        A s4 = s(a3, k3.d(), k3.e());
        if (s4 != null) {
            return s4;
        }
        synchronized (f1756b) {
            h k4 = k();
            s3 = s(a3, k4.d(), k4.e());
        }
        if (s3 != null) {
            return s3;
        }
        r();
        throw null;
    }

    public static final A j(A a3, h hVar) {
        A s3 = s(a3, hVar.d(), hVar.e());
        if (s3 != null) {
            return s3;
        }
        r();
        throw null;
    }

    public static final h k() {
        h hVar = (h) f1755a.i();
        return hVar == null ? (h) f1762i.get() : hVar;
    }

    public static final o2.c l(o2.c cVar, o2.c cVar2, boolean z3) {
        if (!z3) {
            cVar2 = null;
        }
        return (cVar == null || cVar2 == null || cVar == cVar2) ? cVar == null ? cVar2 : cVar : new C0073a(cVar, cVar2, 1);
    }

    public static final A m(A a3, y yVar) {
        A b3 = yVar.b();
        int i3 = f1758d;
        M1.j jVar = f1759e;
        if (jVar.f1695a > 0) {
            i3 = ((int[]) jVar.f1696b)[0];
        }
        int i4 = i3 - 1;
        l lVar = l.h;
        A a4 = null;
        A a5 = null;
        while (true) {
            if (b3 != null) {
                int i5 = b3.f1700a;
                if (i5 == 0) {
                    break;
                }
                if (i5 != 0 && i5 <= i4 && !lVar.c(i5)) {
                    if (a5 == null) {
                        a5 = b3;
                    } else if (b3.f1700a >= a5.f1700a) {
                        a4 = a5;
                    }
                }
                b3 = b3.f1701b;
            } else {
                break;
            }
        }
        a4 = b3;
        if (a4 != null) {
            a4.f1700a = Integer.MAX_VALUE;
            return a4;
        }
        A b4 = a3.b();
        b4.f1700a = Integer.MAX_VALUE;
        b4.f1701b = yVar.b();
        yVar.a(b4);
        return b4;
    }

    public static final void n(h hVar, y yVar) {
        hVar.s(hVar.h() + 1);
        o2.c i3 = hVar.i();
        if (i3 != null) {
            i3.i(yVar);
        }
    }

    public static final A o(A a3, z zVar, h hVar, A a4) {
        A m2;
        if (hVar.g()) {
            hVar.n(zVar);
        }
        int d3 = hVar.d();
        if (a4.f1700a == d3) {
            return a4;
        }
        synchronized (f1756b) {
            m2 = m(a3, zVar);
        }
        m2.f1700a = d3;
        if (a4.f1700a != 1) {
            hVar.n(zVar);
        }
        return m2;
    }

    public static final boolean p(y yVar) {
        A a3;
        int i3 = f1758d;
        M1.j jVar = f1759e;
        if (jVar.f1695a > 0) {
            i3 = ((int[]) jVar.f1696b)[0];
        }
        A a4 = null;
        A a5 = null;
        int i4 = 0;
        for (A b3 = yVar.b(); b3 != null; b3 = b3.f1701b) {
            int i5 = b3.f1700a;
            if (i5 != 0) {
                if (i5 >= i3) {
                    i4++;
                } else if (a4 == null) {
                    i4++;
                    a4 = b3;
                } else {
                    if (i5 < a4.f1700a) {
                        a3 = a4;
                        a4 = b3;
                    } else {
                        a3 = b3;
                    }
                    if (a5 == null) {
                        a5 = yVar.b();
                        A a6 = a5;
                        while (true) {
                            if (a5 == null) {
                                a5 = a6;
                                break;
                            }
                            int i6 = a5.f1700a;
                            if (i6 >= i3) {
                                break;
                            }
                            if (a6.f1700a < i6) {
                                a6 = a5;
                            }
                            a5 = a5.f1701b;
                        }
                    }
                    a4.f1700a = 0;
                    a4.a(a5);
                    a4 = a3;
                }
            }
        }
        return i4 > 1;
    }

    public static final void q(y yVar) {
        if (p(yVar)) {
            w wVar = f1760f;
            int i3 = wVar.f1791a;
            int identityHashCode = System.identityHashCode(yVar);
            int i4 = -1;
            if (i3 > 0) {
                int i5 = wVar.f1791a - 1;
                int i6 = 0;
                while (true) {
                    if (i6 > i5) {
                        i4 = -(i6 + 1);
                        break;
                    }
                    int i7 = (i6 + i5) >>> 1;
                    int i8 = ((int[]) wVar.f1792b)[i7];
                    if (i8 < identityHashCode) {
                        i6 = i7 + 1;
                    } else if (i8 > identityHashCode) {
                        i5 = i7 - 1;
                    } else {
                        P0 p0 = ((P0[]) wVar.f1793c)[i7];
                        if (yVar == (p0 != null ? p0.get() : null)) {
                            i4 = i7;
                        } else {
                            int i9 = i7 - 1;
                            while (-1 < i9 && ((int[]) wVar.f1792b)[i9] == identityHashCode) {
                                P0 p02 = ((P0[]) wVar.f1793c)[i9];
                                if ((p02 != null ? p02.get() : null) == yVar) {
                                    break;
                                } else {
                                    i9--;
                                }
                            }
                            int i10 = wVar.f1791a;
                            i9 = i7 + 1;
                            while (true) {
                                if (i9 >= i10) {
                                    i9 = -(wVar.f1791a + 1);
                                    break;
                                } else {
                                    if (((int[]) wVar.f1792b)[i9] != identityHashCode) {
                                        i9 = -(i9 + 1);
                                        break;
                                    }
                                    P0 p03 = ((P0[]) wVar.f1793c)[i9];
                                    if ((p03 != null ? p03.get() : null) == yVar) {
                                        break;
                                    } else {
                                        i9++;
                                    }
                                }
                            }
                            i4 = i9;
                        }
                    }
                }
                if (i4 >= 0) {
                    return;
                }
            }
            int i11 = -(i4 + 1);
            P0[] p0Arr = (P0[]) wVar.f1793c;
            int length = p0Arr.length;
            if (i3 == length) {
                int i12 = length * 2;
                P0[] p0Arr2 = new P0[i12];
                int[] iArr = new int[i12];
                int i13 = i11 + 1;
                AbstractC0239j.Y(p0Arr, p0Arr2, i13, i11, i3);
                AbstractC0239j.a0((P0[]) wVar.f1793c, p0Arr2, 0, i11, 6);
                AbstractC0239j.X(i13, i11, i3, (int[]) wVar.f1792b, iArr);
                AbstractC0239j.Z(0, i11, 6, (int[]) wVar.f1792b, iArr);
                wVar.f1793c = p0Arr2;
                wVar.f1792b = iArr;
            } else {
                int i14 = i11 + 1;
                AbstractC0239j.Y(p0Arr, p0Arr, i14, i11, i3);
                int[] iArr2 = (int[]) wVar.f1792b;
                AbstractC0239j.X(i14, i11, i3, iArr2, iArr2);
            }
            ((P0[]) wVar.f1793c)[i11] = new P0(yVar);
            ((int[]) wVar.f1792b)[i11] = identityHashCode;
            wVar.f1791a++;
        }
    }

    public static final void r() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final A s(A a3, int i3, l lVar) {
        A a4 = null;
        while (a3 != null) {
            int i4 = a3.f1700a;
            if (i4 != 0 && i4 <= i3 && !lVar.c(i4) && (a4 == null || a4.f1700a < a3.f1700a)) {
                a4 = a3;
            }
            a3 = a3.f1701b;
        }
        if (a4 != null) {
            return a4;
        }
        return null;
    }

    public static final A t(A a3, y yVar) {
        A s3;
        h k3 = k();
        o2.c f3 = k3.f();
        if (f3 != null) {
            f3.i(yVar);
        }
        A s4 = s(a3, k3.d(), k3.e());
        if (s4 != null) {
            return s4;
        }
        synchronized (f1756b) {
            h k4 = k();
            A b3 = yVar.b();
            p2.g.c(b3, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable$lambda$9");
            s3 = s(b3, k4.d(), k4.e());
            if (s3 == null) {
                r();
                throw null;
            }
        }
        return s3;
    }

    public static final void u(int i3) {
        int i4;
        M1.j jVar = f1759e;
        int i5 = ((int[]) jVar.f1699e)[i3];
        jVar.h(i5, jVar.f1695a - 1);
        jVar.f1695a--;
        int[] iArr = (int[]) jVar.f1696b;
        int i6 = iArr[i5];
        int i7 = i5;
        while (i7 > 0) {
            int i8 = ((i7 + 1) >> 1) - 1;
            if (iArr[i8] <= i6) {
                break;
            }
            jVar.h(i8, i7);
            i7 = i8;
        }
        int[] iArr2 = (int[]) jVar.f1696b;
        int i9 = jVar.f1695a >> 1;
        while (i5 < i9) {
            int i10 = (i5 + 1) << 1;
            int i11 = i10 - 1;
            if (i10 < jVar.f1695a && (i4 = iArr2[i10]) < iArr2[i11]) {
                if (i4 >= iArr2[i5]) {
                    break;
                }
                jVar.h(i10, i5);
                i5 = i10;
            } else {
                if (iArr2[i11] >= iArr2[i5]) {
                    break;
                }
                jVar.h(i11, i5);
                i5 = i11;
            }
        }
        ((int[]) jVar.f1699e)[i3] = jVar.f1697c;
        jVar.f1697c = i3;
    }

    public static final Object v(h hVar, o2.c cVar) {
        Object i3 = cVar.i(f1757c.b(hVar.d()));
        synchronized (f1756b) {
            int i4 = f1758d;
            f1758d = i4 + 1;
            l b3 = f1757c.b(hVar.d());
            f1757c = b3;
            f1762i.set(new C0074b(i4, b3));
            hVar.c();
            f1757c = f1757c.e(i4);
        }
        return i3;
    }

    public static final A w(A a3, y yVar, h hVar) {
        A s3;
        if (hVar.g()) {
            hVar.n(yVar);
        }
        int d3 = hVar.d();
        A s4 = s(a3, d3, hVar.e());
        if (s4 == null) {
            r();
            throw null;
        }
        if (s4.f1700a == hVar.d()) {
            return s4;
        }
        synchronized (f1756b) {
            s3 = s(yVar.b(), d3, hVar.e());
            if (s3 == null) {
                r();
                throw null;
            }
            if (s3.f1700a != d3) {
                A m2 = m(s3, yVar);
                m2.a(s3);
                m2.f1700a = hVar.d();
                s3 = m2;
            }
        }
        if (s4.f1700a != 1) {
            hVar.n(yVar);
        }
        return s3;
    }
}
