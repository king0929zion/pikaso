package z;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: z.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0693A {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f6831a = p2.g.a(Build.DEVICE, "layoutlib");

    public static final C0715r a(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = viewGroup.getChildAt(i3);
            if (childAt instanceof C0715r) {
                return (C0715r) childAt;
            }
        }
        C0715r c0715r = new C0715r(viewGroup.getContext());
        viewGroup.addView(c0715r);
        return c0715r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.ViewParent] */
    public static final ViewGroup b(View view) {
        while (!(view instanceof ViewGroup)) {
            ?? parent = view.getParent();
            if (!(parent instanceof View)) {
                throw new IllegalArgumentException(("Couldn't find a valid parent for " + view + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
            view = parent;
        }
        return (ViewGroup) view;
    }
}
