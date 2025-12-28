package p;

/* renamed from: p.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0522A implements InterfaceC0539h {

    /* renamed from: a, reason: collision with root package name */
    public final float f5819a = 1.0f;

    /* renamed from: b, reason: collision with root package name */
    public final float f5820b = 1500.0f;

    /* renamed from: c, reason: collision with root package name */
    public final Object f5821c;

    public C0522A(Object obj) {
        this.f5821c = obj;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [o2.c, p2.h] */
    @Override // p.InterfaceC0539h
    public final InterfaceC0531J a(B2.i iVar) {
        Object obj = this.f5821c;
        return new k.H(this.f5819a, this.f5820b, obj == null ? null : (n) ((p2.h) iVar.f316e).i(obj));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0522A)) {
            return false;
        }
        C0522A c0522a = (C0522A) obj;
        return c0522a.f5819a == this.f5819a && c0522a.f5820b == this.f5820b && p2.g.a(c0522a.f5821c, this.f5821c);
    }

    public final int hashCode() {
        Object obj = this.f5821c;
        return Float.hashCode(this.f5820b) + AbstractC0537f.a(this.f5819a, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }
}
