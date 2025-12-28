package I;

import c0.AbstractC0147G;
import c0.C0145E;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class g implements Iterator, q2.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1371d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final Iterator f1372e;

    public g(L.d dVar) {
        o[] oVarArr = new o[8];
        for (int i3 = 0; i3 < 8; i3++) {
            oVarArr[i3] = new q(this);
        }
        this.f1372e = new e(dVar, oVarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f1371d) {
            case 0:
                return ((e) this.f1372e).f1365f;
            default:
                return this.f1372e.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f1371d) {
            case 0:
                return (Map.Entry) ((e) this.f1372e).next();
            default:
                return (AbstractC0147G) this.f1372e.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f1371d) {
            case 0:
                ((e) this.f1372e).remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public g(C0145E c0145e) {
        this.f1372e = c0145e.f3688m.iterator();
    }
}
