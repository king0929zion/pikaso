package d1;

import android.view.VelocityTracker;

/* renamed from: d1.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0222s {
    public static float a(VelocityTracker velocityTracker, int i3) {
        return velocityTracker.getAxisVelocity(i3);
    }

    public static float b(VelocityTracker velocityTracker, int i3, int i4) {
        return velocityTracker.getAxisVelocity(i3, i4);
    }

    public static boolean c(VelocityTracker velocityTracker, int i3) {
        return velocityTracker.isAxisSupported(i3);
    }
}
