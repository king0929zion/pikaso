package v;

import V.f;

/* renamed from: v.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0609c implements InterfaceC0607a {

    /* renamed from: a, reason: collision with root package name */
    public final float f6309a;

    public C0609c(float f3) {
        this.f6309a = f3;
        if (f3 < 0.0f || f3 > 100.0f) {
            throw new IllegalArgumentException("The percent should be in the range of [0, 100]");
        }
    }

    @Override // v.InterfaceC0607a
    public final float a(long j3, G0.b bVar) {
        return (this.f6309a / 100.0f) * f.c(j3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0609c) && Float.compare(this.f6309a, ((C0609c) obj).f6309a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6309a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f6309a + "%)";
    }
}
