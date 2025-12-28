package d2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: d2.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0245p extends AbstractC0244o {
    public static void X(List list, Comparator comparator) {
        p2.g.e(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
