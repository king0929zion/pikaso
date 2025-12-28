package d1;

import android.view.View;

/* renamed from: d1.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0184F {
    public static int a(View view) {
        return view.getImportantForContentCapture();
    }

    public static CharSequence b(View view) {
        return view.getStateDescription();
    }

    public static boolean c(View view) {
        return view.isImportantForContentCapture();
    }

    public static void d(View view, int i3) {
        view.setImportantForContentCapture(i3);
    }

    public static void e(View view, CharSequence charSequence) {
        view.setStateDescription(charSequence);
    }
}
