package W;

import android.graphics.RectF;

/* loaded from: classes.dex */
public final class y extends B {

    /* renamed from: a, reason: collision with root package name */
    public final C0086i f2571a;

    public y(C0086i c0086i) {
        this.f2571a = c0086i;
    }

    @Override // W.B
    public final V.d a() {
        C0086i c0086i = this.f2571a;
        if (c0086i.f2546b == null) {
            c0086i.f2546b = new RectF();
        }
        RectF rectF = c0086i.f2546b;
        p2.g.b(rectF);
        c0086i.f2545a.computeBounds(rectF, true);
        return new V.d(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
}
