package androidx.compose.foundation.layout;

import P.k;
import n0.P;
import p2.g;
import t.p;
import t.q;

/* loaded from: classes.dex */
final class PaddingValuesElement extends P {

    /* renamed from: a, reason: collision with root package name */
    public final p f3282a;

    public PaddingValuesElement(p pVar) {
        this.f3282a = pVar;
    }

    @Override // n0.P
    public final k d() {
        q qVar = new q();
        qVar.f6186q = this.f3282a;
        return qVar;
    }

    @Override // n0.P
    public final void e(k kVar) {
        ((q) kVar).f6186q = this.f3282a;
    }

    public final boolean equals(Object obj) {
        PaddingValuesElement paddingValuesElement = obj instanceof PaddingValuesElement ? (PaddingValuesElement) obj : null;
        if (paddingValuesElement == null) {
            return false;
        }
        return g.a(this.f3282a, paddingValuesElement.f3282a);
    }

    public final int hashCode() {
        return this.f3282a.hashCode();
    }
}
