package U;

import n.AbstractC0378E;
import n.C0375B;
import o0.C0494n;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final C0494n f2334a;

    /* renamed from: b, reason: collision with root package name */
    public final d f2335b;

    /* renamed from: c, reason: collision with root package name */
    public final C0375B f2336c;

    /* renamed from: d, reason: collision with root package name */
    public final C0375B f2337d;

    /* renamed from: e, reason: collision with root package name */
    public final C0375B f2338e;

    /* renamed from: f, reason: collision with root package name */
    public final C0375B f2339f;

    public e(C0494n c0494n, d dVar) {
        this.f2334a = c0494n;
        this.f2335b = dVar;
        int i3 = AbstractC0378E.f4967a;
        this.f2336c = new C0375B();
        this.f2337d = new C0375B();
        this.f2338e = new C0375B();
        this.f2339f = new C0375B();
    }

    public final boolean a() {
        return this.f2336c.h() || this.f2338e.h() || this.f2337d.h();
    }

    public final void b(C0375B c0375b, Object obj) {
        if (c0375b.a(obj) && this.f2336c.f4963d + this.f2337d.f4963d + this.f2338e.f4963d == 1) {
            this.f2334a.i(new d(0, this, e.class, "invalidateNodes", "invalidateNodes()V", 0, 0));
        }
    }
}
