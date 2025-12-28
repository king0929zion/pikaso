package E;

import D.C0059s;
import D.D0;
import a.AbstractC0090a;

/* loaded from: classes.dex */
public final class w extends y {

    /* renamed from: c, reason: collision with root package name */
    public static final w f1139c = new w(0, 2, 1);

    @Override // E.y
    public final void a(z zVar, B0.a aVar, D0 d02, C0059s c0059s) {
        ((o2.e) zVar.b(1)).h(aVar.f273d, zVar.b(0));
    }

    @Override // E.y
    public final String c(int i3) {
        return AbstractC0090a.w(i3, 0) ? "value" : AbstractC0090a.w(i3, 1) ? "block" : super.c(i3);
    }
}
