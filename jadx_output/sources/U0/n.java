package U0;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2400d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2401e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2402f;

    public /* synthetic */ n(int i3, int i4, Object obj) {
        this.f2400d = i4;
        this.f2402f = obj;
        this.f2401e = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2400d) {
            case 0:
                ((b) this.f2402f).g(this.f2401e);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f2402f;
                View view = (View) sideSheetBehavior.f4011p.get();
                if (view != null) {
                    sideSheetBehavior.t(view, this.f2401e, false);
                    break;
                }
                break;
        }
    }
}
