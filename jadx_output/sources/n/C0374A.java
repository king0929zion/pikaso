package n;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: n.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0374A implements q2.e, Set, q2.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0375B f4958d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0375B f4959e;

    public C0374A(C0375B c0375b) {
        this.f4959e = c0375b;
        this.f4958d = c0375b;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f4959e.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        p2.g.e(collection, "elements");
        C0375B c0375b = this.f4959e;
        int i3 = c0375b.f4963d;
        for (Object obj : collection) {
            c0375b.f4961b[c0375b.d(obj)] = obj;
        }
        return i3 != c0375b.f4963d;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f4959e.b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f4958d.c(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        p2.g.e(collection, "elements");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f4958d.c(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f4958d.g();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new J.c(this.f4959e);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f4959e.j(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0092, code lost:
    
        if (((r5 & ((~r5) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0094, code lost:
    
        r14 = -1;
     */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean removeAll(java.util.Collection r19) {
        /*
            r18 = this;
            java.lang.String r0 = "elements"
            r1 = r19
            p2.g.e(r1, r0)
            r0 = r18
            n.B r2 = r0.f4959e
            int r3 = r2.f4963d
            java.util.Iterator r1 = r19.iterator()
        L11:
            boolean r4 = r1.hasNext()
            r5 = 1
            r6 = 0
            if (r4 == 0) goto La2
            java.lang.Object r4 = r1.next()
            if (r4 == 0) goto L27
            r2.getClass()
            int r7 = r4.hashCode()
            goto L28
        L27:
            r7 = r6
        L28:
            r8 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r7 = r7 * r8
            int r8 = r7 << 16
            r7 = r7 ^ r8
            r8 = r7 & 127(0x7f, float:1.78E-43)
            int r9 = r2.f4962c
            int r7 = r7 >>> 7
            r7 = r7 & r9
        L36:
            long[] r10 = r2.f4960a
            int r11 = r7 >> 3
            r12 = r7 & 7
            int r12 = r12 << 3
            r13 = r10[r11]
            long r13 = r13 >>> r12
            int r11 = r11 + r5
            r15 = r10[r11]
            int r10 = 64 - r12
            long r10 = r15 << r10
            r15 = r6
            long r5 = (long) r12
            long r5 = -r5
            r12 = 63
            long r5 = r5 >> r12
            long r5 = r5 & r10
            long r5 = r5 | r13
            long r10 = (long) r8
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r10 = r10 * r12
            long r10 = r10 ^ r5
            long r12 = r10 - r12
            long r10 = ~r10
            long r10 = r10 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
        L62:
            r16 = 0
            int r14 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r14 == 0) goto L86
            int r14 = java.lang.Long.numberOfTrailingZeros(r10)
            int r14 = r14 >> 3
            int r14 = r14 + r7
            r14 = r14 & r9
            java.lang.Object[] r12 = r2.f4961b
            r12 = r12[r14]
            boolean r12 = p2.g.a(r12, r4)
            if (r12 == 0) goto L7b
            goto L95
        L7b:
            r12 = 1
            long r12 = r10 - r12
            long r10 = r10 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            goto L62
        L86:
            long r10 = ~r5
            r12 = 6
            long r10 = r10 << r12
            long r5 = r5 & r10
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r5 = r5 & r10
            int r5 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r5 == 0) goto L9c
            r14 = -1
        L95:
            if (r14 < 0) goto L11
            r2.k(r14)
            goto L11
        L9c:
            int r6 = r15 + 8
            int r7 = r7 + r6
            r7 = r7 & r9
            r5 = 1
            goto L36
        La2:
            int r1 = r2.f4963d
            if (r3 == r1) goto La8
            r5 = 1
            goto La9
        La8:
            r5 = r6
        La9:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: n.C0374A.removeAll(java.util.Collection):boolean");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        p2.g.e(collection, "elements");
        C0375B c0375b = this.f4959e;
        long[] jArr = c0375b.f4960a;
        int length = jArr.length - 2;
        boolean z3 = false;
        if (length >= 0) {
            int i3 = 0;
            boolean z4 = false;
            while (true) {
                long j3 = jArr[i3];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j3) < 128) {
                            int i6 = (i3 << 3) + i5;
                            if (!collection.contains(c0375b.f4961b[i6])) {
                                c0375b.k(i6);
                                z4 = true;
                            }
                        }
                        j3 >>= 8;
                    }
                    if (i4 != 8) {
                        return z4;
                    }
                }
                if (i3 == length) {
                    z3 = z4;
                    break;
                }
                i3++;
            }
        }
        return z3;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f4958d.f4963d;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return p2.g.i(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        p2.g.e(objArr, "array");
        return p2.g.j(this, objArr);
    }
}
