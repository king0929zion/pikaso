package w2;

import d2.C0248s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class h extends i {
    public static Object X(d dVar) {
        c cVar = new c(dVar);
        if (cVar.hasNext()) {
            return cVar.next();
        }
        return null;
    }

    public static f Y(Object obj, o2.c cVar) {
        return obj == null ? b.f6561a : new e(new A0.c(18, obj), cVar);
    }

    public static d Z(f fVar, o2.c cVar) {
        return new d(0, new e(fVar, cVar));
    }

    public static List a0(f fVar) {
        Iterator it = fVar.iterator();
        if (!it.hasNext()) {
            return C0248s.f4255d;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return Z.b.D(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
