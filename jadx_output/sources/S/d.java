package S;

import A.t;
import P.k;
import n0.InterfaceC0427h;
import n0.o0;

/* loaded from: classes.dex */
public final class d extends k implements o0, InterfaceC0427h {

    /* renamed from: q, reason: collision with root package name */
    public d f2234q;

    @Override // P.k
    public final void Z() {
        this.f2234q = null;
    }

    public final boolean f0(t tVar) {
        d dVar = this.f2234q;
        if (dVar == null) {
            return false;
        }
        return dVar.f0(tVar);
    }

    public final void g0(t tVar) {
        d dVar = this.f2234q;
        if (dVar != null) {
            dVar.g0(tVar);
        }
    }

    public final void h0(t tVar) {
        d dVar = this.f2234q;
        if (dVar != null) {
            dVar.h0(tVar);
        }
        this.f2234q = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i0(A.t r5) {
        /*
            r4 = this;
            S.d r0 = r4.f2234q
            if (r0 == 0) goto L1d
            java.lang.Object r1 = r5.f175e
            android.view.DragEvent r1 = (android.view.DragEvent) r1
            float r2 = r1.getX()
            float r1 = r1.getY()
            long r1 = r2.a.f(r2, r1)
            boolean r1 = a.AbstractC0090a.g(r0, r1)
            r2 = 1
            if (r1 != r2) goto L1d
            r1 = r0
            goto L39
        L1d:
            P.k r1 = r4.f2088d
            boolean r1 = r1.f2099p
            if (r1 != 0) goto L25
            r1 = 0
            goto L37
        L25:
            p2.o r1 = new p2.o
            r1.<init>()
            D2.p r2 = new D2.p
            r3 = 1
            r2.<init>(r1, r4, r5, r3)
            n0.AbstractC0409C.t(r4, r2)
            java.lang.Object r1 = r1.f5960d
            n0.o0 r1 = (n0.o0) r1
        L37:
            S.d r1 = (S.d) r1
        L39:
            if (r1 == 0) goto L44
            if (r0 != 0) goto L44
            r1.g0(r5)
            r1.i0(r5)
            goto L65
        L44:
            if (r1 != 0) goto L4c
            if (r0 == 0) goto L4c
            r0.h0(r5)
            goto L65
        L4c:
            boolean r2 = p2.g.a(r1, r0)
            if (r2 != 0) goto L60
            if (r1 == 0) goto L5a
            r1.g0(r5)
            r1.i0(r5)
        L5a:
            if (r0 == 0) goto L65
            r0.h0(r5)
            goto L65
        L60:
            if (r1 == 0) goto L65
            r1.i0(r5)
        L65:
            r4.f2234q = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: S.d.i0(A.t):void");
    }

    @Override // n0.o0
    public final Object j() {
        return b.f2233a;
    }

    public final void j0(t tVar) {
        d dVar = this.f2234q;
        if (dVar != null) {
            dVar.j0(tVar);
        }
    }
}
