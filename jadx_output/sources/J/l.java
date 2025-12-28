package j;

import android.widget.PopupWindow;

/* loaded from: classes.dex */
public final class l implements PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n f4566d;

    public l(n nVar) {
        this.f4566d = nVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f4566d.c();
    }
}
