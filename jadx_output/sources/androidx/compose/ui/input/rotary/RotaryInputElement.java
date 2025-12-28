package androidx.compose.ui.input.rotary;

import P.k;
import j0.C0292a;
import n0.P;
import o0.C0492m;
import p2.g;

/* loaded from: classes.dex */
final class RotaryInputElement extends P {
    @Override // n0.P
    public final k d() {
        C0292a c0292a = new C0292a();
        c0292a.f4597q = C0492m.h;
        return c0292a;
    }

    @Override // n0.P
    public final void e(k kVar) {
        ((C0292a) kVar).f4597q = C0492m.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RotaryInputElement)) {
            return false;
        }
        ((RotaryInputElement) obj).getClass();
        Object obj2 = C0492m.h;
        return obj2.equals(obj2) && g.a(null, null);
    }

    public final int hashCode() {
        return C0492m.h.hashCode() * 31;
    }

    public final String toString() {
        return "RotaryInputElement(onRotaryScrollEvent=" + C0492m.h + ", onPreRotaryScrollEvent=null)";
    }
}
