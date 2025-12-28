package g0;

import android.view.KeyEvent;
import p2.g;

/* renamed from: g0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0264b {

    /* renamed from: a, reason: collision with root package name */
    public final KeyEvent f4325a;

    public final boolean equals(Object obj) {
        if (obj instanceof C0264b) {
            return g.a(this.f4325a, ((C0264b) obj).f4325a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4325a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.f4325a + ')';
    }
}
