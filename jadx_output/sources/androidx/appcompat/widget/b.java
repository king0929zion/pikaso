package androidx.appcompat.widget;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class b implements View.OnKeyListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SearchView f3257d;

    public b(SearchView searchView) {
        this.f3257d = searchView;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i3, KeyEvent keyEvent) {
        SearchView searchView = this.f3257d;
        if (searchView.f3196e0 == null) {
            return false;
        }
        SearchView.SearchAutoComplete searchAutoComplete = searchView.f3200s;
        if (!searchAutoComplete.isPopupShowing() || searchAutoComplete.getListSelection() == -1) {
            if (TextUtils.getTrimmedLength(searchAutoComplete.getText()) == 0 || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i3 != 66) {
                return false;
            }
            view.cancelLongPress();
            searchView.getContext().startActivity(searchView.i("android.intent.action.SEARCH", null, null, searchAutoComplete.getText().toString()));
            return true;
        }
        if (searchView.f3196e0 == null || searchView.f3186R == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
            return false;
        }
        if (i3 == 66 || i3 == 84 || i3 == 61) {
            searchView.m(searchAutoComplete.getListSelection());
        } else {
            if (i3 != 21 && i3 != 22) {
                if (i3 != 19) {
                    return false;
                }
                searchAutoComplete.getListSelection();
                return false;
            }
            searchAutoComplete.setSelection(i3 == 21 ? 0 : searchAutoComplete.length());
            searchAutoComplete.setListSelection(0);
            searchAutoComplete.clearListSelection();
            searchAutoComplete.a();
        }
        return true;
    }
}
