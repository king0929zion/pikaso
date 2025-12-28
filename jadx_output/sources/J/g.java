package j;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g extends BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final i f4513d;

    /* renamed from: e, reason: collision with root package name */
    public int f4514e = -1;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4515f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4516g;
    public final LayoutInflater h;

    /* renamed from: i, reason: collision with root package name */
    public final int f4517i;

    public g(i iVar, LayoutInflater layoutInflater, boolean z3, int i3) {
        this.f4516g = z3;
        this.h = layoutInflater;
        this.f4513d = iVar;
        this.f4517i = i3;
        a();
    }

    public final void a() {
        i iVar = this.f4513d;
        j jVar = iVar.f4536s;
        if (jVar != null) {
            iVar.i();
            ArrayList arrayList = iVar.f4527j;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (((j) arrayList.get(i3)) == jVar) {
                    this.f4514e = i3;
                    return;
                }
            }
        }
        this.f4514e = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final j getItem(int i3) {
        ArrayList k3;
        i iVar = this.f4513d;
        if (this.f4516g) {
            iVar.i();
            k3 = iVar.f4527j;
        } else {
            k3 = iVar.k();
        }
        int i4 = this.f4514e;
        if (i4 >= 0 && i3 >= i4) {
            i3++;
        }
        return (j) k3.get(i3);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList k3;
        i iVar = this.f4513d;
        if (this.f4516g) {
            iVar.i();
            k3 = iVar.f4527j;
        } else {
            k3 = iVar.k();
        }
        return this.f4514e < 0 ? k3.size() : k3.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i3) {
        return i3;
    }

    @Override // android.widget.Adapter
    public final View getView(int i3, View view, ViewGroup viewGroup) {
        boolean z3 = false;
        if (view == null) {
            view = this.h.inflate(this.f4517i, viewGroup, false);
        }
        int i4 = getItem(i3).f4541b;
        int i5 = i3 - 1;
        int i6 = i5 >= 0 ? getItem(i5).f4541b : i4;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f4513d.l() && i4 != i6) {
            z3 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z3);
        q qVar = (q) view;
        if (this.f4515f) {
            listMenuItemView.setForceShowIcon(true);
        }
        qVar.c(getItem(i3));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
