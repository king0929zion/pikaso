package W;

import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: W.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0086i implements C {

    /* renamed from: a, reason: collision with root package name */
    public final Path f2545a;

    /* renamed from: b, reason: collision with root package name */
    public RectF f2546b;

    /* renamed from: c, reason: collision with root package name */
    public float[] f2547c;

    public C0086i(Path path) {
        this.f2545a = path;
    }

    public final void b() {
        this.f2545a.reset();
    }

    public final void c(int i3) {
        this.f2545a.setFillType(i3 == 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }
}
