package d2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: d2.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0246q extends AbstractC0245p {
    public static void Y(ArrayList arrayList, Iterable iterable) {
        p2.g.e(arrayList, "<this>");
        p2.g.e(iterable, "elements");
        if (iterable instanceof Collection) {
            arrayList.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
    }
}
