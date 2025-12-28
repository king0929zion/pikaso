package n0;

import W.C0084g;
import java.util.List;
import l0.C0356f;
import l0.InterfaceC0361k;
import o0.C0507u;

/* renamed from: n0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0435p extends Y {

    /* renamed from: M, reason: collision with root package name */
    public static final C0084g f5274M;

    /* renamed from: K, reason: collision with root package name */
    public final m0 f5275K;

    /* renamed from: L, reason: collision with root package name */
    public C0434o f5276L;

    static {
        C0084g e3 = W.D.e();
        e3.c(W.r.f2559c);
        e3.f2539a.setStrokeWidth(1.0f);
        e3.g(1);
        f5274M = e3;
    }

    public C0435p(C0444z c0444z) {
        super(c0444z);
        m0 m0Var = new m0();
        m0Var.f2091g = 0;
        this.f5275K = m0Var;
        m0Var.f2094k = this;
        this.f5276L = c0444z.f5302f != null ? new C0434o(this) : null;
    }

    @Override // n0.Y
    public final void D0(W.o oVar, Z.d dVar) {
        C0444z c0444z = this.f5217n;
        e0 s3 = AbstractC0409C.s(c0444z);
        F.d m2 = c0444z.m();
        int i3 = m2.f1160f;
        if (i3 > 0) {
            Object[] objArr = m2.f1158d;
            int i4 = 0;
            do {
                C0444z c0444z2 = (C0444z) objArr[i4];
                if (c0444z2.v()) {
                    c0444z2.g(oVar, dVar);
                }
                i4++;
            } while (i4 < i3);
        }
        if (((C0507u) s3).getShowLayoutBounds()) {
            j0(oVar, f5274M);
        }
    }

    @Override // l0.o
    public final void G(long j3, float f3, o2.c cVar) {
        E0(j3, f3, cVar);
        if (this.f5163i) {
            return;
        }
        C0();
        this.f5217n.f5320y.f5146q.R();
    }

    @Override // n0.AbstractC0418L
    public final int M(C0356f c0356f) {
        C0434o c0434o = this.f5276L;
        if (c0434o != null) {
            return c0434o.M(c0356f);
        }
        C0413G c0413g = this.f5217n.f5320y.f5146q;
        C0415I c0415i = c0413g.f5110H;
        int i3 = c0415i.f5132b;
        C0407A c0407a = c0413g.f5124v;
        if (i3 == 1) {
            c0407a.f5072d = true;
            if (c0407a.f5070b) {
                c0415i.f5134d = true;
                c0415i.f5135e = true;
            }
        } else {
            c0407a.f5073e = true;
        }
        c0413g.A().f5164j = true;
        c0413g.d();
        c0413g.A().f5164j = false;
        Integer num = (Integer) c0407a.f5075g.get(c0356f);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // l0.InterfaceC0360j
    public final l0.o a(long j3) {
        List f3;
        K(j3);
        C0444z c0444z = this.f5217n;
        F.d n2 = c0444z.n();
        int i3 = n2.f1160f;
        if (i3 > 0) {
            Object[] objArr = n2.f1158d;
            int i4 = 0;
            do {
                ((C0444z) objArr[i4]).f5320y.f5146q.f5116n = 3;
                i4++;
            } while (i4 < i3);
        }
        InterfaceC0361k interfaceC0361k = c0444z.f5313r;
        C0413G c0413g = c0444z.f5320y.f5146q;
        C0415I c0415i = c0413g.f5110H;
        c0415i.f5131a.L();
        boolean z3 = c0413g.f5126x;
        F.d dVar = c0413g.f5125w;
        if (z3) {
            C0444z c0444z2 = c0415i.f5131a;
            F.d n3 = c0444z2.n();
            int i5 = n3.f1160f;
            if (i5 > 0) {
                Object[] objArr2 = n3.f1158d;
                int i6 = 0;
                do {
                    C0444z c0444z3 = (C0444z) objArr2[i6];
                    if (dVar.f1160f <= i6) {
                        dVar.b(c0444z3.f5320y.f5146q);
                    } else {
                        C0413G c0413g2 = c0444z3.f5320y.f5146q;
                        Object[] objArr3 = dVar.f1158d;
                        Object obj = objArr3[i6];
                        objArr3[i6] = c0413g2;
                    }
                    i6++;
                } while (i6 < i5);
            }
            dVar.n(((F.a) c0444z2.h()).f1152d.f1160f, dVar.f1160f);
            c0413g.f5126x = false;
            f3 = dVar.f();
        } else {
            f3 = dVar.f();
        }
        G0(interfaceC0361k.f(this, f3, j3));
        B0();
        return this;
    }

    @Override // n0.Y
    public final void l0() {
        if (this.f5276L == null) {
            this.f5276L = new C0434o(this);
        }
    }

    @Override // n0.Y
    public final AbstractC0419M o0() {
        return this.f5276L;
    }

    @Override // n0.Y
    public final P.k q0() {
        return this.f5275K;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    @Override // n0.Y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v0(n0.V r20, long r21, n0.C0433n r23, boolean r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.C0435p.v0(n0.V, long, n0.n, boolean, boolean):void");
    }
}
