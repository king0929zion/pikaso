package p2;

import c2.InterfaceC0164c;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class r {
    public static List a(Object obj) {
        if ((obj instanceof q2.a) && !(obj instanceof q2.c)) {
            e(obj, "kotlin.collections.MutableList");
            throw null;
        }
        try {
            return (List) obj;
        } catch (ClassCastException e3) {
            g.g(e3, r.class.getName());
            throw e3;
        }
    }

    public static Map b(Object obj) {
        if ((obj instanceof q2.a) && !(obj instanceof q2.d)) {
            e(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e3) {
            g.g(e3, r.class.getName());
            throw e3;
        }
    }

    public static void c(int i3, Object obj) {
        if (obj == null || d(i3, obj)) {
            return;
        }
        e(obj, "kotlin.jvm.functions.Function" + i3);
        throw null;
    }

    public static boolean d(int i3, Object obj) {
        int i4;
        if (!(obj instanceof InterfaceC0164c)) {
            return false;
        }
        if (obj instanceof e) {
            i4 = ((e) obj).e();
        } else if (obj instanceof o2.a) {
            i4 = 0;
        } else if (obj instanceof o2.c) {
            i4 = 1;
        } else if (obj instanceof o2.e) {
            i4 = 2;
        } else if (obj instanceof o2.f) {
            i4 = 3;
        } else if (obj instanceof o2.g) {
            i4 = 4;
        } else {
            boolean z3 = obj instanceof L.a;
            i4 = z3 ? 5 : z3 ? 6 : z3 ? 7 : z3 ? 8 : z3 ? 9 : z3 ? 10 : z3 ? 11 : z3 ? 13 : z3 ? 14 : z3 ? 15 : z3 ? 16 : z3 ? 17 : z3 ? 18 : z3 ? 19 : z3 ? 20 : z3 ? 21 : -1;
        }
        return i4 == i3;
    }

    public static void e(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
        g.g(classCastException, r.class.getName());
        throw classCastException;
    }
}
