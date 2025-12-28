package I;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class i extends AbstractCollection implements Collection, q2.b {

    /* renamed from: d, reason: collision with root package name */
    public final L.d f1373d;

    public i(L.d dVar) {
        this.f1373d = dVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f1373d.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f1373d.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        o[] oVarArr = new o[8];
        for (int i3 = 0; i3 < 8; i3++) {
            oVarArr[i3] = new p(2);
        }
        return new h(this.f1373d, oVarArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        L.d dVar = this.f1373d;
        dVar.getClass();
        return dVar.h;
    }
}
