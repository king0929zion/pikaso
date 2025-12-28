package G2;

import D.C0065y;
import D2.AbstractC0071a;
import D2.u;
import D2.w;
import c2.C0174m;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import y2.InterfaceC0672e;

/* loaded from: classes.dex */
public class h {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1291b = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "head");

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1292c = AtomicLongFieldUpdater.newUpdater(h.class, "deqIdx");

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1293d = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "tail");

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1294e = AtomicLongFieldUpdater.newUpdater(h.class, "enqIdx");

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1295f = AtomicIntegerFieldUpdater.newUpdater(h.class, "_availablePermits");
    private volatile int _availablePermits;

    /* renamed from: a, reason: collision with root package name */
    public final C0065y f1296a;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private volatile Object head;
    private volatile Object tail;

    public h(int i3) {
        if (i3 < 0 || i3 > 1) {
            throw new IllegalArgumentException("The number of acquired permits should be in 0..1".toString());
        }
        j jVar = new j(0L, null, 2);
        this.head = jVar;
        this.tail = jVar;
        this._availablePermits = 1 - i3;
        this.f1296a = new C0065y(3, this);
    }

    public final void a(c cVar) {
        Object b3;
        f fVar;
        long j3;
        while (true) {
            int andDecrement = f1295f.getAndDecrement(this);
            if (andDecrement <= 1) {
                Object obj = C0174m.f3840a;
                o2.c cVar2 = this.f1296a;
                if (andDecrement > 0) {
                    cVar.g(obj, cVar2);
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1293d;
                j jVar = (j) atomicReferenceFieldUpdater.get(this);
                long andIncrement = f1294e.getAndIncrement(this);
                f fVar2 = f.f1289l;
                long j4 = andIncrement / i.f1302f;
                while (true) {
                    b3 = AbstractC0071a.b(jVar, j4, fVar2);
                    if (!AbstractC0071a.e(b3)) {
                        u c3 = AbstractC0071a.c(b3);
                        while (true) {
                            u uVar = (u) atomicReferenceFieldUpdater.get(this);
                            fVar = fVar2;
                            j3 = j4;
                            if (uVar.f1085f >= c3.f1085f) {
                                break;
                            }
                            if (!c3.i()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, c3)) {
                                if (atomicReferenceFieldUpdater.get(this) != uVar) {
                                    if (c3.e()) {
                                        c3.d();
                                    }
                                    fVar2 = fVar;
                                    j4 = j3;
                                }
                            }
                            if (uVar.e()) {
                                uVar.d();
                            }
                        }
                    } else {
                        break;
                    }
                    fVar2 = fVar;
                    j4 = j3;
                }
                j jVar2 = (j) AbstractC0071a.c(b3);
                int i3 = (int) (andIncrement % i.f1302f);
                AtomicReferenceArray atomicReferenceArray = jVar2.h;
                while (!atomicReferenceArray.compareAndSet(i3, null, cVar)) {
                    if (atomicReferenceArray.get(i3) != null) {
                        w wVar = i.f1298b;
                        w wVar2 = i.f1299c;
                        while (!atomicReferenceArray.compareAndSet(i3, wVar, wVar2)) {
                            if (atomicReferenceArray.get(i3) != wVar) {
                                break;
                            }
                        }
                        cVar.g(obj, cVar2);
                        return;
                    }
                }
                cVar.a(jVar2, i3);
                return;
            }
        }
    }

    public final void b() {
        boolean z3;
        int i3;
        Object b3;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1295f;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            z3 = true;
            if (andIncrement >= 1) {
                do {
                    i3 = atomicIntegerFieldUpdater.get(this);
                    if (i3 <= 1) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 1));
                throw new IllegalStateException("The number of released permits cannot be greater than 1".toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1291b;
            j jVar = (j) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f1292c.getAndIncrement(this);
            long j3 = andIncrement2 / i.f1302f;
            g gVar = g.f1290l;
            while (true) {
                b3 = AbstractC0071a.b(jVar, j3, gVar);
                if (!AbstractC0071a.e(b3)) {
                    u c3 = AbstractC0071a.c(b3);
                    while (true) {
                        u uVar = (u) atomicReferenceFieldUpdater.get(this);
                        if (uVar.f1085f >= c3.f1085f) {
                            break;
                        }
                        if (!c3.i()) {
                            break;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, c3)) {
                            if (atomicReferenceFieldUpdater.get(this) != uVar) {
                                if (c3.e()) {
                                    c3.d();
                                }
                            }
                        }
                        if (uVar.e()) {
                            uVar.d();
                        }
                    }
                } else {
                    break;
                }
            }
            j jVar2 = (j) AbstractC0071a.c(b3);
            jVar2.a();
            boolean z4 = false;
            if (jVar2.f1085f <= j3) {
                int i4 = (int) (andIncrement2 % i.f1302f);
                w wVar = i.f1298b;
                AtomicReferenceArray atomicReferenceArray = jVar2.h;
                Object andSet = atomicReferenceArray.getAndSet(i4, wVar);
                if (andSet == null) {
                    int i5 = i.f1297a;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= i5) {
                            w wVar2 = i.f1298b;
                            w wVar3 = i.f1300d;
                            while (true) {
                                if (atomicReferenceArray.compareAndSet(i4, wVar2, wVar3)) {
                                    z4 = true;
                                    break;
                                } else if (atomicReferenceArray.get(i4) != wVar2) {
                                    break;
                                }
                            }
                            z3 = true ^ z4;
                        } else if (atomicReferenceArray.get(i4) == i.f1299c) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                } else if (andSet != i.f1301e) {
                    if (!(andSet instanceof InterfaceC0672e)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    InterfaceC0672e interfaceC0672e = (InterfaceC0672e) andSet;
                    w d3 = interfaceC0672e.d(C0174m.f3840a, this.f1296a);
                    if (d3 != null) {
                        interfaceC0672e.w(d3);
                    }
                }
            }
            z3 = false;
        } while (!z3);
    }
}
