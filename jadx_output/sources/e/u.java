package E;

import D.C0032d;
import D.C0053n0;
import D.C0059s;
import D.D0;
import D.x0;

/* loaded from: classes.dex */
public final class u extends y {

    /* renamed from: c, reason: collision with root package name */
    public static final u f1137c = new u(1, 0, 2);

    @Override // E.y
    public final void a(z zVar, B0.a aVar, D0 d02, C0059s c0059s) {
        int a3 = zVar.a(0);
        int o3 = d02.o();
        int i3 = d02.f684u;
        int C3 = d02.C(d02.f666b, d02.p(i3));
        int f3 = d02.f(d02.f666b, d02.p(i3 + 1));
        for (int max = Math.max(C3, f3 - a3); max < f3; max++) {
            Object obj = d02.f667c[d02.g(max)];
            if (obj instanceof x0) {
                c0059s.h(((x0) obj).f928a, o3 - max, -1, -1);
            } else if (obj instanceof C0053n0) {
                ((C0053n0) obj).d();
            }
        }
        C0032d.E(a3 > 0);
        int i4 = d02.f684u;
        int C4 = d02.C(d02.f666b, d02.p(i4));
        int f4 = d02.f(d02.f666b, d02.p(i4 + 1)) - a3;
        C0032d.E(f4 >= C4);
        d02.A(f4, a3, i4);
        int i5 = d02.f672i;
        if (i5 >= C4) {
            d02.f672i = i5 - a3;
        }
    }

    @Override // E.y
    public final String b(int i3) {
        return r2.a.t(i3, 0) ? "count" : super.b(i3);
    }
}
