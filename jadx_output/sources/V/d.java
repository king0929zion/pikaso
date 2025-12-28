package V;

import a.AbstractC0090a;
import p.AbstractC0537f;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final d f2445e = new d(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f2446a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2447b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2448c;

    /* renamed from: d, reason: collision with root package name */
    public final float f2449d;

    public d(float f3, float f4, float f5, float f6) {
        this.f2446a = f3;
        this.f2447b = f4;
        this.f2448c = f5;
        this.f2449d = f6;
    }

    public final long a() {
        return r2.a.f((c() / 2.0f) + this.f2446a, (b() / 2.0f) + this.f2447b);
    }

    public final float b() {
        return this.f2449d - this.f2447b;
    }

    public final float c() {
        return this.f2448c - this.f2446a;
    }

    public final d d(float f3, float f4) {
        return new d(this.f2446a + f3, this.f2447b + f4, this.f2448c + f3, this.f2449d + f4);
    }

    public final d e(long j3) {
        return new d(c.b(j3) + this.f2446a, c.c(j3) + this.f2447b, c.b(j3) + this.f2448c, c.c(j3) + this.f2449d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f2446a, dVar.f2446a) == 0 && Float.compare(this.f2447b, dVar.f2447b) == 0 && Float.compare(this.f2448c, dVar.f2448c) == 0 && Float.compare(this.f2449d, dVar.f2449d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f2449d) + AbstractC0537f.a(this.f2448c, AbstractC0537f.a(this.f2447b, Float.hashCode(this.f2446a) * 31, 31), 31);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + AbstractC0090a.j0(this.f2446a) + ", " + AbstractC0090a.j0(this.f2447b) + ", " + AbstractC0090a.j0(this.f2448c) + ", " + AbstractC0090a.j0(this.f2449d) + ')';
    }
}
