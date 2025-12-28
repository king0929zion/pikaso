package d2;

import java.util.Collection;

/* renamed from: d2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0242m extends AbstractC0241l {
    public static int W(Iterable iterable) {
        p2.g.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}
