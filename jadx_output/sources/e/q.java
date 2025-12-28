package E;

import D.C0059s;
import D.D0;
import D.w0;
import a.AbstractC0090a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class q extends y {

    /* renamed from: c, reason: collision with root package name */
    public static final q f1133c;

    static {
        int i3 = 1;
        f1133c = new q(0, i3, i3);
    }

    @Override // E.y
    public final void a(z zVar, B0.a aVar, D0 d02, C0059s c0059s) {
        ((ArrayList) c0059s.f854c).add((w0) zVar.b(0));
    }

    @Override // E.y
    public final String c(int i3) {
        return AbstractC0090a.w(i3, 0) ? "value" : super.c(i3);
    }
}
