package b;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* loaded from: classes.dex */
public final class p implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o2.c f3621a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o2.c f3622b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o2.a f3623c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o2.a f3624d;

    public p(o2.c cVar, o2.c cVar2, o2.a aVar, o2.a aVar2) {
        this.f3621a = cVar;
        this.f3622b = cVar2;
        this.f3623c = aVar;
        this.f3624d = aVar2;
    }

    public final void onBackCancelled() {
        this.f3624d.c();
    }

    public final void onBackInvoked() {
        this.f3623c.c();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        p2.g.e(backEvent, "backEvent");
        this.f3622b.i(new C0132b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        p2.g.e(backEvent, "backEvent");
        this.f3621a.i(new C0132b(backEvent));
    }
}
