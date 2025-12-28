package F2;

import A.AbstractC0000a;
import D2.AbstractC0071a;
import D2.x;
import g2.C0277j;
import g2.InterfaceC0276i;
import java.util.concurrent.Executor;
import y2.K;
import y2.r;

/* loaded from: classes.dex */
public final class c extends K implements Executor {

    /* renamed from: f, reason: collision with root package name */
    public static final c f1226f = new c();

    /* renamed from: g, reason: collision with root package name */
    public static final r f1227g;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [D2.i] */
    static {
        l lVar = l.f1242f;
        int i3 = x.f1089a;
        if (64 >= i3) {
            i3 = 64;
        }
        int k3 = AbstractC0071a.k("kotlinx.coroutines.io.parallelism", i3, 0, 0, 12);
        lVar.getClass();
        if (k3 < 1) {
            throw new IllegalArgumentException(AbstractC0000a.c("Expected positive parallelism level, but got ", k3).toString());
        }
        if (k3 < k.f1238d) {
            if (k3 < 1) {
                throw new IllegalArgumentException(AbstractC0000a.c("Expected positive parallelism level, but got ", k3).toString());
            }
            lVar = new D2.i(lVar, k3);
        }
        f1227g = lVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // y2.r
    public final void d(InterfaceC0276i interfaceC0276i, Runnable runnable) {
        f1227g.d(interfaceC0276i, runnable);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        d(C0277j.f4334d, runnable);
    }

    @Override // y2.r
    public final String toString() {
        return "Dispatchers.IO";
    }
}
