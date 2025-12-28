package k;

import android.widget.AbsListView;

/* loaded from: classes.dex */
public abstract class X {
    public static boolean a(AbsListView absListView) {
        return absListView.isSelectedChildViewEnabled();
    }

    public static void b(AbsListView absListView, boolean z3) {
        absListView.setSelectedChildViewEnabled(z3);
    }
}
