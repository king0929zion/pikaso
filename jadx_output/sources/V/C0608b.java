package v;

/* renamed from: v.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0608b implements InterfaceC0607a {

    /* renamed from: a, reason: collision with root package name */
    public final float f6308a;

    public C0608b(float f3) {
        this.f6308a = f3;
    }

    @Override // v.InterfaceC0607a
    public final float a(long j3, G0.b bVar) {
        return bVar.u(this.f6308a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0608b) && G0.e.a(this.f6308a, ((C0608b) obj).f6308a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f6308a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f6308a + ".dp)";
    }
}
