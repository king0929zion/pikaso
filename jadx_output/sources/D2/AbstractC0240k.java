package d2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: d2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0240k extends AbstractC0246q {
    public static boolean Z(Iterable iterable, Object obj) {
        int i3;
        p2.g.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (!(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            int i4 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i3 = -1;
                    break;
                }
                Object next = it.next();
                if (i4 < 0) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                if (p2.g.a(obj, next)) {
                    i3 = i4;
                    break;
                }
                i4++;
            }
        } else {
            i3 = ((List) iterable).indexOf(obj);
        }
        return i3 >= 0;
    }

    public static Object a0(List list) {
        p2.g.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object b0(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final void c0(Collection collection, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i3, CharSequence charSequence4, o2.c cVar) {
        p2.g.e(collection, "<this>");
        p2.g.e(charSequence, "separator");
        p2.g.e(charSequence2, "prefix");
        p2.g.e(charSequence3, "postfix");
        p2.g.e(charSequence4, "truncated");
        sb.append(charSequence2);
        Iterator it = collection.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i4++;
            if (i4 > 1) {
                sb.append(charSequence);
            }
            if (i3 >= 0 && i4 > i3) {
                break;
            }
            if (cVar != null) {
                sb.append((CharSequence) cVar.i(next));
            } else {
                if (next != null ? next instanceof CharSequence : true) {
                    sb.append((CharSequence) next);
                } else if (next instanceof Character) {
                    sb.append(((Character) next).charValue());
                } else {
                    sb.append((CharSequence) String.valueOf(next));
                }
            }
        }
        if (i3 >= 0 && i4 > i3) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }

    public static String d0(Collection collection, String str, String str2, String str3, o2.c cVar, int i3) {
        if ((i3 & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i3 & 2) != 0 ? "" : str2;
        String str6 = (i3 & 4) != 0 ? "" : str3;
        if ((i3 & 32) != 0) {
            cVar = null;
        }
        p2.g.e(collection, "<this>");
        p2.g.e(str4, "separator");
        p2.g.e(str5, "prefix");
        p2.g.e(str6, "postfix");
        StringBuilder sb = new StringBuilder();
        c0(collection, sb, str4, str5, str6, -1, "...", cVar);
        String sb2 = sb.toString();
        p2.g.d(sb2, "toString(...)");
        return sb2;
    }

    public static Object e0(List list) {
        p2.g.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(AbstractC0241l.T(list));
    }

    public static Object f0(List list) {
        p2.g.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static ArrayList g0(Collection collection, List list) {
        p2.g.e(collection, "<this>");
        ArrayList arrayList = new ArrayList(list.size() + collection.size());
        arrayList.addAll(collection);
        arrayList.addAll(list);
        return arrayList;
    }

    public static ArrayList h0(List list, Object obj) {
        p2.g.e(list, "<this>");
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(obj);
        return arrayList;
    }

    public static List i0(Iterable iterable) {
        ArrayList arrayList;
        p2.g.e(iterable, "<this>");
        boolean z3 = iterable instanceof Collection;
        C0248s c0248s = C0248s.f4255d;
        if (z3) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return c0248s;
            }
            if (size != 1) {
                return j0(collection);
            }
            return Z.b.D(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        }
        if (z3) {
            arrayList = j0((Collection) iterable);
        } else {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList2.add(it.next());
            }
            arrayList = arrayList2;
        }
        int size2 = arrayList.size();
        return size2 != 0 ? size2 != 1 ? arrayList : Z.b.D(arrayList.get(0)) : c0248s;
    }

    public static ArrayList j0(Collection collection) {
        p2.g.e(collection, "<this>");
        return new ArrayList(collection);
    }
}
