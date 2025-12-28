package k1;

import A.AbstractC0000a;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import k.C0317j0;
import k.I0;

/* loaded from: classes.dex */
public abstract class b extends BaseAdapter implements Filterable {

    /* renamed from: d, reason: collision with root package name */
    public boolean f4904d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4905e;

    /* renamed from: f, reason: collision with root package name */
    public Cursor f4906f;

    /* renamed from: g, reason: collision with root package name */
    public int f4907g;
    public C0348a h;

    /* renamed from: i, reason: collision with root package name */
    public C0317j0 f4908i;

    /* renamed from: j, reason: collision with root package name */
    public c f4909j;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f4906f;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                C0348a c0348a = this.h;
                if (c0348a != null) {
                    cursor2.unregisterContentObserver(c0348a);
                }
                C0317j0 c0317j0 = this.f4908i;
                if (c0317j0 != null) {
                    cursor2.unregisterDataSetObserver(c0317j0);
                }
            }
            this.f4906f = cursor;
            if (cursor != null) {
                C0348a c0348a2 = this.h;
                if (c0348a2 != null) {
                    cursor.registerContentObserver(c0348a2);
                }
                C0317j0 c0317j02 = this.f4908i;
                if (c0317j02 != null) {
                    cursor.registerDataSetObserver(c0317j02);
                }
                this.f4907g = cursor.getColumnIndexOrThrow("_id");
                this.f4904d = true;
                notifyDataSetChanged();
            } else {
                this.f4907g = -1;
                this.f4904d = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    public abstract View d(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.f4904d || (cursor = this.f4906f) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i3, View view, ViewGroup viewGroup) {
        if (!this.f4904d) {
            return null;
        }
        this.f4906f.moveToPosition(i3);
        if (view == null) {
            I0 i0 = (I0) this;
            view = i0.f4666m.inflate(i0.f4665l, viewGroup, false);
        }
        a(view, this.f4906f);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f4909j == null) {
            c cVar = new c();
            cVar.f4910a = this;
            this.f4909j = cVar;
        }
        return this.f4909j;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i3) {
        Cursor cursor;
        if (!this.f4904d || (cursor = this.f4906f) == null) {
            return null;
        }
        cursor.moveToPosition(i3);
        return this.f4906f;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i3) {
        Cursor cursor;
        if (this.f4904d && (cursor = this.f4906f) != null && cursor.moveToPosition(i3)) {
            return this.f4906f.getLong(this.f4907g);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i3, View view, ViewGroup viewGroup) {
        if (!this.f4904d) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f4906f.moveToPosition(i3)) {
            throw new IllegalStateException(AbstractC0000a.c("couldn't move cursor to position ", i3));
        }
        if (view == null) {
            view = d(viewGroup);
        }
        a(view, this.f4906f);
        return view;
    }
}
