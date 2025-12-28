package w2;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class k implements Iterator, q2.a {

    /* renamed from: d, reason: collision with root package name */
    public final Iterator f6575d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f6576e;

    public k(e eVar) {
        this.f6576e = eVar;
        this.f6575d = ((f) eVar.f6569b).iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6575d.hasNext();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [o2.c, p2.h] */
    @Override // java.util.Iterator
    public final Object next() {
        return ((p2.h) this.f6576e.f6570c).i(this.f6575d.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
