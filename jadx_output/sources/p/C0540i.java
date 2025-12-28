package p;

import D.C0032d;
import D.C0037f0;
import D.L0;

/* renamed from: p.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0540i implements L0 {

    /* renamed from: d, reason: collision with root package name */
    public final B2.i f5891d;

    /* renamed from: e, reason: collision with root package name */
    public final C0037f0 f5892e;

    /* renamed from: f, reason: collision with root package name */
    public n f5893f;

    /* renamed from: g, reason: collision with root package name */
    public long f5894g;
    public long h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f5895i;

    /* JADX WARN: Type inference failed for: r2v2, types: [o2.c, p2.h] */
    public C0540i(B2.i iVar, Object obj, n nVar, long j3, long j4, boolean z3) {
        n nVar2;
        this.f5891d = iVar;
        this.f5892e = C0032d.A(obj);
        if (nVar != null) {
            nVar2 = AbstractC0536e.d(nVar);
        } else {
            nVar2 = (n) ((p2.h) iVar.f316e).i(obj);
            nVar2.d();
        }
        this.f5893f = nVar2;
        this.f5894g = j3;
        this.h = j4;
        this.f5895i = z3;
    }

    @Override // D.L0
    public final Object getValue() {
        return this.f5892e.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [o2.c, p2.h] */
    public final String toString() {
        return "AnimationState(value=" + this.f5892e.getValue() + ", velocity=" + ((p2.h) this.f5891d.f317f).i(this.f5893f) + ", isRunning=" + this.f5895i + ", lastFrameTimeNanos=" + this.f5894g + ", finishedTimeNanos=" + this.h + ')';
    }
}
