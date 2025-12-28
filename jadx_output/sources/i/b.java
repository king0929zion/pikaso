package I;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: f, reason: collision with root package name */
    public final g f1358f;

    /* renamed from: g, reason: collision with root package name */
    public Object f1359g;

    public b(g gVar, Object obj, Object obj2) {
        super(obj, obj2);
        this.f1358f = gVar;
        this.f1359g = obj2;
    }

    @Override // I.a, java.util.Map.Entry
    public final Object getValue() {
        return this.f1359g;
    }

    @Override // I.a, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f1359g;
        this.f1359g = obj;
        e eVar = (e) this.f1358f.f1372e;
        L.d dVar = eVar.f1366g;
        Object obj3 = this.f1356d;
        if (dVar.containsKey(obj3)) {
            boolean z3 = eVar.f1365f;
            if (!z3) {
                dVar.put(obj3, obj);
            } else {
                if (!z3) {
                    throw new NoSuchElementException();
                }
                o oVar = eVar.f1363d[eVar.f1364e];
                Object obj4 = oVar.f1385d[oVar.f1387f];
                dVar.put(obj3, obj);
                eVar.c(obj4 != null ? obj4.hashCode() : 0, dVar.f1448e, obj4, 0);
            }
            eVar.f1368j = dVar.f1450g;
        }
        return obj2;
    }
}
