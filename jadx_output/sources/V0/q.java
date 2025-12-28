package v0;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final p f6379a;

    public q(p pVar) {
        this.f6379a = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (!p2.g.a(this.f6379a, qVar.f6379a)) {
            return false;
        }
        qVar.getClass();
        return p2.g.a(null, null);
    }

    public final int hashCode() {
        p pVar = this.f6379a;
        if (pVar != null) {
            return pVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=null, paragraphSyle=" + this.f6379a + ')';
    }
}
