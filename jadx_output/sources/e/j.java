package E;

import D.C0030c;
import D.C0059s;
import D.D0;
import a.AbstractC0090a;

/* loaded from: classes.dex */
public final class j extends y {

    /* renamed from: c, reason: collision with root package name */
    public static final j f1122c;

    static {
        int i3 = 1;
        f1122c = new j(0, i3, i3);
    }

    @Override // E.y
    public final void a(z zVar, B0.a aVar, D0 d02, C0059s c0059s) {
        C0030c c0030c = (C0030c) zVar.b(0);
        c0030c.getClass();
        d02.k(d02.c(c0030c));
    }

    @Override // E.y
    public final String c(int i3) {
        return AbstractC0090a.w(i3, 0) ? "anchor" : super.c(i3);
    }
}
