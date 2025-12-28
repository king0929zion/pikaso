package z1;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import d1.C0205b;

/* loaded from: classes.dex */
public final class K extends C0205b {

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f6980d;

    /* renamed from: e, reason: collision with root package name */
    public final J f6981e;

    public K(RecyclerView recyclerView) {
        this.f6980d = recyclerView;
        J j3 = this.f6981e;
        if (j3 != null) {
            this.f6981e = j3;
        } else {
            this.f6981e = new J(this);
        }
    }

    @Override // d1.C0205b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f6980d.s()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().C(accessibilityEvent);
        }
    }

    @Override // d1.C0205b
    public final void d(View view, e1.j jVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f4187a;
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.f4278a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        RecyclerView recyclerView = this.f6980d;
        if (recyclerView.s() || recyclerView.getLayoutManager() == null) {
            return;
        }
        w layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f7082b;
        C0724C c0724c = recyclerView2.f3535d;
        if (recyclerView2.canScrollVertically(-1) || layoutManager.f7082b.canScrollHorizontally(-1)) {
            jVar.a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (layoutManager.f7082b.canScrollVertically(1) || layoutManager.f7082b.canScrollHorizontally(1)) {
            jVar.a(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        F f3 = recyclerView2.f3533b0;
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.z(c0724c, f3), layoutManager.q(c0724c, f3), false, 0));
    }

    @Override // d1.C0205b
    public final boolean g(View view, int i3, Bundle bundle) {
        int w3;
        int u3;
        if (super.g(view, i3, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f6980d;
        if (recyclerView.s() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        w layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f7082b;
        C0724C c0724c = recyclerView2.f3535d;
        if (i3 == 4096) {
            w3 = recyclerView2.canScrollVertically(1) ? (layoutManager.f7087g - layoutManager.w()) - layoutManager.t() : 0;
            if (layoutManager.f7082b.canScrollHorizontally(1)) {
                u3 = (layoutManager.f7086f - layoutManager.u()) - layoutManager.v();
            }
            u3 = 0;
        } else if (i3 != 8192) {
            u3 = 0;
            w3 = 0;
        } else {
            w3 = recyclerView2.canScrollVertically(-1) ? -((layoutManager.f7087g - layoutManager.w()) - layoutManager.t()) : 0;
            if (layoutManager.f7082b.canScrollHorizontally(-1)) {
                u3 = -((layoutManager.f7086f - layoutManager.u()) - layoutManager.v());
            }
            u3 = 0;
        }
        if (w3 == 0 && u3 == 0) {
            return false;
        }
        layoutManager.f7082b.B(u3, w3, true);
        return true;
    }
}
