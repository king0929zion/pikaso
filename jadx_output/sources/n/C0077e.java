package N;

/* renamed from: N.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0077e extends h {

    /* renamed from: e, reason: collision with root package name */
    public final o2.c f1731e;

    /* renamed from: f, reason: collision with root package name */
    public final h f1732f;

    public C0077e(int i3, l lVar, o2.c cVar, h hVar) {
        super(i3, lVar);
        this.f1731e = cVar;
        this.f1732f = hVar;
        hVar.k();
    }

    @Override // N.h
    public final void c() {
        if (this.f1738c) {
            return;
        }
        int i3 = this.f1737b;
        h hVar = this.f1732f;
        if (i3 != hVar.d()) {
            a();
        }
        hVar.l();
        this.f1738c = true;
        synchronized (o.f1756b) {
            int i4 = this.f1739d;
            if (i4 >= 0) {
                o.u(i4);
                this.f1739d = -1;
            }
        }
    }

    @Override // N.h
    public final o2.c f() {
        return this.f1731e;
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
        t.e();
        throw null;
    }

    @Override // N.h
    public final void l() {
        t.e();
        throw null;
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
        return new C0077e(this.f1737b, this.f1736a, o.l(cVar, this.f1731e, true), this.f1732f);
    }
}
