package o0;

import android.view.ViewParent;

/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public static final c1 f5560a = new c1();

    public final void a(C0507u c0507u) {
        ViewParent parent = c0507u.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(c0507u, c0507u);
        }
    }
}
