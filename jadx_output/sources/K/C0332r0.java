package k;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* renamed from: k.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0332r0 extends AbstractC0299a0 {

    /* renamed from: p, reason: collision with root package name */
    public final int f4865p;

    /* renamed from: q, reason: collision with root package name */
    public final int f4866q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC0325n0 f4867r;

    /* renamed from: s, reason: collision with root package name */
    public j.j f4868s;

    public C0332r0(Context context, boolean z3) {
        super(context, z3);
        if (1 == AbstractC0331q0.a(context.getResources().getConfiguration())) {
            this.f4865p = 21;
            this.f4866q = 22;
        } else {
            this.f4865p = 22;
            this.f4866q = 21;
        }
    }

    @Override // k.AbstractC0299a0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        j.g gVar;
        int i3;
        int pointToPosition;
        int i4;
        if (this.f4867r != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i3 = headerViewListAdapter.getHeadersCount();
                gVar = (j.g) headerViewListAdapter.getWrappedAdapter();
            } else {
                gVar = (j.g) adapter;
                i3 = 0;
            }
            j.j item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i4 = pointToPosition - i3) < 0 || i4 >= gVar.getCount()) ? null : gVar.getItem(i4);
            j.j jVar = this.f4868s;
            if (jVar != item) {
                j.i iVar = gVar.f4513d;
                if (jVar != null) {
                    this.f4867r.n(iVar, jVar);
                }
                this.f4868s = item;
                if (item != null) {
                    this.f4867r.d(iVar, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i3, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i3 == this.f4865p) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i3 != this.f4866q) {
            return super.onKeyDown(i3, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (j.g) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (j.g) adapter).f4513d.c(false);
        return true;
    }

    public void setHoverListener(InterfaceC0325n0 interfaceC0325n0) {
        this.f4867r = interfaceC0325n0;
    }

    @Override // k.AbstractC0299a0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
