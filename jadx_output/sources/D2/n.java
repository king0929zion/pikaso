package D2;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1071e = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_next");

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1072f = AtomicLongFieldUpdater.newUpdater(n.class, "_state");

    /* renamed from: g, reason: collision with root package name */
    public static final w f1073g = new w("REMOVE_FROZEN", 0);
    private volatile Object _next;
    private volatile long _state;

    /* renamed from: a, reason: collision with root package name */
    public final int f1074a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1075b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1076c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceArray f1077d;

    public n(int i3, boolean z3) {
        this.f1074a = i3;
        this.f1075b = z3;
        int i4 = i3 - 1;
        this.f1076c = i4;
        this.f1077d = new AtomicReferenceArray(i3);
        if (i4 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i3 & i4) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0050, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(java.lang.Runnable r14) {
        /*
            r13 = this;
        L0:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = D2.n.f1072f
            long r2 = r6.get(r13)
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r7 = 0
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L19
            r4 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r2 = r2 & r4
            int r14 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r14 == 0) goto L18
            r1 = 2
        L18:
            return r1
        L19:
            r4 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r4 & r2
            int r0 = (int) r4
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r9 = 30
            long r4 = r4 >> r9
            int r10 = (int) r4
            int r4 = r10 + 2
            int r11 = r13.f1076c
            r4 = r4 & r11
            r5 = r0 & r11
            if (r4 != r5) goto L32
            return r1
        L32:
            java.util.concurrent.atomic.AtomicReferenceArray r12 = r13.f1077d
            boolean r4 = r13.f1075b
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r4 != 0) goto L51
            r4 = r10 & r11
            java.lang.Object r4 = r12.get(r4)
            if (r4 == 0) goto L51
            r2 = 1024(0x400, float:1.435E-42)
            int r3 = r13.f1074a
            if (r3 < r2) goto L50
            int r10 = r10 - r0
            r0 = r10 & r5
            int r2 = r3 >> 1
            if (r0 <= r2) goto L0
        L50:
            return r1
        L51:
            int r0 = r10 + 1
            r0 = r0 & r5
            r4 = -1152921503533105153(0xf00000003fffffff, double:-3.1050369248997324E231)
            long r4 = r4 & r2
            long r0 = (long) r0
            long r0 = r0 << r9
            long r4 = r4 | r0
            r0 = r6
            r1 = r13
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L0
            r0 = r10 & r11
            r12.set(r0, r14)
            r0 = r13
        L6b:
            long r1 = r6.get(r0)
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L94
            D2.n r0 = r0.c()
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r0.f1077d
            int r2 = r0.f1076c
            r2 = r2 & r10
            java.lang.Object r3 = r1.get(r2)
            boolean r4 = r3 instanceof D2.m
            if (r4 == 0) goto L91
            D2.m r3 = (D2.m) r3
            int r3 = r3.f1070a
            if (r3 != r10) goto L91
            r1.set(r2, r14)
            goto L92
        L91:
            r0 = 0
        L92:
            if (r0 != 0) goto L6b
        L94:
            r14 = 0
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: D2.n.a(java.lang.Runnable):int");
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        do {
            atomicLongFieldUpdater = f1072f;
            j3 = atomicLongFieldUpdater.get(this);
            if ((j3 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j3) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j3, 2305843009213693952L | j3));
        return true;
    }

    public final n c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        while (true) {
            atomicLongFieldUpdater = f1072f;
            j3 = atomicLongFieldUpdater.get(this);
            if ((j3 & 1152921504606846976L) != 0) {
                break;
            }
            long j4 = j3 | 1152921504606846976L;
            if (atomicLongFieldUpdater.compareAndSet(this, j3, j4)) {
                j3 = j4;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1071e;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            if (nVar != null) {
                return nVar;
            }
            n nVar2 = new n(this.f1074a * 2, this.f1075b);
            int i3 = (int) (1073741823 & j3);
            int i4 = (int) ((1152921503533105152L & j3) >> 30);
            while (true) {
                int i5 = this.f1076c;
                int i6 = i3 & i5;
                if (i6 == (i5 & i4)) {
                    break;
                }
                Object obj = this.f1077d.get(i6);
                if (obj == null) {
                    obj = new m(i3);
                }
                nVar2.f1077d.set(nVar2.f1076c & i3, obj);
                i3++;
            }
            atomicLongFieldUpdater.set(nVar2, (-1152921504606846977L) & j3);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, nVar2) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f1072f;
            long j3 = atomicLongFieldUpdater.get(this);
            if ((j3 & 1152921504606846976L) != 0) {
                return f1073g;
            }
            int i3 = (int) (j3 & 1073741823);
            int i4 = this.f1076c;
            int i5 = i3 & i4;
            if ((((int) ((1152921503533105152L & j3) >> 30)) & i4) == i5) {
                return null;
            }
            AtomicReferenceArray atomicReferenceArray = this.f1077d;
            Object obj = atomicReferenceArray.get(i5);
            boolean z3 = this.f1075b;
            if (obj == null) {
                if (z3) {
                    return null;
                }
            } else {
                if (obj instanceof m) {
                    return null;
                }
                long j4 = (i3 + 1) & 1073741823;
                if (atomicLongFieldUpdater.compareAndSet(this, j3, (j3 & (-1073741824)) | j4)) {
                    atomicReferenceArray.set(i5, null);
                    return obj;
                }
                if (z3) {
                    n nVar = this;
                    while (true) {
                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f1072f;
                        long j5 = atomicLongFieldUpdater2.get(nVar);
                        int i6 = (int) (j5 & 1073741823);
                        if ((j5 & 1152921504606846976L) != 0) {
                            nVar = nVar.c();
                        } else {
                            if (atomicLongFieldUpdater2.compareAndSet(nVar, j5, (j5 & (-1073741824)) | j4)) {
                                nVar.f1077d.set(nVar.f1076c & i6, null);
                                nVar = null;
                            } else {
                                continue;
                            }
                        }
                        if (nVar == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
