package d1;

import android.graphics.Insets;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class h0 extends g0 {

    /* renamed from: n, reason: collision with root package name */
    public V0.c f4215n;

    /* renamed from: o, reason: collision with root package name */
    public V0.c f4216o;

    /* renamed from: p, reason: collision with root package name */
    public V0.c f4217p;

    public h0(l0 l0Var, WindowInsets windowInsets) {
        super(l0Var, windowInsets);
        this.f4215n = null;
        this.f4216o = null;
        this.f4217p = null;
    }

    @Override // d1.j0
    public V0.c g() {
        Insets mandatorySystemGestureInsets;
        if (this.f4216o == null) {
            mandatorySystemGestureInsets = this.f4201c.getMandatorySystemGestureInsets();
            this.f4216o = V0.c.c(mandatorySystemGestureInsets);
        }
        return this.f4216o;
    }

    @Override // d1.j0
    public V0.c i() {
        Insets systemGestureInsets;
        if (this.f4215n == null) {
            systemGestureInsets = this.f4201c.getSystemGestureInsets();
            this.f4215n = V0.c.c(systemGestureInsets);
        }
        return this.f4215n;
    }

    @Override // d1.j0
    public V0.c k() {
        Insets tappableElementInsets;
        if (this.f4217p == null) {
            tappableElementInsets = this.f4201c.getTappableElementInsets();
            this.f4217p = V0.c.c(tappableElementInsets);
        }
        return this.f4217p;
    }

    @Override // d1.e0, d1.j0
    public l0 l(int i3, int i4, int i5, int i6) {
        WindowInsets inset;
        inset = this.f4201c.inset(i3, i4, i5, i6);
        return l0.d(null, inset);
    }

    @Override // d1.f0, d1.j0
    public void q(V0.c cVar) {
    }
}
