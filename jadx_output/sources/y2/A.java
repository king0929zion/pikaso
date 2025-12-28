package y2;

import D2.AbstractC0071a;
import c2.AbstractC0171j;
import c2.C0167f;
import c2.C0174m;
import g2.InterfaceC0271d;
import g2.InterfaceC0276i;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public abstract class A extends F2.h {

    /* renamed from: f, reason: collision with root package name */
    public int f6748f;

    public A(int i3) {
        super(0L, F2.k.f1241g);
        this.f6748f = i3;
    }

    public abstract void b(Object obj, CancellationException cancellationException);

    public abstract InterfaceC0271d c();

    public Throwable e(Object obj) {
        C0680m c0680m = obj instanceof C0680m ? (C0680m) obj : null;
        if (c0680m != null) {
            return c0680m.f6805a;
        }
        return null;
    }

    public Object f(Object obj) {
        return obj;
    }

    public final void h(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            Z0.d.f(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        p2.g.b(th);
        AbstractC0688v.h(c().o(), new C0167f("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object i();

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = C0174m.f3840a;
        F2.i iVar = this.f1232e;
        try {
            InterfaceC0271d c3 = c();
            p2.g.c(c3, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            D2.g gVar = (D2.g) c3;
            i2.c cVar = gVar.h;
            Object obj2 = gVar.f1057j;
            InterfaceC0276i o3 = cVar.o();
            Object m2 = AbstractC0071a.m(o3, obj2);
            n0 r3 = m2 != AbstractC0071a.f1047f ? AbstractC0688v.r(cVar, o3, m2) : null;
            try {
                InterfaceC0276i o4 = cVar.o();
                Object i3 = i();
                Throwable e3 = e(i3);
                S s3 = (e3 == null && AbstractC0688v.k(this.f6748f)) ? (S) o4.n(C0685s.f6818e) : null;
                if (s3 != null && !s3.b()) {
                    CancellationException f3 = s3.f();
                    b(i3, f3);
                    cVar.t(Z0.d.q(f3));
                } else if (e3 != null) {
                    cVar.t(Z0.d.q(e3));
                } else {
                    cVar.t(f(i3));
                }
                if (r3 == null || r3.d0()) {
                    AbstractC0071a.g(o3, m2);
                }
                try {
                    iVar.getClass();
                } catch (Throwable th) {
                    obj = Z0.d.q(th);
                }
                h(null, AbstractC0171j.a(obj));
            } catch (Throwable th2) {
                if (r3 == null || r3.d0()) {
                    AbstractC0071a.g(o3, m2);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                iVar.getClass();
            } catch (Throwable th4) {
                obj = Z0.d.q(th4);
            }
            h(th3, AbstractC0171j.a(obj));
        }
    }
}
