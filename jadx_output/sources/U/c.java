package U;

import D.C0059s;
import android.view.View;
import java.util.Arrays;
import n0.AbstractC0409C;
import n0.AbstractC0428i;
import n0.C0444z;
import n0.Y;
import n0.m0;
import o0.C0507u;
import p.AbstractC0537f;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f2332a = new int[2];

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [P.k] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [P.k] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [F.d] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [F.d] */
    public static final void A(q qVar) {
        C0059s c0059s;
        P.k kVar = qVar.f2088d;
        if (!kVar.f2099p) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        C0444z q3 = AbstractC0409C.q(qVar);
        P.k kVar2 = kVar;
        while (q3 != null) {
            if ((((P.k) q3.f5319x.f857f).f2091g & 5120) != 0) {
                while (kVar2 != null) {
                    int i3 = kVar2.f2090f;
                    if ((i3 & 5120) != 0) {
                        if (kVar2 != kVar && (i3 & 1024) != 0) {
                            return;
                        }
                        if ((i3 & 4096) != 0) {
                            AbstractC0428i abstractC0428i = kVar2;
                            ?? r4 = 0;
                            while (abstractC0428i != 0) {
                                if (abstractC0428i instanceof b) {
                                    b bVar = (b) abstractC0428i;
                                    bVar.z(o(bVar));
                                } else if ((abstractC0428i.f2090f & 4096) != 0 && (abstractC0428i instanceof AbstractC0428i)) {
                                    P.k kVar3 = abstractC0428i.f5256r;
                                    int i4 = 0;
                                    abstractC0428i = abstractC0428i;
                                    r4 = r4;
                                    while (kVar3 != null) {
                                        if ((kVar3.f2090f & 4096) != 0) {
                                            i4++;
                                            r4 = r4;
                                            if (i4 == 1) {
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
                                    if (i4 == 1) {
                                    }
                                }
                                abstractC0428i = AbstractC0409C.e(r4);
                            }
                        }
                    }
                    kVar2 = kVar2.h;
                }
            }
            q3 = q3.k();
            kVar2 = (q3 == null || (c0059s = q3.f5319x) == null) ? null : (m0) c0059s.f856e;
        }
    }

    public static final boolean B(q qVar) {
        Boolean C3 = C(qVar, 7);
        if (C3 != null) {
            return C3.booleanValue();
        }
        return false;
    }

    public static final Boolean C(q qVar, int i3) {
        Boolean valueOf;
        A1.f E2 = E(qVar);
        r rVar = new r(qVar, 1);
        try {
            if (E2.f215a) {
                A1.f.a(E2);
            }
            E2.f215a = true;
            ((F.d) E2.f217c).b(rVar);
            int b3 = AbstractC0537f.b(w(qVar, i3));
            if (b3 != 0) {
                if (b3 != 1) {
                    if (b3 == 2) {
                        valueOf = Boolean.TRUE;
                    } else if (b3 != 3) {
                        throw new B1.c();
                    }
                }
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(x(qVar));
            }
            return valueOf;
        } finally {
            A1.f.b(E2);
        }
    }

    public static final boolean D(q qVar, q qVar2) {
        P.k kVar;
        P.k kVar2;
        C0059s c0059s;
        C0059s c0059s2;
        P.k kVar3 = qVar2.f2088d;
        if (!kVar3.f2099p) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        P.k kVar4 = kVar3.h;
        C0444z q3 = AbstractC0409C.q(qVar2);
        loop0: while (true) {
            if (q3 == null) {
                kVar = null;
                break;
            }
            if ((((P.k) q3.f5319x.f857f).f2091g & 1024) != 0) {
                while (kVar4 != null) {
                    if ((kVar4.f2090f & 1024) != 0) {
                        kVar = kVar4;
                        F.d dVar = null;
                        while (kVar != null) {
                            if (kVar instanceof q) {
                                break loop0;
                            }
                            if ((kVar.f2090f & 1024) != 0 && (kVar instanceof AbstractC0428i)) {
                                int i3 = 0;
                                for (P.k kVar5 = ((AbstractC0428i) kVar).f5256r; kVar5 != null; kVar5 = kVar5.f2092i) {
                                    if ((kVar5.f2090f & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            kVar = kVar5;
                                        } else {
                                            if (dVar == null) {
                                                dVar = new F.d(new P.k[16]);
                                            }
                                            if (kVar != null) {
                                                dVar.b(kVar);
                                                kVar = null;
                                            }
                                            dVar.b(kVar5);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            kVar = AbstractC0409C.e(dVar);
                        }
                    }
                    kVar4 = kVar4.h;
                }
            }
            q3 = q3.k();
            kVar4 = (q3 == null || (c0059s2 = q3.f5319x) == null) ? null : (m0) c0059s2.f856e;
        }
        if (!p2.g.a(kVar, qVar)) {
            throw new IllegalStateException("Non child node cannot request focus.");
        }
        int ordinal = qVar.h0().ordinal();
        p pVar = p.f2362e;
        if (ordinal == 0) {
            p(qVar2);
            qVar.l0(pVar);
        } else if (ordinal != 1) {
            if (ordinal == 2) {
                return false;
            }
            if (ordinal != 3) {
                throw new B1.c();
            }
            P.k kVar6 = qVar.f2088d;
            if (!kVar6.f2099p) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            P.k kVar7 = kVar6.h;
            C0444z q4 = AbstractC0409C.q(qVar);
            loop4: while (true) {
                if (q4 == null) {
                    kVar2 = null;
                    break;
                }
                if ((((P.k) q4.f5319x.f857f).f2091g & 1024) != 0) {
                    while (kVar7 != null) {
                        if ((kVar7.f2090f & 1024) != 0) {
                            kVar2 = kVar7;
                            F.d dVar2 = null;
                            while (kVar2 != null) {
                                if (kVar2 instanceof q) {
                                    break loop4;
                                }
                                if ((kVar2.f2090f & 1024) != 0 && (kVar2 instanceof AbstractC0428i)) {
                                    int i4 = 0;
                                    for (P.k kVar8 = ((AbstractC0428i) kVar2).f5256r; kVar8 != null; kVar8 = kVar8.f2092i) {
                                        if ((kVar8.f2090f & 1024) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                kVar2 = kVar8;
                                            } else {
                                                if (dVar2 == null) {
                                                    dVar2 = new F.d(new P.k[16]);
                                                }
                                                if (kVar2 != null) {
                                                    dVar2.b(kVar2);
                                                    kVar2 = null;
                                                }
                                                dVar2.b(kVar8);
                                            }
                                        }
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                kVar2 = AbstractC0409C.e(dVar2);
                            }
                        }
                        kVar7 = kVar7.h;
                    }
                }
                q4 = q4.k();
                kVar7 = (q4 == null || (c0059s = q4.f5319x) == null) ? null : (m0) c0059s.f856e;
            }
            q qVar3 = (q) kVar2;
            if (qVar3 != null || !((Boolean) ((androidx.compose.ui.focus.a) ((C0507u) AbstractC0409C.r(qVar)).getFocusOwner()).f3316a.h(null, null)).booleanValue()) {
                if (qVar3 == null || !D(qVar3, qVar)) {
                    return false;
                }
                boolean D3 = D(qVar, qVar2);
                if (qVar.h0() != pVar) {
                    throw new IllegalStateException("Deactivated node is focused");
                }
                if (!D3) {
                    return D3;
                }
                A(qVar3);
                return D3;
            }
            p(qVar2);
            qVar.l0(pVar);
        } else {
            if (n(qVar) == null) {
                throw new IllegalArgumentException("ActiveParent with no focused child");
            }
            q n2 = n(qVar);
            if (!(n2 != null ? e(n2, false, true) : true)) {
                return false;
            }
            p(qVar2);
        }
        return true;
    }

    public static final A1.f E(q qVar) {
        return ((androidx.compose.ui.focus.a) ((C0507u) AbstractC0409C.r(qVar)).getFocusOwner()).f3321f;
    }

    public static final void F(q qVar) {
        P.k kVar;
        C0059s c0059s;
        P.k kVar2 = qVar.f2088d;
        if (!kVar2.f2099p) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        P.k kVar3 = kVar2.h;
        C0444z q3 = AbstractC0409C.q(qVar);
        loop0: while (true) {
            if (q3 == null) {
                kVar = null;
                break;
            }
            if ((((P.k) q3.f5319x.f857f).f2091g & 1024) != 0) {
                while (kVar3 != null) {
                    if ((kVar3.f2090f & 1024) != 0) {
                        kVar = kVar3;
                        F.d dVar = null;
                        while (kVar != null) {
                            if (kVar instanceof q) {
                                break loop0;
                            }
                            if ((kVar.f2090f & 1024) != 0 && (kVar instanceof AbstractC0428i)) {
                                int i3 = 0;
                                for (P.k kVar4 = ((AbstractC0428i) kVar).f5256r; kVar4 != null; kVar4 = kVar4.f2092i) {
                                    if ((kVar4.f2090f & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            kVar = kVar4;
                                        } else {
                                            if (dVar == null) {
                                                dVar = new F.d(new P.k[16]);
                                            }
                                            if (kVar != null) {
                                                dVar.b(kVar);
                                                kVar = null;
                                            }
                                            dVar.b(kVar4);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            kVar = AbstractC0409C.e(dVar);
                        }
                    }
                    kVar3 = kVar3.h;
                }
            }
            q3 = q3.k();
            kVar3 = (q3 == null || (c0059s = q3.f5319x) == null) ? null : (m0) c0059s.f856e;
        }
        q qVar2 = (q) kVar;
        if (qVar2 != null) {
            qVar2.g0();
            qVar.g0();
            if (p2.g.a(null, null)) {
                return;
            }
        }
        qVar.g0();
    }

    public static final boolean G(int i3, D2.p pVar, q qVar, V.d dVar) {
        q h;
        F.d dVar2 = new F.d(new q[16]);
        P.k kVar = qVar.f2088d;
        if (!kVar.f2099p) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        F.d dVar3 = new F.d(new P.k[16]);
        P.k kVar2 = kVar.f2092i;
        if (kVar2 == null) {
            AbstractC0409C.b(dVar3, kVar);
        } else {
            dVar3.b(kVar2);
        }
        while (dVar3.k()) {
            P.k kVar3 = (P.k) dVar3.m(dVar3.f1160f - 1);
            if ((kVar3.f2091g & 1024) == 0) {
                AbstractC0409C.b(dVar3, kVar3);
            } else {
                while (true) {
                    if (kVar3 == null) {
                        break;
                    }
                    if ((kVar3.f2090f & 1024) != 0) {
                        F.d dVar4 = null;
                        while (kVar3 != null) {
                            if (kVar3 instanceof q) {
                                q qVar2 = (q) kVar3;
                                if (qVar2.f2099p) {
                                    dVar2.b(qVar2);
                                }
                            } else if ((kVar3.f2090f & 1024) != 0 && (kVar3 instanceof AbstractC0428i)) {
                                int i4 = 0;
                                for (P.k kVar4 = ((AbstractC0428i) kVar3).f5256r; kVar4 != null; kVar4 = kVar4.f2092i) {
                                    if ((kVar4.f2090f & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            kVar3 = kVar4;
                                        } else {
                                            if (dVar4 == null) {
                                                dVar4 = new F.d(new P.k[16]);
                                            }
                                            if (kVar3 != null) {
                                                dVar4.b(kVar3);
                                                kVar3 = null;
                                            }
                                            dVar4.b(kVar4);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            kVar3 = AbstractC0409C.e(dVar4);
                        }
                    } else {
                        kVar3 = kVar3.f2092i;
                    }
                }
            }
        }
        while (dVar2.k() && (h = h(dVar2, dVar, i3)) != null) {
            if (h.f0().f2347a) {
                return ((Boolean) pVar.i(h)).booleanValue();
            }
            if (l(i3, pVar, h, dVar)) {
                return true;
            }
            dVar2.l(h);
        }
        return false;
    }

    public static final Integer H(int i3) {
        if (a.a(i3, 5)) {
            return 33;
        }
        if (a.a(i3, 6)) {
            return 130;
        }
        if (a.a(i3, 3)) {
            return 17;
        }
        if (a.a(i3, 4)) {
            return 66;
        }
        if (a.a(i3, 1)) {
            return 2;
        }
        return a.a(i3, 2) ? 1 : null;
    }

    public static final a I(int i3) {
        if (i3 == 1) {
            return new a(2);
        }
        if (i3 == 2) {
            return new a(1);
        }
        if (i3 == 17) {
            return new a(3);
        }
        if (i3 == 33) {
            return new a(5);
        }
        if (i3 == 66) {
            return new a(4);
        }
        if (i3 != 130) {
            return null;
        }
        return new a(6);
    }

    public static final Boolean J(int i3, D2.p pVar, q qVar, V.d dVar) {
        int ordinal = qVar.h0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                q n2 = n(qVar);
                if (n2 == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                int ordinal2 = n2.h0().ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        Boolean J2 = J(i3, pVar, n2, dVar);
                        if (!p2.g.a(J2, Boolean.FALSE)) {
                            return J2;
                        }
                        if (dVar == null) {
                            if (n2.h0() != p.f2362e) {
                                throw new IllegalStateException("Searching for active node in inactive hierarchy");
                            }
                            q g3 = g(n2);
                            if (g3 == null) {
                                throw new IllegalStateException("ActiveParent must have a focusedChild");
                            }
                            dVar = j(g3);
                        }
                        return Boolean.valueOf(l(i3, pVar, qVar, dVar));
                    }
                    if (ordinal2 != 2) {
                        if (ordinal2 != 3) {
                            throw new B1.c();
                        }
                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                    }
                }
                if (dVar == null) {
                    dVar = j(n2);
                }
                return Boolean.valueOf(l(i3, pVar, qVar, dVar));
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return qVar.f0().f2347a ? (Boolean) pVar.i(qVar) : dVar == null ? Boolean.valueOf(i(qVar, i3, pVar)) : Boolean.valueOf(G(i3, pVar, qVar, dVar));
                }
                throw new B1.c();
            }
        }
        return Boolean.valueOf(i(qVar, i3, pVar));
    }

    public static final boolean a(q qVar, D2.p pVar) {
        int ordinal = qVar.h0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                q n2 = n(qVar);
                if (n2 == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                int ordinal2 = n2.h0().ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 != 2) {
                            if (ordinal2 != 3) {
                                throw new B1.c();
                            }
                            throw new IllegalStateException("ActiveParent must have a focusedChild");
                        }
                    } else if (!a(n2, pVar) && !m(qVar, n2, 2, pVar) && (!n2.f0().f2347a || !((Boolean) pVar.i(n2)).booleanValue())) {
                        return false;
                    }
                }
                return m(qVar, n2, 2, pVar);
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    throw new B1.c();
                }
                if (!y(qVar, pVar)) {
                    if (!(qVar.f0().f2347a ? ((Boolean) pVar.i(qVar)).booleanValue() : false)) {
                        return false;
                    }
                }
            }
            return true;
        }
        return y(qVar, pVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x005b, code lost:
    
        if (U.a.a(r19, 3) != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
    
        if (U.a.a(r19, 4) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0068, code lost:
    
        if (U.a.a(r19, 3) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006a, code lost:
    
        r1 = r0 - r17.f2448c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008d, code lost:
    
        r1 = java.lang.Math.max(0.0f, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0096, code lost:
    
        if (U.a.a(r19, 3) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0098, code lost:
    
        r0 = r0 - r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00bc, code lost:
    
        if (r1 >= java.lang.Math.max(1.0f, r0)) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        if (U.a.a(r19, 4) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a0, code lost:
    
        r0 = r2 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a7, code lost:
    
        if (U.a.a(r19, 5) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a9, code lost:
    
        r0 = r5 - r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b0, code lost:
    
        if (U.a.a(r19, 6) == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b2, code lost:
    
        r0 = r13 - r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c7, code lost:
    
        throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0073, code lost:
    
        if (U.a.a(r19, 4) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0075, code lost:
    
        r1 = r17.f2446a - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007d, code lost:
    
        if (U.a.a(r19, 5) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007f, code lost:
    
        r1 = r5 - r17.f2449d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0088, code lost:
    
        if (U.a.a(r19, 6) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008a, code lost:
    
        r1 = r17.f2447b - r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cd, code lost:
    
        throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x003f, code lost:
    
        if (r7 <= r14) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x004a, code lost:
    
        if (r5 >= r13) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0055, code lost:
    
        if (r15 <= r12) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
    
        if (r0 >= r2) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00be, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean b(V.d r16, V.d r17, V.d r18, int r19) {
        /*
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            boolean r4 = c(r3, r2, r0)
            if (r4 != 0) goto Lc0
            boolean r4 = c(r3, r1, r0)
            if (r4 != 0) goto L16
            goto Lc0
        L16:
            r4 = 3
            boolean r6 = U.a.a(r3, r4)
            java.lang.String r8 = "This function should only be used for 2-D focus search"
            r9 = 6
            r10 = 5
            r11 = 4
            float r12 = r2.f2447b
            float r13 = r2.f2449d
            float r14 = r2.f2446a
            float r2 = r2.f2448c
            float r15 = r0.f2449d
            float r5 = r0.f2447b
            float r7 = r0.f2448c
            float r0 = r0.f2446a
            if (r6 == 0) goto L37
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 < 0) goto Lbe
            goto L57
        L37:
            boolean r6 = U.a.a(r3, r11)
            if (r6 == 0) goto L42
            int r6 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r6 > 0) goto Lbe
            goto L57
        L42:
            boolean r6 = U.a.a(r3, r10)
            if (r6 == 0) goto L4d
            int r6 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r6 < 0) goto Lbe
            goto L57
        L4d:
            boolean r6 = U.a.a(r3, r9)
            if (r6 == 0) goto Lce
            int r6 = (r15 > r12 ? 1 : (r15 == r12 ? 0 : -1))
            if (r6 > 0) goto Lbe
        L57:
            boolean r6 = U.a.a(r3, r4)
            if (r6 != 0) goto Lbe
            boolean r6 = U.a.a(r3, r11)
            if (r6 == 0) goto L64
            goto Lbe
        L64:
            boolean r6 = U.a.a(r3, r4)
            if (r6 == 0) goto L6f
            float r1 = r1.f2448c
            float r1 = r0 - r1
            goto L8d
        L6f:
            boolean r6 = U.a.a(r3, r11)
            if (r6 == 0) goto L79
            float r1 = r1.f2446a
            float r1 = r1 - r7
            goto L8d
        L79:
            boolean r6 = U.a.a(r3, r10)
            if (r6 == 0) goto L84
            float r1 = r1.f2449d
            float r1 = r5 - r1
            goto L8d
        L84:
            boolean r6 = U.a.a(r3, r9)
            if (r6 == 0) goto Lc8
            float r1 = r1.f2447b
            float r1 = r1 - r15
        L8d:
            r6 = 0
            float r1 = java.lang.Math.max(r6, r1)
            boolean r4 = U.a.a(r3, r4)
            if (r4 == 0) goto L9a
            float r0 = r0 - r14
            goto Lb4
        L9a:
            boolean r0 = U.a.a(r3, r11)
            if (r0 == 0) goto La3
            float r0 = r2 - r7
            goto Lb4
        La3:
            boolean r0 = U.a.a(r3, r10)
            if (r0 == 0) goto Lac
            float r0 = r5 - r12
            goto Lb4
        Lac:
            boolean r0 = U.a.a(r3, r9)
            if (r0 == 0) goto Lc2
            float r0 = r13 - r15
        Lb4:
            r2 = 1065353216(0x3f800000, float:1.0)
            float r0 = java.lang.Math.max(r2, r0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto Lc0
        Lbe:
            r5 = 1
            goto Ld4
        Lc0:
            r5 = 0
            goto Ld4
        Lc2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r8)
            throw r0
        Lc8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r8)
            throw r0
        Lce:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r8)
            throw r0
        Ld4:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: U.c.b(V.d, V.d, V.d, int):boolean");
    }

    public static final boolean c(int i3, V.d dVar, V.d dVar2) {
        if (a.a(i3, 3) ? true : a.a(i3, 4)) {
            if (dVar.f2449d > dVar2.f2447b && dVar.f2447b < dVar2.f2449d) {
                return true;
            }
        } else {
            if (!(a.a(i3, 5) ? true : a.a(i3, 6))) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            if (dVar.f2448c > dVar2.f2446a && dVar.f2446a < dVar2.f2448c) {
                return true;
            }
        }
        return false;
    }

    public static final V.d d(View view) {
        int[] iArr = f2332a;
        view.getLocationInWindow(iArr);
        float f3 = iArr[0];
        return new V.d(f3, iArr[1], view.getWidth() + f3, iArr[1] + view.getHeight());
    }

    public static final boolean e(q qVar, boolean z3, boolean z4) {
        int ordinal = qVar.h0().ordinal();
        p pVar = p.f2363f;
        if (ordinal == 0) {
            qVar.l0(pVar);
            if (z4) {
                A(qVar);
            }
        } else if (ordinal == 1) {
            q n2 = n(qVar);
            if (!(n2 != null ? e(n2, z3, z4) : true)) {
                return false;
            }
            qVar.l0(pVar);
            if (z4) {
                A(qVar);
            }
        } else {
            if (ordinal == 2) {
                if (!z3) {
                    return z3;
                }
                qVar.l0(pVar);
                if (!z4) {
                    return z3;
                }
                A(qVar);
                return z3;
            }
            if (ordinal != 3) {
                throw new B1.c();
            }
        }
        return true;
    }

    public static final void f(q qVar, F.d dVar) {
        P.k kVar = qVar.f2088d;
        if (!kVar.f2099p) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        F.d dVar2 = new F.d(new P.k[16]);
        P.k kVar2 = kVar.f2092i;
        if (kVar2 == null) {
            AbstractC0409C.b(dVar2, kVar);
        } else {
            dVar2.b(kVar2);
        }
        while (dVar2.k()) {
            P.k kVar3 = (P.k) dVar2.m(dVar2.f1160f - 1);
            if ((kVar3.f2091g & 1024) == 0) {
                AbstractC0409C.b(dVar2, kVar3);
            } else {
                while (true) {
                    if (kVar3 == null) {
                        break;
                    }
                    if ((kVar3.f2090f & 1024) != 0) {
                        F.d dVar3 = null;
                        while (kVar3 != null) {
                            if (kVar3 instanceof q) {
                                q qVar2 = (q) kVar3;
                                if (qVar2.f2099p && !AbstractC0409C.q(qVar2).f5297E) {
                                    if (qVar2.f0().f2347a) {
                                        dVar.b(qVar2);
                                    } else {
                                        f(qVar2, dVar);
                                    }
                                }
                            } else if ((kVar3.f2090f & 1024) != 0 && (kVar3 instanceof AbstractC0428i)) {
                                int i3 = 0;
                                for (P.k kVar4 = ((AbstractC0428i) kVar3).f5256r; kVar4 != null; kVar4 = kVar4.f2092i) {
                                    if ((kVar4.f2090f & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            kVar3 = kVar4;
                                        } else {
                                            if (dVar3 == null) {
                                                dVar3 = new F.d(new P.k[16]);
                                            }
                                            if (kVar3 != null) {
                                                dVar3.b(kVar3);
                                                kVar3 = null;
                                            }
                                            dVar3.b(kVar4);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            kVar3 = AbstractC0409C.e(dVar3);
                        }
                    } else {
                        kVar3 = kVar3.f2092i;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0035, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final U.q g(U.q r8) {
        /*
            U.p r0 = r8.h0()
            int r0 = r0.ordinal()
            if (r0 == 0) goto Lad
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L1b
            r1 = 2
            if (r0 == r1) goto Lad
            r8 = 3
            if (r0 != r8) goto L15
            return r2
        L15:
            B1.c r8 = new B1.c
            r8.<init>()
            throw r8
        L1b:
            P.k r8 = r8.f2088d
            boolean r0 = r8.f2099p
            if (r0 == 0) goto La5
            F.d r0 = new F.d
            r3 = 16
            P.k[] r4 = new P.k[r3]
            r0.<init>(r4)
            P.k r4 = r8.f2092i
            if (r4 != 0) goto L32
            n0.AbstractC0409C.b(r0, r8)
            goto L35
        L32:
            r0.b(r4)
        L35:
            boolean r8 = r0.k()
            if (r8 == 0) goto La4
            int r8 = r0.f1160f
            int r8 = r8 - r1
            java.lang.Object r8 = r0.m(r8)
            P.k r8 = (P.k) r8
            int r4 = r8.f2091g
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 != 0) goto L4e
            n0.AbstractC0409C.b(r0, r8)
            goto L35
        L4e:
            if (r8 == 0) goto L35
            int r4 = r8.f2090f
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto La1
            r4 = r2
        L57:
            if (r8 == 0) goto L35
            boolean r5 = r8 instanceof U.q
            if (r5 == 0) goto L66
            U.q r8 = (U.q) r8
            U.q r8 = g(r8)
            if (r8 == 0) goto L9c
            return r8
        L66:
            int r5 = r8.f2090f
            r5 = r5 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L9c
            boolean r5 = r8 instanceof n0.AbstractC0428i
            if (r5 == 0) goto L9c
            r5 = r8
            n0.i r5 = (n0.AbstractC0428i) r5
            P.k r5 = r5.f5256r
            r6 = 0
        L76:
            if (r5 == 0) goto L99
            int r7 = r5.f2090f
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L96
            int r6 = r6 + 1
            if (r6 != r1) goto L84
            r8 = r5
            goto L96
        L84:
            if (r4 != 0) goto L8d
            F.d r4 = new F.d
            P.k[] r7 = new P.k[r3]
            r4.<init>(r7)
        L8d:
            if (r8 == 0) goto L93
            r4.b(r8)
            r8 = r2
        L93:
            r4.b(r5)
        L96:
            P.k r5 = r5.f2092i
            goto L76
        L99:
            if (r6 != r1) goto L9c
            goto L57
        L9c:
            P.k r8 = n0.AbstractC0409C.e(r4)
            goto L57
        La1:
            P.k r8 = r8.f2092i
            goto L4e
        La4:
            return r2
        La5:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "visitChildren called on an unattached node"
            r8.<init>(r0)
            throw r8
        Lad:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: U.c.g(U.q):U.q");
    }

    public static final q h(F.d dVar, V.d dVar2, int i3) {
        V.d d3;
        if (a.a(i3, 3)) {
            d3 = dVar2.d(dVar2.c() + 1, 0.0f);
        } else if (a.a(i3, 4)) {
            d3 = dVar2.d(-(dVar2.c() + 1), 0.0f);
        } else if (a.a(i3, 5)) {
            d3 = dVar2.d(0.0f, dVar2.b() + 1);
        } else {
            if (!a.a(i3, 6)) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            d3 = dVar2.d(0.0f, -(dVar2.b() + 1));
        }
        int i4 = dVar.f1160f;
        q qVar = null;
        if (i4 > 0) {
            Object[] objArr = dVar.f1158d;
            int i5 = 0;
            do {
                q qVar2 = (q) objArr[i5];
                if (t(qVar2)) {
                    V.d j3 = j(qVar2);
                    if (r(i3, j3, dVar2) && (!r(i3, d3, dVar2) || b(dVar2, j3, d3, i3) || (!b(dVar2, d3, j3, i3) && s(i3, dVar2, j3) < s(i3, dVar2, d3)))) {
                        qVar = qVar2;
                        d3 = j3;
                    }
                }
                i5++;
            } while (i5 < i4);
        }
        return qVar;
    }

    public static final boolean i(q qVar, int i3, o2.c cVar) {
        V.d dVar;
        F.d dVar2 = new F.d(new q[16]);
        f(qVar, dVar2);
        if (dVar2.f1160f <= 1) {
            q qVar2 = (q) (dVar2.j() ? null : dVar2.f1158d[0]);
            if (qVar2 != null) {
                return ((Boolean) cVar.i(qVar2)).booleanValue();
            }
            return false;
        }
        if (a.a(i3, 7)) {
            i3 = 4;
        }
        if (a.a(i3, 4) ? true : a.a(i3, 6)) {
            V.d j3 = j(qVar);
            float f3 = j3.f2447b;
            float f4 = j3.f2446a;
            dVar = new V.d(f4, f3, f4, f3);
        } else {
            if (!(a.a(i3, 3) ? true : a.a(i3, 5))) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            V.d j4 = j(qVar);
            float f5 = j4.f2449d;
            float f6 = j4.f2448c;
            dVar = new V.d(f6, f5, f6, f5);
        }
        q h = h(dVar2, dVar, i3);
        if (h != null) {
            return ((Boolean) cVar.i(h)).booleanValue();
        }
        return false;
    }

    public static final V.d j(q qVar) {
        Y y3 = qVar.f2094k;
        return y3 != null ? Z0.d.v(y3).h(y3, false) : V.d.f2445e;
    }

    public static final boolean k(q qVar, D2.p pVar) {
        int ordinal = qVar.h0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                q n2 = n(qVar);
                if (n2 != null) {
                    return k(n2, pVar) || m(qVar, n2, 1, pVar);
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return qVar.f0().f2347a ? ((Boolean) pVar.i(qVar)).booleanValue() : z(qVar, pVar);
                }
                throw new B1.c();
            }
        }
        return z(qVar, pVar);
    }

    public static final boolean l(int i3, D2.p pVar, q qVar, V.d dVar) {
        if (G(i3, pVar, qVar, dVar)) {
            return true;
        }
        F(qVar);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean m(U.q r16, U.q r17, int r18, D2.p r19) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: U.c.m(U.q, U.q, int, D2.p):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x001e, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final U.q n(U.q r8) {
        /*
            P.k r8 = r8.f2088d
            boolean r0 = r8.f2099p
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            if (r0 == 0) goto L9f
            F.d r0 = new F.d
            r2 = 16
            P.k[] r3 = new P.k[r2]
            r0.<init>(r3)
            P.k r3 = r8.f2092i
            if (r3 != 0) goto L1b
            n0.AbstractC0409C.b(r0, r8)
            goto L1e
        L1b:
            r0.b(r3)
        L1e:
            boolean r8 = r0.k()
            if (r8 == 0) goto L9e
            int r8 = r0.f1160f
            r3 = 1
            int r8 = r8 - r3
            java.lang.Object r8 = r0.m(r8)
            P.k r8 = (P.k) r8
            int r4 = r8.f2091g
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 != 0) goto L38
            n0.AbstractC0409C.b(r0, r8)
            goto L1e
        L38:
            if (r8 == 0) goto L1e
            int r4 = r8.f2090f
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L9b
            r4 = r1
        L41:
            if (r8 == 0) goto L1e
            boolean r5 = r8 instanceof U.q
            if (r5 == 0) goto L60
            U.q r8 = (U.q) r8
            P.k r5 = r8.f2088d
            boolean r5 = r5.f2099p
            if (r5 == 0) goto L96
            U.p r5 = r8.h0()
            int r5 = r5.ordinal()
            if (r5 == 0) goto L5f
            if (r5 == r3) goto L5f
            r6 = 2
            if (r5 == r6) goto L5f
            goto L96
        L5f:
            return r8
        L60:
            int r5 = r8.f2090f
            r5 = r5 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L96
            boolean r5 = r8 instanceof n0.AbstractC0428i
            if (r5 == 0) goto L96
            r5 = r8
            n0.i r5 = (n0.AbstractC0428i) r5
            P.k r5 = r5.f5256r
            r6 = 0
        L70:
            if (r5 == 0) goto L93
            int r7 = r5.f2090f
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L90
            int r6 = r6 + 1
            if (r6 != r3) goto L7e
            r8 = r5
            goto L90
        L7e:
            if (r4 != 0) goto L87
            F.d r4 = new F.d
            P.k[] r7 = new P.k[r2]
            r4.<init>(r7)
        L87:
            if (r8 == 0) goto L8d
            r4.b(r8)
            r8 = r1
        L8d:
            r4.b(r5)
        L90:
            P.k r5 = r5.f2092i
            goto L70
        L93:
            if (r6 != r3) goto L96
            goto L41
        L96:
            P.k r8 = n0.AbstractC0409C.e(r4)
            goto L41
        L9b:
            P.k r8 = r8.f2092i
            goto L38
        L9e:
            return r1
        L9f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "visitChildren called on an unattached node"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: U.c.n(U.q):U.q");
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0075, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final U.p o(U.b r10) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: U.c.o(U.b):U.p");
    }

    public static final void p(q qVar) {
        AbstractC0409C.o(qVar, new r(qVar, 0));
        int ordinal = qVar.h0().ordinal();
        if (ordinal == 1 || ordinal == 3) {
            qVar.l0(p.f2361d);
        }
    }

    public static final void q(q qVar) {
        e eVar = ((androidx.compose.ui.focus.a) ((C0507u) AbstractC0409C.r(qVar)).getFocusOwner()).f3320e;
        eVar.b(eVar.f2336c, qVar);
    }

    public static final boolean r(int i3, V.d dVar, V.d dVar2) {
        boolean a3 = a.a(i3, 3);
        float f3 = dVar.f2446a;
        float f4 = dVar.f2448c;
        if (a3) {
            float f5 = dVar2.f2448c;
            float f6 = dVar2.f2446a;
            if ((f5 <= f4 && f6 < f4) || f6 <= f3) {
                return false;
            }
        } else if (a.a(i3, 4)) {
            float f7 = dVar2.f2446a;
            float f8 = dVar2.f2448c;
            if ((f7 >= f3 && f8 > f3) || f8 >= f4) {
                return false;
            }
        } else {
            boolean a4 = a.a(i3, 5);
            float f9 = dVar.f2447b;
            float f10 = dVar.f2449d;
            if (a4) {
                float f11 = dVar2.f2449d;
                float f12 = dVar2.f2447b;
                if ((f11 <= f10 && f12 < f10) || f12 <= f9) {
                    return false;
                }
            } else {
                if (!a.a(i3, 6)) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                float f13 = dVar2.f2447b;
                float f14 = dVar2.f2449d;
                if ((f13 >= f9 && f14 > f9) || f14 >= f10) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long s(int r10, V.d r11, V.d r12) {
        /*
            r0 = 3
            boolean r1 = U.a.a(r10, r0)
            float r2 = r12.f2447b
            float r3 = r12.f2446a
            java.lang.String r4 = "This function should only be used for 2-D focus search"
            r5 = 6
            r6 = 5
            r7 = 4
            if (r1 == 0) goto L16
            float r1 = r11.f2446a
            float r8 = r12.f2448c
        L14:
            float r1 = r1 - r8
            goto L36
        L16:
            boolean r1 = U.a.a(r10, r7)
            if (r1 == 0) goto L21
            float r1 = r11.f2448c
            float r1 = r3 - r1
            goto L36
        L21:
            boolean r1 = U.a.a(r10, r6)
            if (r1 == 0) goto L2c
            float r1 = r11.f2447b
            float r8 = r12.f2449d
            goto L14
        L2c:
            boolean r1 = U.a.a(r10, r5)
            if (r1 == 0) goto L91
            float r1 = r11.f2449d
            float r1 = r2 - r1
        L36:
            r8 = 0
            float r1 = java.lang.Math.max(r8, r1)
            float r1 = java.lang.Math.abs(r1)
            long r8 = (long) r1
            boolean r0 = U.a.a(r10, r0)
            r1 = 1
            if (r0 == 0) goto L49
            r0 = r1
            goto L4d
        L49:
            boolean r0 = U.a.a(r10, r7)
        L4d:
            r7 = 2
            if (r0 == 0) goto L61
            float r10 = r11.b()
            float r0 = (float) r7
            float r10 = r10 / r0
            float r11 = r11.f2447b
            float r10 = r10 + r11
            float r11 = r12.b()
            float r11 = r11 / r0
            float r11 = r11 + r2
        L5f:
            float r10 = r10 - r11
            goto L7e
        L61:
            boolean r0 = U.a.a(r10, r6)
            if (r0 == 0) goto L68
            goto L6c
        L68:
            boolean r1 = U.a.a(r10, r5)
        L6c:
            if (r1 == 0) goto L8b
            float r10 = r11.c()
            float r0 = (float) r7
            float r10 = r10 / r0
            float r11 = r11.f2446a
            float r10 = r10 + r11
            float r11 = r12.c()
            float r11 = r11 / r0
            float r11 = r11 + r3
            goto L5f
        L7e:
            float r10 = java.lang.Math.abs(r10)
            long r10 = (long) r10
            r12 = 13
            long r0 = (long) r12
            long r0 = r0 * r8
            long r0 = r0 * r8
            long r10 = r10 * r10
            long r10 = r10 + r0
            return r10
        L8b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>(r4)
            throw r10
        L91:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>(r4)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: U.c.s(int, V.d, V.d):long");
    }

    public static final boolean t(q qVar) {
        C0444z c0444z;
        Y y3;
        C0444z c0444z2;
        Y y4 = qVar.f2094k;
        return (y4 == null || (c0444z = y4.f5217n) == null || !c0444z.v() || (y3 = qVar.f2094k) == null || (c0444z2 = y3.f5217n) == null || !c0444z2.u()) ? false : true;
    }

    public static final int u(q qVar, int i3) {
        int ordinal = qVar.h0().ordinal();
        if (ordinal == 0) {
            return 1;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                return 2;
            }
            if (ordinal == 3) {
                return 1;
            }
            throw new B1.c();
        }
        q n2 = n(qVar);
        if (n2 == null) {
            throw new IllegalArgumentException("ActiveParent with no focused child");
        }
        int u3 = u(n2, i3);
        if (u3 == 1) {
            u3 = 0;
        }
        if (u3 != 0) {
            return u3;
        }
        if (qVar.f2365q) {
            return 1;
        }
        qVar.f2365q = true;
        try {
            qVar.f0().f2356k.getClass();
            n nVar = n.f2358b;
            return 1;
        } finally {
            qVar.f2365q = false;
        }
    }

    public static final void v(q qVar) {
        if (qVar.f2366r) {
            return;
        }
        qVar.f2366r = true;
        try {
            qVar.f0().f2355j.getClass();
            n nVar = n.f2358b;
        } finally {
            qVar.f2366r = false;
        }
    }

    public static final int w(q qVar, int i3) {
        P.k kVar;
        C0059s c0059s;
        int ordinal = qVar.h0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                q n2 = n(qVar);
                if (n2 != null) {
                    return u(n2, i3);
                }
                throw new IllegalArgumentException("ActiveParent with no focused child");
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    throw new B1.c();
                }
                P.k kVar2 = qVar.f2088d;
                if (!kVar2.f2099p) {
                    throw new IllegalStateException("visitAncestors called on an unattached node");
                }
                P.k kVar3 = kVar2.h;
                C0444z q3 = AbstractC0409C.q(qVar);
                loop0: while (true) {
                    kVar = null;
                    if (q3 == null) {
                        break;
                    }
                    if ((((P.k) q3.f5319x.f857f).f2091g & 1024) != 0) {
                        while (kVar3 != null) {
                            if ((kVar3.f2090f & 1024) != 0) {
                                P.k kVar4 = kVar3;
                                F.d dVar = null;
                                while (kVar4 != null) {
                                    if (kVar4 instanceof q) {
                                        kVar = kVar4;
                                        break loop0;
                                    }
                                    if ((kVar4.f2090f & 1024) != 0 && (kVar4 instanceof AbstractC0428i)) {
                                        int i4 = 0;
                                        for (P.k kVar5 = ((AbstractC0428i) kVar4).f5256r; kVar5 != null; kVar5 = kVar5.f2092i) {
                                            if ((kVar5.f2090f & 1024) != 0) {
                                                i4++;
                                                if (i4 == 1) {
                                                    kVar4 = kVar5;
                                                } else {
                                                    if (dVar == null) {
                                                        dVar = new F.d(new P.k[16]);
                                                    }
                                                    if (kVar4 != null) {
                                                        dVar.b(kVar4);
                                                        kVar4 = null;
                                                    }
                                                    dVar.b(kVar5);
                                                }
                                            }
                                        }
                                        if (i4 == 1) {
                                        }
                                    }
                                    kVar4 = AbstractC0409C.e(dVar);
                                }
                            }
                            kVar3 = kVar3.h;
                        }
                    }
                    q3 = q3.k();
                    kVar3 = (q3 == null || (c0059s = q3.f5319x) == null) ? null : (m0) c0059s.f856e;
                }
                q qVar2 = (q) kVar;
                if (qVar2 == null) {
                    return 1;
                }
                int ordinal2 = qVar2.h0().ordinal();
                if (ordinal2 == 0) {
                    v(qVar2);
                    return 1;
                }
                if (ordinal2 == 1) {
                    return w(qVar2, i3);
                }
                if (ordinal2 == 2) {
                    return 2;
                }
                if (ordinal2 != 3) {
                    throw new B1.c();
                }
                int w3 = w(qVar2, i3);
                int i5 = w3 != 1 ? w3 : 0;
                if (i5 != 0) {
                    return i5;
                }
                v(qVar2);
                return 1;
            }
        }
        return 1;
    }

    public static final boolean x(q qVar) {
        P.k kVar;
        C0059s c0059s;
        int ordinal = qVar.h0().ordinal();
        boolean z3 = true;
        if (ordinal != 0) {
            if (ordinal == 1) {
                q n2 = n(qVar);
                if (n2 != null ? e(n2, false, true) : true) {
                    p(qVar);
                }
                z3 = false;
            } else if (ordinal != 2) {
                if (ordinal != 3) {
                    throw new B1.c();
                }
                P.k kVar2 = qVar.f2088d;
                if (!kVar2.f2099p) {
                    throw new IllegalStateException("visitAncestors called on an unattached node");
                }
                P.k kVar3 = kVar2.h;
                C0444z q3 = AbstractC0409C.q(qVar);
                loop0: while (true) {
                    if (q3 == null) {
                        kVar = null;
                        break;
                    }
                    if ((((P.k) q3.f5319x.f857f).f2091g & 1024) != 0) {
                        while (kVar3 != null) {
                            if ((kVar3.f2090f & 1024) != 0) {
                                kVar = kVar3;
                                F.d dVar = null;
                                while (kVar != null) {
                                    if (kVar instanceof q) {
                                        break loop0;
                                    }
                                    if ((kVar.f2090f & 1024) != 0 && (kVar instanceof AbstractC0428i)) {
                                        int i3 = 0;
                                        for (P.k kVar4 = ((AbstractC0428i) kVar).f5256r; kVar4 != null; kVar4 = kVar4.f2092i) {
                                            if ((kVar4.f2090f & 1024) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    kVar = kVar4;
                                                } else {
                                                    if (dVar == null) {
                                                        dVar = new F.d(new P.k[16]);
                                                    }
                                                    if (kVar != null) {
                                                        dVar.b(kVar);
                                                        kVar = null;
                                                    }
                                                    dVar.b(kVar4);
                                                }
                                            }
                                        }
                                        if (i3 == 1) {
                                        }
                                    }
                                    kVar = AbstractC0409C.e(dVar);
                                }
                            }
                            kVar3 = kVar3.h;
                        }
                    }
                    q3 = q3.k();
                    kVar3 = (q3 == null || (c0059s = q3.f5319x) == null) ? null : (m0) c0059s.f856e;
                }
                q qVar2 = (q) kVar;
                if (qVar2 != null) {
                    p h02 = qVar2.h0();
                    z3 = D(qVar2, qVar);
                    if (z3 && h02 != qVar2.h0()) {
                        A(qVar2);
                    }
                } else {
                    if (((Boolean) ((androidx.compose.ui.focus.a) ((C0507u) AbstractC0409C.r(qVar)).getFocusOwner()).f3316a.h(null, null)).booleanValue()) {
                        p(qVar);
                    }
                    z3 = false;
                }
            }
        }
        if (z3) {
            A(qVar);
        }
        return z3;
    }

    public static final boolean y(q qVar, D2.p pVar) {
        Object[] objArr = new q[16];
        P.k kVar = qVar.f2088d;
        if (!kVar.f2099p) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        F.d dVar = new F.d(new P.k[16]);
        P.k kVar2 = kVar.f2092i;
        if (kVar2 == null) {
            AbstractC0409C.b(dVar, kVar);
        } else {
            dVar.b(kVar2);
        }
        int i3 = 0;
        while (dVar.k()) {
            P.k kVar3 = (P.k) dVar.m(dVar.f1160f - 1);
            if ((kVar3.f2091g & 1024) == 0) {
                AbstractC0409C.b(dVar, kVar3);
            } else {
                while (true) {
                    if (kVar3 == null) {
                        break;
                    }
                    if ((kVar3.f2090f & 1024) != 0) {
                        F.d dVar2 = null;
                        while (kVar3 != null) {
                            if (kVar3 instanceof q) {
                                q qVar2 = (q) kVar3;
                                int i4 = i3 + 1;
                                if (objArr.length < i4) {
                                    objArr = Arrays.copyOf(objArr, Math.max(i4, objArr.length * 2));
                                    p2.g.d(objArr, "copyOf(this, newSize)");
                                }
                                objArr[i3] = qVar2;
                                i3 = i4;
                            } else if ((kVar3.f2090f & 1024) != 0 && (kVar3 instanceof AbstractC0428i)) {
                                int i5 = 0;
                                for (P.k kVar4 = ((AbstractC0428i) kVar3).f5256r; kVar4 != null; kVar4 = kVar4.f2092i) {
                                    if ((kVar4.f2090f & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            kVar3 = kVar4;
                                        } else {
                                            if (dVar2 == null) {
                                                dVar2 = new F.d(new P.k[16]);
                                            }
                                            if (kVar3 != null) {
                                                dVar2.b(kVar3);
                                                kVar3 = null;
                                            }
                                            dVar2.b(kVar4);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            kVar3 = AbstractC0409C.e(dVar2);
                        }
                    } else {
                        kVar3 = kVar3.f2092i;
                    }
                }
            }
        }
        s sVar = s.f2370a;
        p2.g.e(objArr, "<this>");
        Arrays.sort(objArr, 0, i3, sVar);
        if (i3 > 0) {
            int i6 = i3 - 1;
            do {
                q qVar3 = (q) objArr[i6];
                if (t(qVar3) && a(qVar3, pVar)) {
                    return true;
                }
                i6--;
            } while (i6 >= 0);
        }
        return false;
    }

    public static final boolean z(q qVar, D2.p pVar) {
        Object[] objArr = new q[16];
        P.k kVar = qVar.f2088d;
        if (!kVar.f2099p) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        F.d dVar = new F.d(new P.k[16]);
        P.k kVar2 = kVar.f2092i;
        if (kVar2 == null) {
            AbstractC0409C.b(dVar, kVar);
        } else {
            dVar.b(kVar2);
        }
        int i3 = 0;
        while (dVar.k()) {
            P.k kVar3 = (P.k) dVar.m(dVar.f1160f - 1);
            if ((kVar3.f2091g & 1024) == 0) {
                AbstractC0409C.b(dVar, kVar3);
            } else {
                while (true) {
                    if (kVar3 == null) {
                        break;
                    }
                    if ((kVar3.f2090f & 1024) != 0) {
                        F.d dVar2 = null;
                        while (kVar3 != null) {
                            if (kVar3 instanceof q) {
                                q qVar2 = (q) kVar3;
                                int i4 = i3 + 1;
                                if (objArr.length < i4) {
                                    objArr = Arrays.copyOf(objArr, Math.max(i4, objArr.length * 2));
                                    p2.g.d(objArr, "copyOf(this, newSize)");
                                }
                                objArr[i3] = qVar2;
                                i3 = i4;
                            } else if ((kVar3.f2090f & 1024) != 0 && (kVar3 instanceof AbstractC0428i)) {
                                int i5 = 0;
                                for (P.k kVar4 = ((AbstractC0428i) kVar3).f5256r; kVar4 != null; kVar4 = kVar4.f2092i) {
                                    if ((kVar4.f2090f & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            kVar3 = kVar4;
                                        } else {
                                            if (dVar2 == null) {
                                                dVar2 = new F.d(new P.k[16]);
                                            }
                                            if (kVar3 != null) {
                                                dVar2.b(kVar3);
                                                kVar3 = null;
                                            }
                                            dVar2.b(kVar4);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            kVar3 = AbstractC0409C.e(dVar2);
                        }
                    } else {
                        kVar3 = kVar3.f2092i;
                    }
                }
            }
        }
        s sVar = s.f2370a;
        p2.g.e(objArr, "<this>");
        Arrays.sort(objArr, 0, i3, sVar);
        if (i3 <= 0) {
            return false;
        }
        int i6 = 0;
        do {
            q qVar3 = (q) objArr[i6];
            if (t(qVar3) && k(qVar3, pVar)) {
                return true;
            }
            i6++;
        } while (i6 < i3);
        return false;
    }
}
