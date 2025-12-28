package a2;

import android.view.View;

/* renamed from: a2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC0103b implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2960a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC0118q f2961b;

    public /* synthetic */ ViewOnFocusChangeListenerC0103b(AbstractC0118q abstractC0118q, int i3) {
        this.f2960a = i3;
        this.f2961b = abstractC0118q;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z3) {
        switch (this.f2960a) {
            case 0:
                C0106e c0106e = (C0106e) this.f2961b;
                c0106e.t(c0106e.u());
                break;
            default:
                C0112k c0112k = (C0112k) this.f2961b;
                c0112k.f2986l = z3;
                c0112k.q();
                if (!z3) {
                    c0112k.t(false);
                    c0112k.f2987m = false;
                    break;
                }
                break;
        }
    }
}
