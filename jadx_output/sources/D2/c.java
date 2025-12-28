package D2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1049d = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_next");

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1050e = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_prev");
    private volatile Object _next;
    private volatile Object _prev;

    public c(u uVar) {
        this._prev = uVar;
    }

    public final void a() {
        f1050e.lazySet(this, null);
    }

    public final c b() {
        Object obj = f1049d.get(this);
        if (obj == AbstractC0071a.f1043b) {
            return null;
        }
        return (c) obj;
    }

    public abstract boolean c();

    public final void d() {
        c b3;
        if (b() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1050e;
            c cVar = (c) atomicReferenceFieldUpdater.get(this);
            while (cVar != null && cVar.c()) {
                cVar = (c) atomicReferenceFieldUpdater.get(cVar);
            }
            c b4 = b();
            p2.g.b(b4);
            while (b4.c() && (b3 = b4.b()) != null) {
                b4 = b3;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(b4);
                c cVar2 = ((c) obj) == null ? null : cVar;
                while (!atomicReferenceFieldUpdater.compareAndSet(b4, obj, cVar2)) {
                    if (atomicReferenceFieldUpdater.get(b4) != obj) {
                        break;
                    }
                }
            }
            if (cVar != null) {
                f1049d.set(cVar, b4);
            }
            if (!b4.c() || b4.b() == null) {
                if (cVar == null || !cVar.c()) {
                    return;
                }
            }
        }
    }
}
