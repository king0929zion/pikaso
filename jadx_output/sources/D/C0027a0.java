package D;

/* renamed from: D.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0027a0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f735a;

    public C0027a0(String str) {
        this.f735a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0027a0) && p2.g.a(this.f735a, ((C0027a0) obj).f735a);
    }

    public final int hashCode() {
        return this.f735a.hashCode();
    }

    public final String toString() {
        return "OpaqueKey(key=" + this.f735a + ')';
    }
}
