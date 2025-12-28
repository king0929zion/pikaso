package o1;

import a1.AbstractC0094b;
import a1.C0095c;
import a1.C0100h;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class q implements h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5791a;

    /* renamed from: b, reason: collision with root package name */
    public final C0095c f5792b;

    /* renamed from: c, reason: collision with root package name */
    public final X1.e f5793c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f5794d;

    /* renamed from: e, reason: collision with root package name */
    public Handler f5795e;

    /* renamed from: f, reason: collision with root package name */
    public ThreadPoolExecutor f5796f;

    /* renamed from: g, reason: collision with root package name */
    public ThreadPoolExecutor f5797g;
    public Z0.d h;

    public q(Context context, C0095c c0095c) {
        X1.e eVar = r.f5798d;
        this.f5794d = new Object();
        Z.b.g(context, "Context cannot be null");
        this.f5791a = context.getApplicationContext();
        this.f5792b = c0095c;
        this.f5793c = eVar;
    }

    public final void a() {
        synchronized (this.f5794d) {
            try {
                this.h = null;
                Handler handler = this.f5795e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f5795e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f5797g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f5796f = null;
                this.f5797g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C0100h b() {
        try {
            X1.e eVar = this.f5793c;
            Context context = this.f5791a;
            C0095c c0095c = this.f5792b;
            eVar.getClass();
            I.m a3 = AbstractC0094b.a(context, c0095c);
            int i3 = a3.f1378e;
            if (i3 != 0) {
                throw new RuntimeException("fetchFonts failed (" + i3 + ")");
            }
            C0100h[] c0100hArr = (C0100h[]) a3.f1379f;
            if (c0100hArr == null || c0100hArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return c0100hArr[0];
        } catch (PackageManager.NameNotFoundException e3) {
            throw new RuntimeException("provider not found", e3);
        }
    }

    @Override // o1.h
    public final void g(Z0.d dVar) {
        synchronized (this.f5794d) {
            this.h = dVar;
        }
        synchronized (this.f5794d) {
            try {
                if (this.h == null) {
                    return;
                }
                if (this.f5796f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0519a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f5797g = threadPoolExecutor;
                    this.f5796f = threadPoolExecutor;
                }
                this.f5796f.execute(new R.a(12, this));
            } finally {
            }
        }
    }
}
