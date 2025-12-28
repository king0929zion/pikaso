package androidx.compose.foundation;

import P.k;
import W.D;
import W.H;
import W.r;
import n0.P;
import p.AbstractC0537f;
import p2.g;
import q.j;

/* loaded from: classes.dex */
final class BackgroundElement extends P {

    /* renamed from: a, reason: collision with root package name */
    public final long f3259a;

    /* renamed from: b, reason: collision with root package name */
    public final D f3260b = null;

    /* renamed from: c, reason: collision with root package name */
    public final float f3261c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    public final H f3262d;

    public BackgroundElement(long j3, H h) {
        this.f3259a = j3;
        this.f3262d = h;
    }

    @Override // n0.P
    public final k d() {
        j jVar = new j();
        jVar.f5995q = this.f3259a;
        jVar.f5996r = this.f3260b;
        jVar.f5997s = this.f3261c;
        jVar.f5998t = this.f3262d;
        jVar.f5999u = 9205357640488583168L;
        return jVar;
    }

    @Override // n0.P
    public final void e(k kVar) {
        j jVar = (j) kVar;
        jVar.f5995q = this.f3259a;
        jVar.f5996r = this.f3260b;
        jVar.f5997s = this.f3261c;
        jVar.f5998t = this.f3262d;
    }

    public final boolean equals(Object obj) {
        BackgroundElement backgroundElement = obj instanceof BackgroundElement ? (BackgroundElement) obj : null;
        return backgroundElement != null && r.c(this.f3259a, backgroundElement.f3259a) && g.a(this.f3260b, backgroundElement.f3260b) && this.f3261c == backgroundElement.f3261c && g.a(this.f3262d, backgroundElement.f3262d);
    }

    public final int hashCode() {
        int i3 = r.f2563g;
        int hashCode = Long.hashCode(this.f3259a) * 31;
        D d3 = this.f3260b;
        return this.f3262d.hashCode() + AbstractC0537f.a(this.f3261c, (hashCode + (d3 != null ? d3.hashCode() : 0)) * 31, 31);
    }
}
