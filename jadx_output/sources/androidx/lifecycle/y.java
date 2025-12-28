package androidx.lifecycle;

import android.app.Activity;

/* loaded from: classes.dex */
public final class y extends AbstractC0126g {
    final /* synthetic */ A this$0;

    public y(A a3) {
        this.this$0 = a3;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        p2.g.e(activity, "activity");
        this.this$0.a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        p2.g.e(activity, "activity");
        A a3 = this.this$0;
        int i3 = a3.f3438d + 1;
        a3.f3438d = i3;
        if (i3 == 1 && a3.f3441g) {
            a3.f3442i.d(l.ON_START);
            a3.f3441g = false;
        }
    }
}
