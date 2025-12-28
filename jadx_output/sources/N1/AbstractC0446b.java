package n1;

import A.t;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import d1.AbstractC0189K;
import d1.C0205b;
import e1.j;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* renamed from: n1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0446b extends C0205b {

    /* renamed from: n, reason: collision with root package name */
    public static final Rect f5324n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o, reason: collision with root package name */
    public static final X1.e f5325o = new X1.e(19);

    /* renamed from: p, reason: collision with root package name */
    public static final X1.e f5326p = new X1.e(20);
    public final AccessibilityManager h;

    /* renamed from: i, reason: collision with root package name */
    public final Chip f5331i;

    /* renamed from: j, reason: collision with root package name */
    public C0445a f5332j;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f5327d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final Rect f5328e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    public final Rect f5329f = new Rect();

    /* renamed from: g, reason: collision with root package name */
    public final int[] f5330g = new int[2];

    /* renamed from: k, reason: collision with root package name */
    public int f5333k = Integer.MIN_VALUE;

    /* renamed from: l, reason: collision with root package name */
    public int f5334l = Integer.MIN_VALUE;

    /* renamed from: m, reason: collision with root package name */
    public int f5335m = Integer.MIN_VALUE;

    public AbstractC0446b(Chip chip) {
        if (chip == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f5331i = chip;
        this.h = (AccessibilityManager) chip.getContext().getSystemService("accessibility");
        chip.setFocusable(true);
        Field field = AbstractC0189K.f4150a;
        if (chip.getImportantForAccessibility() == 0) {
            chip.setImportantForAccessibility(1);
        }
    }

    @Override // d1.C0205b
    public final t b(View view) {
        if (this.f5332j == null) {
            this.f5332j = new C0445a(this, 0);
        }
        return this.f5332j;
    }

    @Override // d1.C0205b
    public final void d(View view, j jVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f4187a;
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.f4278a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = ((P1.d) this).f2107q;
        accessibilityNodeInfo.setCheckable(chip.d());
        accessibilityNodeInfo.setClickable(chip.isClickable());
        jVar.h(chip.getAccessibilityClassName());
        jVar.j(chip.getText());
    }

    public final boolean j(int i3) {
        if (this.f5334l != i3) {
            return false;
        }
        this.f5334l = Integer.MIN_VALUE;
        P1.d dVar = (P1.d) this;
        if (i3 == 1) {
            Chip chip = dVar.f2107q;
            chip.f3966p = false;
            chip.refreshDrawableState();
        }
        q(i3, 8);
        return true;
    }

    public final j k(int i3) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        j jVar = new j(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        jVar.h("android.view.View");
        Rect rect = f5324n;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        jVar.f4279b = -1;
        Chip chip = this.f5331i;
        obtain.setParent(chip);
        o(i3, jVar);
        if (jVar.g() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f5328e;
        jVar.f(rect2);
        if (rect2.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = obtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        obtain.setPackageName(chip.getContext().getPackageName());
        jVar.f4280c = i3;
        obtain.setSource(chip, i3);
        if (this.f5333k == i3) {
            obtain.setAccessibilityFocused(true);
            jVar.a(128);
        } else {
            obtain.setAccessibilityFocused(false);
            jVar.a(64);
        }
        boolean z3 = this.f5334l == i3;
        if (z3) {
            jVar.a(2);
        } else if (obtain.isFocusable()) {
            jVar.a(1);
        }
        obtain.setFocused(z3);
        int[] iArr = this.f5330g;
        chip.getLocationOnScreen(iArr);
        Rect rect3 = this.f5327d;
        obtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            jVar.f(rect3);
            if (jVar.f4279b != -1) {
                j jVar2 = new j(AccessibilityNodeInfo.obtain());
                for (int i4 = jVar.f4279b; i4 != -1; i4 = jVar2.f4279b) {
                    jVar2.f4279b = -1;
                    AccessibilityNodeInfo accessibilityNodeInfo = jVar2.f4278a;
                    accessibilityNodeInfo.setParent(chip, -1);
                    accessibilityNodeInfo.setBoundsInParent(rect);
                    o(i4, jVar2);
                    jVar2.f(rect2);
                    rect3.offset(rect2.left, rect2.top);
                }
            }
            rect3.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
        }
        Rect rect4 = this.f5329f;
        if (chip.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
            if (rect3.intersect(rect4)) {
                AccessibilityNodeInfo accessibilityNodeInfo2 = jVar.f4278a;
                accessibilityNodeInfo2.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && chip.getWindowVisibility() == 0) {
                    Object parent = chip.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view = (View) parent;
                            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                                break;
                            }
                            parent = view.getParent();
                        } else if (parent != null) {
                            accessibilityNodeInfo2.setVisibleToUser(true);
                        }
                    }
                }
            }
        }
        return jVar;
    }

    public abstract void l(ArrayList arrayList);

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(int r20, android.graphics.Rect r21) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.AbstractC0446b.m(int, android.graphics.Rect):boolean");
    }

    public final j n(int i3) {
        if (i3 != -1) {
            return k(i3);
        }
        Chip chip = this.f5331i;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(chip);
        j jVar = new j(obtain);
        Field field = AbstractC0189K.f4150a;
        chip.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            jVar.f4278a.addChild(chip, ((Integer) arrayList.get(i4)).intValue());
        }
        return jVar;
    }

    public abstract void o(int i3, j jVar);

    public final boolean p(int i3) {
        int i4;
        Chip chip = this.f5331i;
        if ((!chip.isFocused() && !chip.requestFocus()) || (i4 = this.f5334l) == i3) {
            return false;
        }
        if (i4 != Integer.MIN_VALUE) {
            j(i4);
        }
        if (i3 == Integer.MIN_VALUE) {
            return false;
        }
        this.f5334l = i3;
        P1.d dVar = (P1.d) this;
        if (i3 == 1) {
            Chip chip2 = dVar.f2107q;
            chip2.f3966p = true;
            chip2.refreshDrawableState();
        }
        q(i3, 8);
        return true;
    }

    public final void q(int i3, int i4) {
        View view;
        ViewParent parent;
        AccessibilityEvent obtain;
        if (i3 == Integer.MIN_VALUE || !this.h.isEnabled() || (parent = (view = this.f5331i).getParent()) == null) {
            return;
        }
        if (i3 != -1) {
            obtain = AccessibilityEvent.obtain(i4);
            j n2 = n(i3);
            obtain.getText().add(n2.g());
            AccessibilityNodeInfo accessibilityNodeInfo = n2.f4278a;
            obtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            obtain.setScrollable(accessibilityNodeInfo.isScrollable());
            obtain.setPassword(accessibilityNodeInfo.isPassword());
            obtain.setEnabled(accessibilityNodeInfo.isEnabled());
            obtain.setChecked(accessibilityNodeInfo.isChecked());
            if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            obtain.setClassName(accessibilityNodeInfo.getClassName());
            obtain.setSource(view, i3);
            obtain.setPackageName(view.getContext().getPackageName());
        } else {
            obtain = AccessibilityEvent.obtain(i4);
            view.onInitializeAccessibilityEvent(obtain);
        }
        parent.requestSendAccessibilityEvent(view, obtain);
    }
}
