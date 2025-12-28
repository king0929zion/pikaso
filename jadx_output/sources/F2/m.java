package F2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1243b = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "lastScheduledTask");

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1244c = AtomicIntegerFieldUpdater.newUpdater(m.class, "producerIndex");

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1245d = AtomicIntegerFieldUpdater.newUpdater(m.class, "consumerIndex");

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1246e = AtomicIntegerFieldUpdater.newUpdater(m.class, "blockingTasksInBuffer");

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray f1247a = new AtomicReferenceArray(128);
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;

    public final h a(h hVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1244c;
        if (atomicIntegerFieldUpdater.get(this) - f1245d.get(this) == 127) {
            return hVar;
        }
        if (hVar.f1232e.f1233a == 1) {
            f1246e.incrementAndGet(this);
        }
        int i3 = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.f1247a;
            if (atomicReferenceArray.get(i3) == null) {
                atomicReferenceArray.lazySet(i3, hVar);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final h b() {
        h hVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1245d;
            int i3 = atomicIntegerFieldUpdater.get(this);
            if (i3 - f1244c.get(this) == 0) {
                return null;
            }
            int i4 = i3 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i3, i3 + 1) && (hVar = (h) this.f1247a.getAndSet(i4, null)) != null) {
                if (hVar.f1232e.f1233a == 1) {
                    f1246e.decrementAndGet(this);
                }
                return hVar;
            }
        }
    }

    public final h c(int i3, boolean z3) {
        int i4 = i3 & 127;
        AtomicReferenceArray atomicReferenceArray = this.f1247a;
        h hVar = (h) atomicReferenceArray.get(i4);
        if (hVar != null) {
            if ((hVar.f1232e.f1233a == 1) == z3) {
                while (!atomicReferenceArray.compareAndSet(i4, hVar, null)) {
                    if (atomicReferenceArray.get(i4) != hVar) {
                    }
                }
                if (z3) {
                    f1246e.decrementAndGet(this);
                }
                return hVar;
            }
        }
        return null;
    }
}
