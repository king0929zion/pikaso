package e1;

import a2.C0112k;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import d1.AbstractC0189K;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class b implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final N.g f4263a;

    public b(N.g gVar) {
        this.f4263a = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f4263a.equals(((b) obj).f4263a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4263a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z3) {
        C0112k c0112k = (C0112k) this.f4263a.f1735a;
        AutoCompleteTextView autoCompleteTextView = c0112k.h;
        if (autoCompleteTextView == null || Z.b.A(autoCompleteTextView)) {
            return;
        }
        int i3 = z3 ? 2 : 1;
        Field field = AbstractC0189K.f4150a;
        c0112k.f3025d.setImportantForAccessibility(i3);
    }
}
