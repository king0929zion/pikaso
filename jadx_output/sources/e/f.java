package E;

import D.C0059s;
import D.D0;
import a.AbstractC0090a;

/* loaded from: classes.dex */
public final class f extends y {

    /* renamed from: c, reason: collision with root package name */
    public static final f f1118c = new f(0, 1, 1);

    @Override // E.y
    public final void a(z zVar, B0.a aVar, D0 d02, C0059s c0059s) {
        p2.g.c(aVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
        for (Object obj : (Object[]) zVar.b(0)) {
            aVar.g(obj);
        }
    }

    @Override // E.y
    public final String c(int i3) {
        return AbstractC0090a.w(i3, 0) ? "nodes" : super.c(i3);
    }
}
