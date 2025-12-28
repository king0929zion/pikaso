package G0;

import a.AbstractC0090a;
import p.AbstractC0537f;

/* loaded from: classes.dex */
public final class d implements b {

    /* renamed from: d, reason: collision with root package name */
    public final float f1254d;

    /* renamed from: e, reason: collision with root package name */
    public final float f1255e;

    /* renamed from: f, reason: collision with root package name */
    public final H0.a f1256f;

    public d(float f3, float f4, H0.a aVar) {
        this.f1254d = f3;
        this.f1255e = f4;
        this.f1256f = aVar;
    }

    @Override // G0.b
    public final float O(long j3) {
        if (i.a(h.b(j3), 4294967296L)) {
            return this.f1256f.b(h.c(j3));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f1254d, dVar.f1254d) == 0 && Float.compare(this.f1255e, dVar.f1255e) == 0 && p2.g.a(this.f1256f, dVar.f1256f);
    }

    @Override // G0.b
    public final float f() {
        return this.f1255e;
    }

    public final int hashCode() {
        return this.f1256f.hashCode() + AbstractC0537f.a(this.f1255e, Float.hashCode(this.f1254d) * 31, 31);
    }

    @Override // G0.b
    public final float n() {
        return this.f1254d;
    }

    @Override // G0.b
    public final long s(float f3) {
        return AbstractC0090a.W(4294967296L, this.f1256f.a(f3));
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.f1254d + ", fontScale=" + this.f1255e + ", converter=" + this.f1256f + ')';
    }
}
