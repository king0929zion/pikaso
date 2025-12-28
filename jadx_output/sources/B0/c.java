package B0;

import d2.C0248s;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import p2.g;

/* loaded from: classes.dex */
public final class c implements Collection, q2.a {

    /* renamed from: f, reason: collision with root package name */
    public static final c f275f = new c(C0248s.f4255d);

    /* renamed from: d, reason: collision with root package name */
    public final List f276d;

    /* renamed from: e, reason: collision with root package name */
    public final int f277e;

    public c(List list) {
        this.f276d = list;
        this.f277e = list.size();
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f276d.contains((b) obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f276d.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return g.a(this.f276d, ((c) obj).f276d);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.f276d.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f276d.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f276d.iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f277e;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return g.i(this);
    }

    public final String toString() {
        return "LocaleList(localeList=" + this.f276d + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return g.j(this, objArr);
    }
}
