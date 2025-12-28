package androidx.compose.foundation.layout;

import P.k;
import n0.P;
import p.AbstractC0537f;
import t.d;

/* loaded from: classes.dex */
final class BoxChildDataElement extends P {
    @Override // n0.P
    public final k d() {
        d dVar = new d();
        dVar.f6152q = P.a.h;
        return dVar;
    }

    @Override // n0.P
    public final void e(k kVar) {
        ((d) kVar).f6152q = P.a.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof BoxChildDataElement ? (BoxChildDataElement) obj : null) == null) {
            return false;
        }
        P.d dVar = P.a.h;
        return dVar.equals(dVar);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + AbstractC0537f.a(0.0f, Float.hashCode(0.0f) * 31, 31);
    }
}
