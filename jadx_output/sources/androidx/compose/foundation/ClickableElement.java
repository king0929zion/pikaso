package androidx.compose.foundation;

import P.k;
import n0.P;
import q.H;
import q.l;
import s.g;
import t0.e;

/* loaded from: classes.dex */
final class ClickableElement extends P {

    /* renamed from: a, reason: collision with root package name */
    public final g f3263a;

    /* renamed from: b, reason: collision with root package name */
    public final H f3264b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3265c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3266d;

    /* renamed from: e, reason: collision with root package name */
    public final e f3267e;

    /* renamed from: f, reason: collision with root package name */
    public final A0.c f3268f;

    public ClickableElement(g gVar, H h, boolean z3, String str, e eVar, A0.c cVar) {
        this.f3263a = gVar;
        this.f3264b = h;
        this.f3265c = z3;
        this.f3266d = str;
        this.f3267e = eVar;
        this.f3268f = cVar;
    }

    @Override // n0.P
    public final k d() {
        A0.c cVar = this.f3268f;
        return new l(this.f3263a, this.f3264b, this.f3265c, this.f3266d, this.f3267e, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0084, code lost:
    
        if (r8.f6008B == null) goto L39;
     */
    @Override // n0.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(P.k r8) {
        /*
            r7 = this;
            q.l r8 = (q.l) r8
            s.g r0 = r8.f6013G
            s.g r1 = r7.f3263a
            boolean r0 = p2.g.a(r0, r1)
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L17
            r8.i0()
            r8.f6013G = r1
            r8.f6016s = r1
            r0 = r3
            goto L18
        L17:
            r0 = r2
        L18:
            q.H r1 = r8.f6017t
            q.H r4 = r7.f3264b
            boolean r1 = p2.g.a(r1, r4)
            if (r1 != 0) goto L25
            r8.f6017t = r4
            r0 = r3
        L25:
            boolean r1 = r8.f6020w
            boolean r4 = r7.f3265c
            q.u r5 = r8.f6023z
            if (r1 == r4) goto L46
            q.q r1 = r8.f6022y
            if (r4 == 0) goto L38
            r8.f0(r1)
            r8.f0(r5)
            goto L41
        L38:
            r8.g0(r1)
            r8.g0(r5)
            r8.i0()
        L41:
            n0.AbstractC0409C.m(r8)
            r8.f6020w = r4
        L46:
            java.lang.String r1 = r8.f6018u
            java.lang.String r4 = r7.f3266d
            boolean r1 = p2.g.a(r1, r4)
            if (r1 != 0) goto L55
            r8.f6018u = r4
            n0.AbstractC0409C.m(r8)
        L55:
            t0.e r1 = r8.f6019v
            t0.e r4 = r7.f3267e
            boolean r1 = p2.g.a(r1, r4)
            if (r1 != 0) goto L64
            r8.f6019v = r4
            n0.AbstractC0409C.m(r8)
        L64:
            A0.c r1 = r7.f3268f
            r8.f6021x = r1
            boolean r1 = r8.f6014H
            s.g r4 = r8.f6013G
            if (r4 != 0) goto L74
            q.H r6 = r8.f6017t
            if (r6 == 0) goto L74
            r6 = r3
            goto L75
        L74:
            r6 = r2
        L75:
            if (r1 == r6) goto L87
            if (r4 != 0) goto L7e
            q.H r1 = r8.f6017t
            if (r1 == 0) goto L7e
            r2 = r3
        L7e:
            r8.f6014H = r2
            if (r2 != 0) goto L87
            n0.h r1 = r8.f6008B
            if (r1 != 0) goto L87
            goto L88
        L87:
            r3 = r0
        L88:
            if (r3 == 0) goto L9d
            n0.h r0 = r8.f6008B
            if (r0 != 0) goto L92
            boolean r1 = r8.f6014H
            if (r1 != 0) goto L9d
        L92:
            if (r0 == 0) goto L97
            r8.g0(r0)
        L97:
            r0 = 0
            r8.f6008B = r0
            r8.j0()
        L9d:
            s.g r8 = r8.f6016s
            r5.i0(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.ClickableElement.e(P.k):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClickableElement.class != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        return p2.g.a(this.f3263a, clickableElement.f3263a) && p2.g.a(this.f3264b, clickableElement.f3264b) && this.f3265c == clickableElement.f3265c && p2.g.a(this.f3266d, clickableElement.f3266d) && p2.g.a(this.f3267e, clickableElement.f3267e) && this.f3268f == clickableElement.f3268f;
    }

    public final int hashCode() {
        g gVar = this.f3263a;
        int hashCode = (gVar != null ? gVar.hashCode() : 0) * 31;
        H h = this.f3264b;
        int hashCode2 = (Boolean.hashCode(this.f3265c) + ((hashCode + (h != null ? h.hashCode() : 0)) * 31)) * 31;
        String str = this.f3266d;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        e eVar = this.f3267e;
        return this.f3268f.hashCode() + ((hashCode3 + (eVar != null ? Integer.hashCode(eVar.f6205a) : 0)) * 31);
    }
}
