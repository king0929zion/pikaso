package E;

import D.C0032d;
import D.C0059s;
import D.D0;

/* loaded from: classes.dex */
public final class t extends y {

    /* renamed from: c, reason: collision with root package name */
    public static final t f1136c;

    static {
        int i3 = 0;
        f1136c = new t(i3, i3, 3);
    }

    @Override // E.y
    public final void a(z zVar, B0.a aVar, D0 d02, C0059s c0059s) {
        if (d02.f677n != 0) {
            C0032d.r("Cannot reset when inserting");
            throw null;
        }
        d02.x();
        d02.f682s = 0;
        d02.f683t = d02.m() - d02.h;
        d02.f672i = 0;
        d02.f673j = 0;
        d02.f678o = 0;
    }
}
