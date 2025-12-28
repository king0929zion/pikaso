package x;

/* renamed from: x.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0646k {

    /* renamed from: a, reason: collision with root package name */
    public final String f6638a;

    /* renamed from: b, reason: collision with root package name */
    public String f6639b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6640c = false;

    /* renamed from: d, reason: collision with root package name */
    public C0642g f6641d = null;

    public C0646k(String str, String str2) {
        this.f6638a = str;
        this.f6639b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0646k)) {
            return false;
        }
        C0646k c0646k = (C0646k) obj;
        return p2.g.a(this.f6638a, c0646k.f6638a) && p2.g.a(this.f6639b, c0646k.f6639b) && this.f6640c == c0646k.f6640c && p2.g.a(this.f6641d, c0646k.f6641d);
    }

    public final int hashCode() {
        int hashCode = (Boolean.hashCode(this.f6640c) + ((this.f6639b.hashCode() + (this.f6638a.hashCode() * 31)) * 31)) * 31;
        C0642g c0642g = this.f6641d;
        return hashCode + (c0642g == null ? 0 : c0642g.hashCode());
    }

    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.f6641d + ", isShowingSubstitution=" + this.f6640c + ')';
    }
}
