package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public abstract class E implements H {

    /* renamed from: d, reason: collision with root package name */
    public static final X1.e f3447d = new X1.e(12);

    /* renamed from: e, reason: collision with root package name */
    public static final X1.e f3448e = new X1.e(13);

    /* renamed from: f, reason: collision with root package name */
    public static final X1.e f3449f = new X1.e(11);

    /* renamed from: g, reason: collision with root package name */
    public static final X1.e f3450g = new X1.e(15);

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, l lVar) {
        t c3;
        p2.g.e(activity, "activity");
        p2.g.e(lVar, "event");
        if (!(activity instanceof r) || (c3 = ((r) activity).c()) == null) {
            return;
        }
        c3.d(lVar);
    }

    public static final r b(View view) {
        p2.g.e(view, "<this>");
        return (r) w2.h.X(w2.h.Z(w2.h.Y(view, K.f3458f), K.f3459g));
    }

    public static void c(Activity activity) {
        p2.g.e(activity, "activity");
        if (Build.VERSION.SDK_INT >= 29) {
            C.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new C());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new D(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
