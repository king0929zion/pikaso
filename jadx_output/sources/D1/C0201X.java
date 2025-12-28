package d1;

import android.os.Build;
import android.view.animation.Interpolator;

/* renamed from: d1.X, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0201X {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0200W f4175a;

    public C0201X(int i3, Interpolator interpolator, long j3) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f4175a = new C0199V(G1.i.k(i3, interpolator, j3));
        } else {
            this.f4175a = new C0197T(i3, interpolator, j3);
        }
    }
}
