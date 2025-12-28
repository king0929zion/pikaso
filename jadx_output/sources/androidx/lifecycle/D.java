package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class D extends Fragment {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f3445e = 0;

    /* renamed from: d, reason: collision with root package name */
    public A.t f3446d;

    public final void a(l lVar) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            p2.g.d(activity, "activity");
            E.a(activity, lVar);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(l.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(l.ON_DESTROY);
        this.f3446d = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(l.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        A.t tVar = this.f3446d;
        if (tVar != null) {
            ((A) tVar.f175e).a();
        }
        a(l.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        A.t tVar = this.f3446d;
        if (tVar != null) {
            A a3 = (A) tVar.f175e;
            int i3 = a3.f3438d + 1;
            a3.f3438d = i3;
            if (i3 == 1 && a3.f3441g) {
                a3.f3442i.d(l.ON_START);
                a3.f3441g = false;
            }
        }
        a(l.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(l.ON_STOP);
    }
}
