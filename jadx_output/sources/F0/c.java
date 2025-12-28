package F0;

import W.D;
import W.r;

/* loaded from: classes.dex */
public final class c implements j {

    /* renamed from: a, reason: collision with root package name */
    public final long f1174a;

    public c(long j3) {
        this.f1174a = j3;
        if (j3 == 16) {
            throw new IllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
        }
    }

    @Override // F0.j
    public final float a() {
        return r.d(this.f1174a);
    }

    @Override // F0.j
    public final long b() {
        return this.f1174a;
    }

    @Override // F0.j
    public final D c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && r.c(this.f1174a, ((c) obj).f1174a);
    }

    public final int hashCode() {
        int i3 = r.f2563g;
        return Long.hashCode(this.f1174a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) r.i(this.f1174a)) + ')';
    }
}
