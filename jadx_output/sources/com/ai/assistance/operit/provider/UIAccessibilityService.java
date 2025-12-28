package com.ai.assistance.operit.provider;

import G1.l;
import android.accessibilityservice.AccessibilityService;
import android.content.Intent;
import android.graphics.Rect;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.xmlpull.v1.XmlSerializer;
import p2.g;

/* loaded from: classes.dex */
public final class UIAccessibilityService extends AccessibilityService {
    public static boolean h = false;

    /* renamed from: i, reason: collision with root package name */
    public static l f3844i = null;

    /* renamed from: j, reason: collision with root package name */
    public static volatile String f3845j = "";

    /* renamed from: e, reason: collision with root package name */
    public long f3847e;

    /* renamed from: d, reason: collision with root package name */
    public final Object f3846d = new Object();

    /* renamed from: f, reason: collision with root package name */
    public final long f3848f = 1100;

    /* renamed from: g, reason: collision with root package name */
    public final l f3849g = new l(this);

    public static AccessibilityNodeInfo a(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (accessibilityNodeInfo.isEditable()) {
            return AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
        }
        int childCount = accessibilityNodeInfo.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i3);
            if (child != null) {
                AccessibilityNodeInfo a3 = a(child);
                child.recycle();
                if (a3 != null) {
                    return a3;
                }
            }
        }
        return null;
    }

    public static AccessibilityNodeInfo b(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        Rect rect = new Rect();
        accessibilityNodeInfo.getBoundsInScreen(rect);
        if (g.a(rect.toShortString(), str)) {
            return AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
        }
        int childCount = accessibilityNodeInfo.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i3);
            if (child != null) {
                AccessibilityNodeInfo b3 = b(child, str);
                child.recycle();
                if (b3 != null) {
                    return b3;
                }
            }
        }
        return null;
    }

    public static void c(AccessibilityNodeInfo accessibilityNodeInfo, XmlSerializer xmlSerializer) {
        String str;
        String str2;
        String str3;
        String str4;
        if (accessibilityNodeInfo == null) {
            return;
        }
        xmlSerializer.startTag(null, "node");
        CharSequence className = accessibilityNodeInfo.getClassName();
        if (className == null || (str = className.toString()) == null) {
            str = "";
        }
        xmlSerializer.attribute(null, "class", str);
        CharSequence packageName = accessibilityNodeInfo.getPackageName();
        if (packageName == null || (str2 = packageName.toString()) == null) {
            str2 = "";
        }
        xmlSerializer.attribute(null, "package", str2);
        CharSequence contentDescription = accessibilityNodeInfo.getContentDescription();
        if (contentDescription == null || (str3 = contentDescription.toString()) == null) {
            str3 = "";
        }
        xmlSerializer.attribute(null, "content-desc", str3);
        CharSequence text = accessibilityNodeInfo.getText();
        if (text == null || (str4 = text.toString()) == null) {
            str4 = "";
        }
        xmlSerializer.attribute(null, "text", str4);
        String viewIdResourceName = accessibilityNodeInfo.getViewIdResourceName();
        if (viewIdResourceName == null) {
            viewIdResourceName = "";
        }
        xmlSerializer.attribute(null, "resource-id", viewIdResourceName);
        Rect rect = new Rect();
        accessibilityNodeInfo.getBoundsInScreen(rect);
        String shortString = rect.toShortString();
        xmlSerializer.attribute(null, "bounds", shortString != null ? shortString : "");
        xmlSerializer.attribute(null, "clickable", String.valueOf(accessibilityNodeInfo.isClickable()));
        xmlSerializer.attribute(null, "focused", String.valueOf(accessibilityNodeInfo.isFocused()));
        int childCount = accessibilityNodeInfo.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            c(accessibilityNodeInfo.getChild(i3), xmlSerializer);
        }
        xmlSerializer.endTag(null, "node");
        accessibilityNodeInfo.recycle();
    }

    @Override // android.accessibilityservice.AccessibilityService
    public final void onAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent != null && accessibilityEvent.getEventType() == 32) {
            CharSequence className = accessibilityEvent.getClassName();
            String obj = className != null ? className.toString() : null;
            if (obj == null || obj.length() == 0) {
                return;
            }
            f3845j = obj;
            Log.d("UIAccessibilityService", "Activity changed to: ".concat(obj));
        }
    }

    @Override // android.accessibilityservice.AccessibilityService
    public final void onInterrupt() {
        h = false;
        f3844i = null;
        f3845j = "";
        Log.d("UIAccessibilityService", "服务已中断，状态更新为 false");
    }

    @Override // android.accessibilityservice.AccessibilityService
    public final void onServiceConnected() {
        super.onServiceConnected();
        h = true;
        f3844i = this.f3849g;
        Log.d("UIAccessibilityService", "服务已连接，状态更新为 true");
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        h = false;
        f3844i = null;
        f3845j = "";
        Log.d("UIAccessibilityService", "服务已解绑，状态更新为 false");
        return super.onUnbind(intent);
    }
}
