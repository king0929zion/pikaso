package v0;

import java.util.ArrayList;
import java.util.List;

/* renamed from: v0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0619d {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f6338a = 0;

    static {
        new C0618c("", null, null, null);
    }

    public static final ArrayList a(List list, int i3, int i4) {
        if (i3 > i4) {
            throw new IllegalArgumentException(("start (" + i3 + ") should be less than or equal to end (" + i4 + ')').toString());
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            Object obj = list.get(i5);
            C0617b c0617b = (C0617b) obj;
            if (b(i3, i4, c0617b.f6331b, c0617b.f6332c)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i6 = 0; i6 < size2; i6++) {
            C0617b c0617b2 = (C0617b) arrayList.get(i6);
            arrayList2.add(new C0617b(c0617b2.f6330a, Math.max(i3, c0617b2.f6331b) - i3, Math.min(i4, c0617b2.f6332c) - i3, c0617b2.f6333d));
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return arrayList2;
    }

    public static final boolean b(int i3, int i4, int i5, int i6) {
        if (Math.max(i3, i5) < Math.min(i4, i6)) {
            return true;
        }
        if (i3 <= i5 && i6 <= i4) {
            if (i4 != i6) {
                return true;
            }
            if ((i5 == i6) == (i3 == i4)) {
                return true;
            }
        }
        if (i5 <= i3 && i4 <= i6) {
            if (i6 != i4) {
                return true;
            }
            if ((i3 == i4) == (i5 == i6)) {
                return true;
            }
        }
        return false;
    }
}
