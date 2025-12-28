package k;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: k.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0300b implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4753d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f4754e;

    public /* synthetic */ RunnableC0300b(ActionBarOverlayLayout actionBarOverlayLayout, int i3) {
        this.f4753d = i3;
        this.f4754e = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4753d) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f4754e;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f3144w = actionBarOverlayLayout.f3128f.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f3145x);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f4754e;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f3144w = actionBarOverlayLayout2.f3128f.animate().translationY(-actionBarOverlayLayout2.f3128f.getHeight()).setListener(actionBarOverlayLayout2.f3145x);
                break;
        }
    }
}
