package e1;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static final e f4264e;

    /* renamed from: f, reason: collision with root package name */
    public static final e f4265f;

    /* renamed from: g, reason: collision with root package name */
    public static final e f4266g;
    public static final e h;

    /* renamed from: i, reason: collision with root package name */
    public static final e f4267i;

    /* renamed from: j, reason: collision with root package name */
    public static final e f4268j;

    /* renamed from: k, reason: collision with root package name */
    public static final e f4269k;

    /* renamed from: l, reason: collision with root package name */
    public static final e f4270l;

    /* renamed from: m, reason: collision with root package name */
    public static final e f4271m;

    /* renamed from: n, reason: collision with root package name */
    public static final e f4272n;

    /* renamed from: a, reason: collision with root package name */
    public final Object f4273a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4274b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f4275c;

    /* renamed from: d, reason: collision with root package name */
    public final s f4276d;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
        new e((String) null, 1);
        new e((String) null, 2);
        new e((String) null, 4);
        new e((String) null, 8);
        f4264e = new e((String) null, 16);
        new e((String) null, 32);
        f4265f = new e((String) null, 64);
        f4266g = new e((String) null, 128);
        new e(256, l.class);
        new e(512, l.class);
        new e(1024, m.class);
        new e(2048, m.class);
        h = new e((String) null, 4096);
        f4267i = new e((String) null, 8192);
        new e((String) null, 16384);
        new e((String) null, 32768);
        new e((String) null, 65536);
        new e(131072, q.class);
        f4268j = new e((String) null, 262144);
        f4269k = new e((String) null, 524288);
        f4270l = new e((String) null, 1048576);
        new e(2097152, r.class);
        int i3 = Build.VERSION.SDK_INT;
        new e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        new e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, o.class);
        f4271m = new e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        new e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        f4272n = new e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        new e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        new e(i3 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
        if (i3 >= 29) {
            accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
            accessibilityAction = accessibilityAction16;
        } else {
            accessibilityAction = null;
        }
        new e(accessibilityAction, R.id.accessibilityActionPageDown, null, null, null);
        new e(i3 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
        if (i3 >= 29) {
            accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
            accessibilityAction2 = accessibilityAction15;
        } else {
            accessibilityAction2 = null;
        }
        new e(accessibilityAction2, R.id.accessibilityActionPageRight, null, null, null);
        new e(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        new e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, p.class);
        new e(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, n.class);
        if (i3 >= 28) {
            accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
            accessibilityAction3 = accessibilityAction14;
        } else {
            accessibilityAction3 = null;
        }
        new e(accessibilityAction3, R.id.accessibilityActionShowTooltip, null, null, null);
        if (i3 >= 28) {
            accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            accessibilityAction4 = accessibilityAction13;
        } else {
            accessibilityAction4 = null;
        }
        new e(accessibilityAction4, R.id.accessibilityActionHideTooltip, null, null, null);
        new e(i3 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        if (i3 >= 30) {
            accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            accessibilityAction5 = accessibilityAction12;
        } else {
            accessibilityAction5 = null;
        }
        new e(accessibilityAction5, R.id.accessibilityActionImeEnter, null, null, null);
        new e(i3 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
        if (i3 >= 32) {
            accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
            accessibilityAction6 = accessibilityAction11;
        } else {
            accessibilityAction6 = null;
        }
        new e(accessibilityAction6, R.id.accessibilityActionDragDrop, null, null, null);
        if (i3 >= 32) {
            accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
            accessibilityAction7 = accessibilityAction10;
        } else {
            accessibilityAction7 = null;
        }
        new e(accessibilityAction7, R.id.accessibilityActionDragCancel, null, null, null);
        if (i3 >= 33) {
            accessibilityAction9 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
            accessibilityAction8 = accessibilityAction9;
        } else {
            accessibilityAction8 = null;
        }
        new e(accessibilityAction8, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        new e(i3 >= 34 ? h.a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
    }

    public e(String str, int i3) {
        this(null, i3, str, null, null);
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f4273a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof e)) {
            return false;
        }
        Object obj2 = ((e) obj).f4273a;
        Object obj3 = this.f4273a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f4273a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String d3 = j.d(this.f4274b);
        if (d3.equals("ACTION_UNKNOWN")) {
            Object obj = this.f4273a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                d3 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(d3);
        return sb.toString();
    }

    public e(int i3, Class cls) {
        this(null, i3, null, null, cls);
    }

    public e(Object obj, int i3, String str, s sVar, Class cls) {
        this.f4274b = i3;
        this.f4276d = sVar;
        if (obj == null) {
            this.f4273a = new AccessibilityNodeInfo.AccessibilityAction(i3, str);
        } else {
            this.f4273a = obj;
        }
        this.f4275c = cls;
    }
}
