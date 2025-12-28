package androidx.compose.ui.focus;

import U.h;
import U.k;
import U.m;
import n0.P;
import p2.g;

/* loaded from: classes.dex */
final class FocusPropertiesElement extends P {

    /* renamed from: a, reason: collision with root package name */
    public final k f3315a;

    public FocusPropertiesElement(k kVar) {
        this.f3315a = kVar;
    }

    @Override // n0.P
    public final P.k d() {
        m mVar = new m();
        mVar.f2357q = this.f3315a;
        return mVar;
    }

    @Override // n0.P
    public final void e(P.k kVar) {
        ((m) kVar).f2357q = this.f3315a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusPropertiesElement) && g.a(this.f3315a, ((FocusPropertiesElement) obj).f3315a);
    }

    public final int hashCode() {
        return h.f2343f.hashCode();
    }

    public final String toString() {
        return "FocusPropertiesElement(scope=" + this.f3315a + ')';
    }
}
