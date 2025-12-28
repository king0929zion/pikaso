package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class C implements Application.ActivityLifecycleCallbacks {
    public static final B Companion = new B();

    public static final void registerIn(Activity activity) {
        Companion.getClass();
        p2.g.e(activity, "activity");
        activity.registerActivityLifecycleCallbacks(new C());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        p2.g.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        p2.g.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        p2.g.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        p2.g.e(activity, "activity");
        int i3 = D.f3445e;
        E.a(activity, l.ON_CREATE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        p2.g.e(activity, "activity");
        int i3 = D.f3445e;
        E.a(activity, l.ON_RESUME);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        p2.g.e(activity, "activity");
        int i3 = D.f3445e;
        E.a(activity, l.ON_START);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreDestroyed(Activity activity) {
        p2.g.e(activity, "activity");
        int i3 = D.f3445e;
        E.a(activity, l.ON_DESTROY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(Activity activity) {
        p2.g.e(activity, "activity");
        int i3 = D.f3445e;
        E.a(activity, l.ON_PAUSE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStopped(Activity activity) {
        p2.g.e(activity, "activity");
        int i3 = D.f3445e;
        E.a(activity, l.ON_STOP);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        p2.g.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        p2.g.e(activity, "activity");
        p2.g.e(bundle, "bundle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        p2.g.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        p2.g.e(activity, "activity");
    }
}
