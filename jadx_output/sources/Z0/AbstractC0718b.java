package z0;

import android.content.Context;
import android.os.Build;
import s1.C0589c;

/* renamed from: z0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0718b {
    public static final f a(Context context) {
        C0589c c0589c = new C0589c(11, false);
        context.getApplicationContext();
        return new f(c0589c, new C0717a(Build.VERSION.SDK_INT >= 31 ? m.f6932a.a(context) : 0));
    }

    public static final int b(l lVar, int i3) {
        boolean z3 = p2.g.f(lVar.f6931d, l.f6928e.f6931d) >= 0;
        boolean a3 = j.a(i3, 1);
        if (a3 && z3) {
            return 3;
        }
        if (z3) {
            return 1;
        }
        return a3 ? 2 : 0;
    }
}
