package y2;

import D2.AbstractC0071a;
import c2.AbstractC0171j;
import c2.C0174m;
import g2.InterfaceC0271d;
import g2.InterfaceC0276i;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: y2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0673f extends A implements InterfaceC0672e, i2.d, p0 {

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f6793i = AtomicIntegerFieldUpdater.newUpdater(C0673f.class, "_decisionAndIndex");

    /* renamed from: j, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f6794j = AtomicReferenceFieldUpdater.newUpdater(C0673f.class, Object.class, "_state");

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f6795k = AtomicReferenceFieldUpdater.newUpdater(C0673f.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0271d f6796g;
    public final InterfaceC0276i h;

    public C0673f(int i3, InterfaceC0271d interfaceC0271d) {
        super(i3);
        this.f6796g = interfaceC0271d;
        this.h = interfaceC0271d.o();
        this._decisionAndIndex = 536870911;
        this._state = C0669b.f6786d;
    }

    public static void A(f0 f0Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + f0Var + ", already has " + obj).toString());
    }

    public static Object F(f0 f0Var, Object obj, int i3, o2.c cVar) {
        if ((obj instanceof C0680m) || !AbstractC0688v.k(i3)) {
            return obj;
        }
        if (cVar != null || (f0Var instanceof D)) {
            return new C0679l(obj, f0Var instanceof D ? (D) f0Var : null, cVar, (CancellationException) null, 16);
        }
        return obj;
    }

    public String B() {
        return "CancellableContinuation";
    }

    public final void C() {
        InterfaceC0271d interfaceC0271d = this.f6796g;
        Throwable th = null;
        D2.g gVar = interfaceC0271d instanceof D2.g ? (D2.g) interfaceC0271d : null;
        if (gVar != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = D2.g.f1054k;
                Object obj = atomicReferenceFieldUpdater.get(gVar);
                D2.w wVar = AbstractC0071a.f1045d;
                if (obj == wVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(gVar, wVar, this)) {
                        if (atomicReferenceFieldUpdater.get(gVar) != wVar) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(gVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(gVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            p();
            n(th);
        }
    }

    public final void D(Object obj, int i3, o2.c cVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6794j;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof f0) {
                Object F3 = F((f0) obj2, obj, i3, cVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, F3)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!z()) {
                    p();
                }
                q(i3);
                return;
            }
            if (obj2 instanceof C0674g) {
                C0674g c0674g = (C0674g) obj2;
                c0674g.getClass();
                if (C0674g.f6797c.compareAndSet(c0674g, 0, 1)) {
                    if (cVar != null) {
                        l(cVar, c0674g.f6805a);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    public final void E(r rVar) {
        C0174m c0174m = C0174m.f3840a;
        InterfaceC0271d interfaceC0271d = this.f6796g;
        D2.g gVar = interfaceC0271d instanceof D2.g ? (D2.g) interfaceC0271d : null;
        D(c0174m, (gVar != null ? gVar.f1055g : null) == rVar ? 4 : this.f6748f, null);
    }

    @Override // y2.p0
    public final void a(D2.u uVar, int i3) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i4;
        do {
            atomicIntegerFieldUpdater = f6793i;
            i4 = atomicIntegerFieldUpdater.get(this);
            if ((i4 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i4, ((i4 >> 29) << 29) + i3));
        y(uVar);
    }

    @Override // y2.A
    public final void b(Object obj, CancellationException cancellationException) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6794j;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof f0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof C0680m) {
                return;
            }
            if (!(obj2 instanceof C0679l)) {
                C0679l c0679l = new C0679l(obj2, (D) null, (o2.c) null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0679l)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            C0679l c0679l2 = (C0679l) obj2;
            if (c0679l2.f6803e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C0679l a3 = C0679l.a(c0679l2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a3)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            D d3 = c0679l2.f6800b;
            if (d3 != null) {
                k(d3, cancellationException);
            }
            o2.c cVar = c0679l2.f6801c;
            if (cVar != null) {
                l(cVar, cancellationException);
                return;
            }
            return;
        }
    }

    @Override // y2.A
    public final InterfaceC0271d c() {
        return this.f6796g;
    }

    @Override // y2.InterfaceC0672e
    public final D2.w d(Object obj, o2.c cVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6794j;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z3 = obj2 instanceof f0;
            D2.w wVar = AbstractC0688v.f6819a;
            if (!z3) {
                boolean z4 = obj2 instanceof C0679l;
                return null;
            }
            Object F3 = F((f0) obj2, obj, this.f6748f, cVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, F3)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (z()) {
                return wVar;
            }
            p();
            return wVar;
        }
    }

    @Override // y2.A
    public final Throwable e(Object obj) {
        Throwable e3 = super.e(obj);
        if (e3 != null) {
            return e3;
        }
        return null;
    }

    @Override // y2.A
    public final Object f(Object obj) {
        return obj instanceof C0679l ? ((C0679l) obj).f6799a : obj;
    }

    @Override // y2.InterfaceC0672e
    public final void g(Object obj, o2.c cVar) {
        D(obj, this.f6748f, cVar);
    }

    @Override // y2.A
    public final Object i() {
        return f6794j.get(this);
    }

    @Override // i2.d
    public final i2.d j() {
        InterfaceC0271d interfaceC0271d = this.f6796g;
        if (interfaceC0271d instanceof i2.d) {
            return (i2.d) interfaceC0271d;
        }
        return null;
    }

    public final void k(D d3, Throwable th) {
        try {
            d3.b(th);
        } catch (Throwable th2) {
            AbstractC0688v.h(this.h, new B1.c("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void l(o2.c cVar, Throwable th) {
        try {
            cVar.i(th);
        } catch (Throwable th2) {
            AbstractC0688v.h(this.h, new B1.c("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void m(D2.u uVar, Throwable th) {
        InterfaceC0276i interfaceC0276i = this.h;
        int i3 = f6793i.get(this) & 536870911;
        if (i3 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            uVar.g(i3, interfaceC0276i);
        } catch (Throwable th2) {
            AbstractC0688v.h(interfaceC0276i, new B1.c("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final boolean n(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6794j;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof f0)) {
                return false;
            }
            C0674g c0674g = new C0674g(this, th, (obj instanceof D) || (obj instanceof D2.u));
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0674g)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            f0 f0Var = (f0) obj;
            if (f0Var instanceof D) {
                k((D) obj, th);
            } else if (f0Var instanceof D2.u) {
                m((D2.u) obj, th);
            }
            if (!z()) {
                p();
            }
            q(this.f6748f);
            return true;
        }
    }

    @Override // g2.InterfaceC0271d
    public final InterfaceC0276i o() {
        return this.h;
    }

    public final void p() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6795k;
        C c3 = (C) atomicReferenceFieldUpdater.get(this);
        if (c3 == null) {
            return;
        }
        c3.d();
        atomicReferenceFieldUpdater.set(this, e0.f6792d);
    }

    public final void q(int i3) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i4;
        do {
            atomicIntegerFieldUpdater = f6793i;
            i4 = atomicIntegerFieldUpdater.get(this);
            int i5 = i4 >> 29;
            if (i5 != 0) {
                if (i5 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z3 = i3 == 4;
                InterfaceC0271d interfaceC0271d = this.f6796g;
                if (z3 || !(interfaceC0271d instanceof D2.g) || AbstractC0688v.k(i3) != AbstractC0688v.k(this.f6748f)) {
                    AbstractC0688v.n(this, interfaceC0271d, z3);
                    return;
                }
                r rVar = ((D2.g) interfaceC0271d).f1055g;
                InterfaceC0276i o3 = ((D2.g) interfaceC0271d).h.o();
                if (rVar.g()) {
                    rVar.d(o3, this);
                    return;
                }
                J a3 = k0.a();
                if (a3.t()) {
                    a3.m(this);
                    return;
                }
                a3.p(true);
                try {
                    AbstractC0688v.n(this, interfaceC0271d, true);
                    do {
                    } while (a3.x());
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i4, 1073741824 + (536870911 & i4)));
    }

    public Throwable r(b0 b0Var) {
        return b0Var.f();
    }

    public final Object s() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        boolean z3 = z();
        do {
            atomicIntegerFieldUpdater = f6793i;
            i3 = atomicIntegerFieldUpdater.get(this);
            int i4 = i3 >> 29;
            if (i4 != 0) {
                if (i4 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (z3) {
                    C();
                }
                Object obj = f6794j.get(this);
                if (obj instanceof C0680m) {
                    throw ((C0680m) obj).f6805a;
                }
                if (AbstractC0688v.k(this.f6748f)) {
                    S s3 = (S) this.h.n(C0685s.f6818e);
                    if (s3 != null && !s3.b()) {
                        CancellationException f3 = s3.f();
                        b(obj, f3);
                        throw f3;
                    }
                }
                return f(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 536870912 + (536870911 & i3)));
        if (((C) f6795k.get(this)) == null) {
            v();
        }
        if (z3) {
            C();
        }
        return h2.a.f4407d;
    }

    @Override // g2.InterfaceC0271d
    public final void t(Object obj) {
        Throwable a3 = AbstractC0171j.a(obj);
        if (a3 != null) {
            obj = new C0680m(a3, false);
        }
        D(obj, this.f6748f, null);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(B());
        sb.append('(');
        sb.append(AbstractC0688v.p(this.f6796g));
        sb.append("){");
        Object obj = f6794j.get(this);
        sb.append(obj instanceof f0 ? "Active" : obj instanceof C0674g ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(AbstractC0688v.f(this));
        return sb.toString();
    }

    public final void u() {
        C v3 = v();
        if (v3 == null || (f6794j.get(this) instanceof f0)) {
            return;
        }
        v3.d();
        f6795k.set(this, e0.f6792d);
    }

    public final C v() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        S s3 = (S) this.h.n(C0685s.f6818e);
        if (s3 == null) {
            return null;
        }
        C i3 = AbstractC0688v.i(s3, true, new C0675h(this), 2);
        do {
            atomicReferenceFieldUpdater = f6795k;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, i3)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return i3;
    }

    @Override // y2.InterfaceC0672e
    public final void w(Object obj) {
        q(this.f6748f);
    }

    public final void x(o2.c cVar) {
        y(cVar instanceof D ? (D) cVar : new D(1, cVar));
    }

    public final void y(f0 f0Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6794j;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C0669b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, f0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if (obj instanceof D ? true : obj instanceof D2.u) {
                A(f0Var, obj);
                throw null;
            }
            if (obj instanceof C0680m) {
                C0680m c0680m = (C0680m) obj;
                c0680m.getClass();
                if (!C0680m.f6804b.compareAndSet(c0680m, 0, 1)) {
                    A(f0Var, obj);
                    throw null;
                }
                if (obj instanceof C0674g) {
                    if (!(obj instanceof C0680m)) {
                        c0680m = null;
                    }
                    Throwable th = c0680m != null ? c0680m.f6805a : null;
                    if (f0Var instanceof D) {
                        k((D) f0Var, th);
                        return;
                    } else {
                        p2.g.c(f0Var, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                        m((D2.u) f0Var, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof C0679l)) {
                if (f0Var instanceof D2.u) {
                    return;
                }
                p2.g.c(f0Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                C0679l c0679l = new C0679l(obj, (D) f0Var, (o2.c) null, (CancellationException) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0679l)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            C0679l c0679l2 = (C0679l) obj;
            if (c0679l2.f6800b != null) {
                A(f0Var, obj);
                throw null;
            }
            if (f0Var instanceof D2.u) {
                return;
            }
            p2.g.c(f0Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
            D d3 = (D) f0Var;
            Throwable th2 = c0679l2.f6803e;
            if (th2 != null) {
                k(d3, th2);
                return;
            }
            C0679l a3 = C0679l.a(c0679l2, d3, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a3)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    public final boolean z() {
        if (this.f6748f == 2) {
            InterfaceC0271d interfaceC0271d = this.f6796g;
            p2.g.c(interfaceC0271d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (D2.g.f1054k.get((D2.g) interfaceC0271d) != null) {
                return true;
            }
        }
        return false;
    }
}
