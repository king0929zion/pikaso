package z1;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: z1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0729c implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7009d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f7010e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0733g f7011f;

    public /* synthetic */ RunnableC0729c(C0733g c0733g, ArrayList arrayList, int i3) {
        this.f7009d = i3;
        this.f7011f = c0733g;
        this.f7010e = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7009d) {
            case 0:
                ArrayList arrayList = this.f7010e;
                Iterator it = arrayList.iterator();
                boolean hasNext = it.hasNext();
                C0733g c0733g = this.f7011f;
                if (hasNext) {
                    ((AbstractC0732f) it.next()).getClass();
                    c0733g.getClass();
                    throw null;
                }
                arrayList.clear();
                c0733g.f7021m.remove(arrayList);
                return;
            case 1:
                ArrayList arrayList2 = this.f7010e;
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    boolean hasNext2 = it2.hasNext();
                    C0733g c0733g2 = this.f7011f;
                    if (!hasNext2) {
                        arrayList2.clear();
                        c0733g2.f7022n.remove(arrayList2);
                        return;
                    } else {
                        AbstractC0731e abstractC0731e = (AbstractC0731e) it2.next();
                        c0733g2.getClass();
                        abstractC0731e.getClass();
                    }
                }
            default:
                ArrayList arrayList3 = this.f7010e;
                Iterator it3 = arrayList3.iterator();
                boolean hasNext3 = it3.hasNext();
                C0733g c0733g3 = this.f7011f;
                if (!hasNext3) {
                    arrayList3.clear();
                    c0733g3.f7020l.remove(arrayList3);
                    return;
                } else {
                    I i3 = (I) it3.next();
                    c0733g3.getClass();
                    i3.getClass();
                    throw null;
                }
        }
    }
}
