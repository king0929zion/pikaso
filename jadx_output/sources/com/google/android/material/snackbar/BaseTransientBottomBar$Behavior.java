package com.google.android.material.snackbar;

import X1.e;
import Z1.c;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {
    public final e h;

    public BaseTransientBottomBar$Behavior() {
        e eVar = new e(10);
        this.f3873e = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f3874f = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.f3872d = 0;
        this.h = eVar;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, Q0.a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.h.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (H.e.f1309b == null) {
                    H.e.f1309b = new H.e();
                }
                synchronized (H.e.f1309b.f1310a) {
                }
            }
        } else if (coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (H.e.f1309b == null) {
                H.e.f1309b = new H.e();
            }
            synchronized (H.e.f1309b.f1310a) {
            }
        }
        return super.f(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean r(View view) {
        this.h.getClass();
        return view instanceof c;
    }
}
