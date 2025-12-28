package z0;

import A.AbstractC0000a;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final r f6936a;

    /* renamed from: b, reason: collision with root package name */
    public final l f6937b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6938c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6939d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f6940e;

    public s(r rVar, l lVar, int i3, int i4, Object obj) {
        this.f6936a = rVar;
        this.f6937b = lVar;
        this.f6938c = i3;
        this.f6939d = i4;
        this.f6940e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return p2.g.a(this.f6936a, sVar.f6936a) && p2.g.a(this.f6937b, sVar.f6937b) && j.a(this.f6938c, sVar.f6938c) && k.a(this.f6939d, sVar.f6939d) && p2.g.a(this.f6940e, sVar.f6940e);
    }

    public final int hashCode() {
        r rVar = this.f6936a;
        int a3 = AbstractC0000a.a(this.f6939d, AbstractC0000a.a(this.f6938c, (((rVar == null ? 0 : rVar.hashCode()) * 31) + this.f6937b.f6931d) * 31, 31), 31);
        Object obj = this.f6940e;
        return a3 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.f6936a);
        sb.append(", fontWeight=");
        sb.append(this.f6937b);
        sb.append(", fontStyle=");
        int i3 = this.f6938c;
        sb.append((Object) (j.a(i3, 0) ? "Normal" : j.a(i3, 1) ? "Italic" : "Invalid"));
        sb.append(", fontSynthesis=");
        sb.append((Object) k.b(this.f6939d));
        sb.append(", resourceLoaderCacheKey=");
        sb.append(this.f6940e);
        sb.append(')');
        return sb.toString();
    }
}
