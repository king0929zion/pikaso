package x2;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class a implements Iterator, q2.a {

    /* renamed from: d, reason: collision with root package name */
    public int f6723d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f6724e;

    /* renamed from: f, reason: collision with root package name */
    public int f6725f;

    /* renamed from: g, reason: collision with root package name */
    public u2.d f6726g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b f6727i;

    public a(b bVar) {
        this.f6727i = bVar;
        int k3 = Z.b.k(bVar.f6729b, 0, bVar.f6728a.length());
        this.f6724e = k3;
        this.f6725f = k3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        if (r7 < r3) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r8 = this;
            int r0 = r8.f6725f
            r1 = 0
            if (r0 >= 0) goto Lb
            r8.f6723d = r1
            r0 = 0
            r8.f6726g = r0
            goto L75
        Lb:
            x2.b r2 = r8.f6727i
            int r3 = r2.f6730c
            java.lang.String r4 = r2.f6728a
            r5 = -1
            r6 = 1
            if (r3 <= 0) goto L1c
            int r7 = r8.h
            int r7 = r7 + r6
            r8.h = r7
            if (r7 >= r3) goto L22
        L1c:
            int r3 = r4.length()
            if (r0 <= r3) goto L32
        L22:
            u2.d r0 = new u2.d
            int r1 = r8.f6724e
            int r2 = x2.j.g(r4)
            r0.<init>(r1, r2, r6)
            r8.f6726g = r0
            r8.f6725f = r5
            goto L73
        L32:
            x2.i r0 = r2.f6731d
            int r2 = r8.f6725f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.h(r4, r2)
            c2.g r0 = (c2.C0168g) r0
            if (r0 != 0) goto L52
            u2.d r0 = new u2.d
            int r1 = r8.f6724e
            int r2 = x2.j.g(r4)
            r0.<init>(r1, r2, r6)
            r8.f6726g = r0
            r8.f6725f = r5
            goto L73
        L52:
            java.lang.Object r2 = r0.f3833d
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r0 = r0.f3834e
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r3 = r8.f6724e
            u2.d r3 = Z.b.R(r3, r2)
            r8.f6726g = r3
            int r2 = r2 + r0
            r8.f6724e = r2
            if (r0 != 0) goto L70
            r1 = r6
        L70:
            int r2 = r2 + r1
            r8.f6725f = r2
        L73:
            r8.f6723d = r6
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.a.a():void");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f6723d == -1) {
            a();
        }
        return this.f6723d == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f6723d == -1) {
            a();
        }
        if (this.f6723d == 0) {
            throw new NoSuchElementException();
        }
        u2.d dVar = this.f6726g;
        p2.g.c(dVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f6726g = null;
        this.f6723d = -1;
        return dVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
