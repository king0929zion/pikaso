package k;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import i.InterfaceC0282a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class Q0 implements j.p {

    /* renamed from: d, reason: collision with root package name */
    public j.i f4711d;

    /* renamed from: e, reason: collision with root package name */
    public j.j f4712e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Toolbar f4713f;

    public Q0(Toolbar toolbar) {
        this.f4713f = toolbar;
    }

    @Override // j.p
    public final void a(j.i iVar, boolean z3) {
    }

    @Override // j.p
    public final void c(Context context, j.i iVar) {
        j.j jVar;
        j.i iVar2 = this.f4711d;
        if (iVar2 != null && (jVar = this.f4712e) != null) {
            iVar2.d(jVar);
        }
        this.f4711d = iVar;
    }

    @Override // j.p
    public final boolean d() {
        return false;
    }

    @Override // j.p
    public final boolean f(j.j jVar) {
        Toolbar toolbar = this.f4713f;
        toolbar.c();
        ViewParent parent = toolbar.f3236k.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f3236k);
            }
            toolbar.addView(toolbar.f3236k);
        }
        View view = jVar.f4564z;
        if (view == null) {
            view = null;
        }
        toolbar.f3237l = view;
        this.f4712e = jVar;
        ViewParent parent2 = view.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f3237l);
            }
            R0 g3 = Toolbar.g();
            g3.f4714a = (toolbar.f3242q & 112) | 8388611;
            g3.f4715b = 2;
            toolbar.f3237l.setLayoutParams(g3);
            toolbar.addView(toolbar.f3237l);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((R0) childAt.getLayoutParams()).f4715b != 2 && childAt != toolbar.f3230d) {
                toolbar.removeViewAt(childCount);
                toolbar.f3218H.add(childAt);
            }
        }
        toolbar.requestLayout();
        jVar.f4539B = true;
        jVar.f4552n.o(false);
        KeyEvent.Callback callback = toolbar.f3237l;
        if (callback instanceof InterfaceC0282a) {
            SearchView searchView = (SearchView) ((InterfaceC0282a) callback);
            if (!searchView.f3194c0) {
                searchView.f3194c0 = true;
                SearchView.SearchAutoComplete searchAutoComplete = searchView.f3200s;
                int imeOptions = searchAutoComplete.getImeOptions();
                searchView.f3195d0 = imeOptions;
                searchAutoComplete.setImeOptions(imeOptions | 33554432);
                searchAutoComplete.setText("");
                searchView.setIconified(false);
            }
        }
        toolbar.u();
        return true;
    }

    @Override // j.p
    public final void g() {
        if (this.f4712e != null) {
            j.i iVar = this.f4711d;
            if (iVar != null) {
                int size = iVar.f4524f.size();
                for (int i3 = 0; i3 < size; i3++) {
                    if (this.f4711d.getItem(i3) == this.f4712e) {
                        return;
                    }
                }
            }
            j(this.f4712e);
        }
    }

    @Override // j.p
    public final boolean j(j.j jVar) {
        Toolbar toolbar = this.f4713f;
        KeyEvent.Callback callback = toolbar.f3237l;
        if (callback instanceof InterfaceC0282a) {
            SearchView searchView = (SearchView) ((InterfaceC0282a) callback);
            SearchView.SearchAutoComplete searchAutoComplete = searchView.f3200s;
            searchAutoComplete.setText("");
            searchAutoComplete.setSelection(searchAutoComplete.length());
            searchView.f3193b0 = "";
            searchView.clearFocus();
            searchView.v(true);
            searchAutoComplete.setImeOptions(searchView.f3195d0);
            searchView.f3194c0 = false;
        }
        toolbar.removeView(toolbar.f3237l);
        toolbar.removeView(toolbar.f3236k);
        toolbar.f3237l = null;
        ArrayList arrayList = toolbar.f3218H;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f4712e = null;
        toolbar.requestLayout();
        jVar.f4539B = false;
        jVar.f4552n.o(false);
        toolbar.u();
        return true;
    }

    @Override // j.p
    public final boolean l(j.t tVar) {
        return false;
    }
}
