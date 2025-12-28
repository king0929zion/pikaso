package n0;

import o0.C0507u;
import p.AbstractC0537f;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public final C0444z f5177a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5179c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5180d;

    /* renamed from: i, reason: collision with root package name */
    public G0.a f5184i;

    /* renamed from: b, reason: collision with root package name */
    public final B2.i f5178b = new B2.i(12);

    /* renamed from: e, reason: collision with root package name */
    public final B2.i f5181e = new B2.i(14);

    /* renamed from: f, reason: collision with root package name */
    public final F.d f5182f = new F.d(new C0444z[16]);

    /* renamed from: g, reason: collision with root package name */
    public final long f5183g = 1;
    public final F.d h = new F.d(new N[16]);

    public O(C0444z c0444z) {
        this.f5177a = c0444z;
    }

    public static boolean b(C0444z c0444z, G0.a aVar) {
        boolean V2;
        C0444z c0444z2 = c0444z.f5302f;
        if (c0444z2 == null) {
            return false;
        }
        C0415I c0415i = c0444z.f5320y;
        if (aVar != null) {
            if (c0444z2 != null) {
                C0412F c0412f = c0415i.f5147r;
                p2.g.b(c0412f);
                V2 = c0412f.V(aVar.f1251a);
            }
            V2 = false;
        } else {
            C0412F c0412f2 = c0415i.f5147r;
            G0.a aVar2 = c0412f2 != null ? c0412f2.f5091o : null;
            if (aVar2 != null && c0444z2 != null) {
                p2.g.b(c0412f2);
                V2 = c0412f2.V(aVar2.f1251a);
            }
            V2 = false;
        }
        C0444z k3 = c0444z.k();
        if (V2 && k3 != null) {
            if (k3.f5302f == null) {
                C0444z.F(k3, false, 3);
            } else if (c0444z.j() == 1) {
                C0444z.D(k3, false, 3);
            } else if (c0444z.j() == 2) {
                k3.C(false);
            }
        }
        return V2;
    }

    public static boolean c(C0444z c0444z, G0.a aVar) {
        boolean B3;
        if (aVar != null) {
            if (c0444z.f5298F == 3) {
                c0444z.c();
            }
            B3 = c0444z.f5320y.f5146q.V(aVar.f1251a);
        } else {
            B3 = C0444z.B(c0444z);
        }
        C0444z k3 = c0444z.k();
        if (B3 && k3 != null) {
            int i3 = c0444z.f5320y.f5146q.f5116n;
            if (i3 == 1) {
                C0444z.F(k3, false, 3);
            } else if (i3 == 2) {
                k3.E(false);
            }
        }
        return B3;
    }

    public static boolean f(C0444z c0444z) {
        return c0444z.f5320y.f5133c && g(c0444z);
    }

    public static boolean g(C0444z c0444z) {
        C0413G c0413g = c0444z.f5320y.f5146q;
        return c0413g.f5116n == 1 || c0413g.f5124v.e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
    
        if (r4 < r7) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(boolean r7) {
        /*
            r6 = this;
            B2.i r0 = r6.f5181e
            r1 = 1
            if (r7 == 0) goto L13
            java.lang.Object r7 = r0.f316e
            F.d r7 = (F.d) r7
            r7.g()
            n0.z r2 = r6.f5177a
            r7.b(r2)
            r2.f5296D = r1
        L13:
            n0.c0 r7 = n0.c0.f5235b
            java.lang.Object r2 = r0.f316e
            F.d r2 = (F.d) r2
            r2.o(r7)
            int r7 = r2.f1160f
            java.lang.Object r3 = r0.f317f
            n0.z[] r3 = (n0.C0444z[]) r3
            if (r3 == 0) goto L27
            int r4 = r3.length
            if (r4 >= r7) goto L2f
        L27:
            r3 = 16
            int r3 = java.lang.Math.max(r3, r7)
            n0.z[] r3 = new n0.C0444z[r3]
        L2f:
            r4 = 0
            r0.f317f = r4
            r4 = 0
        L33:
            if (r4 >= r7) goto L3e
            java.lang.Object[] r5 = r2.f1158d
            r5 = r5[r4]
            r3[r4] = r5
            int r4 = r4 + 1
            goto L33
        L3e:
            r2.g()
            int r7 = r7 - r1
        L42:
            r1 = -1
            if (r1 >= r7) goto L54
            r1 = r3[r7]
            p2.g.b(r1)
            boolean r2 = r1.f5296D
            if (r2 == 0) goto L51
            B2.i.h(r1)
        L51:
            int r7 = r7 + (-1)
            goto L42
        L54:
            r0.f317f = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.O.a(boolean):void");
    }

    public final void d(C0444z c0444z, boolean z3) {
        B2.i iVar = this.f5178b;
        if (((p0) ((B2.i) (z3 ? iVar.f316e : iVar.f317f)).f317f).isEmpty()) {
            return;
        }
        if (!this.f5179c) {
            Z0.d.S("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
            throw null;
        }
        if (z3 ? c0444z.f5320y.f5136f : c0444z.f5320y.f5133c) {
            Z0.d.R("node not yet measured");
            throw null;
        }
        e(c0444z, z3);
    }

    public final void e(C0444z c0444z, boolean z3) {
        C0412F c0412f;
        C0407A c0407a;
        F.d n2 = c0444z.n();
        int i3 = n2.f1160f;
        B2.i iVar = this.f5178b;
        boolean z4 = true;
        if (i3 > 0) {
            Object[] objArr = n2.f1158d;
            int i4 = 0;
            do {
                C0444z c0444z2 = (C0444z) objArr[i4];
                if ((!z3 && g(c0444z2)) || (z3 && (c0444z2.j() == 1 || ((c0412f = c0444z2.f5320y.f5147r) != null && (c0407a = c0412f.f5095s) != null && c0407a.e())))) {
                    boolean n3 = AbstractC0409C.n(c0444z2);
                    C0415I c0415i = c0444z2.f5320y;
                    if (n3 && !z3) {
                        if (c0415i.f5136f && ((p0) ((B2.i) iVar.f316e).f317f).contains(c0444z2)) {
                            j(c0444z2, true, false);
                        } else {
                            d(c0444z2, true);
                        }
                    }
                    if (z3 ? c0415i.f5136f : c0415i.f5133c) {
                        boolean contains = ((p0) ((B2.i) iVar.f316e).f317f).contains(c0444z2);
                        if (!z3) {
                            contains = contains || ((p0) ((B2.i) iVar.f317f).f317f).contains(c0444z2);
                        }
                        if (contains) {
                            j(c0444z2, z3, false);
                        }
                    }
                    if (!(z3 ? c0415i.f5136f : c0415i.f5133c)) {
                        e(c0444z2, z3);
                    }
                }
                i4++;
            } while (i4 < i3);
        }
        C0415I c0415i2 = c0444z.f5320y;
        if (z3 ? c0415i2.f5136f : c0415i2.f5133c) {
            boolean contains2 = ((p0) ((B2.i) iVar.f316e).f317f).contains(c0444z);
            if (z3) {
                z4 = contains2;
            } else if (!contains2 && !((p0) ((B2.i) iVar.f317f).f317f).contains(c0444z)) {
                z4 = false;
            }
            if (z4) {
                j(c0444z, z3, false);
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r13v1 P.k, still in use, count: 2, list:
          (r13v1 P.k) from 0x009d: IF  (r13v1 P.k) == (null P.k)  -> B:83:0x0105 A[HIDDEN]
          (r13v1 P.k) from 0x00a1: PHI (r13v2 P.k) = (r13v1 P.k) binds: [B:90:0x009d] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:125)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1085)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1085)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1085)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1085)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [P.k] */
    public final boolean h(o2.a r17) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.O.h(o2.a):boolean");
    }

    public final void i() {
        B2.i iVar = this.f5178b;
        if (iVar.l()) {
            C0444z c0444z = this.f5177a;
            if (!c0444z.u()) {
                Z0.d.R("performMeasureAndLayout called with unattached root");
                throw null;
            }
            if (!c0444z.v()) {
                Z0.d.R("performMeasureAndLayout called with unplaced root");
                throw null;
            }
            if (this.f5179c) {
                Z0.d.R("performMeasureAndLayout called during measure layout");
                throw null;
            }
            if (this.f5184i != null) {
                this.f5179c = true;
                this.f5180d = false;
                try {
                    if (!((p0) ((B2.i) iVar.f316e).f317f).isEmpty()) {
                        if (c0444z.f5302f != null) {
                            l(c0444z, true);
                        } else {
                            k(c0444z);
                        }
                    }
                    l(c0444z, false);
                    this.f5179c = false;
                    this.f5180d = false;
                } catch (Throwable th) {
                    this.f5179c = false;
                    this.f5180d = false;
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean j(C0444z c0444z, boolean z3, boolean z4) {
        G0.a aVar;
        boolean c3;
        C0444z k3;
        l0.n placementScope;
        C0435p c0435p;
        C0444z k4;
        C0444z k5;
        C0412F c0412f;
        C0407A c0407a;
        C0412F c0412f2;
        C0407A c0407a2;
        boolean z5 = false;
        Object[] objArr = 0;
        int i3 = 0;
        if (c0444z.f5297E) {
            return false;
        }
        boolean v3 = c0444z.v();
        C0415I c0415i = c0444z.f5320y;
        if (!v3 && !c0415i.f5146q.f5123u && !f(c0444z) && !p2.g.a(c0444z.x(), Boolean.TRUE) && ((!c0415i.f5136f || (c0444z.j() != 1 && ((c0412f2 = c0415i.f5147r) == null || (c0407a2 = c0412f2.f5095s) == null || !c0407a2.e()))) && !c0415i.f5146q.f5124v.e() && ((c0412f = c0415i.f5147r) == null || (c0407a = c0412f.f5095s) == null || !c0407a.e()))) {
            return false;
        }
        C0444z c0444z2 = this.f5177a;
        if (c0444z == c0444z2) {
            aVar = this.f5184i;
            p2.g.b(aVar);
        } else {
            aVar = null;
        }
        if (z3) {
            c3 = c0415i.f5136f ? b(c0444z, aVar) : false;
            if (z4 && ((c3 || c0415i.f5137g) && p2.g.a(c0444z.x(), Boolean.TRUE))) {
                if (c0444z.f5298F == 3) {
                    c0444z.d();
                }
                C0412F c0412f3 = c0415i.f5147r;
                p2.g.b(c0412f3);
                try {
                    c0412f3.f5085i = true;
                    if (!c0412f3.f5089m) {
                        Z0.d.S("replace() called on item that was not placed");
                        throw null;
                    }
                    c0412f3.f5101y = false;
                    boolean z6 = c0412f3.f5094r;
                    c0412f3.U(c0412f3.f5092p, c0412f3.f5093q);
                    if (z6 && !c0412f3.f5101y && (k5 = c0412f3.f5102z.f5131a.k()) != null) {
                        k5.C(false);
                    }
                } finally {
                    c0412f3.f5085i = false;
                }
            }
        } else {
            c3 = c0415i.f5133c ? c(c0444z, aVar) : false;
            if (z4 && c0415i.f5134d && (c0444z == c0444z2 || ((k4 = c0444z.k()) != null && k4.v() && c0415i.f5146q.f5123u))) {
                C0413G c0413g = c0415i.f5146q;
                if (c0444z == c0444z2) {
                    if (c0444z.f5298F == 3) {
                        c0444z.d();
                    }
                    C0444z k6 = c0444z.k();
                    if (k6 == null || (c0435p = (C0435p) k6.f5319x.f854c) == null || (placementScope = c0435p.f5165k) == null) {
                        placementScope = ((C0507u) AbstractC0409C.s(c0444z)).getPlacementScope();
                    }
                    l0.n.f(placementScope, c0413g, 0, 0);
                } else {
                    if (c0444z.f5298F == 3) {
                        c0444z.d();
                    }
                    c0413g.getClass();
                    try {
                        c0413g.f5111i = true;
                        if (!c0413g.f5115m) {
                            Z0.d.S("replace called on unplaced item");
                            throw null;
                        }
                        boolean z7 = c0413g.f5122t;
                        c0413g.U(c0413g.f5117o, c0413g.f5119q, c0413g.f5118p);
                        if (z7 && !c0413g.f5104B && (k3 = c0413g.f5110H.f5131a.k()) != null) {
                            k3.E(false);
                        }
                    } finally {
                        c0413g.f5111i = false;
                    }
                }
                ((F.d) this.f5181e.f316e).b(c0444z);
                c0444z.f5296D = true;
            }
        }
        F.d dVar = this.h;
        if (dVar.k()) {
            int i4 = dVar.f1160f;
            if (i4 > 0) {
                Object[] objArr2 = dVar.f1158d;
                do {
                    N n2 = (N) objArr2[i3];
                    if (n2.f5174a.u()) {
                        boolean z8 = n2.f5175b;
                        boolean z9 = n2.f5176c;
                        C0444z c0444z3 = n2.f5174a;
                        if (z8) {
                            C0444z.D(c0444z3, z9, 2);
                        } else {
                            C0444z.F(c0444z3, z9, 2);
                        }
                    }
                    i3++;
                } while (i3 < i4);
            }
            dVar.g();
        }
        return c3;
    }

    public final void k(C0444z c0444z) {
        F.d n2 = c0444z.n();
        int i3 = n2.f1160f;
        if (i3 > 0) {
            Object[] objArr = n2.f1158d;
            int i4 = 0;
            do {
                C0444z c0444z2 = (C0444z) objArr[i4];
                if (g(c0444z2)) {
                    if (AbstractC0409C.n(c0444z2)) {
                        l(c0444z2, true);
                    } else {
                        k(c0444z2);
                    }
                }
                i4++;
            } while (i4 < i3);
        }
    }

    public final void l(C0444z c0444z, boolean z3) {
        G0.a aVar;
        if (c0444z.f5297E) {
            return;
        }
        if (c0444z == this.f5177a) {
            aVar = this.f5184i;
            p2.g.b(aVar);
        } else {
            aVar = null;
        }
        if (z3) {
            b(c0444z, aVar);
        } else {
            c(c0444z, aVar);
        }
    }

    public final boolean m(C0444z c0444z, boolean z3) {
        int b3 = AbstractC0537f.b(c0444z.f5320y.f5132b);
        if (b3 == 0 || b3 == 1) {
            return false;
        }
        if (b3 == 2 || b3 == 3) {
            this.h.b(new N(c0444z, false, z3));
            return false;
        }
        if (b3 != 4) {
            throw new B1.c();
        }
        C0415I c0415i = c0444z.f5320y;
        if (c0415i.f5133c && !z3) {
            return false;
        }
        c0415i.f5133c = true;
        if (c0444z.f5297E) {
            return false;
        }
        if (!c0444z.v() && !f(c0444z)) {
            return false;
        }
        C0444z k3 = c0444z.k();
        if (k3 == null || !k3.f5320y.f5133c) {
            this.f5178b.g(c0444z, false);
        }
        return !this.f5180d;
    }

    public final void n(long j3) {
        G0.a aVar = this.f5184i;
        if (aVar == null ? false : G0.a.b(aVar.f1251a, j3)) {
            return;
        }
        if (this.f5179c) {
            Z0.d.R("updateRootConstraints called while measuring");
            throw null;
        }
        this.f5184i = new G0.a(j3);
        C0444z c0444z = this.f5177a;
        C0444z c0444z2 = c0444z.f5302f;
        C0415I c0415i = c0444z.f5320y;
        if (c0444z2 != null) {
            c0415i.f5136f = true;
        }
        c0415i.f5133c = true;
        this.f5178b.g(c0444z, c0444z2 != null);
    }
}
