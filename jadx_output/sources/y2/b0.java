package y2;

import c2.C0174m;
import g2.InterfaceC0274g;
import g2.InterfaceC0275h;
import g2.InterfaceC0276i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class b0 implements S, g0 {

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f6787d = AtomicReferenceFieldUpdater.newUpdater(b0.class, Object.class, "_state");

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f6788e = AtomicReferenceFieldUpdater.newUpdater(b0.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    public b0(boolean z3) {
        this._state = z3 ? AbstractC0688v.f6827j : AbstractC0688v.f6826i;
    }

    public static C0677j S(D2.k kVar) {
        while (kVar.n()) {
            D2.k j3 = kVar.j();
            if (j3 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = D2.k.f1067e;
                Object obj = atomicReferenceFieldUpdater.get(kVar);
                while (true) {
                    kVar = (D2.k) obj;
                    if (!kVar.n()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(kVar);
                }
            } else {
                kVar = j3;
            }
        }
        while (true) {
            kVar = kVar.m();
            if (!kVar.n()) {
                if (kVar instanceof C0677j) {
                    return (C0677j) kVar;
                }
                if (kVar instanceof d0) {
                    return null;
                }
            }
        }
    }

    public static String Y(Object obj) {
        if (!(obj instanceof Z)) {
            return obj instanceof N ? ((N) obj).b() ? "Active" : "New" : obj instanceof C0680m ? "Cancelled" : "Completed";
        }
        Z z3 = (Z) obj;
        return z3.d() ? "Cancelling" : z3.e() ? "Completing" : "Active";
    }

    public final boolean A(Object obj) {
        D2.w wVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2 = AbstractC0688v.f6822d;
        if (K()) {
            do {
                Object M2 = M();
                if (!(M2 instanceof N) || ((M2 instanceof Z) && ((Z) M2).e())) {
                    obj2 = AbstractC0688v.f6822d;
                    break;
                }
                obj2 = Z(M2, new C0680m(G(obj), false));
            } while (obj2 == AbstractC0688v.f6824f);
            if (obj2 == AbstractC0688v.f6823e) {
                return true;
            }
        }
        if (obj2 == AbstractC0688v.f6822d) {
            Throwable th = null;
            loop1: while (true) {
                Object M3 = M();
                if (!(M3 instanceof Z)) {
                    if (!(M3 instanceof N)) {
                        wVar = AbstractC0688v.f6825g;
                        break;
                    }
                    if (th == null) {
                        th = G(obj);
                    }
                    N n2 = (N) M3;
                    if (n2.b()) {
                        d0 L2 = L(n2);
                        if (L2 == null) {
                            continue;
                        } else {
                            Z z3 = new Z(L2, th);
                            do {
                                atomicReferenceFieldUpdater = f6787d;
                                if (atomicReferenceFieldUpdater.compareAndSet(this, n2, z3)) {
                                    T(L2, th);
                                    wVar = AbstractC0688v.f6822d;
                                    break loop1;
                                }
                            } while (atomicReferenceFieldUpdater.get(this) == n2);
                        }
                    } else {
                        Object Z2 = Z(M3, new C0680m(th, false));
                        if (Z2 == AbstractC0688v.f6822d) {
                            throw new IllegalStateException(("Cannot happen in " + M3).toString());
                        }
                        if (Z2 != AbstractC0688v.f6824f) {
                            obj2 = Z2;
                            break;
                        }
                    }
                } else {
                    synchronized (M3) {
                        try {
                            Z z4 = (Z) M3;
                            z4.getClass();
                            if (Z.f6779g.get(z4) == AbstractC0688v.h) {
                                wVar = AbstractC0688v.f6825g;
                            } else {
                                boolean d3 = ((Z) M3).d();
                                if (th == null) {
                                    th = G(obj);
                                }
                                ((Z) M3).a(th);
                                Throwable c3 = d3 ? null : ((Z) M3).c();
                                if (c3 != null) {
                                    T(((Z) M3).f6780d, c3);
                                }
                                wVar = AbstractC0688v.f6822d;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
            obj2 = wVar;
        }
        if (obj2 != AbstractC0688v.f6822d && obj2 != AbstractC0688v.f6823e) {
            if (obj2 == AbstractC0688v.f6825g) {
                return false;
            }
            y(obj2);
        }
        return true;
    }

    public void B(CancellationException cancellationException) {
        A(cancellationException);
    }

    public final boolean C(Throwable th) {
        if (Q()) {
            return true;
        }
        boolean z3 = th instanceof CancellationException;
        InterfaceC0676i interfaceC0676i = (InterfaceC0676i) f6788e.get(this);
        return (interfaceC0676i == null || interfaceC0676i == e0.f6792d) ? z3 : interfaceC0676i.f(th) || z3;
    }

    public String D() {
        return "Job was cancelled";
    }

    public boolean E(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return A(th) && J();
    }

    public final void F(N n2, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6788e;
        InterfaceC0676i interfaceC0676i = (InterfaceC0676i) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0676i != null) {
            interfaceC0676i.d();
            atomicReferenceFieldUpdater.set(this, e0.f6792d);
        }
        B1.c cVar = null;
        C0680m c0680m = obj instanceof C0680m ? (C0680m) obj : null;
        Throwable th = c0680m != null ? c0680m.f6805a : null;
        if (n2 instanceof W) {
            try {
                ((W) n2).p(th);
                return;
            } catch (Throwable th2) {
                O(new B1.c("Exception in completion handler " + n2 + " for " + this, th2));
                return;
            }
        }
        d0 g3 = n2.g();
        if (g3 != null) {
            Object l3 = g3.l();
            p2.g.c(l3, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            for (D2.k kVar = (D2.k) l3; !kVar.equals(g3); kVar = kVar.m()) {
                if (kVar instanceof W) {
                    W w3 = (W) kVar;
                    try {
                        w3.p(th);
                    } catch (Throwable th3) {
                        if (cVar != null) {
                            Z0.d.f(cVar, th3);
                        } else {
                            cVar = new B1.c("Exception in completion handler " + w3 + " for " + this, th3);
                        }
                    }
                }
            }
            if (cVar != null) {
                O(cVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final Throwable G(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        b0 b0Var = (b0) ((g0) obj);
        Object M2 = b0Var.M();
        if (M2 instanceof Z) {
            cancellationException = ((Z) M2).c();
        } else if (M2 instanceof C0680m) {
            cancellationException = ((C0680m) M2).f6805a;
        } else {
            if (M2 instanceof N) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + M2).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        if (cancellationException2 == null) {
            cancellationException2 = new T("Parent job is ".concat(Y(M2)), cancellationException, b0Var);
        }
        return cancellationException2;
    }

    public final Object H(Z z3, Object obj) {
        Throwable I2;
        C0680m c0680m = obj instanceof C0680m ? (C0680m) obj : null;
        Throwable th = c0680m != null ? c0680m.f6805a : null;
        synchronized (z3) {
            z3.d();
            ArrayList<Throwable> f3 = z3.f(th);
            I2 = I(z3, f3);
            if (I2 != null && f3.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(f3.size()));
                for (Throwable th2 : f3) {
                    if (th2 != I2 && th2 != I2 && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                        Z0.d.f(I2, th2);
                    }
                }
            }
        }
        if (I2 != null && I2 != th) {
            obj = new C0680m(I2, false);
        }
        if (I2 != null && (C(I2) || N(I2))) {
            p2.g.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C0680m.f6804b.compareAndSet((C0680m) obj, 0, 1);
        }
        U(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6787d;
        Object o3 = obj instanceof N ? new O((N) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, z3, o3) && atomicReferenceFieldUpdater.get(this) == z3) {
        }
        F(z3, obj);
        return obj;
    }

    public final Throwable I(Z z3, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (z3.d()) {
                return new T(D(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof l0) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th3 = (Throwable) next;
                if (th3 != th2 && (th3 instanceof l0)) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean J() {
        return true;
    }

    public boolean K() {
        return this instanceof C0678k;
    }

    public final d0 L(N n2) {
        d0 g3 = n2.g();
        if (g3 != null) {
            return g3;
        }
        if (n2 instanceof E) {
            return new d0();
        }
        if (n2 instanceof W) {
            W((W) n2);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + n2).toString());
    }

    public final Object M() {
        while (true) {
            Object obj = f6787d.get(this);
            if (!(obj instanceof D2.q)) {
                return obj;
            }
            ((D2.q) obj).a(this);
        }
    }

    public boolean N(Throwable th) {
        return false;
    }

    public void O(B1.c cVar) {
        throw cVar;
    }

    public final void P(S s3) {
        e0 e0Var = e0.f6792d;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6788e;
        if (s3 == null) {
            atomicReferenceFieldUpdater.set(this, e0Var);
            return;
        }
        s3.h();
        InterfaceC0676i s4 = s3.s(this);
        atomicReferenceFieldUpdater.set(this, s4);
        if (M() instanceof N) {
            return;
        }
        s4.d();
        atomicReferenceFieldUpdater.set(this, e0Var);
    }

    public boolean Q() {
        return this instanceof C0670c;
    }

    public final Object R(Object obj) {
        Object Z2;
        do {
            Z2 = Z(M(), obj);
            if (Z2 == AbstractC0688v.f6822d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C0680m c0680m = obj instanceof C0680m ? (C0680m) obj : null;
                throw new IllegalStateException(str, c0680m != null ? c0680m.f6805a : null);
            }
        } while (Z2 == AbstractC0688v.f6824f);
        return Z2;
    }

    public final void T(d0 d0Var, Throwable th) {
        Object l3 = d0Var.l();
        p2.g.c(l3, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        B1.c cVar = null;
        for (D2.k kVar = (D2.k) l3; !kVar.equals(d0Var); kVar = kVar.m()) {
            if (kVar instanceof U) {
                W w3 = (W) kVar;
                try {
                    w3.p(th);
                } catch (Throwable th2) {
                    if (cVar != null) {
                        Z0.d.f(cVar, th2);
                    } else {
                        cVar = new B1.c("Exception in completion handler " + w3 + " for " + this, th2);
                    }
                }
            }
        }
        if (cVar != null) {
            O(cVar);
        }
        C(th);
    }

    public void U(Object obj) {
    }

    public void V() {
    }

    public final void W(W w3) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        d0 d0Var = new d0();
        w3.getClass();
        D2.k.f1067e.lazySet(d0Var, w3);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = D2.k.f1066d;
        atomicReferenceFieldUpdater2.lazySet(d0Var, w3);
        loop0: while (true) {
            if (w3.l() == w3) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(w3, w3, d0Var)) {
                    if (atomicReferenceFieldUpdater2.get(w3) != w3) {
                        break;
                    }
                }
                d0Var.k(w3);
                break loop0;
            }
            break;
        }
        D2.k m2 = w3.m();
        do {
            atomicReferenceFieldUpdater = f6787d;
            if (atomicReferenceFieldUpdater.compareAndSet(this, w3, m2)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == w3);
    }

    public final int X(Object obj) {
        boolean z3 = obj instanceof E;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6787d;
        if (z3) {
            if (((E) obj).f6753d) {
                return 0;
            }
            E e3 = AbstractC0688v.f6827j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, e3)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            V();
            return 1;
        }
        if (!(obj instanceof M)) {
            return 0;
        }
        d0 d0Var = ((M) obj).f6766d;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, d0Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        V();
        return 1;
    }

    public final Object Z(Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (!(obj instanceof N)) {
            return AbstractC0688v.f6822d;
        }
        if (((obj instanceof E) || (obj instanceof W)) && !(obj instanceof C0677j) && !(obj2 instanceof C0680m)) {
            N n2 = (N) obj;
            Object o3 = obj2 instanceof N ? new O((N) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = f6787d;
                if (atomicReferenceFieldUpdater.compareAndSet(this, n2, o3)) {
                    U(obj2);
                    F(n2, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == n2);
            return AbstractC0688v.f6824f;
        }
        N n3 = (N) obj;
        d0 L2 = L(n3);
        if (L2 == null) {
            return AbstractC0688v.f6824f;
        }
        C0677j c0677j = null;
        Z z3 = n3 instanceof Z ? (Z) n3 : null;
        if (z3 == null) {
            z3 = new Z(L2, null);
        }
        synchronized (z3) {
            if (z3.e()) {
                return AbstractC0688v.f6822d;
            }
            Z.f6777e.set(z3, 1);
            if (z3 != n3) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f6787d;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, n3, z3)) {
                    if (atomicReferenceFieldUpdater2.get(this) != n3) {
                        return AbstractC0688v.f6824f;
                    }
                }
            }
            boolean d3 = z3.d();
            C0680m c0680m = obj2 instanceof C0680m ? (C0680m) obj2 : null;
            if (c0680m != null) {
                z3.a(c0680m.f6805a);
            }
            Throwable c3 = z3.c();
            if (d3) {
                c3 = null;
            }
            if (c3 != null) {
                T(L2, c3);
            }
            C0677j c0677j2 = n3 instanceof C0677j ? (C0677j) n3 : null;
            if (c0677j2 == null) {
                d0 g3 = n3.g();
                if (g3 != null) {
                    c0677j = S(g3);
                }
            } else {
                c0677j = c0677j2;
            }
            if (c0677j != null) {
                while (AbstractC0688v.i(c0677j.h, false, new Y(this, z3, c0677j, obj2), 1) == e0.f6792d) {
                    c0677j = S(c0677j);
                    if (c0677j == null) {
                    }
                }
                return AbstractC0688v.f6823e;
            }
            return H(z3, obj2);
        }
    }

    @Override // y2.S, A2.p
    public void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new T(D(), null, this);
        }
        B(cancellationException);
    }

    @Override // y2.S
    public boolean b() {
        Object M2 = M();
        return (M2 instanceof N) && ((N) M2).b();
    }

    @Override // g2.InterfaceC0276i
    public final InterfaceC0276i e(InterfaceC0275h interfaceC0275h) {
        return Z0.d.H(this, interfaceC0275h);
    }

    @Override // y2.S
    public final CancellationException f() {
        CancellationException cancellationException;
        Object M2 = M();
        if (!(M2 instanceof Z)) {
            if (M2 instanceof N) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(M2 instanceof C0680m)) {
                return new T(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C0680m) M2).f6805a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new T(D(), th, this) : cancellationException;
        }
        Throwable c3 = ((Z) M2).c();
        if (c3 == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String concat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = c3 instanceof CancellationException ? (CancellationException) c3 : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (concat == null) {
            concat = D();
        }
        return new T(concat, c3, this);
    }

    @Override // g2.InterfaceC0274g
    public final InterfaceC0275h getKey() {
        return C0685s.f6818e;
    }

    @Override // y2.S
    public final S getParent() {
        InterfaceC0676i interfaceC0676i = (InterfaceC0676i) f6788e.get(this);
        if (interfaceC0676i != null) {
            return interfaceC0676i.getParent();
        }
        return null;
    }

    @Override // y2.S
    public final boolean h() {
        int X2;
        do {
            X2 = X(M());
            if (X2 == 0) {
                return false;
            }
        } while (X2 != 1);
        return true;
    }

    @Override // g2.InterfaceC0276i
    public final InterfaceC0276i i(InterfaceC0276i interfaceC0276i) {
        return Z0.d.K(this, interfaceC0276i);
    }

    @Override // y2.S
    public final Object k(i2.c cVar) {
        Object M2;
        C0174m c0174m;
        do {
            M2 = M();
            boolean z3 = M2 instanceof N;
            c0174m = C0174m.f3840a;
            if (!z3) {
                AbstractC0688v.d(cVar.o());
                return c0174m;
            }
        } while (X(M2) < 0);
        C0673f c0673f = new C0673f(1, Z.b.z(cVar));
        c0673f.u();
        c0673f.x(new D(0, v(false, true, new Q(2, c0673f))));
        Object s3 = c0673f.s();
        h2.a aVar = h2.a.f4407d;
        if (s3 != aVar) {
            s3 = c0174m;
        }
        return s3 == aVar ? s3 : c0174m;
    }

    @Override // g2.InterfaceC0276i
    public final Object l(Object obj, o2.e eVar) {
        return eVar.h(obj, this);
    }

    @Override // g2.InterfaceC0276i
    public final InterfaceC0274g n(InterfaceC0275h interfaceC0275h) {
        return Z0.d.w(this, interfaceC0275h);
    }

    @Override // y2.S
    public final C q(o2.c cVar) {
        return v(false, true, cVar);
    }

    @Override // y2.S
    public final InterfaceC0676i s(b0 b0Var) {
        return (InterfaceC0676i) AbstractC0688v.i(this, true, new C0677j(b0Var), 2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName() + '{' + Y(M()) + '}');
        sb.append('@');
        sb.append(AbstractC0688v.f(this));
        return sb.toString();
    }

    @Override // y2.S
    public final C v(boolean z3, boolean z4, o2.c cVar) {
        W w3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Throwable th;
        if (z3) {
            w3 = cVar instanceof U ? (U) cVar : null;
            if (w3 == null) {
                w3 = new P(cVar);
            }
        } else {
            w3 = cVar instanceof W ? (W) cVar : null;
            if (w3 == null) {
                w3 = new Q(0, cVar);
            }
        }
        w3.f6772g = this;
        while (true) {
            Object M2 = M();
            if (M2 instanceof E) {
                E e3 = (E) M2;
                if (e3.f6753d) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f6787d;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, M2, w3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != M2) {
                            break;
                        }
                    }
                    return w3;
                }
                d0 d0Var = new d0();
                Object m2 = e3.f6753d ? d0Var : new M(d0Var);
                do {
                    atomicReferenceFieldUpdater = f6787d;
                    if (atomicReferenceFieldUpdater.compareAndSet(this, e3, m2)) {
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == e3);
            } else {
                if (!(M2 instanceof N)) {
                    if (z4) {
                        C0680m c0680m = M2 instanceof C0680m ? (C0680m) M2 : null;
                        cVar.i(c0680m != null ? c0680m.f6805a : null);
                    }
                    return e0.f6792d;
                }
                d0 g3 = ((N) M2).g();
                if (g3 == null) {
                    p2.g.c(M2, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    W((W) M2);
                } else {
                    C c3 = e0.f6792d;
                    if (z3 && (M2 instanceof Z)) {
                        synchronized (M2) {
                            try {
                                th = ((Z) M2).c();
                                if (th != null) {
                                    if ((cVar instanceof C0677j) && !((Z) M2).e()) {
                                    }
                                }
                                if (x((N) M2, g3, w3)) {
                                    if (th == null) {
                                        return w3;
                                    }
                                    c3 = w3;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } else {
                        th = null;
                    }
                    if (th != null) {
                        if (z4) {
                            cVar.i(th);
                        }
                        return c3;
                    }
                    if (x((N) M2, g3, w3)) {
                        return w3;
                    }
                }
            }
        }
    }

    public final boolean x(N n2, d0 d0Var, W w3) {
        char c3;
        a0 a0Var = new a0(w3, this, n2);
        do {
            D2.k j3 = d0Var.j();
            if (j3 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = D2.k.f1067e;
                Object obj = atomicReferenceFieldUpdater.get(d0Var);
                while (true) {
                    j3 = (D2.k) obj;
                    if (!j3.n()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(j3);
                }
            }
            D2.k.f1067e.lazySet(w3, j3);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = D2.k.f1066d;
            atomicReferenceFieldUpdater2.lazySet(w3, d0Var);
            a0Var.f6783c = d0Var;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(j3, d0Var, a0Var)) {
                    c3 = a0Var.a(j3) == null ? (char) 1 : (char) 2;
                } else if (atomicReferenceFieldUpdater2.get(j3) != d0Var) {
                    c3 = 0;
                    break;
                }
            }
            if (c3 == 1) {
                return true;
            }
        } while (c3 != 2);
        return false;
    }

    public void y(Object obj) {
    }

    public void z(Object obj) {
        y(obj);
    }
}
