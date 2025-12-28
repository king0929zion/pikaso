package y2;

import D2.AbstractC0071a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class a0 extends D2.b {

    /* renamed from: b, reason: collision with root package name */
    public final W f6782b;

    /* renamed from: c, reason: collision with root package name */
    public d0 f6783c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b0 f6784d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ N f6785e;

    public a0(W w3, b0 b0Var, N n2) {
        this.f6784d = b0Var;
        this.f6785e = n2;
        this.f6782b = w3;
    }

    @Override // D2.b
    public final void b(Object obj, Object obj2) {
        D2.k kVar = (D2.k) obj;
        boolean z3 = obj2 == null;
        D2.k kVar2 = this.f6782b;
        D2.k kVar3 = z3 ? kVar2 : this.f6783c;
        if (kVar3 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = D2.k.f1066d;
            while (!atomicReferenceFieldUpdater.compareAndSet(kVar, this, kVar3)) {
                if (atomicReferenceFieldUpdater.get(kVar) != this) {
                    return;
                }
            }
            if (z3) {
                D2.k kVar4 = this.f6783c;
                p2.g.b(kVar4);
                kVar2.k(kVar4);
            }
        }
    }

    @Override // D2.b
    public final D2.w c(Object obj) {
        if (this.f6784d.M() == this.f6785e) {
            return null;
        }
        return AbstractC0071a.f1046e;
    }
}
