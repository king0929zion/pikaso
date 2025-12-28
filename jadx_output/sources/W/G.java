package W;

import A.AbstractC0000a;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: d, reason: collision with root package name */
    public static final G f2508d = new G(D.c(4278190080L), 0, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final long f2509a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2510b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2511c;

    public G(long j3, long j4, float f3) {
        this.f2509a = j3;
        this.f2510b = j4;
        this.f2511c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g3 = (G) obj;
        return r.c(this.f2509a, g3.f2509a) && V.c.a(this.f2510b, g3.f2510b) && this.f2511c == g3.f2511c;
    }

    public final int hashCode() {
        int i3 = r.f2563g;
        return Float.hashCode(this.f2511c) + AbstractC0000a.b(Long.hashCode(this.f2509a) * 31, 31, this.f2510b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        AbstractC0000a.i(this.f2509a, sb, ", offset=");
        sb.append((Object) V.c.g(this.f2510b));
        sb.append(", blurRadius=");
        return AbstractC0000a.f(sb, this.f2511c, ')');
    }
}
