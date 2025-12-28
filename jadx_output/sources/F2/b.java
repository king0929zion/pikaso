package F2;

import A.AbstractC0000a;
import D2.s;
import D2.w;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import p.AbstractC0537f;
import y2.AbstractC0688v;

/* loaded from: classes.dex */
public final class b implements Executor, Closeable {

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1216k = AtomicLongFieldUpdater.newUpdater(b.class, "parkedWorkersStack");

    /* renamed from: l, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1217l = AtomicLongFieldUpdater.newUpdater(b.class, "controlState");

    /* renamed from: m, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1218m = AtomicIntegerFieldUpdater.newUpdater(b.class, "_isTerminated");

    /* renamed from: n, reason: collision with root package name */
    public static final w f1219n = new w("NOT_IN_STACK", 0);
    private volatile int _isTerminated;
    private volatile long controlState;

    /* renamed from: d, reason: collision with root package name */
    public final int f1220d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1221e;

    /* renamed from: f, reason: collision with root package name */
    public final long f1222f;

    /* renamed from: g, reason: collision with root package name */
    public final String f1223g;
    public final e h;

    /* renamed from: i, reason: collision with root package name */
    public final e f1224i;

    /* renamed from: j, reason: collision with root package name */
    public final s f1225j;
    private volatile long parkedWorkersStack;

