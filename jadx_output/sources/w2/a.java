package w2;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class a implements f {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f6560a;

    public a(d dVar) {
        this.f6560a = new AtomicReference(dVar);
    }

    @Override // w2.f
    public final Iterator iterator() {
        f fVar = (f) this.f6560a.getAndSet(null);
        if (fVar != null) {
            return fVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
