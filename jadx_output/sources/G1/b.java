package G1;

import A.O;
import D.C0052n;
import c2.C0174m;
import java.io.Serializable;
import t.u;

/* loaded from: classes.dex */
public final class b extends p2.h implements o2.f {

    /* renamed from: e, reason: collision with root package name */
    public static final b f1269e = new b(3);

    @Override // o2.f
    public final Object a(Object obj, Object obj2, Serializable serializable) {
        C0052n c0052n = (C0052n) obj2;
        int intValue = ((Number) serializable).intValue();
        p2.g.e((u) obj, "$this$Button");
        if ((intValue & 81) == 16 && c0052n.y()) {
            c0052n.K();
        } else {
            O.b("打开无障碍设置", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0052n, 6, 0, 131070);
        }
        return C0174m.f3840a;
    }
}
