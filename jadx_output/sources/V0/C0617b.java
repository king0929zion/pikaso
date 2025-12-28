package v0;

import A.AbstractC0000a;

/* renamed from: v0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0617b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f6330a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6331b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6332c;

    /* renamed from: d, reason: collision with root package name */
    public final String f6333d;

    public C0617b(Object obj, int i3, int i4, String str) {
        this.f6330a = obj;
        this.f6331b = i3;
        this.f6332c = i4;
        this.f6333d = str;
        if (i3 > i4) {
            throw new IllegalArgumentException("Reversed range is not supported");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0617b)) {
            return false;
        }
        C0617b c0617b = (C0617b) obj;
        return p2.g.a(this.f6330a, c0617b.f6330a) && this.f6331b == c0617b.f6331b && this.f6332c == c0617b.f6332c && p2.g.a(this.f6333d, c0617b.f6333d);
    }

    public final int hashCode() {
        Object obj = this.f6330a;
        return this.f6333d.hashCode() + AbstractC0000a.a(this.f6332c, AbstractC0000a.a(this.f6331b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        return "Range(item=" + this.f6330a + ", start=" + this.f6331b + ", end=" + this.f6332c + ", tag=" + this.f6333d + ')';
    }

    public C0617b(int i3, int i4, Object obj) {
        this(obj, i3, i4, "");
    }
}
