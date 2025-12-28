package y2;

import D2.AbstractC0071a;
import a.AbstractC0090a;
import c2.AbstractC0171j;
import c2.C0174m;
import g2.AbstractC0268a;
import g2.C0272e;
import g2.C0277j;
import g2.InterfaceC0271d;
import g2.InterfaceC0273f;
import g2.InterfaceC0274g;
import g2.InterfaceC0276i;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* renamed from: y2.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0688v {

    /* renamed from: a, reason: collision with root package name */
    public static final D2.w f6819a = new D2.w("RESUME_TOKEN", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final D2.w f6820b = new D2.w("REMOVED_TASK", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final D2.w f6821c = new D2.w("CLOSED_EMPTY", 0);

    /* renamed from: d, reason: collision with root package name */
    public static final D2.w f6822d = new D2.w("COMPLETING_ALREADY", 0);

    /* renamed from: e, reason: collision with root package name */
    public static final D2.w f6823e = new D2.w("COMPLETING_WAITING_CHILDREN", 0);

    /* renamed from: f, reason: collision with root package name */
    public static final D2.w f6824f = new D2.w("COMPLETING_RETRY", 0);

    /* renamed from: g, reason: collision with root package name */
    public static final D2.w f6825g = new D2.w("TOO_LATE_TO_CANCEL", 0);
    public static final D2.w h = new D2.w("SEALED", 0);

    /* renamed from: i, reason: collision with root package name */
    public static final E f6826i = new E(false);

    /* renamed from: j, reason: collision with root package name */
    public static final E f6827j = new E(true);

    public static final D2.d a(InterfaceC0276i interfaceC0276i) {
        if (interfaceC0276i.n(C0685s.f6818e) == null) {
            interfaceC0276i = interfaceC0276i.i(new V(null));
        }
        return new D2.d(interfaceC0276i);
    }

    public static final Object b(o2.e eVar, InterfaceC0271d interfaceC0271d) {
        D2.t tVar = new D2.t(interfaceC0271d, interfaceC0271d.o());
        return r2.a.Z(tVar, tVar, eVar);
    }

    public static final Object c(long j3, i2.c cVar) {
        C0174m c0174m = C0174m.f3840a;
        if (j3 <= 0) {
            return c0174m;
        }
        C0673f c0673f = new C0673f(1, Z.b.z(cVar));
        c0673f.u();
        if (j3 < Long.MAX_VALUE) {
            InterfaceC0274g n2 = c0673f.h.n(C0272e.f4333d);
            InterfaceC0691y interfaceC0691y = n2 instanceof InterfaceC0691y ? (InterfaceC0691y) n2 : null;
            if (interfaceC0691y == null) {
                interfaceC0691y = AbstractC0690x.f6830a;
            }
            interfaceC0691y.c(j3, c0673f);
        }
        Object s3 = c0673f.s();
        return s3 == h2.a.f4407d ? s3 : c0174m;
    }

    public static final void d(InterfaceC0276i interfaceC0276i) {
        S s3 = (S) interfaceC0276i.n(C0685s.f6818e);
        if (s3 != null && !s3.b()) {
            throw s3.f();
        }
    }

    public static final InterfaceC0276i e(InterfaceC0276i interfaceC0276i, InterfaceC0276i interfaceC0276i2, boolean z3) {
        Boolean bool = Boolean.FALSE;
        C0682o c0682o = C0682o.f6810g;
        boolean booleanValue = ((Boolean) interfaceC0276i.l(bool, c0682o)).booleanValue();
        boolean booleanValue2 = ((Boolean) interfaceC0276i2.l(bool, c0682o)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return interfaceC0276i.i(interfaceC0276i2);
        }
        C0277j c0277j = C0277j.f4334d;
        InterfaceC0276i interfaceC0276i3 = (InterfaceC0276i) interfaceC0276i.l(c0277j, new C0682o(2, 2));
        Object obj = interfaceC0276i2;
        if (booleanValue2) {
            obj = interfaceC0276i2.l(c0277j, C0682o.f6809f);
        }
        return interfaceC0276i3.i((InterfaceC0276i) obj);
    }

    public static final String f(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final C0673f g(InterfaceC0271d interfaceC0271d) {
        C0673f c0673f;
        C0673f c0673f2;
        if (!(interfaceC0271d instanceof D2.g)) {
            return new C0673f(1, interfaceC0271d);
        }
        D2.g gVar = (D2.g) interfaceC0271d;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = D2.g.f1054k;
            Object obj = atomicReferenceFieldUpdater.get(gVar);
            D2.w wVar = AbstractC0071a.f1045d;
            c0673f = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(gVar, wVar);
                c0673f2 = null;
                break;
            }
            if (obj instanceof C0673f) {
                while (!atomicReferenceFieldUpdater.compareAndSet(gVar, obj, wVar)) {
                    if (atomicReferenceFieldUpdater.get(gVar) != obj) {
                        break;
                    }
                }
                c0673f2 = (C0673f) obj;
                break loop0;
            }
            if (obj != wVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c0673f2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0673f.f6794j;
            Object obj2 = atomicReferenceFieldUpdater2.get(c0673f2);
            if (!(obj2 instanceof C0679l) || ((C0679l) obj2).f6802d == null) {
                C0673f.f6793i.set(c0673f2, 536870911);
                atomicReferenceFieldUpdater2.set(c0673f2, C0669b.f6786d);
                c0673f = c0673f2;
            } else {
                c0673f2.p();
            }
            if (c0673f != null) {
                return c0673f;
            }
        }
        return new C0673f(2, interfaceC0271d);
    }

    public static final void h(InterfaceC0276i interfaceC0276i, Throwable th) {
        try {
            InterfaceC0686t interfaceC0686t = (InterfaceC0686t) interfaceC0276i.n(C0685s.f6817d);
            if (interfaceC0686t != null) {
                interfaceC0686t.r(interfaceC0276i, th);
            } else {
                AbstractC0071a.d(interfaceC0276i, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                Z0.d.f(runtimeException, th);
                th = runtimeException;
            }
            AbstractC0071a.d(interfaceC0276i, th);
        }
    }

    public static /* synthetic */ C i(S s3, boolean z3, W w3, int i3) {
        if ((i3 & 1) != 0) {
            z3 = false;
        }
        return s3.v(z3, (i3 & 2) != 0, w3);
    }

    public static final boolean j(InterfaceC0276i interfaceC0276i) {
        S s3 = (S) interfaceC0276i.n(C0685s.f6818e);
        if (s3 != null) {
            return s3.b();
        }
        return true;
    }

    public static final boolean k(int i3) {
        return i3 == 1 || i3 == 2;
    }

    public static h0 l(InterfaceC0687u interfaceC0687u, AbstractC0268a abstractC0268a, int i3, o2.e eVar, int i4) {
        InterfaceC0276i interfaceC0276i = abstractC0268a;
        if ((i4 & 1) != 0) {
            interfaceC0276i = C0277j.f4334d;
        }
        if ((i4 & 2) != 0) {
            i3 = 1;
        }
        InterfaceC0276i e3 = e(interfaceC0687u.m(), interfaceC0276i, true);
        F2.d dVar = B.f6749a;
        if (e3 != dVar && e3.n(C0272e.f4333d) == null) {
            e3 = e3.i(dVar);
        }
        if (i3 == 0) {
            throw null;
        }
        h0 c0Var = i3 == 2 ? new c0(e3, eVar) : new h0(e3, true);
        c0Var.c0(i3, c0Var, eVar);
        return c0Var;
    }

    public static final Object m(Object obj) {
        return obj instanceof C0680m ? Z0.d.q(((C0680m) obj).f6805a) : obj;
    }

    public static final void n(C0673f c0673f, InterfaceC0271d interfaceC0271d, boolean z3) {
        Object obj = C0673f.f6794j.get(c0673f);
        Throwable e3 = c0673f.e(obj);
        Object q3 = e3 != null ? Z0.d.q(e3) : c0673f.f(obj);
        if (!z3) {
            interfaceC0271d.t(q3);
            return;
        }
        p2.g.c(interfaceC0271d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        D2.g gVar = (D2.g) interfaceC0271d;
        i2.c cVar = gVar.h;
        InterfaceC0276i o3 = cVar.o();
        Object m2 = AbstractC0071a.m(o3, gVar.f1057j);
        n0 r3 = m2 != AbstractC0071a.f1047f ? r(cVar, o3, m2) : null;
        try {
            cVar.t(q3);
        } finally {
            if (r3 == null || r3.d0()) {
                AbstractC0071a.g(o3, m2);
            }
        }
    }

    public static final Object o(z2.c cVar, o2.e eVar) {
        J j3;
        InterfaceC0276i e3;
        Thread currentThread = Thread.currentThread();
        C0272e c0272e = C0272e.f4333d;
        InterfaceC0273f interfaceC0273f = (InterfaceC0273f) cVar.n(c0272e);
        C0277j c0277j = C0277j.f4334d;
        if (interfaceC0273f == null) {
            j3 = k0.a();
            e3 = e(c0277j, Z0.d.K(cVar, j3), true);
            F2.d dVar = B.f6749a;
            if (e3 != dVar && e3.n(c0272e) == null) {
                e3 = e3.i(dVar);
            }
        } else {
            if (interfaceC0273f instanceof J) {
            }
            j3 = (J) k0.f6798a.get();
            e3 = e(c0277j, cVar, true);
            F2.d dVar2 = B.f6749a;
            if (e3 != dVar2 && e3.n(c0272e) == null) {
                e3 = e3.i(dVar2);
            }
        }
        C0670c c0670c = new C0670c(e3, currentThread, j3);
        c0670c.c0(1, c0670c, eVar);
        J j4 = c0670c.h;
        if (j4 != null) {
            int i3 = J.f6762i;
            j4.p(false);
        }
        while (!Thread.interrupted()) {
            try {
                long w3 = j4 != null ? j4.w() : Long.MAX_VALUE;
                if (!(c0670c.M() instanceof N)) {
                    if (j4 != null) {
                        int i4 = J.f6762i;
                        j4.j(false);
                    }
                    Object q3 = q(c0670c.M());
                    C0680m c0680m = q3 instanceof C0680m ? (C0680m) q3 : null;
                    if (c0680m == null) {
                        return q3;
                    }
                    throw c0680m.f6805a;
                }
                LockSupport.parkNanos(c0670c, w3);
            } catch (Throwable th) {
                if (j4 != null) {
                    int i5 = J.f6762i;
                    j4.j(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        c0670c.A(interruptedException);
        throw interruptedException;
    }

    public static final String p(InterfaceC0271d interfaceC0271d) {
        Object q3;
        if (interfaceC0271d instanceof D2.g) {
            return interfaceC0271d.toString();
        }
        try {
            q3 = interfaceC0271d + '@' + f(interfaceC0271d);
        } catch (Throwable th) {
            q3 = Z0.d.q(th);
        }
        if (AbstractC0171j.a(q3) != null) {
            q3 = interfaceC0271d.getClass().getName() + '@' + f(interfaceC0271d);
        }
        return (String) q3;
    }

    public static final Object q(Object obj) {
        N n2;
        O o3 = obj instanceof O ? (O) obj : null;
        return (o3 == null || (n2 = o3.f6767a) == null) ? obj : n2;
    }

    public static final n0 r(InterfaceC0271d interfaceC0271d, InterfaceC0276i interfaceC0276i, Object obj) {
        n0 n0Var = null;
        if (!(interfaceC0271d instanceof i2.d)) {
            return null;
        }
        if (interfaceC0276i.n(o0.f6812d) != null) {
            i2.d dVar = (i2.d) interfaceC0271d;
            while (true) {
                if ((dVar instanceof C0692z) || (dVar = dVar.j()) == null) {
                    break;
                }
                if (dVar instanceof n0) {
                    n0Var = (n0) dVar;
                    break;
                }
            }
            if (n0Var != null) {
                n0Var.e0(interfaceC0276i, obj);
            }
        }
        return n0Var;
    }

    public static final Object s(InterfaceC0274g interfaceC0274g, o2.e eVar, i2.c cVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        InterfaceC0276i o3 = cVar.o();
        InterfaceC0276i i3 = !((Boolean) interfaceC0274g.l(Boolean.FALSE, C0682o.f6810g)).booleanValue() ? o3.i(interfaceC0274g) : e(o3, interfaceC0274g, false);
        d(i3);
        if (i3 == o3) {
            D2.t tVar = new D2.t(cVar, i3);
            return r2.a.Z(tVar, tVar, eVar);
        }
        C0272e c0272e = C0272e.f4333d;
        if (p2.g.a(i3.n(c0272e), o3.n(c0272e))) {
            n0 n0Var = new n0(i3, cVar);
            InterfaceC0276i interfaceC0276i = n0Var.f6781f;
            Object m2 = AbstractC0071a.m(interfaceC0276i, null);
            try {
                return r2.a.Z(n0Var, n0Var, eVar);
            } finally {
                AbstractC0071a.g(interfaceC0276i, m2);
            }
        }
        C0692z c0692z = new C0692z(cVar, i3);
        AbstractC0090a.g0(eVar, c0692z, c0692z);
        do {
            atomicIntegerFieldUpdater = C0692z.h;
            int i4 = atomicIntegerFieldUpdater.get(c0692z);
            if (i4 != 0) {
                if (i4 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                Object q3 = q(c0692z.M());
                if (q3 instanceof C0680m) {
                    throw ((C0680m) q3).f6805a;
                }
                return q3;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(c0692z, 0, 1));
        return h2.a.f4407d;
    }
}
