package y2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class V extends b0 {

    /* renamed from: f, reason: collision with root package name */
    public final boolean f6771f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(S s3) {
        super(true);
        boolean z3 = true;
        P(s3);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b0.f6788e;
        InterfaceC0676i interfaceC0676i = (InterfaceC0676i) atomicReferenceFieldUpdater.get(this);
        C0677j c0677j = interfaceC0676i instanceof C0677j ? (C0677j) interfaceC0676i : null;
        if (c0677j != null) {
            b0 o3 = c0677j.o();
            while (!o3.J()) {
                InterfaceC0676i interfaceC0676i2 = (InterfaceC0676i) atomicReferenceFieldUpdater.get(o3);
                C0677j c0677j2 = interfaceC0676i2 instanceof C0677j ? (C0677j) interfaceC0676i2 : null;
                if (c0677j2 != null) {
                    o3 = c0677j2.o();
                }
            }
            this.f6771f = z3;
        }
        z3 = false;
        this.f6771f = z3;
    }

    @Override // y2.b0
    public final boolean J() {
        return this.f6771f;
    }

    @Override // y2.b0
    public final boolean K() {
        return true;
    }
}
