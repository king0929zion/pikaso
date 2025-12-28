package p;

/* renamed from: p.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0528G implements InterfaceC0539h {

    /* renamed from: a, reason: collision with root package name */
    public final int f5847a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5848b;

    /* renamed from: c, reason: collision with root package name */
    public final r f5849c;

    public C0528G(int i3, int i4, r rVar) {
        this.f5847a = i3;
        this.f5848b = i4;
        this.f5849c = rVar;
    }

    @Override // p.InterfaceC0539h
    public final InterfaceC0531J a(B2.i iVar) {
        return new J1.b(this.f5847a, this.f5848b, this.f5849c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0528G)) {
            return false;
        }
        C0528G c0528g = (C0528G) obj;
        return c0528g.f5847a == this.f5847a && c0528g.f5848b == this.f5848b && p2.g.a(c0528g.f5849c, this.f5849c);
    }

    public final int hashCode() {
        return ((this.f5849c.hashCode() + (this.f5847a * 31)) * 31) + this.f5848b;
    }
}
