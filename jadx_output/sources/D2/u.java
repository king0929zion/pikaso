package D2;

import g2.InterfaceC0276i;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import y2.f0;

/* loaded from: classes.dex */
public abstract class u extends c implements f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1084g = AtomicIntegerFieldUpdater.newUpdater(u.class, "cleanedAndPointers");
    private volatile int cleanedAndPointers;

    /* renamed from: f, reason: collision with root package name */
    public final long f1085f;

    public u(long j3, u uVar, int i3) {
        super(uVar);
        this.f1085f = j3;
        this.cleanedAndPointers = i3 << 16;
    }

    @Override // D2.c
    public final boolean c() {
        return f1084g.get(this) == f() && b() != null;
    }

    public final boolean e() {
        return f1084g.addAndGet(this, -65536) == f() && b() != null;
    }

    public abstract int f();

    public abstract void g(int i3, InterfaceC0276i interfaceC0276i);

    public final void h() {
        if (f1084g.incrementAndGet(this) == f()) {
            d();
        }
    }

    public final boolean i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = f1084g;
            i3 = atomicIntegerFieldUpdater.get(this);
            if (i3 == f() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 65536 + i3));
        return true;
    }
}
