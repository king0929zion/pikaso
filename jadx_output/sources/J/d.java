package j;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f4482d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f4483e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i f4484f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ A.t f4485g;

    public d(A.t tVar, e eVar, j jVar, i iVar) {
        this.f4485g = tVar;
        this.f4482d = eVar;
        this.f4483e = jVar;
        this.f4484f = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e eVar = this.f4482d;
        if (eVar != null) {
            A.t tVar = this.f4485g;
            ((f) tVar.f175e).f4491C = true;
            eVar.f4487b.c(false);
            ((f) tVar.f175e).f4491C = false;
        }
        j jVar = this.f4483e;
        if (jVar.isEnabled() && jVar.hasSubMenu()) {
            this.f4484f.p(jVar, null, 4);
        }
    }
}
