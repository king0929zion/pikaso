package F;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class c implements ListIterator, q2.a {

    /* renamed from: d, reason: collision with root package name */
    public final Object f1156d;

    /* renamed from: e, reason: collision with root package name */
    public int f1157e;

    public c(int i3, List list) {
        this.f1156d = list;
        this.f1157e = i3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void add(Object obj) {
        this.f1156d.add(this.f1157e, obj);
        this.f1157e++;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f1157e < this.f1156d.size();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f1157e > 0;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i3 = this.f1157e;
        this.f1157e = i3 + 1;
        return this.f1156d.get(i3);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f1157e;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final Object previous() {
        int i3 = this.f1157e - 1;
        this.f1157e = i3;
        return this.f1156d.get(i3);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f1157e - 1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i3 = this.f1157e - 1;
        this.f1157e = i3;
        this.f1156d.remove(i3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.f1156d.set(this.f1157e, obj);
    }
}
