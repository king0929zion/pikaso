package y2;

import D2.AbstractC0071a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: y2.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0692z extends D2.t {
    public static final AtomicIntegerFieldUpdater h = AtomicIntegerFieldUpdater.newUpdater(C0692z.class, "_decision");
    private volatile int _decision;

    @Override // D2.t, y2.b0
    public final void y(Object obj) {
        z(obj);
    }

    @Override // D2.t, y2.b0
    public final void z(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = h;
            int i3 = atomicIntegerFieldUpdater.get(this);
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                AbstractC0071a.h(Z.b.z(this.f1083g), AbstractC0688v.m(obj), null);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
