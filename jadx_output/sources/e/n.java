package E;

import D.B0;
import D.C0030c;
import D.C0032d;
import D.C0059s;
import D.D0;
import a.AbstractC0090a;

/* loaded from: classes.dex */
public final class n extends y {

    /* renamed from: c, reason: collision with root package name */
    public static final n f1130c = new n(0, 3, 1);

    @Override // E.y
    public final void a(z zVar, B0.a aVar, D0 d02, C0059s c0059s) {
        B0 b02 = (B0) zVar.b(1);
        C0030c c0030c = (C0030c) zVar.b(0);
        c cVar = (c) zVar.b(2);
        D0 c3 = b02.c();
        try {
            if (!cVar.f1115c.i0()) {
                C0032d.r("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
                throw null;
            }
            cVar.f1114b.h0(aVar, c3, c0059s);
            c3.e(true);
            d02.d();
            c0030c.getClass();
            d02.t(b02, b02.a(c0030c));
            d02.j();
        } catch (Throwable th) {
            c3.e(false);
            throw th;
        }
    }

    @Override // E.y
    public final String c(int i3) {
        return AbstractC0090a.w(i3, 0) ? "anchor" : AbstractC0090a.w(i3, 1) ? "from" : AbstractC0090a.w(i3, 2) ? "fixups" : super.c(i3);
    }
}
