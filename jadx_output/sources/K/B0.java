package k;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class B0 implements AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SearchView f4635d;

    public B0(SearchView searchView) {
        this.f4635d = searchView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i3, long j3) {
        this.f4635d.m(i3);
    }
}
