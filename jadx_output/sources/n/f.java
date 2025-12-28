package N;

/* loaded from: classes.dex */
public final class f extends h {

    /* renamed from: e, reason: collision with root package name */
    public final o2.c f1733e;

    /* renamed from: f, reason: collision with root package name */
    public int f1734f;

    public f(int i3, l lVar, o2.c cVar) {
        super(i3, lVar);
        this.f1733e = cVar;
        this.f1734f = 1;
    }

    @Override // N.h
    public final void c() {
        if (this.f1738c) {
            return;
        }
        l();
        this.f1738c = true;
        synchronized (o.f1756b) {
            int i3 = this.f1739d;
            if (i3 >= 0) {
                o.u(i3);
                this.f1739d = -1;
            }
        }
    }

    @Override // N.h
    public final o2.c f() {
        return this.f1733e;
    }

    @Override // N.h
    public final boolean g() {
        return true;
    }

    @Override // N.h
    public final o2.c i() {
        return null;
    }

    @Override // N.h
    public final void k() {
        this.f1734f++;
    }

    @Override // N.h
    public final void l() {
        int i3 = this.f1734f - 1;
        this.f1734f = i3;
        if (i3 == 0) {
            a();
        }
    }

    @Override // N.h
    public final void m() {
    }

    @Override // N.h
    public final void n(y yVar) {
        B0.a aVar = o.f1755a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // N.h
    public final h t(o2.c cVar) {
        o.d(this);
        return new C0077e(this.f1737b, this.f1736a, o.l(cVar, this.f1733e, true), this);
    }
}
