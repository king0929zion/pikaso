package a2;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class w implements TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3072d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f3073e;

    public /* synthetic */ w(ViewGroup viewGroup, int i3) {
        this.f3072d = i3;
        this.f3073e = viewGroup;
    }

    private final void a(Editable editable) {
    }

    private final void b(int i3, int i4, int i5, CharSequence charSequence) {
    }

    private final void c(int i3, int i4, int i5, CharSequence charSequence) {
    }

    private final void d(int i3, int i4, int i5, CharSequence charSequence) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.f3072d) {
            case 0:
                TextInputLayout textInputLayout = (TextInputLayout) this.f3073e;
                textInputLayout.u(!textInputLayout.f4029C0, false);
                if (textInputLayout.f4070n) {
                    textInputLayout.n(editable);
                }
                if (textInputLayout.f4085v) {
                    textInputLayout.v(editable);
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
        int i6 = this.f3072d;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
        switch (this.f3072d) {
            case 0:
                break;
            default:
                SearchView searchView = (SearchView) this.f3073e;
                Editable text = searchView.f3200s.getText();
                searchView.f3193b0 = text;
                boolean isEmpty = TextUtils.isEmpty(text);
                searchView.u(!isEmpty);
                int i6 = 8;
                if (searchView.f3192a0 && !searchView.f3185Q && isEmpty) {
                    searchView.f3205x.setVisibility(8);
                    i6 = 0;
                }
                searchView.f3207z.setVisibility(i6);
                searchView.q();
                searchView.t();
                charSequence.toString();
                break;
        }
    }
}
