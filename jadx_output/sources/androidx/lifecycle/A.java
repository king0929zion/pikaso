package androidx.lifecycle;

import android.os.Handler;

/* loaded from: classes.dex */
public final class A implements r {

    /* renamed from: l, reason: collision with root package name */
    public static final A f3437l = new A();

    /* renamed from: d, reason: collision with root package name */
    public int f3438d;

    /* renamed from: e, reason: collision with root package name */
    public int f3439e;
    public Handler h;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3440f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3441g = true;

    /* renamed from: i, reason: collision with root package name */
    public final t f3442i = new t(this);

    /* renamed from: j, reason: collision with root package name */
    public final R.a f3443j = new R.a(5, this);

    /* renamed from: k, reason: collision with root package name */
    public final A.t f3444k = new A.t(16, this);

    public final void a() {
        int i3 = this.f3439e + 1;
        this.f3439e = i3;
        if (i3 == 1) {
            if (this.f3440f) {
                this.f3442i.d(l.ON_RESUME);
                this.f3440f = false;
            } else {
                Handler handler = this.h;
                p2.g.b(handler);
                handler.removeCallbacks(this.f3443j);
            }
        }
    }

    @Override // androidx.lifecycle.r
    public final t c() {
        return this.f3442i;
    }
}
