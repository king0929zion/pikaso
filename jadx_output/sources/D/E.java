package D;

/* loaded from: classes.dex */
public final class E implements w0 {

    /* renamed from: d, reason: collision with root package name */
    public final o2.c f687d;

    /* renamed from: e, reason: collision with root package name */
    public F f688e;

    public E(o2.c cVar) {
        this.f687d = cVar;
    }

    @Override // D.w0
    public final void a() {
        F f3 = this.f688e;
        if (f3 != null) {
            f3.a();
        }
        this.f688e = null;
    }

    @Override // D.w0
    public final void b() {
        this.f688e = (F) this.f687d.i(C0032d.h);
    }

    @Override // D.w0
    public final void c() {
    }
}
