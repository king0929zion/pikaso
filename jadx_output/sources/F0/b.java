package F0;

import A.AbstractC0000a;
import W.D;
import W.n;
import W.r;

/* loaded from: classes.dex */
public final class b implements j {

    /* renamed from: a, reason: collision with root package name */
    public final n f1172a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1173b;

    public b(n nVar, float f3) {
        this.f1172a = nVar;
        this.f1173b = f3;
    }

    @Override // F0.j
    public final float a() {
        return this.f1173b;
    }

    @Override // F0.j
    public final long b() {
        int i3 = r.f2563g;
        return r.f2562f;
    }

    @Override // F0.j
    public final D c() {
        return this.f1172a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return p2.g.a(this.f1172a, bVar.f1172a) && Float.compare(this.f1173b, bVar.f1173b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1173b) + (this.f1172a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrushStyle(value=");
        sb.append(this.f1172a);
        sb.append(", alpha=");
        return AbstractC0000a.f(sb, this.f1173b, ')');
    }
}
