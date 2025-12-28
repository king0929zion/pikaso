package p;

/* renamed from: p.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0541j extends n {

    /* renamed from: a, reason: collision with root package name */
    public float f5896a;

    public C0541j(float f3) {
        this.f5896a = f3;
    }

    @Override // p.n
    public final float a(int i3) {
        if (i3 == 0) {
            return this.f5896a;
        }
        return 0.0f;
    }

    @Override // p.n
    public final int b() {
        return 1;
    }

    @Override // p.n
    public final n c() {
        return new C0541j(0.0f);
    }

    @Override // p.n
    public final void d() {
        this.f5896a = 0.0f;
    }

    @Override // p.n
    public final void e(int i3, float f3) {
        if (i3 == 0) {
            this.f5896a = f3;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0541j) && ((C0541j) obj).f5896a == this.f5896a;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5896a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.f5896a;
    }
}
