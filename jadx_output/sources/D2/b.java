package D2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class b extends q {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1048a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus");
    private volatile Object _consensus = AbstractC0071a.f1042a;

    @Override // D2.q
    public final Object a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1048a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        w wVar = AbstractC0071a.f1042a;
        if (obj2 == wVar) {
            w c3 = c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == wVar) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, wVar, c3)) {
                        obj2 = c3;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != wVar) {
                        obj2 = atomicReferenceFieldUpdater.get(this);
                        break;
                    }
                }
            }
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(Object obj, Object obj2);

    public abstract w c(Object obj);
}
