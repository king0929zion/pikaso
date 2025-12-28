package t0;

import D.C0065y;
import d2.AbstractC0240k;
import d2.C0248s;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import n0.AbstractC0409C;
import n0.C0444z;
import n0.InterfaceC0427h;
import n0.Y;
import q.C0549B;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final P.k f6236a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6237b;

    /* renamed from: c, reason: collision with root package name */
    public final C0444z f6238c;

    /* renamed from: d, reason: collision with root package name */
    public final g f6239d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6240e;

    /* renamed from: f, reason: collision with root package name */
    public k f6241f;

    /* renamed from: g, reason: collision with root package name */
    public final int f6242g;

    public k(P.k kVar, boolean z3, C0444z c0444z, g gVar) {
        this.f6236a = kVar;
        this.f6237b = z3;
        this.f6238c = c0444z;
        this.f6239d = gVar;
        this.f6242g = c0444z.f5301e;
    }

    public static /* synthetic */ List h(k kVar, boolean z3, int i3) {
        boolean z4 = (i3 & 1) != 0 ? !kVar.f6237b : false;
        if ((i3 & 2) != 0) {
            z3 = false;
        }
        return kVar.g(z4, z3, false);
    }

    public final k a(e eVar, o2.c cVar) {
        g gVar = new g();
        gVar.f6231e = false;
        gVar.f6232f = false;
        cVar.i(gVar);
        k kVar = new k(new i(cVar), false, new C0444z(this.f6242g + (eVar != null ? 1000000000 : 2000000000), true), gVar);
        kVar.f6240e = true;
        kVar.f6241f = this;
        return kVar;
    }

    public final void b(C0444z c0444z, ArrayList arrayList, boolean z3) {
        F.d m2 = c0444z.m();
        int i3 = m2.f1160f;
        if (i3 > 0) {
            Object[] objArr = m2.f1158d;
            int i4 = 0;
            do {
                C0444z c0444z2 = (C0444z) objArr[i4];
                if (c0444z2.u() && (z3 || !c0444z2.f5297E)) {
                    if (c0444z2.f5319x.f(8)) {
                        arrayList.add(Z0.d.d(c0444z2, this.f6237b));
                    } else {
                        b(c0444z2, arrayList, z3);
                    }
                }
                i4++;
            } while (i4 < i3);
        }
    }

    public final Y c() {
        if (this.f6240e) {
            k j3 = j();
            if (j3 != null) {
                return j3.c();
            }
            return null;
        }
        InterfaceC0427h y3 = Z0.d.y(this.f6238c);
        if (y3 == null) {
            y3 = this.f6236a;
        }
        return AbstractC0409C.p(y3, 8);
    }

    public final void d(List list) {
        List o3 = o(false, false);
        int size = o3.size();
        for (int i3 = 0; i3 < size; i3++) {
            k kVar = (k) o3.get(i3);
            if (kVar.l()) {
                list.add(kVar);
            } else if (!kVar.f6239d.f6232f) {
                kVar.d(list);
            }
        }
    }

    public final V.d e() {
        Y c3 = c();
        if (c3 != null) {
            if (!c3.q0().f2099p) {
                c3 = null;
            }
            if (c3 != null) {
                return Z0.d.v(c3).h(c3, true);
            }
        }
        return V.d.f2445e;
    }

    public final V.d f() {
        Y c3 = c();
        if (c3 != null) {
            if (!c3.q0().f2099p) {
                c3 = null;
            }
            if (c3 != null) {
                return Z0.d.l(c3);
            }
        }
        return V.d.f2445e;
    }

    public final List g(boolean z3, boolean z4, boolean z5) {
        if (!z3 && this.f6239d.f6232f) {
            return C0248s.f4255d;
        }
        if (!l()) {
            return o(z4, z5);
        }
        ArrayList arrayList = new ArrayList();
        d(arrayList);
        return arrayList;
    }

    public final g i() {
        boolean l3 = l();
        g gVar = this.f6239d;
        if (!l3) {
            return gVar;
        }
        g gVar2 = new g();
        gVar2.f6231e = gVar.f6231e;
        gVar2.f6232f = gVar.f6232f;
        gVar2.f6230d.putAll(gVar.f6230d);
        n(gVar2);
        return gVar2;
    }

    public final k j() {
        C0444z c0444z;
        k kVar = this.f6241f;
        if (kVar != null) {
            return kVar;
        }
        C0444z c0444z2 = this.f6238c;
        boolean z3 = this.f6237b;
        if (z3) {
            j jVar = j.f6235e;
            c0444z = c0444z2.k();
            while (c0444z != null) {
                if (((Boolean) jVar.i(c0444z)).booleanValue()) {
                    break;
                }
                c0444z = c0444z.k();
            }
        }
        c0444z = null;
        if (c0444z == null) {
            C0444z k3 = c0444z2.k();
            while (true) {
                if (k3 == null) {
                    c0444z = null;
                    break;
                }
                if (k3.f5319x.f(8)) {
                    c0444z = k3;
                    break;
                }
                k3 = k3.k();
            }
        }
        if (c0444z == null) {
            return null;
        }
        return Z0.d.d(c0444z, z3);
    }

    public final g k() {
        return this.f6239d;
    }

    public final boolean l() {
        return this.f6237b && this.f6239d.f6231e;
    }

    public final boolean m() {
        if (!this.f6240e && h(this, true, 4).isEmpty()) {
            C0444z k3 = this.f6238c.k();
            while (true) {
                if (k3 != null) {
                    g i3 = k3.i();
                    if (i3 != null && i3.f6231e) {
                        break;
                    }
                    k3 = k3.k();
                } else {
                    k3 = null;
                    break;
                }
            }
            if (k3 == null) {
                return true;
            }
        }
        return false;
    }

    public final void n(g gVar) {
        if (this.f6239d.f6232f) {
            return;
        }
        List o3 = o(false, false);
        int size = o3.size();
        for (int i3 = 0; i3 < size; i3++) {
            k kVar = (k) o3.get(i3);
            if (!kVar.l()) {
                for (Map.Entry entry : kVar.f6239d.f6230d.entrySet()) {
                    q qVar = (q) entry.getKey();
                    Object value = entry.getValue();
                    LinkedHashMap linkedHashMap = gVar.f6230d;
                    Object obj = linkedHashMap.get(qVar);
                    p2.g.c(qVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                    Object h = qVar.f6286b.h(obj, value);
                    if (h != null) {
                        linkedHashMap.put(qVar, h);
                    }
                }
                kVar.n(gVar);
            }
        }
    }

    public final List o(boolean z3, boolean z4) {
        if (this.f6240e) {
            return C0248s.f4255d;
        }
        ArrayList arrayList = new ArrayList();
        b(this.f6238c, arrayList, z4);
        if (z3) {
            q qVar = n.f6273q;
            g gVar = this.f6239d;
            LinkedHashMap linkedHashMap = gVar.f6230d;
            Object obj = linkedHashMap.get(qVar);
            if (obj == null) {
                obj = null;
            }
            e eVar = (e) obj;
            if (eVar != null && gVar.f6231e && !arrayList.isEmpty()) {
                arrayList.add(a(eVar, new C0065y(22, eVar)));
            }
            q qVar2 = n.f6258a;
            if (linkedHashMap.containsKey(qVar2) && !arrayList.isEmpty() && gVar.f6231e) {
                Object obj2 = linkedHashMap.get(qVar2);
                if (obj2 == null) {
                    obj2 = null;
                }
                List list = (List) obj2;
                String str = list != null ? (String) AbstractC0240k.b0(list) : null;
                if (str != null) {
                    arrayList.add(0, a(null, new C0549B(str, 1)));
                }
            }
        }
        return arrayList;
    }
}
