package W;

import android.graphics.PathMeasure;

/* renamed from: W.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0087j {

    /* renamed from: a, reason: collision with root package name */
    public final PathMeasure f2548a;

    public C0087j(PathMeasure pathMeasure) {
        this.f2548a = pathMeasure;
    }

    public final void a(float f3, float f4, C0086i c0086i) {
        if (c0086i == null) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        this.f2548a.getSegment(f3, f4, c0086i.f2545a, true);
    }
}
