package y2;

/* renamed from: y2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0681n {

    /* renamed from: a, reason: collision with root package name */
    public final Object f6807a;

    /* renamed from: b, reason: collision with root package name */
    public final o2.c f6808b;

    public C0681n(Object obj, o2.c cVar) {
        this.f6807a = obj;
        this.f6808b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0681n)) {
            return false;
        }
        C0681n c0681n = (C0681n) obj;
        return p2.g.a(this.f6807a, c0681n.f6807a) && p2.g.a(this.f6808b, c0681n.f6808b);
    }

    public final int hashCode() {
        Object obj = this.f6807a;
        return this.f6808b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "CompletedWithCancellation(result=" + this.f6807a + ", onCancellation=" + this.f6808b + ')';
    }
}
