package t;

import D.C0048l;
import D.C0052n;
import s1.C0589c;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final l f6168a;

    static {
        C0589c c0589c = AbstractC0598c.f6149a;
        f6168a = new l(P.a.f2075o);
    }

    public static final l a(P.b bVar, C0052n c0052n, int i3) {
        C0589c c0589c = AbstractC0598c.f6150b;
        if (c0589c.equals(c0589c) && bVar.equals(P.a.f2075o)) {
            c0052n.N(345884104);
            c0052n.q(false);
            return f6168a;
        }
        c0052n.N(345937951);
        boolean f3 = c0052n.f(c0589c);
        boolean z3 = true;
        if ((((i3 & 112) ^ 48) <= 32 || !c0052n.f(bVar)) && (i3 & 48) != 32) {
            z3 = false;
        }
        boolean z4 = f3 | z3;
        Object H2 = c0052n.H();
        if (z4 || H2 == C0048l.f781a) {
            H2 = new l(bVar);
            c0052n.V(H2);
        }
        l lVar = (l) H2;
        c0052n.q(false);
        return lVar;
    }
}
