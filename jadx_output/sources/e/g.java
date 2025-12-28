package E;

import D.C0059s;
import D.D0;
import D.InterfaceC0056p;
import a.AbstractC0090a;

/* loaded from: classes.dex */
public final class g extends y {

    /* renamed from: c, reason: collision with root package name */
    public static final g f1119c = new g(0, 2, 1);

    @Override // E.y
    public final void a(z zVar, B0.a aVar, D0 d02, C0059s c0059s) {
        ((o2.c) zVar.b(0)).i((InterfaceC0056p) zVar.b(1));
    }

    @Override // E.y
    public final String c(int i3) {
        return AbstractC0090a.w(i3, 0) ? "anchor" : AbstractC0090a.w(i3, 1) ? "composition" : super.c(i3);
    }
}
