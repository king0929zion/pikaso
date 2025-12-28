package w0;

import A.AbstractC0000a;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f6504a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6505b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6506c;

    public k(int i3, int i4, boolean z3) {
        this.f6504a = i3;
        this.f6505b = i4;
        this.f6506c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f6504a == kVar.f6504a && this.f6505b == kVar.f6505b && this.f6506c == kVar.f6506c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f6506c) + AbstractC0000a.a(this.f6505b, Integer.hashCode(this.f6504a) * 31, 31);
    }

    public final String toString() {
        return "BidiRun(start=" + this.f6504a + ", end=" + this.f6505b + ", isRtl=" + this.f6506c + ')';
    }
}
