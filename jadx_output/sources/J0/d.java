package J0;

import a.AbstractC0090a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class d extends AbstractC0090a {

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f1416g;
    public final AtomicReferenceFieldUpdater h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f1417i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f1418j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f1419k;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f1416g = atomicReferenceFieldUpdater;
        this.h = atomicReferenceFieldUpdater2;
        this.f1417i = atomicReferenceFieldUpdater3;
        this.f1418j = atomicReferenceFieldUpdater4;
        this.f1419k = atomicReferenceFieldUpdater5;
    }

    @Override // a.AbstractC0090a
    public final void Y(f fVar, f fVar2) {
        this.h.lazySet(fVar, fVar2);
    }

    @Override // a.AbstractC0090a
    public final void Z(f fVar, Thread thread) {
        this.f1416g.lazySet(fVar, thread);
    }

    @Override // a.AbstractC0090a
    public final boolean j(g gVar, c cVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        c cVar2 = c.f1414b;
        do {
            atomicReferenceFieldUpdater = this.f1418j;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, cVar, cVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == cVar);
        return false;
    }

    @Override // a.AbstractC0090a
    public final boolean k(g gVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f1419k;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == obj);
        return false;
    }

    @Override // a.AbstractC0090a
    public final boolean l(g gVar, f fVar, f fVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f1417i;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, fVar, fVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == fVar);
        return false;
    }
}
