package b;

import android.window.OnBackInvokedCallback;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final q f3625a = new q();

    public final OnBackInvokedCallback a(o2.c cVar, o2.c cVar2, o2.a aVar, o2.a aVar2) {
        p2.g.e(cVar, "onBackStarted");
        p2.g.e(cVar2, "onBackProgressed");
        p2.g.e(aVar, "onBackInvoked");
        p2.g.e(aVar2, "onBackCancelled");
        return new p(cVar, cVar2, aVar, aVar2);
    }
}
