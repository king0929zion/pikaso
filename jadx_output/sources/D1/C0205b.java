package d1;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.ai.assistance.operit.provider.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* renamed from: d1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0205b {

    /* renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f4186c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f4187a;

    /* renamed from: b, reason: collision with root package name */
    public final C0204a f4188b;

    public C0205b() {
        this(f4186c);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f4187a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public A.t b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f4187a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new A.t(21, accessibilityNodeProvider);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f4187a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, e1.j jVar) {
        this.f4187a.onInitializeAccessibilityNodeInfo(view, jVar.f4278a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f4187a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f4187a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i3, Bundle bundle) {
        boolean z3;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        boolean z4 = false;
        int i4 = 0;
        while (true) {
            if (i4 >= list.size()) {
                break;
            }
            e1.e eVar = (e1.e) list.get(i4);
            if (eVar.a() == i3) {
                e1.s sVar = eVar.f4276d;
                if (sVar != null) {
                    Class cls = eVar.f4275c;
                    if (cls != null) {
                        try {
                            if (cls.getDeclaredConstructor(null).newInstance(null) == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        } catch (Exception e3) {
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e3);
                        }
                    }
                    z3 = sVar.f(view);
                }
            } else {
                i4++;
            }
        }
        z3 = false;
        if (!z3) {
            z3 = this.f4187a.performAccessibilityAction(view, i3, bundle);
        }
        if (z3 || i3 != R.id.accessibility_action_clickable_span || bundle == null) {
            return z3;
        }
        int i5 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i5)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            int i6 = 0;
            while (true) {
                if (clickableSpanArr == null || i6 >= clickableSpanArr.length) {
                    break;
                }
                if (clickableSpan.equals(clickableSpanArr[i6])) {
                    clickableSpan.onClick(view);
                    z4 = true;
                    break;
                }
                i6++;
            }
        }
        return z4;
    }

    public void h(View view, int i3) {
        this.f4187a.sendAccessibilityEvent(view, i3);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f4187a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C0205b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f4187a = accessibilityDelegate;
        this.f4188b = new C0204a(this);
    }
}
