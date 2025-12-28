package B2;

import g2.InterfaceC0271d;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class H extends C2.d {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f298a = AtomicReferenceFieldUpdater.newUpdater(H.class, Object.class, "_state");
    private volatile Object _state;

    @Override // C2.d
    public final boolean a(C2.b bVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f298a;
        if (atomicReferenceFieldUpdater.get(this) != null) {
            return false;
        }
        atomicReferenceFieldUpdater.set(this, w.f364b);
        return true;
    }

    @Override // C2.d
    public final InterfaceC0271d[] b(C2.b bVar) {
        f298a.set(this, null);
        return C2.c.f585a;
    }
}
