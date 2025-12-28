package N;

import D.C0065y;

/* renamed from: N.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0074b extends C0075c {
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0074b(int r6, N.l r7) {
        /*
            r5 = this;
            java.lang.Object r0 = N.o.f1756b
            monitor-enter(r0)
            java.lang.Object r1 = N.o.h     // Catch: java.lang.Throwable -> L24
            java.lang.String r2 = "<this>"
            p2.g.e(r1, r2)     // Catch: java.lang.Throwable -> L24
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L24
            r3 = 1
            r4 = 0
            if (r2 != r3) goto L18
            r2 = 0
            java.lang.Object r2 = r1.get(r2)     // Catch: java.lang.Throwable -> L24
            goto L19
        L18:
            r2 = r4
        L19:
            o2.c r2 = (o2.c) r2     // Catch: java.lang.Throwable -> L24
            if (r2 != 0) goto L26
            D.y r2 = new D.y     // Catch: java.lang.Throwable -> L24
            r3 = 4
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L24
            goto L26
        L24:
            r6 = move-exception
            goto L2b
        L26:
            monitor-exit(r0)
            r5.<init>(r6, r7, r4, r2)
            return
        L2b:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: N.C0074b.<init>(int, N.l):void");
    }

    @Override // N.C0075c
    public final C0075c B(o2.c cVar, o2.c cVar2) {
        return (C0075c) ((h) o.f(new n(0, new C0073a(cVar, cVar2, 0))));
    }

    @Override // N.C0075c, N.h
    public final void c() {
        synchronized (o.f1756b) {
            int i3 = this.f1739d;
            if (i3 >= 0) {
                o.u(i3);
                this.f1739d = -1;
            }
        }
    }

    @Override // N.C0075c, N.h
    public final void k() {
        t.e();
        throw null;
    }

    @Override // N.C0075c, N.h
    public final void l() {
        t.e();
        throw null;
    }

    @Override // N.C0075c, N.h
    public final void m() {
        o.a();
    }

    @Override // N.C0075c, N.h
    public final h t(o2.c cVar) {
        return (h) o.f(new n(0, new C0065y(5, cVar)));
    }

    @Override // N.C0075c
    public final t v() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}
