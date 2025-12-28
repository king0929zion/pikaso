package d1;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class b0 extends d0 {

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f4189c;

    public b0() {
        this.f4189c = a0.g();
    }

    @Override // d1.d0
    public l0 b() {
        WindowInsets build;
        a();
        build = this.f4189c.build();
        l0 d3 = l0.d(null, build);
        d3.f4228a.o(this.f4196b);
        return d3;
    }

    @Override // d1.d0
    public void d(V0.c cVar) {
        this.f4189c.setMandatorySystemGestureInsets(cVar.d());
    }

    @Override // d1.d0
    public void e(V0.c cVar) {
        this.f4189c.setStableInsets(cVar.d());
    }

    @Override // d1.d0
    public void f(V0.c cVar) {
        this.f4189c.setSystemGestureInsets(cVar.d());
    }

    @Override // d1.d0
    public void g(V0.c cVar) {
        this.f4189c.setSystemWindowInsets(cVar.d());
    }

    @Override // d1.d0
    public void h(V0.c cVar) {
        this.f4189c.setTappableElementInsets(cVar.d());
    }

    public b0(l0 l0Var) {
        super(l0Var);
        WindowInsets.Builder g3;
        WindowInsets c3 = l0Var.c();
        if (c3 != null) {
            g3 = a0.h(c3);
        } else {
            g3 = a0.g();
        }
        this.f4189c = g3;
    }
}
