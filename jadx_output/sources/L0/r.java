package l0;

import D.C0065y;
import a.AbstractC0090a;
import d2.C0249t;
import java.util.ArrayList;
import java.util.List;
import n0.AbstractC0418L;
import n0.AbstractC0442x;

/* loaded from: classes.dex */
public final class r extends AbstractC0442x {

    /* renamed from: a, reason: collision with root package name */
    public static final r f4936a = new r();

    @Override // l0.InterfaceC0361k
    public final M1.j f(AbstractC0418L abstractC0418L, List list, long j3) {
        boolean isEmpty = list.isEmpty();
        C0249t c0249t = C0249t.f4256d;
        if (isEmpty) {
            return abstractC0418L.b0(G0.a.j(j3), G0.a.i(j3), c0249t, p.f4932g);
        }
        if (list.size() == 1) {
            o a3 = ((InterfaceC0360j) list.get(0)).a(j3);
            return abstractC0418L.b0(AbstractC0090a.p(j3, a3.f4927d), AbstractC0090a.o(j3, a3.f4928e), c0249t, new T.b(a3, 1));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(((InterfaceC0360j) list.get(i3)).a(j3));
        }
        int size2 = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < size2; i6++) {
            o oVar = (o) arrayList.get(i6);
            i4 = Math.max(oVar.f4927d, i4);
            i5 = Math.max(oVar.f4928e, i5);
        }
        return abstractC0418L.b0(AbstractC0090a.p(j3, i4), AbstractC0090a.o(j3, i5), c0249t, new C0065y(13, arrayList));
    }
}
