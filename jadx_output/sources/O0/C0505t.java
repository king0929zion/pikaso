package o0;

import android.os.SystemClock;
import android.view.MotionEvent;
import c2.C0174m;

/* renamed from: o0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0505t extends p2.h implements o2.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5664e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0507u f5665f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0505t(C0507u c0507u, int i3) {
        super(0);
        this.f5664e = i3;
        this.f5665f = c0507u;
    }

    @Override // o2.a
    public final Object c() {
        int actionMasked;
        C0490l c0490l;
        switch (this.f5664e) {
            case 0:
                C0507u c0507u = this.f5665f;
                MotionEvent motionEvent = c0507u.f5714o0;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    c0507u.p0 = SystemClock.uptimeMillis();
                    c0507u.post(c0507u.f5721s0);
                }
                return C0174m.f3840a;
            default:
                c0490l = this.f5665f.get_viewTreeOwners();
                return c0490l;
        }
    }
}
