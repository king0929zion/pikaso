package h0;

import android.view.MotionEvent;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f4348a = new d();

    public final long a(MotionEvent motionEvent, int i3) {
        float rawX;
        float rawY;
        rawX = motionEvent.getRawX(i3);
        rawY = motionEvent.getRawY(i3);
        return r2.a.f(rawX, rawY);
    }
}
