package androidx.compose.foundation.layout;

import G0.e;
import P.k;
import n0.P;
import t.w;

/* loaded from: classes.dex */
final class UnspecifiedConstraintsElement extends P {

    /* renamed from: a, reason: collision with root package name */
    public final float f3287a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3288b;

    public UnspecifiedConstraintsElement(float f3, float f4) {
        this.f3287a = f3;
        this.f3288b = f4;
    }

    @Override // n0.P
    public final k d() {
        w wVar = new w();
        wVar.f6196q = this.f3287a;
        wVar.f6197r = this.f3288b;
        return wVar;
    }

    @Override // n0.P
    public final void e(k kVar) {
        w wVar = (w) kVar;
        wVar.f6196q = this.f3287a;
        wVar.f6197r = this.f3288b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
        return e.a(this.f3287a, unspecifiedConstraintsElement.f3287a) && e.a(this.f3288b, unspecifiedConstraintsElement.f3288b);
    }

    public final int hashCode() {
        return Float.hashCode(this.f3288b) + (Float.hashCode(this.f3287a) * 31);
    }
}
