package D1;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class e extends p {

    /* renamed from: a, reason: collision with root package name */
    public boolean f965a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f966b;

    public e(ViewGroup viewGroup) {
        this.f966b = viewGroup;
    }

    @Override // D1.p, D1.n
    public final void a() {
        r2.a.a0(this.f966b, false);
        this.f965a = true;
    }

    @Override // D1.p, D1.n
    public final void c() {
        r2.a.a0(this.f966b, false);
    }

    @Override // D1.n
    public final void d(o oVar) {
        if (!this.f965a) {
            r2.a.a0(this.f966b, false);
        }
        oVar.u(this);
    }

    @Override // D1.p, D1.n
    public final void e() {
        r2.a.a0(this.f966b, true);
    }
}
