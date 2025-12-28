package n0;

import A.C0008i;
import D.C0059s;
import W.C0084g;
import a.AbstractC0090a;
import android.os.Build;
import android.view.View;
import d2.AbstractC0239j;
import d2.AbstractC0241l;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.LinkedHashMap;
import l0.C0359i;
import l0.InterfaceC0357g;
import l0.InterfaceC0360j;
import o0.AbstractC0461K;
import o0.C0489k0;
import o0.C0495n0;
import o0.C0507u;
import o0.C0512w0;
import o0.H0;
import o0.I0;

/* loaded from: classes.dex */
public abstract class Y extends AbstractC0418L implements InterfaceC0360j, InterfaceC0357g, f0 {

    /* renamed from: G, reason: collision with root package name */
    public static final W.F f5207G;

    /* renamed from: H, reason: collision with root package name */
    public static final C0436q f5208H;

    /* renamed from: I, reason: collision with root package name */
    public static final V f5209I;

    /* renamed from: J, reason: collision with root package name */
    public static final V f5210J;

    /* renamed from: A, reason: collision with root package name */
    public V.b f5211A;

    /* renamed from: B, reason: collision with root package name */
    public C0436q f5212B;

    /* renamed from: E, reason: collision with root package name */
    public boolean f5215E;

    /* renamed from: F, reason: collision with root package name */
    public d0 f5216F;

    /* renamed from: n, reason: collision with root package name */
    public final C0444z f5217n;

    /* renamed from: o, reason: collision with root package name */
    public Y f5218o;

    /* renamed from: p, reason: collision with root package name */
    public Y f5219p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f5220q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f5221r;

    /* renamed from: s, reason: collision with root package name */
    public o2.c f5222s;

    /* renamed from: t, reason: collision with root package name */
    public G0.b f5223t;

    /* renamed from: u, reason: collision with root package name */
    public G0.f f5224u;

    /* renamed from: w, reason: collision with root package name */
    public M1.j f5226w;

    /* renamed from: x, reason: collision with root package name */
    public LinkedHashMap f5227x;

    /* renamed from: z, reason: collision with root package name */
    public float f5229z;

    /* renamed from: v, reason: collision with root package name */
    public float f5225v = 0.8f;

    /* renamed from: y, reason: collision with root package name */
    public long f5228y = 0;

    /* renamed from: C, reason: collision with root package name */
    public final C0008i f5213C = new C0008i(7, this);

    /* renamed from: D, reason: collision with root package name */
    public final A0.c f5214D = new A0.c(13, this);

    static {
        W.F f3 = new W.F();
        f3.f2489e = 1.0f;
        f3.f2490f = 1.0f;
        f3.f2491g = 1.0f;
        long j3 = W.x.f2570a;
        f3.f2494k = j3;
        f3.f2495l = j3;
        f3.f2499p = 8.0f;
        f3.f2500q = W.K.f2530a;
        f3.f2501r = W.D.f2484a;
        f3.f2503t = 0;
        f3.f2504u = 9205357640488583168L;
        f3.f2505v = new G0.c(1.0f, 1.0f);
        f3.f2506w = G0.f.f1258d;
        f5207G = f3;
        f5208H = new C0436q();
        W.D.j();
        f5209I = new V(0);
        f5210J = new V(1);
    }

    public Y(C0444z c0444z) {
        this.f5217n = c0444z;
        this.f5223t = c0444z.f5314s;
        this.f5224u = c0444z.f5315t;
    }

