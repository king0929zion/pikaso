package n0;

import a.AbstractC0090a;
import c2.C0174m;
import java.util.LinkedHashMap;
import l0.C0359i;
import l0.InterfaceC0357g;
import l0.InterfaceC0360j;

/* renamed from: n0.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0419M extends AbstractC0418L implements InterfaceC0360j {

    /* renamed from: n, reason: collision with root package name */
    public final Y f5168n;

    /* renamed from: p, reason: collision with root package name */
    public LinkedHashMap f5170p;

    /* renamed from: r, reason: collision with root package name */
    public M1.j f5172r;

    /* renamed from: o, reason: collision with root package name */
    public long f5169o = 0;

    /* renamed from: q, reason: collision with root package name */
    public final C0359i f5171q = new C0359i(this);

    /* renamed from: s, reason: collision with root package name */
    public final LinkedHashMap f5173s = new LinkedHashMap();

    public AbstractC0419M(Y y3) {
        this.f5168n = y3;
    }

    public static final void e0(AbstractC0419M abstractC0419M, M1.j jVar) {
        C0174m c0174m;
        LinkedHashMap linkedHashMap;
        if (jVar != null) {
            abstractC0419M.I(r2.a.d(jVar.e(), jVar.c()));
            c0174m = C0174m.f3840a;
        } else {
            c0174m = null;
        }
        if (c0174m == null) {
            abstractC0419M.I(0L);
        }
        if (!p2.g.a(abstractC0419M.f5172r, jVar) && jVar != null && ((((linkedHashMap = abstractC0419M.f5170p) != null && !linkedHashMap.isEmpty()) || !jVar.b().isEmpty()) && !p2.g.a(jVar.b(), abstractC0419M.f5170p))) {
            C0412F c0412f = abstractC0419M.f5168n.f5217n.f5320y.f5147r;
            p2.g.b(c0412f);
            c0412f.f5095s.f();
            LinkedHashMap linkedHashMap2 = abstractC0419M.f5170p;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                abstractC0419M.f5170p = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(jVar.b());
        }
        abstractC0419M.f5172r = jVar;
    }

    @Override // l0.o
    public final void G(long j3, float f3, o2.c cVar) {
        g0(j3);
        if (this.f5163i) {
            return;
        }
        f0();
    }

    @Override // n0.AbstractC0418L
    public final AbstractC0418L R() {
        Y y3 = this.f5168n.f5218o;
        if (y3 != null) {
            return y3.o0();
        }
        return null;
    }

    @Override // n0.AbstractC0418L
    public final InterfaceC0357g U() {
        return this.f5171q;
    }

    @Override // n0.AbstractC0418L
    public final boolean V() {
        return this.f5172r != null;
    }

    @Override // n0.AbstractC0418L
    public final C0444z W() {
        return this.f5168n.f5217n;
    }

    @Override // n0.AbstractC0418L
    public final M1.j X() {
        M1.j jVar = this.f5172r;
        if (jVar != null) {
            return jVar;
        }
        throw new IllegalStateException("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // n0.AbstractC0418L
    public final AbstractC0418L Y() {
        Y y3 = this.f5168n.f5219p;
        if (y3 != null) {
            return y3.o0();
        }
        return null;
    }

    @Override // n0.AbstractC0418L
    public final long Z() {
        return this.f5169o;
    }

    @Override // n0.AbstractC0418L
    public final void d0() {
        G(this.f5169o, 0.0f, null);
    }

    @Override // G0.b
    public final float f() {
        return this.f5168n.f();
    }

    public void f0() {
        X().g();
    }

    public final void g0(long j3) {
        if (!AbstractC0090a.v(this.f5169o, j3)) {
            this.f5169o = j3;
            Y y3 = this.f5168n;
            C0412F c0412f = y3.f5217n.f5320y.f5147r;
            if (c0412f != null) {
                c0412f.Q();
            }
            AbstractC0418L.a0(y3);
        }
        if (this.f5164j) {
            return;
        }
        N(new i0(X(), this));
    }

    @Override // n0.AbstractC0418L
    public final G0.f getLayoutDirection() {
        return this.f5168n.f5217n.f5315t;
    }

    public final long h0(AbstractC0419M abstractC0419M, boolean z3) {
        long j3 = 0;
        AbstractC0419M abstractC0419M2 = this;
        while (!abstractC0419M2.equals(abstractC0419M)) {
            j3 = AbstractC0090a.X(j3, abstractC0419M2.f5169o);
            Y y3 = abstractC0419M2.f5168n.f5219p;
            p2.g.b(y3);
            abstractC0419M2 = y3.o0();
            p2.g.b(abstractC0419M2);
        }
        return j3;
    }

    @Override // G0.b
    public final float n() {
        return this.f5168n.n();
    }

    @Override // l0.o, l0.InterfaceC0360j
    public final Object o() {
        return this.f5168n.o();
    }
}
