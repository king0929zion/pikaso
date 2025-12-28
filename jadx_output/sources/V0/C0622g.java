package v0;

/* renamed from: v0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0622g extends AbstractC0623h {

    /* renamed from: a, reason: collision with root package name */
    public final String f6348a;

    /* renamed from: b, reason: collision with root package name */
    public final z f6349b;

    public C0622g(String str, z zVar) {
        this.f6348a = str;
        this.f6349b = zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0622g)) {
            return false;
        }
        C0622g c0622g = (C0622g) obj;
        if (!p2.g.a(this.f6348a, c0622g.f6348a)) {
            return false;
        }
        if (!p2.g.a(this.f6349b, c0622g.f6349b)) {
            return false;
        }
        c0622g.getClass();
        return p2.g.a(null, null);
    }

    public final int hashCode() {
        int hashCode = this.f6348a.hashCode() * 31;
        z zVar = this.f6349b;
        return (hashCode + (zVar != null ? zVar.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "LinkAnnotation.Url(url=" + this.f6348a + ')';
    }
}
