package E;

import D.C0059s;
import D.D0;
import a.AbstractC0090a;

/* loaded from: classes.dex */
public final class v extends y {

    /* renamed from: c, reason: collision with root package name */
    public static final v f1138c;

    static {
        int i3 = 1;
        f1138c = new v(0, i3, i3);
    }

    @Override // E.y
    public final void a(z zVar, B0.a aVar, D0 d02, C0059s c0059s) {
        d02.I(zVar.b(0));
    }

    @Override // E.y
    public final String c(int i3) {
        return AbstractC0090a.w(i3, 0) ? "data" : super.c(i3);
    }
}
