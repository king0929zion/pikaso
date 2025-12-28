package y2;

import d2.C0238i;

/* loaded from: classes.dex */
public abstract class J extends r {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f6762i = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f6763f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6764g;
    public C0238i h;

    public final void j(boolean z3) {
        long j3 = this.f6763f - (z3 ? 4294967296L : 1L);
        this.f6763f = j3;
        if (j3 <= 0 && this.f6764g) {
            z();
        }
    }

    public final void m(A a3) {
        C0238i c0238i = this.h;
        if (c0238i == null) {
            c0238i = new C0238i();
            this.h = c0238i;
        }
        c0238i.c(a3);
    }

    public abstract Thread o();

    public final void p(boolean z3) {
        this.f6763f = (z3 ? 4294967296L : 1L) + this.f6763f;
        if (z3) {
            return;
        }
        this.f6764g = true;
    }

    public final boolean t() {
        return this.f6763f >= 4294967296L;
    }

    public abstract long w();

    public final boolean x() {
        C0238i c0238i = this.h;
        if (c0238i == null) {
            return false;
        }
        A a3 = (A) (c0238i.isEmpty() ? null : c0238i.h());
        if (a3 == null) {
            return false;
        }
        a3.run();
        return true;
    }

    public void y(long j3, G g3) {
        RunnableC0689w.f6828m.D(j3, g3);
    }

    public abstract void z();
}
