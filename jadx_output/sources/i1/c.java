package I1;

import android.animation.TimeInterpolator;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public long f1396a;

    /* renamed from: b, reason: collision with root package name */
    public long f1397b;

    /* renamed from: c, reason: collision with root package name */
    public TimeInterpolator f1398c;

    /* renamed from: d, reason: collision with root package name */
    public int f1399d;

    /* renamed from: e, reason: collision with root package name */
    public int f1400e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f1398c;
        return timeInterpolator != null ? timeInterpolator : a.f1391b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f1396a == cVar.f1396a && this.f1397b == cVar.f1397b && this.f1399d == cVar.f1399d && this.f1400e == cVar.f1400e) {
            return a().getClass().equals(cVar.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f1396a;
        long j4 = this.f1397b;
        return ((((a().getClass().hashCode() + (((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) ((j4 >>> 32) ^ j4))) * 31)) * 31) + this.f1399d) * 31) + this.f1400e;
    }

    public final String toString() {
        return "\n" + c.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f1396a + " duration: " + this.f1397b + " interpolator: " + a().getClass() + " repeatCount: " + this.f1399d + " repeatMode: " + this.f1400e + "}\n";
    }
}
