package androidx.compose.ui.draw;

import P.d;
import P.k;
import T.c;
import V.f;
import W.C0089l;
import b0.AbstractC0135b;
import l0.C0354d;
import n0.AbstractC0409C;
import n0.P;
import p.AbstractC0537f;
import p2.g;

/* loaded from: classes.dex */
final class PainterElement extends P {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0135b f3308a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3309b;

    /* renamed from: c, reason: collision with root package name */
    public final d f3310c;

    /* renamed from: d, reason: collision with root package name */
    public final C0354d f3311d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3312e;

    /* renamed from: f, reason: collision with root package name */
    public final C0089l f3313f;

    public PainterElement(AbstractC0135b abstractC0135b, boolean z3, d dVar, C0354d c0354d, float f3, C0089l c0089l) {
        this.f3308a = abstractC0135b;
        this.f3309b = z3;
        this.f3310c = dVar;
        this.f3311d = c0354d;
        this.f3312e = f3;
        this.f3313f = c0089l;
    }

    @Override // n0.P
    public final k d() {
        c cVar = new c();
        cVar.f2325q = this.f3308a;
        cVar.f2326r = this.f3309b;
        cVar.f2327s = this.f3310c;
        cVar.f2328t = this.f3311d;
        cVar.f2329u = this.f3312e;
        cVar.f2330v = this.f3313f;
        return cVar;
    }

    @Override // n0.P
    public final void e(k kVar) {
        c cVar = (c) kVar;
        boolean z3 = cVar.f2326r;
        AbstractC0135b abstractC0135b = this.f3308a;
        boolean z4 = this.f3309b;
        boolean z5 = z3 != z4 || (z4 && !f.a(cVar.f2325q.d(), abstractC0135b.d()));
        cVar.f2325q = abstractC0135b;
        cVar.f2326r = z4;
        cVar.f2327s = this.f3310c;
        cVar.f2328t = this.f3311d;
        cVar.f2329u = this.f3312e;
        cVar.f2330v = this.f3313f;
        if (z5) {
            AbstractC0409C.l(cVar);
        }
        AbstractC0409C.k(cVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        return g.a(this.f3308a, painterElement.f3308a) && this.f3309b == painterElement.f3309b && g.a(this.f3310c, painterElement.f3310c) && g.a(this.f3311d, painterElement.f3311d) && Float.compare(this.f3312e, painterElement.f3312e) == 0 && g.a(this.f3313f, painterElement.f3313f);
    }

    public final int hashCode() {
        int a3 = AbstractC0537f.a(this.f3312e, (this.f3311d.hashCode() + ((this.f3310c.hashCode() + ((Boolean.hashCode(this.f3309b) + (this.f3308a.hashCode() * 31)) * 31)) * 31)) * 31, 31);
        C0089l c0089l = this.f3313f;
        return a3 + (c0089l == null ? 0 : c0089l.hashCode());
    }

    public final String toString() {
        return "PainterElement(painter=" + this.f3308a + ", sizeToIntrinsics=" + this.f3309b + ", alignment=" + this.f3310c + ", contentScale=" + this.f3311d + ", alpha=" + this.f3312e + ", colorFilter=" + this.f3313f + ')';
    }
}
