package p2;

import c2.InterfaceC0164c;

/* loaded from: classes.dex */
public abstract class f extends b implements e, v2.a, InterfaceC0164c {

    /* renamed from: j, reason: collision with root package name */
    public final int f5952j;

    /* renamed from: k, reason: collision with root package name */
    public final int f5953k;

    public f(int i3, Class cls, String str, String str2, int i4) {
        this(i3, a.f5943d, cls, str, str2, i4);
    }

    @Override // p2.b
    public final v2.a b() {
        p.f5961a.getClass();
        return this;
    }

    @Override // p2.e
    public final int e() {
        return this.f5952j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return this.f5947g.equals(fVar.f5947g) && this.h.equals(fVar.h) && this.f5953k == fVar.f5953k && this.f5952j == fVar.f5952j && g.a(this.f5945e, fVar.f5945e) && d().equals(fVar.d());
        }
        if (!(obj instanceof f)) {
            return false;
        }
        v2.a aVar = this.f5944d;
        if (aVar == null) {
            b();
            this.f5944d = this;
            aVar = this;
        }
        return obj.equals(aVar);
    }

    public final int hashCode() {
        d();
        return this.h.hashCode() + ((this.f5947g.hashCode() + (d().hashCode() * 31)) * 31);
    }

    public final String toString() {
        v2.a aVar = this.f5944d;
        if (aVar == null) {
            b();
            this.f5944d = this;
            aVar = this;
        }
        if (aVar != this) {
            return aVar.toString();
        }
        String str = this.f5947g;
        if ("<init>".equals(str)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + str + " (Kotlin reflection is not available)";
    }

    public f(int i3, Object obj, Class cls, String str, String str2, int i4) {
        super(obj, cls, str, str2, (i4 & 1) == 1);
        this.f5952j = i3;
        this.f5953k = 0;
    }
}
