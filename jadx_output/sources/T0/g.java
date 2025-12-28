package t0;

import c2.InterfaceC0164c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import o0.AbstractC0461K;

/* loaded from: classes.dex */
public final class g implements Iterable, q2.a {

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f6230d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public boolean f6231e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6232f;

    public final Object a(q qVar) {
        Object obj = this.f6230d.get(qVar);
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Key not present: " + qVar + " - consider getOrElse or getOrNull");
    }

    public final void b(q qVar, Object obj) {
        boolean z3 = obj instanceof C0599a;
        LinkedHashMap linkedHashMap = this.f6230d;
        if (!z3 || !linkedHashMap.containsKey(qVar)) {
            linkedHashMap.put(qVar, obj);
            return;
        }
        Object obj2 = linkedHashMap.get(qVar);
        p2.g.c(obj2, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
        C0599a c0599a = (C0599a) obj2;
        C0599a c0599a2 = (C0599a) obj;
        String str = c0599a2.f6198a;
        if (str == null) {
            str = c0599a.f6198a;
        }
        InterfaceC0164c interfaceC0164c = c0599a2.f6199b;
        if (interfaceC0164c == null) {
            interfaceC0164c = c0599a.f6199b;
        }
        linkedHashMap.put(qVar, new C0599a(str, interfaceC0164c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return p2.g.a(this.f6230d, gVar.f6230d) && this.f6231e == gVar.f6231e && this.f6232f == gVar.f6232f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f6232f) + ((Boolean.hashCode(this.f6231e) + (this.f6230d.hashCode() * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f6230d.entrySet().iterator();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f6231e) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.f6232f) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry entry : this.f6230d.entrySet()) {
            q qVar = (q) entry.getKey();
            Object value = entry.getValue();
            sb.append(str);
            sb.append(qVar.f6285a);
            sb.append(" : ");
            sb.append(value);
            str = ", ";
        }
        return AbstractC0461K.o(this) + "{ " + ((Object) sb) + " }";
    }
}
