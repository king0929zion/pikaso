package t1;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class b implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f6291a;

    /* renamed from: b, reason: collision with root package name */
    public final float f6292b;

    public b(float[] fArr) {
        this.f6291a = fArr;
        this.f6292b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f3) {
        if (f3 >= 1.0f) {
            return 1.0f;
        }
        if (f3 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f6291a;
        int min = Math.min((int) ((fArr.length - 1) * f3), fArr.length - 2);
        float f4 = this.f6292b;
        float f5 = (f3 - (min * f4)) / f4;
        float f6 = fArr[min];
        return ((fArr[min + 1] - f6) * f5) + f6;
    }
}
