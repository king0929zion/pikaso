package E;

import D.C0032d;
import D.C0059s;
import D.D0;

/* loaded from: classes.dex */
public final class i extends y {

    /* renamed from: c, reason: collision with root package name */
    public static final i f1121c;

    static {
        int i3 = 0;
        f1121c = new i(i3, i3, 3);
    }

    @Override // E.y
    public final void a(z zVar, B0.a aVar, D0 d02, C0059s c0059s) {
        p2.g.c(aVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
        while (true) {
            int i3 = d02.f684u;
            if ((i3 >= 0 || d02.f683t <= 0) && i3 != 0) {
                d02.B();
                if (C0032d.j(d02.f666b, d02.p(d02.f684u))) {
                    aVar.M();
                }
                d02.i();
            }
        }
        d02.i();
    }
}
