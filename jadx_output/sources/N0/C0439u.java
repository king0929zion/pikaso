package n0;

import W.C0084g;
import l0.C0356f;
import o0.C0507u;

/* renamed from: n0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0439u extends Y {

    /* renamed from: M, reason: collision with root package name */
    public static final C0084g f5286M;

    /* renamed from: K, reason: collision with root package name */
    public InterfaceC0437s f5287K;

    /* renamed from: L, reason: collision with root package name */
    public C0438t f5288L;

    static {
        C0084g e3 = W.D.e();
        e3.c(W.r.f2560d);
        e3.f2539a.setStrokeWidth(1.0f);
        e3.g(1);
        f5286M = e3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0439u(C0444z c0444z, InterfaceC0437s interfaceC0437s) {
        super(c0444z);
        this.f5287K = interfaceC0437s;
        this.f5288L = c0444z.f5302f != null ? new C0438t(this) : null;
        if ((((P.k) interfaceC0437s).f2088d.f2090f & 512) != 0) {
            throw new ClassCastException();
        }
    }

    @Override // n0.Y
    public final void D0(W.o oVar, Z.d dVar) {
        Y y3 = this.f5218o;
        p2.g.b(y3);
        y3.i0(oVar, dVar);
        if (((C0507u) AbstractC0409C.s(this.f5217n)).getShowLayoutBounds()) {
            j0(oVar, f5286M);
        }
    }

    @Override // l0.o
    public final void G(long j3, float f3, o2.c cVar) {
        E0(j3, f3, cVar);
        if (this.f5163i) {
            return;
        }
        C0();
        X().g();
        p2.g.b(this.f5218o);
    }

    @Override // n0.AbstractC0418L
    public final int M(C0356f c0356f) {
        C0438t c0438t = this.f5288L;
        if (c0438t == null) {
            return AbstractC0409C.c(this, c0356f);
        }
        Integer num = (Integer) c0438t.f5173s.get(c0356f);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void M0(InterfaceC0437s interfaceC0437s) {
        if (!interfaceC0437s.equals(this.f5287K) && (((P.k) interfaceC0437s).f2088d.f2090f & 512) != 0) {
            throw new ClassCastException();
        }
        this.f5287K = interfaceC0437s;
    }

    @Override // l0.InterfaceC0360j
    public final l0.o a(long j3) {
        K(j3);
        InterfaceC0437s interfaceC0437s = this.f5287K;
        Y y3 = this.f5218o;
        p2.g.b(y3);
        G0(interfaceC0437s.R(this, y3, j3));
        B0();
        return this;
    }

    @Override // n0.Y
    public final void l0() {
        if (this.f5288L == null) {
            this.f5288L = new C0438t(this);
        }
    }

    @Override // n0.Y
    public final AbstractC0419M o0() {
        return this.f5288L;
    }

    @Override // n0.Y
    public final P.k q0() {
        return ((P.k) this.f5287K).f2088d;
    }
}
