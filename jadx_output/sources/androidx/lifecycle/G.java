package androidx.lifecycle;

import java.util.LinkedHashMap;
import w1.C0635a;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final C0635a f3455a = new C0635a();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f3456b = new LinkedHashMap();

    public final void a() {
        C0635a c0635a = this.f3455a;
        if (c0635a == null || c0635a.f6558d) {
            return;
        }
        c0635a.f6558d = true;
        synchronized (c0635a.f6555a) {
            try {
                for (AutoCloseable autoCloseable : c0635a.f6556b.values()) {
                    if (autoCloseable != null) {
                        try {
                            autoCloseable.close();
                        } catch (Exception e3) {
                            throw new RuntimeException(e3);
                        }
                    }
                }
                for (AutoCloseable autoCloseable2 : c0635a.f6557c) {
                    if (autoCloseable2 != null) {
                        try {
                            autoCloseable2.close();
                        } catch (Exception e4) {
                            throw new RuntimeException(e4);
                        }
                    }
                }
                c0635a.f6557c.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b() {
    }
}
