package A;

import v.C0610d;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final C0610d f14a;

    /* renamed from: b, reason: collision with root package name */
    public final C0610d f15b;

    /* renamed from: c, reason: collision with root package name */
    public final C0610d f16c;

    /* renamed from: d, reason: collision with root package name */
    public final C0610d f17d;

    /* renamed from: e, reason: collision with root package name */
    public final C0610d f18e;

    public G() {
        C0610d c0610d = F.f9a;
        C0610d c0610d2 = F.f10b;
        C0610d c0610d3 = F.f11c;
        C0610d c0610d4 = F.f12d;
        C0610d c0610d5 = F.f13e;
        this.f14a = c0610d;
        this.f15b = c0610d2;
        this.f16c = c0610d3;
        this.f17d = c0610d4;
        this.f18e = c0610d5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g3 = (G) obj;
        return p2.g.a(this.f14a, g3.f14a) && p2.g.a(this.f15b, g3.f15b) && p2.g.a(this.f16c, g3.f16c) && p2.g.a(this.f17d, g3.f17d) && p2.g.a(this.f18e, g3.f18e);
    }

    public final int hashCode() {
        return this.f18e.hashCode() + ((this.f17d.hashCode() + ((this.f16c.hashCode() + ((this.f15b.hashCode() + (this.f14a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.f14a + ", small=" + this.f15b + ", medium=" + this.f16c + ", large=" + this.f17d + ", extraLarge=" + this.f18e + ')';
    }
}
