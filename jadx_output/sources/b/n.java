package b;

import android.window.OnBackInvokedCallback;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3618a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3619b;

    public /* synthetic */ n(int i3, Object obj) {
        this.f3618a = i3;
        this.f3619b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f3618a) {
            case 0:
                o2.a aVar = (o2.a) this.f3619b;
                p2.g.e(aVar, "$onBackInvoked");
                aVar.c();
                break;
            default:
                ((Runnable) this.f3619b).run();
                break;
        }
    }
}
