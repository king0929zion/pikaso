package L;

import D.C0052n;
import D.C0053n0;
import D.C0060t;
import D.C0061u;
import c2.InterfaceC0164c;
import java.io.Serializable;
import java.util.ArrayList;
import o2.g;
import p2.h;
import p2.r;

/* loaded from: classes.dex */
public final class a implements o2.e, o2.f, g, InterfaceC0164c {

    /* renamed from: d, reason: collision with root package name */
    public final int f1440d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1441e;

    /* renamed from: f, reason: collision with root package name */
    public h f1442f;

    /* renamed from: g, reason: collision with root package name */
    public C0053n0 f1443g;
    public ArrayList h;

    public a(int i3, boolean z3, h hVar) {
        this.f1440d = i3;
        this.f1441e = z3;
        this.f1442f = hVar;
    }

    @Override // o2.f
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Serializable serializable) {
        return b(obj, (C0052n) obj2, ((Number) serializable).intValue());
    }

    public final Object b(Object obj, C0052n c0052n, int i3) {
        c0052n.O(this.f1440d);
        d(c0052n);
        int a3 = c0052n.f(this) ? b.a(2, 1) : b.a(1, 1);
        InterfaceC0164c interfaceC0164c = this.f1442f;
        r.c(3, interfaceC0164c);
        Object a4 = ((o2.f) interfaceC0164c).a(obj, c0052n, Integer.valueOf(a3 | i3));
        C0053n0 s3 = c0052n.s();
        if (s3 != null) {
            s3.f834d = new C0061u(this, obj, i3);
        }
        return a4;
    }

    public final void d(C0052n c0052n) {
        C0053n0 w3;
        if (!this.f1441e || (w3 = c0052n.w()) == null) {
            return;
        }
        w3.f831a |= 1;
        if (b.c(this.f1443g, w3)) {
            this.f1443g = w3;
            return;
        }
        ArrayList arrayList = this.h;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.h = arrayList2;
            arrayList2.add(w3);
            return;
        }
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (b.c((C0053n0) arrayList.get(i3), w3)) {
                arrayList.set(i3, w3);
                return;
            }
        }
        arrayList.add(w3);
    }

    public final void f(h hVar) {
        if (this.f1442f.equals(hVar)) {
            return;
        }
        this.f1442f = hVar;
        if (this.f1441e) {
            C0053n0 c0053n0 = this.f1443g;
            if (c0053n0 != null) {
                C0060t c0060t = c0053n0.f832b;
                if (c0060t != null) {
                    c0060t.m(c0053n0, null);
                }
                this.f1443g = null;
            }
            ArrayList arrayList = this.h;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    C0053n0 c0053n02 = (C0053n0) arrayList.get(i3);
                    C0060t c0060t2 = c0053n02.f832b;
                    if (c0060t2 != null) {
                        c0060t2.m(c0053n02, null);
                    }
                }
                arrayList.clear();
            }
        }
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        C0052n c0052n = (C0052n) obj;
        int intValue = ((Number) obj2).intValue();
        c0052n.O(this.f1440d);
        d(c0052n);
        int a3 = intValue | (c0052n.f(this) ? b.a(2, 0) : b.a(1, 0));
        InterfaceC0164c interfaceC0164c = this.f1442f;
        r.c(2, interfaceC0164c);
        Object h = ((o2.e) interfaceC0164c).h(c0052n, Integer.valueOf(a3));
        C0053n0 s3 = c0052n.s();
        if (s3 != null) {
            r.c(2, this);
            s3.f834d = this;
        }
        return h;
    }
}
