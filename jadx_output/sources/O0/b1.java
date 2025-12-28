package o0;

import D.AbstractC0044j;
import D.C0032d;
import D.C0038g;
import D.C0059s;
import D.C0060t;
import D.InterfaceC0056p;
import com.ai.assistance.operit.provider.R;

/* loaded from: classes.dex */
public final class b1 implements InterfaceC0056p, androidx.lifecycle.p {

    /* renamed from: d, reason: collision with root package name */
    public final C0507u f5551d;

    /* renamed from: e, reason: collision with root package name */
    public final C0060t f5552e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5553f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.lifecycle.t f5554g;
    public L.a h = AbstractC0475d0.f5564a;

    public b1(C0507u c0507u, C0060t c0060t) {
        this.f5551d = c0507u;
        this.f5552e = c0060t;
    }

    @Override // androidx.lifecycle.p
    public final void b(androidx.lifecycle.r rVar, androidx.lifecycle.l lVar) {
        if (lVar == androidx.lifecycle.l.ON_DESTROY) {
            e();
        } else {
            if (lVar != androidx.lifecycle.l.ON_CREATE || this.f5553f) {
                return;
            }
            f(this.h);
        }
    }

    public final void e() {
        if (!this.f5553f) {
            this.f5553f = true;
            this.f5551d.getView().setTag(R.id.wrapped_composition_tag, null);
            androidx.lifecycle.t tVar = this.f5554g;
            if (tVar != null) {
                tVar.f(this);
            }
        }
        C0060t c0060t = this.f5552e;
        synchronized (c0060t.f868g) {
            try {
                if (c0060t.f880t.f795C) {
                    C0032d.I("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                    throw null;
                }
                if (!c0060t.f881u) {
                    c0060t.f881u = true;
                    L.a aVar = AbstractC0044j.f778b;
                    boolean z3 = c0060t.f869i.f648e > 0;
                    if (!z3) {
                        if (!c0060t.h.f4958d.g()) {
                        }
                        c0060t.f880t.n();
                    }
                    C0059s c0059s = new C0059s(c0060t.h);
                    if (z3) {
                        D.D0 c3 = c0060t.f869i.c();
                        try {
                            C0032d.D(c3, c0059s);
                            c3.e(true);
                            c0060t.f866e.d();
                            c0060t.f866e.A();
                            c0059s.e();
                        } catch (Throwable th) {
                            c3.e(false);
                            throw th;
                        }
                    }
                    c0059s.d();
                    c0060t.f880t.n();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        D.v0 v0Var = (D.v0) c0060t.f865d;
        synchronized (v0Var.f908b) {
            v0Var.f911e.remove(c0060t);
            v0Var.f912f = null;
            v0Var.h.l(c0060t);
            v0Var.f914i.remove(c0060t);
        }
    }

    public final void f(L.a aVar) {
        this.f5551d.setOnViewTreeOwnersAvailable(new C0038g(this, 9, aVar));
    }
}
