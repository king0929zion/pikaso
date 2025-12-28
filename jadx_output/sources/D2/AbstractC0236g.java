package d2;

import java.util.Iterator;
import java.util.Set;

/* renamed from: d2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0236g extends AbstractC0230a implements Set {
    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        p2.g.e(set, "other");
        if (size() != set.size()) {
            return false;
        }
        return containsAll(set);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        Iterator<E> it = iterator();
        int i3 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i3 += next != null ? next.hashCode() : 0;
        }
        return i3;
    }
}
