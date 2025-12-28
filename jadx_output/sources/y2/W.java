package y2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class W extends D2.k implements C, N, o2.c {

    /* renamed from: g, reason: collision with root package name */
    public b0 f6772g;

    @Override // y2.N
    public final boolean b() {
        return true;
    }

    @Override // y2.C
    public final void d() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2;
        b0 o3 = o();
        while (true) {
            Object M2 = o3.M();
            if (M2 instanceof W) {
                if (M2 != this) {
                    return;
                }
                E e3 = AbstractC0688v.f6827j;
                do {
                    atomicReferenceFieldUpdater2 = b0.f6787d;
                    if (atomicReferenceFieldUpdater2.compareAndSet(o3, M2, e3)) {
                        return;
                    }
                } while (atomicReferenceFieldUpdater2.get(o3) == M2);
            } else {
                if (!(M2 instanceof N) || ((N) M2).g() == null) {
                    return;
                }
                while (true) {
                    Object l3 = l();
                    if (l3 instanceof D2.r) {
                        D2.k kVar = ((D2.r) l3).f1082a;
                        return;
                    }
                    if (l3 == this) {
                        return;
                    }
                    p2.g.c(l3, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                    D2.k kVar2 = (D2.k) l3;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = D2.k.f1068f;
                    D2.r rVar = (D2.r) atomicReferenceFieldUpdater3.get(kVar2);
                    if (rVar == null) {
                        rVar = new D2.r(kVar2);
                        atomicReferenceFieldUpdater3.lazySet(kVar2, rVar);
                    }
                    do {
                        atomicReferenceFieldUpdater = D2.k.f1066d;
                        if (atomicReferenceFieldUpdater.compareAndSet(this, l3, rVar)) {
                            kVar2.j();
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == l3);
                }
            }
        }
    }

    @Override // y2.N
    public final d0 g() {
        return null;
    }

    public S getParent() {
        return o();
    }

    public final b0 o() {
        b0 b0Var = this.f6772g;
        if (b0Var != null) {
            return b0Var;
        }
        p2.g.h("job");
        throw null;
    }

    public abstract void p(Throwable th);

    @Override // D2.k
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0688v.f(this) + "[job@" + AbstractC0688v.f(o()) + ']';
    }
}
