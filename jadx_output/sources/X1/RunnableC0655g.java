package x1;

import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: x1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0655g implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6710d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f6711e;

    public /* synthetic */ RunnableC0655g(Context context, int i3) {
        this.f6710d = i3;
        this.f6711e = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6710d) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new RunnableC0655g(this.f6711e, 1));
                break;
            default:
                AbstractC0654f.s(this.f6711e, new ExecutorC0652d(), AbstractC0654f.f6701a, false);
                break;
        }
    }
}
