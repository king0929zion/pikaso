package E;

import D.C0059s;
import D.D0;
import n0.C0444z;

/* loaded from: classes.dex */
public final class s extends y {

    /* renamed from: c, reason: collision with root package name */
    public static final s f1135c = new s(2, 0, 2);

    @Override // E.y
    public final void a(z zVar, B0.a aVar, D0 d02, C0059s c0059s) {
        int a3 = zVar.a(0);
        int a4 = zVar.a(1);
        C0444z c0444z = (C0444z) aVar.f273d;
        c0444z.getClass();
        if (a4 < 0) {
            Z0.d.R("count (" + a4 + ") must be greater than 0");
            throw null;
        }
        int i3 = (a4 + a3) - 1;
        if (a3 > i3) {
            return;
        }
        while (true) {
            B2.i iVar = c0444z.h;
            c0444z.y((C0444z) ((F.d) iVar.f316e).f1158d[i3]);
            Object m2 = ((F.d) iVar.f316e).m(i3);
            ((A0.c) iVar.f317f).c();
            if (i3 == a3) {
                return;
            } else {
                i3--;
            }
        }
    }

    @Override // E.y
    public final String b(int i3) {
        return r2.a.t(i3, 0) ? "removeIndex" : r2.a.t(i3, 1) ? "count" : super.b(i3);
    }
}
