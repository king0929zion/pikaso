package y2;

import D2.AbstractC0071a;
import c2.C0174m;
import g2.InterfaceC0271d;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: y2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0675h extends U {
    public final C0673f h;

    public C0675h(C0673f c0673f) {
        this.h = c0673f;
    }

    @Override // o2.c
    public final /* bridge */ /* synthetic */ Object i(Object obj) {
        p((Throwable) obj);
        return C0174m.f3840a;
    }

    @Override // y2.W
    public final void p(Throwable th) {
        b0 o3 = o();
        C0673f c0673f = this.h;
        Throwable r3 = c0673f.r(o3);
        if (c0673f.z()) {
            InterfaceC0271d interfaceC0271d = c0673f.f6796g;
            p2.g.c(interfaceC0271d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            D2.g gVar = (D2.g) interfaceC0271d;
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = D2.g.f1054k;
                Object obj = atomicReferenceFieldUpdater.get(gVar);
                D2.w wVar = AbstractC0071a.f1045d;
                if (!p2.g.a(obj, wVar)) {
                    if (!(obj instanceof Throwable)) {
                        while (!atomicReferenceFieldUpdater.compareAndSet(gVar, obj, null)) {
                            if (atomicReferenceFieldUpdater.get(gVar) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    return;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(gVar, wVar, r3)) {
                    if (atomicReferenceFieldUpdater.get(gVar) != wVar) {
                        break;
                    }
                }
                return;
            }
        }
        c0673f.n(r3);
        if (c0673f.z()) {
            return;
        }
        c0673f.p();
    }
}
