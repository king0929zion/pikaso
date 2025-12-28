package d2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: d2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0241l extends Z.b {
    public static ArrayList S(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C0237h(objArr));
    }

    public static int T(List list) {
        p2.g.e(list, "<this>");
        return list.size() - 1;
    }

    public static List U(Object... objArr) {
        if (objArr.length <= 0) {
            return C0248s.f4255d;
        }
        List asList = Arrays.asList(objArr);
        p2.g.d(asList, "asList(...)");
        return asList;
    }

    public static ArrayList V(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C0237h(objArr));
    }
}