    public b(int i3, int i4, long j3, String str) {
        this.f1220d = i3;
        this.f1221e = i4;
        this.f1222f = j3;
        this.f1223g = str;
        if (i3 < 1) {
            throw new IllegalArgumentException(("Core pool size " + i3 + " should be at least 1").toString());
        }
        if (i4 < i3) {
            throw new IllegalArgumentException(AbstractC0000a.d("Max pool size ", i4, " should be greater than or equals to core pool size ", i3).toString());
        }
        if (i4 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i4 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j3 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j3 + " must be positive").toString());
        }
        this.h = new e();
        this.f1224i = new e();
        this.f1225j = new s((i3 + 1) * 2);
        this.controlState = i3 << 42;
        this._isTerminated = 0;
    }

    public static /* synthetic */ void c(b bVar, Runnable runnable, boolean z3, int i3) {
        i iVar = k.f1241g;
        if ((i3 & 4) != 0) {
            z3 = false;
        }
        bVar.b(runnable, iVar, z3);
    }

    public final int a() {
        synchronized (this.f1225j) {
            try {
                if (f1218m.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f1217l;
                long j3 = atomicLongFieldUpdater.get(this);
                int i3 = (int) (j3 & 2097151);
                int i4 = i3 - ((int) ((j3 & 4398044413952L) >> 21));
                if (i4 < 0) {
                    i4 = 0;
                }
                if (i4 >= this.f1220d) {
                    return 0;
                }
                if (i3 >= this.f1221e) {
                    return 0;
                }
                int i5 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i5 <= 0 || this.f1225j.b(i5) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(this, i5);
                this.f1225j.c(i5, aVar);
                if (i5 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i6 = i4 + 1;
                aVar.start();
                return i6;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Runnable runnable, i iVar, boolean z3) {
        h jVar;
        int i3;
        k.f1240f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof h) {
            jVar = (h) runnable;
            jVar.f1231d = nanoTime;
            jVar.f1232e = iVar;
        } else {
            jVar = new j(runnable, nanoTime, iVar);
        }
        boolean z4 = false;
        boolean z5 = jVar.f1232e.f1233a == 1;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1217l;
        long addAndGet = z5 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread currentThread = Thread.currentThread();
        a aVar = currentThread instanceof a ? (a) currentThread : null;
        if (aVar == null || !p2.g.a(aVar.f1215k, this)) {
            aVar = null;
        }
        if (aVar != null && (i3 = aVar.f1211f) != 5 && (jVar.f1232e.f1233a != 0 || i3 != 2)) {
            aVar.f1214j = true;
            m mVar = aVar.f1209d;
            if (z3) {
                jVar = mVar.a(jVar);
            } else {
                mVar.getClass();
                h hVar = (h) m.f1243b.getAndSet(mVar, jVar);
                jVar = hVar == null ? null : mVar.a(hVar);
            }
        }
        if (jVar != null) {
            if (!(jVar.f1232e.f1233a == 1 ? this.f1224i.a(jVar) : this.h.a(jVar))) {
                throw new RejectedExecutionException(this.f1223g + " was terminated");
            }
        }
        if (z3 && aVar != null) {
            z4 = true;
        }
        if (z5) {
            if (z4 || f() || e(addAndGet)) {
                return;
            }
            f();
            return;
        }
        if (z4 || f() || e(atomicLongFieldUpdater.get(this))) {
            return;
        }
        f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0087, code lost:
    
        if (r1 == null) goto L39;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = F2.b.f1218m
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lc
            goto Laf
        Lc:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof F2.a
            r3 = 0
            if (r1 == 0) goto L18
            F2.a r0 = (F2.a) r0
            goto L19
        L18:
            r0 = r3
        L19:
            if (r0 == 0) goto L24
            F2.b r1 = r0.f1215k
            boolean r1 = p2.g.a(r1, r8)
            if (r1 == 0) goto L24
            goto L25
        L24:
            r0 = r3
        L25:
            D2.s r1 = r8.f1225j
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = F2.b.f1217l     // Catch: java.lang.Throwable -> Lc1
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lc1
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L77
            r1 = r2
        L37:
            D2.s r5 = r8.f1225j
            java.lang.Object r5 = r5.b(r1)
            p2.g.b(r5)
            F2.a r5 = (F2.a) r5
            if (r5 == r0) goto L72
        L44:
            boolean r6 = r5.isAlive()
            if (r6 == 0) goto L53
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L44
        L53:
            F2.m r5 = r5.f1209d
            F2.e r6 = r8.f1224i
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = F2.m.f1243b
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            F2.h r7 = (F2.h) r7
            if (r7 == 0) goto L67
            r6.a(r7)
        L67:
            F2.h r7 = r5.b()
            if (r7 != 0) goto L6e
            goto L72
        L6e:
            r6.a(r7)
            goto L67
        L72:
            if (r1 == r4) goto L77
            int r1 = r1 + 1
            goto L37
        L77:
            F2.e r1 = r8.f1224i
            r1.b()
            F2.e r1 = r8.h
            r1.b()
        L81:
            if (r0 == 0) goto L89
            F2.h r1 = r0.a(r2)
            if (r1 != 0) goto Lb0
        L89:
            F2.e r1 = r8.h
            java.lang.Object r1 = r1.d()
            F2.h r1 = (F2.h) r1
            if (r1 != 0) goto Lb0
            F2.e r1 = r8.f1224i
            java.lang.Object r1 = r1.d()
            F2.h r1 = (F2.h) r1
            if (r1 != 0) goto Lb0
            if (r0 == 0) goto La3
            r1 = 5
            r0.h(r1)
        La3:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = F2.b.f1216k
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = F2.b.f1217l
            r0.set(r8, r1)
        Laf:
            return
        Lb0:
            r1.run()     // Catch: java.lang.Throwable -> Lb4
            goto L81
        Lb4:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L81
        Lc1:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: F2.b.close():void");
    }

    public final void d(a aVar, int i3, int i4) {
        while (true) {
            long j3 = f1216k.get(this);
            int i5 = (int) (2097151 & j3);
            long j4 = (2097152 + j3) & (-2097152);
            if (i5 == i3) {
                if (i4 == 0) {
                    Object c3 = aVar.c();
                    while (true) {
                        if (c3 == f1219n) {
                            i5 = -1;
                            break;
                        }
                        if (c3 == null) {
                            i5 = 0;
                            break;
                        }
                        a aVar2 = (a) c3;
                        int b3 = aVar2.b();
                        if (b3 != 0) {
                            i5 = b3;
                            break;
                        }
                        c3 = aVar2.c();
                    }
                } else {
                    i5 = i4;
                }
            }
            if (i5 >= 0) {
                if (f1216k.compareAndSet(this, j3, i5 | j4)) {
                    return;
                }
            }
        }
    }

    public final boolean e(long j3) {
        int i3 = ((int) (2097151 & j3)) - ((int) ((j3 & 4398044413952L) >> 21));
        if (i3 < 0) {
            i3 = 0;
        }
        int i4 = this.f1220d;
        if (i3 < i4) {
            int a3 = a();
            if (a3 == 1 && i4 > 1) {
                a();
            }
            if (a3 > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c(this, runnable, false, 6);
    }

    public final boolean f() {
        w wVar;
        int i3;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f1216k;
            long j3 = atomicLongFieldUpdater.get(this);
            a aVar = (a) this.f1225j.b((int) (2097151 & j3));
            if (aVar == null) {
                aVar = null;
            } else {
                long j4 = (2097152 + j3) & (-2097152);
                Object c3 = aVar.c();
                while (true) {
                    wVar = f1219n;
                    if (c3 == wVar) {
                        i3 = -1;
                        break;
                    }
                    if (c3 == null) {
                        i3 = 0;
                        break;
                    }
                    a aVar2 = (a) c3;
                    i3 = aVar2.b();
                    if (i3 != 0) {
                        break;
                    }
                    c3 = aVar2.c();
                }
                if (i3 >= 0 && atomicLongFieldUpdater.compareAndSet(this, j3, j4 | i3)) {
                    aVar.g(wVar);
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.f1208l.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        s sVar = this.f1225j;
        int a3 = sVar.a();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 1; i8 < a3; i8++) {
            a aVar = (a) sVar.b(i8);
            if (aVar != null) {
                m mVar = aVar.f1209d;
                mVar.getClass();
                int i9 = m.f1243b.get(mVar) != null ? (m.f1244c.get(mVar) - m.f1245d.get(mVar)) + 1 : m.f1244c.get(mVar) - m.f1245d.get(mVar);
                int b3 = AbstractC0537f.b(aVar.f1211f);
                if (b3 == 0) {
                    i3++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i9);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (b3 == 1) {
                    i4++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i9);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (b3 == 2) {
                    i5++;
                } else if (b3 == 3) {
                    i6++;
                    if (i9 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i9);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (b3 == 4) {
                    i7++;
                }
            }
        }
        long j3 = f1217l.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f1223g);
        sb4.append('@');
        sb4.append(AbstractC0688v.f(this));
        sb4.append("[Pool Size {core = ");
        int i10 = this.f1220d;
        sb4.append(i10);
        sb4.append(", max = ");
        sb4.append(this.f1221e);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i3);
        sb4.append(", blocking = ");
        sb4.append(i4);
        sb4.append(", parked = ");
        sb4.append(i5);
        sb4.append(", dormant = ");
        sb4.append(i6);
        sb4.append(", terminated = ");
        sb4.append(i7);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.h.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f1224i.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j3));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j3) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i10 - ((int) ((j3 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
