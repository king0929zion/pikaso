package b;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import com.ai.assistance.operit.provider.MainComposeActivity;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class j implements Executor, ViewTreeObserver.OnDrawListener, Runnable {

    /* renamed from: e, reason: collision with root package name */
    public Runnable f3595e;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ MainComposeActivity f3597g;

    /* renamed from: d, reason: collision with root package name */
    public final long f3594d = SystemClock.uptimeMillis() + 10000;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3596f = false;

    public j(MainComposeActivity mainComposeActivity) {
        this.f3597g = mainComposeActivity;
    }

    public final void a(View view) {
        if (this.f3596f) {
            return;
        }
        this.f3596f = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f3595e = runnable;
        View decorView = this.f3597g.getWindow().getDecorView();
        if (!this.f3596f) {
            decorView.postOnAnimation(new R.a(7, this));
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z3;
        Runnable runnable = this.f3595e;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f3594d) {
                this.f3596f = false;
                this.f3597g.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f3595e = null;
        A1.f fVar = this.f3597g.f3605l;
        synchronized (fVar.f216b) {
            z3 = fVar.f215a;
        }
        if (z3) {
            this.f3596f = false;
            this.f3597g.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3597g.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
