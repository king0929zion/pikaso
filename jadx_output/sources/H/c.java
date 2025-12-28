package H;

import d2.AbstractC0233d;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public abstract class c extends AbstractC0233d implements List, Collection, q2.a {
    public abstract c b(int i3, Object obj);

    public abstract c c(Object obj);

    @Override // d2.AbstractC0230a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // d2.AbstractC0230a, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public c d(Collection collection) {
        g e3 = e();
        e3.addAll(collection);
        return e3.c();
    }

    public abstract g e();

    public abstract c f(b bVar);

    public abstract c g(int i3);

    public abstract c h(int i3, Object obj);

    @Override // d2.AbstractC0233d, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // d2.AbstractC0233d, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final List subList(int i3, int i4) {
        return new G.a(this, i3, i4);
    }
}
