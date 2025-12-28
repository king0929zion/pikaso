package e1;

import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final AccessibilityNodeInfo.CollectionItemInfo f4277a;

    public i(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
        this.f4277a = collectionItemInfo;
    }

    public static i a(boolean z3, int i3, int i4, int i5, int i6) {
        return new i(AccessibilityNodeInfo.CollectionItemInfo.obtain(i3, i4, i5, i6, false, z3));
    }
}
