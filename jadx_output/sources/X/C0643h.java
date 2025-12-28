package x;

import v0.C0618c;

/* renamed from: x.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0643h {

    /* renamed from: a, reason: collision with root package name */
    public final C0618c f6616a;

    /* renamed from: b, reason: collision with root package name */
    public C0618c f6617b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6618c = false;

    /* renamed from: d, reason: collision with root package name */
    public C0641f f6619d = null;

    public C0643h(C0618c c0618c, C0618c c0618c2) {
        this.f6616a = c0618c;
        this.f6617b = c0618c2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0643h)) {
            return false;
        }
        C0643h c0643h = (C0643h) obj;
        return p2.g.a(this.f6616a, c0643h.f6616a) && p2.g.a(this.f6617b, c0643h.f6617b) && this.f6618c == c0643h.f6618c && p2.g.a(this.f6619d, c0643h.f6619d);
    }

    public final int hashCode() {
        int hashCode = (Boolean.hashCode(this.f6618c) + ((this.f6617b.hashCode() + (this.f6616a.hashCode() * 31)) * 31)) * 31;
        C0641f c0641f = this.f6619d;
        return hashCode + (c0641f == null ? 0 : c0641f.hashCode());
    }

    public final String toString() {
        return "TextSubstitutionValue(original=" + ((Object) this.f6616a) + ", substitution=" + ((Object) this.f6617b) + ", isShowingSubstitution=" + this.f6618c + ", layoutCache=" + this.f6619d + ')';
    }
}
