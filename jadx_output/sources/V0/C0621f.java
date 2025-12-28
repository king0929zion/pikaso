package v0;

/* renamed from: v0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0621f extends AbstractC0623h {

    /* renamed from: a, reason: collision with root package name */
    public final String f6346a;

    /* renamed from: b, reason: collision with root package name */
    public final z f6347b;

    public C0621f(String str, z zVar) {
        this.f6346a = str;
        this.f6347b = zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0621f)) {
            return false;
        }
        C0621f c0621f = (C0621f) obj;
        if (!p2.g.a(this.f6346a, c0621f.f6346a)) {
            return false;
        }
        if (!p2.g.a(this.f6347b, c0621f.f6347b)) {
            return false;
        }
        c0621f.getClass();
        return p2.g.a(null, null);
    }

    public final int hashCode() {
        int hashCode = this.f6346a.hashCode() * 31;
        z zVar = this.f6347b;
        return (hashCode + (zVar != null ? zVar.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "LinkAnnotation.Clickable(tag=" + this.f6346a + ')';
    }
}
