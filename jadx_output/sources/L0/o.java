package l0;

import a.AbstractC0090a;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: d, reason: collision with root package name */
    public int f4927d;

    /* renamed from: e, reason: collision with root package name */
    public int f4928e;

    /* renamed from: f, reason: collision with root package name */
    public long f4929f = r2.a.d(0, 0);

    /* renamed from: g, reason: collision with root package name */
    public long f4930g = q.f4934a;
    public long h = 0;

    public final int D() {
        return (int) (this.f4929f >> 32);
    }

    public final void F() {
        this.f4927d = Z.b.k((int) (this.f4929f >> 32), G0.a.j(this.f4930g), G0.a.h(this.f4930g));
        int k3 = Z.b.k((int) (this.f4929f & 4294967295L), G0.a.i(this.f4930g), G0.a.g(this.f4930g));
        this.f4928e = k3;
        int i3 = this.f4927d;
        long j3 = this.f4929f;
        this.h = r2.a.c((i3 - ((int) (j3 >> 32))) / 2, (k3 - ((int) (j3 & 4294967295L))) / 2);
    }

    public abstract void G(long j3, float f3, o2.c cVar);

    public final void I(long j3) {
        if (AbstractC0090a.x(this.f4929f, j3)) {
            return;
        }
        this.f4929f = j3;
        F();
    }

    public final void K(long j3) {
        if (G0.a.b(this.f4930g, j3)) {
            return;
        }
        this.f4930g = j3;
        F();
    }

    public abstract Object o();
}
