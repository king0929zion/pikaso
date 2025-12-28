package D2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import y2.AbstractC0688v;

/* loaded from: classes.dex */
public class k {

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1066d = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_next");

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1067e = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_prev");

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1068f = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_removedRef");
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        r6 = ((D2.r) r6).f1082a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        if (r5.get(r4) == r3) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final D2.k j() {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = D2.k.f1067e
            java.lang.Object r1 = r0.get(r9)
            D2.k r1 = (D2.k) r1
            r2 = 0
            r3 = r1
        La:
            r4 = r2
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = D2.k.f1066d
            java.lang.Object r6 = r5.get(r3)
            if (r6 != r9) goto L24
            if (r1 != r3) goto L16
            return r3
        L16:
            boolean r2 = r0.compareAndSet(r9, r1, r3)
            if (r2 == 0) goto L1d
            return r3
        L1d:
            java.lang.Object r2 = r0.get(r9)
            if (r2 == r1) goto L16
            goto L0
        L24:
            boolean r7 = r9.n()
            if (r7 == 0) goto L2b
            return r2
        L2b:
            if (r6 != 0) goto L2e
            return r3
        L2e:
            boolean r7 = r6 instanceof D2.q
            if (r7 == 0) goto L38
            D2.q r6 = (D2.q) r6
            r6.a(r3)
            goto L0
        L38:
            boolean r7 = r6 instanceof D2.r
            if (r7 == 0) goto L58
            if (r4 == 0) goto L51
            D2.r r6 = (D2.r) r6
            D2.k r6 = r6.f1082a
        L42:
            boolean r7 = r5.compareAndSet(r4, r3, r6)
            if (r7 == 0) goto L4a
            r3 = r4
            goto La
        L4a:
            java.lang.Object r7 = r5.get(r4)
            if (r7 == r3) goto L42
            goto L0
        L51:
            java.lang.Object r3 = r0.get(r3)
            D2.k r3 = (D2.k) r3
            goto Lb
        L58:
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            p2.g.c(r6, r4)
            r4 = r6
            D2.k r4 = (D2.k) r4
            r8 = r4
            r4 = r3
            r3 = r8
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: D2.k.j():D2.k");
    }

    public final void k(k kVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1067e;
            k kVar2 = (k) atomicReferenceFieldUpdater.get(kVar);
            if (l() != kVar) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(kVar, kVar2, this)) {
                if (atomicReferenceFieldUpdater.get(kVar) != kVar2) {
                    break;
                }
            }
            if (n()) {
                kVar.j();
                return;
            }
            return;
        }
    }

    public final Object l() {
        while (true) {
            Object obj = f1066d.get(this);
            if (!(obj instanceof q)) {
                return obj;
            }
            ((q) obj).a(this);
        }
    }

    public final k m() {
        k kVar;
        Object l3 = l();
        r rVar = l3 instanceof r ? (r) l3 : null;
        if (rVar != null && (kVar = rVar.f1082a) != null) {
            return kVar;
        }
        p2.g.c(l3, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (k) l3;
    }

    public boolean n() {
        return l() instanceof r;
    }

    public String toString() {
        return new j(this, AbstractC0688v.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + AbstractC0688v.f(this);
    }
}
