package v0;

import A.AbstractC0000a;
import W.G;
import a.AbstractC0090a;

/* renamed from: v0.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0613B {

    /* renamed from: d, reason: collision with root package name */
    public static final C0613B f6318d;

    /* renamed from: a, reason: collision with root package name */
    public final v f6319a;

    /* renamed from: b, reason: collision with root package name */
    public final n f6320b;

    /* renamed from: c, reason: collision with root package name */
    public final q f6321c;

    static {
        long j3 = W.r.f2562f;
        long j4 = G0.h.f1263c;
        f6318d = new C0613B(new v(j3, j4, (z0.l) null, (z0.j) null, (z0.k) null, (z0.r) null, (String) null, j4, (F0.a) null, (F0.k) null, (B0.c) null, j3, (F0.g) null, (G) null, (Y.c) null), new n(Integer.MIN_VALUE, Integer.MIN_VALUE, j4, null, null, null, 0, Integer.MIN_VALUE, null), null);
    }

    public C0613B(v vVar, n nVar, q qVar) {
        this.f6319a = vVar;
        this.f6320b = nVar;
        this.f6321c = qVar;
    }

    public static C0613B a(C0613B c0613b, long j3, z0.l lVar, z0.r rVar, long j4, long j5, q qVar, F0.e eVar, int i3) {
        long j6;
        long j7;
        F0.j cVar;
        long b3 = c0613b.f6319a.f6445a.b();
        long j8 = (i3 & 2) != 0 ? c0613b.f6319a.f6446b : j3;
        z0.l lVar2 = (i3 & 4) != 0 ? c0613b.f6319a.f6447c : lVar;
        v vVar = c0613b.f6319a;
        z0.j jVar = vVar.f6448d;
        z0.k kVar = vVar.f6449e;
        z0.r rVar2 = (i3 & 32) != 0 ? vVar.f6450f : rVar;
        String str = vVar.f6451g;
        long j9 = (i3 & 128) != 0 ? vVar.h : j4;
        F0.a aVar = vVar.f6452i;
        F0.k kVar2 = vVar.f6453j;
        B0.c cVar2 = vVar.f6454k;
        long j10 = j9;
        long j11 = vVar.f6455l;
        F0.g gVar = vVar.f6456m;
        G g3 = vVar.f6457n;
        Y.c cVar3 = vVar.f6458o;
        n nVar = c0613b.f6320b;
        int i4 = nVar.f6369a;
        int i5 = nVar.f6370b;
        if ((i3 & 131072) != 0) {
            j6 = j11;
            j7 = nVar.f6371c;
        } else {
            j6 = j11;
            j7 = j5;
        }
        F0.l lVar3 = nVar.f6372d;
        q qVar2 = (524288 & i3) != 0 ? c0613b.f6321c : qVar;
        F0.e eVar2 = (i3 & 1048576) != 0 ? nVar.f6374f : eVar;
        int i6 = nVar.f6375g;
        int i7 = nVar.h;
        F0.m mVar = nVar.f6376i;
        if (W.r.c(b3, vVar.f6445a.b())) {
            cVar = vVar.f6445a;
        } else {
            cVar = b3 != 16 ? new F0.c(b3) : F0.i.f1186a;
        }
        return new C0613B(new v(cVar, j8, lVar2, jVar, kVar, rVar2, str, j10, aVar, kVar2, cVar2, j6, gVar, g3, cVar3), new n(i4, i5, j7, lVar3, qVar2 != null ? qVar2.f6379a : null, eVar2, i6, i7, mVar), qVar2);
    }

    public static C0613B d(C0613B c0613b, long j3, long j4, z0.l lVar, z0.j jVar, z0.r rVar, long j5, F0.g gVar, int i3, long j6, int i4) {
        long j7 = (i4 & 2) != 0 ? G0.h.f1263c : j4;
        z0.l lVar2 = (i4 & 4) != 0 ? null : lVar;
        z0.j jVar2 = (i4 & 8) != 0 ? null : jVar;
        z0.r rVar2 = (i4 & 32) != 0 ? null : rVar;
        long j8 = (i4 & 128) != 0 ? G0.h.f1263c : j5;
        long j9 = W.r.f2562f;
        F0.g gVar2 = (i4 & 4096) != 0 ? null : gVar;
        int i5 = (32768 & i4) != 0 ? Integer.MIN_VALUE : i3;
        long j10 = (i4 & 131072) != 0 ? G0.h.f1263c : j6;
        v a3 = w.a(c0613b.f6319a, j3, null, Float.NaN, j7, lVar2, jVar2, null, rVar2, null, j8, null, null, null, j9, gVar2, null, null);
        n a4 = o.a(c0613b.f6320b, i5, Integer.MIN_VALUE, j10, null, null, null, 0, Integer.MIN_VALUE, null);
        return (c0613b.f6319a == a3 && c0613b.f6320b == a4) ? c0613b : new C0613B(a3, a4);
    }

    public final long b() {
        return this.f6319a.f6445a.b();
    }

    public final C0613B c(C0613B c0613b) {
        return (c0613b == null || c0613b.equals(f6318d)) ? this : new C0613B(this.f6319a.c(c0613b.f6319a), this.f6320b.a(c0613b.f6320b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0613B)) {
            return false;
        }
        C0613B c0613b = (C0613B) obj;
        return p2.g.a(this.f6319a, c0613b.f6319a) && p2.g.a(this.f6320b, c0613b.f6320b) && p2.g.a(this.f6321c, c0613b.f6321c);
    }

    public final int hashCode() {
        int hashCode = (this.f6320b.hashCode() + (this.f6319a.hashCode() * 31)) * 31;
        q qVar = this.f6321c;
        return hashCode + (qVar != null ? qVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append((Object) W.r.i(b()));
        sb.append(", brush=");
        v vVar = this.f6319a;
        sb.append(vVar.f6445a.c());
        sb.append(", alpha=");
        sb.append(vVar.f6445a.a());
        sb.append(", fontSize=");
        sb.append((Object) G0.h.d(vVar.f6446b));
        sb.append(", fontWeight=");
        sb.append(vVar.f6447c);
        sb.append(", fontStyle=");
        sb.append(vVar.f6448d);
        sb.append(", fontSynthesis=");
        sb.append(vVar.f6449e);
        sb.append(", fontFamily=");
        sb.append(vVar.f6450f);
        sb.append(", fontFeatureSettings=");
        sb.append(vVar.f6451g);
        sb.append(", letterSpacing=");
        sb.append((Object) G0.h.d(vVar.h));
        sb.append(", baselineShift=");
        sb.append(vVar.f6452i);
        sb.append(", textGeometricTransform=");
        sb.append(vVar.f6453j);
        sb.append(", localeList=");
        sb.append(vVar.f6454k);
        sb.append(", background=");
        AbstractC0000a.i(vVar.f6455l, sb, ", textDecoration=");
        sb.append(vVar.f6456m);
        sb.append(", shadow=");
        sb.append(vVar.f6457n);
        sb.append(", drawStyle=");
        sb.append(vVar.f6458o);
        sb.append(", textAlign=");
        n nVar = this.f6320b;
        sb.append((Object) F0.f.b(nVar.f6369a));
        sb.append(", textDirection=");
        sb.append((Object) F0.h.b(nVar.f6370b));
        sb.append(", lineHeight=");
        sb.append((Object) G0.h.d(nVar.f6371c));
        sb.append(", textIndent=");
        sb.append(nVar.f6372d);
        sb.append(", platformStyle=");
        sb.append(this.f6321c);
        sb.append(", lineHeightStyle=");
        sb.append(nVar.f6374f);
        sb.append(", lineBreak=");
        sb.append((Object) AbstractC0090a.h0(nVar.f6375g));
        sb.append(", hyphens=");
        sb.append((Object) r2.a.d0(nVar.h));
        sb.append(", textMotion=");
        sb.append(nVar.f6376i);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0613B(v0.v r3, v0.n r4) {
        /*
            r2 = this;
            r3.getClass()
            v0.p r0 = r4.f6373e
            if (r0 != 0) goto L9
            r0 = 0
            goto Lf
        L9:
            v0.q r1 = new v0.q
            r1.<init>(r0)
            r0 = r1
        Lf:
            r2.<init>(r3, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.C0613B.<init>(v0.v, v0.n):void");
    }
}
