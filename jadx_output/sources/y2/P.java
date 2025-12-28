package y2;

import c2.C0174m;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class P extends U {

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f6768i = AtomicIntegerFieldUpdater.newUpdater(P.class, "_invoked");
    private volatile int _invoked;
    public final o2.c h;

    public P(o2.c cVar) {
        this.h = cVar;
    }

    @Override // o2.c
    public final /* bridge */ /* synthetic */ Object i(Object obj) {
        p((Throwable) obj);
        return C0174m.f3840a;
    }

    @Override // y2.W
    public final void p(Throwable th) {
        if (f6768i.compareAndSet(this, 0, 1)) {
            this.h.i(th);
        }
    }
}
