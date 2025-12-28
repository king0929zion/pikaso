package N;

import java.util.ListIterator;

/* loaded from: classes.dex */
public final class B implements ListIterator, q2.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p2.n f1702d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C f1703e;

    public B(p2.n nVar, C c3) {
        this.f1702d = nVar;
        this.f1703e = c3;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new IllegalStateException("Cannot modify a state list through an iterator");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f1702d.f5959d < this.f1703e.f1707g - 1;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f1702d.f5959d >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        p2.n nVar = this.f1702d;
        int i3 = nVar.f5959d + 1;
        C c3 = this.f1703e;
        t.a(i3, c3.f1707g);
        nVar.f5959d = i3;
        return c3.get(i3);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f1702d.f5959d + 1;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        p2.n nVar = this.f1702d;
        int i3 = nVar.f5959d;
        C c3 = this.f1703e;
        t.a(i3, c3.f1707g);
        nVar.f5959d = i3 - 1;
        return c3.get(i3);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f1702d.f5959d;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new IllegalStateException("Cannot modify a state list through an iterator");
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new IllegalStateException("Cannot modify a state list through an iterator");
    }
}
