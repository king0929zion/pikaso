package D;

import E.C0072a;
import android.os.Trace;
import c2.C0168g;
import c2.C0174m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import n.C0374A;
import n.C0375B;
import n.C0398r;
import n.C0403w;
import n.C0405y;
import y2.C0673f;
import y2.InterfaceC0672e;

/* renamed from: D.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0060t implements InterfaceC0056p {

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0058q f865d;

    /* renamed from: e, reason: collision with root package name */
    public final B0.a f866e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f867f = new AtomicReference(null);

    /* renamed from: g, reason: collision with root package name */
    public final Object f868g = new Object();
    public final C0374A h;

    /* renamed from: i, reason: collision with root package name */
    public final B0 f869i;

    /* renamed from: j, reason: collision with root package name */
    public final A.t f870j;

    /* renamed from: k, reason: collision with root package name */
    public final C0375B f871k;

    /* renamed from: l, reason: collision with root package name */
    public final C0375B f872l;

    /* renamed from: m, reason: collision with root package name */
    public final A.t f873m;

    /* renamed from: n, reason: collision with root package name */
    public final C0072a f874n;

    /* renamed from: o, reason: collision with root package name */
    public final C0072a f875o;

    /* renamed from: p, reason: collision with root package name */
    public final A.t f876p;

    /* renamed from: q, reason: collision with root package name */
    public A.t f877q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f878r;

    /* renamed from: s, reason: collision with root package name */
    public final C0.k f879s;

    /* renamed from: t, reason: collision with root package name */
    public final C0052n f880t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f881u;

    public C0060t(AbstractC0058q abstractC0058q, B0.a aVar) {
        this.f865d = abstractC0058q;
        this.f866e = aVar;
        C0374A c0374a = new C0374A(new C0375B());
        this.h = c0374a;
        B0 b02 = new B0();
        if (((Boolean) v0.f906w.get()).booleanValue()) {
            b02.f655m = new C0398r();
        }
        this.f869i = b02;
        this.f870j = new A.t(7);
        this.f871k = new C0375B();
        this.f872l = new C0375B();
        this.f873m = new A.t(7);
        C0072a c0072a = new C0072a();
        this.f874n = c0072a;
        C0072a c0072a2 = new C0072a();
        this.f875o = c0072a2;
        this.f876p = new A.t(7);
        this.f877q = new A.t(7);
        C0.k kVar = new C0.k();
        kVar.f577d = false;
        this.f879s = kVar;
        this.f880t = new C0052n(aVar, abstractC0058q, b02, c0374a, c0072a, c0072a2, this);
        boolean z3 = abstractC0058q instanceof v0;
        L.a aVar2 = AbstractC0044j.f777a;
    }

    public final void a() {
        this.f867f.set(null);
        this.f874n.f1102b.g0();
        this.f875o.f1102b.g0();
        C0374A c0374a = this.h;
        if (c0374a.f4958d.g()) {
            return;
        }
        new ArrayList();
        new ArrayList();
        new ArrayList();
        new ArrayList();
        if (c0374a.f4958d.g()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = c0374a.iterator();
            while (((w2.g) ((J.c) it).f1409f).hasNext()) {
                w0 w0Var = (w0) ((w2.g) ((J.c) it).f1409f).next();
                ((J.c) it).remove();
                w0Var.c();
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void b(Object obj, boolean z3) {
        int i3;
        Object e3 = ((C0405y) this.f870j.f175e).e(obj);
        if (e3 == null) {
            return;
        }
        boolean z4 = e3 instanceof C0375B;
        C0375B c0375b = this.f871k;
        C0375B c0375b2 = this.f872l;
        A.t tVar = this.f876p;
        if (!z4) {
            C0053n0 c0053n0 = (C0053n0) e3;
            if (tVar.D(obj, c0053n0) || c0053n0.c(obj) == 1) {
                return;
            }
            if (c0053n0.f837g == null || z3) {
                c0375b.a(c0053n0);
                return;
            } else {
                c0375b2.a(c0053n0);
                return;
            }
        }
        C0375B c0375b3 = (C0375B) e3;
        Object[] objArr = c0375b3.f4961b;
        long[] jArr = c0375b3.f4960a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i4 = 0;
        while (true) {
            long j3 = jArr[i4];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = 8;
                int i6 = 8 - ((~(i4 - length)) >>> 31);
                int i7 = 0;
                while (i7 < i6) {
                    if ((j3 & 255) < 128) {
                        C0053n0 c0053n02 = (C0053n0) objArr[(i4 << 3) + i7];
                        if (!tVar.D(obj, c0053n02) && c0053n02.c(obj) != 1) {
                            if (c0053n02.f837g == null || z3) {
                                c0375b.a(c0053n02);
                            } else {
                                c0375b2.a(c0053n02);
                            }
                        }
                        i3 = 8;
                    } else {
                        i3 = i5;
                    }
                    j3 >>= i3;
                    i7++;
                    i5 = i3;
                }
                if (i6 != i5) {
                    return;
                }
            }
            if (i4 == length) {
                return;
            } else {
                i4++;
            }
        }
    }

    public final void c(Set set, boolean z3) {
        A.t tVar;
        int i3;
        long[] jArr;
        String str;
        long[] jArr2;
        int i4;
        int i5;
        String str2;
        int i6;
        boolean c3;
        Object[] objArr;
        String str3;
        Object[] objArr2;
        String str4;
        long[] jArr3;
        int i7;
        String str5;
        long[] jArr4;
        int i8;
        int i9;
        long j3;
        boolean z4;
        long[] jArr5;
        Object[] objArr3;
        long[] jArr6;
        Object[] objArr4;
        Object[] objArr5;
        A.t tVar2;
        Object[] objArr6;
        A.t tVar3;
        int i10;
        int i11;
        int i12;
        boolean z5 = set instanceof F.f;
        A.t tVar4 = this.f873m;
        char c4 = 7;
        long j4 = -9187201950435737472L;
        int i13 = 8;
        if (z5) {
            C0375B c0375b = ((F.f) set).f1170d;
            Object[] objArr7 = c0375b.f4961b;
            long[] jArr7 = c0375b.f4960a;
            int length = jArr7.length - 2;
            if (length >= 0) {
                int i14 = 0;
                while (true) {
                    long j5 = jArr7[i14];
                    if ((((~j5) << c4) & j5 & j4) != j4) {
                        int i15 = 8 - ((~(i14 - length)) >>> 31);
                        int i16 = 0;
                        while (i16 < i15) {
                            if ((j5 & 255) < 128) {
                                Object obj = objArr7[(i14 << 3) + i16];
                                if (obj instanceof C0053n0) {
                                    ((C0053n0) obj).c(null);
                                } else {
                                    b(obj, z3);
                                    Object e3 = ((C0405y) tVar4.f175e).e(obj);
                                    if (e3 != null) {
                                        if (e3 instanceof C0375B) {
                                            C0375B c0375b2 = (C0375B) e3;
                                            Object[] objArr8 = c0375b2.f4961b;
                                            long[] jArr8 = c0375b2.f4960a;
                                            int length2 = jArr8.length - 2;
                                            if (length2 >= 0) {
                                                objArr6 = objArr7;
                                                tVar3 = tVar4;
                                                int i17 = 0;
                                                while (true) {
                                                    long j6 = jArr8[i17];
                                                    i10 = i15;
                                                    i11 = i16;
                                                    if ((((~j6) << c4) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i18 = 8 - ((~(i17 - length2)) >>> 31);
                                                        for (int i19 = 0; i19 < i18; i19++) {
                                                            if ((j6 & 255) < 128) {
                                                                b((D) objArr8[(i17 << 3) + i19], z3);
                                                            }
                                                            j6 >>= 8;
                                                        }
                                                        if (i18 != 8) {
                                                            break;
                                                        }
                                                    }
                                                    if (i17 == length2) {
                                                        break;
                                                    }
                                                    i17++;
                                                    i15 = i10;
                                                    i16 = i11;
                                                    c4 = 7;
                                                }
                                            }
                                        } else {
                                            objArr6 = objArr7;
                                            tVar3 = tVar4;
                                            i10 = i15;
                                            i11 = i16;
                                            b((D) e3, z3);
                                        }
                                        i12 = 8;
                                    }
                                }
                                objArr6 = objArr7;
                                tVar3 = tVar4;
                                i10 = i15;
                                i11 = i16;
                                i12 = 8;
                            } else {
                                objArr6 = objArr7;
                                tVar3 = tVar4;
                                i10 = i15;
                                i11 = i16;
                                i12 = i13;
                            }
                            j5 >>= i12;
                            i16 = i11 + 1;
                            i13 = i12;
                            tVar4 = tVar3;
                            i15 = i10;
                            c4 = 7;
                            objArr7 = objArr6;
                        }
                        objArr5 = objArr7;
                        tVar2 = tVar4;
                        if (i15 != i13) {
                            break;
                        }
                    } else {
                        objArr5 = objArr7;
                        tVar2 = tVar4;
                    }
                    if (i14 == length) {
                        break;
                    }
                    i14++;
                    objArr7 = objArr5;
                    tVar4 = tVar2;
                    c4 = 7;
                    j4 = -9187201950435737472L;
                    i13 = 8;
                }
            }
        } else {
            A.t tVar5 = tVar4;
            for (Object obj2 : set) {
                if (obj2 instanceof C0053n0) {
                    ((C0053n0) obj2).c(null);
                    tVar = tVar5;
                } else {
                    b(obj2, z3);
                    tVar = tVar5;
                    Object e4 = ((C0405y) tVar.f175e).e(obj2);
                    if (e4 != null) {
                        if (e4 instanceof C0375B) {
                            C0375B c0375b3 = (C0375B) e4;
                            Object[] objArr9 = c0375b3.f4961b;
                            long[] jArr9 = c0375b3.f4960a;
                            int length3 = jArr9.length - 2;
                            if (length3 >= 0) {
                                while (true) {
                                    long j7 = jArr9[i3];
                                    if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i20 = 8 - ((~(i3 - length3)) >>> 31);
                                        for (int i21 = 0; i21 < i20; i21++) {
                                            if ((j7 & 255) < 128) {
                                                b((D) objArr9[(i3 << 3) + i21], z3);
                                            }
                                            j7 >>= 8;
                                        }
                                        if (i20 != 8) {
                                            break;
                                        }
                                    }
                                    i3 = i3 != length3 ? i3 + 1 : 0;
                                }
                            }
                        } else {
                            b((D) e4, z3);
                        }
                    }
                }
                tVar5 = tVar;
            }
        }
        String str6 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>";
        A.t tVar6 = this.f870j;
        C0375B c0375b4 = this.f871k;
        if (z3) {
            C0375B c0375b5 = this.f872l;
            if (c0375b5.h()) {
                C0405y c0405y = (C0405y) tVar6.f175e;
                long[] jArr10 = c0405y.f5052a;
                int length4 = jArr10.length - 2;
                if (length4 >= 0) {
                    int i22 = 0;
                    while (true) {
                        long j8 = jArr10[i22];
                        if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i23 = 8 - ((~(i22 - length4)) >>> 31);
                            int i24 = 0;
                            while (i24 < i23) {
                                if ((j8 & 255) < 128) {
                                    int i25 = (i22 << 3) + i24;
                                    Object obj3 = c0405y.f5053b[i25];
                                    Object obj4 = c0405y.f5054c[i25];
                                    if (obj4 instanceof C0375B) {
                                        p2.g.c(obj4, str6);
                                        C0375B c0375b6 = (C0375B) obj4;
                                        Object[] objArr10 = c0375b6.f4961b;
                                        long[] jArr11 = c0375b6.f4960a;
                                        jArr4 = jArr10;
                                        int length5 = jArr11.length - 2;
                                        str5 = str6;
                                        i8 = length4;
                                        i9 = i22;
                                        if (length5 >= 0) {
                                            int i26 = 0;
                                            while (true) {
                                                long j9 = jArr11[i26];
                                                j3 = j8;
                                                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i27 = 8 - ((~(i26 - length5)) >>> 31);
                                                    int i28 = 0;
                                                    while (i28 < i27) {
                                                        if ((j9 & 255) < 128) {
                                                            jArr6 = jArr11;
                                                            int i29 = (i26 << 3) + i28;
                                                            objArr4 = objArr10;
                                                            C0053n0 c0053n0 = (C0053n0) objArr10[i29];
                                                            if (c0375b5.c(c0053n0) || c0375b4.c(c0053n0)) {
                                                                c0375b6.k(i29);
                                                            }
                                                        } else {
                                                            jArr6 = jArr11;
                                                            objArr4 = objArr10;
                                                        }
                                                        j9 >>= 8;
                                                        i28++;
                                                        jArr11 = jArr6;
                                                        objArr10 = objArr4;
                                                    }
                                                    jArr5 = jArr11;
                                                    objArr3 = objArr10;
                                                    if (i27 != 8) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr5 = jArr11;
                                                    objArr3 = objArr10;
                                                }
                                                if (i26 == length5) {
                                                    break;
                                                }
                                                i26++;
                                                j8 = j3;
                                                jArr11 = jArr5;
                                                objArr10 = objArr3;
                                            }
                                        } else {
                                            j3 = j8;
                                        }
                                        z4 = c0375b6.g();
                                    } else {
                                        str5 = str6;
                                        jArr4 = jArr10;
                                        i8 = length4;
                                        i9 = i22;
                                        j3 = j8;
                                        p2.g.c(obj4, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                        C0053n0 c0053n02 = (C0053n0) obj4;
                                        z4 = c0375b5.c(c0053n02) || c0375b4.c(c0053n02);
                                    }
                                    if (z4) {
                                        c0405y.h(i25);
                                    }
                                } else {
                                    str5 = str6;
                                    jArr4 = jArr10;
                                    i8 = length4;
                                    i9 = i22;
                                    j3 = j8;
                                }
                                j8 = j3 >> 8;
                                i24++;
                                length4 = i8;
                                jArr10 = jArr4;
                                str6 = str5;
                                i22 = i9;
                            }
                            str4 = str6;
                            jArr3 = jArr10;
                            int i30 = length4;
                            int i31 = i22;
                            if (i23 != 8) {
                                break;
                            }
                            length4 = i30;
                            i7 = i31;
                        } else {
                            str4 = str6;
                            jArr3 = jArr10;
                            i7 = i22;
                        }
                        if (i7 == length4) {
                            break;
                        }
                        i22 = i7 + 1;
                        jArr10 = jArr3;
                        str6 = str4;
                    }
                }
                c0375b5.b();
                h();
                return;
            }
        }
        String str7 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>";
        if (c0375b4.h()) {
            C0405y c0405y2 = (C0405y) tVar6.f175e;
            long[] jArr12 = c0405y2.f5052a;
            int length6 = jArr12.length - 2;
            if (length6 >= 0) {
                int i32 = 0;
                while (true) {
                    long j10 = jArr12[i32];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i33 = 8 - ((~(i32 - length6)) >>> 31);
                        int i34 = 0;
                        while (i34 < i33) {
                            if ((j10 & 255) < 128) {
                                int i35 = (i32 << 3) + i34;
                                Object obj5 = c0405y2.f5053b[i35];
                                Object obj6 = c0405y2.f5054c[i35];
                                if (obj6 instanceof C0375B) {
                                    String str8 = str7;
                                    p2.g.c(obj6, str8);
                                    C0375B c0375b7 = (C0375B) obj6;
                                    Object[] objArr11 = c0375b7.f4961b;
                                    long[] jArr13 = c0375b7.f4960a;
                                    int length7 = jArr13.length - 2;
                                    jArr2 = jArr12;
                                    i4 = i32;
                                    i6 = i34;
                                    if (length7 >= 0) {
                                        int i36 = 0;
                                        while (true) {
                                            long j11 = jArr13[i36];
                                            long[] jArr14 = jArr13;
                                            i5 = i33;
                                            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i37 = 8 - ((~(i36 - length7)) >>> 31);
                                                int i38 = 0;
                                                while (i38 < i37) {
                                                    if ((j11 & 255) < 128) {
                                                        str3 = str8;
                                                        int i39 = (i36 << 3) + i38;
                                                        objArr2 = objArr11;
                                                        if (c0375b4.c((C0053n0) objArr11[i39])) {
                                                            c0375b7.k(i39);
                                                        }
                                                    } else {
                                                        str3 = str8;
                                                        objArr2 = objArr11;
                                                    }
                                                    j11 >>= 8;
                                                    i38++;
                                                    str8 = str3;
                                                    objArr11 = objArr2;
                                                }
                                                str2 = str8;
                                                objArr = objArr11;
                                                if (i37 != 8) {
                                                    break;
                                                }
                                            } else {
                                                str2 = str8;
                                                objArr = objArr11;
                                            }
                                            if (i36 == length7) {
                                                break;
                                            }
                                            i36++;
                                            i33 = i5;
                                            jArr13 = jArr14;
                                            str8 = str2;
                                            objArr11 = objArr;
                                        }
                                    } else {
                                        str2 = str8;
                                        i5 = i33;
                                    }
                                    c3 = c0375b7.g();
                                } else {
                                    jArr2 = jArr12;
                                    i4 = i32;
                                    i5 = i33;
                                    str2 = str7;
                                    i6 = i34;
                                    p2.g.c(obj6, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                    c3 = c0375b4.c((C0053n0) obj6);
                                }
                                if (c3) {
                                    c0405y2.h(i35);
                                }
                            } else {
                                jArr2 = jArr12;
                                i4 = i32;
                                i5 = i33;
                                str2 = str7;
                                i6 = i34;
                            }
                            j10 >>= 8;
                            i34 = i6 + 1;
                            i32 = i4;
                            jArr12 = jArr2;
                            i33 = i5;
                            str7 = str2;
                        }
                        jArr = jArr12;
                        int i40 = i32;
                        str = str7;
                        if (i33 != 8) {
                            break;
                        } else {
                            i32 = i40;
                        }
                    } else {
                        jArr = jArr12;
                        str = str7;
                    }
                    if (i32 == length6) {
                        break;
                    }
                    i32++;
                    jArr12 = jArr;
                    str7 = str;
                }
            }
            h();
            c0375b4.b();
        }
    }

    public final void d() {
        synchronized (this.f868g) {
            try {
                e(this.f874n);
                k();
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.h.f4958d.g()) {
                            C0374A c0374a = this.h;
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            if (!c0374a.f4958d.g()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    Iterator it = c0374a.iterator();
                                    while (((w2.g) ((J.c) it).f1409f).hasNext()) {
                                        w0 w0Var = (w0) ((w2.g) ((J.c) it).f1409f).next();
                                        ((J.c) it).remove();
                                        w0Var.c();
                                    }
                                    Trace.endSection();
                                } catch (Throwable th2) {
                                    Trace.endSection();
                                    throw th2;
                                }
                            }
                        }
                        throw th;
                    } catch (Exception e3) {
                        a();
                        throw e3;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x01f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(E.C0072a r32) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D.C0060t.e(E.a):void");
    }

    public final void f() {
        synchronized (this.f868g) {
            try {
                if (this.f875o.f1102b.j0()) {
                    e(this.f875o);
                }
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.h.f4958d.g()) {
                            C0374A c0374a = this.h;
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            if (!c0374a.f4958d.g()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    Iterator it = c0374a.iterator();
                                    while (((w2.g) ((J.c) it).f1409f).hasNext()) {
                                        w0 w0Var = (w0) ((w2.g) ((J.c) it).f1409f).next();
                                        ((J.c) it).remove();
                                        w0Var.c();
                                    }
                                    Trace.endSection();
                                } catch (Throwable th2) {
                                    Trace.endSection();
                                    throw th2;
                                }
                            }
                        }
                        throw th;
                    } catch (Exception e3) {
                        a();
                        throw e3;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public final void g() {
        synchronized (this.f868g) {
            try {
                this.f880t.f825u = null;
                if (!this.h.f4958d.g()) {
                    C0374A c0374a = this.h;
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    if (!c0374a.f4958d.g()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            Iterator it = c0374a.iterator();
                            while (((w2.g) ((J.c) it).f1409f).hasNext()) {
                                w0 w0Var = (w0) ((w2.g) ((J.c) it).f1409f).next();
                                ((J.c) it).remove();
                                w0Var.c();
                            }
                            Trace.endSection();
                        } finally {
                        }
                    }
                }
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.h.f4958d.g()) {
                            C0374A c0374a2 = this.h;
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            if (!c0374a2.f4958d.g()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    Iterator it2 = c0374a2.iterator();
                                    while (((w2.g) ((J.c) it2).f1409f).hasNext()) {
                                        w0 w0Var2 = (w0) ((w2.g) ((J.c) it2).f1409f).next();
                                        ((J.c) it2).remove();
                                        w0Var2.c();
                                    }
                                    Trace.endSection();
                                } finally {
                                }
                            }
                        }
                        throw th;
                    } catch (Exception e3) {
                        a();
                        throw e3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void h() {
        long[] jArr;
        long[] jArr2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z3;
        Object[] objArr;
        long[] jArr3;
        Object[] objArr2;
        long[] jArr4;
        C0060t c0060t = this;
        C0405y c0405y = (C0405y) c0060t.f873m.f175e;
        long[] jArr5 = c0405y.f5052a;
        int length = jArr5.length - 2;
        long j3 = 255;
        char c3 = 7;
        long j4 = -9187201950435737472L;
        int i7 = 8;
        if (length >= 0) {
            int i8 = 0;
            while (true) {
                long j5 = jArr5[i8];
                if ((((~j5) << c3) & j5 & j4) != j4) {
                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                    int i10 = 0;
                    while (i10 < i9) {
                        if ((j5 & j3) < 128) {
                            int i11 = (i8 << 3) + i10;
                            Object obj = c0405y.f5053b[i11];
                            Object obj2 = c0405y.f5054c[i11];
                            boolean z4 = obj2 instanceof C0375B;
                            A.t tVar = c0060t.f870j;
                            if (z4) {
                                p2.g.c(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>");
                                C0375B c0375b = (C0375B) obj2;
                                Object[] objArr3 = c0375b.f4961b;
                                long[] jArr6 = c0375b.f4960a;
                                int length2 = jArr6.length - 2;
                                jArr2 = jArr5;
                                i3 = length;
                                if (length2 >= 0) {
                                    int i12 = 0;
                                    while (true) {
                                        long j6 = jArr6[i12];
                                        i4 = i9;
                                        i5 = i10;
                                        if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                            int i14 = 0;
                                            while (i14 < i13) {
                                                if ((j6 & 255) < 128) {
                                                    jArr4 = jArr6;
                                                    int i15 = (i12 << 3) + i14;
                                                    objArr2 = objArr3;
                                                    if (!((C0405y) tVar.f175e).b((D) objArr3[i15])) {
                                                        c0375b.k(i15);
                                                    }
                                                } else {
                                                    objArr2 = objArr3;
                                                    jArr4 = jArr6;
                                                }
                                                j6 >>= 8;
                                                i14++;
                                                jArr6 = jArr4;
                                                objArr3 = objArr2;
                                            }
                                            objArr = objArr3;
                                            jArr3 = jArr6;
                                            if (i13 != 8) {
                                                break;
                                            }
                                        } else {
                                            objArr = objArr3;
                                            jArr3 = jArr6;
                                        }
                                        if (i12 == length2) {
                                            break;
                                        }
                                        i12++;
                                        i9 = i4;
                                        i10 = i5;
                                        jArr6 = jArr3;
                                        objArr3 = objArr;
                                    }
                                } else {
                                    i4 = i9;
                                    i5 = i10;
                                }
                                z3 = c0375b.g();
                            } else {
                                jArr2 = jArr5;
                                i3 = length;
                                i4 = i9;
                                i5 = i10;
                                p2.g.c(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                z3 = !((C0405y) tVar.f175e).b((D) obj2);
                            }
                            if (z3) {
                                c0405y.h(i11);
                            }
                            i6 = 8;
                        } else {
                            jArr2 = jArr5;
                            i3 = length;
                            i4 = i9;
                            i5 = i10;
                            i6 = i7;
                        }
                        j5 >>= i6;
                        i10 = i5 + 1;
                        i7 = i6;
                        jArr5 = jArr2;
                        length = i3;
                        i9 = i4;
                        j3 = 255;
                        c0060t = this;
                    }
                    jArr = jArr5;
                    int i16 = length;
                    if (i9 != i7) {
                        break;
                    } else {
                        length = i16;
                    }
                } else {
                    jArr = jArr5;
                }
                if (i8 == length) {
                    break;
                }
                i8++;
                c0060t = this;
                jArr5 = jArr;
                j3 = 255;
                c3 = 7;
                j4 = -9187201950435737472L;
                i7 = 8;
            }
        }
        C0375B c0375b2 = this.f872l;
        if (!c0375b2.h()) {
            return;
        }
        Object[] objArr4 = c0375b2.f4961b;
        long[] jArr7 = c0375b2.f4960a;
        int length3 = jArr7.length - 2;
        if (length3 < 0) {
            return;
        }
        int i17 = 0;
        while (true) {
            long j7 = jArr7[i17];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i18 = 8 - ((~(i17 - length3)) >>> 31);
                for (int i19 = 0; i19 < i18; i19++) {
                    if ((j7 & 255) < 128) {
                        int i20 = (i17 << 3) + i19;
                        if (!(((C0053n0) objArr4[i20]).f837g != null)) {
                            c0375b2.k(i20);
                        }
                    }
                    j7 >>= 8;
                }
                if (i18 != 8) {
                    return;
                }
            }
            if (i17 == length3) {
                return;
            } else {
                i17++;
            }
        }
    }

    public final void i(L.a aVar) {
        try {
            synchronized (this.f868g) {
                j();
                A.t tVar = this.f877q;
                this.f877q = new A.t(7);
                try {
                    p();
                    C0052n c0052n = this.f880t;
                    if (!c0052n.f810e.f1102b.i0()) {
                        C0032d.r("Expected applyChanges() to have been called");
                        throw null;
                    }
                    c0052n.o(tVar, aVar);
                } catch (Exception e3) {
                    this.f877q = tVar;
                    throw e3;
                }
            }
        } catch (Throwable th) {
            try {
                if (!this.h.f4958d.g()) {
                    C0374A c0374a = this.h;
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    if (!c0374a.f4958d.g()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            Iterator it = c0374a.iterator();
                            while (((w2.g) ((J.c) it).f1409f).hasNext()) {
                                w0 w0Var = (w0) ((w2.g) ((J.c) it).f1409f).next();
                                ((J.c) it).remove();
                                w0Var.c();
                            }
                            Trace.endSection();
                        } catch (Throwable th2) {
                            Trace.endSection();
                            throw th2;
                        }
                    }
                }
                throw th;
            } catch (Exception e4) {
                a();
                throw e4;
            }
        }
    }

    public final void j() {
        AtomicReference atomicReference = this.f867f;
        Object obj = C0032d.f747g;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                C0032d.s("pending composition has not been applied");
                throw null;
            }
            if (andSet instanceof Set) {
                c((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                C0032d.s("corrupt pendingModifications drain: " + atomicReference);
                throw null;
            }
            for (Set set : (Set[]) andSet) {
                c(set, true);
            }
        }
    }

    public final void k() {
        AtomicReference atomicReference = this.f867f;
        Object andSet = atomicReference.getAndSet(null);
        if (p2.g.a(andSet, C0032d.f747g)) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                c(set, false);
            }
            return;
        }
        if (andSet == null) {
            C0032d.s("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw null;
        }
        C0032d.s("corrupt pendingModifications drain: " + atomicReference);
        throw null;
    }

    public final void l(ArrayList arrayList) {
        if (arrayList.size() > 0) {
            ((X) ((C0168g) arrayList.get(0)).f3833d).getClass();
            throw null;
        }
        C0032d.E(true);
        try {
            C0052n c0052n = this.f880t;
            c0052n.getClass();
            try {
                c0052n.z(arrayList);
                c0052n.i();
            } catch (Throwable th) {
                c0052n.a();
                throw th;
            }
        } catch (Throwable th2) {
            C0374A c0374a = this.h;
            try {
                if (!c0374a.f4958d.g()) {
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    if (!c0374a.f4958d.g()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            Iterator it = c0374a.iterator();
                            while (((w2.g) ((J.c) it).f1409f).hasNext()) {
                                w0 w0Var = (w0) ((w2.g) ((J.c) it).f1409f).next();
                                ((J.c) it).remove();
                                w0Var.c();
                            }
                            Trace.endSection();
                        } catch (Throwable th3) {
                            Trace.endSection();
                            throw th3;
                        }
                    }
                }
                throw th2;
            } catch (Exception e3) {
                a();
                throw e3;
            }
        }
    }

    public final int m(C0053n0 c0053n0, Object obj) {
        InterfaceC0672e interfaceC0672e;
        int F3;
        int i3 = c0053n0.f831a;
        if ((i3 & 2) != 0) {
            c0053n0.f831a = i3 | 4;
        }
        C0030c c0030c = c0053n0.f833c;
        if (c0030c != null && c0030c.a()) {
            B0 b02 = this.f869i;
            b02.getClass();
            if (!(c0030c.a() && (F3 = C0032d.F(b02.f653k, c0030c.f739a, b02.f648e)) >= 0 && p2.g.a(b02.f653k.get(F3), c0030c))) {
                synchronized (this.f868g) {
                }
                return 1;
            }
            if (c0053n0.f834d != null) {
                synchronized (this.f868g) {
                    try {
                        C0052n c0052n = this.f880t;
                        if (c0052n.f795C && c0052n.R(c0053n0, obj)) {
                            return 4;
                        }
                        p();
                        if (obj == null) {
                            ((C0405y) this.f877q.f175e).j(c0053n0, U.h);
                        } else if (obj instanceof D) {
                            Object e3 = ((C0405y) this.f877q.f175e).e(c0053n0);
                            if (e3 != null) {
                                if (e3 instanceof C0375B) {
                                    C0375B c0375b = (C0375B) e3;
                                    Object[] objArr = c0375b.f4961b;
                                    long[] jArr = c0375b.f4960a;
                                    int length = jArr.length - 2;
                                    if (length >= 0) {
                                        int i4 = 0;
                                        loop0: while (true) {
                                            long j3 = jArr[i4];
                                            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i5 = 8 - ((~(i4 - length)) >>> 31);
                                                for (int i6 = 0; i6 < i5; i6++) {
                                                    if ((j3 & 255) < 128 && objArr[(i4 << 3) + i6] == U.h) {
                                                        break loop0;
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
                                } else if (e3 == U.h) {
                                }
                            }
                            this.f877q.r(c0053n0, obj);
                        } else {
                            ((C0405y) this.f877q.f175e).j(c0053n0, U.h);
                        }
                        v0 v0Var = (v0) this.f865d;
                        synchronized (v0Var.f908b) {
                            if (v0Var.h.h(this)) {
                                interfaceC0672e = null;
                            } else {
                                v0Var.h.b(this);
                                interfaceC0672e = v0Var.e();
                            }
                        }
                        if (interfaceC0672e != null) {
                            ((C0673f) interfaceC0672e).t(C0174m.f3840a);
                        }
                        return this.f880t.f795C ? 3 : 2;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return 1;
    }

    public final void n() {
        C0060t c0060t;
        synchronized (this.f868g) {
            try {
                for (Object obj : this.f869i.f649f) {
                    C0053n0 c0053n0 = obj instanceof C0053n0 ? (C0053n0) obj : null;
                    if (c0053n0 != null && (c0060t = c0053n0.f832b) != null) {
                        c0060t.m(c0053n0, null);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o(Object obj) {
        Object e3 = ((C0405y) this.f870j.f175e).e(obj);
        if (e3 == null) {
            return;
        }
        boolean z3 = e3 instanceof C0375B;
        A.t tVar = this.f876p;
        if (!z3) {
            C0053n0 c0053n0 = (C0053n0) e3;
            if (c0053n0.c(obj) == 4) {
                tVar.r(obj, c0053n0);
                return;
            }
            return;
        }
        C0375B c0375b = (C0375B) e3;
        Object[] objArr = c0375b.f4961b;
        long[] jArr = c0375b.f4960a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j3 = jArr[i3];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8 - ((~(i3 - length)) >>> 31);
                for (int i5 = 0; i5 < i4; i5++) {
                    if ((255 & j3) < 128) {
                        C0053n0 c0053n02 = (C0053n0) objArr[(i3 << 3) + i5];
                        if (c0053n02.c(obj) == 4) {
                            tVar.r(obj, c0053n02);
                        }
                    }
                    j3 >>= 8;
                }
                if (i4 != 8) {
                    return;
                }
            }
            if (i3 == length) {
                return;
            } else {
                i3++;
            }
        }
    }

    public final void p() {
        if (this.f879s.f577d) {
            return;
        }
        p2.g.a(null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(java.util.Set r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            boolean r2 = r1 instanceof F.f
            A.t r3 = r0.f873m
            A.t r4 = r0.f870j
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L66
            F.f r1 = (F.f) r1
            n.B r1 = r1.f1170d
            java.lang.Object[] r2 = r1.f4961b
            long[] r1 = r1.f4960a
            int r7 = r1.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L8b
            r8 = r5
        L1c:
            r9 = r1[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L61
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r5
        L36:
            if (r13 >= r11) goto L5f
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.32E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L5b
            int r14 = r8 << 3
            int r14 = r14 + r13
            r14 = r2[r14]
            java.lang.Object r15 = r4.f175e
            n.y r15 = (n.C0405y) r15
            boolean r15 = r15.b(r14)
            if (r15 != 0) goto L5a
            java.lang.Object r15 = r3.f175e
            n.y r15 = (n.C0405y) r15
            boolean r14 = r15.b(r14)
            if (r14 == 0) goto L5b
        L5a:
            return r6
        L5b:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L36
        L5f:
            if (r11 != r12) goto L8b
        L61:
            if (r8 == r7) goto L8b
            int r8 = r8 + 1
            goto L1c
        L66:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L6c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L8b
            java.lang.Object r2 = r1.next()
            java.lang.Object r7 = r4.f175e
            n.y r7 = (n.C0405y) r7
            boolean r7 = r7.b(r2)
            if (r7 != 0) goto L8a
            java.lang.Object r7 = r3.f175e
            n.y r7 = (n.C0405y) r7
            boolean r2 = r7.b(r2)
            if (r2 == 0) goto L6c
        L8a:
            return r6
        L8b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: D.C0060t.q(java.util.Set):boolean");
    }

    public final boolean r() {
        boolean C3;
        synchronized (this.f868g) {
            try {
                j();
                try {
                    A.t tVar = this.f877q;
                    this.f877q = new A.t(7);
                    try {
                        p();
                        C3 = this.f880t.C(tVar);
                        if (!C3) {
                            k();
                        }
                    } catch (Exception e3) {
                        this.f877q = tVar;
                        throw e3;
                    }
                } catch (Throwable th) {
                    try {
                        if (!this.h.f4958d.g()) {
                            C0374A c0374a = this.h;
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            if (!c0374a.f4958d.g()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    Iterator it = c0374a.iterator();
                                    while (((w2.g) ((J.c) it).f1409f).hasNext()) {
                                        w0 w0Var = (w0) ((w2.g) ((J.c) it).f1409f).next();
                                        ((J.c) it).remove();
                                        w0Var.c();
                                    }
                                    Trace.endSection();
                                } catch (Throwable th2) {
                                    Trace.endSection();
                                    throw th2;
                                }
                            }
                        }
                        throw th;
                    } catch (Exception e4) {
                        a();
                        throw e4;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return C3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.Set[]] */
    public final void s(F.f fVar) {
        F.f fVar2;
        while (true) {
            Object obj = this.f867f.get();
            if (obj == null ? true : obj.equals(C0032d.f747g)) {
                fVar2 = fVar;
            } else if (obj instanceof Set) {
                fVar2 = new Set[]{obj, fVar};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.f867f).toString());
                }
                p2.g.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                Set[] setArr = (Set[]) obj;
                p2.g.e(setArr, "<this>");
                int length = setArr.length;
                ?? copyOf = Arrays.copyOf(setArr, length + 1);
                copyOf[length] = fVar;
                fVar2 = copyOf;
            }
            AtomicReference atomicReference = this.f867f;
            while (!atomicReference.compareAndSet(obj, fVar2)) {
                if (atomicReference.get() != obj) {
                    break;
                }
            }
            if (obj == null) {
                synchronized (this.f868g) {
                    k();
                }
                return;
            }
            return;
        }
    }

    public final void t(Object obj) {
        C0053n0 w3;
        boolean z3;
        boolean z4;
        int i3;
        int i4;
        C0052n c0052n = this.f880t;
        if (c0052n.f828x <= 0 && (w3 = c0052n.w()) != null) {
            boolean z5 = true;
            int i5 = w3.f831a | 1;
            w3.f831a = i5;
            if ((i5 & 32) == 0) {
                C0403w c0403w = w3.f836f;
                if (c0403w == null) {
                    c0403w = new C0403w();
                    w3.f836f = c0403w;
                }
                int i6 = w3.f835e;
                int b3 = c0403w.b(obj);
                if (b3 < 0) {
                    b3 = ~b3;
                    i4 = -1;
                } else {
                    i4 = c0403w.f5046c[b3];
                }
                c0403w.f5045b[b3] = obj;
                c0403w.f5046c[b3] = i6;
                if (i4 == w3.f835e) {
                    return;
                }
            }
            if (obj instanceof N.z) {
                ((N.z) obj).f(1);
            }
            this.f870j.r(obj, w3);
            if (obj instanceof D) {
                D d3 = (D) obj;
                B h = d3.h();
                A.t tVar = this.f873m;
                tVar.F(obj);
                C0403w c0403w2 = h.f644e;
                Object[] objArr = c0403w2.f5045b;
                long[] jArr = c0403w2.f5044a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i7 = 0;
                    while (true) {
                        long j3 = jArr[i7];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i8 = 8;
                            int i9 = 8 - ((~(i7 - length)) >>> 31);
                            int i10 = 0;
                            while (i10 < i9) {
                                if ((j3 & 255) < 128) {
                                    N.y yVar = (N.y) objArr[(i7 << 3) + i10];
                                    if (yVar instanceof N.z) {
                                        z4 = true;
                                        ((N.z) yVar).f(1);
                                    } else {
                                        z4 = true;
                                    }
                                    tVar.r(yVar, obj);
                                    i3 = 8;
                                } else {
                                    z4 = z5;
                                    i3 = i8;
                                }
                                j3 >>= i3;
                                i10++;
                                i8 = i3;
                                z5 = z4;
                            }
                            z3 = z5;
                            if (i9 != i8) {
                                break;
                            }
                        } else {
                            z3 = z5;
                        }
                        if (i7 == length) {
                            break;
                        }
                        i7++;
                        z5 = z3;
                    }
                }
                Object obj2 = h.f645f;
                C0405y c0405y = w3.f837g;
                if (c0405y == null) {
                    c0405y = new C0405y();
                    w3.f837g = c0405y;
                }
                c0405y.j(d3, obj2);
            }
        }
    }

    public final void u(Object obj) {
        synchronized (this.f868g) {
            try {
                o(obj);
                Object e3 = ((C0405y) this.f873m.f175e).e(obj);
                if (e3 != null) {
                    if (e3 instanceof C0375B) {
                        C0375B c0375b = (C0375B) e3;
                        Object[] objArr = c0375b.f4961b;
                        long[] jArr = c0375b.f4960a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i3 = 0;
                            while (true) {
                                long j3 = jArr[i3];
                                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                                    for (int i5 = 0; i5 < i4; i5++) {
                                        if ((255 & j3) < 128) {
                                            o((D) objArr[(i3 << 3) + i5]);
                                        }
                                        j3 >>= 8;
                                    }
                                    if (i4 != 8) {
                                        break;
                                    }
                                }
                                if (i3 == length) {
                                    break;
                                } else {
                                    i3++;
                                }
                            }
                        }
                    } else {
                        o((D) e3);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
