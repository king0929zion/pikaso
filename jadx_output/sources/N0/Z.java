package n0;

import g0.InterfaceC0265c;
import j0.C0292a;
import m0.InterfaceC0371c;
import n.AbstractC0376C;
import n.C0403w;
import o0.C0507u;

/* loaded from: classes.dex */
public abstract class Z {

    /* renamed from: a, reason: collision with root package name */
    public static final C0403w f5230a;

    static {
        C0403w c0403w = AbstractC0376C.f4965a;
        f5230a = new C0403w();
    }

    public static final void a(P.k kVar) {
        if (kVar.f2099p) {
            b(kVar, -1, 1);
        } else {
            Z0.d.S("autoInvalidateInsertedNode called on unattached node");
            throw null;
        }
    }

    public static final void b(P.k kVar, int i3, int i4) {
        if (!(kVar instanceof AbstractC0428i)) {
            c(kVar, i3 & kVar.f2090f, i4);
            return;
        }
        AbstractC0428i abstractC0428i = (AbstractC0428i) kVar;
        c(kVar, abstractC0428i.f5255q & i3, i4);
        int i5 = (~abstractC0428i.f5255q) & i3;
        for (P.k kVar2 = abstractC0428i.f5256r; kVar2 != null; kVar2 = kVar2.f2092i) {
            b(kVar2, i5, i4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(P.k kVar, int i3, int i4) {
        if (i4 != 0 || kVar.V()) {
            if ((i3 & 2) != 0 && (kVar instanceof InterfaceC0437s)) {
                AbstractC0409C.l((InterfaceC0437s) kVar);
                if (i4 == 2) {
                    Y p3 = AbstractC0409C.p(kVar, 2);
                    p3.f5220q = true;
                    p3.f5214D.c();
                    if (p3.f5216F != null) {
                        p3.J0(null, false);
                        p3.f5217n.E(false);
                    }
                }
            }
            if ((i3 & 128) != 0 && (kVar instanceof r) && i4 != 2) {
                AbstractC0409C.q(kVar).r();
            }
            if ((i3 & 256) != 0 && (kVar instanceof InterfaceC0431l) && i4 != 2) {
                C0444z q3 = AbstractC0409C.q(kVar);
                C0415I c0415i = q3.f5320y;
                if (!c0415i.f5134d && !c0415i.f5133c && !q3.f5296D) {
                    C0507u c0507u = (C0507u) AbstractC0409C.s(q3);
                    ((F.d) c0507u.f5677J.f5181e.f316e).b(q3);
                    q3.f5296D = true;
                    c0507u.C(null);
                }
            }
            if ((i3 & 4) != 0 && (kVar instanceof InterfaceC0430k)) {
                AbstractC0409C.k((InterfaceC0430k) kVar);
            }
            if ((i3 & 8) != 0 && (kVar instanceof l0)) {
                AbstractC0409C.m((l0) kVar);
            }
            if ((i3 & 64) != 0 && (kVar instanceof h0)) {
                C0415I c0415i2 = AbstractC0409C.q((h0) kVar).f5320y;
                c0415i2.f5146q.f5120r = true;
                C0412F c0412f = c0415i2.f5147r;
                if (c0412f != null) {
                    c0412f.f5099w = true;
                }
            }
            if ((i3 & 1024) != 0 && (kVar instanceof U.q) && i4 != 2) {
                U.c.q((U.q) kVar);
            }
            if ((i3 & 2048) != 0 && (kVar instanceof U.l)) {
                U.l lVar = (U.l) kVar;
                C0422c.f5234b = null;
                lVar.h(C0422c.f5233a);
                if (C0422c.f5234b != null) {
                    if (i4 == 2) {
                        P.k kVar2 = ((P.k) lVar).f2088d;
                        if (!kVar2.f2099p) {
                            throw new IllegalStateException("visitChildren called on an unattached node");
                        }
                        F.d dVar = new F.d(new P.k[16]);
                        P.k kVar3 = kVar2.f2092i;
                        if (kVar3 == null) {
                            AbstractC0409C.b(dVar, kVar2);
                        } else {
                            dVar.b(kVar3);
                        }
                        while (dVar.k()) {
                            P.k kVar4 = (P.k) dVar.m(dVar.f1160f - 1);
                            if ((kVar4.f2091g & 1024) == 0) {
                                AbstractC0409C.b(dVar, kVar4);
                            } else {
                                while (true) {
                                    if (kVar4 == null) {
                                        break;
                                    }
                                    if ((kVar4.f2090f & 1024) != 0) {
                                        F.d dVar2 = null;
                                        while (kVar4 != null) {
                                            if (kVar4 instanceof U.q) {
                                                U.c.q((U.q) kVar4);
                                            } else if ((kVar4.f2090f & 1024) != 0 && (kVar4 instanceof AbstractC0428i)) {
                                                int i5 = 0;
                                                for (P.k kVar5 = ((AbstractC0428i) kVar4).f5256r; kVar5 != null; kVar5 = kVar5.f2092i) {
                                                    if ((kVar5.f2090f & 1024) != 0) {
                                                        i5++;
                                                        if (i5 == 1) {
                                                            kVar4 = kVar5;
                                                        } else {
                                                            if (dVar2 == null) {
                                                                dVar2 = new F.d(new P.k[16]);
                                                            }
                                                            if (kVar4 != null) {
                                                                dVar2.b(kVar4);
                                                                kVar4 = null;
                                                            }
                                                            dVar2.b(kVar5);
                                                        }
                                                    }
                                                }
                                                if (i5 == 1) {
                                                }
                                            }
                                            kVar4 = AbstractC0409C.e(dVar2);
                                        }
                                    } else {
                                        kVar4 = kVar4.f2092i;
                                    }
                                }
                            }
                        }
                    } else {
                        U.e eVar = ((androidx.compose.ui.focus.a) ((C0507u) AbstractC0409C.r(lVar)).getFocusOwner()).f3320e;
                        eVar.b(eVar.f2338e, lVar);
                    }
                }
            }
            if ((i3 & 4096) == 0 || !(kVar instanceof U.b)) {
                return;
            }
            U.b bVar = (U.b) kVar;
            U.e eVar2 = ((androidx.compose.ui.focus.a) ((C0507u) AbstractC0409C.r(bVar)).getFocusOwner()).f3320e;
            eVar2.b(eVar2.f2337d, bVar);
        }
    }

    public static final void d(P.k kVar) {
        if (kVar.f2099p) {
            b(kVar, -1, 0);
        } else {
            Z0.d.S("autoInvalidateUpdatedNode called on unattached node");
            throw null;
        }
    }

    public static final int e(P.k kVar) {
        int i3 = kVar.f2090f;
        if (i3 != 0) {
            return i3;
        }
        Class<?> cls = kVar.getClass();
        C0403w c0403w = f5230a;
        int c3 = c0403w.c(cls);
        if (c3 >= 0) {
            return c0403w.f5046c[c3];
        }
        int i4 = kVar instanceof InterfaceC0437s ? 3 : 1;
        if (kVar instanceof InterfaceC0430k) {
            i4 |= 4;
        }
        if (kVar instanceof l0) {
            i4 |= 8;
        }
        if (kVar instanceof j0) {
            i4 |= 16;
        }
        if (kVar instanceof InterfaceC0371c) {
            i4 |= 32;
        }
        if (kVar instanceof h0) {
            i4 |= 64;
        }
        if (kVar instanceof r) {
            i4 |= 128;
        }
        if (kVar instanceof InterfaceC0431l) {
            i4 |= 256;
        }
        if (kVar instanceof U.q) {
            i4 |= 1024;
        }
        if (kVar instanceof U.l) {
            i4 |= 2048;
        }
        if (kVar instanceof U.b) {
            i4 |= 4096;
        }
        if (kVar instanceof InterfaceC0265c) {
            i4 |= 8192;
        }
        if (kVar instanceof C0292a) {
            i4 |= 16384;
        }
        if (kVar instanceof InterfaceC0426g) {
            i4 |= 32768;
        }
        int i5 = kVar instanceof o0 ? 262144 | i4 : i4;
        int b3 = c0403w.b(cls);
        if (b3 < 0) {
            b3 = ~b3;
        }
        c0403w.f5045b[b3] = cls;
        c0403w.f5046c[b3] = i5;
        return i5;
    }

    public static final int f(P.k kVar) {
        if (!(kVar instanceof AbstractC0428i)) {
            return e(kVar);
        }
        AbstractC0428i abstractC0428i = (AbstractC0428i) kVar;
        int i3 = abstractC0428i.f5255q;
        for (P.k kVar2 = abstractC0428i.f5256r; kVar2 != null; kVar2 = kVar2.f2092i) {
            i3 |= f(kVar2);
        }
        return i3;
    }

    public static final boolean g(int i3) {
        return (i3 & 128) != 0;
    }
}
