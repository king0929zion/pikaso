package Y;

import A.AbstractC0000a;
import W.D;
import p.AbstractC0537f;

/* loaded from: classes.dex */
public final class g extends c {

    /* renamed from: b, reason: collision with root package name */
    public final float f2775b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2776c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2777d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2778e;

    public g(float f3, float f4, int i3, int i4, int i5) {
        f4 = (i5 & 2) != 0 ? 4.0f : f4;
        i3 = (i5 & 4) != 0 ? 0 : i3;
        i4 = (i5 & 8) != 0 ? 0 : i4;
        this.f2775b = f3;
        this.f2776c = f4;
        this.f2777d = i3;
        this.f2778e = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f2775b == gVar.f2775b && this.f2776c == gVar.f2776c && D.p(this.f2777d, gVar.f2777d) && D.q(this.f2778e, gVar.f2778e) && p2.g.a(null, null);
    }

    public final int hashCode() {
        return AbstractC0000a.a(this.f2778e, AbstractC0000a.a(this.f2777d, AbstractC0537f.a(this.f2776c, Float.hashCode(this.f2775b) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Stroke(width=");
        sb.append(this.f2775b);
        sb.append(", miter=");
        sb.append(this.f2776c);
        sb.append(", cap=");
        int i3 = this.f2777d;
        String str = "Unknown";
        sb.append((Object) (D.p(i3, 0) ? "Butt" : D.p(i3, 1) ? "Round" : D.p(i3, 2) ? "Square" : "Unknown"));
        sb.append(", join=");
        int i4 = this.f2778e;
        if (D.q(i4, 0)) {
            str = "Miter";
        } else if (D.q(i4, 1)) {
            str = "Round";
        } else if (D.q(i4, 2)) {
            str = "Bevel";
        }
        sb.append((Object) str);
        sb.append(", pathEffect=null)");
        return sb.toString();
    }
}
