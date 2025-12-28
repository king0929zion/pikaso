package z1;

import A.AbstractC0000a;
import java.util.ArrayList;

/* renamed from: z1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0733g extends t {

    /* renamed from: g, reason: collision with root package name */
    public boolean f7016g;
    public ArrayList h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f7017i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f7018j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f7019k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f7020l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f7021m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f7022n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f7023o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f7024p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f7025q;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f7026r;

    public static void e(ArrayList arrayList) {
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        ((I) arrayList.get(size)).getClass();
        throw null;
    }

    @Override // z1.t
    public final void b(I i3) {
        i3.getClass();
        throw null;
    }

    @Override // z1.t
    public final void c() {
        ArrayList arrayList = this.f7018j;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            ((AbstractC0732f) arrayList.get(size)).getClass();
            throw null;
        }
        ArrayList arrayList2 = this.h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            a((I) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f7017i;
        int size3 = arrayList3.size() - 1;
        if (size3 >= 0) {
            ((I) arrayList3.get(size3)).getClass();
            throw null;
        }
        ArrayList arrayList4 = this.f7019k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            ((AbstractC0731e) arrayList4.get(size4)).getClass();
        }
        arrayList4.clear();
        if (d()) {
            ArrayList arrayList5 = this.f7021m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                int size6 = arrayList6.size() - 1;
                if (size6 >= 0) {
                    ((AbstractC0732f) arrayList6.get(size6)).getClass();
                    throw null;
                }
            }
            ArrayList arrayList7 = this.f7020l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                int size8 = arrayList8.size() - 1;
                if (size8 >= 0) {
                    ((I) arrayList8.get(size8)).getClass();
                    throw null;
                }
            }
            ArrayList arrayList9 = this.f7022n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    ((AbstractC0731e) arrayList10.get(size10)).getClass();
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            e(this.f7025q);
            e(this.f7024p);
            e(this.f7023o);
            e(this.f7026r);
            ArrayList arrayList11 = this.f7074b;
            if (arrayList11.size() > 0) {
                AbstractC0000a.j(arrayList11.get(0));
                throw null;
            }
            arrayList11.clear();
        }
    }

    @Override // z1.t
    public final boolean d() {
        return (this.f7017i.isEmpty() && this.f7019k.isEmpty() && this.f7018j.isEmpty() && this.h.isEmpty() && this.f7024p.isEmpty() && this.f7025q.isEmpty() && this.f7023o.isEmpty() && this.f7026r.isEmpty() && this.f7021m.isEmpty() && this.f7020l.isEmpty() && this.f7022n.isEmpty()) ? false : true;
    }

    public final void f() {
        if (d()) {
            return;
        }
        ArrayList arrayList = this.f7074b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            AbstractC0000a.j(arrayList.get(0));
            throw null;
        }
    }

    public final void g(ArrayList arrayList, I i3) {
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        ((AbstractC0731e) arrayList.get(size)).getClass();
        i3.getClass();
        throw null;
    }
}
