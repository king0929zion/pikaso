package A2;

import D2.u;
import D2.w;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes.dex */
public final class j extends u {
    public final b h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReferenceArray f258i;

    public j(long j3, j jVar, b bVar, int i3) {
        super(j3, jVar, i3);
        this.h = bVar;
        this.f258i = new AtomicReferenceArray(d.f236b * 2);
    }

    @Override // D2.u
    public final int f() {
        return d.f236b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x005b, code lost:
    
        m(r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x005e, code lost:
    
        if (r1 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0060, code lost:
    
        p2.g.b(r4);
        r7 = r4.f233e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0065, code lost:
    
        if (r7 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0067, code lost:
    
        r7 = D2.AbstractC0071a.a(r7, r0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x006b, code lost:
    
        if (r7 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x006d, code lost:
    
        y2.AbstractC0688v.h(r8, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0070, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:?, code lost:
    
        return;
     */
    @Override // D2.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(int r7, g2.InterfaceC0276i r8) {
        /*
            r6 = this;
            int r0 = A2.d.f236b
            if (r7 < r0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            if (r1 == 0) goto La
            int r7 = r7 - r0
        La:
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r6.f258i
            int r2 = r7 * 2
            java.lang.Object r0 = r0.get(r2)
        L12:
            java.lang.Object r2 = r6.k(r7)
            boolean r3 = r2 instanceof y2.p0
            A2.b r4 = r6.h
            r5 = 0
            if (r3 != 0) goto L71
            boolean r3 = r2 instanceof A2.r
            if (r3 == 0) goto L22
            goto L71
        L22:
            D2.w r3 = A2.d.f243j
            if (r2 == r3) goto L5b
            D2.w r3 = A2.d.f244k
            if (r2 != r3) goto L2b
            goto L5b
        L2b:
            D2.w r3 = A2.d.f241g
            if (r2 == r3) goto L12
            D2.w r3 = A2.d.f240f
            if (r2 != r3) goto L34
            goto L12
        L34:
            D2.w r7 = A2.d.f242i
            if (r2 == r7) goto L5a
            D2.w r7 = A2.d.f238d
            if (r2 != r7) goto L3d
            goto L5a
        L3d:
            D2.w r7 = A2.d.f245l
            if (r2 != r7) goto L42
            return
        L42:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "unexpected state: "
            r8.<init>(r0)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L5a:
            return
        L5b:
            r6.m(r7, r5)
            if (r1 == 0) goto L70
            p2.g.b(r4)
            o2.c r7 = r4.f233e
            if (r7 == 0) goto L70
            B1.c r7 = D2.AbstractC0071a.a(r7, r0, r5)
            if (r7 == 0) goto L70
            y2.AbstractC0688v.h(r8, r7)
        L70:
            return
        L71:
            if (r1 == 0) goto L76
            D2.w r3 = A2.d.f243j
            goto L78
        L76:
            D2.w r3 = A2.d.f244k
        L78:
            boolean r2 = r6.j(r2, r7, r3)
            if (r2 == 0) goto L12
            r6.m(r7, r5)
            r2 = r1 ^ 1
            r6.l(r7, r2)
            if (r1 == 0) goto L98
            p2.g.b(r4)
            o2.c r7 = r4.f233e
            if (r7 == 0) goto L98
            B1.c r7 = D2.AbstractC0071a.a(r7, r0, r5)
            if (r7 == 0) goto L98
            y2.AbstractC0688v.h(r8, r7)
        L98:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: A2.j.g(int, g2.i):void");
    }

    public final boolean j(Object obj, int i3, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f258i;
        int i4 = (i3 * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i4, obj, obj2)) {
            if (atomicReferenceArray.get(i4) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object k(int i3) {
        return this.f258i.get((i3 * 2) + 1);
    }

    public final void l(int i3, boolean z3) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        AtomicLongFieldUpdater atomicLongFieldUpdater2;
        long j4;
        if (z3) {
            b bVar = this.h;
            p2.g.b(bVar);
            long j5 = (this.f1085f * d.f236b) + i3;
            if (!bVar.t()) {
                do {
                    atomicLongFieldUpdater = b.h;
                } while (atomicLongFieldUpdater.get(bVar) <= j5);
                int i4 = d.f237c;
                int i5 = 0;
                while (true) {
                    AtomicLongFieldUpdater atomicLongFieldUpdater3 = b.f226i;
                    if (i5 < i4) {
                        long j6 = atomicLongFieldUpdater.get(bVar);
                        if (j6 == (atomicLongFieldUpdater3.get(bVar) & 4611686018427387903L) && j6 == atomicLongFieldUpdater.get(bVar)) {
                            break;
                        } else {
                            i5++;
                        }
                    } else {
                        do {
                            j3 = atomicLongFieldUpdater3.get(bVar);
                        } while (!atomicLongFieldUpdater3.compareAndSet(bVar, j3, 4611686018427387904L + (j3 & 4611686018427387903L)));
                        while (true) {
                            long j7 = atomicLongFieldUpdater.get(bVar);
                            atomicLongFieldUpdater2 = b.f226i;
                            long j8 = atomicLongFieldUpdater2.get(bVar);
                            long j9 = j8 & 4611686018427387903L;
                            boolean z4 = (j8 & 4611686018427387904L) != 0;
                            if (j7 == j9 && j7 == atomicLongFieldUpdater.get(bVar)) {
                                break;
                            } else if (!z4) {
                                atomicLongFieldUpdater2.compareAndSet(bVar, j8, j9 + 4611686018427387904L);
                            }
                        }
                        do {
                            j4 = atomicLongFieldUpdater2.get(bVar);
                        } while (!atomicLongFieldUpdater2.compareAndSet(bVar, j4, j4 & 4611686018427387903L));
                    }
                }
            }
        }
        h();
    }

    public final void m(int i3, Object obj) {
        this.f258i.lazySet(i3 * 2, obj);
    }

    public final void n(int i3, w wVar) {
        this.f258i.set((i3 * 2) + 1, wVar);
    }
}
