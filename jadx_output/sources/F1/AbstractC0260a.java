package f1;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* renamed from: f1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0260a {
    public static Interpolator a(float f3, float f4) {
        return new PathInterpolator(f3, f4);
    }

    public static Interpolator b(float f3, float f4, float f5, float f6) {
        return new PathInterpolator(f3, f4, f5, f6);
    }

    public static Interpolator c(Path path) {
        return new PathInterpolator(path);
    }
}
