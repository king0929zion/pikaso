package j1;

import android.widget.PopupWindow;

/* loaded from: classes.dex */
public abstract class k {
    public static boolean a(PopupWindow popupWindow) {
        return popupWindow.getOverlapAnchor();
    }

    public static int b(PopupWindow popupWindow) {
        return popupWindow.getWindowLayoutType();
    }

    public static void c(PopupWindow popupWindow, boolean z3) {
        popupWindow.setOverlapAnchor(z3);
    }

    public static void d(PopupWindow popupWindow, int i3) {
        popupWindow.setWindowLayoutType(i3);
    }
}
