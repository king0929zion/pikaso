package N;

import d2.AbstractC0242m;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f1735a;

    public /* synthetic */ g(Object obj) {
        this.f1735a = obj;
    }

    public void a() {
        p2.h hVar = (p2.h) this.f1735a;
        synchronized (o.f1756b) {
            try {
                List list = (List) o.f1761g;
                p2.g.e(list, "<this>");
                ArrayList arrayList = new ArrayList(AbstractC0242m.W(list));
                boolean z3 = false;
                for (Object obj : list) {
                    boolean z4 = true;
                    if (!z3 && p2.g.a(obj, hVar)) {
                        z3 = true;
                        z4 = false;
                    }
                    if (z4) {
                        arrayList.add(obj);
                    }
                }
                o.f1761g = arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ g(o2.e eVar) {
        this.f1735a = (p2.h) eVar;
    }
}
