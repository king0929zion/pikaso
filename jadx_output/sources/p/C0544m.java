package p;

/* renamed from: p.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0544m extends n {

    /* renamed from: a, reason: collision with root package name */
    public float f5902a;

    /* renamed from: b, reason: collision with root package name */
    public float f5903b;

    /* renamed from: c, reason: collision with root package name */
    public float f5904c;

    /* renamed from: d, reason: collision with root package name */
    public float f5905d;

    public C0544m(float f3, float f4, float f5, float f6) {
        this.f5902a = f3;
        this.f5903b = f4;
        this.f5904c = f5;
        this.f5905d = f6;
    }

    @Override // p.n
    public final float a(int i3) {
        if (i3 == 0) {
            return this.f5902a;
        }
        if (i3 == 1) {
            return this.f5903b;
        }
        if (i3 == 2) {
            return this.f5904c;
        }
        if (i3 != 3) {
            return 0.0f;
        }
        return this.f5905d;
    }

    @Override // p.n
    public final int b() {
        return 4;
    }

    @Override // p.n
    public final n c() {
        return new C0544m(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // p.n
    public final void d() {
        this.f5902a = 0.0f;
        this.f5903b = 0.0f;
        this.f5904c = 0.0f;
        this.f5905d = 0.0f;
    }

    @Override // p.n
    public final void e(int i3, float f3) {
        if (i3 == 0) {
            this.f5902a = f3;
            return;
        }
        if (i3 == 1) {
            this.f5903b = f3;
        } else if (i3 == 2) {
            this.f5904c = f3;
        } else {
            if (i3 != 3) {
                return;
            }
            this.f5905d = f3;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0544m) {
            C0544m c0544m = (C0544m) obj;
            if (c0544m.f5902a == this.f5902a && c0544m.f5903b == this.f5903b && c0544m.f5904c == this.f5904c && c0544m.f5905d == this.f5905d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5905d) + AbstractC0537f.a(this.f5904c, AbstractC0537f.a(this.f5903b, Float.hashCode(this.f5902a) * 31, 31), 31);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.f5902a + ", v2 = " + this.f5903b + ", v3 = " + this.f5904c + ", v4 = " + this.f5905d;
    }
}
