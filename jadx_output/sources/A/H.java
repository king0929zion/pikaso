package A;

import D.C0052n;
import D.M0;
import p.AbstractC0537f;
import v.AbstractC0611e;
import v.C0608b;
import v.C0610d;

/* loaded from: classes.dex */
public abstract class H {

    /* renamed from: a, reason: collision with root package name */
    public static final M0 f19a = new M0(C0015p.f165n);

    public static final W.H a(int i3, C0052n c0052n) {
        G g3 = (G) c0052n.k(f19a);
        switch (AbstractC0537f.b(i3)) {
            case 0:
                return g3.f18e;
            case 1:
                return b(g3.f18e);
            case 2:
                return g3.f14a;
            case 3:
                return b(g3.f14a);
            case 4:
                return AbstractC0611e.f6314a;
            case 5:
                return g3.f17d;
            case 6:
                C0610d c0610d = g3.f17d;
                float f3 = (float) 0.0d;
                return C0610d.a(c0610d, new C0608b(f3), null, new C0608b(f3), 6);
            case 7:
                return b(g3.f17d);
            case 8:
                return g3.f16c;
            case 9:
                return W.D.f2484a;
            case 10:
                return g3.f15b;
            default:
                throw new B1.c();
        }
    }

    public static final C0610d b(C0610d c0610d) {
        float f3 = (float) 0.0d;
        return C0610d.a(c0610d, null, new C0608b(f3), new C0608b(f3), 3);
    }
}
