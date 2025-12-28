package R;

import A2.i;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import androidx.lifecycle.InterfaceC0123d;
import androidx.lifecycle.r;
import c2.C0174m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n.AbstractC0390j;
import n.C0387g;
import n.C0398r;
import n.C0399s;
import n0.C0444z;
import o0.A0;
import o0.AbstractC0461K;
import o0.AbstractC0506t0;
import o0.C0507u;
import p2.g;
import q0.AbstractC0563a;
import q0.AbstractC0564b;
import q0.AbstractC0565c;
import q0.AbstractC0567e;
import q0.C0566d;
import t0.k;

/* loaded from: classes.dex */
public final class e implements InterfaceC0123d, View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final C0507u f2206d;

    /* renamed from: e, reason: collision with root package name */
    public final U.d f2207e;

    /* renamed from: f, reason: collision with root package name */
    public C0566d f2208f;

    /* renamed from: g, reason: collision with root package name */
    public final C0398r f2209g = new C0398r();
    public final C0399s h = new C0399s();

    /* renamed from: i, reason: collision with root package name */
    public final long f2210i = 100;

    /* renamed from: j, reason: collision with root package name */
    public int f2211j = 1;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2212k = true;

    /* renamed from: l, reason: collision with root package name */
    public final C0387g f2213l = new C0387g(0);

    /* renamed from: m, reason: collision with root package name */
    public final A2.b f2214m = i.a(1, 0, 6);

    /* renamed from: n, reason: collision with root package name */
    public final Handler f2215n = new Handler(Looper.getMainLooper());

    /* renamed from: o, reason: collision with root package name */
    public C0398r f2216o;

    /* renamed from: p, reason: collision with root package name */
    public long f2217p;

    /* renamed from: q, reason: collision with root package name */
    public final C0398r f2218q;

    /* renamed from: r, reason: collision with root package name */
    public A0 f2219r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2220s;

    /* renamed from: t, reason: collision with root package name */
    public final a f2221t;

    public e(C0507u c0507u, U.d dVar) {
        this.f2206d = c0507u;
        this.f2207e = dVar;
        C0398r c0398r = AbstractC0390j.f4992a;
        g.c(c0398r, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f2216o = c0398r;
        this.f2218q = new C0398r();
        k a3 = c0507u.getSemanticsOwner().a();
        g.c(c0398r, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f2219r = new A0(a3, c0398r);
        this.f2221t = new a(0, this);
    }

    @Override // androidx.lifecycle.InterfaceC0123d
    public final void c(r rVar) {
        n(this.f2206d.getSemanticsOwner().a());
        i();
        this.f2208f = null;
    }

    @Override // androidx.lifecycle.InterfaceC0123d
    public final void d(r rVar) {
        this.f2208f = (C0566d) this.f2207e.c();
        m(this.f2206d.getSemanticsOwner().a());
        i();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063 A[Catch: all -> 0x002e, TryCatch #1 {all -> 0x002e, blocks: (B:12:0x002a, B:13:0x004e, B:17:0x005b, B:19:0x0063, B:21:0x006c, B:22:0x006f, B:24:0x0073, B:25:0x007c, B:34:0x003c), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x008d -> B:13:0x004e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(i2.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof R.d
            if (r0 == 0) goto L13
            r0 = r9
            R.d r0 = (R.d) r0
            int r1 = r0.f2205k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2205k = r1
            goto L18
        L13:
            R.d r0 = new R.d
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f2203i
            h2.a r1 = h2.a.f4407d
            int r2 = r0.f2205k
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            A2.a r2 = r0.h
            R.e r5 = r0.f2202g
            Z0.d.U(r9)     // Catch: java.lang.Throwable -> L2e
            goto L4e
        L2e:
            r9 = move-exception
            goto L9c
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L38:
            A2.a r2 = r0.h
            R.e r5 = r0.f2202g
            Z0.d.U(r9)     // Catch: java.lang.Throwable -> L2e
            goto L5b
        L40:
            Z0.d.U(r9)
            A2.b r9 = r8.f2214m     // Catch: java.lang.Throwable -> L9a
            r9.getClass()     // Catch: java.lang.Throwable -> L9a
            A2.a r2 = new A2.a     // Catch: java.lang.Throwable -> L9a
            r2.<init>(r9)     // Catch: java.lang.Throwable -> L9a
            r5 = r8
        L4e:
            r0.f2202g = r5     // Catch: java.lang.Throwable -> L2e
            r0.h = r2     // Catch: java.lang.Throwable -> L2e
            r0.f2205k = r4     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r9 = r2.b(r0)     // Catch: java.lang.Throwable -> L2e
            if (r9 != r1) goto L5b
            return r1
        L5b:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L2e
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L2e
            if (r9 == 0) goto L90
            r2.c()     // Catch: java.lang.Throwable -> L2e
            boolean r9 = r5.h()     // Catch: java.lang.Throwable -> L2e
            if (r9 == 0) goto L6f
            r5.i()     // Catch: java.lang.Throwable -> L2e
        L6f:
            boolean r9 = r5.f2220s     // Catch: java.lang.Throwable -> L2e
            if (r9 != 0) goto L7c
            r5.f2220s = r4     // Catch: java.lang.Throwable -> L2e
            android.os.Handler r9 = r5.f2215n     // Catch: java.lang.Throwable -> L2e
            R.a r6 = r5.f2221t     // Catch: java.lang.Throwable -> L2e
            r9.post(r6)     // Catch: java.lang.Throwable -> L2e
        L7c:
            n.g r9 = r5.f2213l     // Catch: java.lang.Throwable -> L2e
            r9.clear()     // Catch: java.lang.Throwable -> L2e
            long r6 = r5.f2210i     // Catch: java.lang.Throwable -> L2e
            r0.f2202g = r5     // Catch: java.lang.Throwable -> L2e
            r0.h = r2     // Catch: java.lang.Throwable -> L2e
            r0.f2205k = r3     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r9 = y2.AbstractC0688v.c(r6, r0)     // Catch: java.lang.Throwable -> L2e
            if (r9 != r1) goto L4e
            return r1
        L90:
            n.g r9 = r5.f2213l
            r9.clear()
            c2.m r9 = c2.C0174m.f3840a
            return r9
        L98:
            r5 = r8
            goto L9c
        L9a:
            r9 = move-exception
            goto L98
        L9c:
            n.g r0 = r5.f2213l
            r0.clear()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: R.e.e(i2.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006c, code lost:
    
        if (((r5 & ((~r5) << 6)) & (-9187201950435737472L)) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006e, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(int r15) {
        /*
            Method dump skipped, instructions count: 188
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R.e.f(int):void");
    }

    public final C0398r g() {
        if (this.f2212k) {
            this.f2212k = false;
            this.f2216o = AbstractC0461K.d(this.f2206d.getSemanticsOwner());
            this.f2217p = System.currentTimeMillis();
        }
        return this.f2216o;
    }

    public final boolean h() {
        return this.f2208f != null;
    }

    public final void i() {
        String str;
        String str2;
        C0566d c0566d = this.f2208f;
        if (c0566d != null && Build.VERSION.SDK_INT >= 29) {
            C0398r c0398r = this.f2209g;
            int i3 = c0398r.f5020e;
            Object obj = c0566d.f6048a;
            String str3 = "TREAT_AS_VIEW_TREE_APPEARED";
            char c3 = 7;
            long j3 = -9187201950435737472L;
            int i4 = 0;
            View view = c0566d.f6049b;
            if (i3 != 0) {
                ArrayList arrayList = new ArrayList();
                Object[] objArr = c0398r.f5018c;
                long[] jArr = c0398r.f5016a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j4 = jArr[i5];
                        str2 = str3;
                        if ((((~j4) << 7) & j4 & j3) != j3) {
                            int i6 = 8 - ((~(i5 - length)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j4 & 255) < 128) {
                                    arrayList.add((q0.i) objArr[(i5 << 3) + i7]);
                                }
                                j4 >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            }
                        }
                        if (i5 == length) {
                            break;
                        }
                        i5++;
                        str3 = str2;
                        j3 = -9187201950435737472L;
                    }
                } else {
                    str2 = "TREAT_AS_VIEW_TREE_APPEARED";
                }
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i8 = 0; i8 < size; i8++) {
                    arrayList2.add(((q0.i) arrayList.get(i8)).f6050a);
                }
                int i9 = Build.VERSION.SDK_INT;
                if (i9 >= 34) {
                    AbstractC0565c.a(AbstractC0506t0.b(obj), arrayList2);
                } else if (i9 >= 29) {
                    ViewStructure b3 = AbstractC0564b.b(AbstractC0506t0.b(obj), view);
                    AbstractC0563a.a(b3).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
                    AbstractC0564b.d(AbstractC0506t0.b(obj), b3);
                    for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                        AbstractC0564b.d(AbstractC0506t0.b(obj), (ViewStructure) arrayList2.get(i10));
                    }
                    ViewStructure b4 = AbstractC0564b.b(AbstractC0506t0.b(obj), view);
                    str3 = str2;
                    AbstractC0563a.a(b4).putBoolean(str3, true);
                    AbstractC0564b.d(AbstractC0506t0.b(obj), b4);
                    c0398r.a();
                }
                str3 = str2;
                c0398r.a();
            }
            C0399s c0399s = this.h;
            if (c0399s.f5025d != 0) {
                ArrayList arrayList3 = new ArrayList();
                int[] iArr = c0399s.f5023b;
                long[] jArr2 = c0399s.f5022a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i11 = 0;
                    while (true) {
                        long j5 = jArr2[i11];
                        long[] jArr3 = jArr2;
                        str = str3;
                        if ((((~j5) << c3) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i12 = 8 - ((~(i11 - length2)) >>> 31);
                            for (int i13 = 0; i13 < i12; i13++) {
                                if ((j5 & 255) < 128) {
                                    arrayList3.add(Integer.valueOf(iArr[(i11 << 3) + i13]));
                                }
                                j5 >>= 8;
                            }
                            if (i12 != 8) {
                                break;
                            }
                        }
                        if (i11 == length2) {
                            break;
                        }
                        i11++;
                        jArr2 = jArr3;
                        str3 = str;
                        c3 = 7;
                    }
                } else {
                    str = str3;
                }
                ArrayList arrayList4 = new ArrayList(arrayList3.size());
                int size2 = arrayList3.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    arrayList4.add(Long.valueOf(((Number) arrayList3.get(i14)).intValue()));
                }
                long[] jArr4 = new long[arrayList4.size()];
                Iterator it = arrayList4.iterator();
                while (it.hasNext()) {
                    jArr4[i4] = ((Number) it.next()).longValue();
                    i4++;
                }
                int i15 = Build.VERSION.SDK_INT;
                if (i15 >= 34) {
                    AbstractC0564b.f(AbstractC0506t0.b(obj), AbstractC0567e.a(view), jArr4);
                } else if (i15 >= 29) {
                    ViewStructure b5 = AbstractC0564b.b(AbstractC0506t0.b(obj), view);
                    AbstractC0563a.a(b5).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
                    AbstractC0564b.d(AbstractC0506t0.b(obj), b5);
                    AbstractC0564b.f(AbstractC0506t0.b(obj), AbstractC0567e.a(view), jArr4);
                    ViewStructure b6 = AbstractC0564b.b(AbstractC0506t0.b(obj), view);
                    AbstractC0563a.a(b6).putBoolean(str, true);
                    AbstractC0564b.d(AbstractC0506t0.b(obj), b6);
                }
                c0399s.b();
            }
        }
    }

    public final void j(k kVar, A0 a02) {
        List h = k.h(kVar, true, 4);
        int size = h.size();
        for (int i3 = 0; i3 < size; i3++) {
            k kVar2 = (k) h.get(i3);
            if (g().b(kVar2.f6242g) && !a02.f5372b.c(kVar2.f6242g)) {
                m(kVar2);
            }
        }
        C0398r c0398r = this.f2218q;
        int[] iArr = c0398r.f5017b;
        long[] jArr = c0398r.f5016a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i4 = 0;
            while (true) {
                long j3 = jArr[i4];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 & j3) < 128) {
                            int i7 = iArr[(i4 << 3) + i6];
                            if (!g().b(i7)) {
                                f(i7);
                            }
                        }
                        j3 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    }
                }
                if (i4 == length) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        List h3 = k.h(kVar, true, 4);
        int size2 = h3.size();
        for (int i8 = 0; i8 < size2; i8++) {
            k kVar3 = (k) h3.get(i8);
            if (g().b(kVar3.f6242g)) {
                int i9 = kVar3.f6242g;
                if (c0398r.b(i9)) {
                    Object f3 = c0398r.f(i9);
                    if (f3 == null) {
                        Z0.d.T("node not present in pruned tree before this change");
                        throw null;
                    }
                    j(kVar3, (A0) f3);
                } else {
                    continue;
                }
            }
        }
    }

    public final void k(String str, int i3) {
        C0566d c0566d;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 29 && (c0566d = this.f2208f) != null) {
            long j3 = i3;
            Object obj = c0566d.f6048a;
            AutofillId a3 = i4 >= 29 ? AbstractC0564b.a(AbstractC0506t0.b(obj), AbstractC0567e.a(c0566d.f6049b), j3) : null;
            if (a3 == null) {
                Z0.d.T("Invalid content capture ID");
                throw null;
            }
            if (i4 >= 29) {
                AbstractC0564b.e(AbstractC0506t0.b(obj), a3, str);
            }
        }
    }

    public final void l(k kVar, A0 a02) {
        C0399s c0399s = new C0399s();
        List h = k.h(kVar, true, 4);
        int size = h.size();
        int i3 = 0;
        while (true) {
            A2.b bVar = this.f2214m;
            C0174m c0174m = C0174m.f3840a;
            C0387g c0387g = this.f2213l;
            C0444z c0444z = kVar.f6238c;
            if (i3 >= size) {
                C0399s c0399s2 = a02.f5372b;
                int[] iArr = c0399s2.f5023b;
                long[] jArr = c0399s2.f5022a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j3 = jArr[i4];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8;
                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j3 & 255) < 128) {
                                    if (!c0399s.c(iArr[(i4 << 3) + i7])) {
                                        if (c0387g.add(c0444z)) {
                                            bVar.c(c0174m);
                                            return;
                                        }
                                        return;
                                    }
                                    i5 = 8;
                                }
                                j3 >>= i5;
                            }
                            if (i6 != i5) {
                                break;
                            }
                        }
                        if (i4 == length) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                }
                List h3 = k.h(kVar, true, 4);
                int size2 = h3.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    k kVar2 = (k) h3.get(i8);
                    if (g().b(kVar2.f6242g)) {
                        Object f3 = this.f2218q.f(kVar2.f6242g);
                        if (f3 == null) {
                            Z0.d.T("node not present in pruned tree before this change");
                            throw null;
                        }
                        l(kVar2, (A0) f3);
                    }
                }
                return;
            }
            k kVar3 = (k) h.get(i3);
            if (g().b(kVar3.f6242g)) {
                C0399s c0399s3 = a02.f5372b;
                int i9 = kVar3.f6242g;
                if (!c0399s3.c(i9)) {
                    if (c0387g.add(c0444z)) {
                        bVar.c(c0174m);
                        return;
                    }
                    return;
                }
                c0399s.a(i9);
            }
            i3++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0216, code lost:
    
        if (((r5 & ((~r5) << 6)) & (-9187201950435737472L)) == 0) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0218, code lost:
    
        r15 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a3, code lost:
    
        if (r10 == null) goto L104;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(t0.k r21) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R.e.m(t0.k):void");
    }

    public final void n(k kVar) {
        if (h()) {
            f(kVar.f6242g);
            List h = k.h(kVar, true, 4);
            int size = h.size();
            for (int i3 = 0; i3 < size; i3++) {
                n((k) h.get(i3));
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f2215n.removeCallbacks(this.f2221t);
        this.f2208f = null;
    }
}
