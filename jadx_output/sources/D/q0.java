package D;

import a.AbstractC0090a;
import android.view.KeyEvent;
import c2.C0174m;
import n.C0375B;
import n0.AbstractC0409C;
import n0.AbstractC0418L;
import n0.AbstractC0428i;
import n0.C0413G;
import n0.C0415I;
import n0.C0417K;
import n0.C0444z;
import o0.C0507u;

/* loaded from: classes.dex */
public final class q0 extends p2.h implements o2.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f845e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f846f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f847g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(Object obj, int i3, Object obj2) {
        super(0);
        this.f845e = i3;
        this.f846f = obj;
        this.f847g = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [P.k] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [P.k] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [F.d] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [F.d] */
    @Override // o2.a
    public final Object c() {
        l0.n placementScope;
        boolean dispatchKeyEvent;
        switch (this.f845e) {
            case 0:
                C0375B c0375b = (C0375B) this.f846f;
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
                                    ((C0060t) this.f847g).u(objArr[(i3 << 3) + i5]);
                                }
                                j3 >>= 8;
                            }
                            if (i4 != 8) {
                            }
                        }
                        if (i3 != length) {
                            i3++;
                        }
                    }
                }
                return C0174m.f3840a;
            case 1:
                ((p2.o) this.f846f).f5960d = ((U.q) this.f847g).f0();
                return C0174m.f3840a;
            case 2:
                C0059s c0059s = ((C0444z) this.f846f).f5319x;
                if ((((P.k) c0059s.f857f).f2091g & 8) != 0) {
                    for (P.k kVar = (n0.m0) c0059s.f856e; kVar != null; kVar = kVar.h) {
                        if ((kVar.f2090f & 8) != 0) {
                            AbstractC0428i abstractC0428i = kVar;
                            ?? r3 = 0;
                            while (abstractC0428i != 0) {
                                if (abstractC0428i instanceof n0.l0) {
                                    n0.l0 l0Var = (n0.l0) abstractC0428i;
                                    boolean D3 = l0Var.D();
                                    p2.o oVar = (p2.o) this.f847g;
                                    if (D3) {
                                        t0.g gVar = new t0.g();
                                        oVar.f5960d = gVar;
                                        gVar.f6232f = true;
                                    }
                                    if (l0Var.G()) {
                                        ((t0.g) oVar.f5960d).f6231e = true;
                                    }
                                    l0Var.A((t0.g) oVar.f5960d);
                                } else if ((abstractC0428i.f2090f & 8) != 0 && (abstractC0428i instanceof AbstractC0428i)) {
                                    P.k kVar2 = abstractC0428i.f5256r;
                                    int i6 = 0;
                                    abstractC0428i = abstractC0428i;
                                    r3 = r3;
                                    while (kVar2 != null) {
                                        if ((kVar2.f2090f & 8) != 0) {
                                            i6++;
                                            r3 = r3;
                                            if (i6 == 1) {
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
                                    if (i6 == 1) {
                                    }
                                }
                                abstractC0428i = AbstractC0409C.e(r3);
                            }
                        }
                    }
                }
                return C0174m.f3840a;
            case 3:
                C0415I c0415i = (C0415I) this.f846f;
                n0.Y y3 = c0415i.a().f5219p;
                if (y3 == null || (placementScope = y3.f5165k) == null) {
                    placementScope = ((C0507u) AbstractC0409C.s(c0415i.f5131a)).getPlacementScope();
                }
                C0413G c0413g = (C0413G) this.f847g;
                o2.c cVar = c0413g.f5105C;
                if (cVar == null) {
                    n0.Y a3 = c0415i.a();
                    long j4 = c0413g.f5106D;
                    float f3 = c0413g.f5107E;
                    placementScope.getClass();
                    l0.n.a(placementScope, a3);
                    a3.G(AbstractC0090a.X(j4, a3.h), f3, null);
                } else {
                    n0.Y a4 = c0415i.a();
                    long j5 = c0413g.f5106D;
                    float f4 = c0413g.f5107E;
                    placementScope.getClass();
                    l0.n.a(placementScope, a4);
                    a4.G(AbstractC0090a.X(j5, a4.h), f4, cVar);
                }
                return C0174m.f3840a;
            case 4:
                o2.c d3 = ((n0.i0) this.f846f).f5257d.d();
                if (d3 != null) {
                    AbstractC0418L abstractC0418L = (AbstractC0418L) this.f847g;
                    abstractC0418L.getClass();
                    d3.i(new C0417K(abstractC0418L));
                }
                return C0174m.f3840a;
            case 5:
                dispatchKeyEvent = super/*android.view.ViewGroup*/.dispatchKeyEvent((KeyEvent) this.f847g);
                return Boolean.valueOf(dispatchKeyEvent);
            default:
                ((p2.o) this.f846f).f5960d = AbstractC0409C.h((q.v) this.f847g, l0.m.f4926a);
                return C0174m.f3840a;
        }
    }
}
