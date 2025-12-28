package g2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class k implements InterfaceC0271d, i2.d {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4335e = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "result");

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0271d f4336d;
    private volatile Object result;

    public k(InterfaceC0271d interfaceC0271d) {
        h2.a aVar = h2.a.f4407d;
        this.f4336d = interfaceC0271d;
        this.result = aVar;
    }

    @Override // i2.d
    public final i2.d j() {
        InterfaceC0271d interfaceC0271d = this.f4336d;
        if (interfaceC0271d instanceof i2.d) {
            return (i2.d) interfaceC0271d;
        }
        return null;
    }

    @Override // g2.InterfaceC0271d
    public final InterfaceC0276i o() {
        return this.f4336d.o();
    }

    @Override // g2.InterfaceC0271d
    public final void t(Object obj) {
        while (true) {
            Object obj2 = this.result;
            h2.a aVar = h2.a.f4408e;
            if (obj2 == aVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4335e;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != aVar) {
                        break;
                    }
                }
                return;
            }
            h2.a aVar2 = h2.a.f4407d;
            if (obj2 != aVar2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f4335e;
            h2.a aVar3 = h2.a.f4409f;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, aVar2, aVar3)) {
                if (atomicReferenceFieldUpdater2.get(this) != aVar2) {
                    break;
                }
            }
            this.f4336d.t(obj);
            return;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f4336d;
    }
}
