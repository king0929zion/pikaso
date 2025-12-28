package V;

import A.AbstractC0000a;
import a.AbstractC0090a;
import p.AbstractC0537f;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final float f2450a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2451b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2452c;

    /* renamed from: d, reason: collision with root package name */
    public final float f2453d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2454e;

    /* renamed from: f, reason: collision with root package name */
    public final long f2455f;

    /* renamed from: g, reason: collision with root package name */
    public final long f2456g;
    public final long h;

    static {
        long j3 = a.f2438a;
        r2.a.a(a.b(j3), a.c(j3));
    }

    public e(float f3, float f4, float f5, float f6, long j3, long j4, long j5, long j6) {
        this.f2450a = f3;
        this.f2451b = f4;
        this.f2452c = f5;
        this.f2453d = f6;
        this.f2454e = j3;
        this.f2455f = j4;
        this.f2456g = j5;
        this.h = j6;
    }

    public final float a() {
        return this.f2453d - this.f2451b;
    }

    public final float b() {
        return this.f2452c - this.f2450a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.f2450a, eVar.f2450a) == 0 && Float.compare(this.f2451b, eVar.f2451b) == 0 && Float.compare(this.f2452c, eVar.f2452c) == 0 && Float.compare(this.f2453d, eVar.f2453d) == 0 && a.a(this.f2454e, eVar.f2454e) && a.a(this.f2455f, eVar.f2455f) && a.a(this.f2456g, eVar.f2456g) && a.a(this.h, eVar.h);
    }

    public final int hashCode() {
        int a3 = AbstractC0537f.a(this.f2453d, AbstractC0537f.a(this.f2452c, AbstractC0537f.a(this.f2451b, Float.hashCode(this.f2450a) * 31, 31), 31), 31);
        int i3 = a.f2439b;
        return Long.hashCode(this.h) + AbstractC0000a.b(AbstractC0000a.b(AbstractC0000a.b(a3, 31, this.f2454e), 31, this.f2455f), 31, this.f2456g);
    }

    public final String toString() {
        String str = AbstractC0090a.j0(this.f2450a) + ", " + AbstractC0090a.j0(this.f2451b) + ", " + AbstractC0090a.j0(this.f2452c) + ", " + AbstractC0090a.j0(this.f2453d);
        long j3 = this.f2454e;
        long j4 = this.f2455f;
        boolean a3 = a.a(j3, j4);
        long j5 = this.f2456g;
        long j6 = this.h;
        if (!a3 || !a.a(j4, j5) || !a.a(j5, j6)) {
            return "RoundRect(rect=" + str + ", topLeft=" + ((Object) a.d(j3)) + ", topRight=" + ((Object) a.d(j4)) + ", bottomRight=" + ((Object) a.d(j5)) + ", bottomLeft=" + ((Object) a.d(j6)) + ')';
        }
        if (a.b(j3) == a.c(j3)) {
            return "RoundRect(rect=" + str + ", radius=" + AbstractC0090a.j0(a.b(j3)) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + AbstractC0090a.j0(a.b(j3)) + ", y=" + AbstractC0090a.j0(a.c(j3)) + ')';
    }
}
