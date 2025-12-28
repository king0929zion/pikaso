package X;

import A.AbstractC0000a;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f2591a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2592b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2593c;

    public c(String str, long j3, int i3) {
        this.f2591a = str;
        this.f2592b = j3;
        this.f2593c = i3;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i3 < -1 || i3 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public abstract float a(int i3);

    public abstract float b(int i3);

    public boolean c() {
        return false;
    }

    public abstract long d(float f3, float f4, float f5);

    public abstract float e(float f3, float f4, float f5);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f2593c == cVar.f2593c && p2.g.a(this.f2591a, cVar.f2591a)) {
            return b.a(this.f2592b, cVar.f2592b);
        }
        return false;
    }

    public abstract long f(float f3, float f4, float f5, float f6, c cVar);

    public int hashCode() {
        int hashCode = this.f2591a.hashCode() * 31;
        int i3 = b.f2590e;
        return AbstractC0000a.b(hashCode, 31, this.f2592b) + this.f2593c;
    }

    public final String toString() {
        return this.f2591a + " (id=" + this.f2593c + ", model=" + ((Object) b.b(this.f2592b)) + ')';
    }
}
