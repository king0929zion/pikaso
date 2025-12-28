package d1;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class f0 extends e0 {

    /* renamed from: m, reason: collision with root package name */
    public V0.c f4207m;

    public f0(l0 l0Var, WindowInsets windowInsets) {
        super(l0Var, windowInsets);
        this.f4207m = null;
    }

    @Override // d1.j0
    public l0 b() {
        return l0.d(null, this.f4201c.consumeStableInsets());
    }

    @Override // d1.j0
    public l0 c() {
        return l0.d(null, this.f4201c.consumeSystemWindowInsets());
    }

    @Override // d1.j0
    public final V0.c h() {
        if (this.f4207m == null) {
            WindowInsets windowInsets = this.f4201c;
            this.f4207m = V0.c.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f4207m;
    }

    @Override // d1.j0
    public boolean m() {
        return this.f4201c.isConsumed();
    }

    @Override // d1.j0
    public void q(V0.c cVar) {
        this.f4207m = cVar;
    }
}
