package A2;

import D2.AbstractC0071a;
import D2.u;
import D2.w;
import c2.C0174m;
import g2.InterfaceC0271d;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import y2.AbstractC0688v;
import y2.C0673f;
import y2.InterfaceC0672e;
import y2.p0;

/* loaded from: classes.dex */
public class b implements f {

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f224f = AtomicLongFieldUpdater.newUpdater(b.class, "sendersAndCloseStatus");

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f225g = AtomicLongFieldUpdater.newUpdater(b.class, "receivers");
    public static final AtomicLongFieldUpdater h = AtomicLongFieldUpdater.newUpdater(b.class, "bufferEnd");

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f226i = AtomicLongFieldUpdater.newUpdater(b.class, "completedExpandBuffersAndPauseFlag");

    /* renamed from: j, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f227j = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "sendSegment");

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f228k = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "receiveSegment");

    /* renamed from: l, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f229l = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "bufferEndSegment");

    /* renamed from: m, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f230m = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_closeCause");

    /* renamed from: n, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f231n = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "closeHandler");
    private volatile Object _closeCause;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;

    /* renamed from: d, reason: collision with root package name */
    public final int f232d;

    /* renamed from: e, reason: collision with root package name */
    public final o2.c f233e;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    public b(int i3, o2.c cVar) {
        this.f232d = i3;
        this.f233e = cVar;
        if (i3 < 0) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i3 + ", should be >=0").toString());
        }
        j jVar = d.f235a;
        this.bufferEnd = i3 != 0 ? i3 != Integer.MAX_VALUE ? i3 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag = h.get(this);
        j jVar2 = new j(0L, null, this, 3);
        this.sendSegment = jVar2;
        this.receiveSegment = jVar2;
        if (t()) {
            jVar2 = d.f235a;
            p2.g.c(jVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment = jVar2;
        this._closeCause = d.f252s;
    }

    public static final j b(b bVar, long j3, j jVar) {
        Object b3;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j4;
        long j5;
        bVar.getClass();
        j jVar2 = d.f235a;
        c cVar = c.f234l;
        loop0: while (true) {
            b3 = AbstractC0071a.b(jVar, j3, cVar);
            if (!AbstractC0071a.e(b3)) {
                u c3 = AbstractC0071a.c(b3);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f227j;
                    u uVar = (u) atomicReferenceFieldUpdater.get(bVar);
                    if (uVar.f1085f >= c3.f1085f) {
                        break loop0;
                    }
                    if (!c3.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(bVar, uVar, c3)) {
                        if (atomicReferenceFieldUpdater.get(bVar) != uVar) {
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
        boolean e3 = AbstractC0071a.e(b3);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f225g;
        if (e3) {
            bVar.i();
            if (jVar.f1085f * d.f236b >= atomicLongFieldUpdater2.get(bVar)) {
                return null;
            }
            jVar.a();
            return null;
        }
        j jVar3 = (j) AbstractC0071a.c(b3);
        long j6 = jVar3.f1085f;
        if (j6 <= j3) {
            return jVar3;
        }
        long j7 = d.f236b * j6;
        do {
            atomicLongFieldUpdater = f224f;
            j4 = atomicLongFieldUpdater.get(bVar);
            j5 = 1152921504606846975L & j4;
            if (j5 >= j7) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(bVar, j4, j5 + (((int) (j4 >> 60)) << 60)));
        if (j6 * d.f236b >= atomicLongFieldUpdater2.get(bVar)) {
            return null;
        }
        jVar3.a();
        return null;
    }

    public static final void d(b bVar, Object obj, C0673f c0673f) {
        B1.c a3;
        o2.c cVar = bVar.f233e;
        if (cVar != null && (a3 = AbstractC0071a.a(cVar, obj, null)) != null) {
            AbstractC0688v.h(c0673f.h, a3);
        }
        c0673f.t(Z0.d.q(bVar.n()));
    }

    public static final int e(b bVar, j jVar, int i3, Object obj, long j3, Object obj2, boolean z3) {
        bVar.getClass();
        jVar.m(i3, obj);
        if (z3) {
            return bVar.A(jVar, i3, obj, j3, obj2, z3);
        }
        Object k3 = jVar.k(i3);
        if (k3 == null) {
            if (bVar.f(j3)) {
                if (jVar.j(null, i3, d.f238d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (jVar.j(null, i3, obj2)) {
                    return 2;
                }
            }
        } else if (k3 instanceof p0) {
            jVar.m(i3, null);
            if (bVar.x(k3, obj)) {
                jVar.n(i3, d.f242i);
                return 0;
            }
            w wVar = d.f244k;
            if (jVar.f258i.getAndSet((i3 * 2) + 1, wVar) != wVar) {
                jVar.l(i3, true);
            }
            return 5;
        }
        return bVar.A(jVar, i3, obj, j3, obj2, z3);
    }

    public static void q(b bVar) {
        bVar.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = f226i;
        if ((atomicLongFieldUpdater.addAndGet(bVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(bVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public static boolean y(Object obj) {
        if (obj instanceof InterfaceC0672e) {
            p2.g.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return d.a((InterfaceC0672e) obj, C0174m.f3840a, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public final int A(j jVar, int i3, Object obj, long j3, Object obj2, boolean z3) {
        while (true) {
            Object k3 = jVar.k(i3);
            if (k3 == null) {
                if (!f(j3) || z3) {
                    if (z3) {
                        if (jVar.j(null, i3, d.f243j)) {
                            jVar.h();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (jVar.j(null, i3, obj2)) {
                            return 2;
                        }
                    }
                } else if (jVar.j(null, i3, d.f238d)) {
                    return 1;
                }
            } else {
                if (k3 != d.f239e) {
                    w wVar = d.f244k;
                    if (k3 == wVar) {
                        jVar.m(i3, null);
                        return 5;
                    }
                    if (k3 == d.h) {
                        jVar.m(i3, null);
                        return 5;
                    }
                    if (k3 == d.f245l) {
                        jVar.m(i3, null);
                        i();
                        return 4;
                    }
                    jVar.m(i3, null);
                    if (k3 instanceof r) {
                        k3 = ((r) k3).f261a;
                    }
                    if (x(k3, obj)) {
                        jVar.n(i3, d.f242i);
                        return 0;
                    }
                    if (jVar.f258i.getAndSet((i3 * 2) + 1, wVar) == wVar) {
                        return 5;
                    }
                    jVar.l(i3, true);
                    return 5;
                }
                if (jVar.j(k3, i3, d.f238d)) {
                    return 1;
                }
            }
        }
    }

    @Override // A2.p
    public final void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        g(cancellationException, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:?, code lost:
    
        return r1;
     */
    @Override // A2.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A2.b.c(java.lang.Object):java.lang.Object");
    }

    public final boolean f(long j3) {
        return j3 < h.get(this) || j3 < f225g.get(this) + ((long) this.f232d);
    }

    public final boolean g(Throwable th, boolean z3) {
        boolean z4;
        long j3;
        long j4;
        long j5;
        Object obj;
        long j6;
        long j7;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f224f;
        if (z3) {
            do {
                j7 = atomicLongFieldUpdater.get(this);
                if (((int) (j7 >> 60)) != 0) {
                    break;
                }
                j jVar = d.f235a;
            } while (!atomicLongFieldUpdater.compareAndSet(this, j7, (1 << 60) + (j7 & 1152921504606846975L)));
        }
        w wVar = d.f252s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f230m;
            if (atomicReferenceFieldUpdater.compareAndSet(this, wVar, th)) {
                z4 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != wVar) {
                z4 = false;
                break;
            }
        }
        if (z3) {
            do {
                j6 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(this, j6, (3 << 60) + (j6 & 1152921504606846975L)));
        } else {
            do {
                j3 = atomicLongFieldUpdater.get(this);
                int i3 = (int) (j3 >> 60);
                if (i3 == 0) {
                    j4 = j3 & 1152921504606846975L;
                    j5 = 2;
                } else {
                    if (i3 != 1) {
                        break;
                    }
                    j4 = j3 & 1152921504606846975L;
                    j5 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(this, j3, (j5 << 60) + j4));
        }
        i();
        if (z4) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f231n;
                obj = atomicReferenceFieldUpdater2.get(this);
                w wVar2 = obj == null ? d.f250q : d.f251r;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, wVar2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
            }
            if (obj != null) {
                p2.r.c(1, obj);
                ((o2.c) obj).i(m());
            }
        }
        return z4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008f, code lost:
    
        r1 = (A2.j) ((D2.c) D2.c.f1050e.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final A2.j h(long r13) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A2.b.h(long):A2.j");
    }

    public final void i() {
        r(f224f.get(this), false);
    }

    public final void j(long j3) {
        B1.c a3;
        j jVar = (j) f228k.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f225g;
            long j4 = atomicLongFieldUpdater.get(this);
            if (j3 < Math.max(this.f232d + j4, h.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j4, j4 + 1)) {
                long j5 = d.f236b;
                long j6 = j4 / j5;
                int i3 = (int) (j4 % j5);
                if (jVar.f1085f != j6) {
                    j l3 = l(j6, jVar);
                    if (l3 == null) {
                        continue;
                    } else {
                        jVar = l3;
                    }
                }
                Object z3 = z(jVar, i3, j4, null);
                if (z3 != d.f248o) {
                    jVar.a();
                    o2.c cVar = this.f233e;
                    if (cVar != null && (a3 = AbstractC0071a.a(cVar, z3, null)) != null) {
                        throw a3;
                    }
                } else if (j4 < o()) {
                    jVar.a();
                }
            }
        }
    }

    public final void k() {
        Object b3;
        if (t()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f229l;
        j jVar = (j) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = h.getAndIncrement(this);
            long j3 = andIncrement / d.f236b;
            if (o() <= andIncrement) {
                if (jVar.f1085f < j3 && jVar.b() != null) {
                    u(j3, jVar);
                }
                q(this);
                return;
            }
            if (jVar.f1085f != j3) {
                c cVar = c.f234l;
                while (true) {
                    b3 = AbstractC0071a.b(jVar, j3, cVar);
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
                j jVar2 = null;
                if (AbstractC0071a.e(b3)) {
                    i();
                    u(j3, jVar);
                    q(this);
                } else {
                    j jVar3 = (j) AbstractC0071a.c(b3);
                    long j4 = jVar3.f1085f;
                    if (j4 > j3) {
                        long j5 = j4 * d.f236b;
                        if (h.compareAndSet(this, andIncrement + 1, j5)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f226i;
                            if ((atomicLongFieldUpdater.addAndGet(this, j5 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            q(this);
                        }
                    } else {
                        jVar2 = jVar3;
                    }
                }
                if (jVar2 == null) {
                    continue;
                } else {
                    jVar = jVar2;
                }
            }
            int i3 = (int) (andIncrement % d.f236b);
            Object k3 = jVar.k(i3);
            boolean z3 = k3 instanceof p0;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f225g;
            if (!z3 || andIncrement < atomicLongFieldUpdater2.get(this) || !jVar.j(k3, i3, d.f241g)) {
                while (true) {
                    Object k4 = jVar.k(i3);
                    if (!(k4 instanceof p0)) {
                        if (k4 != d.f243j) {
                            if (k4 != null) {
                                if (k4 == d.f238d || k4 == d.h || k4 == d.f242i || k4 == d.f244k || k4 == d.f245l) {
                                    break loop0;
                                }
                                if (k4 != d.f240f) {
                                    throw new IllegalStateException(("Unexpected cell state: " + k4).toString());
                                }
                            } else if (jVar.j(k4, i3, d.f239e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                        if (jVar.j(k4, i3, new r((p0) k4))) {
                            break loop0;
                        }
                    } else if (jVar.j(k4, i3, d.f241g)) {
                        if (y(k4)) {
                            jVar.n(i3, d.f238d);
                            break;
                        } else {
                            jVar.n(i3, d.f243j);
                            jVar.h();
                        }
                    }
                }
            } else if (y(k3)) {
                jVar.n(i3, d.f238d);
                break;
            } else {
                jVar.n(i3, d.f243j);
                jVar.h();
                q(this);
            }
        }
        q(this);
    }

    public final j l(long j3, j jVar) {
        Object b3;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j4;
        j jVar2 = d.f235a;
        c cVar = c.f234l;
        loop0: while (true) {
            b3 = AbstractC0071a.b(jVar, j3, cVar);
            if (!AbstractC0071a.e(b3)) {
                u c3 = AbstractC0071a.c(b3);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f228k;
                    u uVar = (u) atomicReferenceFieldUpdater.get(this);
                    if (uVar.f1085f >= c3.f1085f) {
                        break loop0;
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
        if (AbstractC0071a.e(b3)) {
            i();
            if (jVar.f1085f * d.f236b >= o()) {
                return null;
            }
            jVar.a();
            return null;
        }
        j jVar3 = (j) AbstractC0071a.c(b3);
        boolean t3 = t();
        long j5 = jVar3.f1085f;
        if (!t3 && j3 <= h.get(this) / d.f236b) {
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f229l;
                u uVar2 = (u) atomicReferenceFieldUpdater2.get(this);
                if (uVar2.f1085f >= j5 || !jVar3.i()) {
                    break;
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, uVar2, jVar3)) {
                    if (atomicReferenceFieldUpdater2.get(this) != uVar2) {
                        if (jVar3.e()) {
                            jVar3.d();
                        }
                    }
                }
                if (uVar2.e()) {
                    uVar2.d();
                }
            }
        }
        if (j5 <= j3) {
            return jVar3;
        }
        long j6 = d.f236b * j5;
        do {
            atomicLongFieldUpdater = f225g;
            j4 = atomicLongFieldUpdater.get(this);
            if (j4 >= j6) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j4, j6));
        if (j5 * d.f236b >= o()) {
            return null;
        }
        jVar3.a();
        return null;
    }

    public final Throwable m() {
        return (Throwable) f230m.get(this);
    }

    public final Throwable n() {
        Throwable m2 = m();
        return m2 == null ? new l("Channel was closed") : m2;
    }

    public final long o() {
        return f224f.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ee, code lost:
    
        r5 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f2, code lost:
    
        d(r26, r28, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f5, code lost:
    
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00fa, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00fb, code lost:
    
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01c8, code lost:
    
        r2.C();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01cb, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x014c, code lost:
    
        if (r24 >= r5.get(r26)) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x014e, code lost:
    
        r19.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0151, code lost:
    
        r2 = r27;
        r1 = r28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [y2.f] */
    @Override // A2.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object p(g2.InterfaceC0271d r27, java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A2.b.p(g2.d, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x00c6, code lost:
    
        r0 = (A2.j) ((D2.c) D2.c.f1050e.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean r(long r19, boolean r21) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A2.b.r(long, boolean):boolean");
    }

    public boolean s() {
        return false;
    }

    public final boolean t() {
        long j3 = h.get(this);
        return j3 == 0 || j3 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x019a, code lost:
    
        r3 = (A2.j) r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01a1, code lost:
    
        if (r3 != null) goto L86;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A2.b.toString():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(long r5, A2.j r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.f1085f
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            D2.c r0 = r7.b()
            A2.j r0 = (A2.j) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.c()
            if (r5 == 0) goto L22
            D2.c r5 = r7.b()
            A2.j r5 = (A2.j) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = A2.b.f229l
            java.lang.Object r6 = r5.get(r4)
            D2.u r6 = (D2.u) r6
            long r0 = r6.f1085f
            long r2 = r7.f1085f
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r7.i()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = r5.compareAndSet(r4, r6, r7)
            if (r0 == 0) goto L4a
            boolean r5 = r6.e()
            if (r5 == 0) goto L49
            r6.d()
        L49:
            return
        L4a:
            java.lang.Object r0 = r5.get(r4)
            if (r0 == r6) goto L3a
            boolean r5 = r7.e()
            if (r5 == 0) goto L22
            r7.d()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: A2.b.u(long, A2.j):void");
    }

    public final Object v(InterfaceC0271d interfaceC0271d, Object obj) {
        B1.c a3;
        C0673f c0673f = new C0673f(1, Z.b.z(interfaceC0271d));
        c0673f.u();
        o2.c cVar = this.f233e;
        if (cVar == null || (a3 = AbstractC0071a.a(cVar, obj, null)) == null) {
            c0673f.t(Z0.d.q(n()));
        } else {
            Z0.d.f(a3, n());
            c0673f.t(Z0.d.q(a3));
        }
        Object s3 = c0673f.s();
        return s3 == h2.a.f4407d ? s3 : C0174m.f3840a;
    }

    public final void w(p0 p0Var, boolean z3) {
        Throwable n2;
        if (p0Var instanceof InterfaceC0672e) {
            InterfaceC0271d interfaceC0271d = (InterfaceC0271d) p0Var;
            if (z3) {
                n2 = m();
                if (n2 == null) {
                    n2 = new k("Channel was closed");
                }
            } else {
                n2 = n();
            }
            interfaceC0271d.t(Z0.d.q(n2));
            return;
        }
        if (!(p0Var instanceof a)) {
            throw new IllegalStateException(("Unexpected waiter: " + p0Var).toString());
        }
        a aVar = (a) p0Var;
        C0673f c0673f = aVar.f222e;
        p2.g.b(c0673f);
        aVar.f222e = null;
        aVar.f221d = d.f245l;
        Throwable m2 = aVar.f223f.m();
        if (m2 == null) {
            c0673f.t(Boolean.FALSE);
        } else {
            c0673f.t(Z0.d.q(m2));
        }
    }

    public final boolean x(Object obj, Object obj2) {
        if (!(obj instanceof a)) {
            if (!(obj instanceof InterfaceC0672e)) {
                throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
            }
            p2.g.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            InterfaceC0672e interfaceC0672e = (InterfaceC0672e) obj;
            o2.c cVar = this.f233e;
            return d.a(interfaceC0672e, obj2, cVar != null ? new D2.p(cVar, obj2, interfaceC0672e.o(), 0) : null);
        }
        p2.g.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        a aVar = (a) obj;
        C0673f c0673f = aVar.f222e;
        p2.g.b(c0673f);
        aVar.f222e = null;
        aVar.f221d = obj2;
        Boolean bool = Boolean.TRUE;
        o2.c cVar2 = aVar.f223f.f233e;
        return d.a(c0673f, bool, cVar2 != null ? new D2.p(cVar2, obj2, c0673f.h, 0) : null);
    }

    public final Object z(j jVar, int i3, long j3, a aVar) {
        Object k3 = jVar.k(i3);
        AtomicReferenceArray atomicReferenceArray = jVar.f258i;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f224f;
        if (k3 == null) {
            if (j3 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (aVar == null) {
                    return d.f247n;
                }
                if (jVar.j(k3, i3, aVar)) {
                    k();
                    return d.f246m;
                }
            }
        } else if (k3 == d.f238d && jVar.j(k3, i3, d.f242i)) {
            k();
            Object obj = atomicReferenceArray.get(i3 * 2);
            jVar.m(i3, null);
            return obj;
        }
        while (true) {
            Object k4 = jVar.k(i3);
            if (k4 == null || k4 == d.f239e) {
                if (j3 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (jVar.j(k4, i3, d.h)) {
                        k();
                        return d.f248o;
                    }
                } else {
                    if (aVar == null) {
                        return d.f247n;
                    }
                    if (jVar.j(k4, i3, aVar)) {
                        k();
                        return d.f246m;
                    }
                }
            } else {
                if (k4 != d.f238d) {
                    w wVar = d.f243j;
                    if (k4 != wVar && k4 != d.h) {
                        if (k4 == d.f245l) {
                            k();
                            return d.f248o;
                        }
                        if (k4 != d.f241g && jVar.j(k4, i3, d.f240f)) {
                            boolean z3 = k4 instanceof r;
                            if (z3) {
                                k4 = ((r) k4).f261a;
                            }
                            if (y(k4)) {
                                jVar.n(i3, d.f242i);
                                k();
                                Object obj2 = atomicReferenceArray.get(i3 * 2);
                                jVar.m(i3, null);
                                return obj2;
                            }
                            jVar.n(i3, wVar);
                            jVar.h();
                            if (z3) {
                                k();
                            }
                            return d.f248o;
                        }
                    }
                    return d.f248o;
                }
                if (jVar.j(k4, i3, d.f242i)) {
                    k();
                    Object obj3 = atomicReferenceArray.get(i3 * 2);
                    jVar.m(i3, null);
                    return obj3;
                }
            }
        }
    }
}
