package s0;

import D.C0032d;
import D.C0037f0;
import F.d;
import Z.b;
import android.view.ScrollCaptureTarget;
import android.view.View;
import g2.InterfaceC0276i;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Consumer;
import n0.Y;
import o2.c;
import p2.g;
import t0.f;
import t0.k;
import t0.l;
import t0.n;
import t0.q;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final C0037f0 f6123a = C0032d.A(Boolean.FALSE);

    public final void a(View view, l lVar, InterfaceC0276i interfaceC0276i, Consumer<ScrollCaptureTarget> consumer) {
        c[] cVarArr = new c[16];
        k a3 = lVar.a();
        d dVar = new d(new k[16]);
        List g3 = a3.g(false, false, false);
        while (true) {
            dVar.d(dVar.f1160f, g3);
            while (dVar.k()) {
                k kVar = (k) dVar.m(dVar.f1160f - 1);
                Y c3 = kVar.c();
                if (!(c3 != null ? c3.x0() : false)) {
                    q qVar = n.f6269m;
                    LinkedHashMap linkedHashMap = kVar.f6239d.f6230d;
                    if (!linkedHashMap.containsKey(qVar) && !linkedHashMap.containsKey(n.f6265i)) {
                        Y c4 = kVar.c();
                        if (c4 == null) {
                            Z0.d.T("Expected semantics node to have a coordinator.");
                            throw null;
                        }
                        V.d l3 = Z0.d.l(c4);
                        int round = Math.round(l3.f2446a);
                        int round2 = Math.round(l3.f2447b);
                        int round3 = Math.round(l3.f2448c);
                        int round4 = Math.round(l3.f2449d);
                        if (round < round3 && round2 < round4) {
                            Object obj = linkedHashMap.get(f.f6210e);
                            if (obj == null) {
                                obj = null;
                            }
                            Object obj2 = linkedHashMap.get(n.f6272p);
                            if ((obj2 != null ? obj2 : null) != null) {
                                throw new ClassCastException();
                            }
                            g3 = kVar.g(false, false, false);
                        }
                    }
                }
            }
            final o2.c[] cVarArr2 = {a.f6120f, a.f6121g};
            Arrays.sort(cVarArr, 0, 0, new Comparator() { // from class: f2.a
                @Override // java.util.Comparator
                public final int compare(Object obj3, Object obj4) {
                    c[] cVarArr3 = cVarArr2;
                    g.e(cVarArr3, "$selectors");
                    for (c cVar : cVarArr3) {
                        int l4 = b.l((Comparable) cVar.i(obj3), (Comparable) cVar.i(obj4));
                        if (l4 != 0) {
                            return l4;
                        }
                    }
                    return 0;
                }
            });
            return;
        }
    }
}
