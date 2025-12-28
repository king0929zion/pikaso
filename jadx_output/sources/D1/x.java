package D1;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final y f1035a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0069c f1036b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f1035a = new z();
        } else {
            f1035a = new y();
        }
        f1036b = new C0069c(Float.class, "translationAlpha", 5);
        new C0069c(Rect.class, "clipBounds", 6);
    }

    public static void a(View view, int i3, int i4, int i5, int i6) {
        f1035a.k0(view, i3, i4, i5, i6);
    }
}
