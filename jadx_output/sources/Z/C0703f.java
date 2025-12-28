package z;

import D.C0032d;
import D.C0048l;
import D.C0052n;
import D.Z;
import D.v0;
import android.view.View;
import android.view.ViewGroup;
import o0.S;
import p.AbstractC0537f;
import q.InterfaceC0550C;
import q.InterfaceC0551D;

/* renamed from: z.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0703f implements InterfaceC0550C {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f6861a;

    /* renamed from: b, reason: collision with root package name */
    public final float f6862b;

    /* renamed from: c, reason: collision with root package name */
    public final Z f6863c;

    public C0703f(boolean z3, float f3, Z z4) {
        this.f6861a = z3;
        this.f6862b = f3;
        this.f6863c = z4;
    }

    @Override // q.InterfaceC0550C
    public final InterfaceC0551D b(s.g gVar, C0052n c0052n) {
        long a3;
        c0052n.N(988743187);
        x xVar = (x) c0052n.k(z.f6915a);
        Z z3 = this.f6863c;
        if (((W.r) z3.getValue()).f2564a != W.r.f2562f) {
            c0052n.N(-303571590);
            c0052n.q(false);
            a3 = ((W.r) z3.getValue()).f2564a;
        } else {
            c0052n.N(-303521246);
            a3 = xVar.a(c0052n);
            c0052n.q(false);
        }
        Z C3 = C0032d.C(new W.r(a3), c0052n);
        Z C4 = C0032d.C(xVar.b(c0052n), c0052n);
        c0052n.N(331259447);
        ViewGroup b3 = AbstractC0693A.b((View) c0052n.k(S.f5498f));
        boolean f3 = c0052n.f(gVar) | c0052n.f(this) | c0052n.f(b3);
        Object H2 = c0052n.H();
        Object obj = C0048l.f781a;
        if (f3 || H2 == obj) {
            H2 = new C0698a(this.f6861a, this.f6862b, C3, C4, b3);
            c0052n.V(H2);
        }
        C0698a c0698a = (C0698a) H2;
        c0052n.q(false);
        boolean f4 = c0052n.f(gVar) | c0052n.h(c0698a);
        Object H3 = c0052n.H();
        if (f4 || H3 == obj) {
            H3 = new C0704g(gVar, c0698a, null);
            c0052n.V(H3);
        }
        o2.e eVar = (o2.e) H3;
        v0 v0Var = (v0) c0052n.f807b;
        boolean f5 = c0052n.f(gVar) | c0052n.f(c0698a);
        Object H4 = c0052n.H();
        if (f5 || H4 == obj) {
            H4 = new D.S(v0Var.f925t, eVar);
            c0052n.V(H4);
        }
        c0052n.q(false);
        return c0698a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0703f)) {
            return false;
        }
        C0703f c0703f = (C0703f) obj;
        return this.f6861a == c0703f.f6861a && G0.e.a(this.f6862b, c0703f.f6862b) && this.f6863c.equals(c0703f.f6863c);
    }

    public final int hashCode() {
        return this.f6863c.hashCode() + AbstractC0537f.a(this.f6862b, Boolean.hashCode(this.f6861a) * 31, 31);
    }
}
