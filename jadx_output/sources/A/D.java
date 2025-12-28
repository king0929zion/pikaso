package A;

import D.C0032d;
import D.C0048l;
import D.C0052n;
import D.M0;
import D.U;
import D.Z;
import p.C0528G;
import q.InterfaceC0550C;
import z.C0703f;

/* loaded from: classes.dex */
public abstract class D {

    /* renamed from: a, reason: collision with root package name */
    public static final M0 f3a = new M0(C0015p.f164m);

    /* renamed from: b, reason: collision with root package name */
    public static final D.H f4b = new D.H(U.f731i, C0015p.f163l);

    /* renamed from: c, reason: collision with root package name */
    public static final E f5c;

    static {
        long j3 = W.r.f2562f;
        f5c = new E(true, Float.NaN, j3);
        new E(false, Float.NaN, j3);
    }

    public static final InterfaceC0550C a(C0052n c0052n) {
        InterfaceC0550C e3;
        long j3 = W.r.f2562f;
        c0052n.N(-1280632857);
        if (((Boolean) c0052n.k(f3a)).booleanValue()) {
            C0528G c0528g = z.u.f6901a;
            Z C3 = C0032d.C(new W.r(j3), c0052n);
            boolean g3 = c0052n.g(true) | c0052n.c(Float.NaN);
            Object H2 = c0052n.H();
            if (g3 || H2 == C0048l.f781a) {
                H2 = new C0703f(true, Float.NaN, C3);
                c0052n.V(H2);
            }
            e3 = (C0703f) H2;
        } else {
            e3 = (G0.e.a(Float.NaN, Float.NaN) && W.r.c(j3, j3)) ? f5c : new E(true, Float.NaN, j3);
        }
        c0052n.q(false);
        return e3;
    }
}
