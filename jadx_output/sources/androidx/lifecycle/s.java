package androidx.lifecycle;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public m f3480a;

    /* renamed from: b, reason: collision with root package name */
    public p f3481b;

    public final void a(r rVar, l lVar) {
        m a3 = lVar.a();
        m mVar = this.f3480a;
        p2.g.e(mVar, "state1");
        if (a3.compareTo(mVar) < 0) {
            mVar = a3;
        }
        this.f3480a = mVar;
        this.f3481b.b(rVar, lVar);
        this.f3480a = a3;
    }
}
