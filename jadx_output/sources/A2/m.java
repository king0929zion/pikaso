package A2;

import D2.AbstractC0071a;
import c2.C0174m;
import g2.InterfaceC0271d;
import y2.p0;

/* loaded from: classes.dex */
public final class m extends b {

    /* renamed from: o, reason: collision with root package name */
    public final int f259o;

    public m(int i3, int i4, o2.c cVar) {
        super(i3, cVar);
        this.f259o = i4;
        if (i4 == 1) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + p2.p.a(b.class).b() + " instead").toString());
        }
        if (i3 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i3 + " was specified").toString());
    }

    public final Object B(Object obj, boolean z3) {
        j jVar;
        o2.c cVar;
        B1.c a3;
        C0174m c0174m = C0174m.f3840a;
        if (this.f259o == 3) {
            Object c3 = super.c(obj);
            if (!(c3 instanceof h) || (c3 instanceof g)) {
                return c3;
            }
            if (!z3 || (cVar = this.f233e) == null || (a3 = AbstractC0071a.a(cVar, obj, null)) == null) {
                return c0174m;
            }
            throw a3;
        }
        o1.o oVar = d.f238d;
        j jVar2 = (j) b.f227j.get(this);
        while (true) {
            long andIncrement = b.f224f.getAndIncrement(this);
            long j3 = andIncrement & 1152921504606846975L;
            boolean r3 = r(andIncrement, false);
            int i3 = d.f236b;
            long j4 = i3;
            long j5 = j3 / j4;
            int i4 = (int) (j3 % j4);
            if (jVar2.f1085f != j5) {
                j b3 = b.b(this, j5, jVar2);
                if (b3 != null) {
                    jVar = b3;
                } else if (r3) {
                    return new g(n());
                }
            } else {
                jVar = jVar2;
            }
            int e3 = b.e(this, jVar, i4, obj, j3, oVar, r3);
            if (e3 == 0) {
                jVar.a();
                return c0174m;
            }
            if (e3 == 1) {
                return c0174m;
            }
            if (e3 == 2) {
                if (r3) {
                    jVar.h();
                    return new g(n());
                }
                p0 p0Var = oVar instanceof p0 ? (p0) oVar : null;
                if (p0Var != null) {
                    p0Var.a(jVar, i4 + i3);
                }
                j((jVar.f1085f * j4) + i4);
                return c0174m;
            }
            if (e3 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (e3 == 4) {
                if (j3 < b.f225g.get(this)) {
                    jVar.a();
                }
                return new g(n());
            }
            if (e3 == 5) {
                jVar.a();
            }
            jVar2 = jVar;
        }
    }

    @Override // A2.b, A2.q
    public final Object c(Object obj) {
        return B(C0174m.f3840a, false);
    }

    @Override // A2.b, A2.q
    public final Object p(InterfaceC0271d interfaceC0271d, Object obj) {
        B1.c a3;
        if (!(B(obj, true) instanceof g)) {
            return C0174m.f3840a;
        }
        o2.c cVar = this.f233e;
        if (cVar == null || (a3 = AbstractC0071a.a(cVar, obj, null)) == null) {
            throw n();
        }
        Z0.d.f(a3, n());
        throw a3;
    }

    @Override // A2.b
    public final boolean s() {
        return this.f259o == 2;
    }
}
