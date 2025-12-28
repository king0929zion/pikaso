package t;

import java.util.HashMap;
import l0.InterfaceC0360j;
import l0.InterfaceC0361k;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f6153a = b(true);

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f6154b = b(false);

    public static final void a(l0.n nVar, l0.o oVar, InterfaceC0360j interfaceC0360j, G0.f fVar, int i3, int i4, P.d dVar) {
        P.d dVar2;
        Object o3 = interfaceC0360j.o();
        d dVar3 = o3 instanceof d ? (d) o3 : null;
        l0.n.e(nVar, oVar, ((dVar3 == null || (dVar2 = dVar3.f6152q) == null) ? dVar : dVar2).a(r2.a.d(oVar.f4927d, oVar.f4928e), r2.a.d(i3, i4), fVar));
    }

    public static final HashMap b(boolean z3) {
        HashMap hashMap = new HashMap(9);
        c(hashMap, z3, P.a.f2065d);
        c(hashMap, z3, P.a.f2066e);
        c(hashMap, z3, P.a.f2067f);
        c(hashMap, z3, P.a.f2068g);
        c(hashMap, z3, P.a.h);
        c(hashMap, z3, P.a.f2069i);
        c(hashMap, z3, P.a.f2070j);
        c(hashMap, z3, P.a.f2071k);
        c(hashMap, z3, P.a.f2072l);
        return hashMap;
    }

    public static final void c(HashMap hashMap, boolean z3, P.d dVar) {
        hashMap.put(dVar, new i(dVar, z3));
    }

    public static final InterfaceC0361k d(boolean z3) {
        P.d dVar = P.a.f2065d;
        InterfaceC0361k interfaceC0361k = (InterfaceC0361k) (z3 ? f6153a : f6154b).get(dVar);
        return interfaceC0361k == null ? new i(dVar, z3) : interfaceC0361k;
    }
}
