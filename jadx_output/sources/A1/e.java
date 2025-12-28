package A1;

import android.os.Bundle;
import m.C0365c;
import m.C0368f;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public boolean f211a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f212b;

    /* renamed from: c, reason: collision with root package name */
    public Object f213c;

    /* renamed from: d, reason: collision with root package name */
    public Object f214d;

    public Bundle a(String str) {
        p2.g.e(str, "key");
        if (!this.f212b) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = (Bundle) this.f214d;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = (Bundle) this.f214d;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = (Bundle) this.f214d;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.f214d = null;
        }
        return bundle2;
    }

    public void b(String str, d dVar) {
        Object obj;
        C0368f c0368f = (C0368f) this.f213c;
        C0365c a3 = c0368f.a(str);
        if (a3 != null) {
            obj = a3.f4945e;
        } else {
            C0365c c0365c = new C0365c(str, dVar);
            c0368f.f4954g++;
            C0365c c0365c2 = c0368f.f4952e;
            if (c0365c2 == null) {
                c0368f.f4951d = c0365c;
                c0368f.f4952e = c0365c;
            } else {
                c0365c2.f4946f = c0365c;
                c0365c.f4947g = c0365c2;
                c0368f.f4952e = c0365c;
            }
            obj = null;
        }
        if (((d) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }
}
