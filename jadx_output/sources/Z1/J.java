package z1;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import d1.C0205b;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class J extends C0205b {

    /* renamed from: d, reason: collision with root package name */
    public final K f6978d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakHashMap f6979e = new WeakHashMap();

    public J(K k3) {
        this.f6978d = k3;
    }

    @Override // d1.C0205b
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        C0205b c0205b = (C0205b) this.f6979e.get(view);
        return c0205b != null ? c0205b.a(view, accessibilityEvent) : this.f4187a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // d1.C0205b
    public final A.t b(View view) {
        C0205b c0205b = (C0205b) this.f6979e.get(view);
        return c0205b != null ? c0205b.b(view) : super.b(view);
    }

    @Override // d1.C0205b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        C0205b c0205b = (C0205b) this.f6979e.get(view);
        if (c0205b != null) {
            c0205b.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // d1.C0205b
    public final void d(View view, e1.j jVar) {
        K k3 = this.f6978d;
        boolean s3 = k3.f6980d.s();
        View.AccessibilityDelegate accessibilityDelegate = this.f4187a;
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.f4278a;
        if (!s3) {
            RecyclerView recyclerView = k3.f6980d;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().D(view, jVar);
                C0205b c0205b = (C0205b) this.f6979e.get(view);
                if (c0205b != null) {
                    c0205b.d(view, jVar);
                    return;
                } else {
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    return;
                }
            }
        }
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
    }

    @Override // d1.C0205b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        C0205b c0205b = (C0205b) this.f6979e.get(view);
        if (c0205b != null) {
            c0205b.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // d1.C0205b
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C0205b c0205b = (C0205b) this.f6979e.get(viewGroup);
        return c0205b != null ? c0205b.f(viewGroup, view, accessibilityEvent) : this.f4187a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // d1.C0205b
    public final boolean g(View view, int i3, Bundle bundle) {
        K k3 = this.f6978d;
        if (!k3.f6980d.s()) {
            RecyclerView recyclerView = k3.f6980d;
            if (recyclerView.getLayoutManager() != null) {
                C0205b c0205b = (C0205b) this.f6979e.get(view);
                if (c0205b != null) {
                    if (c0205b.g(view, i3, bundle)) {
                        return true;
                    }
                } else if (super.g(view, i3, bundle)) {
                    return true;
                }
                C0724C c0724c = recyclerView.getLayoutManager().f7082b.f3535d;
                return false;
            }
        }
        return super.g(view, i3, bundle);
    }

    @Override // d1.C0205b
    public final void h(View view, int i3) {
        C0205b c0205b = (C0205b) this.f6979e.get(view);
        if (c0205b != null) {
            c0205b.h(view, i3);
        } else {
            super.h(view, i3);
        }
    }

    @Override // d1.C0205b
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        C0205b c0205b = (C0205b) this.f6979e.get(view);
        if (c0205b != null) {
            c0205b.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
