package D2;

import g2.InterfaceC0276i;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import y2.AbstractC0690x;
import y2.C0673f;
import y2.InterfaceC0691y;

/* loaded from: classes.dex */
public final class i extends y2.r implements InterfaceC0691y {

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1061k = AtomicIntegerFieldUpdater.newUpdater(i.class, "runningWorkers");

    /* renamed from: f, reason: collision with root package name */
    public final F2.l f1062f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1063g;
    public final /* synthetic */ InterfaceC0691y h;

    /* renamed from: i, reason: collision with root package name */
    public final l f1064i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f1065j;
    private volatile int runningWorkers;

    /* JADX WARN: Multi-variable type inference failed */
    public i(F2.l lVar, int i3) {
        this.f1062f = lVar;
        this.f1063g = i3;
        InterfaceC0691y interfaceC0691y = lVar instanceof InterfaceC0691y ? (InterfaceC0691y) lVar : null;
        this.h = interfaceC0691y == null ? AbstractC0690x.f6830a : interfaceC0691y;
        this.f1064i = new l();
        this.f1065j = new Object();
    }

    @Override // y2.InterfaceC0691y
    public final void c(long j3, C0673f c0673f) {
        this.h.c(j3, c0673f);
    }

    @Override // y2.r
    public final void d(InterfaceC0276i interfaceC0276i, Runnable runnable) {
        boolean z3;
        Runnable j3;
        this.f1064i.a(runnable);
        if (f1061k.get(this) < this.f1063g) {
            synchronized (this.f1065j) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1061k;
                if (atomicIntegerFieldUpdater.get(this) >= this.f1063g) {
                    z3 = false;
                } else {
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                    z3 = true;
                }
            }
            if (!z3 || (j3 = j()) == null) {
                return;
            }
            this.f1062f.d(this, new h(this, 0, j3));
        }
    }

    public final Runnable j() {
        while (true) {
            Runnable runnable = (Runnable) this.f1064i.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f1065j) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1061k;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f1064i.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }
}
