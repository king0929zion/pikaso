package E;

import D.B0;
import D.C0030c;
import D.C0059s;
import D.D0;
import a.AbstractC0090a;

/* loaded from: classes.dex */
public final class m extends y {

    /* renamed from: c, reason: collision with root package name */
    public static final m f1129c = new m(0, 2, 1);

    @Override // E.y
    public final void a(z zVar, B0.a aVar, D0 d02, C0059s c0059s) {
        B0 b02 = (B0) zVar.b(1);
        C0030c c0030c = (C0030c) zVar.b(0);
        d02.d();
        c0030c.getClass();
        d02.t(b02, b02.a(c0030c));
        d02.j();
    }

    @Override // E.y
    public final String c(int i3) {
        return AbstractC0090a.w(i3, 0) ? "anchor" : AbstractC0090a.w(i3, 1) ? "from" : super.c(i3);
    }
}
