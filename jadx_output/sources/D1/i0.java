package d1;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public final class i0 extends h0 {

    /* renamed from: q, reason: collision with root package name */
    public static final l0 f4219q;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f4219q = l0.d(null, windowInsets);
    }

    public i0(l0 l0Var, WindowInsets windowInsets) {
        super(l0Var, windowInsets);
    }

    @Override // d1.e0, d1.j0
    public final void d(View view) {
    }

    @Override // d1.e0, d1.j0
    public V0.c f(int i3) {
        Insets insets;
        insets = this.f4201c.getInsets(k0.a(i3));
        return V0.c.c(insets);
    }
}
