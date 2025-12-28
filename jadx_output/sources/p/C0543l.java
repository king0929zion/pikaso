package p;

/* renamed from: p.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0543l extends n {

    /* renamed from: a, reason: collision with root package name */
    public float f5899a;

    /* renamed from: b, reason: collision with root package name */
    public float f5900b;

    /* renamed from: c, reason: collision with root package name */
    public float f5901c;

    public C0543l(float f3, float f4, float f5) {
        this.f5899a = f3;
        this.f5900b = f4;
        this.f5901c = f5;
    }

    @Override // p.n
    public final float a(int i3) {
        if (i3 == 0) {
            return this.f5899a;
        }
        if (i3 == 1) {
            return this.f5900b;
        }
        if (i3 != 2) {
            return 0.0f;
        }
        return this.f5901c;
    }

    @Override // p.n
    public final int b() {
        return 3;
    }

    @Override // p.n
    public final n c() {
        return new C0543l(0.0f, 0.0f, 0.0f);
    }

    @Override // p.n
    public final void d() {
        this.f5899a = 0.0f;
        this.f5900b = 0.0f;
        this.f5901c = 0.0f;
    }

    @Override // p.n
    public final void e(int i3, float f3) {
        if (i3 == 0) {
            this.f5899a = f3;
        } else if (i3 == 1) {
            this.f5900b = f3;
        } else {
            if (i3 != 2) {
                return;
            }
            this.f5901c = f3;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0543l) {
            C0543l c0543l = (C0543l) obj;
            if (c0543l.f5899a == this.f5899a && c0543l.f5900b == this.f5900b && c0543l.f5901c == this.f5901c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5901c) + AbstractC0537f.a(this.f5900b, Float.hashCode(this.f5899a) * 31, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.f5899a + ", v2 = " + this.f5900b + ", v3 = " + this.f5901c;
    }
}