    public final void A0() {
        C0415I c0415i = this.f5217n.f5320y;
        int i3 = c0415i.f5131a.f5320y.f5132b;
        if (i3 == 3 || i3 == 4) {
            if (c0415i.f5146q.f5127y) {
                c0415i.e(true);
            } else {
                c0415i.d(true);
            }
        }
        if (i3 == 4) {
            C0412F c0412f = c0415i.f5147r;
            if (c0412f == null || !c0412f.f5098v) {
                c0415i.f(true);
            } else {
                c0415i.g(true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:15:0x0055, B:17:0x005b, B:18:0x006d, B:20:0x0073, B:22:0x0078, B:26:0x0081, B:61:0x0085, B:56:0x00c4, B:28:0x008d, B:30:0x0092, B:32:0x0096, B:35:0x009f, B:37:0x00a4, B:43:0x00ac, B:45:0x00b7, B:46:0x00bb, B:41:0x00be, B:64:0x00cb, B:72:0x0063), top: B:14:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0073 A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:15:0x0055, B:17:0x005b, B:18:0x006d, B:20:0x0073, B:22:0x0078, B:26:0x0081, B:61:0x0085, B:56:0x00c4, B:28:0x008d, B:30:0x0092, B:32:0x0096, B:35:0x009f, B:37:0x00a4, B:43:0x00ac, B:45:0x00b7, B:46:0x00bb, B:41:0x00be, B:64:0x00cb, B:72:0x0063), top: B:14:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0063 A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:15:0x0055, B:17:0x005b, B:18:0x006d, B:20:0x0073, B:22:0x0078, B:26:0x0081, B:61:0x0085, B:56:0x00c4, B:28:0x008d, B:30:0x0092, B:32:0x0096, B:35:0x009f, B:37:0x00a4, B:43:0x00ac, B:45:0x00b7, B:46:0x00bb, B:41:0x00be, B:64:0x00cb, B:72:0x0063), top: B:14:0x0055 }] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [P.k] */
    /* JADX WARN: Type inference failed for: r8v8, types: [P.k] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2, types: [F.d] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [F.d] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B0() {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.Y.B0():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [P.k] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [P.k] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [F.d] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [F.d] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void C0() {
        boolean g3 = Z.g(128);
        P.k q02 = q0();
        if (!g3 && (q02 = q02.h) == null) {
            return;
        }
        for (P.k s02 = s0(g3); s02 != null && (s02.f2091g & 128) != 0; s02 = s02.f2092i) {
            if ((s02.f2090f & 128) != 0) {
                AbstractC0428i abstractC0428i = s02;
                ?? r5 = 0;
                while (abstractC0428i != 0) {
                    if (abstractC0428i instanceof r) {
                        ((r) abstractC0428i).K(this);
                    } else if ((abstractC0428i.f2090f & 128) != 0 && (abstractC0428i instanceof AbstractC0428i)) {
                        P.k kVar = abstractC0428i.f5256r;
                        int i3 = 0;
                        abstractC0428i = abstractC0428i;
                        r5 = r5;
                        while (kVar != null) {
                            if ((kVar.f2090f & 128) != 0) {
                                i3++;
                                r5 = r5;
                                if (i3 == 1) {
                                    abstractC0428i = kVar;
                                } else {
                                    if (r5 == 0) {
                                        r5 = new F.d(new P.k[16]);
                                    }
                                    if (abstractC0428i != 0) {
                                        r5.b(abstractC0428i);
                                        abstractC0428i = 0;
                                    }
                                    r5.b(kVar);
                                }
                            }
                            kVar = kVar.f2092i;
                            abstractC0428i = abstractC0428i;
                            r5 = r5;
                        }
                        if (i3 == 1) {
                        }
                    }
                    abstractC0428i = AbstractC0409C.e(r5);
                }
            }
            if (s02 == q02) {
                return;
            }
        }
    }

    public abstract void D0(W.o oVar, Z.d dVar);

    public final void E0(long j3, float f3, o2.c cVar) {
        J0(cVar, false);
        if (!AbstractC0090a.v(this.f5228y, j3)) {
            this.f5228y = j3;
            C0444z c0444z = this.f5217n;
            c0444z.f5320y.f5146q.Q();
            d0 d0Var = this.f5216F;
            if (d0Var != null) {
                d0Var.c(j3);
            } else {
                Y y3 = this.f5219p;
                if (y3 != null) {
                    y3.w0();
                }
            }
            AbstractC0418L.a0(this);
            C0507u c0507u = c0444z.f5307l;
            if (c0507u != null) {
                c0507u.w(c0444z);
            }
        }
        this.f5229z = f3;
        if (this.f5164j) {
            return;
        }
        N(new i0(X(), this));
    }

    public final void F0(V.b bVar, boolean z3, boolean z4) {
        d0 d0Var = this.f5216F;
        if (d0Var != null) {
            if (this.f5221r) {
                if (z4) {
                    long p0 = p0();
                    float d3 = V.f.d(p0) / 2.0f;
                    float b3 = V.f.b(p0) / 2.0f;
                    long j3 = this.f4929f;
                    bVar.a(-d3, -b3, ((int) (j3 >> 32)) + d3, ((int) (j3 & 4294967295L)) + b3);
                } else if (z3) {
                    long j4 = this.f4929f;
                    bVar.a(0.0f, 0.0f, (int) (j4 >> 32), (int) (j4 & 4294967295L));
                }
                if (bVar.b()) {
                    return;
                }
            }
            d0Var.f(bVar, false);
        }
        long j5 = this.f5228y;
        float f3 = (int) (j5 >> 32);
        bVar.f2440a += f3;
        bVar.f2442c += f3;
        float f4 = (int) (j5 & 4294967295L);
        bVar.f2441b += f4;
        bVar.f2443d += f4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [P.k] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [P.k] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [F.d] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [F.d] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final void G0(M1.j jVar) {
        Y y3;
        M1.j jVar2 = this.f5226w;
        if (jVar != jVar2) {
            this.f5226w = jVar;
            C0444z c0444z = this.f5217n;
            if (jVar2 == null || jVar.e() != jVar2.e() || jVar.c() != jVar2.c()) {
                int e3 = jVar.e();
                int c3 = jVar.c();
                d0 d0Var = this.f5216F;
                if (d0Var != null) {
                    d0Var.e(r2.a.d(e3, c3));
                } else if (c0444z.v() && (y3 = this.f5219p) != null) {
                    y3.w0();
                }
                I(r2.a.d(e3, c3));
                if (this.f5222s != null) {
                    K0(false);
                }
                boolean g3 = Z.g(4);
                P.k q02 = q0();
                if (g3 || (q02 = q02.h) != null) {
                    for (P.k s02 = s0(g3); s02 != null && (s02.f2091g & 4) != 0; s02 = s02.f2092i) {
                        if ((s02.f2090f & 4) != 0) {
                            AbstractC0428i abstractC0428i = s02;
                            ?? r7 = 0;
                            while (abstractC0428i != 0) {
                                if (abstractC0428i instanceof InterfaceC0430k) {
                                    ((InterfaceC0430k) abstractC0428i).M();
                                } else if ((abstractC0428i.f2090f & 4) != 0 && (abstractC0428i instanceof AbstractC0428i)) {
                                    P.k kVar = abstractC0428i.f5256r;
                                    int i3 = 0;
                                    abstractC0428i = abstractC0428i;
                                    r7 = r7;
                                    while (kVar != null) {
                                        if ((kVar.f2090f & 4) != 0) {
                                            i3++;
                                            r7 = r7;
                                            if (i3 == 1) {
                                                abstractC0428i = kVar;
                                            } else {
                                                if (r7 == 0) {
                                                    r7 = new F.d(new P.k[16]);
                                                }
                                                if (abstractC0428i != 0) {
                                                    r7.b(abstractC0428i);
                                                    abstractC0428i = 0;
                                                }
                                                r7.b(kVar);
                                            }
                                        }
                                        kVar = kVar.f2092i;
                                        abstractC0428i = abstractC0428i;
                                        r7 = r7;
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                abstractC0428i = AbstractC0409C.e(r7);
                            }
                        }
                        if (s02 == q02) {
                            break;
                        }
                    }
                }
                C0507u c0507u = c0444z.f5307l;
                if (c0507u != null) {
                    c0507u.w(c0444z);
                }
            }
            LinkedHashMap linkedHashMap = this.f5227x;
            if (((linkedHashMap == null || linkedHashMap.isEmpty()) && jVar.b().isEmpty()) || p2.g.a(jVar.b(), this.f5227x)) {
                return;
            }
            c0444z.f5320y.f5146q.f5124v.f();
            LinkedHashMap linkedHashMap2 = this.f5227x;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                this.f5227x = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(jVar.b());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [P.k] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [P.k] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [F.d] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [F.d] */
    public final void H0(P.k kVar, V v3, long j3, C0433n c0433n, boolean z3, boolean z4, float f3) {
        boolean z5;
        if (kVar == null) {
            v0(v3, j3, c0433n, z3, z4);
            return;
        }
        switch (v3.f5192a) {
            case 0:
                ?? r22 = 0;
                AbstractC0428i abstractC0428i = kVar;
                while (true) {
                    int i3 = 0;
                    if (abstractC0428i == 0) {
                        z5 = false;
                        break;
                    } else {
                        if (abstractC0428i instanceof j0) {
                            if (((j0) abstractC0428i).N()) {
                                z5 = true;
                                break;
                            }
                        } else if ((abstractC0428i.f2090f & 16) != 0 && (abstractC0428i instanceof AbstractC0428i)) {
                            P.k kVar2 = abstractC0428i.f5256r;
                            abstractC0428i = abstractC0428i;
                            r22 = r22;
                            while (kVar2 != null) {
                                if ((kVar2.f2090f & 16) != 0) {
                                    i3++;
                                    r22 = r22;
                                    if (i3 == 1) {
                                        abstractC0428i = kVar2;
                                    } else {
                                        if (r22 == 0) {
                                            r22 = new F.d(new P.k[16]);
                                        }
                                        if (abstractC0428i != 0) {
                                            r22.b(abstractC0428i);
                                            abstractC0428i = 0;
                                        }
                                        r22.b(kVar2);
                                    }
                                }
                                kVar2 = kVar2.f2092i;
                                abstractC0428i = abstractC0428i;
                                r22 = r22;
                            }
                            if (i3 == 1) {
                            }
                        }
                        abstractC0428i = AbstractC0409C.e(r22);
                    }
                }
                break;
            default:
                z5 = false;
                break;
        }
        if (!z5) {
            H0(AbstractC0409C.d(kVar, v3.a()), v3, j3, c0433n, z3, z4, f3);
            return;
        }
        X x3 = new X(this, kVar, v3, j3, c0433n, z3, z4, f3, 1);
        if (c0433n.f5268f == AbstractC0241l.T(c0433n)) {
            c0433n.b(kVar, f3, z4, x3);
            if (c0433n.f5268f + 1 == AbstractC0241l.T(c0433n)) {
                c0433n.c();
                return;
            }
            return;
        }
        long a3 = c0433n.a();
        int i4 = c0433n.f5268f;
        c0433n.f5268f = AbstractC0241l.T(c0433n);
        c0433n.b(kVar, f3, z4, x3);
        if (c0433n.f5268f + 1 < AbstractC0241l.T(c0433n) && AbstractC0409C.g(a3, c0433n.a()) > 0) {
            int i5 = c0433n.f5268f + 1;
            int i6 = i4 + 1;
            Object[] objArr = c0433n.f5266d;
            AbstractC0239j.Y(objArr, objArr, i6, i5, c0433n.f5269g);
            long[] jArr = c0433n.f5267e;
            System.arraycopy(jArr, i5, jArr, i6, c0433n.f5269g - i5);
            c0433n.f5268f = ((c0433n.f5269g + i4) - c0433n.f5268f) - 1;
        }
        c0433n.c();
        c0433n.f5268f = i4;
    }

    public final long I0(long j3, boolean z3) {
        d0 d0Var = this.f5216F;
        if (d0Var != null) {
            j3 = d0Var.b(j3, false);
        }
        long j4 = this.f5228y;
        return r2.a.f(V.c.b(j3) + ((int) (j4 >> 32)), V.c.c(j3) + ((int) (j4 & 4294967295L)));
    }

    public final void J0(o2.c cVar, boolean z3) {
        C0507u c0507u;
        Reference poll;
        F.d dVar;
        Object obj;
        C0444z c0444z = this.f5217n;
        boolean z4 = (!z3 && this.f5222s == cVar && p2.g.a(this.f5223t, c0444z.f5314s) && this.f5224u == c0444z.f5315t) ? false : true;
        this.f5223t = c0444z.f5314s;
        this.f5224u = c0444z.f5315t;
        boolean u3 = c0444z.u();
        A0.c cVar2 = this.f5214D;
        if (!u3 || cVar == null) {
            this.f5222s = null;
            d0 d0Var = this.f5216F;
            if (d0Var != null) {
                d0Var.a();
                c0444z.f5293A = true;
                cVar2.c();
                if (q0().f2099p && (c0507u = c0444z.f5307l) != null) {
                    c0507u.w(c0444z);
                }
            }
            this.f5216F = null;
            this.f5215E = false;
            return;
        }
        this.f5222s = cVar;
        if (this.f5216F != null) {
            if (z4) {
                K0(true);
                return;
            }
            return;
        }
        C0507u c0507u2 = (C0507u) AbstractC0409C.s(c0444z);
        C0008i c0008i = this.f5213C;
        do {
            B2.i iVar = c0507u2.f5717q0;
            poll = ((ReferenceQueue) iVar.f317f).poll();
            dVar = (F.d) iVar.f316e;
            if (poll != null) {
                dVar.l(poll);
            }
        } while (poll != null);
        while (true) {
            if (!dVar.k()) {
                obj = null;
                break;
            } else {
                obj = ((Reference) dVar.m(dVar.f1160f - 1)).get();
                if (obj != null) {
                    break;
                }
            }
        }
        d0 d0Var2 = (d0) obj;
        if (d0Var2 != null) {
            d0Var2.i(c0008i, cVar2);
        } else if (!c0507u2.isHardwareAccelerated() || Build.VERSION.SDK_INT == 28) {
            if (c0507u2.isHardwareAccelerated() && c0507u2.f5686S) {
                try {
                    d0Var2 = new C0512w0(c0507u2, c0008i, cVar2);
                } catch (Throwable unused) {
                    c0507u2.f5686S = false;
                }
            }
            if (c0507u2.f5674G == null) {
                if (!H0.f5426v) {
                    AbstractC0461K.q(new View(c0507u2.getContext()));
                }
                C0489k0 c0489k0 = H0.f5427w ? new C0489k0(c0507u2.getContext()) : new I0(c0507u2.getContext());
                c0507u2.f5674G = c0489k0;
                c0507u2.addView(c0489k0, -1);
            }
            C0489k0 c0489k02 = c0507u2.f5674G;
            p2.g.b(c0489k02);
            d0Var2 = new H0(c0507u2, c0489k02, c0008i, cVar2);
        } else {
            d0Var2 = new C0495n0(c0507u2.getGraphicsContext().b(), c0507u2.getGraphicsContext(), c0507u2, c0008i, cVar2);
        }
        d0Var2.e(this.f4929f);
        d0Var2.c(this.f5228y);
        this.f5216F = d0Var2;
        K0(true);
        c0444z.f5293A = true;
        cVar2.c();
    }

    public final void K0(boolean z3) {
        C0507u c0507u;
        d0 d0Var = this.f5216F;
        if (d0Var == null) {
            if (this.f5222s == null) {
                return;
            }
            Z0.d.S("null layer with a non-null layerBlock");
            throw null;
        }
        o2.c cVar = this.f5222s;
        if (cVar == null) {
            Z0.d.T("updateLayerParameters requires a non-null layerBlock");
            throw null;
        }
        W.F f3 = f5207G;
        if (f3.f2489e != 1.0f) {
            f3.f2488d |= 1;
            f3.f2489e = 1.0f;
        }
        if (f3.f2490f != 1.0f) {
            f3.f2488d |= 2;
            f3.f2490f = 1.0f;
        }
        if (f3.f2491g != 1.0f) {
            f3.f2488d |= 4;
            f3.f2491g = 1.0f;
        }
        if (f3.h != 0.0f) {
            f3.f2488d |= 8;
            f3.h = 0.0f;
        }
        if (f3.f2492i != 0.0f) {
            f3.f2488d |= 16;
            f3.f2492i = 0.0f;
        }
        if (f3.f2493j != 0.0f) {
            f3.f2488d |= 32;
            f3.f2493j = 0.0f;
        }
        long j3 = W.x.f2570a;
        if (!W.r.c(f3.f2494k, j3)) {
            f3.f2488d |= 64;
            f3.f2494k = j3;
        }
        if (!W.r.c(f3.f2495l, j3)) {
            f3.f2488d |= 128;
            f3.f2495l = j3;
        }
        if (f3.f2496m != 0.0f) {
            f3.f2488d |= 256;
            f3.f2496m = 0.0f;
        }
        if (f3.f2497n != 0.0f) {
            f3.f2488d |= 512;
            f3.f2497n = 0.0f;
        }
        if (f3.f2498o != 0.0f) {
            f3.f2488d |= 1024;
            f3.f2498o = 0.0f;
        }
        if (f3.f2499p != 8.0f) {
            f3.f2488d |= 2048;
            f3.f2499p = 8.0f;
        }
        long j4 = W.K.f2530a;
        if (f3.f2500q != j4) {
            f3.f2488d |= 4096;
            f3.f2500q = j4;
        }
        X1.e eVar = W.D.f2484a;
        if (!p2.g.a(f3.f2501r, eVar)) {
            f3.f2488d |= 8192;
            f3.f2501r = eVar;
        }
        if (f3.f2502s) {
            f3.f2488d |= 16384;
            f3.f2502s = false;
        }
        if (!p2.g.a(null, null)) {
            f3.f2488d |= 131072;
        }
        if (!W.D.m(f3.f2503t, 0)) {
            f3.f2488d |= 32768;
            f3.f2503t = 0;
        }
        f3.f2504u = 9205357640488583168L;
        f3.f2507x = null;
        f3.f2488d = 0;
        C0444z c0444z = this.f5217n;
        f3.f2505v = c0444z.f5314s;
        f3.f2506w = c0444z.f5315t;
        f3.f2504u = r2.a.c0(this.f4929f);
        ((C0507u) AbstractC0409C.s(c0444z)).getSnapshotObserver().a(this, C0416J.h, new A0.c(14, cVar));
        C0436q c0436q = this.f5212B;
        if (c0436q == null) {
            c0436q = new C0436q();
            this.f5212B = c0436q;
        }
        c0436q.f5277a = f3.f2489e;
        c0436q.f5278b = f3.f2490f;
        c0436q.f5279c = f3.h;
        c0436q.f5280d = f3.f2492i;
        c0436q.f5281e = f3.f2496m;
        c0436q.f5282f = f3.f2497n;
        c0436q.f5283g = f3.f2498o;
        c0436q.h = f3.f2499p;
        c0436q.f5284i = f3.f2500q;
        d0Var.j(f3);
        this.f5221r = f3.f2502s;
        this.f5225v = f3.f2491g;
        if (!z3 || (c0507u = c0444z.f5307l) == null) {
            return;
        }
        c0507u.w(c0444z);
    }

    public final boolean L0(long j3) {
        long j4 = 9187343241974906880L ^ (j3 & 9187343241974906880L);
        if (((~j4) & (j4 - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        d0 d0Var = this.f5216F;
        return d0Var == null || !this.f5221r || d0Var.g(j3);
    }

    @Override // n0.AbstractC0418L
    public final AbstractC0418L R() {
        return this.f5218o;
    }

    @Override // n0.AbstractC0418L
    public final InterfaceC0357g U() {
        return this;
    }

    @Override // n0.AbstractC0418L
    public final boolean V() {
        return this.f5226w != null;
    }

    @Override // n0.AbstractC0418L
    public final C0444z W() {
        return this.f5217n;
    }

    @Override // n0.AbstractC0418L
    public final M1.j X() {
        M1.j jVar = this.f5226w;
        if (jVar != null) {
            return jVar;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    @Override // n0.AbstractC0418L
    public final AbstractC0418L Y() {
        return this.f5219p;
    }

    @Override // n0.AbstractC0418L
    public final long Z() {
        return this.f5228y;
    }

    @Override // n0.AbstractC0418L
    public final void d0() {
        G(this.f5228y, this.f5229z, this.f5222s);
    }

    public final void e0(Y y3, V.b bVar, boolean z3) {
        if (y3 == this) {
            return;
        }
        Y y4 = this.f5219p;
        if (y4 != null) {
            y4.e0(y3, bVar, z3);
        }
        long j3 = this.f5228y;
        float f3 = (int) (j3 >> 32);
        bVar.f2440a -= f3;
        bVar.f2442c -= f3;
        float f4 = (int) (j3 & 4294967295L);
        bVar.f2441b -= f4;
        bVar.f2443d -= f4;
        d0 d0Var = this.f5216F;
        if (d0Var != null) {
            d0Var.f(bVar, true);
            if (this.f5221r && z3) {
                long j4 = this.f4929f;
                bVar.a(0.0f, 0.0f, (int) (j4 >> 32), (int) (j4 & 4294967295L));
            }
        }
    }

    @Override // G0.b
    public final float f() {
        return this.f5217n.f5314s.f();
    }

    public final long f0(Y y3, long j3) {
        if (y3 == this) {
            return j3;
        }
        Y y4 = this.f5219p;
        return (y4 == null || p2.g.a(y3, y4)) ? n0(j3, true) : n0(y4.f0(y3, j3), true);
    }

    public final long g0(long j3) {
        return AbstractC0090a.d(Math.max(0.0f, (V.f.d(j3) - D()) / 2.0f), Math.max(0.0f, (V.f.b(j3) - ((int) (this.f4929f & 4294967295L))) / 2.0f));
    }

    @Override // n0.AbstractC0418L
    public final G0.f getLayoutDirection() {
        return this.f5217n.f5315t;
    }

    @Override // l0.InterfaceC0357g
    public final V.d h(InterfaceC0357g interfaceC0357g, boolean z3) {
        Y y3;
        if (!q0().f2099p) {
            Z0.d.S("LayoutCoordinate operations are only valid when isAttached is true");
            throw null;
        }
        if (!interfaceC0357g.l()) {
            Z0.d.S("LayoutCoordinates " + interfaceC0357g + " is not attached!");
            throw null;
        }
        C0359i c0359i = interfaceC0357g instanceof C0359i ? (C0359i) interfaceC0357g : null;
        if (c0359i == null || (y3 = c0359i.f4924d.f5168n) == null) {
            y3 = (Y) interfaceC0357g;
        }
        y3.A0();
        Y m02 = m0(y3);
        V.b bVar = this.f5211A;
        if (bVar == null) {
            bVar = new V.b();
            bVar.f2440a = 0.0f;
            bVar.f2441b = 0.0f;
            bVar.f2442c = 0.0f;
            bVar.f2443d = 0.0f;
            this.f5211A = bVar;
        }
        bVar.f2440a = 0.0f;
        bVar.f2441b = 0.0f;
        bVar.f2442c = (int) (interfaceC0357g.t() >> 32);
        bVar.f2443d = (int) (interfaceC0357g.t() & 4294967295L);
        while (y3 != m02) {
            y3.F0(bVar, z3, false);
            if (bVar.b()) {
                return V.d.f2445e;
            }
            y3 = y3.f5219p;
            p2.g.b(y3);
        }
        e0(m02, bVar, z3);
        return new V.d(bVar.f2440a, bVar.f2441b, bVar.f2442c, bVar.f2443d);
    }

    public final float h0(long j3, long j4) {
        if (D() >= V.f.d(j4) && ((int) (this.f4929f & 4294967295L)) >= V.f.b(j4)) {
            return Float.POSITIVE_INFINITY;
        }
        long g02 = g0(j4);
        float d3 = V.f.d(g02);
        float b3 = V.f.b(g02);
        float b4 = V.c.b(j3);
        float max = Math.max(0.0f, b4 < 0.0f ? -b4 : b4 - D());
        float c3 = V.c.c(j3);
        long f3 = r2.a.f(max, Math.max(0.0f, c3 < 0.0f ? -c3 : c3 - ((int) (this.f4929f & 4294967295L))));
        if ((d3 <= 0.0f && b3 <= 0.0f) || V.c.b(f3) > d3 || V.c.c(f3) > b3) {
            return Float.POSITIVE_INFINITY;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (f3 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (f3 & 4294967295L));
        return (intBitsToFloat2 * intBitsToFloat2) + (intBitsToFloat * intBitsToFloat);
    }

    public final void i0(W.o oVar, Z.d dVar) {
        d0 d0Var = this.f5216F;
        if (d0Var != null) {
            d0Var.h(oVar, dVar);
            return;
        }
        long j3 = this.f5228y;
        float f3 = (int) (j3 >> 32);
        float f4 = (int) (j3 & 4294967295L);
        oVar.o(f3, f4);
        k0(oVar, dVar);
        oVar.o(-f3, -f4);
    }

    @Override // l0.InterfaceC0357g
    public final long j(long j3) {
        long z02 = z0(j3);
        C0507u c0507u = (C0507u) AbstractC0409C.s(this.f5217n);
        c0507u.A();
        return W.D.t(c0507u.f5681N, z02);
    }

    public final void j0(W.o oVar, C0084g c0084g) {
        long j3 = this.f4929f;
        oVar.getClass();
        oVar.p(0.5f, 0.5f, ((int) (j3 >> 32)) - 0.5f, ((int) (j3 & 4294967295L)) - 0.5f, c0084g);
    }

    public final void k0(W.o oVar, Z.d dVar) {
        P.k r02 = r0(4);
        if (r02 == null) {
            D0(oVar, dVar);
            return;
        }
        C0444z c0444z = this.f5217n;
        c0444z.getClass();
        C0408B sharedDrawScope = ((C0507u) AbstractC0409C.s(c0444z)).getSharedDrawScope();
        long c02 = r2.a.c0(this.f4929f);
        sharedDrawScope.getClass();
        F.d dVar2 = null;
        while (r02 != null) {
            if (r02 instanceof InterfaceC0430k) {
                sharedDrawScope.c(oVar, c02, this, (InterfaceC0430k) r02, dVar);
            } else if ((r02.f2090f & 4) != 0 && (r02 instanceof AbstractC0428i)) {
                int i3 = 0;
                for (P.k kVar = ((AbstractC0428i) r02).f5256r; kVar != null; kVar = kVar.f2092i) {
                    if ((kVar.f2090f & 4) != 0) {
                        i3++;
                        if (i3 == 1) {
                            r02 = kVar;
                        } else {
                            if (dVar2 == null) {
                                dVar2 = new F.d(new P.k[16]);
                            }
                            if (r02 != null) {
                                dVar2.b(r02);
                                r02 = null;
                            }
                            dVar2.b(kVar);
                        }
                    }
                }
                if (i3 == 1) {
                }
            }
            r02 = AbstractC0409C.e(dVar2);
        }
    }

    @Override // l0.InterfaceC0357g
    public final boolean l() {
        return q0().f2099p;
    }

    public abstract void l0();

    public final Y m0(Y y3) {
        C0444z c0444z = y3.f5217n;
        C0444z c0444z2 = this.f5217n;
        if (c0444z == c0444z2) {
            P.k q02 = y3.q0();
            P.k kVar = q0().f2088d;
            if (!kVar.f2099p) {
                Z0.d.S("visitLocalAncestors called on an unattached node");
                throw null;
            }
            for (P.k kVar2 = kVar.h; kVar2 != null; kVar2 = kVar2.h) {
                if ((kVar2.f2090f & 2) != 0 && kVar2 == q02) {
                    return y3;
                }
            }
            return this;
        }
        while (c0444z.f5308m > c0444z2.f5308m) {
            c0444z = c0444z.k();
            p2.g.b(c0444z);
        }
        C0444z c0444z3 = c0444z2;
        while (c0444z3.f5308m > c0444z.f5308m) {
            c0444z3 = c0444z3.k();
            p2.g.b(c0444z3);
        }
        while (c0444z != c0444z3) {
            c0444z = c0444z.k();
            c0444z3 = c0444z3.k();
            if (c0444z == null || c0444z3 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        return c0444z3 == c0444z2 ? this : c0444z == y3.f5217n ? y3 : (C0435p) c0444z.f5319x.f854c;
    }

    @Override // G0.b
    public final float n() {
        return this.f5217n.f5314s.n();
    }

    public final long n0(long j3, boolean z3) {
        long j4 = this.f5228y;
        long f3 = r2.a.f(V.c.b(j3) - ((int) (j4 >> 32)), V.c.c(j3) - ((int) (j4 & 4294967295L)));
        d0 d0Var = this.f5216F;
        return d0Var != null ? d0Var.b(f3, true) : f3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [P.k] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [P.k] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [F.d] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [F.d] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // l0.o, l0.InterfaceC0360j
    public final Object o() {
        C0444z c0444z = this.f5217n;
        if (!c0444z.f5319x.f(64)) {
            return null;
        }
        q0();
        Object obj = null;
        for (P.k kVar = (m0) c0444z.f5319x.f856e; kVar != null; kVar = kVar.h) {
            if ((kVar.f2090f & 64) != 0) {
                AbstractC0428i abstractC0428i = kVar;
                ?? r5 = 0;
                while (abstractC0428i != 0) {
                    if (abstractC0428i instanceof h0) {
                        obj = ((h0) abstractC0428i).I();
                    } else if ((abstractC0428i.f2090f & 64) != 0 && (abstractC0428i instanceof AbstractC0428i)) {
                        P.k kVar2 = abstractC0428i.f5256r;
                        int i3 = 0;
                        abstractC0428i = abstractC0428i;
                        r5 = r5;
                        while (kVar2 != null) {
                            if ((kVar2.f2090f & 64) != 0) {
                                i3++;
                                r5 = r5;
                                if (i3 == 1) {
                                    abstractC0428i = kVar2;
                                } else {
                                    if (r5 == 0) {
                                        r5 = new F.d(new P.k[16]);
                                    }
                                    if (abstractC0428i != 0) {
                                        r5.b(abstractC0428i);
                                        abstractC0428i = 0;
                                    }
                                    r5.b(kVar2);
                                }
                            }
                            kVar2 = kVar2.f2092i;
                            abstractC0428i = abstractC0428i;
                            r5 = r5;
                        }
                        if (i3 == 1) {
                        }
                    }
                    abstractC0428i = AbstractC0409C.e(r5);
                }
            }
        }
        return obj;
    }

    public abstract AbstractC0419M o0();

    @Override // l0.InterfaceC0357g
    public final InterfaceC0357g p() {
        if (q0().f2099p) {
            A0();
            return ((Y) this.f5217n.f5319x.f855d).f5219p;
        }
        Z0.d.S("LayoutCoordinate operations are only valid when isAttached is true");
        throw null;
    }

    public final long p0() {
        return this.f5223t.q(this.f5217n.f5316u.a());
    }

    public abstract P.k q0();

    public final P.k r0(int i3) {
        boolean g3 = Z.g(i3);
        P.k q02 = q0();
        if (!g3 && (q02 = q02.h) == null) {
            return null;
        }
        for (P.k s02 = s0(g3); s02 != null && (s02.f2091g & i3) != 0; s02 = s02.f2092i) {
            if ((s02.f2090f & i3) != 0) {
                return s02;
            }
            if (s02 == q02) {
                return null;
            }
        }
        return null;
    }

    public final P.k s0(boolean z3) {
        P.k q02;
        C0059s c0059s = this.f5217n.f5319x;
        if (((Y) c0059s.f855d) == this) {
            return (P.k) c0059s.f857f;
        }
        if (z3) {
            Y y3 = this.f5219p;
            if (y3 != null && (q02 = y3.q0()) != null) {
                return q02.f2092i;
            }
        } else {
            Y y4 = this.f5219p;
            if (y4 != null) {
                return y4.q0();
            }
        }
        return null;
    }

    @Override // l0.InterfaceC0357g
    public final long t() {
        return this.f4929f;
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
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [F.d] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [F.d] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void t0(P.k kVar, V v3, long j3, C0433n c0433n, boolean z3, boolean z4) {
        if (kVar == null) {
            v0(v3, j3, c0433n, z3, z4);
            return;
        }
        c0433n.b(kVar, -1.0f, z4, new W(this, kVar, v3, j3, c0433n, z3, z4));
        Y y3 = kVar.f2094k;
        if (y3 != null) {
            P.k s02 = y3.s0(Z.g(16));
            if (s02 != null && s02.f2099p) {
                P.k kVar2 = s02.f2088d;
                if (!kVar2.f2099p) {
                    Z0.d.S("visitLocalDescendants called on an unattached node");
                    throw null;
                }
                if ((kVar2.f2091g & 16) != 0) {
                    while (kVar2 != null) {
                        if ((kVar2.f2090f & 16) != 0) {
                            AbstractC0428i abstractC0428i = kVar2;
                            ?? r5 = 0;
                            while (abstractC0428i != 0) {
                                if (abstractC0428i instanceof j0) {
                                    if (((j0) abstractC0428i).l()) {
                                        return;
                                    }
                                } else if ((abstractC0428i.f2090f & 16) != 0 && (abstractC0428i instanceof AbstractC0428i)) {
                                    P.k kVar3 = abstractC0428i.f5256r;
                                    int i3 = 0;
                                    abstractC0428i = abstractC0428i;
                                    r5 = r5;
                                    while (kVar3 != null) {
                                        if ((kVar3.f2090f & 16) != 0) {
                                            i3++;
                                            r5 = r5;
                                            if (i3 == 1) {
                                                abstractC0428i = kVar3;
                                            } else {
                                                if (r5 == 0) {
                                                    r5 = new F.d(new P.k[16]);
                                                }
                                                if (abstractC0428i != 0) {
                                                    r5.b(abstractC0428i);
                                                    abstractC0428i = 0;
                                                }
                                                r5.b(kVar3);
                                            }
                                        }
                                        kVar3 = kVar3.f2092i;
                                        abstractC0428i = abstractC0428i;
                                        r5 = r5;
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                abstractC0428i = AbstractC0409C.e(r5);
                            }
                        }
                        kVar2 = kVar2.f2092i;
                    }
                }
            }
            c0433n.h = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e9, code lost:
    
        if (n0.AbstractC0409C.g(r21.a(), n0.AbstractC0409C.a(r15, r23)) > 0) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u0(n0.V r18, long r19, n0.C0433n r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.Y.u0(n0.V, long, n0.n, boolean, boolean):void");
    }

    public void v0(V v3, long j3, C0433n c0433n, boolean z3, boolean z4) {
        Y y3 = this.f5218o;
        if (y3 != null) {
            y3.u0(v3, y3.n0(j3, true), c0433n, z3, z4);
        }
    }

    @Override // n0.f0
    public final boolean w() {
        return (this.f5216F == null || this.f5220q || !this.f5217n.u()) ? false : true;
    }

    public final void w0() {
        d0 d0Var = this.f5216F;
        if (d0Var != null) {
            d0Var.invalidate();
            return;
        }
        Y y3 = this.f5219p;
        if (y3 != null) {
            y3.w0();
        }
    }

    public final boolean x0() {
        if (this.f5216F != null && this.f5225v <= 0.0f) {
            return true;
        }
        Y y3 = this.f5219p;
        if (y3 != null) {
            return y3.x0();
        }
        return false;
    }

    public final long y0(InterfaceC0357g interfaceC0357g, long j3) {
        Y y3;
        boolean z3 = interfaceC0357g instanceof C0359i;
        if (z3) {
            ((C0359i) interfaceC0357g).f4924d.f5168n.A0();
            return ((C0359i) interfaceC0357g).a(this, j3 ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        C0359i c0359i = z3 ? (C0359i) interfaceC0357g : null;
        if (c0359i == null || (y3 = c0359i.f4924d.f5168n) == null) {
            p2.g.c(interfaceC0357g, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
            y3 = (Y) interfaceC0357g;
        }
        y3.A0();
        Y m02 = m0(y3);
        while (y3 != m02) {
            j3 = y3.I0(j3, true);
            y3 = y3.f5219p;
            p2.g.b(y3);
        }
        return f0(m02, j3);
    }

    public final long z0(long j3) {
        if (!q0().f2099p) {
            Z0.d.S("LayoutCoordinate operations are only valid when isAttached is true");
            throw null;
        }
        A0();
        for (Y y3 = this; y3 != null; y3 = y3.f5219p) {
            j3 = y3.I0(j3, true);
        }
        return j3;
    }
}
