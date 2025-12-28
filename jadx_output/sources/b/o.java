package b;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final o f3620a = new o();

    public final OnBackInvokedCallback a(o2.a aVar) {
        p2.g.e(aVar, "onBackInvoked");
        return new n(0, aVar);
    }

    public final void b(Object obj, int i3, Object obj2) {
        p2.g.e(obj, "dispatcher");
        p2.g.e(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i3, (OnBackInvokedCallback) obj2);
    }

    public final void c(Object obj, Object obj2) {
        p2.g.e(obj, "dispatcher");
        p2.g.e(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
