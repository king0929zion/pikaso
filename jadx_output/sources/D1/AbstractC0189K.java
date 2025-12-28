package d1;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.ai.assistance.operit.provider.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import k.AbstractC0335t;

/* renamed from: d1.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0189K {

    /* renamed from: a, reason: collision with root package name */
    public static Field f4150a = null;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f4151b = false;

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f4152c = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: d, reason: collision with root package name */
    public static final C0225v f4153d = new C0225v();

    /* renamed from: e, reason: collision with root package name */
    public static final ViewTreeObserverOnGlobalLayoutListenerC0226w f4154e = new ViewTreeObserverOnGlobalLayoutListenerC0226w();

    public static View.AccessibilityDelegate a(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC0183E.a(view);
        }
        if (f4151b) {
            return null;
        }
        if (f4150a == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f4150a = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f4151b = true;
                return null;
            }
        }
        try {
            Object obj = f4150a.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f4151b = true;
            return null;
        }
    }

    public static CharSequence b(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = AbstractC0182D.b(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static ArrayList c(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] d(AbstractC0335t abstractC0335t) {
        return Build.VERSION.SDK_INT >= 31 ? AbstractC0185G.a(abstractC0335t) : (String[]) abstractC0335t.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void e(View view, int i3) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z3 = b(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z3) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z3 ? 32 : 2048);
                obtain.setContentChangeTypes(i3);
                if (z3) {
                    obtain.getText().add(b(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i3 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i3);
                        return;
                    } catch (AbstractMethodError e3) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e3);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(obtain2);
            obtain2.setEventType(32);
            obtain2.setContentChangeTypes(i3);
            obtain2.setSource(view);
            view.onPopulateAccessibilityEvent(obtain2);
            obtain2.getText().add(b(view));
            accessibilityManager.sendAccessibilityEvent(obtain2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C0209f f(View view, C0209f c0209f) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c0209f + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC0185G.b(view, c0209f);
        }
        InterfaceC0219p interfaceC0219p = (InterfaceC0219p) view.getTag(R.id.tag_on_receive_content_listener);
        InterfaceC0220q interfaceC0220q = f4153d;
        if (interfaceC0219p == null) {
            if (view instanceof InterfaceC0220q) {
                interfaceC0220q = (InterfaceC0220q) view;
            }
            return interfaceC0220q.a(c0209f);
        }
        C0209f a3 = ((j1.p) interfaceC0219p).a(view, c0209f);
        if (a3 == null) {
            return null;
        }
        if (view instanceof InterfaceC0220q) {
            interfaceC0220q = (InterfaceC0220q) view;
        }
        return interfaceC0220q.a(a3);
    }

    public static void g(View view, int i3) {
        ArrayList c3 = c(view);
        for (int i4 = 0; i4 < c3.size(); i4++) {
            if (((e1.e) c3.get(i4)).a() == i3) {
                c3.remove(i4);
                return;
            }
        }
    }

    public static void h(View view, e1.e eVar, e1.s sVar) {
        e1.e eVar2 = new e1.e(null, eVar.f4274b, null, sVar, eVar.f4275c);
        View.AccessibilityDelegate a3 = a(view);
        C0205b c0205b = a3 == null ? null : a3 instanceof C0204a ? ((C0204a) a3).f4185a : new C0205b(a3);
        if (c0205b == null) {
            c0205b = new C0205b();
        }
        j(view, c0205b);
        g(view, eVar2.a());
        c(view).add(eVar2);
        e(view, 0);
    }

    public static void i(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i3) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC0183E.d(view, context, iArr, attributeSet, typedArray, i3, 0);
        }
    }

    public static void j(View view, C0205b c0205b) {
        if (c0205b == null && (a(view) instanceof C0204a)) {
            c0205b = new C0205b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c0205b == null ? null : c0205b.f4188b);
    }

    public static void k(View view, CharSequence charSequence) {
        Object tag;
        E.z zVar = new E.z(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28);
        if (Build.VERSION.SDK_INT >= zVar.f1144b) {
            AbstractC0182D.h(view, charSequence);
        } else {
            if (Build.VERSION.SDK_INT >= zVar.f1144b) {
                tag = AbstractC0182D.b(view);
            } else {
                tag = view.getTag(zVar.f1143a);
                if (!((Class) zVar.f1146d).isInstance(tag)) {
                    tag = null;
                }
            }
            if (!TextUtils.equals((CharSequence) tag, charSequence)) {
                View.AccessibilityDelegate a3 = a(view);
                C0205b c0205b = a3 == null ? null : a3 instanceof C0204a ? ((C0204a) a3).f4185a : new C0205b(a3);
                if (c0205b == null) {
                    c0205b = new C0205b();
                }
                j(view, c0205b);
                view.setTag(zVar.f1143a, charSequence);
                e(view, zVar.f1145c);
            }
        }
        ViewTreeObserverOnGlobalLayoutListenerC0226w viewTreeObserverOnGlobalLayoutListenerC0226w = f4154e;
        if (charSequence == null) {
            viewTreeObserverOnGlobalLayoutListenerC0226w.f4241d.remove(view);
            view.removeOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC0226w);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0226w);
        } else {
            viewTreeObserverOnGlobalLayoutListenerC0226w.f4241d.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC0226w);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0226w);
            }
        }
    }
}
