package F2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p2.o;

/* loaded from: classes.dex */
public final class a extends Thread {

    /* renamed from: l, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1208l = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl");

    /* renamed from: d, reason: collision with root package name */
    public final m f1209d;

    /* renamed from: e, reason: collision with root package name */
    public final o f1210e;

    /* renamed from: f, reason: collision with root package name */
    public int f1211f;

    /* renamed from: g, reason: collision with root package name */
    public long f1212g;
    public long h;

    /* renamed from: i, reason: collision with root package name */
    public int f1213i;
    private volatile int indexInArray;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1214j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ b f1215k;
    private volatile Object nextParkedWorker;
    private volatile int workerCtl;

    public a(b bVar, int i3) {
        this.f1215k = bVar;
        setDaemon(true);
        this.f1209d = new m();
        this.f1210e = new o();
        this.f1211f = 4;
        this.nextParkedWorker = b.f1219n;
        s2.d.f6145d.getClass();
        this.f1213i = s2.d.f6146e.a().nextInt();
        f(i3);
    }

    public final h a(boolean z3) {
        h e3;
        h e4;
        b bVar;
        long j3;
        int i3 = this.f1211f;
        h hVar = null;
        m mVar = this.f1209d;
        b bVar2 = this.f1215k;
        if (i3 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = b.f1217l;
            do {
                bVar = this.f1215k;
                j3 = atomicLongFieldUpdater.get(bVar);
                if (((int) ((9223367638808264704L & j3) >> 42)) == 0) {
                    mVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f1243b;
                        h hVar2 = (h) atomicReferenceFieldUpdater.get(mVar);
                        if (hVar2 != null && hVar2.f1232e.f1233a == 1) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(mVar, hVar2, null)) {
                                if (atomicReferenceFieldUpdater.get(mVar) != hVar2) {
                                    break;
                                }
                            }
                            hVar = hVar2;
                            break loop1;
                        }
                    }
                    int i4 = m.f1245d.get(mVar);
                    int i5 = m.f1244c.get(mVar);
                    while (true) {
                        if (i4 == i5 || m.f1246e.get(mVar) == 0) {
                            break;
                        }
                        i5--;
                        h c3 = mVar.c(i5, true);
                        if (c3 != null) {
                            hVar = c3;
                            break;
                        }
                    }
                    if (hVar != null) {
                        return hVar;
                    }
                    h hVar3 = (h) bVar2.f1224i.d();
                    return hVar3 == null ? i(1) : hVar3;
                }
            } while (!b.f1217l.compareAndSet(bVar, j3, j3 - 4398046511104L));
            this.f1211f = 1;
        }
        if (z3) {
            boolean z4 = d(bVar2.f1220d * 2) == 0;
            if (z4 && (e4 = e()) != null) {
                return e4;
            }
            mVar.getClass();
            h hVar4 = (h) m.f1243b.getAndSet(mVar, null);
            if (hVar4 == null) {
                hVar4 = mVar.b();
            }
            if (hVar4 != null) {
                return hVar4;
            }
            if (!z4 && (e3 = e()) != null) {
                return e3;
            }
        } else {
            h e5 = e();
            if (e5 != null) {
                return e5;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i3) {
        int i4 = this.f1213i;
        int i5 = i4 ^ (i4 << 13);
        int i6 = i5 ^ (i5 >> 17);
        int i7 = i6 ^ (i6 << 5);
        this.f1213i = i7;
        int i8 = i3 - 1;
        return (i8 & i3) == 0 ? i7 & i8 : (i7 & Integer.MAX_VALUE) % i3;
    }

    public final h e() {
        int d3 = d(2);
        b bVar = this.f1215k;
        if (d3 == 0) {
            h hVar = (h) bVar.h.d();
            return hVar != null ? hVar : (h) bVar.f1224i.d();
        }
        h hVar2 = (h) bVar.f1224i.d();
        return hVar2 != null ? hVar2 : (h) bVar.h.d();
    }

    public final void f(int i3) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1215k.f1223g);
        sb.append("-worker-");
        sb.append(i3 == 0 ? "TERMINATED" : String.valueOf(i3));
        setName(sb.toString());
        this.indexInArray = i3;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(int i3) {
        int i4 = this.f1211f;
        boolean z3 = i4 == 1;
        if (z3) {
            b.f1217l.addAndGet(this.f1215k, 4398046511104L);
        }
        if (i4 != i3) {
            this.f1211f = i3;
        }
        return z3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0082, code lost:
    
        r19 = r6;
        r6 = -2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final F2.h i(int r24) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: F2.a.i(int):F2.h");
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: F2.a.run():void");
    }
}
