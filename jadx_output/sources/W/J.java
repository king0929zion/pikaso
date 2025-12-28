package W;

/* loaded from: classes.dex */
public final class J extends D {

    /* renamed from: e, reason: collision with root package name */
    public final long f2529e;

    public J(long j3) {
        this.f2529e = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof J) {
            return r.c(this.f2529e, ((J) obj).f2529e);
        }
        return false;
    }

    @Override // W.D
    public final void h(float f3, long j3, C0084g c0084g) {
        c0084g.a(1.0f);
        long j4 = this.f2529e;
        if (f3 != 1.0f) {
            j4 = r.b(j4, r.d(j4) * f3);
        }
        c0084g.c(j4);
        if (c0084g.f2541c != null) {
            c0084g.f2541c = null;
            c0084g.f2539a.setShader(null);
        }
    }

    public final int hashCode() {
        int i3 = r.f2563g;
        return Long.hashCode(this.f2529e);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) r.i(this.f2529e)) + ')';
    }
}
