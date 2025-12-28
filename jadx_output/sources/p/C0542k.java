package p;

/* renamed from: p.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0542k extends n {

    /* renamed from: a, reason: collision with root package name */
    public float f5897a;

    /* renamed from: b, reason: collision with root package name */
    public float f5898b;

    public C0542k(float f3, float f4) {
        this.f5897a = f3;
        this.f5898b = f4;
    }

    @Override // p.n
    public final float a(int i3) {
        if (i3 == 0) {
            return this.f5897a;
        }
        if (i3 != 1) {
            return 0.0f;
        }
        return this.f5898b;
    }

    @Override // p.n
    public final int b() {
        return 2;
    }

    @Override // p.n
    public final n c() {
        return new C0542k(0.0f, 0.0f);
    }

    @Override // p.n
    public final void d() {
        this.f5897a = 0.0f;
        this.f5898b = 0.0f;
    }

    @Override // p.n
    public final void e(int i3, float f3) {
        if (i3 == 0) {
            this.f5897a = f3;
        } else {
            if (i3 != 1) {
                return;
            }
            this.f5898b = f3;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0542k) {
            C0542k c0542k = (C0542k) obj;
            if (c0542k.f5897a == this.f5897a && c0542k.f5898b == this.f5898b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5898b) + (Float.hashCode(this.f5897a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.f5897a + ", v2 = " + this.f5898b;
    }
}
