package v0;

/* renamed from: v0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0615D {

    /* renamed from: a, reason: collision with root package name */
    public final String f6323a;

    public C0615D(String str) {
        this.f6323a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0615D) {
            return p2.g.a(this.f6323a, ((C0615D) obj).f6323a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6323a.hashCode();
    }

    public final String toString() {
        return "VerbatimTtsAnnotation(verbatim=" + this.f6323a + ')';
    }
}
