package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* loaded from: classes.dex */
public final class z extends AbstractC0126g {
    final /* synthetic */ A this$0;

    public z(A a3) {
        this.this$0 = a3;
    }

    @Override // androidx.lifecycle.AbstractC0126g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        p2.g.e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i3 = D.f3445e;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            p2.g.c(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((D) findFragmentByTag).f3446d = this.this$0.f3444k;
        }
    }

    @Override // androidx.lifecycle.AbstractC0126g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        p2.g.e(activity, "activity");
        A a3 = this.this$0;
        int i3 = a3.f3439e - 1;
        a3.f3439e = i3;
        if (i3 == 0) {
            Handler handler = a3.h;
            p2.g.b(handler);
            handler.postDelayed(a3.f3443j, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        p2.g.e(activity, "activity");
        x.a(activity, new y(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC0126g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        p2.g.e(activity, "activity");
        A a3 = this.this$0;
        int i3 = a3.f3438d - 1;
        a3.f3438d = i3;
        if (i3 == 0 && a3.f3440f) {
            a3.f3442i.d(l.ON_STOP);
            a3.f3441g = true;
        }
    }
}
