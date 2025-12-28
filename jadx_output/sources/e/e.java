package E;

import D.C0030c;
import D.C0032d;
import D.C0059s;
import D.D0;
import D.x0;
import a.AbstractC0090a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e extends y {

    /* renamed from: c, reason: collision with root package name */
    public static final e f1117c = new e(0, 2, 1);

    @Override // E.y
    public final void a(z zVar, B0.a aVar, D0 d02, C0059s c0059s) {
        C0030c c0030c = (C0030c) zVar.b(0);
        Object b3 = zVar.b(1);
        if (b3 instanceof x0) {
            ((ArrayList) c0059s.f854c).add(((x0) b3).f928a);
        }
        if (d02.f677n != 0) {
            C0032d.r("Can only append a slot if not current inserting");
            throw null;
        }
        int i3 = d02.f672i;
        int i4 = d02.f673j;
        int c3 = d02.c(c0030c);
        int f3 = d02.f(d02.f666b, d02.p(c3 + 1));
        d02.f672i = f3;
        d02.f673j = f3;
        d02.s(1, c3);
        if (i3 >= f3) {
            i3++;
            i4++;
        }
        d02.f667c[f3] = b3;
        d02.f672i = i3;
        d02.f673j = i4;
    }

    @Override // E.y
    public final String c(int i3) {
        return AbstractC0090a.w(i3, 0) ? "anchor" : AbstractC0090a.w(i3, 1) ? "value" : super.c(i3);
    }
}
