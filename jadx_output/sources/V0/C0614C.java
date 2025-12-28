package v0;

/* renamed from: v0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0614C {

    /* renamed from: a, reason: collision with root package name */
    public final String f6322a;

    public C0614C(String str) {
        this.f6322a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0614C) {
            return p2.g.a(this.f6322a, ((C0614C) obj).f6322a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6322a.hashCode();
    }

    public final String toString() {
        return "UrlAnnotation(url=" + this.f6322a + ')';
    }
}
