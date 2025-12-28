package e1;

import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public abstract class g {
    public static i a(boolean z3, int i3, int i4, int i5, int i6, boolean z4, String str, String str2) {
        return new i(new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z3).setColumnIndex(i3).setRowIndex(i4).setColumnSpan(i5).setRowSpan(i6).setSelected(z4).setRowTitle(str).setColumnTitle(str2).build());
    }

    public static j b(AccessibilityNodeInfo accessibilityNodeInfo, int i3, int i4) {
        AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i3, i4);
        if (child != null) {
            return new j(child, 0);
        }
        return null;
    }

    public static String c(Object obj) {
        return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
    }

    public static String d(Object obj) {
        return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
    }

    public static AccessibilityNodeInfo.ExtraRenderingInfo e(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getExtraRenderingInfo();
    }

    public static j f(AccessibilityNodeInfo accessibilityNodeInfo, int i3) {
        AccessibilityNodeInfo parent = accessibilityNodeInfo.getParent(i3);
        if (parent != null) {
            return new j(parent, 0);
        }
        return null;
    }

    public static String g(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static boolean h(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static void i(AccessibilityNodeInfo accessibilityNodeInfo, boolean z3) {
        accessibilityNodeInfo.setTextSelectable(z3);
    }

    public static void j(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        accessibilityNodeInfo.setUniqueId(str);
    }
}
