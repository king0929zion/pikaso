package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0120a {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3462a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f3463b;

    public C0120a(HashMap hashMap) {
        this.f3463b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            l lVar = (l) entry.getValue();
            List list = (List) this.f3462a.get(lVar);
            if (list == null) {
                list = new ArrayList();
                this.f3462a.put(lVar, list);
            }
            list.add((C0121b) entry.getKey());
        }
    }

    public static void a(List list, r rVar, l lVar, q qVar) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0121b c0121b = (C0121b) list.get(size);
                c0121b.getClass();
                try {
                    int i3 = c0121b.f3464a;
                    Method method = c0121b.f3465b;
                    if (i3 == 0) {
                        method.invoke(qVar, null);
                    } else if (i3 == 1) {
                        method.invoke(qVar, rVar);
                    } else if (i3 == 2) {
                        method.invoke(qVar, rVar, lVar);
                    }
                } catch (IllegalAccessException e3) {
                    throw new RuntimeException(e3);
                } catch (InvocationTargetException e4) {
                    throw new RuntimeException("Failed to call observer method", e4.getCause());
                }
            }
        }
    }
}
