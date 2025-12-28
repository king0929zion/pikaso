package a1;

import android.animation.ValueAnimator;
import android.os.Handler;
import android.view.View;
import d1.C0197T;
import d1.C0201X;

/* loaded from: classes.dex */
public final class k implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2952d = 0;

    /* renamed from: e, reason: collision with root package name */
    public Object f2953e;

    /* renamed from: f, reason: collision with root package name */
    public Object f2954f;

    /* renamed from: g, reason: collision with root package name */
    public Object f2955g;

    public /* synthetic */ k() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        switch (this.f2952d) {
            case 0:
                try {
                    obj = ((CallableC0096d) this.f2953e).call();
                } catch (Exception unused) {
                    obj = null;
                }
                ((Handler) this.f2955g).post(new D2.h(3, (C0097e) this.f2954f, obj, false));
                break;
            default:
                C0197T.h((View) this.f2953e, (B2.i) this.f2954f);
                ((ValueAnimator) this.f2955g).start();
                break;
        }
    }

    public k(View view, C0201X c0201x, B2.i iVar, ValueAnimator valueAnimator) {
        this.f2953e = view;
        this.f2954f = iVar;
        this.f2955g = valueAnimator;
    }
}
