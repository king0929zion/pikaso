package I;

import d2.AbstractC0230a;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class l extends AbstractC0230a {

    /* renamed from: d, reason: collision with root package name */
    public final c f1376d;

    public l(c cVar) {
        this.f1376d = cVar;
    }

    @Override // d2.AbstractC0230a
    public final int a() {
        c cVar = this.f1376d;
        cVar.getClass();
        return cVar.f1362e;
    }

    @Override // d2.AbstractC0230a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f1376d.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        n nVar = this.f1376d.f1361d;
        o[] oVarArr = new o[8];
        for (int i3 = 0; i3 < 8; i3++) {
            oVarArr[i3] = new p(2);
        }
        return new k(nVar, oVarArr);
    }
}
