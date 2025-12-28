package M1;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1673d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1674e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ View f1675f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1676g;

    public b(TextView textView, Typeface typeface, int i3) {
        this.f1675f = textView;
        this.f1676g = typeface;
        this.f1674e = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1673d) {
            case 0:
                ((BottomSheetBehavior) this.f1676g).E(this.f1675f, this.f1674e, false);
                break;
            default:
                ((TextView) this.f1675f).setTypeface((Typeface) this.f1676g, this.f1674e);
                break;
        }
    }

    public b(BottomSheetBehavior bottomSheetBehavior, View view, int i3) {
        this.f1676g = bottomSheetBehavior;
        this.f1675f = view;
        this.f1674e = i3;
    }
}
