package k;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import j.ViewOnTouchListenerC0289a;

/* renamed from: k.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0303c0 implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4755d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewOnTouchListenerC0289a f4756e;

    public /* synthetic */ RunnableC0303c0(ViewOnTouchListenerC0289a viewOnTouchListenerC0289a, int i3) {
        this.f4755d = i3;
        this.f4756e = viewOnTouchListenerC0289a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4755d) {
            case 0:
                ViewParent parent = this.f4756e.f4473g.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                ViewOnTouchListenerC0289a viewOnTouchListenerC0289a = this.f4756e;
                viewOnTouchListenerC0289a.a();
                View view = viewOnTouchListenerC0289a.f4473g;
                if (view.isEnabled() && !view.isLongClickable() && viewOnTouchListenerC0289a.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    viewOnTouchListenerC0289a.f4475j = true;
                    break;
                }
                break;
        }
    }
}
