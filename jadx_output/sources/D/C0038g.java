package D;

import N.C0075c;
import a.AbstractC0090a;
import android.content.Context;
import android.view.Choreographer;
import c2.C0174m;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import n.C0375B;
import o0.C0465O;
import o0.C0490l;
import o0.ComponentCallbacks2C0466P;
import o0.ComponentCallbacks2C0467Q;
import o0.a1;
import o0.b1;
import y2.C0673f;

/* renamed from: D.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0038g extends p2.h implements o2.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f753e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f754f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f755g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0038g(Object obj, int i3, Object obj2) {
        super(1);
        this.f753e = i3;
        this.f754f = obj;
        this.f755g = obj2;
    }

    private final Object b(Object obj) {
        C0075c B3;
        C0490l c0490l = (C0490l) obj;
        b1 b1Var = (b1) this.f754f;
        if (!b1Var.f5553f) {
            androidx.lifecycle.t c3 = c0490l.f5600a.c();
            L.a aVar = (L.a) this.f755g;
            b1Var.h = aVar;
            if (b1Var.f5554g == null) {
                b1Var.f5554g = c3;
                c3.a(b1Var);
            } else if (c3.f3484c.compareTo(androidx.lifecycle.m.f3476f) >= 0) {
                L.a aVar2 = new L.a(-2000640158, true, new a1(b1Var, aVar, 1));
                C0060t c0060t = b1Var.f5552e;
                Object obj2 = null;
                if (c0060t.f881u) {
                    C0032d.I("The composition is disposed");
                    throw null;
                }
                v0 v0Var = (v0) c0060t.f865d;
                boolean z3 = c0060t.f880t.f795C;
                try {
                    C0065y c0065y = new C0065y(2, c0060t);
                    C0038g c0038g = new C0038g(c0060t, 3, obj2);
                    N.h k3 = N.o.k();
                    C0075c c0075c = k3 instanceof C0075c ? (C0075c) k3 : null;
                    if (c0075c == null || (B3 = c0075c.B(c0065y, c0038g)) == null) {
                        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                    }
                    try {
                        N.h j3 = B3.j();
                        try {
                            c0060t.i(aVar2);
                            if (!z3) {
                                N.o.k().m();
                            }
                            synchronized (v0Var.f908b) {
                                if (((EnumC0055o0) v0Var.f923r.getValue()).compareTo(EnumC0055o0.f840e) > 0 && !v0Var.h().contains(c0060t)) {
                                    v0Var.f911e.add(c0060t);
                                    v0Var.f912f = null;
                                }
                            }
                            try {
                                synchronized (v0Var.f908b) {
                                    ArrayList arrayList = v0Var.f915j;
                                    if (arrayList.size() > 0) {
                                        ((X) arrayList.get(0)).getClass();
                                        throw null;
                                    }
                                }
                                try {
                                    c0060t.d();
                                    c0060t.f();
                                    if (!z3) {
                                        N.o.k().m();
                                    }
                                } catch (Exception e3) {
                                    v0.l(v0Var, e3, false, 6);
                                }
                            } catch (Exception e4) {
                                v0Var.k(e4, c0060t, true);
                            }
                        } finally {
                            N.h.p(j3);
                        }
                    } finally {
                        v0.c(B3);
                    }
                } catch (Exception e5) {
                    v0Var.k(e5, c0060t, true);
                }
            }
        }
        return C0174m.f3840a;
    }

    @Override // o2.c
    public final Object i(Object obj) {
        switch (this.f753e) {
            case 0:
                C0040h c0040h = (C0040h) this.f754f;
                Object obj2 = c0040h.f761e;
                C0036f c0036f = (C0036f) this.f755g;
                synchronized (obj2) {
                    c0040h.f763g.remove(c0036f);
                    if (c0040h.f763g.isEmpty()) {
                        c0040h.f764i.set(0);
                    }
                }
                return C0174m.f3840a;
            case 1:
                Q q3 = (Q) this.f754f;
                Object obj3 = q3.f720a;
                C0673f c0673f = (C0673f) this.f755g;
                synchronized (obj3) {
                    q3.f721b.remove(c0673f);
                }
                return C0174m.f3840a;
            case 2:
                Throwable th = (Throwable) obj;
                v0 v0Var = (v0) this.f754f;
                Object obj4 = v0Var.f908b;
                Throwable th2 = (Throwable) this.f755g;
                synchronized (obj4) {
                    if (th2 == null) {
                        th2 = null;
                    } else if (th != null) {
                        try {
                            if (th instanceof CancellationException) {
                                th = null;
                            }
                            if (th != null) {
                                Z0.d.f(th2, th);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    v0Var.f910d = th2;
                    B2.G g3 = v0Var.f923r;
                    EnumC0055o0 enumC0055o0 = EnumC0055o0.f839d;
                    g3.getClass();
                    g3.g(null, enumC0055o0);
                }
                return C0174m.f3840a;
            case 3:
                ((C0060t) this.f754f).u(obj);
                C0375B c0375b = (C0375B) this.f755g;
                if (c0375b != null) {
                    c0375b.a(obj);
                }
                return C0174m.f3840a;
            case 4:
                l0.n nVar = (l0.n) obj;
                C0065y c0065y = ((W.I) this.f755g).f2518G;
                nVar.getClass();
                long c3 = r2.a.c(0, 0);
                l0.o oVar = (l0.o) this.f754f;
                l0.n.a(nVar, oVar);
                oVar.G(AbstractC0090a.X(c3, oVar.h), 0.0f, c0065y);
                return C0174m.f3840a;
            case 5:
                Context context = (Context) this.f754f;
                Context applicationContext = context.getApplicationContext();
                ComponentCallbacks2C0466P componentCallbacks2C0466P = (ComponentCallbacks2C0466P) this.f755g;
                applicationContext.registerComponentCallbacks(componentCallbacks2C0466P);
                return new C0465O(context, componentCallbacks2C0466P, 0);
            case 6:
                Context context2 = (Context) this.f754f;
                Context applicationContext2 = context2.getApplicationContext();
                ComponentCallbacks2C0467Q componentCallbacks2C0467Q = (ComponentCallbacks2C0467Q) this.f755g;
                applicationContext2.registerComponentCallbacks(componentCallbacks2C0467Q);
                return new C0465O(context2, componentCallbacks2C0467Q, 1);
            case 7:
                o0.W w3 = (o0.W) this.f754f;
                ChoreographerFrameCallbackC0066z choreographerFrameCallbackC0066z = (ChoreographerFrameCallbackC0066z) this.f755g;
                synchronized (w3.h) {
                    w3.f5519j.remove(choreographerFrameCallbackC0066z);
                }
                return C0174m.f3840a;
            case 8:
                ((Choreographer) ((C0041h0) this.f754f).f766e).removeFrameCallback((ChoreographerFrameCallbackC0066z) this.f755g);
                return C0174m.f3840a;
            case 9:
                return b(obj);
            case 10:
                ((s.g) this.f754f).b((s.f) this.f755g);
                return C0174m.f3840a;
            default:
                ((z2.c) this.f754f).f7090f.removeCallbacks((D2.h) this.f755g);
                return C0174m.f3840a;
        }
    }
}
