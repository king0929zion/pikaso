package Y;

import W.o;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public G0.b f2765a;

    /* renamed from: b, reason: collision with root package name */
    public G0.f f2766b;

    /* renamed from: c, reason: collision with root package name */
    public o f2767c;

    /* renamed from: d, reason: collision with root package name */
    public long f2768d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return p2.g.a(this.f2765a, aVar.f2765a) && this.f2766b == aVar.f2766b && p2.g.a(this.f2767c, aVar.f2767c) && V.f.a(this.f2768d, aVar.f2768d);
    }

    public final int hashCode() {
        return Long.hashCode(this.f2768d) + ((this.f2767c.hashCode() + ((this.f2766b.hashCode() + (this.f2765a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DrawParams(density=" + this.f2765a + ", layoutDirection=" + this.f2766b + ", canvas=" + this.f2767c + ", size=" + ((Object) V.f.f(this.f2768d)) + ')';
    }
}
