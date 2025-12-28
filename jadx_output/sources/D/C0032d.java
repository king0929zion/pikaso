package D;

import d2.AbstractC0239j;
import d2.C0248s;
import g2.InterfaceC0276i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import n.AbstractC0378E;
import n.C0375B;
import n0.C0444z;

/* renamed from: D.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0032d {

    /* renamed from: a, reason: collision with root package name */
    public static final C0027a0 f741a = new C0027a0("provider");

    /* renamed from: b, reason: collision with root package name */
    public static final C0027a0 f742b = new C0027a0("provider");

    /* renamed from: c, reason: collision with root package name */
    public static final C0027a0 f743c = new C0027a0("compositionLocalMap");

    /* renamed from: d, reason: collision with root package name */
    public static final C0027a0 f744d = new C0027a0("providers");

    /* renamed from: e, reason: collision with root package name */
    public static final C0027a0 f745e = new C0027a0("reference");

    /* renamed from: f, reason: collision with root package name */
    public static final C0054o f746f = new C0054o(0);

    /* renamed from: g, reason: collision with root package name */
    public static final Object f747g = new Object();
    public static final G h = new G();

    public static C0037f0 A(Object obj) {
        U u3 = U.f731i;
        int i3 = AbstractC0028b.f737b;
        return new C0037f0(obj, u3);
    }

    public static final Object B(InterfaceC0045j0 interfaceC0045j0, AbstractC0047k0 abstractC0047k0) {
        p2.g.c(abstractC0047k0, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        L.e eVar = (L.e) interfaceC0045j0;
        Object obj = eVar.get(abstractC0047k0);
        if (obj == null) {
            obj = abstractC0047k0.f780a;
        }
        return ((O0) obj).a(eVar);
    }

    public static final Z C(Object obj, C0052n c0052n) {
        Object H2 = c0052n.H();
        if (H2 == C0048l.f781a) {
            H2 = A(obj);
            c0052n.V(H2);
        }
        Z z3 = (Z) H2;
        z3.setValue(obj);
        return z3;
    }

    public static final void D(D0 d02, C0059s c0059s) {
        int i3;
        int[] iArr = d02.f666b;
        int i4 = d02.f682s;
        int f3 = d02.f(iArr, d02.p(d02.q(i4) + i4));
        for (int f4 = d02.f(d02.f666b, d02.p(d02.f682s)); f4 < f3; f4++) {
            Object obj = d02.f667c[d02.g(f4)];
            int i5 = -1;
            if (obj instanceof C0444z) {
                int o3 = d02.o() - f4;
                C0444z c0444z = (C0444z) obj;
                C0375B c0375b = (C0375B) c0059s.f858g;
                if (c0375b == null) {
                    int i6 = AbstractC0378E.f4967a;
                    c0375b = new C0375B();
                    c0059s.f858g = c0375b;
                }
                c0375b.f4961b[c0375b.d(c0444z)] = c0444z;
                c0059s.h(c0444z, o3, -1, -1);
            }
            if (obj instanceof x0) {
                int o4 = d02.o() - f4;
                x0 x0Var = (x0) obj;
                C0030c c0030c = x0Var.f929b;
                if (c0030c == null || !c0030c.a()) {
                    i3 = -1;
                } else {
                    i5 = d02.c(c0030c);
                    i3 = d02.o() - d02.f(d02.f666b, d02.p(d02.q(i5) + i5));
                }
                c0059s.h(x0Var.f928a, o4, i5, i3);
            }
            if (obj instanceof C0053n0) {
                ((C0053n0) obj).d();
            }
        }
        d02.y();
    }

    public static final void E(boolean z3) {
        if (z3) {
            return;
        }
        r("Check failed");
        throw null;
    }

    public static final int F(ArrayList arrayList, int i3, int i4) {
        int size = arrayList.size() - 1;
        int i5 = 0;
        while (i5 <= size) {
            int i6 = (i5 + size) >>> 1;
            int i7 = ((C0030c) arrayList.get(i6)).f739a;
            if (i7 < 0) {
                i7 += i4;
            }
            int f3 = p2.g.f(i7, i3);
            if (f3 < 0) {
                i5 = i6 + 1;
            } else {
                if (f3 <= 0) {
                    return i6;
                }
                size = i6 - 1;
            }
        }
        return -(i5 + 1);
    }

    public static final void G(C0052n c0052n, Object obj, o2.e eVar) {
        if (c0052n.f804L || !p2.g.a(c0052n.H(), obj)) {
            c0052n.V(obj);
            c0052n.b(obj, eVar);
        }
    }

    public static final void H(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void I(String str) {
        throw new IllegalStateException(str);
    }

    public static final int J(int i3) {
        int i4 = 306783378 & i3;
        int i5 = 613566756 & i3;
        return (i3 & (-920350135)) | (i5 >> 1) | i4 | ((i4 << 1) & i5);
    }

    public static final L.e K(C0049l0[] c0049l0Arr, InterfaceC0045j0 interfaceC0045j0, InterfaceC0045j0 interfaceC0045j02) {
        L.d dVar = new L.d(L.e.f1452g);
        for (C0049l0 c0049l0 : c0049l0Arr) {
            AbstractC0047k0 abstractC0047k0 = c0049l0.f782a;
            if (c0049l0.f787f || !((L.e) interfaceC0045j0).containsKey(abstractC0047k0)) {
                dVar.put(abstractC0047k0, abstractC0047k0.b(c0049l0, (O0) ((L.e) interfaceC0045j02).get(abstractC0047k0)));
            }
        }
        return dVar.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
    
        if (r1 == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(D.C0049l0 r10, L.a r11, D.C0052n r12, int r13) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D.C0032d.a(D.l0, L.a, D.n, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v4, types: [D.j0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(D.C0049l0[] r8, L.a r9, D.C0052n r10, int r11) {
        /*
            r0 = -1390796515(0xffffffffad1a211d, float:-8.761239E-12)
            r10.O(r0)
            D.j0 r0 = r10.m()
            D.a0 r1 = D.C0032d.f742b
            r2 = 201(0xc9, float:2.82E-43)
            r3 = 0
            r4 = 0
            r10.L(r2, r1, r3, r4)
            boolean r1 = r10.f804L
            r2 = 1
            if (r1 == 0) goto L26
            L.e r1 = L.e.f1452g
            L.e r1 = K(r8, r0, r1)
            L.e r0 = r10.U(r0, r1)
            r10.f799G = r2
        L24:
            r1 = r3
            goto L69
        L26:
            D.A0 r1 = r10.f796D
            int r5 = r1.f635g
            java.lang.Object r1 = r1.g(r5, r3)
            java.lang.String r5 = "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap"
            p2.g.c(r1, r5)
            D.j0 r1 = (D.InterfaceC0045j0) r1
            D.A0 r6 = r10.f796D
            int r7 = r6.f635g
            java.lang.Object r6 = r6.g(r7, r2)
            p2.g.c(r6, r5)
            D.j0 r6 = (D.InterfaceC0045j0) r6
            L.e r5 = K(r8, r0, r6)
            boolean r7 = r10.y()
            if (r7 == 0) goto L60
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L53
            goto L60
        L53:
            int r0 = r10.f815k
            D.A0 r5 = r10.f796D
            int r5 = r5.l()
            int r5 = r5 + r0
            r10.f815k = r5
            r0 = r1
            goto L24
        L60:
            L.e r0 = r10.U(r0, r5)
            boolean r1 = p2.g.a(r0, r1)
            r1 = r1 ^ r2
        L69:
            if (r1 == 0) goto L72
            boolean r5 = r10.f804L
            if (r5 != 0) goto L72
            r10.F(r0)
        L72:
            boolean r5 = r10.f826v
            D.M r6 = r10.f827w
            r6.b(r5)
            r10.f826v = r1
            r10.f800H = r0
            D.a0 r1 = D.C0032d.f743c
            r5 = 202(0xca, float:2.83E-43)
            r10.L(r5, r1, r3, r0)
            int r0 = r11 >> 3
            r0 = r0 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9.h(r10, r0)
            r10.q(r3)
            r10.q(r3)
            int r0 = r6.a()
            if (r0 == 0) goto L9c
            r3 = r2
        L9c:
            r10.f826v = r3
            r10.f800H = r4
            D.n0 r10 = r10.s()
            if (r10 == 0) goto Lae
            D.u r0 = new D.u
            r1 = 0
            r0.<init>(r8, r9, r11, r1)
            r10.f834d = r0
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: D.C0032d.b(D.l0[], L.a, D.n, int):void");
    }

    public static final void c(Object obj, o2.c cVar, C0052n c0052n) {
        boolean f3 = c0052n.f(obj);
        Object H2 = c0052n.H();
        if (f3 || H2 == C0048l.f781a) {
            H2 = new E(cVar);
            c0052n.V(H2);
        }
    }

    public static final void d(C0052n c0052n, Object obj, o2.e eVar) {
        v0 v0Var = (v0) c0052n.f807b;
        boolean f3 = c0052n.f(obj);
        Object H2 = c0052n.H();
        if (f3 || H2 == C0048l.f781a) {
            H2 = new S(v0Var.f925t, eVar);
            c0052n.V(H2);
        }
    }

    public static final boolean e(int[] iArr, int i3) {
        return (iArr[(i3 * 5) + 1] & 67108864) != 0;
    }

    public static final int f(int[] iArr, int i3) {
        return iArr[(i3 * 5) + 4];
    }

    public static final int g(int[] iArr, int i3) {
        return iArr[(i3 * 5) + 3];
    }

    public static final boolean h(int[] iArr, int i3) {
        return (iArr[(i3 * 5) + 1] & 268435456) != 0;
    }

    public static final boolean i(int[] iArr, int i3) {
        return (iArr[(i3 * 5) + 1] & 536870912) != 0;
    }

    public static final boolean j(int[] iArr, int i3) {
        return (iArr[(i3 * 5) + 1] & 1073741824) != 0;
    }

    public static final int k(ArrayList arrayList, int i3, int i4) {
        int F3 = F(arrayList, i3, i4);
        return F3 >= 0 ? F3 : -(F3 + 1);
    }

    public static final int l(int[] iArr, int i3) {
        return iArr[(i3 * 5) + 1] & 67108863;
    }

    public static final int m(int[] iArr, int i3) {
        return iArr[(i3 * 5) + 2];
    }

    public static final void n(ArrayList arrayList, int i3, int i4) {
        int w3 = w(i3, arrayList);
        if (w3 < 0) {
            w3 = -(w3 + 1);
        }
        while (w3 < arrayList.size() && ((N) arrayList.get(w3)).f711b < i4) {
            arrayList.remove(w3);
        }
    }

    public static final int o(int[] iArr, int i3) {
        int i4 = i3 * 5;
        return t(iArr[i4 + 1] >> 28) + iArr[i4 + 4];
    }

    public static final void p(int i3, int i4, int[] iArr) {
        E(i4 >= 0);
        iArr[(i3 * 5) + 3] = i4;
    }

    public static final void q(int i3, int i4, int[] iArr) {
        E(i4 >= 0 && i4 < 67108863);
        int i5 = (i3 * 5) + 1;
        iArr[i5] = i4 | (iArr[i5] & (-67108864));
    }

    public static final void r(String str) {
        throw new C0046k("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final void s(String str) {
        throw new C0046k("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final int t(int i3) {
        switch (i3) {
            case 0:
                return 0;
            case 1:
            case 2:
            case 4:
                return 1;
            case 3:
            case 5:
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    public static final long u() {
        return Thread.currentThread().getId();
    }

    public static final F.d v() {
        B0.a aVar = I0.f695b;
        F.d dVar = (F.d) aVar.i();
        if (dVar != null) {
            return dVar;
        }
        F.d dVar2 = new F.d(new C0050m[0]);
        aVar.E(dVar2);
        return dVar2;
    }

    public static final int w(int i3, ArrayList arrayList) {
        int size = arrayList.size() - 1;
        int i4 = 0;
        while (i4 <= size) {
            int i5 = (i4 + size) >>> 1;
            int f3 = p2.g.f(((N) arrayList.get(i5)).f711b, i3);
            if (f3 < 0) {
                i4 = i5 + 1;
            } else {
                if (f3 <= 0) {
                    return i5;
                }
                size = i5 - 1;
            }
        }
        return -(i4 + 1);
    }

    public static final V x(InterfaceC0276i interfaceC0276i) {
        V v3 = (V) interfaceC0276i.n(U.f728e);
        if (v3 != null) {
            return v3;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    public static final void y(C0052n c0052n, o2.e eVar) {
        p2.g.c(eVar, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
        p2.r.c(2, eVar);
        eVar.h(c0052n, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List z(D0 d02, int i3, D0 d03, boolean z3, boolean z4, boolean z5) {
        C0248s c0248s;
        boolean z6;
        int i4;
        int i5;
        int i6;
        int q3 = d02.q(i3);
        int i7 = i3 + q3;
        int f3 = d02.f(d02.f666b, d02.p(i3));
        int f4 = d02.f(d02.f666b, d02.p(i7));
        int i8 = f4 - f3;
        boolean z7 = i3 >= 0 && (d02.f666b[(d02.p(i3) * 5) + 1] & 201326592) != 0;
        d03.r(q3);
        d03.s(i8, d03.f682s);
        if (d02.f671g < i7) {
            d02.u(i7);
        }
        if (d02.f674k < f4) {
            d02.v(f4, i7);
        }
        int[] iArr = d03.f666b;
        int i9 = d03.f682s;
        int i10 = i9 * 5;
        AbstractC0239j.X(i10, i3 * 5, i7 * 5, d02.f666b, iArr);
        Object[] objArr = d03.f667c;
        int i11 = d03.f672i;
        AbstractC0239j.Y(d02.f667c, objArr, i11, f3, f4);
        int i12 = d03.f684u;
        iArr[i10 + 2] = i12;
        int i13 = i9 - i3;
        int i14 = i9 + q3;
        int f5 = i11 - d03.f(iArr, i9);
        int i15 = d03.f676m;
        int i16 = d03.f675l;
        int length = objArr.length;
        boolean z8 = z7;
        int i17 = i15;
        int i18 = i9;
        while (i18 < i14) {
            if (i18 != i9) {
                int i19 = (i18 * 5) + 2;
                iArr[i19] = iArr[i19] + i13;
            }
            int i20 = i14;
            int f6 = d03.f(iArr, i18) + f5;
            if (i17 < i18) {
                i5 = i9;
                i6 = 0;
            } else {
                i5 = i9;
                i6 = d03.f674k;
            }
            iArr[(i18 * 5) + 4] = D0.h(f6, i6, i16, length);
            if (i18 == i17) {
                i17++;
            }
            i18++;
            i9 = i5;
            i14 = i20;
        }
        int i21 = i9;
        int i22 = i14;
        d03.f676m = i17;
        int k3 = k(d02.f668d, i3, d02.n());
        int k4 = k(d02.f668d, i7, d02.n());
        if (k3 < k4) {
            ArrayList arrayList = d02.f668d;
            ArrayList arrayList2 = new ArrayList(k4 - k3);
            for (int i23 = k3; i23 < k4; i23++) {
                C0030c c0030c = (C0030c) arrayList.get(i23);
                c0030c.f739a += i13;
                arrayList2.add(c0030c);
            }
            d03.f668d.addAll(k(d03.f668d, d03.f682s, d03.n()), arrayList2);
            arrayList.subList(k3, k4).clear();
            c0248s = arrayList2;
        } else {
            c0248s = C0248s.f4255d;
        }
        if (!c0248s.isEmpty()) {
            HashMap hashMap = d02.f669e;
            HashMap hashMap2 = d03.f669e;
            if (hashMap != null && hashMap2 != null) {
                int size = c0248s.size();
                for (int i24 = 0; i24 < size; i24++) {
                }
            }
        }
        int i25 = d03.f684u;
        d03.E(i12);
        int w3 = d02.w(d02.f666b, i3);
        if (!z5) {
            i4 = 1;
            z6 = false;
        } else if (z3) {
            boolean z9 = w3 >= 0;
            if (z9) {
                d02.F();
                d02.a(w3 - d02.f682s);
                d02.F();
            }
            d02.a(i3 - d02.f682s);
            boolean y3 = d02.y();
            if (z9) {
                d02.B();
                d02.i();
                d02.B();
                d02.i();
            }
            z6 = y3;
            i4 = 1;
        } else {
            z6 = d02.z(i3, q3);
            i4 = 1;
            d02.A(f3, i8, i3 - 1);
        }
        if (z6) {
            r("Unexpectedly removed anchors");
            throw null;
        }
        d03.f678o += j(iArr, i21) ? i4 : l(iArr, i21);
        if (z4) {
            d03.f682s = i22;
            d03.f672i = i11 + i8;
        }
        if (z8) {
            d03.J(i12);
        }
        return c0248s;
    }
}
