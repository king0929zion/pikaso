package y2;

import d2.C0238i;
import g2.InterfaceC0276i;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public abstract class I extends J implements InterfaceC0691y {

    /* renamed from: j, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f6759j = AtomicReferenceFieldUpdater.newUpdater(I.class, Object.class, "_queue");

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f6760k = AtomicReferenceFieldUpdater.newUpdater(I.class, Object.class, "_delayed");

    /* renamed from: l, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f6761l = AtomicIntegerFieldUpdater.newUpdater(I.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    public void A(Runnable runnable) {
        if (!B(runnable)) {
            RunnableC0689w.f6828m.A(runnable);
            return;
        }
        Thread o3 = o();
        if (Thread.currentThread() != o3) {
            LockSupport.unpark(o3);
        }
    }

    public final boolean B(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6759j;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f6761l.get(this) != 0) {
                return false;
            }
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                return true;
            }
            if (!(obj instanceof D2.n)) {
                if (obj == AbstractC0688v.f6821c) {
                    return false;
                }
                D2.n nVar = new D2.n(8, true);
                nVar.a((Runnable) obj);
                nVar.a(runnable);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return true;
            }
            D2.n nVar2 = (D2.n) obj;
            int a3 = nVar2.a(runnable);
            if (a3 == 0) {
                return true;
            }
            if (a3 == 1) {
                D2.n c3 = nVar2.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c3) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else if (a3 == 2) {
                return false;
            }
        }
    }

    public final boolean C() {
        C0238i c0238i = this.h;
        if (!(c0238i != null ? c0238i.isEmpty() : true)) {
            return false;
        }
        H h = (H) f6760k.get(this);
        if (h != null && D2.z.f1093b.get(h) != 0) {
            return false;
        }
        Object obj = f6759j.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof D2.n) {
            long j3 = D2.n.f1072f.get((D2.n) obj);
            if (((int) (1073741823 & j3)) == ((int) ((j3 & 1152921503533105152L) >> 30))) {
                return true;
            }
        } else if (obj == AbstractC0688v.f6821c) {
            return true;
        }
        return false;
    }

    public final void D(long j3, G g3) {
        int a3;
        Thread o3;
        boolean z3 = f6761l.get(this) != 0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6760k;
        if (z3) {
            a3 = 1;
        } else {
            H h = (H) atomicReferenceFieldUpdater.get(this);
            if (h == null) {
                H h3 = new H();
                h3.f6758c = j3;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, h3) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                p2.g.b(obj);
                h = (H) obj;
            }
            a3 = g3.a(j3, h, this);
        }
        if (a3 != 0) {
            if (a3 == 1) {
                y(j3, g3);
                return;
            } else {
                if (a3 != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        H h4 = (H) atomicReferenceFieldUpdater.get(this);
        if (h4 != null) {
            synchronized (h4) {
                G[] gArr = h4.f1094a;
                r4 = gArr != null ? gArr[0] : null;
            }
        }
        if (r4 != g3 || Thread.currentThread() == (o3 = o())) {
            return;
        }
        LockSupport.unpark(o3);
    }

    @Override // y2.InterfaceC0691y
    public final void c(long j3, C0673f c0673f) {
        long j4 = j3 > 0 ? j3 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j3 : 0L;
        if (j4 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            F f3 = new F(this, j4 + nanoTime, c0673f);
            D(nanoTime, f3);
            c0673f.x(new D(0, f3));
        }
    }

    @Override // y2.r
    public final void d(InterfaceC0276i interfaceC0276i, Runnable runnable) {
        A(runnable);
    }

    @Override // y2.J
    public final long w() {
        Runnable runnable;
        G g3;
        G b3;
        if (x()) {
            return 0L;
        }
        H h = (H) f6760k.get(this);
        if (h != null && D2.z.f1093b.get(h) != 0) {
            long nanoTime = System.nanoTime();
            do {
                synchronized (h) {
                    try {
                        G[] gArr = h.f1094a;
                        G g4 = gArr != null ? gArr[0] : null;
                        if (g4 == null) {
                            b3 = null;
                        } else {
                            b3 = ((nanoTime - g4.f6756d) > 0L ? 1 : ((nanoTime - g4.f6756d) == 0L ? 0 : -1)) >= 0 ? B(g4) : false ? h.b(0) : null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } while (b3 != null);
        }
        loop1: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6759j;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                break;
            }
            if (!(obj instanceof D2.n)) {
                if (obj != AbstractC0688v.f6821c) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    runnable = (Runnable) obj;
                    break loop1;
                }
                break;
            }
            D2.n nVar = (D2.n) obj;
            Object d3 = nVar.d();
            if (d3 != D2.n.f1073g) {
                runnable = (Runnable) d3;
                break;
            }
            D2.n c3 = nVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c3) && atomicReferenceFieldUpdater.get(this) == obj) {
            }
        }
        runnable = null;
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        C0238i c0238i = this.h;
        if (((c0238i == null || c0238i.isEmpty()) ? Long.MAX_VALUE : 0L) == 0) {
            return 0L;
        }
        Object obj2 = f6759j.get(this);
        if (obj2 != null) {
            if (!(obj2 instanceof D2.n)) {
                if (obj2 != AbstractC0688v.f6821c) {
                    return 0L;
                }
                return Long.MAX_VALUE;
            }
            long j3 = D2.n.f1072f.get((D2.n) obj2);
            if (!(((int) (1073741823 & j3)) == ((int) ((j3 & 1152921503533105152L) >> 30)))) {
                return 0L;
            }
        }
        H h3 = (H) f6760k.get(this);
        if (h3 != null) {
            synchronized (h3) {
                G[] gArr2 = h3.f1094a;
                g3 = gArr2 != null ? gArr2[0] : null;
            }
            if (g3 != null) {
                long nanoTime2 = g3.f6756d - System.nanoTime();
                if (nanoTime2 < 0) {
                    return 0L;
                }
                return nanoTime2;
            }
        }
        return Long.MAX_VALUE;
    }

    @Override // y2.J
    public void z() {
        G b3;
        k0.f6798a.set(null);
        f6761l.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6759j;
            Object obj = atomicReferenceFieldUpdater.get(this);
            D2.w wVar = AbstractC0688v.f6821c;
            if (obj != null) {
                if (!(obj instanceof D2.n)) {
                    if (obj != wVar) {
                        D2.n nVar = new D2.n(8, true);
                        nVar.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((D2.n) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, wVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (w() <= 0) {
        }
        long nanoTime = System.nanoTime();
        while (true) {
            H h = (H) f6760k.get(this);
            if (h == null) {
                return;
            }
            synchronized (h) {
                b3 = D2.z.f1093b.get(h) > 0 ? h.b(0) : null;
            }
            if (b3 == null) {
                return;
            } else {
                y(nanoTime, b3);
            }
        }
    }
}
