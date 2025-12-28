package D2;

import c2.AbstractC0171j;
import g2.InterfaceC0271d;
import g2.InterfaceC0276i;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import y2.AbstractC0688v;
import y2.C0680m;
import y2.C0681n;
import y2.J;
import y2.k0;

/* loaded from: classes.dex */
public final class g extends y2.A implements i2.d, InterfaceC0271d {

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1054k = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* renamed from: g, reason: collision with root package name */
    public final y2.r f1055g;
    public final i2.c h;

    /* renamed from: i, reason: collision with root package name */
    public Object f1056i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f1057j;

    public g(y2.r rVar, i2.c cVar) {
        super(-1);
        this.f1055g = rVar;
        this.h = cVar;
        this.f1056i = AbstractC0071a.f1044c;
        this.f1057j = AbstractC0071a.l(cVar.o());
    }

    @Override // y2.A
    public final void b(Object obj, CancellationException cancellationException) {
        if (obj instanceof C0681n) {
            ((C0681n) obj).f6808b.i(cancellationException);
        }
    }

    @Override // y2.A
    public final InterfaceC0271d c() {
        return this;
    }

    @Override // y2.A
    public final Object i() {
        Object obj = this.f1056i;
        this.f1056i = AbstractC0071a.f1044c;
        return obj;
    }

    @Override // i2.d
    public final i2.d j() {
        i2.c cVar = this.h;
        if (cVar != null) {
            return cVar;
        }
        return null;
    }

    @Override // g2.InterfaceC0271d
    public final InterfaceC0276i o() {
        return this.h.o();
    }

    @Override // g2.InterfaceC0271d
    public final void t(Object obj) {
        i2.c cVar = this.h;
        InterfaceC0276i o3 = cVar.o();
        Throwable a3 = AbstractC0171j.a(obj);
        Object c0680m = a3 == null ? obj : new C0680m(a3, false);
        y2.r rVar = this.f1055g;
        if (rVar.g()) {
            this.f1056i = c0680m;
            this.f6748f = 0;
            rVar.d(o3, this);
            return;
        }
        J a4 = k0.a();
        if (a4.t()) {
            this.f1056i = c0680m;
            this.f6748f = 0;
            a4.m(this);
            return;
        }
        a4.p(true);
        try {
            InterfaceC0276i o4 = cVar.o();
            Object m2 = AbstractC0071a.m(o4, this.f1057j);
            try {
                cVar.t(obj);
                while (a4.x()) {
                }
            } finally {
                AbstractC0071a.g(o4, m2);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f1055g + ", " + AbstractC0688v.p(this.h) + ']';
    }
}
