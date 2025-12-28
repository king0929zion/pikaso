package o1;

import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class l extends Z0.d {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Z0.d f5782c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f5783d;

    public l(Z0.d dVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f5782c = dVar;
        this.f5783d = threadPoolExecutor;
    }

    @Override // Z0.d
    public final void I(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f5783d;
        try {
            this.f5782c.I(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // Z0.d
    public final void J(D1.w wVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f5783d;
        try {
            this.f5782c.J(wVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
