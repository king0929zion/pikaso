package L1;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import com.ai.assistance.operit.provider.R;
import com.google.android.material.bottomappbar.BottomAppBar$Behavior;
import k.Y0;

/* loaded from: classes.dex */
public final class a implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1515a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1516b;

    public /* synthetic */ a(int i3, Object obj) {
        this.f1515a = i3;
        this.f1516b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        switch (this.f1515a) {
            case 0:
                ((BottomAppBar$Behavior) this.f1516b).getClass();
                throw null;
            default:
                SearchView searchView = (SearchView) this.f1516b;
                View view2 = searchView.f3169A;
                if (view2.getWidth() > 1) {
                    Resources resources = searchView.getContext().getResources();
                    int paddingLeft = searchView.f3202u.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean a3 = Y0.a(searchView);
                    int dimensionPixelSize = searchView.f3184P ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) : 0;
                    SearchView.SearchAutoComplete searchAutoComplete = searchView.f3200s;
                    searchAutoComplete.getDropDownBackground().getPadding(rect);
                    searchAutoComplete.setDropDownHorizontalOffset(a3 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                    searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
                    return;
                }
                return;
        }
    }
}
