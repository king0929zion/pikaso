package d2;

import A.AbstractC0000a;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: d2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0232c extends C0231b implements ListIterator {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AbstractC0233d f4248g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0232c(AbstractC0233d abstractC0233d, int i3) {
        super(0, abstractC0233d);
        this.f4248g = abstractC0233d;
        int a3 = abstractC0233d.a();
        if (i3 < 0 || i3 > a3) {
            throw new IndexOutOfBoundsException(AbstractC0000a.d("index: ", i3, ", size: ", a3));
        }
        this.f4246e = i3;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f4246e > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f4246e;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i3 = this.f4246e - 1;
        this.f4246e = i3;
        return this.f4248g.get(i3);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f4246e - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
