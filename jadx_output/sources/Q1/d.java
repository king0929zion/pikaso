package Q1;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import java.util.Locale;

/* loaded from: classes.dex */
public final class d implements Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        View peekDecorView;
        Context context;
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (!Z0.b.a()) {
            String str = Build.MANUFACTURER;
            Locale locale = Locale.ROOT;
            c cVar = (c) e.f2194b.get(str.toLowerCase(locale));
            if (cVar == null) {
                cVar = (c) e.f2195c.get(Build.BRAND.toLowerCase(locale));
            }
            if (cVar == null || !cVar.a()) {
                return;
            }
        }
        TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(e.f2193a);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        activity.getTheme().applyStyle(resourceId, true);
        Window window = activity.getWindow();
        Resources.Theme theme = (window == null || (peekDecorView = window.peekDecorView()) == null || (context = peekDecorView.getContext()) == null) ? null : context.getTheme();
        if (theme != null) {
            theme.applyStyle(resourceId, true);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
