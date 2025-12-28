package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class a implements View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SearchView f3256d;

    public a(SearchView searchView) {
        this.f3256d = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SearchView searchView = this.f3256d;
        ImageView imageView = searchView.f3204w;
        SearchView.SearchAutoComplete searchAutoComplete = searchView.f3200s;
        if (view == imageView) {
            searchView.v(false);
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
            View.OnClickListener onClickListener = searchView.f3183O;
            if (onClickListener != null) {
                onClickListener.onClick(searchView);
                return;
            }
            return;
        }
        if (view == searchView.f3206y) {
            searchView.l();
            return;
        }
        if (view == searchView.f3205x) {
            searchView.p();
            return;
        }
        if (view != searchView.f3207z) {
            if (view == searchAutoComplete) {
                searchView.k();
                return;
            }
            return;
        }
        SearchableInfo searchableInfo = searchView.f3196e0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    searchView.getContext().startActivity(searchView.j(searchView.f3180L, searchableInfo));
                }
            } else {
                Intent intent = new Intent(searchView.f3179K);
                ComponentName searchActivity = searchableInfo.getSearchActivity();
                intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                searchView.getContext().startActivity(intent);
            }
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }
}
