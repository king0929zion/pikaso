package e1;

import A.t;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* loaded from: classes.dex */
public final class k extends AccessibilityNodeProvider {

    /* renamed from: a, reason: collision with root package name */
    public final t f4281a;

    public k(t tVar) {
        this.f4281a = tVar;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final void addExtraDataToAccessibilityNodeInfo(int i3, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        this.f4281a.s(i3, new j(accessibilityNodeInfo), str, bundle);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i3) {
        j v3 = this.f4281a.v(i3);
        if (v3 == null) {
            return null;
        }
        return v3.f4278a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i3) {
        this.f4281a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i3) {
        j w3 = this.f4281a.w(i3);
        if (w3 == null) {
            return null;
        }
        return w3.f4278a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i3, int i4, Bundle bundle) {
        return this.f4281a.B(i3, i4, bundle);
    }
}
