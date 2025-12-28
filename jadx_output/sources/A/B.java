package A;

import z.C0705h;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public final long f0a = W.r.f2562f;

    /* renamed from: b, reason: collision with root package name */
    public final C0705h f1b = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b3 = (B) obj;
        return W.r.c(this.f0a, b3.f0a) && p2.g.a(this.f1b, b3.f1b);
    }

    public final int hashCode() {
        int i3 = W.r.f2563g;
        int hashCode = Long.hashCode(this.f0a) * 31;
        C0705h c0705h = this.f1b;
        return hashCode + (c0705h != null ? c0705h.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RippleConfiguration(color=");
        AbstractC0000a.i(this.f0a, sb, ", rippleAlpha=");
        sb.append(this.f1b);
        sb.append(')');
        return sb.toString();
    }
}
