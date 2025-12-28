package v0;

import A.AbstractC0000a;
import a.AbstractC0090a;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final int f6369a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6370b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6371c;

    /* renamed from: d, reason: collision with root package name */
    public final F0.l f6372d;

    /* renamed from: e, reason: collision with root package name */
    public final p f6373e;

    /* renamed from: f, reason: collision with root package name */
    public final F0.e f6374f;

    /* renamed from: g, reason: collision with root package name */
    public final int f6375g;
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final F0.m f6376i;

    public n(int i3, int i4, long j3, F0.l lVar, p pVar, F0.e eVar, int i5, int i6, F0.m mVar) {
        this.f6369a = i3;
        this.f6370b = i4;
        this.f6371c = j3;
        this.f6372d = lVar;
        this.f6373e = pVar;
        this.f6374f = eVar;
        this.f6375g = i5;
        this.h = i6;
        this.f6376i = mVar;
        if (G0.h.a(j3, G0.h.f1263c) || G0.h.c(j3) >= 0.0f) {
            return;
        }
        throw new IllegalStateException(("lineHeight can't be negative (" + G0.h.c(j3) + ')').toString());
    }

    public final n a(n nVar) {
        if (nVar == null) {
            return this;
        }
        return o.a(this, nVar.f6369a, nVar.f6370b, nVar.f6371c, nVar.f6372d, nVar.f6373e, nVar.f6374f, nVar.f6375g, nVar.h, nVar.f6376i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return F0.f.a(this.f6369a, nVar.f6369a) && F0.h.a(this.f6370b, nVar.f6370b) && G0.h.a(this.f6371c, nVar.f6371c) && p2.g.a(this.f6372d, nVar.f6372d) && p2.g.a(this.f6373e, nVar.f6373e) && p2.g.a(this.f6374f, nVar.f6374f) && this.f6375g == nVar.f6375g && r2.a.u(this.h, nVar.h) && p2.g.a(this.f6376i, nVar.f6376i);
    }

    public final int hashCode() {
        int a3 = AbstractC0000a.a(this.f6370b, Integer.hashCode(this.f6369a) * 31, 31);
        G0.i[] iVarArr = G0.h.f1262b;
        int b3 = AbstractC0000a.b(a3, 31, this.f6371c);
        F0.l lVar = this.f6372d;
        int hashCode = (b3 + (lVar != null ? lVar.hashCode() : 0)) * 31;
        p pVar = this.f6373e;
        int hashCode2 = (hashCode + (pVar != null ? pVar.hashCode() : 0)) * 31;
        F0.e eVar = this.f6374f;
        int a4 = AbstractC0000a.a(this.h, AbstractC0000a.a(this.f6375g, (hashCode2 + (eVar != null ? eVar.hashCode() : 0)) * 31, 31), 31);
        F0.m mVar = this.f6376i;
        return a4 + (mVar != null ? mVar.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) F0.f.b(this.f6369a)) + ", textDirection=" + ((Object) F0.h.b(this.f6370b)) + ", lineHeight=" + ((Object) G0.h.d(this.f6371c)) + ", textIndent=" + this.f6372d + ", platformStyle=" + this.f6373e + ", lineHeightStyle=" + this.f6374f + ", lineBreak=" + ((Object) AbstractC0090a.h0(this.f6375g)) + ", hyphens=" + ((Object) r2.a.d0(this.h)) + ", textMotion=" + this.f6376i + ')';
    }
}
