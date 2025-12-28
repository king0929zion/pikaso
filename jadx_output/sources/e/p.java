package E;

import D.C0059s;
import D.D0;
import n0.C0444z;

/* loaded from: classes.dex */
public final class p extends y {

    /* renamed from: c, reason: collision with root package name */
    public static final p f1132c = new p(3, 0, 2);

    @Override // E.y
    public final void a(z zVar, B0.a aVar, D0 d02, C0059s c0059s) {
        int a3 = zVar.a(0);
        int a4 = zVar.a(1);
        int a5 = zVar.a(2);
        C0444z c0444z = (C0444z) aVar.f273d;
        c0444z.getClass();
        if (a3 == a4) {
            return;
        }
        for (int i3 = 0; i3 < a5; i3++) {
            int i4 = a3 > a4 ? a3 + i3 : a3;
            int i5 = a3 > a4 ? a4 + i3 : (a4 + a5) - 2;
            B2.i iVar = c0444z.h;
            Object m2 = ((F.d) iVar.f316e).m(i4);
            A0.c cVar = (A0.c) iVar.f317f;
            cVar.c();
            ((F.d) iVar.f316e).a(i5, (C0444z) m2);
            cVar.c();
        }
        c0444z.A();
        c0444z.t();
        c0444z.r();
    }

    @Override // E.y
    public final String b(int i3) {
        return r2.a.t(i3, 0) ? "from" : r2.a.t(i3, 1) ? "to" : r2.a.t(i3, 2) ? "count" : super.b(i3);
    }
}
