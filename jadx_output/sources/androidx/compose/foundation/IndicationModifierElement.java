package androidx.compose.foundation;

import P.k;
import n0.InterfaceC0427h;
import n0.P;
import q.G;
import q.H;
import s.g;

/* loaded from: classes.dex */
final class IndicationModifierElement extends P {

    /* renamed from: a, reason: collision with root package name */
    public final g f3269a;

    /* renamed from: b, reason: collision with root package name */
    public final H f3270b;

    public IndicationModifierElement(g gVar, H h) {
        this.f3269a = gVar;
        this.f3270b = h;
    }

    @Override // n0.P
    public final k d() {
        InterfaceC0427h a3 = this.f3270b.a(this.f3269a);
        G g3 = new G();
        g3.f5973s = a3;
        g3.f0(a3);
        return g3;
    }

    @Override // n0.P
    public final void e(k kVar) {
        G g3 = (G) kVar;
        InterfaceC0427h a3 = this.f3270b.a(this.f3269a);
        g3.g0(g3.f5973s);
        g3.f5973s = a3;
        g3.f0(a3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicationModifierElement)) {
            return false;
        }
        IndicationModifierElement indicationModifierElement = (IndicationModifierElement) obj;
        return p2.g.a(this.f3269a, indicationModifierElement.f3269a) && p2.g.a(this.f3270b, indicationModifierElement.f3270b);
    }

    public final int hashCode() {
        return this.f3270b.hashCode() + (this.f3269a.hashCode() * 31);
    }
}
