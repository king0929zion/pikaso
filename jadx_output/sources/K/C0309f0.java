package k;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* renamed from: k.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0309f0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4774d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4775e;

    public /* synthetic */ C0309f0(int i3, Object obj) {
        this.f4774d = i3;
        this.f4775e = obj;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i3, long j3) {
        C0332r0 c0332r0;
        switch (this.f4774d) {
            case 0:
                if (i3 != -1 && (c0332r0 = ((AbstractC0323m0) this.f4775e).f4824f) != null) {
                    c0332r0.setListSelectionHidden(false);
                    break;
                }
                break;
            default:
                ((SearchView) this.f4775e).n(i3);
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i3 = this.f4774d;
    }
}
