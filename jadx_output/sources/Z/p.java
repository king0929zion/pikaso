package Z;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import o0.H0;

/* loaded from: classes.dex */
public final class p extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2888a;

    public /* synthetic */ p(int i3) {
        this.f2888a = i3;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Outline outline2;
        switch (this.f2888a) {
            case 0:
                if ((view instanceof q) && (outline2 = ((q) view).h) != null) {
                    outline.set(outline2);
                    break;
                }
                break;
            default:
                p2.g.c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
                Outline b3 = ((H0) view).h.b();
                p2.g.b(b3);
                outline.set(b3);
                break;
        }
    }
}
