package V;

import a.AbstractC0090a;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public float f2440a;

    /* renamed from: b, reason: collision with root package name */
    public float f2441b;

    /* renamed from: c, reason: collision with root package name */
    public float f2442c;

    /* renamed from: d, reason: collision with root package name */
    public float f2443d;

    public final void a(float f3, float f4, float f5, float f6) {
        this.f2440a = Math.max(f3, this.f2440a);
        this.f2441b = Math.max(f4, this.f2441b);
        this.f2442c = Math.min(f5, this.f2442c);
        this.f2443d = Math.min(f6, this.f2443d);
    }

    public final boolean b() {
        return this.f2440a >= this.f2442c || this.f2441b >= this.f2443d;
    }

    public final String toString() {
        return "MutableRect(" + AbstractC0090a.j0(this.f2440a) + ", " + AbstractC0090a.j0(this.f2441b) + ", " + AbstractC0090a.j0(this.f2442c) + ", " + AbstractC0090a.j0(this.f2443d) + ')';
    }
}
