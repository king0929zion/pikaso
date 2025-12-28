package v0;

import A.AbstractC0000a;
import W.G;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final F0.j f6445a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6446b;

    /* renamed from: c, reason: collision with root package name */
    public final z0.l f6447c;

    /* renamed from: d, reason: collision with root package name */
    public final z0.j f6448d;

    /* renamed from: e, reason: collision with root package name */
    public final z0.k f6449e;

    /* renamed from: f, reason: collision with root package name */
    public final z0.r f6450f;

    /* renamed from: g, reason: collision with root package name */
    public final String f6451g;
    public final long h;

    /* renamed from: i, reason: collision with root package name */
    public final F0.a f6452i;

    /* renamed from: j, reason: collision with root package name */
    public final F0.k f6453j;

    /* renamed from: k, reason: collision with root package name */
    public final B0.c f6454k;

    /* renamed from: l, reason: collision with root package name */
    public final long f6455l;

    /* renamed from: m, reason: collision with root package name */
    public final F0.g f6456m;

    /* renamed from: n, reason: collision with root package name */
    public final G f6457n;

    /* renamed from: o, reason: collision with root package name */
    public final Y.c f6458o;

    public v(long j3, long j4, z0.l lVar, z0.j jVar, z0.k kVar, z0.r rVar, String str, long j5, F0.a aVar, F0.k kVar2, B0.c cVar, long j6, F0.g gVar, G g3, Y.c cVar2) {
        this(j3 != 16 ? new F0.c(j3) : F0.i.f1186a, j4, lVar, jVar, kVar, rVar, str, j5, aVar, kVar2, cVar, j6, gVar, g3, cVar2);
    }

    public final boolean a(v vVar) {
        if (this == vVar) {
            return true;
        }
        return G0.h.a(this.f6446b, vVar.f6446b) && p2.g.a(this.f6447c, vVar.f6447c) && p2.g.a(this.f6448d, vVar.f6448d) && p2.g.a(this.f6449e, vVar.f6449e) && p2.g.a(this.f6450f, vVar.f6450f) && p2.g.a(this.f6451g, vVar.f6451g) && G0.h.a(this.h, vVar.h) && p2.g.a(this.f6452i, vVar.f6452i) && p2.g.a(this.f6453j, vVar.f6453j) && p2.g.a(this.f6454k, vVar.f6454k) && W.r.c(this.f6455l, vVar.f6455l) && p2.g.a(null, null);
    }

    public final boolean b(v vVar) {
        return p2.g.a(this.f6445a, vVar.f6445a) && p2.g.a(this.f6456m, vVar.f6456m) && p2.g.a(this.f6457n, vVar.f6457n) && p2.g.a(this.f6458o, vVar.f6458o);
    }

    public final v c(v vVar) {
        if (vVar == null) {
            return this;
        }
        F0.j jVar = vVar.f6445a;
        return w.a(this, jVar.b(), jVar.c(), jVar.a(), vVar.f6446b, vVar.f6447c, vVar.f6448d, vVar.f6449e, vVar.f6450f, vVar.f6451g, vVar.h, vVar.f6452i, vVar.f6453j, vVar.f6454k, vVar.f6455l, vVar.f6456m, vVar.f6457n, vVar.f6458o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return a(vVar) && b(vVar);
    }

    public final int hashCode() {
        F0.j jVar = this.f6445a;
        long b3 = jVar.b();
        int i3 = W.r.f2563g;
        int hashCode = Long.hashCode(b3) * 31;
        W.D c3 = jVar.c();
        int hashCode2 = (Float.hashCode(jVar.a()) + ((hashCode + (c3 != null ? c3.hashCode() : 0)) * 31)) * 31;
        G0.i[] iVarArr = G0.h.f1262b;
        int b4 = AbstractC0000a.b(hashCode2, 31, this.f6446b);
        z0.l lVar = this.f6447c;
        int i4 = (b4 + (lVar != null ? lVar.f6931d : 0)) * 31;
        z0.j jVar2 = this.f6448d;
        int hashCode3 = (i4 + (jVar2 != null ? Integer.hashCode(jVar2.f6926a) : 0)) * 31;
        z0.k kVar = this.f6449e;
        int hashCode4 = (hashCode3 + (kVar != null ? Integer.hashCode(kVar.f6927a) : 0)) * 31;
        z0.r rVar = this.f6450f;
        int hashCode5 = (hashCode4 + (rVar != null ? rVar.hashCode() : 0)) * 31;
        String str = this.f6451g;
        int b5 = AbstractC0000a.b((hashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, this.h);
        F0.a aVar = this.f6452i;
        int hashCode6 = (b5 + (aVar != null ? Float.hashCode(aVar.f1171a) : 0)) * 31;
        F0.k kVar2 = this.f6453j;
        int hashCode7 = (hashCode6 + (kVar2 != null ? kVar2.hashCode() : 0)) * 31;
        B0.c cVar = this.f6454k;
        int b6 = AbstractC0000a.b((hashCode7 + (cVar != null ? cVar.f276d.hashCode() : 0)) * 31, 31, this.f6455l);
        F0.g gVar = this.f6456m;
        int i5 = (b6 + (gVar != null ? gVar.f1184a : 0)) * 31;
        G g3 = this.f6457n;
        int hashCode8 = (i5 + (g3 != null ? g3.hashCode() : 0)) * 961;
        Y.c cVar2 = this.f6458o;
        return hashCode8 + (cVar2 != null ? cVar2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        F0.j jVar = this.f6445a;
        sb.append((Object) W.r.i(jVar.b()));
        sb.append(", brush=");
        sb.append(jVar.c());
        sb.append(", alpha=");
        sb.append(jVar.a());
        sb.append(", fontSize=");
        sb.append((Object) G0.h.d(this.f6446b));
        sb.append(", fontWeight=");
        sb.append(this.f6447c);
        sb.append(", fontStyle=");
        sb.append(this.f6448d);
        sb.append(", fontSynthesis=");
        sb.append(this.f6449e);
        sb.append(", fontFamily=");
        sb.append(this.f6450f);
        sb.append(", fontFeatureSettings=");
        sb.append(this.f6451g);
        sb.append(", letterSpacing=");
        sb.append((Object) G0.h.d(this.h));
        sb.append(", baselineShift=");
        sb.append(this.f6452i);
        sb.append(", textGeometricTransform=");
        sb.append(this.f6453j);
        sb.append(", localeList=");
        sb.append(this.f6454k);
        sb.append(", background=");
        AbstractC0000a.i(this.f6455l, sb, ", textDecoration=");
        sb.append(this.f6456m);
        sb.append(", shadow=");
        sb.append(this.f6457n);
        sb.append(", platformStyle=null, drawStyle=");
        sb.append(this.f6458o);
        sb.append(')');
        return sb.toString();
    }

    public v(F0.j jVar, long j3, z0.l lVar, z0.j jVar2, z0.k kVar, z0.r rVar, String str, long j4, F0.a aVar, F0.k kVar2, B0.c cVar, long j5, F0.g gVar, G g3, Y.c cVar2) {
        this.f6445a = jVar;
        this.f6446b = j3;
        this.f6447c = lVar;
        this.f6448d = jVar2;
        this.f6449e = kVar;
        this.f6450f = rVar;
        this.f6451g = str;
        this.h = j4;
        this.f6452i = aVar;
        this.f6453j = kVar2;
        this.f6454k = cVar;
        this.f6455l = j5;
        this.f6456m = gVar;
        this.f6457n = g3;
        this.f6458o = cVar2;
    }

    public v(long j3, long j4, z0.l lVar, z0.j jVar, z0.k kVar, z0.r rVar, String str, long j5, F0.a aVar, F0.k kVar2, B0.c cVar, long j6, F0.g gVar, G g3, int i3) {
        this((i3 & 1) != 0 ? W.r.f2562f : j3, (i3 & 2) != 0 ? G0.h.f1263c : j4, (i3 & 4) != 0 ? null : lVar, (i3 & 8) != 0 ? null : jVar, (i3 & 16) != 0 ? null : kVar, (i3 & 32) != 0 ? null : rVar, (i3 & 64) != 0 ? null : str, (i3 & 128) != 0 ? G0.h.f1263c : j5, (i3 & 256) != 0 ? null : aVar, (i3 & 512) != 0 ? null : kVar2, (i3 & 1024) != 0 ? null : cVar, (i3 & 2048) != 0 ? W.r.f2562f : j6, (i3 & 4096) != 0 ? null : gVar, (i3 & 8192) != 0 ? null : g3, (Y.c) null);
    }
}
