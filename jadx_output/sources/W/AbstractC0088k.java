package W;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.util.DisplayMetrics;

/* renamed from: W.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0088k {
    public static final X.c a(Bitmap bitmap) {
        X.c b3;
        ColorSpace colorSpace = bitmap.getColorSpace();
        return (colorSpace == null || (b3 = u.b(colorSpace)) == null) ? X.e.f2597c : b3;
    }

    public static final Bitmap b(int i3, int i4, int i5, boolean z3, X.c cVar) {
        return Bitmap.createBitmap((DisplayMetrics) null, i3, i4, D.D(i5), z3, u.a(cVar));
    }
}
