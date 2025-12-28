package n0;

import D.C0032d;
import D.InterfaceC0063w;
import D.M0;
import c2.C0174m;
import l0.InterfaceC0361k;
import o0.AbstractC0479f0;
import o0.F0;

/* renamed from: n0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0423d extends p2.h implements o2.e {

    /* renamed from: f, reason: collision with root package name */
    public static final C0423d f5237f = new C0423d(2, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final C0423d f5238g = new C0423d(2, 1);
    public static final C0423d h = new C0423d(2, 2);

    /* renamed from: i, reason: collision with root package name */
    public static final C0423d f5239i = new C0423d(2, 3);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5240e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0423d(int i3, int i4) {
        super(i3);
        this.f5240e = i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [P.k] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [P.k] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [P.k] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19, types: [P.k] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23, types: [P.k] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v3, types: [F.d] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [F.d] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [P.k] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [F.d] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16, types: [F.d] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21, types: [F.d] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24, types: [F.d] */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        switch (this.f5240e) {
            case 0:
                ((Number) obj2).intValue();
                ((InterfaceC0425f) obj).getClass();
                break;
            case 1:
                InterfaceC0361k interfaceC0361k = (InterfaceC0361k) obj2;
                C0444z c0444z = (C0444z) ((InterfaceC0425f) obj);
                if (!p2.g.a(c0444z.f5313r, interfaceC0361k)) {
                    c0444z.f5313r = interfaceC0361k;
                    c0444z.r();
                }
                break;
            case 2:
                ((C0444z) ((InterfaceC0425f) obj)).K((P.l) obj2);
                break;
            default:
                InterfaceC0063w interfaceC0063w = (InterfaceC0063w) obj2;
                C0444z c0444z2 = (C0444z) ((InterfaceC0425f) obj);
                c0444z2.f5317v = interfaceC0063w;
                M0 m02 = AbstractC0479f0.f5574f;
                L.e eVar = (L.e) interfaceC0063w;
                eVar.getClass();
                c0444z2.I((G0.b) C0032d.B(eVar, m02));
                G0.f fVar = (G0.f) C0032d.B(eVar, AbstractC0479f0.f5579l);
                if (c0444z2.f5315t != fVar) {
                    c0444z2.f5315t = fVar;
                    c0444z2.r();
                    C0444z k3 = c0444z2.k();
                    if (k3 != null) {
                        k3.p();
                    }
                    c0444z2.q();
                    P.k kVar = (P.k) c0444z2.f5319x.f857f;
                    if ((kVar.f2091g & 4) != 0) {
                        while (kVar != null) {
                            if ((kVar.f2090f & 4) != 0) {
                                AbstractC0428i abstractC0428i = kVar;
                                ?? r3 = 0;
                                while (abstractC0428i != 0) {
                                    if (abstractC0428i instanceof InterfaceC0430k) {
                                        InterfaceC0430k interfaceC0430k = (InterfaceC0430k) abstractC0428i;
                                        if (interfaceC0430k instanceof T.a) {
                                            ((T.a) interfaceC0430k).f0();
                                        }
                                    } else if ((abstractC0428i.f2090f & 4) != 0 && (abstractC0428i instanceof AbstractC0428i)) {
                                        P.k kVar2 = abstractC0428i.f5256r;
                                        int i3 = 0;
                                        abstractC0428i = abstractC0428i;
                                        r3 = r3;
                                        while (kVar2 != null) {
                                            if ((kVar2.f2090f & 4) != 0) {
                                                i3++;
                                                r3 = r3;
                                                if (i3 == 1) {
                                                    abstractC0428i = kVar2;
                                                } else {
                                                    if (r3 == 0) {
                                                        r3 = new F.d(new P.k[16]);
                                                    }
                                                    if (abstractC0428i != 0) {
                                                        r3.b(abstractC0428i);
                                                        abstractC0428i = 0;
                                                    }
                                                    r3.b(kVar2);
                                                }
                                            }
                                            kVar2 = kVar2.f2092i;
                                            abstractC0428i = abstractC0428i;
                                            r3 = r3;
                                        }
                                        if (i3 == 1) {
                                        }
                                    }
                                    abstractC0428i = AbstractC0409C.e(r3);
                                }
                            }
                            if ((kVar.f2091g & 4) != 0) {
                                kVar = kVar.f2092i;
                            }
                        }
                    }
                }
                F0 f02 = (F0) C0032d.B(eVar, AbstractC0479f0.f5584q);
                if (!p2.g.a(c0444z2.f5316u, f02)) {
                    c0444z2.f5316u = f02;
                    P.k kVar3 = (P.k) c0444z2.f5319x.f857f;
                    if ((kVar3.f2091g & 16) != 0) {
                        while (kVar3 != null) {
                            if ((kVar3.f2090f & 16) != 0) {
                                AbstractC0428i abstractC0428i2 = kVar3;
                                ?? r32 = 0;
                                while (abstractC0428i2 != 0) {
                                    if (abstractC0428i2 instanceof j0) {
                                        ((j0) abstractC0428i2).t();
                                    } else if ((abstractC0428i2.f2090f & 16) != 0 && (abstractC0428i2 instanceof AbstractC0428i)) {
                                        P.k kVar4 = abstractC0428i2.f5256r;
                                        int i4 = 0;
                                        abstractC0428i2 = abstractC0428i2;
                                        r32 = r32;
                                        while (kVar4 != null) {
                                            if ((kVar4.f2090f & 16) != 0) {
                                                i4++;
                                                r32 = r32;
                                                if (i4 == 1) {
                                                    abstractC0428i2 = kVar4;
                                                } else {
                                                    if (r32 == 0) {
                                                        r32 = new F.d(new P.k[16]);
                                                    }
                                                    if (abstractC0428i2 != 0) {
                                                        r32.b(abstractC0428i2);
                                                        abstractC0428i2 = 0;
                                                    }
                                                    r32.b(kVar4);
                                                }
                                            }
                                            kVar4 = kVar4.f2092i;
                                            abstractC0428i2 = abstractC0428i2;
                                            r32 = r32;
                                        }
                                        if (i4 == 1) {
                                        }
                                    }
                                    abstractC0428i2 = AbstractC0409C.e(r32);
                                }
                            }
                            if ((kVar3.f2091g & 16) != 0) {
                                kVar3 = kVar3.f2092i;
                            }
                        }
                    }
                }
                P.k kVar5 = (P.k) c0444z2.f5319x.f857f;
                if ((kVar5.f2091g & 32768) != 0) {
                    while (kVar5 != null) {
                        if ((kVar5.f2090f & 32768) != 0) {
                            AbstractC0428i abstractC0428i3 = kVar5;
                            ?? r22 = 0;
                            while (abstractC0428i3 != 0) {
                                if (abstractC0428i3 instanceof InterfaceC0426g) {
                                    P.k kVar6 = ((P.k) ((InterfaceC0426g) abstractC0428i3)).f2088d;
                                    if (kVar6.f2099p) {
                                        Z.d(kVar6);
                                    } else {
                                        kVar6.f2096m = true;
                                    }
                                } else if ((abstractC0428i3.f2090f & 32768) != 0 && (abstractC0428i3 instanceof AbstractC0428i)) {
                                    P.k kVar7 = abstractC0428i3.f5256r;
                                    int i5 = 0;
                                    abstractC0428i3 = abstractC0428i3;
                                    r22 = r22;
                                    while (kVar7 != null) {
                                        if ((kVar7.f2090f & 32768) != 0) {
                                            i5++;
                                            r22 = r22;
                                            if (i5 == 1) {
                                                abstractC0428i3 = kVar7;
                                            } else {
                                                if (r22 == 0) {
                                                    r22 = new F.d(new P.k[16]);
                                                }
                                                if (abstractC0428i3 != 0) {
                                                    r22.b(abstractC0428i3);
                                                    abstractC0428i3 = 0;
                                                }
                                                r22.b(kVar7);
                                            }
                                        }
                                        kVar7 = kVar7.f2092i;
                                        abstractC0428i3 = abstractC0428i3;
                                        r22 = r22;
                                    }
                                    if (i5 == 1) {
                                    }
                                }
                                abstractC0428i3 = AbstractC0409C.e(r22);
                            }
                        }
                        if ((kVar5.f2091g & 32768) != 0) {
                            kVar5 = kVar5.f2092i;
                        }
                    }
                }
                break;
        }
        return C0174m.f3840a;
    }
}
