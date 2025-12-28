package androidx.compose.ui.input.key;

import P.k;
import g0.C0266d;
import n0.P;
import o0.r;
import p2.g;

/* loaded from: classes.dex */
final class KeyInputElement extends P {

    /* renamed from: a, reason: collision with root package name */
    public final r f3338a;

    public KeyInputElement(r rVar) {
        this.f3338a = rVar;
    }

    @Override // n0.P
    public final k d() {
        C0266d c0266d = new C0266d();
        c0266d.f4326q = this.f3338a;
        return c0266d;
    }

    @Override // n0.P
    public final void e(k kVar) {
        ((C0266d) kVar).f4326q = this.f3338a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof KeyInputElement) {
            return this.f3338a.equals(((KeyInputElement) obj).f3338a) && g.a(null, null);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3338a.hashCode() * 31;
    }

    public final String toString() {
        return "KeyInputElement(onKeyEvent=" + this.f3338a + ", onPreKeyEvent=null)";
    }
}
