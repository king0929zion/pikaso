package n0;

import D.AbstractC0047k0;
import D.C0032d;
import D.C0059s;
import l0.C0356f;
import o0.C0507u;

/* renamed from: n0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0409C {

    /* renamed from: a, reason: collision with root package name */
    public static final G0.c f5078a = new G0.c(1.0f, 1.0f);

    public static final long a(float f3, boolean z3) {
        return ((z3 ? 1L : 0L) & 4294967295L) | (Float.floatToIntBits(f3) << 32);
    }

    public static final void b(F.d dVar, P.k kVar) {
        F.d n2 = q(kVar).n();
        int i3 = n2.f1160f;
        if (i3 > 0) {
            int i4 = i3 - 1;
            Object[] objArr = n2.f1158d;
            do {
                dVar.b((P.k) ((C0444z) objArr[i4]).f5319x.f857f);
                i4--;
            } while (i4 >= 0);
        }
    }

    public static final int c(AbstractC0418L abstractC0418L, C0356f c0356f) {
        AbstractC0418L R2 = abstractC0418L.R();
        if (R2 == null) {
            Z0.d.S("Child of " + abstractC0418L + " cannot be null when calculating alignment line");
            throw null;
        }
        if (abstractC0418L.X().b().containsKey(c0356f)) {
            Integer num = (Integer) abstractC0418L.X().b().get(c0356f);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        }
        int Q2 = R2.Q(c0356f);
        if (Q2 == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        R2.f5163i = true;
        abstractC0418L.f5164j = true;
        abstractC0418L.d0();
        R2.f5163i = false;
        abstractC0418L.f5164j = false;
        return Q2 + ((int) (c0356f instanceof C0356f ? R2.Z() & 4294967295L : R2.Z() >> 32));
    }

    public static final P.k d(InterfaceC0427h interfaceC0427h, int i3) {
        P.k kVar = ((P.k) interfaceC0427h).f2088d.f2092i;
        if (kVar == null || (kVar.f2091g & i3) == 0) {
            return null;
        }
        while (kVar != null) {
            int i4 = kVar.f2090f;
            if ((i4 & 2) != 0) {
                return null;
            }
            if ((i4 & i3) != 0) {
                return kVar;
            }
            kVar = kVar.f2092i;
        }
        return null;
    }

    public static final P.k e(F.d dVar) {
        if (dVar == null || dVar.j()) {
            return null;
        }
        return (P.k) dVar.m(dVar.f1160f - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC0437s f(P.k kVar) {
        if ((kVar.f2090f & 2) != 0) {
            if (kVar instanceof InterfaceC0437s) {
                return (InterfaceC0437s) kVar;
            }
            if (kVar instanceof AbstractC0428i) {
                P.k kVar2 = ((AbstractC0428i) kVar).f5256r;
                while (kVar2 != 0) {
                    if (kVar2 instanceof InterfaceC0437s) {
                        return (InterfaceC0437s) kVar2;
                    }
                    kVar2 = (!(kVar2 instanceof AbstractC0428i) || (kVar2.f2090f & 2) == 0) ? kVar2.f2092i : ((AbstractC0428i) kVar2).f5256r;
                }
            }
        }
        return null;
    }

    public static final int g(long j3, long j4) {
        boolean z3 = ((int) (j3 & 4294967295L)) != 0;
        return z3 != (((int) (4294967295L & j4)) != 0) ? z3 ? -1 : 1 : (int) Math.signum(Float.intBitsToFloat((int) (j3 >> 32)) - Float.intBitsToFloat((int) (j4 >> 32)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object h(InterfaceC0426g interfaceC0426g, AbstractC0047k0 abstractC0047k0) {
        if (!((P.k) interfaceC0426g).f2088d.f2099p) {
            Z0.d.S("Cannot read CompositionLocal because the Modifier node is not currently attached.");
            throw null;
        }
        L.e eVar = (L.e) q(interfaceC0426g).f5317v;
        eVar.getClass();
        return C0032d.B(eVar, abstractC0047k0);
    }

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
    public static final o0 i(InterfaceC0427h interfaceC0427h, Object obj) {
        C0059s c0059s;
        P.k kVar = ((P.k) interfaceC0427h).f2088d;
        if (!kVar.f2099p) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        P.k kVar2 = kVar.h;
        C0444z q3 = q(interfaceC0427h);
        while (q3 != null) {
            if ((((P.k) q3.f5319x.f857f).f2091g & 262144) != 0) {
                while (kVar2 != null) {
                    if ((kVar2.f2090f & 262144) != 0) {
                        AbstractC0428i abstractC0428i = kVar2;
                        ?? r4 = 0;
                        while (abstractC0428i != 0) {
                            if (abstractC0428i instanceof o0) {
                                o0 o0Var = (o0) abstractC0428i;
                                if (obj.equals(o0Var.j())) {
                                    return o0Var;
                                }
                            } else if ((abstractC0428i.f2090f & 262144) != 0 && (abstractC0428i instanceof AbstractC0428i)) {
                                P.k kVar3 = abstractC0428i.f5256r;
                                int i3 = 0;
                                abstractC0428i = abstractC0428i;
                                r4 = r4;
                                while (kVar3 != null) {
                                    if ((kVar3.f2090f & 262144) != 0) {
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
                            abstractC0428i = e(r4);
                        }
                    }
                    kVar2 = kVar2.h;
                }
            }
            q3 = q3.k();
            kVar2 = (q3 == null || (c0059s = q3.f5319x) == null) ? null : (m0) c0059s.f856e;
        }
        return null;
    }

    public static final int j(int[] iArr) {
        return Math.min(iArr[2] - iArr[0], iArr[3] - iArr[1]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void k(InterfaceC0430k interfaceC0430k) {
        if (((P.k) interfaceC0430k).f2088d.f2099p) {
            p(interfaceC0430k, 1).w0();
        }
    }

    public static final void l(InterfaceC0437s interfaceC0437s) {
        q(interfaceC0437s).r();
    }

    public static final void m(l0 l0Var) {
        q(l0Var).s();
    }

    public static final boolean n(C0444z c0444z) {
        if (c0444z.f5302f != null) {
            C0444z k3 = c0444z.k();
            if ((k3 != null ? k3.f5302f : null) == null) {
                return true;
            }
            c0444z.f5320y.getClass();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void o(P.k kVar, o2.a aVar) {
        b0 b0Var = kVar.f2093j;
        if (b0Var == null) {
            b0Var = new b0((a0) kVar);
            kVar.f2093j = b0Var;
        }
        ((C0507u) r(kVar)).getSnapshotObserver().a(b0Var, C0416J.f5152i, aVar);
    }

    public static final Y p(InterfaceC0427h interfaceC0427h, int i3) {
        Y y3 = ((P.k) interfaceC0427h).f2088d.f2094k;
        p2.g.b(y3);
        if (y3.q0() != interfaceC0427h || !Z.g(i3)) {
            return y3;
        }
        Y y4 = y3.f5218o;
        p2.g.b(y4);
        return y4;
    }

    public static final C0444z q(InterfaceC0427h interfaceC0427h) {
        Y y3 = ((P.k) interfaceC0427h).f2088d.f2094k;
        if (y3 != null) {
            return y3.f5217n;
        }
        Z0.d.T("Cannot obtain node coordinator. Is the Modifier.Node attached?");
        throw null;
    }

    public static final e0 r(InterfaceC0427h interfaceC0427h) {
        C0507u c0507u = q(interfaceC0427h).f5307l;
        if (c0507u != null) {
            return c0507u;
        }
        Z0.d.T("This node does not have an owner.");
        throw null;
    }

    public static final e0 s(C0444z c0444z) {
        C0507u c0507u = c0444z.f5307l;
        if (c0507u != null) {
            return c0507u;
        }
        Z0.d.T("LayoutNode should be attached to an owner");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, n0.o0] */
    /* JADX WARN: Type inference failed for: r13v0, types: [o2.c] */
    /* JADX WARN: Type inference failed for: r7v10, types: [P.k] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [P.k] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [F.d] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [F.d] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static final void t(o0 o0Var, o2.c cVar) {
        P.k kVar = ((P.k) o0Var).f2088d;
        if (!kVar.f2099p) {
            Z0.d.S("visitSubtreeIf called on an unattached node");
            throw null;
        }
        F.d dVar = new F.d(new P.k[16]);
        P.k kVar2 = kVar.f2092i;
        if (kVar2 == null) {
            b(dVar, kVar);
        } else {
            dVar.b(kVar2);
        }
        while (dVar.k()) {
            P.k kVar3 = (P.k) dVar.m(dVar.f1160f - 1);
            if ((kVar3.f2091g & 262144) != 0) {
                for (P.k kVar4 = kVar3; kVar4 != null; kVar4 = kVar4.f2092i) {
                    if ((kVar4.f2090f & 262144) != 0) {
                        ?? r8 = 0;
                        AbstractC0428i abstractC0428i = kVar4;
                        while (abstractC0428i != 0) {
                            if (abstractC0428i instanceof o0) {
                                o0 o0Var2 = (o0) abstractC0428i;
                                n0 n0Var = (p2.g.a(o0Var.j(), o0Var2.j()) && o0Var.getClass() == o0Var2.getClass()) ? (n0) cVar.i(o0Var2) : n0.f5270d;
                                if (n0Var == n0.f5272f) {
                                    return;
                                }
                                if (n0Var == n0.f5271e) {
                                    break;
                                }
                            } else if ((abstractC0428i.f2090f & 262144) != 0 && (abstractC0428i instanceof AbstractC0428i)) {
                                P.k kVar5 = abstractC0428i.f5256r;
                                int i3 = 0;
                                abstractC0428i = abstractC0428i;
                                r8 = r8;
                                while (kVar5 != null) {
                                    if ((kVar5.f2090f & 262144) != 0) {
                                        i3++;
                                        r8 = r8;
                                        if (i3 == 1) {
                                            abstractC0428i = kVar5;
                                        } else {
                                            if (r8 == 0) {
                                                r8 = new F.d(new P.k[16]);
                                            }
                                            if (abstractC0428i != 0) {
                                                r8.b(abstractC0428i);
                                                abstractC0428i = 0;
                                            }
                                            r8.b(kVar5);
                                        }
                                    }
                                    kVar5 = kVar5.f2092i;
                                    abstractC0428i = abstractC0428i;
                                    r8 = r8;
                                }
                                if (i3 == 1) {
                                }
                            }
                            abstractC0428i = e(r8);
                        }
                    }
                }
            }
            b(dVar, kVar3);
        }
    }
}
