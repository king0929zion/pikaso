package J;

import d2.AbstractC0236g;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b extends AbstractC0236g implements G.b {

    /* renamed from: g, reason: collision with root package name */
    public static final b f1403g;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1404d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1405e;

    /* renamed from: f, reason: collision with root package name */
    public final I.c f1406f;

    static {
        K.b bVar = K.b.f1435a;
        f1403g = new b(bVar, bVar, I.c.f1360f);
    }

    public b(Object obj, Object obj2, I.c cVar) {
        this.f1404d = obj;
        this.f1405e = obj2;
        this.f1406f = cVar;
    }

    @Override // d2.AbstractC0230a
    public final int a() {
        I.c cVar = this.f1406f;
        cVar.getClass();
        return cVar.f1362e;
    }

    @Override // d2.AbstractC0230a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f1406f.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new c(this.f1404d, this.f1406f);
    }
}
