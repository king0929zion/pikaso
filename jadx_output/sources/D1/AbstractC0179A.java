package d1;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: d1.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0179A {
    public static l0 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        l0 d3 = l0.d(null, rootWindowInsets);
        j0 j0Var = d3.f4228a;
        j0Var.p(d3);
        j0Var.d(view.getRootView());
        return d3;
    }

    public static int b(View view) {
        return view.getScrollIndicators();
    }

    public static void c(View view, int i3) {
        view.setScrollIndicators(i3);
    }

    public static void d(View view, int i3, int i4) {
        view.setScrollIndicators(i3, i4);
    }
}
