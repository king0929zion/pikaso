package y2;

import g2.InterfaceC0276i;
import java.util.concurrent.locks.LockSupport;

/* renamed from: y2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0670c extends AbstractC0668a {

    /* renamed from: g, reason: collision with root package name */
    public final Thread f6789g;
    public final J h;

    public C0670c(InterfaceC0276i interfaceC0276i, Thread thread, J j3) {
        super(interfaceC0276i, true);
        this.f6789g = thread;
        this.h = j3;
    }

    @Override // y2.b0
    public final void y(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.f6789g;
        if (p2.g.a(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
