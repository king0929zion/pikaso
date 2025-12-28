package b0;

import A.AbstractC0000a;
import V.f;
import W.C0083f;
import W.C0089l;
import W.D;
import Y.d;
import a.AbstractC0090a;
import n0.C0408B;
import p2.g;

/* renamed from: b0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0134a extends AbstractC0135b {

    /* renamed from: e, reason: collision with root package name */
    public final C0083f f3632e;

    /* renamed from: f, reason: collision with root package name */
    public final long f3633f;

    /* renamed from: g, reason: collision with root package name */
    public final long f3634g;
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final long f3635i;

    /* renamed from: j, reason: collision with root package name */
    public float f3636j;

    /* renamed from: k, reason: collision with root package name */
    public C0089l f3637k;

    public C0134a(C0083f c0083f) {
        int i3;
        int i4;
        long d3 = r2.a.d(c0083f.f2538a.getWidth(), c0083f.f2538a.getHeight());
        this.f3632e = c0083f;
        this.f3633f = 0L;
        this.f3634g = d3;
        this.h = 1;
        if (((int) 0) < 0 || ((int) 0) < 0 || (i3 = (int) (d3 >> 32)) < 0 || (i4 = (int) (4294967295L & d3)) < 0 || i3 > c0083f.f2538a.getWidth() || i4 > c0083f.f2538a.getHeight()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f3635i = d3;
        this.f3636j = 1.0f;
    }

    @Override // b0.AbstractC0135b
    public final void a(float f3) {
        this.f3636j = f3;
    }

    @Override // b0.AbstractC0135b
    public final void b(C0089l c0089l) {
        this.f3637k = c0089l;
    }

    @Override // b0.AbstractC0135b
    public final long d() {
        return r2.a.c0(this.f3635i);
    }

    @Override // b0.AbstractC0135b
    public final void e(C0408B c0408b) {
        Y.b bVar = c0408b.f5076d;
        long d3 = r2.a.d(Math.round(f.d(bVar.L())), Math.round(f.b(bVar.L())));
        float f3 = this.f3636j;
        C0089l c0089l = this.f3637k;
        d.e(c0408b, this.f3632e, this.f3633f, this.f3634g, d3, f3, c0089l, this.h, 328);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0134a)) {
            return false;
        }
        C0134a c0134a = (C0134a) obj;
        return g.a(this.f3632e, c0134a.f3632e) && AbstractC0090a.v(this.f3633f, c0134a.f3633f) && AbstractC0090a.x(this.f3634g, c0134a.f3634g) && D.n(this.h, c0134a.h);
    }

    public final int hashCode() {
        return Integer.hashCode(this.h) + AbstractC0000a.b(AbstractC0000a.b(this.f3632e.hashCode() * 31, 31, this.f3633f), 31, this.f3634g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.f3632e);
        sb.append(", srcOffset=");
        long j3 = this.f3633f;
        sb.append((Object) ("(" + ((int) (j3 >> 32)) + ", " + ((int) (j3 & 4294967295L)) + ')'));
        sb.append(", srcSize=");
        sb.append((Object) AbstractC0090a.i0(this.f3634g));
        sb.append(", filterQuality=");
        int i3 = this.h;
        sb.append((Object) (D.n(i3, 0) ? "None" : D.n(i3, 1) ? "Low" : D.n(i3, 2) ? "Medium" : D.n(i3, 3) ? "High" : "Unknown"));
        sb.append(')');
        return sb.toString();
    }
}
