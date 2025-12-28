package d1;

import android.view.View;
import com.ai.assistance.operit.provider.R;
import g1.AbstractC0267a;
import java.util.Objects;
import n.C0379F;

/* renamed from: d1.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0182D {
    public static void a(View view, InterfaceC0187I interfaceC0187I) {
        C0379F c0379f = (C0379F) view.getTag(R.id.tag_unhandled_key_listeners);
        if (c0379f == null) {
            c0379f = new C0379F(0);
            view.setTag(R.id.tag_unhandled_key_listeners, c0379f);
        }
        Objects.requireNonNull(interfaceC0187I);
        View.OnUnhandledKeyEventListener viewOnUnhandledKeyEventListenerC0181C = new ViewOnUnhandledKeyEventListenerC0181C();
        c0379f.put(interfaceC0187I, viewOnUnhandledKeyEventListenerC0181C);
        view.addOnUnhandledKeyEventListener(viewOnUnhandledKeyEventListenerC0181C);
    }

    public static CharSequence b(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean c(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean d(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void e(View view, InterfaceC0187I interfaceC0187I) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        C0379F c0379f = (C0379F) view.getTag(R.id.tag_unhandled_key_listeners);
        if (c0379f == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) c0379f.get(interfaceC0187I)) == null) {
            return;
        }
        view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    public static <T> T f(View view, int i3) {
        return (T) view.requireViewById(i3);
    }

    public static void g(View view, boolean z3) {
        view.setAccessibilityHeading(z3);
    }

    public static void h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void i(View view, AbstractC0267a abstractC0267a) {
        view.setAutofillId(null);
    }

    public static void j(View view, boolean z3) {
        view.setScreenReaderFocusable(z3);
    }
}
