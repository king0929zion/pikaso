package d1;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.ai.assistance.operit.provider.R;
import java.util.List;

/* renamed from: d1.T, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0197T extends AbstractC0200W {

    /* renamed from: e, reason: collision with root package name */
    public static final PathInterpolator f4163e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* renamed from: f, reason: collision with root package name */
    public static final t1.a f4164f = new t1.a();

    /* renamed from: g, reason: collision with root package name */
    public static final DecelerateInterpolator f4165g = new DecelerateInterpolator();

    public static void e(View view) {
        M1.j j3 = j(view);
        if (j3 != null) {
            ((View) j3.f1699e).setTranslationY(0.0f);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                e(viewGroup.getChildAt(i3));
            }
        }
    }

    public static void f(View view, WindowInsets windowInsets, boolean z3) {
        M1.j j3 = j(view);
        if (j3 != null) {
            j3.f1698d = windowInsets;
            if (!z3) {
                View view2 = (View) j3.f1699e;
                int[] iArr = (int[]) j3.f1696b;
                view2.getLocationOnScreen(iArr);
                z3 = true;
                j3.f1695a = iArr[1];
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                f(viewGroup.getChildAt(i3), windowInsets, z3);
            }
        }
    }

    public static void g(View view, l0 l0Var, List list) {
        M1.j j3 = j(view);
        if (j3 != null) {
            j3.f(l0Var, list);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                g(viewGroup.getChildAt(i3), l0Var, list);
            }
        }
    }

    public static void h(View view, B2.i iVar) {
        M1.j j3 = j(view);
        if (j3 != null) {
            View view2 = (View) j3.f1699e;
            int[] iArr = (int[]) j3.f1696b;
            view2.getLocationOnScreen(iArr);
            int i3 = j3.f1695a - iArr[1];
            j3.f1697c = i3;
            view2.setTranslationY(i3);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                h(viewGroup.getChildAt(i4), iVar);
            }
        }
    }

    public static WindowInsets i(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static M1.j j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof ViewOnApplyWindowInsetsListenerC0196S) {
            return ((ViewOnApplyWindowInsetsListenerC0196S) tag).f4161a;
        }
        return null;
    }
}
