package I1;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f1390a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public static final t1.a f1391b = new t1.a(t1.a.f6289d);

    /* renamed from: c, reason: collision with root package name */
    public static final t1.a f1392c = new t1.a();

    /* renamed from: d, reason: collision with root package name */
    public static final t1.a f1393d = new t1.a(t1.a.f6290e);

    static {
        new DecelerateInterpolator();
    }

    public static float a(float f3, float f4, float f5) {
        return ((f4 - f3) * f5) + f3;
    }

    public static float b(float f3, float f4, float f5, float f6, float f7) {
        return f7 <= f5 ? f3 : f7 >= f6 ? f4 : a(f3, f4, (f7 - f5) / (f6 - f5));
    }

    public static int c(float f3, int i3, int i4) {
        return Math.round(f3 * (i4 - i3)) + i3;
    }
}
