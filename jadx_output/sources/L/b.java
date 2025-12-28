package L;

import D.C0048l;
import D.C0052n;
import D.C0053n0;
import p2.g;
import p2.h;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f1444a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final f f1445b = new f(0, new long[0], new Object[0]);

    public static final int a(int i3, int i4) {
        return i3 << (((i4 % 10) * 3) + 1);
    }

    public static final a b(int i3, h hVar, C0052n c0052n) {
        Object H2 = c0052n.H();
        if (H2 == C0048l.f781a) {
            H2 = new a(i3, true, hVar);
            c0052n.V(H2);
        }
        a aVar = (a) H2;
        aVar.f(hVar);
        return aVar;
    }

    public static final boolean c(C0053n0 c0053n0, C0053n0 c0053n02) {
        return c0053n0 == null || ((c0053n0 instanceof C0053n0) && (!c0053n0.b() || c0053n0.equals(c0053n02) || g.a(c0053n0.f833c, c0053n02.f833c)));
    }
}
