package g0;

import P.k;
import android.view.KeyEvent;
import o0.r;

/* renamed from: g0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0266d extends k implements InterfaceC0265c {

    /* renamed from: q, reason: collision with root package name */
    public r f4326q;

    @Override // g0.InterfaceC0265c
    public final boolean d(KeyEvent keyEvent) {
        return false;
    }

    @Override // g0.InterfaceC0265c
    public final boolean g(KeyEvent keyEvent) {
        r rVar = this.f4326q;
        if (rVar != null) {
            return ((Boolean) rVar.i(new C0264b(keyEvent))).booleanValue();
        }
        return false;
    }
}
