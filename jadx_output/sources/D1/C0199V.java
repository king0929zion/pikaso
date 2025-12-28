package d1;

import android.view.WindowInsetsAnimation;

/* renamed from: d1.V, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0199V extends AbstractC0200W {

    /* renamed from: e, reason: collision with root package name */
    public final WindowInsetsAnimation f4170e;

    public C0199V(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f4170e = windowInsetsAnimation;
    }

    @Override // d1.AbstractC0200W
    public final long a() {
        long durationMillis;
        durationMillis = this.f4170e.getDurationMillis();
        return durationMillis;
    }

    @Override // d1.AbstractC0200W
    public final float b() {
        float interpolatedFraction;
        interpolatedFraction = this.f4170e.getInterpolatedFraction();
        return interpolatedFraction;
    }

    @Override // d1.AbstractC0200W
    public final int c() {
        int typeMask;
        typeMask = this.f4170e.getTypeMask();
        return typeMask;
    }

    @Override // d1.AbstractC0200W
    public final void d(float f3) {
        this.f4170e.setFraction(f3);
    }
}
