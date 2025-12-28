package Z;

import W.C;
import W.C0086i;
import android.graphics.Outline;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f2884a = new l();

    public final void a(Outline outline, C c3) {
        if (!(c3 instanceof C0086i)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        outline.setPath(((C0086i) c3).f2545a);
    }
}
