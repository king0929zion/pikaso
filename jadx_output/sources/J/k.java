package j;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public abstract class k implements r, p, AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public Rect f4565d;

    public static int n(ListAdapter listAdapter, Context context, int i3) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i4 = 0;
        int i5 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i6 = 0; i6 < count; i6++) {
            int itemViewType = listAdapter.getItemViewType(i6);
            if (itemViewType != i5) {
                view = null;
                i5 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i6, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i3) {
                return i3;
            }
            if (measuredWidth > i4) {
                i4 = measuredWidth;
            }
        }
        return i4;
    }

    public static boolean v(i iVar) {
        int size = iVar.f4524f.size();
        for (int i3 = 0; i3 < size; i3++) {
            MenuItem item = iVar.getItem(i3);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // j.p
    public final void c(Context context, i iVar) {
    }

    @Override // j.p
    public final boolean f(j jVar) {
        return false;
    }

    @Override // j.p
    public final boolean j(j jVar) {
        return false;
    }

    public abstract void m(i iVar);

    public abstract void o(View view);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i3, long j3) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (g) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (g) listAdapter).f4513d.p((MenuItem) listAdapter.getItem(i3), this, !(this instanceof f) ? 0 : 4);
    }

    public abstract void p(boolean z3);

    public abstract void q(int i3);

    public abstract void r(int i3);

    public abstract void s(PopupWindow.OnDismissListener onDismissListener);

    public abstract void t(boolean z3);

    public abstract void u(int i3);
}
