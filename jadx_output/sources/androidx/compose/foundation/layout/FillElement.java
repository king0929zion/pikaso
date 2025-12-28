package androidx.compose.foundation.layout;

import P.k;
import n0.P;
import p.AbstractC0537f;
import t.n;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class FillElement extends P {

    /* renamed from: a, reason: collision with root package name */
    public final int f3276a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3277b;

    public FillElement(int i3, float f3) {
        this.f3276a = i3;
        this.f3277b = f3;
    }

    @Override // n0.P
    public final k d() {
        n nVar = new n();
        nVar.f6175q = this.f3276a;
        nVar.f6176r = this.f3277b;
        return nVar;
    }

    @Override // n0.P
    public final void e(k kVar) {
        n nVar = (n) kVar;
        nVar.f6175q = this.f3276a;
        nVar.f6176r = this.f3277b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillElement)) {
            return false;
        }
        FillElement fillElement = (FillElement) obj;
        return this.f3276a == fillElement.f3276a && this.f3277b == fillElement.f3277b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3277b) + (AbstractC0537f.b(this.f3276a) * 31);
    }
}
