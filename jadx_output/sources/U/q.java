package U;

import D.C0059s;
import D.q0;
import m0.InterfaceC0371c;
import n.C0405y;
import n0.AbstractC0409C;
import n0.AbstractC0428i;
import n0.C0444z;
import n0.InterfaceC0426g;
import n0.Y;
import n0.a0;
import n0.m0;
import o0.C0507u;

/* loaded from: classes.dex */
public final class q extends P.k implements InterfaceC0426g, a0, InterfaceC0371c {

    /* renamed from: q, reason: collision with root package name */
    public boolean f2365q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2366r;

    /* renamed from: s, reason: collision with root package name */
    public p f2367s;

    public static final boolean i0(q qVar) {
        P.k kVar = qVar.f2088d;
        if (!kVar.f2099p) {
            Z0.d.S("visitSubtreeIf called on an unattached node");
            throw null;
        }
        F.d dVar = new F.d(new P.k[16]);
        P.k kVar2 = kVar.f2092i;
        if (kVar2 == null) {
            AbstractC0409C.b(dVar, kVar);
        } else {
            dVar.b(kVar2);
        }
        while (dVar.k()) {
            P.k kVar3 = (P.k) dVar.m(dVar.f1160f - 1);
            if ((kVar3.f2091g & 1024) != 0) {
                for (P.k kVar4 = kVar3; kVar4 != null; kVar4 = kVar4.f2092i) {
                    if ((kVar4.f2090f & 1024) != 0) {
                        F.d dVar2 = null;
                        P.k kVar5 = kVar4;
                        while (kVar5 != null) {
                            if (kVar5 instanceof q) {
                                q qVar2 = (q) kVar5;
                                if (qVar2.f2367s != null) {
                                    int ordinal = qVar2.h0().ordinal();
                                    if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                                        return true;
                                    }
                                    if (ordinal == 3) {
                                        return false;
                                    }
                                    throw new B1.c();
                                }
                            } else if ((kVar5.f2090f & 1024) != 0 && (kVar5 instanceof AbstractC0428i)) {
                                int i3 = 0;
                                for (P.k kVar6 = ((AbstractC0428i) kVar5).f5256r; kVar6 != null; kVar6 = kVar6.f2092i) {
                                    if ((kVar6.f2090f & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            kVar5 = kVar6;
                                        } else {
                                            if (dVar2 == null) {
                                                dVar2 = new F.d(new P.k[16]);
                                            }
                                            if (kVar5 != null) {
                                                dVar2.b(kVar5);
                                                kVar5 = null;
                                            }
                                            dVar2.b(kVar6);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            kVar5 = AbstractC0409C.e(dVar2);
                        }
                    }
                }
            }
            AbstractC0409C.b(dVar, kVar3);
        }
        return false;
    }

    public static final boolean j0(q qVar) {
        C0059s c0059s;
        P.k kVar = qVar.f2088d;
        if (!kVar.f2099p) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        P.k kVar2 = kVar.h;
        C0444z q3 = AbstractC0409C.q(qVar);
        while (q3 != null) {
            if ((((P.k) q3.f5319x.f857f).f2091g & 1024) != 0) {
                while (kVar2 != null) {
                    if ((kVar2.f2090f & 1024) != 0) {
                        P.k kVar3 = kVar2;
                        F.d dVar = null;
                        while (kVar3 != null) {
                            if (kVar3 instanceof q) {
                                q qVar2 = (q) kVar3;
                                if (qVar2.f2367s != null) {
                                    int ordinal = qVar2.h0().ordinal();
                                    if (ordinal == 0) {
                                        return false;
                                    }
                                    if (ordinal == 1) {
                                        return true;
                                    }
                                    if (ordinal == 2 || ordinal == 3) {
                                        return false;
                                    }
                                    throw new B1.c();
                                }
                            } else if ((kVar3.f2090f & 1024) != 0 && (kVar3 instanceof AbstractC0428i)) {
                                int i3 = 0;
                                for (P.k kVar4 = ((AbstractC0428i) kVar3).f5256r; kVar4 != null; kVar4 = kVar4.f2092i) {
                                    if ((kVar4.f2090f & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            kVar3 = kVar4;
                                        } else {
                                            if (dVar == null) {
                                                dVar = new F.d(new P.k[16]);
                                            }
                                            if (kVar3 != null) {
                                                dVar.b(kVar3);
                                                kVar3 = null;
                                            }
                                            dVar.b(kVar4);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            kVar3 = AbstractC0409C.e(dVar);
                        }
                    }
                    kVar2 = kVar2.h;
                }
            }
            q3 = q3.k();
            kVar2 = (q3 == null || (c0059s = q3.f5319x) == null) ? null : (m0) c0059s.f856e;
        }
        return false;
    }

    @Override // n0.a0
    public final void Q() {
        p h02 = h0();
        k0();
        if (h02 != h0()) {
            c.A(this);
        }
    }

    @Override // P.k
    public final boolean V() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
    
        if (r0 != 2) goto L19;
     */
    @Override // P.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z() {
        /*
            r4 = this;
            U.p r0 = r4.h0()
            int r0 = r0.ordinal()
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 == r1) goto L11
            r2 = 2
            if (r0 == r2) goto L2e
            goto L43
        L11:
            A1.f r0 = U.c.E(r4)
            boolean r2 = r0.f215a     // Catch: java.lang.Throwable -> L1d
            if (r2 == 0) goto L1f
            A1.f.a(r0)     // Catch: java.lang.Throwable -> L1d
            goto L1f
        L1d:
            r1 = move-exception
            goto L2a
        L1f:
            r0.f215a = r1     // Catch: java.lang.Throwable -> L1d
            U.p r1 = U.p.f2363f     // Catch: java.lang.Throwable -> L1d
            r4.l0(r1)     // Catch: java.lang.Throwable -> L1d
            A1.f.b(r0)
            goto L43
        L2a:
            A1.f.b(r0)
            throw r1
        L2e:
            n0.e0 r0 = n0.AbstractC0409C.r(r4)
            o0.u r0 = (o0.C0507u) r0
            U.g r0 = r0.getFocusOwner()
            androidx.compose.ui.focus.a r0 = (androidx.compose.ui.focus.a) r0
            r2 = 0
            r3 = 8
            r0.a(r3, r1, r2)
            U.c.q(r4)
        L43:
            r0 = 0
            r4.f2367s = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: U.q.Z():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [P.k] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [P.k] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [F.d] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [F.d] */
    public final j f0() {
        C0059s c0059s;
        j jVar = new j();
        jVar.f2347a = true;
        n nVar = n.f2358b;
        jVar.f2348b = nVar;
        jVar.f2349c = nVar;
        jVar.f2350d = nVar;
        jVar.f2351e = nVar;
        jVar.f2352f = nVar;
        jVar.f2353g = nVar;
        jVar.h = nVar;
        jVar.f2354i = nVar;
        jVar.f2355j = h.f2344g;
        jVar.f2356k = h.h;
        P.k kVar = this.f2088d;
        if (!kVar.f2099p) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        C0444z q3 = AbstractC0409C.q(this);
        P.k kVar2 = kVar;
        loop0: while (q3 != null) {
            if ((((P.k) q3.f5319x.f857f).f2091g & 3072) != 0) {
                while (kVar2 != null) {
                    int i3 = kVar2.f2090f;
                    if ((i3 & 3072) != 0) {
                        if (kVar2 != kVar && (i3 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i3 & 2048) != 0) {
                            AbstractC0428i abstractC0428i = kVar2;
                            ?? r7 = 0;
                            while (abstractC0428i != 0) {
                                if (abstractC0428i instanceof l) {
                                    ((l) abstractC0428i).h(jVar);
                                } else if ((abstractC0428i.f2090f & 2048) != 0 && (abstractC0428i instanceof AbstractC0428i)) {
                                    P.k kVar3 = abstractC0428i.f5256r;
                                    int i4 = 0;
                                    abstractC0428i = abstractC0428i;
                                    r7 = r7;
                                    while (kVar3 != null) {
                                        if ((kVar3.f2090f & 2048) != 0) {
                                            i4++;
                                            r7 = r7;
                                            if (i4 == 1) {
                                                abstractC0428i = kVar3;
                                            } else {
                                                if (r7 == 0) {
                                                    r7 = new F.d(new P.k[16]);
                                                }
                                                if (abstractC0428i != 0) {
                                                    r7.b(abstractC0428i);
                                                    abstractC0428i = 0;
                                                }
                                                r7.b(kVar3);
                                            }
                                        }
                                        kVar3 = kVar3.f2092i;
                                        abstractC0428i = abstractC0428i;
                                        r7 = r7;
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                abstractC0428i = AbstractC0409C.e(r7);
                            }
                        }
                    }
                    kVar2 = kVar2.h;
                }
            }
            q3 = q3.k();
            kVar2 = (q3 == null || (c0059s = q3.f5319x) == null) ? null : (m0) c0059s.f856e;
        }
        return jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [P.k] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [P.k] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [F.d] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [F.d] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final void g0() {
        C0059s c0059s;
        P.k kVar = this.f2088d;
        boolean z3 = kVar.f2099p;
        if (!z3) {
            Z0.d.R("ModifierLocal accessed from an unattached node");
            throw null;
        }
        if (!z3) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        P.k kVar2 = kVar.h;
        C0444z q3 = AbstractC0409C.q(this);
        while (q3 != null) {
            if ((((P.k) q3.f5319x.f857f).f2091g & 32) != 0) {
                while (kVar2 != null) {
                    if ((kVar2.f2090f & 32) != 0) {
                        AbstractC0428i abstractC0428i = kVar2;
                        ?? r4 = 0;
                        while (abstractC0428i != 0) {
                            if (abstractC0428i instanceof InterfaceC0371c) {
                                ((InterfaceC0371c) abstractC0428i).a().getClass();
                            } else if ((abstractC0428i.f2090f & 32) != 0 && (abstractC0428i instanceof AbstractC0428i)) {
                                P.k kVar3 = abstractC0428i.f5256r;
                                int i3 = 0;
                                abstractC0428i = abstractC0428i;
                                r4 = r4;
                                while (kVar3 != null) {
                                    if ((kVar3.f2090f & 32) != 0) {
                                        i3++;
                                        r4 = r4;
                                        if (i3 == 1) {
                                            abstractC0428i = kVar3;
                                        } else {
                                            if (r4 == 0) {
                                                r4 = new F.d(new P.k[16]);
                                            }
                                            if (abstractC0428i != 0) {
                                                r4.b(abstractC0428i);
                                                abstractC0428i = 0;
                                            }
                                            r4.b(kVar3);
                                        }
                                    }
                                    kVar3 = kVar3.f2092i;
                                    abstractC0428i = abstractC0428i;
                                    r4 = r4;
                                }
                                if (i3 == 1) {
                                }
                            }
                            abstractC0428i = AbstractC0409C.e(r4);
                        }
                    }
                    kVar2 = kVar2.h;
                }
            }
            q3 = q3.k();
            kVar2 = (q3 == null || (c0059s = q3.f5319x) == null) ? null : (m0) c0059s.f856e;
        }
    }

    public final p h0() {
        p pVar;
        C0444z c0444z;
        C0507u c0507u;
        g focusOwner;
        Y y3 = this.f2088d.f2094k;
        A1.f fVar = (y3 == null || (c0444z = y3.f5217n) == null || (c0507u = c0444z.f5307l) == null || (focusOwner = c0507u.getFocusOwner()) == null) ? null : ((androidx.compose.ui.focus.a) focusOwner).f3321f;
        if (fVar != null && (pVar = (p) ((C0405y) fVar.f216b).e(this)) != null) {
            return pVar;
        }
        p pVar2 = this.f2367s;
        return pVar2 == null ? p.f2363f : pVar2;
    }

    public final void k0() {
        p pVar = this.f2367s;
        if (pVar == null) {
            if (pVar != null) {
                throw new IllegalStateException("Re-initializing focus target node.");
            }
            A1.f E2 = c.E(this);
            try {
                if (E2.f215a) {
                    A1.f.a(E2);
                }
                E2.f215a = true;
                l0((j0(this) && i0(this)) ? p.f2362e : p.f2363f);
                A1.f.b(E2);
            } catch (Throwable th) {
                A1.f.b(E2);
                throw th;
            }
        }
        int ordinal = h0().ordinal();
        if (ordinal == 0 || ordinal == 2) {
            p2.o oVar = new p2.o();
            AbstractC0409C.o(this, new q0(oVar, 1, this));
            Object obj = oVar.f5960d;
            if (obj == null) {
                p2.g.h("focusProperties");
                throw null;
            }
            if (((i) obj).a()) {
                return;
            }
            ((androidx.compose.ui.focus.a) ((C0507u) AbstractC0409C.r(this)).getFocusOwner()).a(8, true, true);
        }
    }

    public final void l0(p pVar) {
        ((C0405y) c.E(this).f216b).j(this, pVar);
    }
}
