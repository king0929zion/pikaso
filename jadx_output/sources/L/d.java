package L;

import D.AbstractC0047k0;
import D.O0;
import I.i;
import I.n;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p2.g;

/* loaded from: classes.dex */
public final class d extends AbstractMap implements Map, q2.d {

    /* renamed from: d, reason: collision with root package name */
    public K.b f1447d = new K.b();

    /* renamed from: e, reason: collision with root package name */
    public n f1448e;

    /* renamed from: f, reason: collision with root package name */
    public Object f1449f;

    /* renamed from: g, reason: collision with root package name */
    public int f1450g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public e f1451i;

    public d(e eVar) {
        this.f1448e = eVar.f1361d;
        this.h = eVar.f1362e;
        this.f1451i = eVar;
    }

    public final e a() {
        n nVar = this.f1448e;
        e eVar = this.f1451i;
        if (nVar != eVar.f1361d) {
            this.f1447d = new K.b();
            eVar = new e(this.f1448e, this.h);
        }
        this.f1451i = eVar;
        return eVar;
    }

    public final boolean b(Object obj) {
        return this.f1448e.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    public final Object c(Object obj) {
        return this.f1448e.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f1448e = n.f1380e;
        e(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof AbstractC0047k0) {
            return b((AbstractC0047k0) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof O0) {
            return super.containsValue((O0) obj);
        }
        return false;
    }

    public final Object d(Object obj) {
        this.f1449f = null;
        n n2 = this.f1448e.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (n2 == null) {
            n2 = n.f1380e;
        }
        this.f1448e = n2;
        return this.f1449f;
    }

    public final void e(int i3) {
        this.h = i3;
        this.f1450g++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new I.f(0, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof AbstractC0047k0) {
            return (O0) c((AbstractC0047k0) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof AbstractC0047k0) ? obj2 : (O0) super.getOrDefault((AbstractC0047k0) obj, (O0) obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new I.f(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f1449f = null;
        this.f1448e = this.f1448e.l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.f1449f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [I.c] */
    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        e eVar = null;
        e eVar2 = map instanceof I.c ? (I.c) map : null;
        if (eVar2 == null) {
            d dVar = map instanceof d ? (d) map : null;
            if (dVar != null) {
                eVar = dVar.a();
            }
        } else {
            eVar = eVar2;
        }
        if (eVar == null) {
            super.putAll(map);
            return;
        }
        K.a aVar = new K.a();
        aVar.f1434a = 0;
        int i3 = this.h;
        n nVar = this.f1448e;
        n nVar2 = eVar.f1361d;
        g.c(nVar2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f1448e = nVar.m(nVar2, 0, aVar, this);
        int i4 = (eVar.f1362e + i3) - aVar.f1434a;
        if (i3 != i4) {
            e(i4);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i3 = this.h;
        n o3 = this.f1448e.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (o3 == null) {
            o3 = n.f1380e;
        }
        this.f1448e = o3;
        return i3 != this.h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new i(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof AbstractC0047k0) {
            return (O0) d((AbstractC0047k0) obj);
        }
        return null;
    }
}
