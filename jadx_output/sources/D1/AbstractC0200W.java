package d1;

import android.view.animation.Interpolator;

/* renamed from: d1.W, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0200W {

    /* renamed from: a, reason: collision with root package name */
    public final int f4171a;

    /* renamed from: b, reason: collision with root package name */
    public float f4172b;

    /* renamed from: c, reason: collision with root package name */
    public final Interpolator f4173c;

    /* renamed from: d, reason: collision with root package name */
    public final long f4174d;

    public AbstractC0200W(int i3, Interpolator interpolator, long j3) {
        this.f4171a = i3;
        this.f4173c = interpolator;
        this.f4174d = j3;
    }

    public long a() {
        return this.f4174d;
    }

    public float b() {
        Interpolator interpolator = this.f4173c;
        return interpolator != null ? interpolator.getInterpolation(this.f4172b) : this.f4172b;
    }

    public int c() {
        return this.f4171a;
    }

    public void d(float f3) {
        this.f4172b = f3;
    }
}
