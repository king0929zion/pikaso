package I;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class f extends AbstractSet implements Set, q2.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1369d;

    /* renamed from: e, reason: collision with root package name */
    public final L.d f1370e;

    public /* synthetic */ f(int i3, L.d dVar) {
        this.f1369d = i3;
        this.f1370e = dVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f1369d) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f1369d) {
            case 0:
                this.f1370e.clear();
                break;
            default:
                this.f1370e.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f1369d) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if ((entry != null ? entry : null) == null) {
                    return false;
                }
                Object key = entry.getKey();
                L.d dVar = this.f1370e;
                Object obj2 = dVar.get(key);
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && dVar.containsKey(entry.getKey());
            default:
                return this.f1370e.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f1369d) {
            case 0:
                return new g(this.f1370e);
            default:
                o[] oVarArr = new o[8];
                for (int i3 = 0; i3 < 8; i3++) {
                    oVarArr[i3] = new p(1);
                }
                return new h(this.f1370e, oVarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f1369d) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if ((entry != null ? entry : null) == null) {
                    return false;
                }
                return this.f1370e.remove(entry.getKey(), entry.getValue());
            default:
                L.d dVar = this.f1370e;
                if (!dVar.containsKey(obj)) {
                    return false;
                }
                dVar.remove(obj);
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f1369d) {
            case 0:
                L.d dVar = this.f1370e;
                dVar.getClass();
                return dVar.h;
            default:
                L.d dVar2 = this.f1370e;
                dVar2.getClass();
                return dVar2.h;
        }
    }
}
