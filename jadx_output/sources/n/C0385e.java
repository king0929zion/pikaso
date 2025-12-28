package n;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: n.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0385e implements Collection {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0386f f4984d;

    public C0385e(C0386f c0386f) {
        this.f4984d = c0386f;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f4984d.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f4984d.a(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f4984d.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0382b(this.f4984d, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C0386f c0386f = this.f4984d;
        int a3 = c0386f.a(obj);
        if (a3 < 0) {
            return false;
        }
        c0386f.g(a3);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C0386f c0386f = this.f4984d;
        int i3 = c0386f.f4970f;
        int i4 = 0;
        boolean z3 = false;
        while (i4 < i3) {
            if (collection.contains(c0386f.i(i4))) {
                c0386f.g(i4);
                i4--;
                i3--;
                z3 = true;
            }
            i4++;
        }
        return z3;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C0386f c0386f = this.f4984d;
        int i3 = c0386f.f4970f;
        int i4 = 0;
        boolean z3 = false;
        while (i4 < i3) {
            if (!collection.contains(c0386f.i(i4))) {
                c0386f.g(i4);
                i4--;
                i3--;
                z3 = true;
            }
            i4++;
        }
        return z3;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f4984d.f4970f;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C0386f c0386f = this.f4984d;
        int i3 = c0386f.f4970f;
        Object[] objArr = new Object[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            objArr[i4] = c0386f.i(i4);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C0386f c0386f = this.f4984d;
        int i3 = c0386f.f4970f;
        if (objArr.length < i3) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i3);
        }
        for (int i4 = 0; i4 < i3; i4++) {
            objArr[i4] = c0386f.i(i4);
        }
        if (objArr.length > i3) {
            objArr[i3] = null;
        }
        return objArr;
    }
}
