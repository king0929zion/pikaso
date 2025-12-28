package k;

import android.transition.Transition;
import android.widget.PopupWindow;

/* renamed from: k.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0327o0 {
    public static void a(PopupWindow popupWindow, Transition transition) {
        popupWindow.setEnterTransition(transition);
    }

    public static void b(PopupWindow popupWindow, Transition transition) {
        popupWindow.setExitTransition(transition);
    }
}
