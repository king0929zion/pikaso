package I;

import d2.AbstractC0236g;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class j extends AbstractC0236g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1374d;

    /* renamed from: e, reason: collision with root package name */
    public final c f1375e;

    public /* synthetic */ j(c cVar, int i3) {
        this.f1374d = i3;
        this.f1375e = cVar;
    }

    @Override // d2.AbstractC0230a
    public final int a() {
        switch (this.f1374d) {
            case 0:
                c cVar = this.f1375e;
                cVar.getClass();
                return cVar.f1362e;
            default:
                c cVar2 = this.f1375e;
                cVar2.getClass();
                return cVar2.f1362e;
        }
    }

    @Override // d2.AbstractC0230a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        Map.Entry entry;
        switch (this.f1374d) {
            case 0:
                if (!(obj instanceof Map.Entry) || (entry = (Map.Entry) obj) == null) {
                    return false;
                }
                Object key = entry.getKey();
                c cVar = this.f1375e;
                Object obj2 = cVar.get(key);
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && cVar.containsKey(entry.getKey());
            default:
                return this.f1375e.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f1374d) {
            case 0:
                n nVar = this.f1375e.f1361d;
                o[] oVarArr = new o[8];
                for (int i3 = 0; i3 < 8; i3++) {
                    oVarArr[i3] = new p(0);
                }
                return new k(nVar, oVarArr);
            default:
                n nVar2 = this.f1375e.f1361d;
                o[] oVarArr2 = new o[8];
                for (int i4 = 0; i4 < 8; i4++) {
                    oVarArr2[i4] = new p(1);
                }
                return new k(nVar2, oVarArr2);
        }
    }
}
