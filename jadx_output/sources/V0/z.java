package v0;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final v f6478a;

    /* renamed from: b, reason: collision with root package name */
    public final v f6479b;

    /* renamed from: c, reason: collision with root package name */
    public final v f6480c;

    /* renamed from: d, reason: collision with root package name */
    public final v f6481d;

    public z(v vVar, v vVar2, v vVar3, v vVar4) {
        this.f6478a = vVar;
        this.f6479b = vVar2;
        this.f6480c = vVar3;
        this.f6481d = vVar4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return p2.g.a(this.f6478a, zVar.f6478a) && p2.g.a(this.f6479b, zVar.f6479b) && p2.g.a(this.f6480c, zVar.f6480c) && p2.g.a(this.f6481d, zVar.f6481d);
    }

    public final int hashCode() {
        v vVar = this.f6478a;
        int hashCode = (vVar != null ? vVar.hashCode() : 0) * 31;
        v vVar2 = this.f6479b;
        int hashCode2 = (hashCode + (vVar2 != null ? vVar2.hashCode() : 0)) * 31;
        v vVar3 = this.f6480c;
        int hashCode3 = (hashCode2 + (vVar3 != null ? vVar3.hashCode() : 0)) * 31;
        v vVar4 = this.f6481d;
        return hashCode3 + (vVar4 != null ? vVar4.hashCode() : 0);
    }
}
