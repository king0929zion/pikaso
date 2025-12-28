package k;

import android.view.View;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class z0 implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f4901a;

    public z0(SearchView searchView) {
        this.f4901a = searchView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z3) {
        SearchView searchView = this.f4901a;
        View.OnFocusChangeListener onFocusChangeListener = searchView.f3182N;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(searchView, z3);
        }
    }
}
